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
  var request: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  def makeAuthenticatedRequest(
    reqOpts: requestLib.requestMod.OptionsWithUri,
    fnobj: atGoogleDashCloudCommonLib.Anon_AuthenticatedReqOpts
  ): scala.Unit
}

object MakeWritableStreamOptions {
  @scala.inline
  def apply(
    makeAuthenticatedRequest: (requestLib.requestMod.OptionsWithUri, atGoogleDashCloudCommonLib.Anon_AuthenticatedReqOpts) => scala.Unit,
    connection: js.Object = null,
    metadata: atGoogleDashCloudCommonLib.Anon_ContentType = null,
    request: requestLib.requestMod.Options = null
  ): MakeWritableStreamOptions = {
    val __obj = js.Dynamic.literal(makeAuthenticatedRequest = js.Any.fromFunction2(makeAuthenticatedRequest))
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeWritableStreamOptions]
  }
}

