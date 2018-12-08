package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MakeAuthenticatedRequestFactoryConfig
  extends googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod.GoogleAuthOptions {
  /**
       * Automatically retry requests if the response is related to rate limits or
       * certain intermittent server errors. We will exponentially backoff
       * subsequent requests by default. (default: true)
       */
  var autoRetry: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, just return the provided request options. Default: false.
       */
  var customEndpoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Account email address, required for PEM/P12 usage.
       */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Maximum number of automatic retries attempted before returning the error.
       * (default: 3)
       */
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var request: js.Any
  var stream: js.UndefOr[duplexifyLib.duplexifyMod.duplexifyNs.Duplexify] = js.undefined
}

