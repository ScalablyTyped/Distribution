package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesLongRunningOperationResponse extends js.Object {
  /**
    * Processing status for each device.
    * One `PerDeviceStatus` per device. The order is the same as in your requests.
    */
  var perDeviceStatus: js.UndefOr[js.Array[OperationPerDevice]] = js.undefined
  /** Number of succeesfully processed ones. */
  var successCount: js.UndefOr[scala.Double] = js.undefined
}

object DevicesLongRunningOperationResponse {
  @scala.inline
  def apply(
    perDeviceStatus: js.Array[OperationPerDevice] = null,
    successCount: scala.Int | scala.Double = null
  ): DevicesLongRunningOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (perDeviceStatus != null) __obj.updateDynamic("perDeviceStatus")(perDeviceStatus)
    if (successCount != null) __obj.updateDynamic("successCount")(successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicesLongRunningOperationResponse]
  }
}

