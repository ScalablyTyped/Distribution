package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceId extends StObject {
  
  /**
    * Value of Build.BRAND.
    */
  var buildBrand: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value of Build.DEVICE.
    */
  var buildDevice: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceId {
  
  inline def apply(): SchemaDeviceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceId]
  }
  
  extension [Self <: SchemaDeviceId](x: Self) {
    
    inline def setBuildBrand(value: String): Self = StObject.set(x, "buildBrand", value.asInstanceOf[js.Any])
    
    inline def setBuildBrandNull: Self = StObject.set(x, "buildBrand", null)
    
    inline def setBuildBrandUndefined: Self = StObject.set(x, "buildBrand", js.undefined)
    
    inline def setBuildDevice(value: String): Self = StObject.set(x, "buildDevice", value.asInstanceOf[js.Any])
    
    inline def setBuildDeviceNull: Self = StObject.set(x, "buildDevice", null)
    
    inline def setBuildDeviceUndefined: Self = StObject.set(x, "buildDevice", js.undefined)
  }
}
