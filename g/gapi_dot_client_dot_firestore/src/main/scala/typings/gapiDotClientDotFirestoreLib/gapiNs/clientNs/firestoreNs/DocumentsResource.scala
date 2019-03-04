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
    batchGet: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BatchGetDocumentsResponse]
    ],
    beginTransaction: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[BeginTransactionResponse]
    ],
    commit: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CommitResponse]
    ],
    createDocument: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Document]
    ],
    delete: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[Document]
    ],
    list: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackCollectionId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListDocumentsResponse]
    ],
    listCollectionIds: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListCollectionIdsResponse]
    ],
    listen: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListenResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackCurrentDocumentexists, 
      gapiDotClientLib.gapiNs.clientNs.Request[Document]
    ],
    rollback: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    runQuery: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[RunQueryResponse]
    ],
    write: js.Function1[
      gapiDotClientDotFirestoreLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[WriteResponse]
    ]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(batchGet = batchGet, beginTransaction = beginTransaction, commit = commit, createDocument = createDocument, delete = delete, get = get, list = list, listCollectionIds = listCollectionIds, listen = listen, patch = patch, rollback = rollback, runQuery = runQuery, write = write)
  
    __obj.asInstanceOf[DocumentsResource]
  }
}

