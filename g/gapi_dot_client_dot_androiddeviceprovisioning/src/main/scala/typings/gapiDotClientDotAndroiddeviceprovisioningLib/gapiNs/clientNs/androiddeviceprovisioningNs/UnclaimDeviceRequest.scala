package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnclaimDeviceRequest extends js.Object {
  /** The device ID returned by `ClaimDevice`. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** The device identifier you used when you claimed this device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** The section type to unclaim for. */
  var sectionType: js.UndefOr[java.lang.String] = js.undefined
}

object UnclaimDeviceRequest {
  @scala.inline
  def apply(
    deviceId: java.lang.String = null,
    deviceIdentifier: DeviceIdentifier = null,
    sectionType: java.lang.String = null
  ): UnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier)
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType)
    __obj.asInstanceOf[UnclaimDeviceRequest]
  }
}

