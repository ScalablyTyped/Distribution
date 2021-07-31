package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for `UnbindDeviceFromGateway`.
  */
trait SchemaUnbindDeviceFromGatewayRequest extends StObject {
  
  /**
    * The device to disassociate from the specified gateway. The value of
    * `device_id` can be either the device numeric ID or the user-defined
    * device identifier.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The value of `gateway_id` can be either the device numeric ID or the
    * user-defined device identifier.
    */
  var gatewayId: js.UndefOr[String] = js.undefined
}
object SchemaUnbindDeviceFromGatewayRequest {
  
  @scala.inline
  def apply(): SchemaUnbindDeviceFromGatewayRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnbindDeviceFromGatewayRequest]
  }
  
  @scala.inline
  implicit class SchemaUnbindDeviceFromGatewayRequestMutableBuilder[Self <: SchemaUnbindDeviceFromGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
  }
}
