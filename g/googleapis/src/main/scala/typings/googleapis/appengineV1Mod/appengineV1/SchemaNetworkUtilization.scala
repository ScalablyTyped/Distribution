package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by network usage. Only applicable in the App Engine flexible
  * environment.
  */
@js.native
trait SchemaNetworkUtilization extends js.Object {
  /**
    * Target bytes received per second.
    */
  var targetReceivedBytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * Target packets received per second.
    */
  var targetReceivedPacketsPerSecond: js.UndefOr[Double] = js.native
  /**
    * Target bytes sent per second.
    */
  var targetSentBytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * Target packets sent per second.
    */
  var targetSentPacketsPerSecond: js.UndefOr[Double] = js.native
}

object SchemaNetworkUtilization {
  @scala.inline
  def apply(
    targetReceivedBytesPerSecond: js.UndefOr[Double] = js.undefined,
    targetReceivedPacketsPerSecond: js.UndefOr[Double] = js.undefined,
    targetSentBytesPerSecond: js.UndefOr[Double] = js.undefined,
    targetSentPacketsPerSecond: js.UndefOr[Double] = js.undefined
  ): SchemaNetworkUtilization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(targetReceivedBytesPerSecond)) __obj.updateDynamic("targetReceivedBytesPerSecond")(targetReceivedBytesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetReceivedPacketsPerSecond)) __obj.updateDynamic("targetReceivedPacketsPerSecond")(targetReceivedPacketsPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetSentBytesPerSecond)) __obj.updateDynamic("targetSentBytesPerSecond")(targetSentBytesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetSentPacketsPerSecond)) __obj.updateDynamic("targetSentPacketsPerSecond")(targetSentPacketsPerSecond.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkUtilization]
  }
}

