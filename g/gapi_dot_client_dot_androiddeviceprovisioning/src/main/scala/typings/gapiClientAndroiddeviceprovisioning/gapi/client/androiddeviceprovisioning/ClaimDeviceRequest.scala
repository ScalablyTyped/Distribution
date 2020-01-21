package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimDeviceRequest extends js.Object {
  /** The customer to claim for. */
  var customerId: js.UndefOr[String] = js.undefined
  /** The device identifier of the device to claim. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** The section to claim. */
  var sectionType: js.UndefOr[String] = js.undefined
}

object ClaimDeviceRequest {
  @scala.inline
  def apply(customerId: String = null, deviceIdentifier: DeviceIdentifier = null, sectionType: String = null): ClaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDeviceRequest]
  }
}

