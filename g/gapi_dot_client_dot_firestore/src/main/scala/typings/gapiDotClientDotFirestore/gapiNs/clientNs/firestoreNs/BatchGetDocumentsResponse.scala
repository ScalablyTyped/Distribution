package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDocumentsResponse extends js.Object {
  /** A document that was requested. */
  var found: js.UndefOr[Document] = js.undefined
  /**
    * A document name that was requested but does not exist. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var missing: js.UndefOr[String] = js.undefined
  /**
    * The time at which the document was read.
    * This may be monotically increasing, in this case the previous documents in
    * the result stream are guaranteed not to have changed between their
    * read_time and this one.
    */
  var readTime: js.UndefOr[String] = js.undefined
  /**
    * The transaction that was started as part of this request.
    * Will only be set in the first response, and only if
    * BatchGetDocumentsRequest.new_transaction was set in the request.
    */
  var transaction: js.UndefOr[String] = js.undefined
}

object BatchGetDocumentsResponse {
  @scala.inline
  def apply(
    found: Document = null,
    missing: String = null,
    readTime: String = null,
    transaction: String = null
  ): BatchGetDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (found != null) __obj.updateDynamic("found")(found)
    if (missing != null) __obj.updateDynamic("missing")(missing)
    if (readTime != null) __obj.updateDynamic("readTime")(readTime)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[BatchGetDocumentsResponse]
  }
}

