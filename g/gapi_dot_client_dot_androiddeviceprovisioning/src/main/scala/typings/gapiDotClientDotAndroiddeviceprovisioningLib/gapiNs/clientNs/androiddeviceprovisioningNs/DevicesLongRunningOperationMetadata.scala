package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesLongRunningOperationMetadata extends js.Object {
  /** Number of devices parsed in your requests. */
  var devicesCount: js.UndefOr[scala.Double] = js.undefined
  /** The overall processing status. */
  var processingStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Processing progress from 0 to 100. */
  var progress: js.UndefOr[scala.Double] = js.undefined
}

object DevicesLongRunningOperationMetadata {
  @scala.inline
  def apply(
    devicesCount: scala.Int | scala.Double = null,
    processingStatus: java.lang.String = null,
    progress: scala.Int | scala.Double = null
  ): DevicesLongRunningOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (devicesCount != null) __obj.updateDynamic("devicesCount")(devicesCount.asInstanceOf[js.Any])
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicesLongRunningOperationMetadata]
  }
}

