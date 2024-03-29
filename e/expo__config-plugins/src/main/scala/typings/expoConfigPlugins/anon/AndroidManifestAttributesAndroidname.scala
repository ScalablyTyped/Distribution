package typings.expoConfigPlugins.anon

import typings.expoConfigPlugins.expoConfigPluginsStrings.androidDotintentDotactionDotVIEW
import typings.expoConfigPlugins.expoConfigPluginsStrings.remove
import typings.expoConfigPlugins.expoConfigPluginsStrings.signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/config-plugins.@expo/config-plugins/build/android/Manifest.AndroidManifestAttributes & {  android:protectionLevel :string | 'signature' | undefined} */
trait AndroidManifestAttributesAndroidname extends StObject {
  
  @JSName("android:name")
  var androidColonname: String | androidDotintentDotactionDotVIEW
  
  @JSName("android:protectionLevel")
  var androidColonprotectionLevel: js.UndefOr[String | signature] = js.undefined
  
  @JSName("tools:node")
  var toolsColonnode: js.UndefOr[String | remove] = js.undefined
}
object AndroidManifestAttributesAndroidname {
  
  inline def apply(androidColonname: String | androidDotintentDotactionDotVIEW): AndroidManifestAttributesAndroidname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android:name")(androidColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidManifestAttributesAndroidname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidManifestAttributesAndroidname] (val x: Self) extends AnyVal {
    
    inline def setAndroidColonname(value: String | androidDotintentDotactionDotVIEW): Self = StObject.set(x, "android:name", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonprotectionLevel(value: String | signature): Self = StObject.set(x, "android:protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonprotectionLevelUndefined: Self = StObject.set(x, "android:protectionLevel", js.undefined)
    
    inline def setToolsColonnode(value: String | remove): Self = StObject.set(x, "tools:node", value.asInstanceOf[js.Any])
    
    inline def setToolsColonnodeUndefined: Self = StObject.set(x, "tools:node", js.undefined)
  }
}
