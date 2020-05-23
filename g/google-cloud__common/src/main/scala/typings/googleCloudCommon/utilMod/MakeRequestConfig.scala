package typings.googleCloudCommon.utilMod

import typings.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeRequestConfig extends js.Object {
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var shouldRetryFn: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response[_]], Boolean]] = js.undefined
  var stream: js.UndefOr[Duplexify] = js.undefined
}

object MakeRequestConfig {
  @scala.inline
  def apply(
    autoRetry: js.UndefOr[Boolean] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined,
    shouldRetryFn: /* response */ js.UndefOr[Response[_]] => Boolean = null,
    stream: Duplexify = null
  ): MakeRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (shouldRetryFn != null) __obj.updateDynamic("shouldRetryFn")(js.Any.fromFunction1(shouldRetryFn))
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeRequestConfig]
  }
}

