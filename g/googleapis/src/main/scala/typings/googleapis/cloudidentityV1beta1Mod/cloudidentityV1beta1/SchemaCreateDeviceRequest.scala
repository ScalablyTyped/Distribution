package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateDeviceRequest extends StObject {
  
  /**
    * Required. The device to be created. The name field within this device is ignored in the create method. A new name is created by the method, and returned within the response. Only the fields `device_type`, `serial_number` and `asset_tag` (if present) are used to create the device. All other fields are ignored. The `device_type` and `serial_number` fields are required.
    */
  var device: js.UndefOr[SchemaDevice] = js.undefined
}
object SchemaCreateDeviceRequest {
  
  inline def apply(): SchemaCreateDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDeviceRequest]
  }
  
  extension [Self <: SchemaCreateDeviceRequest](x: Self) {
    
    inline def setDevice(value: SchemaDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
