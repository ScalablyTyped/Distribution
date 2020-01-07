package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message containing device id of the claim.
  */
@js.native
trait Schema$ClaimDeviceResponse extends js.Object {
  /**
    * The device ID of the claimed device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The resource name of the device in the format
    * `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
    */
  var deviceName: js.UndefOr[String] = js.native
}

object Schema$ClaimDeviceResponse {
  @scala.inline
  def apply(deviceId: String = null, deviceName: String = null): Schema$ClaimDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClaimDeviceResponse]
  }
}

