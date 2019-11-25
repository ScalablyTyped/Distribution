package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnclaimDeviceRequest extends js.Object {
  /** The device ID returned by `ClaimDevice`. */
  var deviceId: js.UndefOr[String] = js.undefined
  /** The device identifier you used when you claimed this device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** The section type to unclaim for. */
  var sectionType: js.UndefOr[String] = js.undefined
}

object UnclaimDeviceRequest {
  @scala.inline
  def apply(deviceId: String = null, deviceIdentifier: DeviceIdentifier = null, sectionType: String = null): UnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnclaimDeviceRequest]
  }
}

