package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLongrunningListOperationsResponse extends js.Object {
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** A list of operations that matches the specified filter in the request. */
  var operations: js.UndefOr[js.Array[GoogleLongrunningOperation]] = js.undefined
}

object GoogleLongrunningListOperationsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, operations: js.Array[GoogleLongrunningOperation] = null): GoogleLongrunningListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[GoogleLongrunningListOperationsResponse]
  }
}

