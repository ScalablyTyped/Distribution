package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDocumentsRequest extends js.Object {
  /**
    * The names of the documents to retrieve. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * The request will fail if any of the document is not a child resource of the
    * given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The fields to return. If not set, returns all fields.
    *
    * If a document has a field that is not present in this mask, that field will
    * not be returned in the response.
    */
  var mask: js.UndefOr[DocumentMask] = js.undefined
  /**
    * Starts a new transaction and reads the documents.
    * Defaults to a read-only transaction.
    * The new transaction ID will be returned as the first response in the
    * stream.
    */
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  /**
    * Reads documents as they were at the given time.
    * This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.undefined
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[String] = js.undefined
}

object BatchGetDocumentsRequest {
  @scala.inline
  def apply(
    documents: js.Array[String] = null,
    mask: DocumentMask = null,
    newTransaction: TransactionOptions = null,
    readTime: String = null,
    transaction: String = null
  ): BatchGetDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (newTransaction != null) __obj.updateDynamic("newTransaction")(newTransaction)
    if (readTime != null) __obj.updateDynamic("readTime")(readTime)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[BatchGetDocumentsRequest]
  }
}

