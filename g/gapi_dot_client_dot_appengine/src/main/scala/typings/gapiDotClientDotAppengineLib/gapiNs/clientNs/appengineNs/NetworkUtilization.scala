package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkUtilization extends js.Object {
  /** Target bytes received per second. */
  var targetReceivedBytesPerSecond: js.UndefOr[scala.Double] = js.undefined
  /** Target packets received per second. */
  var targetReceivedPacketsPerSecond: js.UndefOr[scala.Double] = js.undefined
  /** Target bytes sent per second. */
  var targetSentBytesPerSecond: js.UndefOr[scala.Double] = js.undefined
  /** Target packets sent per second. */
  var targetSentPacketsPerSecond: js.UndefOr[scala.Double] = js.undefined
}

object NetworkUtilization {
  @scala.inline
  def apply(
    targetReceivedBytesPerSecond: scala.Int | scala.Double = null,
    targetReceivedPacketsPerSecond: scala.Int | scala.Double = null,
    targetSentBytesPerSecond: scala.Int | scala.Double = null,
    targetSentPacketsPerSecond: scala.Int | scala.Double = null
  ): NetworkUtilization = {
    val __obj = js.Dynamic.literal()
    if (targetReceivedBytesPerSecond != null) __obj.updateDynamic("targetReceivedBytesPerSecond")(targetReceivedBytesPerSecond.asInstanceOf[js.Any])
    if (targetReceivedPacketsPerSecond != null) __obj.updateDynamic("targetReceivedPacketsPerSecond")(targetReceivedPacketsPerSecond.asInstanceOf[js.Any])
    if (targetSentBytesPerSecond != null) __obj.updateDynamic("targetSentBytesPerSecond")(targetSentBytesPerSecond.asInstanceOf[js.Any])
    if (targetSentPacketsPerSecond != null) __obj.updateDynamic("targetSentPacketsPerSecond")(targetSentPacketsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkUtilization]
  }
}

