package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to remove the configuration from device.
  */
@js.native
trait SchemaCustomerRemoveConfigurationRequest extends js.Object {
  /**
    * Required. The device to remove the configuration from.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.native
}

object SchemaCustomerRemoveConfigurationRequest {
  @scala.inline
  def apply(device: SchemaDeviceReference = null): SchemaCustomerRemoveConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomerRemoveConfigurationRequest]
  }
}

