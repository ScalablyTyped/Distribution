package typings.expoConfigPlugins.buildAndroidManifestMod

import typings.expoConfigPlugins.expoConfigPluginsStrings.androidDotintentDotactionDotVIEW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestServiceAttributes
  extends StObject
     with AndroidManifestAttributes {
  
  @JSName("android:enabled")
  var androidColonenabled: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:exported")
  var androidColonexported: js.UndefOr[StringBoolean] = js.undefined
  
  @JSName("android:permission")
  var androidColonpermission: js.UndefOr[String] = js.undefined
}
object ManifestServiceAttributes {
  
  inline def apply(androidColonname: String | androidDotintentDotactionDotVIEW): ManifestServiceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android:name")(androidColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestServiceAttributes]
  }
  
  extension [Self <: ManifestServiceAttributes](x: Self) {
    
    inline def setAndroidColonenabled(value: StringBoolean): Self = StObject.set(x, "android:enabled", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonenabledUndefined: Self = StObject.set(x, "android:enabled", js.undefined)
    
    inline def setAndroidColonexported(value: StringBoolean): Self = StObject.set(x, "android:exported", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonexportedUndefined: Self = StObject.set(x, "android:exported", js.undefined)
    
    inline def setAndroidColonpermission(value: String): Self = StObject.set(x, "android:permission", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonpermissionUndefined: Self = StObject.set(x, "android:permission", js.undefined)
  }
}
