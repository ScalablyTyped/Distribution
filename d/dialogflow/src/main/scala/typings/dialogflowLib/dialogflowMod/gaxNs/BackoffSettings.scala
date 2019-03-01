package typings
package dialogflowLib.dialogflowMod.gaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackoffSettings extends js.Object {
  var initialRetryDelayMillis: scala.Double
  var initialRpcTimeoutMillis: scala.Double
  var maxRetryDelayMillis: scala.Double
  var maxRpcTimeoutMillis: scala.Double
  var retryDelayMultiplier: scala.Double
  var totalTimeoutMillis: scala.Double
}

object BackoffSettings {
  @scala.inline
  def apply(
    initialRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    maxRetryDelayMillis: scala.Double,
    maxRpcTimeoutMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initialRetryDelayMillis")(initialRetryDelayMillis)
    __obj.updateDynamic("initialRpcTimeoutMillis")(initialRpcTimeoutMillis)
    __obj.updateDynamic("maxRetryDelayMillis")(maxRetryDelayMillis)
    __obj.updateDynamic("maxRpcTimeoutMillis")(maxRpcTimeoutMillis)
    __obj.updateDynamic("retryDelayMultiplier")(retryDelayMultiplier)
    __obj.updateDynamic("totalTimeoutMillis")(totalTimeoutMillis)
    __obj.asInstanceOf[BackoffSettings]
  }
}

