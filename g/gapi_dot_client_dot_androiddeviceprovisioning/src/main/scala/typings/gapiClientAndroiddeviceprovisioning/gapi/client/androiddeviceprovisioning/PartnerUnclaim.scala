package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartnerUnclaim extends js.Object {
  /** Device ID of the device. */
  var deviceId: js.UndefOr[String] = js.undefined
  /** Device identifier of the device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** Section type to unclaim. */
  var sectionType: js.UndefOr[String] = js.undefined
}

object PartnerUnclaim {
  @scala.inline
  def apply(deviceId: String = null, deviceIdentifier: DeviceIdentifier = null, sectionType: String = null): PartnerUnclaim = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerUnclaim]
  }
}

