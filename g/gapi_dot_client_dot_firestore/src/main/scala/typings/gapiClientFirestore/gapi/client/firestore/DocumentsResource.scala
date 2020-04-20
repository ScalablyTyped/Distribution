package typings.gapiClientFirestore.gapi.client.firestore

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFirestore.AnonAccesstoken
import typings.gapiClientFirestore.AnonAlt
import typings.gapiClientFirestore.AnonBearertoken
import typings.gapiClientFirestore.AnonCallback
import typings.gapiClientFirestore.AnonCollectionId
import typings.gapiClientFirestore.AnonCurrentDocumentexists
import typings.gapiClientFirestore.AnonFields
import typings.gapiClientFirestore.AnonKey
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
  def createDocument(request: AnonAlt): Request_[Document]
  /** Deletes a document. */
  def delete(request: AnonBearertoken): Request_[js.Object]
  /** Gets a single document. */
  def get(request: AnonCallback): Request_[Document]
  /** Lists documents. */
  def list(request: AnonCollectionId): Request_[ListDocumentsResponse]
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: AnonFields): Request_[ListCollectionIdsResponse]
  /** Listens to changes. */
  def listen(request: AnonAccesstoken): Request_[ListenResponse]
  /** Updates or inserts a document. */
  def patch(request: AnonCurrentDocumentexists): Request_[Document]
  /** Rolls back a transaction. */
  def rollback(request: AnonAccesstoken): Request_[js.Object]
  /** Runs a query. */
  def runQuery(request: AnonKey): Request_[RunQueryResponse]
  /** Streams batches of document updates and deletes, in order. */
  def write(request: AnonAccesstoken): Request_[WriteResponse]
}

object DocumentsResource {
  @scala.inline
  def apply(
    batchGet: AnonAccesstoken => Request_[BatchGetDocumentsResponse],
    beginTransaction: AnonAccesstoken => Request_[BeginTransactionResponse],
    commit: AnonAccesstoken => Request_[CommitResponse],
    createDocument: AnonAlt => Request_[Document],
    delete: AnonBearertoken => Request_[js.Object],
    get: AnonCallback => Request_[Document],
    list: AnonCollectionId => Request_[ListDocumentsResponse],
    listCollectionIds: AnonFields => Request_[ListCollectionIdsResponse],
    listen: AnonAccesstoken => Request_[ListenResponse],
    patch: AnonCurrentDocumentexists => Request_[Document],
    rollback: AnonAccesstoken => Request_[js.Object],
    runQuery: AnonKey => Request_[RunQueryResponse],
    write: AnonAccesstoken => Request_[WriteResponse]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), createDocument = js.Any.fromFunction1(createDocument), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listCollectionIds = js.Any.fromFunction1(listCollectionIds), listen = js.Any.fromFunction1(listen), patch = js.Any.fromFunction1(patch), rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DocumentsResource]
  }
}

