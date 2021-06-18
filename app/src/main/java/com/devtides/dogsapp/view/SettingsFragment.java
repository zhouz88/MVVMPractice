package com.devtides.dogsapp.view;


import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.devtides.dogsapp.R;

public class SettingsFragment extends PreferenceFragmentCompat {


    public SettingsFragment() {
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings, rootKey);
    }

}
