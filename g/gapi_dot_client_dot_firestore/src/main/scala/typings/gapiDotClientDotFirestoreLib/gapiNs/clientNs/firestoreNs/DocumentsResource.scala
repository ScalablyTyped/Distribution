package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

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
  def batchGet(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchGetDocumentsResponse]
  /** Starts a new transaction. */
  def beginTransaction(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BeginTransactionResponse]
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[CommitResponse]
  /** Creates a new document. */
  def createDocument(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Document]
  /** Deletes a document. */
  def delete(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a single document. */
  def get(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Document]
  /** Lists documents. */
  def list(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackCollectionId): gapiDotClientLib.gapiNs.clientNs.Request[ListDocumentsResponse]
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ListCollectionIdsResponse]
  /** Listens to changes. */
  def listen(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListenResponse]
  /** Updates or inserts a document. */
  def patch(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackCurrentDocumentexists): gapiDotClientLib.gapiNs.clientNs.Request[Document]
  /** Rolls back a transaction. */
  def rollback(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Runs a query. */
  def runQuery(request: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[RunQueryResponse]
  /** Streams batches of document updates and deletes, in order. */
  def write(request: gapiDotClientDotFirestoreLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[WriteResponse]
}

object DocumentsResource {
  @scala.inline
  def apply(
    batchGet: gapiDotClientDotFirestoreLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[BatchGetDocumentsResponse],
    beginTransaction: gapiDotClientDotFirestoreLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[BeginTransactionResponse],
    commit: gapiDotClientDotFirestoreLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[CommitResponse],
    createDocument: gapiDotClientDotFirestoreLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Document],
    delete: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[Document],
    list: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackCollectionId => gapiDotClientLib.gapiNs.clientNs.Request[ListDocumentsResponse],
    listCollectionIds: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[ListCollectionIdsResponse],
    listen: gapiDotClientDotFirestoreLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[ListenResponse],
    patch: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackCurrentDocumentexists => gapiDotClientLib.gapiNs.clientNs.Request[Document],
    rollback: gapiDotClientDotFirestoreLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    runQuery: gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[RunQueryResponse],
    write: gapiDotClientDotFirestoreLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[WriteResponse]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), createDocument = js.Any.fromFunction1(createDocument), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listCollectionIds = js.Any.fromFunction1(listCollectionIds), listen = js.Any.fromFunction1(listen), patch = js.Any.fromFunction1(patch), rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[DocumentsResource]
  }
}

