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
    initialRpcTimeoutMillis: js.UndefOr[Null | Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    maxRpcTimeoutMillis: js.UndefOr[Null | Double] = js.undefined,
    rpcTimeoutMultiplier: js.UndefOr[Null | Double] = js.undefined,
    totalTimeoutMillis: js.UndefOr[Null | Double] = js.undefined
  ): BackoffSettings = {
    val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis.asInstanceOf[js.Any], maxRetryDelayMillis = maxRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier = retryDelayMultiplier.asInstanceOf[js.Any])
    if (!js.isUndefined(initialRpcTimeoutMillis)) __obj.updateDynamic("initialRpcTimeoutMillis")(initialRpcTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRpcTimeoutMillis)) __obj.updateDynamic("maxRpcTimeoutMillis")(maxRpcTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(rpcTimeoutMultiplier)) __obj.updateDynamic("rpcTimeoutMultiplier")(rpcTimeoutMultiplier.asInstanceOf[js.Any])
    if (!js.isUndefined(totalTimeoutMillis)) __obj.updateDynamic("totalTimeoutMillis")(totalTimeoutMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffSettings]
  }
}

