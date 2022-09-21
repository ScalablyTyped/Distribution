package typings.expoConfigPlugins.manifestMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigPlugins.expoConfigPluginsStrings.DotMainApplication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestApplicationAttributes
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String]] {
  
  @JSName("android:allowBackup")
  var androidColonallowBackup: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:icon")
  var androidColonicon: js.UndefOr[String] = js.undefined
  
  @JSName("android:label")
  var androidColonlabel: js.UndefOr[String] = js.undefined
  
  @JSName("android:largeHeap")
  var androidColonlargeHeap: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:name")
  var androidColonname: String | DotMainApplication
  
  @JSName("android:requestLegacyExternalStorage")
  var androidColonrequestLegacyExternalStorage: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:roundIcon")
  var androidColonroundIcon: js.UndefOr[String] = js.undefined
  
  @JSName("android:usesCleartextTraffic")
  var androidColonusesCleartextTraffic: js.UndefOr[StringBoolean] = js.undefined
}
object ManifestApplicationAttributes {
  
  inline def apply(androidColonname: String | DotMainApplication): ManifestApplicationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android:name")(androidColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestApplicationAttributes]
  }
  
  extension [Self <: ManifestApplicationAttributes](x: Self) {
    
    inline def setAndroidColonallowBackup(value: StringBoolean): Self = StObject.set(x, "android:allowBackup", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonallowBackupUndefined: Self = StObject.set(x, "android:allowBackup", js.undefined)
    
    inline def setAndroidColonicon(value: String): Self = StObject.set(x, "android:icon", value.asInstanceOf[js.Any])
    
    inline def setAndroidColoniconUndefined: Self = StObject.set(x, "android:icon", js.undefined)
    
    inline def setAndroidColonlabel(value: String): Self = StObject.set(x, "android:label", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonlabelUndefined: Self = StObject.set(x, "android:label", js.undefined)
    
    inline def setAndroidColonlargeHeap(value: StringBoolean): Self = StObject.set(x, "android:largeHeap", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonlargeHeapUndefined: Self = StObject.set(x, "android:largeHeap", js.undefined)
    
    inline def setAndroidColonname(value: String | DotMainApplication): Self = StObject.set(x, "android:name", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonrequestLegacyExternalStorage(value: StringBoolean): Self = StObject.set(x, "android:requestLegacyExternalStorage", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonrequestLegacyExternalStorageUndefined: Self = StObject.set(x, "android:requestLegacyExternalStorage", js.undefined)
    
    inline def setAndroidColonroundIcon(value: String): Self = StObject.set(x, "android:roundIcon", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonroundIconUndefined: Self = StObject.set(x, "android:roundIcon", js.undefined)
    
    inline def setAndroidColonusesCleartextTraffic(value: StringBoolean): Self = StObject.set(x, "android:usesCleartextTraffic", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonusesCleartextTrafficUndefined: Self = StObject.set(x, "android:usesCleartextTraffic", js.undefined)
  }
}
