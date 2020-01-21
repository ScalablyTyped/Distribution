package typings.gapiClientFirestore.gapi.client.firestore

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFirestore.AnonAccesstoken
import typings.gapiClientFirestore.AnonAccesstokenAlt
import typings.gapiClientFirestore.AnonAccesstokenAltBearertoken
import typings.gapiClientFirestore.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientFirestore.AnonAccesstokenAltBearertokenCallbackCollectionId
import typings.gapiClientFirestore.AnonAccesstokenAltBearertokenCallbackCurrentDocumentexists
import typings.gapiClientFirestore.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientFirestore.AnonAccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentsResource extends js.Object {
  /**
    * Gets multiple documents.
    *
    * Documents returned by this method are not guaranteed to be returned in the
    * same order that they were requested.
    */
  def batchGet(request: AnonAccesstoken): Request_[BatchGetDocumentsResponse]
  /** Starts a new transaction. */
  def beginTransaction(request: AnonAccesstoken): Request_[BeginTransactionResponse]
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: AnonAccesstoken): Request_[CommitResponse]
  /** Creates a new document. */
  def createDocument(request: AnonAccesstokenAlt): Request_[Document]
  /** Deletes a document. */
  def delete(request: AnonAccesstokenAltBearertoken): Request_[js.Object]
  /** Gets a single document. */
  def get(request: AnonAccesstokenAltBearertokenCallback): Request_[Document]
  /** Lists documents. */
  def list(request: AnonAccesstokenAltBearertokenCallbackCollectionId): Request_[ListDocumentsResponse]
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[ListCollectionIdsResponse]
  /** Listens to changes. */
  def listen(request: AnonAccesstoken): Request_[ListenResponse]
  /** Updates or inserts a document. */
  def patch(request: AnonAccesstokenAltBearertokenCallbackCurrentDocumentexists): Request_[Document]
  /** Rolls back a transaction. */
  def rollback(request: AnonAccesstoken): Request_[js.Object]
  /** Runs a query. */
  def runQuery(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[RunQueryResponse]
  /** Streams batches of document updates and deletes, in order. */
  def write(request: AnonAccesstoken): Request_[WriteResponse]
}

object DocumentsResource {
  @scala.inline
  def apply(
    batchGet: AnonAccesstoken => Request_[BatchGetDocumentsResponse],
    beginTransaction: AnonAccesstoken => Request_[BeginTransactionResponse],
    commit: AnonAccesstoken => Request_[CommitResponse],
    createDocument: AnonAccesstokenAlt => Request_[Document],
    delete: AnonAccesstokenAltBearertoken => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallback => Request_[Document],
    list: AnonAccesstokenAltBearertokenCallbackCollectionId => Request_[ListDocumentsResponse],
    listCollectionIds: AnonAccesstokenAltBearertokenCallbackFields => Request_[ListCollectionIdsResponse],
    listen: AnonAccesstoken => Request_[ListenResponse],
    patch: AnonAccesstokenAltBearertokenCallbackCurrentDocumentexists => Request_[Document],
    rollback: AnonAccesstoken => Request_[js.Object],
    runQuery: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[RunQueryResponse],
    write: AnonAccesstoken => Request_[WriteResponse]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), createDocument = js.Any.fromFunction1(createDocument), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listCollectionIds = js.Any.fromFunction1(listCollectionIds), listen = js.Any.fromFunction1(listen), patch = js.Any.fromFunction1(patch), rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[DocumentsResource]
  }
}

