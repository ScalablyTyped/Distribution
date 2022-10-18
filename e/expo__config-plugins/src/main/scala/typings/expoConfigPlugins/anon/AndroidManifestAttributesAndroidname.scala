package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidManifestMod.StringBoolean
import typings.expoConfigPlugins.expoConfigPluginsStrings.androidDotintentDotactionDotVIEW
import typings.expoConfigPlugins.expoConfigPluginsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/config-plugins.@expo/config-plugins/build/android/Manifest.AndroidManifestAttributes & {  android:required :@expo/config-plugins.@expo/config-plugins/build/android/Manifest.StringBoolean | undefined} */
trait AndroidManifestAttributesAndroidname extends StObject {
  
  @JSName("android:name")
  var androidColonname: String | androidDotintentDotactionDotVIEW
  
  @JSName("android:required")
  var androidColonrequired: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("tools:node")
  var toolsColonnode: js.UndefOr[String | remove] = js.undefined
}
object AndroidManifestAttributesAndroidname {
  
  inline def apply(androidColonname: String | androidDotintentDotactionDotVIEW): AndroidManifestAttributesAndroidname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android:name")(androidColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestAttributesAndroidname]
  }
  
  extension [Self <: AndroidManifestAttributesAndroidname](x: Self) {
    
    inline def setAndroidColonname(value: String | androidDotintentDotactionDotVIEW): Self = StObject.set(x, "android:name", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonrequired(value: StringBoolean): Self = StObject.set(x, "android:required", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonrequiredUndefined: Self = StObject.set(x, "android:required", js.undefined)
    
    inline def setToolsColonnode(value: String | remove): Self = StObject.set(x, "tools:node", value.asInstanceOf[js.Any])
    
    inline def setToolsColonnodeUndefined: Self = StObject.set(x, "tools:node", js.undefined)
  }
}
