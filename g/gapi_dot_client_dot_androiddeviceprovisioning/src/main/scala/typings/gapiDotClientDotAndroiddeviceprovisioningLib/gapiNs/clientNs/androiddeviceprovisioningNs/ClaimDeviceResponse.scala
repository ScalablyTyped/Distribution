package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimDeviceResponse extends js.Object {
  /** The device ID of the claimed device. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource name of the device in the format
    * `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
    */
  var deviceName: js.UndefOr[java.lang.String] = js.undefined
}

object ClaimDeviceResponse {
  @scala.inline
  def apply(deviceId: java.lang.String = null, deviceName: java.lang.String = null): ClaimDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    __obj.asInstanceOf[ClaimDeviceResponse]
  }
}

