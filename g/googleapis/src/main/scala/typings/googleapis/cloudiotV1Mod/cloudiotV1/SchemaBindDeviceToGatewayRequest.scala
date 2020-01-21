package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for `BindDeviceToGateway`.
  */
@js.native
trait SchemaBindDeviceToGatewayRequest extends js.Object {
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
  def apply(deviceId: String = null, gatewayId: String = null): SchemaBindDeviceToGatewayRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBindDeviceToGatewayRequest]
  }
}

