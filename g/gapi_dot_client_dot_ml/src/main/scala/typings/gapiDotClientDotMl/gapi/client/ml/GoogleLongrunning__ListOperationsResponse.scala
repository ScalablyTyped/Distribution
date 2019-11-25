package typings.gapiDotClientDotMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLongrunning__ListOperationsResponse extends js.Object {
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** A list of operations that matches the specified filter in the request. */
  var operations: js.UndefOr[js.Array[GoogleLongrunning__Operation]] = js.undefined
}

object GoogleLongrunning__ListOperationsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, operations: js.Array[GoogleLongrunning__Operation] = null): GoogleLongrunning__ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleLongrunning__ListOperationsResponse]
  }
}

