package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks the status of a long-running operation to asynchronously update a
  * batch of reseller metadata attached to devices. To learn more, read
  * [Long‑running batch
  * operations](/zero-touch/guides/how-it-works#operations).
  */
@js.native
trait SchemaDevicesLongRunningOperationMetadata extends js.Object {
  /**
    * The number of metadata updates in the operation. This might be different
    * from the number of updates in the request if the API can&#39;t parse some
    * of the updates.
    */
  var devicesCount: js.UndefOr[Double] = js.native
  /**
    * The processing status of the operation.
    */
  var processingStatus: js.UndefOr[String] = js.native
  /**
    * The processing progress of the operation. Measured as a number from 0 to
    * 100. A value of 10O doesnt always mean the operation completed—check for
    * the inclusion of a `done` field.
    */
  var progress: js.UndefOr[Double] = js.native
}

object SchemaDevicesLongRunningOperationMetadata {
  @scala.inline
  def apply(
    devicesCount: js.UndefOr[Double] = js.undefined,
    processingStatus: String = null,
    progress: js.UndefOr[Double] = js.undefined
  ): SchemaDevicesLongRunningOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(devicesCount)) __obj.updateDynamic("devicesCount")(devicesCount.get.asInstanceOf[js.Any])
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDevicesLongRunningOperationMetadata]
  }
}

