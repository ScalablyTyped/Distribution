package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to remove the configuration from device.
  */
@js.native
trait Schema$CustomerRemoveConfigurationRequest extends js.Object {
  /**
    * Required. The device to remove the configuration from.
    */
  var device: js.UndefOr[Schema$DeviceReference] = js.native
}

object Schema$CustomerRemoveConfigurationRequest {
  @scala.inline
  def apply(device: Schema$DeviceReference = null): Schema$CustomerRemoveConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerRemoveConfigurationRequest]
  }
}

