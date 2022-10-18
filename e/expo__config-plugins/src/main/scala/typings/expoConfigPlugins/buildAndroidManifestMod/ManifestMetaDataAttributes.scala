package typings.expoConfigPlugins.buildAndroidManifestMod

import typings.expoConfigPlugins.expoConfigPluginsStrings.androidDotintentDotactionDotVIEW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestMetaDataAttributes
  extends StObject
     with AndroidManifestAttributes {
  
  @JSName("android:resource")
  var androidColonresource: js.UndefOr[String] = js.undefined
  
  @JSName("android:value")
  var androidColonvalue: js.UndefOr[String] = js.undefined
}
object ManifestMetaDataAttributes {
  
  inline def apply(androidColonname: String | androidDotintentDotactionDotVIEW): ManifestMetaDataAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android:name")(androidColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestMetaDataAttributes]
  }
  
  extension [Self <: ManifestMetaDataAttributes](x: Self) {
    
    inline def setAndroidColonresource(value: String): Self = StObject.set(x, "android:resource", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonresourceUndefined: Self = StObject.set(x, "android:resource", js.undefined)
    
    inline def setAndroidColonvalue(value: String): Self = StObject.set(x, "android:value", value.asInstanceOf[js.Any])
    
    inline def setAndroidColonvalueUndefined: Self = StObject.set(x, "android:value", js.undefined)
  }
}
