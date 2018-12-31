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
    requestLib.requestMod.requestNs.RequestAPI[
      requestLib.requestMod.requestNs.Request, 
      requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl
    ]
  ] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
  var shouldRetryFn: js.UndefOr[
    js.Function1[/* response */ js.UndefOr[requestLib.requestMod.requestNs.Response], scala.Boolean]
  ] = js.undefined
  var stream: js.UndefOr[duplexifyLib.duplexifyMod.duplexifyNs.Duplexify] = js.undefined
}

