package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskUtilization extends js.Object {
  /** Target bytes read per second. */
  var targetReadBytesPerSecond: js.UndefOr[Double] = js.undefined
  /** Target ops read per seconds. */
  var targetReadOpsPerSecond: js.UndefOr[Double] = js.undefined
  /** Target bytes written per second. */
  var targetWriteBytesPerSecond: js.UndefOr[Double] = js.undefined
  /** Target ops written per second. */
  var targetWriteOpsPerSecond: js.UndefOr[Double] = js.undefined
}

object DiskUtilization {
  @scala.inline
  def apply(
    targetReadBytesPerSecond: js.UndefOr[Double] = js.undefined,
    targetReadOpsPerSecond: js.UndefOr[Double] = js.undefined,
    targetWriteBytesPerSecond: js.UndefOr[Double] = js.undefined,
    targetWriteOpsPerSecond: js.UndefOr[Double] = js.undefined
  ): DiskUtilization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(targetReadBytesPerSecond)) __obj.updateDynamic("targetReadBytesPerSecond")(targetReadBytesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetReadOpsPerSecond)) __obj.updateDynamic("targetReadOpsPerSecond")(targetReadOpsPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetWriteBytesPerSecond)) __obj.updateDynamic("targetWriteBytesPerSecond")(targetWriteBytesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetWriteOpsPerSecond)) __obj.updateDynamic("targetWriteOpsPerSecond")(targetWriteOpsPerSecond.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskUtilization]
  }
}

