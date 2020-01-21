package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to unclaim a device.
  */
@js.native
trait SchemaCustomerUnclaimDeviceRequest extends js.Object {
  /**
    * Required. The device to unclaim.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.native
}

object SchemaCustomerUnclaimDeviceRequest {
  @scala.inline
  def apply(device: SchemaDeviceReference = null): SchemaCustomerUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomerUnclaimDeviceRequest]
  }
}

