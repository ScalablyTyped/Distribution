package typings
package googleDashGaxLib.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackoffSettings extends js.Object {
  var initialRetryDelayMillis: scala.Double
  var initialRpcTimeoutMillis: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var maxRetryDelayMillis: scala.Double
  var maxRpcTimeoutMillis: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var retryDelayMultiplier: scala.Double
  var rpcTimeoutMultiplier: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var totalTimeoutMillis: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object BackoffSettings {
  @scala.inline
  def apply(
    initialRetryDelayMillis: scala.Double,
    maxRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    initialRpcTimeoutMillis: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    maxRpcTimeoutMillis: scala.Int | scala.Double = null,
    rpcTimeoutMultiplier: scala.Int | scala.Double = null,
    totalTimeoutMillis: scala.Int | scala.Double = null
  ): BackoffSettings = {
    val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis, maxRetryDelayMillis = maxRetryDelayMillis, retryDelayMultiplier = retryDelayMultiplier)
    if (initialRpcTimeoutMillis != null) __obj.updateDynamic("initialRpcTimeoutMillis")(initialRpcTimeoutMillis.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (maxRpcTimeoutMillis != null) __obj.updateDynamic("maxRpcTimeoutMillis")(maxRpcTimeoutMillis.asInstanceOf[js.Any])
    if (rpcTimeoutMultiplier != null) __obj.updateDynamic("rpcTimeoutMultiplier")(rpcTimeoutMultiplier.asInstanceOf[js.Any])
    if (totalTimeoutMillis != null) __obj.updateDynamic("totalTimeoutMillis")(totalTimeoutMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffSettings]
  }
}

