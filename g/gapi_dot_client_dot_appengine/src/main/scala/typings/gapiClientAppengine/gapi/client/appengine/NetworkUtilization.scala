package typings.gapiClientAppengine.gapi.client.appengine

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
    targetReceivedBytesPerSecond: js.UndefOr[Double] = js.undefined,
    targetReceivedPacketsPerSecond: js.UndefOr[Double] = js.undefined,
    targetSentBytesPerSecond: js.UndefOr[Double] = js.undefined,
    targetSentPacketsPerSecond: js.UndefOr[Double] = js.undefined
  ): NetworkUtilization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(targetReceivedBytesPerSecond)) __obj.updateDynamic("targetReceivedBytesPerSecond")(targetReceivedBytesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetReceivedPacketsPerSecond)) __obj.updateDynamic("targetReceivedPacketsPerSecond")(targetReceivedPacketsPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetSentBytesPerSecond)) __obj.updateDynamic("targetSentBytesPerSecond")(targetSentBytesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetSentPacketsPerSecond)) __obj.updateDynamic("targetSentPacketsPerSecond")(targetSentPacketsPerSecond.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkUtilization]
  }
}

