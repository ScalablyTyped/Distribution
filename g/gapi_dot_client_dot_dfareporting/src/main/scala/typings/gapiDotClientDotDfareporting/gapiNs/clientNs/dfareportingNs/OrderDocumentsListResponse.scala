package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderDocumentsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#orderDocumentsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Order document collection */
  var orderDocuments: js.UndefOr[js.Array[OrderDocument]] = js.undefined
}

object OrderDocumentsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, orderDocuments: js.Array[OrderDocument] = null): OrderDocumentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (orderDocuments != null) __obj.updateDynamic("orderDocuments")(orderDocuments)
    __obj.asInstanceOf[OrderDocumentsListResponse]
  }
}

