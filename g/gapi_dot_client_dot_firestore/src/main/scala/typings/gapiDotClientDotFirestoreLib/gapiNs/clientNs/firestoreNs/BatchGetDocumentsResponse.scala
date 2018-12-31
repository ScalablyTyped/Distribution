package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

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
  var missing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time at which the document was read.
    * This may be monotically increasing, in this case the previous documents in
    * the result stream are guaranteed not to have changed between their
    * read_time and this one.
    */
  var readTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The transaction that was started as part of this request.
    * Will only be set in the first response, and only if
    * BatchGetDocumentsRequest.new_transaction was set in the request.
    */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
}

