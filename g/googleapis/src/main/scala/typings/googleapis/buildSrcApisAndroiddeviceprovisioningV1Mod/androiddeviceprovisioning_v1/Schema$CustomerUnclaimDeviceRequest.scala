package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to unclaim a device.
  */
@js.native
trait Schema$CustomerUnclaimDeviceRequest extends js.Object {
  /**
    * Required. The device to unclaim.
    */
  var device: js.UndefOr[Schema$DeviceReference] = js.native
}

object Schema$CustomerUnclaimDeviceRequest {
  @scala.inline
  def apply(device: Schema$DeviceReference = null): Schema$CustomerUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerUnclaimDeviceRequest]
  }
}

