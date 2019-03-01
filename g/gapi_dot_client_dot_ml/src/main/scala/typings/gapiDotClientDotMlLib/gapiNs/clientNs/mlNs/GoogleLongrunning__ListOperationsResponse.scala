package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLongrunning__ListOperationsResponse extends js.Object {
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** A list of operations that matches the specified filter in the request. */
  var operations: js.UndefOr[js.Array[GoogleLongrunning__Operation]] = js.undefined
}

object GoogleLongrunning__ListOperationsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, operations: js.Array[GoogleLongrunning__Operation] = null): GoogleLongrunning__ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[GoogleLongrunning__ListOperationsResponse]
  }
}

