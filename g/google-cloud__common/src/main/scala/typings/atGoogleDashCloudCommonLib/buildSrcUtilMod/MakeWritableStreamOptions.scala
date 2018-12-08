package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MakeWritableStreamOptions extends js.Object {
  /**
       * A connection instance used to get a token with and send the request
       * through.
       */
  var connection: js.UndefOr[js.Object] = js.undefined
  /**
       * Metadata to send at the head of the request.
       */
  var metadata: js.UndefOr[atGoogleDashCloudCommonLib.Anon_ContentType] = js.undefined
  /**
       * Request object, in the format of a standard Node.js http.request() object.
       */
  var request: js.UndefOr[requestLib.requestMod.requestNs.Options] = js.undefined
  /**
       * Dependency for HTTP calls.
       */
  var requestModule: js.Any
  def makeAuthenticatedRequest(
    reqOpts: requestLib.requestMod.requestNs.OptionsWithUri,
    fnobj: atGoogleDashCloudCommonLib.Anon_OnAuthenticated
  ): scala.Unit
}

