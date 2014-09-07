package com.malmstein.fenster.demo;

import android.app.Activity;
import android.os.Bundle;

import com.malmstein.fenster.play.TextureVideoFragment;

public class DemoFragmentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_fragment);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        findVideoFragment().playExampleVideo();
    }

    private TextureVideoFragment findVideoFragment(){
        return (TextureVideoFragment) getFragmentManager().findFragmentById(R.id.play_demo_fragment);
    }
}
