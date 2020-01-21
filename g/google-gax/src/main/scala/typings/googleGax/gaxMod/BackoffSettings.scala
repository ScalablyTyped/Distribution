package typings.googleGax.gaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackoffSettings extends js.Object {
  var initialRetryDelayMillis: Double
  var initialRpcTimeoutMillis: js.UndefOr[Double | Null] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var maxRetryDelayMillis: Double
  var maxRpcTimeoutMillis: js.UndefOr[Double | Null] = js.undefined
  var retryDelayMultiplier: Double
  var rpcTimeoutMultiplier: js.UndefOr[Double | Null] = js.undefined
  var totalTimeoutMillis: js.UndefOr[Double | Null] = js.undefined
}

object BackoffSettings {
  @scala.inline
  def apply(
    initialRetryDelayMillis: Double,
    maxRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    initialRpcTimeoutMillis: Int | Double = null,
    maxRetries: Int | Double = null,
    maxRpcTimeoutMillis: Int | Double = null,
    rpcTimeoutMultiplier: Int | Double = null,
    totalTimeoutMillis: Int | Double = null
  ): BackoffSettings = {
    val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis.asInstanceOf[js.Any], maxRetryDelayMillis = maxRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier = retryDelayMultiplier.asInstanceOf[js.Any])
    if (initialRpcTimeoutMillis != null) __obj.updateDynamic("initialRpcTimeoutMillis")(initialRpcTimeoutMillis.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (maxRpcTimeoutMillis != null) __obj.updateDynamic("maxRpcTimeoutMillis")(maxRpcTimeoutMillis.asInstanceOf[js.Any])
    if (rpcTimeoutMultiplier != null) __obj.updateDynamic("rpcTimeoutMultiplier")(rpcTimeoutMultiplier.asInstanceOf[js.Any])
    if (totalTimeoutMillis != null) __obj.updateDynamic("totalTimeoutMillis")(totalTimeoutMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffSettings]
  }
}

