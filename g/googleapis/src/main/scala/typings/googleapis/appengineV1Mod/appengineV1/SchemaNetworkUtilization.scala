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
    targetReceivedBytesPerSecond: Int | Double = null,
    targetReceivedPacketsPerSecond: Int | Double = null,
    targetSentBytesPerSecond: Int | Double = null,
    targetSentPacketsPerSecond: Int | Double = null
  ): SchemaNetworkUtilization = {
    val __obj = js.Dynamic.literal()
    if (targetReceivedBytesPerSecond != null) __obj.updateDynamic("targetReceivedBytesPerSecond")(targetReceivedBytesPerSecond.asInstanceOf[js.Any])
    if (targetReceivedPacketsPerSecond != null) __obj.updateDynamic("targetReceivedPacketsPerSecond")(targetReceivedPacketsPerSecond.asInstanceOf[js.Any])
    if (targetSentBytesPerSecond != null) __obj.updateDynamic("targetSentBytesPerSecond")(targetSentBytesPerSecond.asInstanceOf[js.Any])
    if (targetSentPacketsPerSecond != null) __obj.updateDynamic("targetSentPacketsPerSecond")(targetSentPacketsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkUtilization]
  }
}

