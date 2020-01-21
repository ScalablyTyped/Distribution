package typings.googleCloudCommon.utilMod

import typings.googleCloudCommon.AnonAuthenticatedReqOpts
import typings.googleCloudCommon.AnonContentType
import typings.teenyRequest.mod.Options
import typings.teenyRequest.mod.OptionsWithUri
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
  var metadata: js.UndefOr[AnonContentType] = js.undefined
  /**
    * Request object, in the format of a standard Node.js http.request() object.
    */
  var request: js.UndefOr[Options] = js.undefined
  def makeAuthenticatedRequest(reqOpts: OptionsWithUri, fnobj: AnonAuthenticatedReqOpts): Unit
}

object MakeWritableStreamOptions {
  @scala.inline
  def apply(
    makeAuthenticatedRequest: (OptionsWithUri, AnonAuthenticatedReqOpts) => Unit,
    connection: js.Object = null,
    metadata: AnonContentType = null,
    request: Options = null
  ): MakeWritableStreamOptions = {
    val __obj = js.Dynamic.literal(makeAuthenticatedRequest = js.Any.fromFunction2(makeAuthenticatedRequest))
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeWritableStreamOptions]
  }
}

