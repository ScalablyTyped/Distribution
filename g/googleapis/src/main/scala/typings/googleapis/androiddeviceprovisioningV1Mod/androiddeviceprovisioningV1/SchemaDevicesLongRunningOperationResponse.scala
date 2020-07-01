package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks the status of a long-running operation to claim, unclaim, or attach
  * metadata to devices. To learn more, read [Long‑running batch
  * operations](/zero-touch/guides/how-it-works#operations).
  */
@js.native
trait SchemaDevicesLongRunningOperationResponse extends js.Object {
  /**
    * The processing status for each device in the operation. One
    * `PerDeviceStatus` per device. The list order matches the items in the
    * original request.
    */
  var perDeviceStatus: js.UndefOr[js.Array[SchemaOperationPerDevice]] = js.native
  /**
    * A summary of how many items in the operation the server processed
    * successfully. Updated as the operation progresses.
    */
  var successCount: js.UndefOr[Double] = js.native
}

object SchemaDevicesLongRunningOperationResponse {
  @scala.inline
  def apply(
    perDeviceStatus: js.Array[SchemaOperationPerDevice] = null,
    successCount: js.UndefOr[Double] = js.undefined
  ): SchemaDevicesLongRunningOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (perDeviceStatus != null) __obj.updateDynamic("perDeviceStatus")(perDeviceStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(successCount)) __obj.updateDynamic("successCount")(successCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDevicesLongRunningOperationResponse]
  }
}

