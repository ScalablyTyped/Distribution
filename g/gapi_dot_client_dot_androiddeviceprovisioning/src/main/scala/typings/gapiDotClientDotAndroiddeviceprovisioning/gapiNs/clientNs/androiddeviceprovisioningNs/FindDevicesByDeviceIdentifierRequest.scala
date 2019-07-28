package typings.gapiDotClientDotAndroiddeviceprovisioning.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindDevicesByDeviceIdentifierRequest extends js.Object {
  /** The device identifier to search. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** Number of devices to show. */
  var limit: js.UndefOr[String] = js.undefined
  /** Page token. */
  var pageToken: js.UndefOr[String] = js.undefined
}

object FindDevicesByDeviceIdentifierRequest {
  @scala.inline
  def apply(deviceIdentifier: DeviceIdentifier = null, limit: String = null, pageToken: String = null): FindDevicesByDeviceIdentifierRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[FindDevicesByDeviceIdentifierRequest]
  }
}

