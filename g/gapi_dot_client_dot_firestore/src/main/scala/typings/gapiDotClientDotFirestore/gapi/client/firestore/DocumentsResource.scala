package typings.gapiDotClientDotFirestore.gapi.client.firestore

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFirestore.Anon_Accesstoken
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAlt
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAltBearertokenCallbackCollectionId
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAltBearertokenCallbackCurrentDocumentexists
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotFirestore.Anon_AccesstokenAltBearertokenCallbackFieldsKey
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
  def batchGet(request: Anon_Accesstoken): Request[BatchGetDocumentsResponse]
  /** Starts a new transaction. */
  def beginTransaction(request: Anon_Accesstoken): Request[BeginTransactionResponse]
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: Anon_Accesstoken): Request[CommitResponse]
  /** Creates a new document. */
  def createDocument(request: Anon_AccesstokenAlt): Request[Document]
  /** Deletes a document. */
  def delete(request: Anon_AccesstokenAltBearertoken): Request[js.Object]
  /** Gets a single document. */
  def get(request: Anon_AccesstokenAltBearertokenCallback): Request[Document]
  /** Lists documents. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackCollectionId): Request[ListDocumentsResponse]
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListCollectionIdsResponse]
  /** Listens to changes. */
  def listen(request: Anon_Accesstoken): Request[ListenResponse]
  /** Updates or inserts a document. */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackCurrentDocumentexists): Request[Document]
  /** Rolls back a transaction. */
  def rollback(request: Anon_Accesstoken): Request[js.Object]
  /** Runs a query. */
  def runQuery(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[RunQueryResponse]
  /** Streams batches of document updates and deletes, in order. */
  def write(request: Anon_Accesstoken): Request[WriteResponse]
}

object DocumentsResource {
  @scala.inline
  def apply(
    batchGet: Anon_Accesstoken => Request[BatchGetDocumentsResponse],
    beginTransaction: Anon_Accesstoken => Request[BeginTransactionResponse],
    commit: Anon_Accesstoken => Request[CommitResponse],
    createDocument: Anon_AccesstokenAlt => Request[Document],
    delete: Anon_AccesstokenAltBearertoken => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallback => Request[Document],
    list: Anon_AccesstokenAltBearertokenCallbackCollectionId => Request[ListDocumentsResponse],
    listCollectionIds: Anon_AccesstokenAltBearertokenCallbackFields => Request[ListCollectionIdsResponse],
    listen: Anon_Accesstoken => Request[ListenResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackCurrentDocumentexists => Request[Document],
    rollback: Anon_Accesstoken => Request[js.Object],
    runQuery: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[RunQueryResponse],
    write: Anon_Accesstoken => Request[WriteResponse]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), createDocument = js.Any.fromFunction1(createDocument), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listCollectionIds = js.Any.fromFunction1(listCollectionIds), listen = js.Any.fromFunction1(listen), patch = js.Any.fromFunction1(patch), rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[DocumentsResource]
  }
}

