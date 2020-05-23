package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesLongRunningOperationMetadata extends js.Object {
  /** Number of devices parsed in your requests. */
  var devicesCount: js.UndefOr[Double] = js.undefined
  /** The overall processing status. */
  var processingStatus: js.UndefOr[String] = js.undefined
  /** Processing progress from 0 to 100. */
  var progress: js.UndefOr[Double] = js.undefined
}

object DevicesLongRunningOperationMetadata {
  @scala.inline
  def apply(
    devicesCount: js.UndefOr[Double] = js.undefined,
    processingStatus: String = null,
    progress: js.UndefOr[Double] = js.undefined
  ): DevicesLongRunningOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(devicesCount)) __obj.updateDynamic("devicesCount")(devicesCount.get.asInstanceOf[js.Any])
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicesLongRunningOperationMetadata]
  }
}

