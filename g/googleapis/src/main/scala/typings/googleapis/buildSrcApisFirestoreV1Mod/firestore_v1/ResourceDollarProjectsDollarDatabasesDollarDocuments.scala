package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firestore/v1", "firestore_v1.Resource$Projects$Databases$Documents")
@js.native
class ResourceDollarProjectsDollarDatabasesDollarDocuments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firestore.projects.databases.documents.batchGet
    * @desc Gets multiple documents.  Documents returned by this method are not
    * guaranteed to be returned in the same order that they were requested.
    * @alias firestore.projects.databases.documents.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().BatchGetDocumentsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[Schema$BatchGetDocumentsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[Schema$BatchGetDocumentsResponse]): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBatchget): GaxiosPromise[Schema$BatchGetDocumentsResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBatchget,
    callback: BodyResponseCallback[Schema$BatchGetDocumentsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBatchget,
    options: BodyResponseCallback[Schema$BatchGetDocumentsResponse],
    callback: BodyResponseCallback[Schema$BatchGetDocumentsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBatchget,
    options: MethodOptions
  ): GaxiosPromise[Schema$BatchGetDocumentsResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchGetDocumentsResponse]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.beginTransaction
    * @desc Starts a new transaction.
    * @alias firestore.projects.databases.documents.beginTransaction
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().BeginTransactionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def beginTransaction(): GaxiosPromise[Schema$BeginTransactionResponse] = js.native
  def beginTransaction(callback: BodyResponseCallback[Schema$BeginTransactionResponse]): Unit = js.native
  def beginTransaction(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBegintransaction): GaxiosPromise[Schema$BeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBegintransaction,
    callback: BodyResponseCallback[Schema$BeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBegintransaction,
    options: BodyResponseCallback[Schema$BeginTransactionResponse],
    callback: BodyResponseCallback[Schema$BeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBegintransaction,
    options: MethodOptions
  ): GaxiosPromise[Schema$BeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarBegintransaction,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BeginTransactionResponse]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.commit
    * @desc Commits a transaction, while optionally updating documents.
    * @alias firestore.projects.databases.documents.commit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().CommitRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def commit(): GaxiosPromise[Schema$CommitResponse] = js.native
  def commit(callback: BodyResponseCallback[Schema$CommitResponse]): Unit = js.native
  def commit(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCommit): GaxiosPromise[Schema$CommitResponse] = js.native
  def commit(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCommit,
    callback: BodyResponseCallback[Schema$CommitResponse]
  ): Unit = js.native
  def commit(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCommit,
    options: BodyResponseCallback[Schema$CommitResponse],
    callback: BodyResponseCallback[Schema$CommitResponse]
  ): Unit = js.native
  def commit(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCommit,
    options: MethodOptions
  ): GaxiosPromise[Schema$CommitResponse] = js.native
  def commit(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommitResponse]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.createDocument
    * @desc Creates a new document.
    * @alias firestore.projects.databases.documents.createDocument
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collectionId The collection ID, relative to `parent`, to list. For example: `chatrooms`.
    * @param {string=} params.documentId The client-assigned document ID to use for this document.  Optional. If not specified, an ID will be assigned by the service.
    * @param {string=} params.mask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {string} params.parent The parent resource. For example: `projects/{project_id}/databases/{database_id}/documents` or `projects/{project_id}/databases/{database_id}/documents/chatrooms/{chatroom_id}`
    * @param {().Document} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createDocument(): GaxiosPromise[Schema$Document] = js.native
  def createDocument(callback: BodyResponseCallback[Schema$Document]): Unit = js.native
  def createDocument(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCreatedocument): GaxiosPromise[Schema$Document] = js.native
  def createDocument(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCreatedocument,
    callback: BodyResponseCallback[Schema$Document]
  ): Unit = js.native
  def createDocument(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCreatedocument,
    options: BodyResponseCallback[Schema$Document],
    callback: BodyResponseCallback[Schema$Document]
  ): Unit = js.native
  def createDocument(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCreatedocument,
    options: MethodOptions
  ): GaxiosPromise[Schema$Document] = js.native
  def createDocument(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarCreatedocument,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Document]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.delete
    * @desc Deletes a document.
    * @alias firestore.projects.databases.documents.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.currentDocument.exists When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
    * @param {string=} params.currentDocument.updateTime When set, the target document must exist and have been last updated at that time.
    * @param {string} params.name The resource name of the Document to delete. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.get
    * @desc Gets a single document.
    * @alias firestore.projects.databases.documents.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.mask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {string} params.name The resource name of the Document to get. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * @param {string=} params.readTime Reads the version of the document at the given time. This may not be older than 60 seconds.
    * @param {string=} params.transaction Reads the document in a transaction.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Document] = js.native
  def get(callback: BodyResponseCallback[Schema$Document]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarGet): GaxiosPromise[Schema$Document] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarGet,
    callback: BodyResponseCallback[Schema$Document]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarGet,
    options: BodyResponseCallback[Schema$Document],
    callback: BodyResponseCallback[Schema$Document]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Document] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Document]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.list
    * @desc Lists documents.
    * @alias firestore.projects.databases.documents.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collectionId The collection ID, relative to `parent`, to list. For example: `chatrooms` or `messages`.
    * @param {string=} params.mask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {string=} params.orderBy The order to sort results by. For example: `priority desc, name`.
    * @param {integer=} params.pageSize The maximum number of documents to return.
    * @param {string=} params.pageToken The `next_page_token` value returned from a previous List request, if any.
    * @param {string} params.parent The parent resource name. In the format: `projects/{project_id}/databases/{database_id}/documents` or `projects/{project_id}/databases/{database_id}/documents/{document_path}`. For example: `projects/my-project/databases/my-database/documents` or `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    * @param {string=} params.readTime Reads documents as they were at the given time. This may not be older than 60 seconds.
    * @param {boolean=} params.showMissing If the list should show missing documents. A missing document is a document that does not exist but has sub-documents. These documents will be returned with a key but will not have fields, Document.create_time, or Document.update_time set.  Requests with `show_missing` may not specify `where` or `order_by`.
    * @param {string=} params.transaction Reads documents in a transaction.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDocumentsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDocumentsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarList): GaxiosPromise[Schema$ListDocumentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarList,
    callback: BodyResponseCallback[Schema$ListDocumentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarList,
    options: BodyResponseCallback[Schema$ListDocumentsResponse],
    callback: BodyResponseCallback[Schema$ListDocumentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDocumentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDocumentsResponse]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.listCollectionIds
    * @desc Lists all the collection IDs underneath a document.
    * @alias firestore.projects.databases.documents.listCollectionIds
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent document. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. For example: `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    * @param {().ListCollectionIdsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listCollectionIds(): GaxiosPromise[Schema$ListCollectionIdsResponse] = js.native
  def listCollectionIds(callback: BodyResponseCallback[Schema$ListCollectionIdsResponse]): Unit = js.native
  def listCollectionIds(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListcollectionids): GaxiosPromise[Schema$ListCollectionIdsResponse] = js.native
  def listCollectionIds(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListcollectionids,
    callback: BodyResponseCallback[Schema$ListCollectionIdsResponse]
  ): Unit = js.native
  def listCollectionIds(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListcollectionids,
    options: BodyResponseCallback[Schema$ListCollectionIdsResponse],
    callback: BodyResponseCallback[Schema$ListCollectionIdsResponse]
  ): Unit = js.native
  def listCollectionIds(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListcollectionids,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListCollectionIdsResponse] = js.native
  def listCollectionIds(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListcollectionids,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListCollectionIdsResponse]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.listen
    * @desc Listens to changes.
    * @alias firestore.projects.databases.documents.listen
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().ListenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listen(): GaxiosPromise[Schema$ListenResponse] = js.native
  def listen(callback: BodyResponseCallback[Schema$ListenResponse]): Unit = js.native
  def listen(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListen): GaxiosPromise[Schema$ListenResponse] = js.native
  def listen(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListen,
    callback: BodyResponseCallback[Schema$ListenResponse]
  ): Unit = js.native
  def listen(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListen,
    options: BodyResponseCallback[Schema$ListenResponse],
    callback: BodyResponseCallback[Schema$ListenResponse]
  ): Unit = js.native
  def listen(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListen,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListenResponse] = js.native
  def listen(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarListen,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListenResponse]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.patch
    * @desc Updates or inserts a document.
    * @alias firestore.projects.databases.documents.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.currentDocument.exists When set to `true`, the target document must exist. When set to `false`, the target document must not exist.
    * @param {string=} params.currentDocument.updateTime When set, the target document must exist and have been last updated at that time.
    * @param {string=} params.mask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {string} params.name The resource name of the document, for example `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * @param {string=} params.updateMask.fieldPaths The list of field paths in the mask. See Document.fields for a field path syntax reference.
    * @param {().Document} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Document] = js.native
  def patch(callback: BodyResponseCallback[Schema$Document]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarPatch): GaxiosPromise[Schema$Document] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarPatch,
    callback: BodyResponseCallback[Schema$Document]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarPatch,
    options: BodyResponseCallback[Schema$Document],
    callback: BodyResponseCallback[Schema$Document]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Document] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Document]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.rollback
    * @desc Rolls back a transaction.
    * @alias firestore.projects.databases.documents.rollback
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`.
    * @param {().RollbackRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rollback(): GaxiosPromise[Schema$Empty] = js.native
  def rollback(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def rollback(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRollback): GaxiosPromise[Schema$Empty] = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRollback,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRollback,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRollback,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.runQuery
    * @desc Runs a query.
    * @alias firestore.projects.databases.documents.runQuery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name. In the format: `projects/{project_id}/databases/{database_id}/documents` or `projects/{project_id}/databases/{database_id}/documents/{document_path}`. For example: `projects/my-project/databases/my-database/documents` or `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    * @param {().RunQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runQuery(): GaxiosPromise[Schema$RunQueryResponse] = js.native
  def runQuery(callback: BodyResponseCallback[Schema$RunQueryResponse]): Unit = js.native
  def runQuery(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRunquery): GaxiosPromise[Schema$RunQueryResponse] = js.native
  def runQuery(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRunquery,
    callback: BodyResponseCallback[Schema$RunQueryResponse]
  ): Unit = js.native
  def runQuery(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRunquery,
    options: BodyResponseCallback[Schema$RunQueryResponse],
    callback: BodyResponseCallback[Schema$RunQueryResponse]
  ): Unit = js.native
  def runQuery(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRunquery,
    options: MethodOptions
  ): GaxiosPromise[Schema$RunQueryResponse] = js.native
  def runQuery(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarRunquery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RunQueryResponse]
  ): Unit = js.native
  /**
    * firestore.projects.databases.documents.write
    * @desc Streams batches of document updates and deletes, in order.
    * @alias firestore.projects.databases.documents.write
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database The database name. In the format: `projects/{project_id}/databases/{database_id}`. This is only required in the first message.
    * @param {().WriteRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def write(): GaxiosPromise[Schema$WriteResponse] = js.native
  def write(callback: BodyResponseCallback[Schema$WriteResponse]): Unit = js.native
  def write(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarWrite): GaxiosPromise[Schema$WriteResponse] = js.native
  def write(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarWrite,
    callback: BodyResponseCallback[Schema$WriteResponse]
  ): Unit = js.native
  def write(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarWrite,
    options: BodyResponseCallback[Schema$WriteResponse],
    callback: BodyResponseCallback[Schema$WriteResponse]
  ): Unit = js.native
  def write(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarWrite,
    options: MethodOptions
  ): GaxiosPromise[Schema$WriteResponse] = js.native
  def write(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarWrite,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WriteResponse]
  ): Unit = js.native
}

