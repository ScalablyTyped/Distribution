package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerDeviceStatusInBatch extends js.Object {
  /** Device ID of the device if process succeeds. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** Error identifier. */
  var errorIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /** Error message. */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Process result. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object PerDeviceStatusInBatch {
  @scala.inline
  def apply(
    deviceId: java.lang.String = null,
    errorIdentifier: java.lang.String = null,
    errorMessage: java.lang.String = null,
    status: java.lang.String = null
  ): PerDeviceStatusInBatch = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (errorIdentifier != null) __obj.updateDynamic("errorIdentifier")(errorIdentifier)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PerDeviceStatusInBatch]
  }
}

