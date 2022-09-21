package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.expoConfigPluginsStrings.androidDotintentDotactionDotVIEW
import typings.expoConfigPlugins.expoConfigPluginsStrings.remove
import typings.expoConfigPlugins.manifestMod.StringBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/config-plugins.@expo/config-plugins/build/android/Manifest.AndroidManifestAttributes & {  android:glEsVersion :string | undefined,   android:required :@expo/config-plugins.@expo/config-plugins/build/android/Manifest.StringBoolean} */
trait AndroidManifestAttributesAndroidglEsVersion extends StObject {
  
  @JSName("android:glEsVersion")
  var androidColonglEsVersion: js.UndefOr[String] = js.undefined
  
  @JSName("android:name")
  var androidColonname: String | androidDotintentDotactionDotVIEW
  
  @JSName("android:required")
  var androidColonrequired: StringBoolean
  
  @JSName("tools:node")
  var toolsColonnode: js.UndefOr[String | remove] = js.undefined
}
object AndroidManifestAttributesAndroidglEsVersion {
  
  inline def apply(androidColonname: String | androidDotintentDotactionDotVIEW, androidColonrequired: StringBoolean): AndroidManifestAttributesAndroidglEsVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android:name")(androidColonname.asInstanceOf[js.Any])
    __obj.updateDynamic("android:required")(androidColonrequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestAttributesAndroidglEsVersion]
  }
  
  extension [Self <: AndroidManifestAttributesAndroidglEsVersion](x: Self) {
    
    inline def setAndroidColonglEsVersion(value: String): Self = StObject.set(x, "android:glEsVersion", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonglEsVersionUndefined: Self = StObject.set(x, "android:glEsVersion", js.undefined)
    
    inline def setAndroidColonname(value: String | androidDotintentDotactionDotVIEW): Self = StObject.set(x, "android:name", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonrequired(value: StringBoolean): Self = StObject.set(x, "android:required", value.asInstanceOf[js.Any])
    
    inline def setToolsColonnode(value: String | remove): Self = StObject.set(x, "tools:node", value.asInstanceOf[js.Any])
    
    inline def setToolsColonnodeUndefined: Self = StObject.set(x, "tools:node", js.undefined)
  }
}
