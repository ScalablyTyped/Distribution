package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks the status of a long-running operation to claim, unclaim, or attach
  * metadata to devices. To learn more, read [Long‑running batch
  * operations](/zero-touch/guides/how-it-works#operations).
  */
@js.native
trait Schema$DevicesLongRunningOperationResponse extends js.Object {
  /**
    * The processing status for each device in the operation. One
    * `PerDeviceStatus` per device. The list order matches the items in the
    * original request.
    */
  var perDeviceStatus: js.UndefOr[js.Array[Schema$OperationPerDevice]] = js.native
  /**
    * A summary of how many items in the operation the server processed
    * successfully. Updated as the operation progresses.
    */
  var successCount: js.UndefOr[Double] = js.native
}

object Schema$DevicesLongRunningOperationResponse {
  @scala.inline
  def apply(perDeviceStatus: js.Array[Schema$OperationPerDevice] = null, successCount: Int | Double = null): Schema$DevicesLongRunningOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (perDeviceStatus != null) __obj.updateDynamic("perDeviceStatus")(perDeviceStatus.asInstanceOf[js.Any])
    if (successCount != null) __obj.updateDynamic("successCount")(successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DevicesLongRunningOperationResponse]
  }
}

