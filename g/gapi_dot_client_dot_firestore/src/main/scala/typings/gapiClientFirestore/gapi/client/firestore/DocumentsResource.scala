package typings.gapiClientFirestore.gapi.client.firestore

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFirestore.anon.Accesstoken
import typings.gapiClientFirestore.anon.Alt
import typings.gapiClientFirestore.anon.Bearertoken
import typings.gapiClientFirestore.anon.Callback
import typings.gapiClientFirestore.anon.CollectionId
import typings.gapiClientFirestore.anon.CurrentDocumentexists
import typings.gapiClientFirestore.anon.Fields
import typings.gapiClientFirestore.anon.Key
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
  def batchGet(request: Accesstoken): Request[BatchGetDocumentsResponse]
  /** Starts a new transaction. */
  def beginTransaction(request: Accesstoken): Request[BeginTransactionResponse]
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: Accesstoken): Request[CommitResponse]
  /** Creates a new document. */
  def createDocument(request: Alt): Request[Document]
  /** Deletes a document. */
  def delete(request: Bearertoken): Request[js.Object]
  /** Gets a single document. */
  def get(request: Callback): Request[Document]
  /** Lists documents. */
  def list(request: CollectionId): Request[ListDocumentsResponse]
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: Fields): Request[ListCollectionIdsResponse]
  /** Listens to changes. */
  def listen(request: Accesstoken): Request[ListenResponse]
  /** Updates or inserts a document. */
  def patch(request: CurrentDocumentexists): Request[Document]
  /** Rolls back a transaction. */
  def rollback(request: Accesstoken): Request[js.Object]
  /** Runs a query. */
  def runQuery(request: Key): Request[RunQueryResponse]
  /** Streams batches of document updates and deletes, in order. */
  def write(request: Accesstoken): Request[WriteResponse]
}

object DocumentsResource {
  @scala.inline
  def apply(
    batchGet: Accesstoken => Request[BatchGetDocumentsResponse],
    beginTransaction: Accesstoken => Request[BeginTransactionResponse],
    commit: Accesstoken => Request[CommitResponse],
    createDocument: Alt => Request[Document],
    delete: Bearertoken => Request[js.Object],
    get: Callback => Request[Document],
    list: CollectionId => Request[ListDocumentsResponse],
    listCollectionIds: Fields => Request[ListCollectionIdsResponse],
    listen: Accesstoken => Request[ListenResponse],
    patch: CurrentDocumentexists => Request[Document],
    rollback: Accesstoken => Request[js.Object],
    runQuery: Key => Request[RunQueryResponse],
    write: Accesstoken => Request[WriteResponse]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), createDocument = js.Any.fromFunction1(createDocument), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listCollectionIds = js.Any.fromFunction1(listCollectionIds), listen = js.Any.fromFunction1(listen), patch = js.Any.fromFunction1(patch), rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DocumentsResource]
  }
}

