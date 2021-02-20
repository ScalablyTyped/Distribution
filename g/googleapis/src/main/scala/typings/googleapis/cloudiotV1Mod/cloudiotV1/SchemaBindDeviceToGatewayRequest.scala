package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for `BindDeviceToGateway`.
  */
@js.native
trait SchemaBindDeviceToGatewayRequest extends StObject {
  
  /**
    * The device to associate with the specified gateway. The value of
    * `device_id` can be either the device numeric ID or the user-defined
    * device identifier.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * The value of `gateway_id` can be either the device numeric ID or the
    * user-defined device identifier.
    */
  var gatewayId: js.UndefOr[String] = js.native
}
object SchemaBindDeviceToGatewayRequest {
  
  @scala.inline
  def apply(): SchemaBindDeviceToGatewayRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBindDeviceToGatewayRequest]
  }
  
  @scala.inline
  implicit class SchemaBindDeviceToGatewayRequestMutableBuilder[Self <: SchemaBindDeviceToGatewayRequest] (val x: Self) extends AnyVal {
    
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
