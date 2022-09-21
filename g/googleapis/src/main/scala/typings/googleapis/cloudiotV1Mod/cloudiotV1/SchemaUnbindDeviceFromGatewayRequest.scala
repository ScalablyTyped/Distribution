package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnbindDeviceFromGatewayRequest extends StObject {
  
  /**
    * Required. The device to disassociate from the specified gateway. The value of `device_id` can be either the device numeric ID or the user-defined device identifier.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The value of `gateway_id` can be either the device numeric ID or the user-defined device identifier.
    */
  var gatewayId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUnbindDeviceFromGatewayRequest {
  
  inline def apply(): SchemaUnbindDeviceFromGatewayRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnbindDeviceFromGatewayRequest]
  }
  
  extension [Self <: SchemaUnbindDeviceFromGatewayRequest](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdNull: Self = StObject.set(x, "gatewayId", null)
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
  }
}
