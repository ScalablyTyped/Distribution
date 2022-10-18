package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.buildAndroidManifestMod.StringBoolean
import typings.expoConfigPlugins.expoConfigPluginsStrings.androidDotintentDotactionDotVIEW
import typings.expoConfigPlugins.expoConfigPluginsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/config-plugins.@expo/config-plugins/build/android/Manifest.AndroidManifestAttributes & {  android:exported :@expo/config-plugins.@expo/config-plugins/build/android/Manifest.StringBoolean | undefined,   android:enabled :@expo/config-plugins.@expo/config-plugins/build/android/Manifest.StringBoolean | undefined} */
trait AndroidManifestAttributesAndroidenabled extends StObject {
  
  @JSName("android:enabled")
  var androidColonenabled: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:exported")
  var androidColonexported: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:name")
  var androidColonname: String | androidDotintentDotactionDotVIEW
  
  @JSName("tools:node")
  var toolsColonnode: js.UndefOr[String | remove] = js.undefined
}
object AndroidManifestAttributesAndroidenabled {
  
  inline def apply(androidColonname: String | androidDotintentDotactionDotVIEW): AndroidManifestAttributesAndroidenabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android:name")(androidColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestAttributesAndroidenabled]
  }
  
  extension [Self <: AndroidManifestAttributesAndroidenabled](x: Self) {
    
    inline def setAndroidColonenabled(value: StringBoolean): Self = StObject.set(x, "android:enabled", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonenabledUndefined: Self = StObject.set(x, "android:enabled", js.undefined)
    
    inline def setAndroidColonexported(value: StringBoolean): Self = StObject.set(x, "android:exported", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonexportedUndefined: Self = StObject.set(x, "android:exported", js.undefined)
    
    inline def setAndroidColonname(value: String | androidDotintentDotactionDotVIEW): Self = StObject.set(x, "android:name", value.asInstanceOf[js.Any])
    
    inline def setToolsColonnode(value: String | remove): Self = StObject.set(x, "tools:node", value.asInstanceOf[js.Any])
    
    inline def setToolsColonnodeUndefined: Self = StObject.set(x, "tools:node", js.undefined)
  }
}
