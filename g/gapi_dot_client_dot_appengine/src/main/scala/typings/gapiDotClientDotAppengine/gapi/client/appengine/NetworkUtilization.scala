package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkUtilization extends js.Object {
  /** Target bytes received per second. */
  var targetReceivedBytesPerSecond: js.UndefOr[Double] = js.undefined
  /** Target packets received per second. */
  var targetReceivedPacketsPerSecond: js.UndefOr[Double] = js.undefined
  /** Target bytes sent per second. */
  var targetSentBytesPerSecond: js.UndefOr[Double] = js.undefined
  /** Target packets sent per second. */
  var targetSentPacketsPerSecond: js.UndefOr[Double] = js.undefined
}

object NetworkUtilization {
  @scala.inline
  def apply(
    targetReceivedBytesPerSecond: Int | Double = null,
    targetReceivedPacketsPerSecond: Int | Double = null,
    targetSentBytesPerSecond: Int | Double = null,
    targetSentPacketsPerSecond: Int | Double = null
  ): NetworkUtilization = {
    val __obj = js.Dynamic.literal()
    if (targetReceivedBytesPerSecond != null) __obj.updateDynamic("targetReceivedBytesPerSecond")(targetReceivedBytesPerSecond.asInstanceOf[js.Any])
    if (targetReceivedPacketsPerSecond != null) __obj.updateDynamic("targetReceivedPacketsPerSecond")(targetReceivedPacketsPerSecond.asInstanceOf[js.Any])
    if (targetSentBytesPerSecond != null) __obj.updateDynamic("targetSentBytesPerSecond")(targetSentBytesPerSecond.asInstanceOf[js.Any])
    if (targetSentPacketsPerSecond != null) __obj.updateDynamic("targetSentPacketsPerSecond")(targetSentPacketsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkUtilization]
  }
}

