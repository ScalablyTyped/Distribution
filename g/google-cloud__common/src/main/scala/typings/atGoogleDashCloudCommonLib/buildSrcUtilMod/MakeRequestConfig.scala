package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeRequestConfig extends js.Object {
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var request: js.UndefOr[
    atGoogleDashCloudCommonLib.Anon_Request with (requestLib.requestMod.requestNs.RequestAPI[
      requestLib.requestMod.requestNs.Request, 
      requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl
    ])
  ] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
  var shouldRetryFn: js.UndefOr[
    js.Function1[/* response */ js.UndefOr[requestLib.requestMod.requestNs.Response], scala.Boolean]
  ] = js.undefined
  var stream: js.UndefOr[duplexifyLib.duplexifyMod.duplexifyNs.Duplexify] = js.undefined
}

object MakeRequestConfig {
  @scala.inline
  def apply(
    autoRetry: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetries: scala.Int | scala.Double = null,
    request: atGoogleDashCloudCommonLib.Anon_Request with (requestLib.requestMod.requestNs.RequestAPI[
      requestLib.requestMod.requestNs.Request, 
      requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl
    ]) = null,
    retries: scala.Int | scala.Double = null,
    shouldRetryFn: js.Function1[/* response */ js.UndefOr[requestLib.requestMod.requestNs.Response], scala.Boolean] = null,
    stream: duplexifyLib.duplexifyMod.duplexifyNs.Duplexify = null
  ): MakeRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (shouldRetryFn != null) __obj.updateDynamic("shouldRetryFn")(shouldRetryFn)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[MakeRequestConfig]
  }
}

