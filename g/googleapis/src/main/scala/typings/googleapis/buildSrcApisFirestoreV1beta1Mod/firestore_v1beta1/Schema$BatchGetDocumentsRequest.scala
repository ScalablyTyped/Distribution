package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Firestore.BatchGetDocuments.
  */
@js.native
trait Schema$BatchGetDocumentsRequest extends js.Object {
  /**
    * The names of the documents to retrieve. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * The request will fail if any of the document is not a child resource of
    * the given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fields to return. If not set, returns all fields.  If a document has
    * a field that is not present in this mask, that field will not be returned
    * in the response.
    */
  var mask: js.UndefOr[Schema$DocumentMask] = js.native
  /**
    * Starts a new transaction and reads the documents. Defaults to a read-only
    * transaction. The new transaction ID will be returned as the first
    * response in the stream.
    */
  var newTransaction: js.UndefOr[Schema$TransactionOptions] = js.native
  /**
    * Reads documents as they were at the given time. This may not be older
    * than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * Reads documents in a transaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object Schema$BatchGetDocumentsRequest {
  @scala.inline
  def apply(
    documents: js.Array[String] = null,
    mask: Schema$DocumentMask = null,
    newTransaction: Schema$TransactionOptions = null,
    readTime: String = null,
    transaction: String = null
  ): Schema$BatchGetDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (newTransaction != null) __obj.updateDynamic("newTransaction")(newTransaction.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchGetDocumentsRequest]
  }
}

