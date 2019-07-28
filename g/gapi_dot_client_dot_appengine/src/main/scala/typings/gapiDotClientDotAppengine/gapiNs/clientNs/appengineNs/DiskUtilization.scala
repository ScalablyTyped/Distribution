package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

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
    targetReadBytesPerSecond: Int | Double = null,
    targetReadOpsPerSecond: Int | Double = null,
    targetWriteBytesPerSecond: Int | Double = null,
    targetWriteOpsPerSecond: Int | Double = null
  ): DiskUtilization = {
    val __obj = js.Dynamic.literal()
    if (targetReadBytesPerSecond != null) __obj.updateDynamic("targetReadBytesPerSecond")(targetReadBytesPerSecond.asInstanceOf[js.Any])
    if (targetReadOpsPerSecond != null) __obj.updateDynamic("targetReadOpsPerSecond")(targetReadOpsPerSecond.asInstanceOf[js.Any])
    if (targetWriteBytesPerSecond != null) __obj.updateDynamic("targetWriteBytesPerSecond")(targetWriteBytesPerSecond.asInstanceOf[js.Any])
    if (targetWriteOpsPerSecond != null) __obj.updateDynamic("targetWriteOpsPerSecond")(targetWriteOpsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskUtilization]
  }
}

