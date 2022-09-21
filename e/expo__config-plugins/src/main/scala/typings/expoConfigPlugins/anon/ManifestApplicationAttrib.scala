package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigPlugins.expoConfigPluginsStrings.DotMainApplication
import typings.expoConfigPlugins.expoConfigPluginsStrings.adjustPan
import typings.expoConfigPlugins.expoConfigPluginsStrings.adjustResize
import typings.expoConfigPlugins.expoConfigPluginsStrings.adjustUnspecified
import typings.expoConfigPlugins.expoConfigPluginsStrings.stateAlwaysHidden
import typings.expoConfigPlugins.expoConfigPluginsStrings.stateAlwaysVisible
import typings.expoConfigPlugins.expoConfigPluginsStrings.stateHidden
import typings.expoConfigPlugins.expoConfigPluginsStrings.stateUnchanged
import typings.expoConfigPlugins.expoConfigPluginsStrings.stateUnspecified
import typings.expoConfigPlugins.expoConfigPluginsStrings.stateVisible
import typings.expoConfigPlugins.manifestMod.StringBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/config-plugins.@expo/config-plugins/build/android/Manifest.ManifestApplicationAttributes & {  android:exported :@expo/config-plugins.@expo/config-plugins/build/android/Manifest.StringBoolean | undefined,   android:launchMode :string | undefined,   android:theme :string | undefined,   android:windowSoftInputMode :string | 'stateUnspecified' | 'stateUnchanged' | 'stateHidden' | 'stateAlwaysHidden' | 'stateVisible' | 'stateAlwaysVisible' | 'adjustUnspecified' | 'adjustResize' | 'adjustPan' | undefined, [key: string] : string | undefined} */
trait ManifestApplicationAttrib
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String]] {
  
  @JSName("android:allowBackup")
  var androidColonallowBackup: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:exported")
  var androidColonexported: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:icon")
  var androidColonicon: js.UndefOr[String] = js.undefined
  
  @JSName("android:label")
  var androidColonlabel: js.UndefOr[String] = js.undefined
  
  @JSName("android:largeHeap")
  var androidColonlargeHeap: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:launchMode")
  var androidColonlaunchMode: js.UndefOr[String] = js.undefined
  
  @JSName("android:name")
  var androidColonname: String | DotMainApplication
  
  @JSName("android:requestLegacyExternalStorage")
  var androidColonrequestLegacyExternalStorage: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:roundIcon")
  var androidColonroundIcon: js.UndefOr[String] = js.undefined
  
  @JSName("android:theme")
  var androidColontheme: js.UndefOr[String] = js.undefined
  
  @JSName("android:usesCleartextTraffic")
  var androidColonusesCleartextTraffic: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:windowSoftInputMode")
  var androidColonwindowSoftInputMode: js.UndefOr[
    String | stateUnspecified | stateUnchanged | stateHidden | stateAlwaysHidden | stateVisible | stateAlwaysVisible | adjustUnspecified | adjustResize | adjustPan
  ] = js.undefined
}
object ManifestApplicationAttrib {
  
  inline def apply(androidColonname: String | DotMainApplication): ManifestApplicationAttrib = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android:name")(androidColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestApplicationAttrib]
  }
  
  extension [Self <: ManifestApplicationAttrib](x: Self) {
    
    inline def setAndroidColonallowBackup(value: StringBoolean): Self = StObject.set(x, "android:allowBackup", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonallowBackupUndefined: Self = StObject.set(x, "android:allowBackup", js.undefined)
    
    inline def setAndroidColonexported(value: StringBoolean): Self = StObject.set(x, "android:exported", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonexportedUndefined: Self = StObject.set(x, "android:exported", js.undefined)
    
    inline def setAndroidColonicon(value: String): Self = StObject.set(x, "android:icon", value.asInstanceOf[js.Any])
    
    inline def setAndroidColoniconUndefined: Self = StObject.set(x, "android:icon", js.undefined)
    
    inline def setAndroidColonlabel(value: String): Self = StObject.set(x, "android:label", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonlabelUndefined: Self = StObject.set(x, "android:label", js.undefined)
    
    inline def setAndroidColonlargeHeap(value: StringBoolean): Self = StObject.set(x, "android:largeHeap", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonlargeHeapUndefined: Self = StObject.set(x, "android:largeHeap", js.undefined)
    
    inline def setAndroidColonlaunchMode(value: String): Self = StObject.set(x, "android:launchMode", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonlaunchModeUndefined: Self = StObject.set(x, "android:launchMode", js.undefined)
    
    inline def setAndroidColonname(value: String | DotMainApplication): Self = StObject.set(x, "android:name", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonrequestLegacyExternalStorage(value: StringBoolean): Self = StObject.set(x, "android:requestLegacyExternalStorage", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonrequestLegacyExternalStorageUndefined: Self = StObject.set(x, "android:requestLegacyExternalStorage", js.undefined)
    
    inline def setAndroidColonroundIcon(value: String): Self = StObject.set(x, "android:roundIcon", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonroundIconUndefined: Self = StObject.set(x, "android:roundIcon", js.undefined)
    
    inline def setAndroidColontheme(value: String): Self = StObject.set(x, "android:theme", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonthemeUndefined: Self = StObject.set(x, "android:theme", js.undefined)
    
    inline def setAndroidColonusesCleartextTraffic(value: StringBoolean): Self = StObject.set(x, "android:usesCleartextTraffic", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonusesCleartextTrafficUndefined: Self = StObject.set(x, "android:usesCleartextTraffic", js.undefined)
    
    inline def setAndroidColonwindowSoftInputMode(
      value: String | stateUnspecified | stateUnchanged | stateHidden | stateAlwaysHidden | stateVisible | stateAlwaysVisible | adjustUnspecified | adjustResize | adjustPan
    ): Self = StObject.set(x, "android:windowSoftInputMode", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonwindowSoftInputModeUndefined: Self = StObject.set(x, "android:windowSoftInputMode", js.undefined)
  }
}
