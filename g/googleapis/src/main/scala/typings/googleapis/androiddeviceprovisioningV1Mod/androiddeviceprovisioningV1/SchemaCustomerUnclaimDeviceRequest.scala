package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerUnclaimDeviceRequest extends StObject {
  
  /**
    * Required. The device to unclaim. There are custom validations in UnclaimDeviceRequestValidator.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.undefined
}
object SchemaCustomerUnclaimDeviceRequest {
  
  inline def apply(): SchemaCustomerUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerUnclaimDeviceRequest]
  }
  
  extension [Self <: SchemaCustomerUnclaimDeviceRequest](x: Self) {
    
    inline def setDevice(value: SchemaDeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
