package typings.googleCloudFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IBatchGetDocumentsRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IBatchWriteRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IBatchWriteResponse
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IBeginTransactionRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IBeginTransactionResponse
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.ICommitRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.ICommitResponse
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.ICreateDocumentRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.ICursor
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IDeleteDocumentRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IDocument
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IGetDocumentRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IListCollectionIdsRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IListCollectionIdsResponse
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IListDocumentsRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IListDocumentsResponse
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IPartitionQueryRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IPartitionQueryResponse
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IRollbackRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IRunQueryRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.IUpdateDocumentRequest
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.IEmpty
import typings.googleGax.apitypesMod.CancellableStream
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.clientInterfaceMod.Descriptors
import typings.googleGax.clientInterfaceMod.PaginationCallback
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.mod.GoogleAuth
import typings.node.streamMod.Transform
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1FirestoreClientMod {
  
  @JSImport("@google-cloud/firestore/types/v1/firestore_client", "FirestoreClient")
  @js.native
  /**
    * Construct an instance of FirestoreClient.
    *
    * @param {object} [options] - The configuration object.
    * The options accepted by the constructor are described in detail
    * in [this document](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#creating-the-client-instance).
    * The common options are:
    * @param {object} [options.credentials] - Credentials object.
    * @param {string} [options.credentials.client_email]
    * @param {string} [options.credentials.private_key]
    * @param {string} [options.email] - Account email address. Required when
    *     using a .pem or .p12 keyFilename.
    * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
    *     .p12 key downloaded from the Google Developers Console. If you provide
    *     a path to a JSON file, the projectId option below is not necessary.
    *     NOTE: .pem and .p12 require you to specify options.email as well.
    * @param {number} [options.port] - The port on which to connect to
    *     the remote host.
    * @param {string} [options.projectId] - The project ID from the Google
    *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
    *     the environment variable GCLOUD_PROJECT for your project ID. If your
    *     app is running in an environment which supports
    *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
    *     your project ID will be detected automatically.
    * @param {string} [options.apiEndpoint] - The domain name of the
    *     API remote host.
    * @param {gax.ClientConfig} [options.clientConfig] - Client configuration override.
    *     Follows the structure of {@link gapicConfig}.
    * @param {boolean} [options.fallback] - Use HTTP fallback mode.
    *     In fallback mode, a special browser-compatible transport implementation is used
    *     instead of gRPC transport. In browser context (if the `window` object is defined)
    *     the fallback mode is enabled automatically; set `options.fallback` to `false`
    *     if you need to override this behavior.
    */
  open class FirestoreClient () extends StObject {
    def this(opts: ClientOptions) = this()
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _gaxGrpc: Any = js.native
    
    /* private */ var _gaxModule: Any = js.native
    
    /* private */ var _opts: Any = js.native
    
    /* private */ var _protos: Any = js.native
    
    /* private */ var _providedCustomServicePath: Any = js.native
    
    /* private */ var _terminated: Any = js.native
    
    var auth: GoogleAuth[JSONClient] = js.native
    
    /**
      * Gets multiple documents.
      *
      * Documents returned by this method are not guaranteed to be returned in the
      * same order that they were requested.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database name. In the format:
      *   `projects/{project_id}/databases/{database_id}`.
      * @param {string[]} request.documents
      *   The names of the documents to retrieve. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      *   The request will fail if any of the document is not a child resource of the
      *   given `database`. Duplicate names will be elided.
      * @param {google.firestore.v1.DocumentMask} request.mask
      *   The fields to return. If not set, returns all fields.
      *
      *   If a document has a field that is not present in this mask, that field will
      *   not be returned in the response.
      * @param {Buffer} request.transaction
      *   Reads documents in a transaction.
      * @param {google.firestore.v1.TransactionOptions} request.newTransaction
      *   Starts a new transaction and reads the documents.
      *   Defaults to a read-only transaction.
      *   The new transaction ID will be returned as the first response in the
      *   stream.
      * @param {google.protobuf.Timestamp} request.readTime
      *   Reads documents as they were at the given time.
      *   This may not be older than 270 seconds.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits [BatchGetDocumentsResponse]{@link google.firestore.v1.BatchGetDocumentsResponse} on 'data' event.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#server-streaming)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.batch_get_documents.js</caption>
      * region_tag:firestore_v1_generated_Firestore_BatchGetDocuments_async
      */
    def batchGetDocuments(): CancellableStream = js.native
    def batchGetDocuments(request: Unit, options: CallOptions): CancellableStream = js.native
    def batchGetDocuments(request: IBatchGetDocumentsRequest): CancellableStream = js.native
    def batchGetDocuments(request: IBatchGetDocumentsRequest, options: CallOptions): CancellableStream = js.native
    
    /**
      * Applies a batch of write operations.
      *
      * The BatchWrite method does not apply the write operations atomically
      * and can apply them out of order. Method does not allow more than one write
      * per document. Each write succeeds or fails independently. See the
      * {@link google.firestore.v1.BatchWriteResponse|BatchWriteResponse} for the success status of each write.
      *
      * If you require an atomically applied set of writes, use
      * {@link google.firestore.v1.Firestore.Commit|Commit} instead.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database name. In the format:
      *   `projects/{project_id}/databases/{database_id}`.
      * @param {number[]} request.writes
      *   The writes to apply.
      *
      *   Method does not apply writes atomically and does not guarantee ordering.
      *   Each write succeeds or fails independently. You cannot write to the same
      *   document more than once per request.
      * @param {number[]} request.labels
      *   Labels associated with this batch write.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [BatchWriteResponse]{@link google.firestore.v1.BatchWriteResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.batch_write.js</caption>
      * region_tag:firestore_v1_generated_Firestore_BatchWrite_async
      */
    def batchWrite(): js.Promise[
        js.Tuple3[IBatchWriteResponse, js.UndefOr[IBatchWriteRequest], js.UndefOr[js.Object]]
      ] = js.native
    def batchWrite(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IBatchWriteResponse, js.UndefOr[IBatchWriteRequest], js.UndefOr[js.Object]]
      ] = js.native
    def batchWrite(request: IBatchWriteRequest): js.Promise[
        js.Tuple3[IBatchWriteResponse, js.UndefOr[IBatchWriteRequest], js.UndefOr[js.Object]]
      ] = js.native
    def batchWrite(
      request: IBatchWriteRequest,
      callback: Callback[
          IBatchWriteResponse, 
          js.UndefOr[IBatchWriteRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def batchWrite(request: IBatchWriteRequest, options: CallOptions): js.Promise[
        js.Tuple3[IBatchWriteResponse, js.UndefOr[IBatchWriteRequest], js.UndefOr[js.Object]]
      ] = js.native
    def batchWrite(
      request: IBatchWriteRequest,
      options: CallOptions,
      callback: Callback[
          IBatchWriteResponse, 
          js.UndefOr[IBatchWriteRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Starts a new transaction.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database name. In the format:
      *   `projects/{project_id}/databases/{database_id}`.
      * @param {google.firestore.v1.TransactionOptions} request.options
      *   The options for the transaction.
      *   Defaults to a read-write transaction.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [BeginTransactionResponse]{@link google.firestore.v1.BeginTransactionResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.begin_transaction.js</caption>
      * region_tag:firestore_v1_generated_Firestore_BeginTransaction_async
      */
    def beginTransaction(): js.Promise[
        js.Tuple3[
          IBeginTransactionResponse, 
          js.UndefOr[IBeginTransactionRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def beginTransaction(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          IBeginTransactionResponse, 
          js.UndefOr[IBeginTransactionRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def beginTransaction(request: IBeginTransactionRequest): js.Promise[
        js.Tuple3[
          IBeginTransactionResponse, 
          js.UndefOr[IBeginTransactionRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def beginTransaction(
      request: IBeginTransactionRequest,
      callback: Callback[
          IBeginTransactionResponse, 
          js.UndefOr[IBeginTransactionRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def beginTransaction(request: IBeginTransactionRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          IBeginTransactionResponse, 
          js.UndefOr[IBeginTransactionRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def beginTransaction(
      request: IBeginTransactionRequest,
      options: CallOptions,
      callback: Callback[
          IBeginTransactionResponse, 
          js.UndefOr[IBeginTransactionRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Commits a transaction, while optionally updating documents.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database name. In the format:
      *   `projects/{project_id}/databases/{database_id}`.
      * @param {number[]} request.writes
      *   The writes to apply.
      *
      *   Always executed atomically and in order.
      * @param {Buffer} request.transaction
      *   If set, applies all writes in this transaction, and commits it.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [CommitResponse]{@link google.firestore.v1.CommitResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.commit.js</caption>
      * region_tag:firestore_v1_generated_Firestore_Commit_async
      */
    def commit(): js.Promise[js.Tuple3[ICommitResponse, js.UndefOr[ICommitRequest], js.UndefOr[js.Object]]] = js.native
    def commit(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ICommitResponse, js.UndefOr[ICommitRequest], js.UndefOr[js.Object]]] = js.native
    def commit(request: ICommitRequest): js.Promise[js.Tuple3[ICommitResponse, js.UndefOr[ICommitRequest], js.UndefOr[js.Object]]] = js.native
    def commit(
      request: ICommitRequest,
      callback: Callback[ICommitResponse, js.UndefOr[ICommitRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def commit(request: ICommitRequest, options: CallOptions): js.Promise[js.Tuple3[ICommitResponse, js.UndefOr[ICommitRequest], js.UndefOr[js.Object]]] = js.native
    def commit(
      request: ICommitRequest,
      options: CallOptions,
      callback: Callback[ICommitResponse, js.UndefOr[ICommitRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Creates a new document.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent resource. For example:
      *   `projects/{project_id}/databases/{database_id}/documents` or
      *   `projects/{project_id}/databases/{database_id}/documents/chatrooms/{chatroom_id}`
      * @param {string} request.collectionId
      *   Required. The collection ID, relative to `parent`, to list. For example: `chatrooms`.
      * @param {string} request.documentId
      *   The client-assigned document ID to use for this document.
      *
      *   Optional. If not specified, an ID will be assigned by the service.
      * @param {google.firestore.v1.Document} request.document
      *   Required. The document to create. `name` must not be set.
      * @param {google.firestore.v1.DocumentMask} request.mask
      *   The fields to return. If not set, returns all fields.
      *
      *   If the document has a field that is not present in this mask, that field
      *   will not be returned in the response.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Document]{@link google.firestore.v1.Document}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.create_document.js</caption>
      * region_tag:firestore_v1_generated_Firestore_CreateDocument_async
      */
    def createDocument(): js.Promise[js.Tuple3[IDocument, js.UndefOr[ICreateDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def createDocument(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IDocument, js.UndefOr[ICreateDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def createDocument(request: ICreateDocumentRequest): js.Promise[js.Tuple3[IDocument, js.UndefOr[ICreateDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def createDocument(
      request: ICreateDocumentRequest,
      callback: Callback[IDocument, js.UndefOr[ICreateDocumentRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def createDocument(request: ICreateDocumentRequest, options: CallOptions): js.Promise[js.Tuple3[IDocument, js.UndefOr[ICreateDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def createDocument(
      request: ICreateDocumentRequest,
      options: CallOptions,
      callback: Callback[IDocument, js.UndefOr[ICreateDocumentRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Deletes a document.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The resource name of the Document to delete. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      * @param {google.firestore.v1.Precondition} request.currentDocument
      *   An optional precondition on the document.
      *   The request will fail if this is set and not met by the target document.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.delete_document.js</caption>
      * region_tag:firestore_v1_generated_Firestore_DeleteDocument_async
      */
    def deleteDocument(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def deleteDocument(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def deleteDocument(request: IDeleteDocumentRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def deleteDocument(
      request: IDeleteDocumentRequest,
      callback: Callback[IEmpty, js.UndefOr[IDeleteDocumentRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def deleteDocument(request: IDeleteDocumentRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def deleteDocument(
      request: IDeleteDocumentRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDeleteDocumentRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var descriptors: Descriptors = js.native
    
    var firestoreStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    /**
      * Gets a single document.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The resource name of the Document to get. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      * @param {google.firestore.v1.DocumentMask} request.mask
      *   The fields to return. If not set, returns all fields.
      *
      *   If the document has a field that is not present in this mask, that field
      *   will not be returned in the response.
      * @param {Buffer} request.transaction
      *   Reads the document in a transaction.
      * @param {google.protobuf.Timestamp} request.readTime
      *   Reads the version of the document at the given time.
      *   This may not be older than 270 seconds.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Document]{@link google.firestore.v1.Document}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.get_document.js</caption>
      * region_tag:firestore_v1_generated_Firestore_GetDocument_async
      */
    def getDocument(): js.Promise[js.Tuple3[IDocument, js.UndefOr[IGetDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def getDocument(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IDocument, js.UndefOr[IGetDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def getDocument(request: IGetDocumentRequest): js.Promise[js.Tuple3[IDocument, js.UndefOr[IGetDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def getDocument(
      request: IGetDocumentRequest,
      callback: Callback[IDocument, js.UndefOr[IGetDocumentRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getDocument(request: IGetDocumentRequest, options: CallOptions): js.Promise[js.Tuple3[IDocument, js.UndefOr[IGetDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def getDocument(
      request: IGetDocumentRequest,
      options: CallOptions,
      callback: Callback[IDocument, js.UndefOr[IGetDocumentRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: Callback[String, Unit, Unit]): Unit = js.native
    
    /**
      * Initialize the client.
      * Performs asynchronous operations (such as authentication) and prepares the client.
      * This function will be called automatically when any class method is called for the
      * first time, but if you need to initialize it before calling an actual method,
      * feel free to call initialize() directly.
      *
      * You can await on this method if you want to make sure the client is initialized.
      *
      * @returns {Promise} A promise that resolves to an authenticated service stub.
      */
    def initialize(): js.Promise[StringDictionary[js.Function]] = js.native
    
    var innerApiCalls: StringDictionary[js.Function] = js.native
    
    /**
      * Lists all the collection IDs underneath a document.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent document. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      *   For example:
      *   `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
      * @param {number} request.pageSize
      *   The maximum number of results to return.
      * @param {string} request.pageToken
      *   A page token. Must be a value from
      *   {@link google.firestore.v1.ListCollectionIdsResponse|ListCollectionIdsResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of string.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listCollectionIdsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listCollectionIds(): js.Promise[
        js.Tuple3[js.Array[String], IListCollectionIdsRequest | Null, IListCollectionIdsResponse]
      ] = js.native
    def listCollectionIds(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[String], IListCollectionIdsRequest | Null, IListCollectionIdsResponse]
      ] = js.native
    def listCollectionIds(request: IListCollectionIdsRequest): js.Promise[
        js.Tuple3[js.Array[String], IListCollectionIdsRequest | Null, IListCollectionIdsResponse]
      ] = js.native
    def listCollectionIds(
      request: IListCollectionIdsRequest,
      callback: PaginationCallback[IListCollectionIdsRequest, js.UndefOr[IListCollectionIdsResponse | Null], String]
    ): Unit = js.native
    def listCollectionIds(request: IListCollectionIdsRequest, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[String], IListCollectionIdsRequest | Null, IListCollectionIdsResponse]
      ] = js.native
    def listCollectionIds(
      request: IListCollectionIdsRequest,
      options: CallOptions,
      callback: PaginationCallback[IListCollectionIdsRequest, js.UndefOr[IListCollectionIdsResponse | Null], String]
    ): Unit = js.native
    
    /**
      * Equivalent to `listCollectionIds`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent document. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      *   For example:
      *   `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
      * @param {number} request.pageSize
      *   The maximum number of results to return.
      * @param {string} request.pageToken
      *   A page token. Must be a value from
      *   {@link google.firestore.v1.ListCollectionIdsResponse|ListCollectionIdsResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   string. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.list_collection_ids.js</caption>
      * region_tag:firestore_v1_generated_Firestore_ListCollectionIds_async
      */
    def listCollectionIdsAsync(): AsyncIterable[String] = js.native
    def listCollectionIdsAsync(request: Unit, options: CallOptions): AsyncIterable[String] = js.native
    def listCollectionIdsAsync(request: IListCollectionIdsRequest): AsyncIterable[String] = js.native
    def listCollectionIdsAsync(request: IListCollectionIdsRequest, options: CallOptions): AsyncIterable[String] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent document. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      *   For example:
      *   `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
      * @param {number} request.pageSize
      *   The maximum number of results to return.
      * @param {string} request.pageToken
      *   A page token. Must be a value from
      *   {@link google.firestore.v1.ListCollectionIdsResponse|ListCollectionIdsResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing string on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listCollectionIdsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listCollectionIdsStream(): Transform = js.native
    def listCollectionIdsStream(request: Unit, options: CallOptions): Transform = js.native
    def listCollectionIdsStream(request: IListCollectionIdsRequest): Transform = js.native
    def listCollectionIdsStream(request: IListCollectionIdsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists documents.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent resource name. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents` or
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      *   For example:
      *   `projects/my-project/databases/my-database/documents` or
      *   `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
      * @param {string} request.collectionId
      *   Required. The collection ID, relative to `parent`, to list. For example: `chatrooms`
      *   or `messages`.
      * @param {number} request.pageSize
      *   The maximum number of documents to return.
      * @param {string} request.pageToken
      *   The `next_page_token` value returned from a previous List request, if any.
      * @param {string} request.orderBy
      *   The order to sort results by. For example: `priority desc, name`.
      * @param {google.firestore.v1.DocumentMask} request.mask
      *   The fields to return. If not set, returns all fields.
      *
      *   If a document has a field that is not present in this mask, that field
      *   will not be returned in the response.
      * @param {Buffer} request.transaction
      *   Reads documents in a transaction.
      * @param {google.protobuf.Timestamp} request.readTime
      *   Reads documents as they were at the given time.
      *   This may not be older than 270 seconds.
      * @param {boolean} request.showMissing
      *   If the list should show missing documents. A missing document is a
      *   document that does not exist but has sub-documents. These documents will
      *   be returned with a key but will not have fields, {@link google.firestore.v1.Document.create_time|Document.create_time},
      *   or {@link google.firestore.v1.Document.update_time|Document.update_time} set.
      *
      *   Requests with `show_missing` may not specify `where` or
      *   `order_by`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Document]{@link google.firestore.v1.Document}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listDocumentsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listDocuments(): js.Promise[
        js.Tuple3[js.Array[IDocument], IListDocumentsRequest | Null, IListDocumentsResponse]
      ] = js.native
    def listDocuments(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[IDocument], IListDocumentsRequest | Null, IListDocumentsResponse]
      ] = js.native
    def listDocuments(request: IListDocumentsRequest): js.Promise[
        js.Tuple3[js.Array[IDocument], IListDocumentsRequest | Null, IListDocumentsResponse]
      ] = js.native
    def listDocuments(
      request: IListDocumentsRequest,
      callback: PaginationCallback[IListDocumentsRequest, js.UndefOr[IListDocumentsResponse | Null], IDocument]
    ): Unit = js.native
    def listDocuments(request: IListDocumentsRequest, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[IDocument], IListDocumentsRequest | Null, IListDocumentsResponse]
      ] = js.native
    def listDocuments(
      request: IListDocumentsRequest,
      options: CallOptions,
      callback: PaginationCallback[IListDocumentsRequest, js.UndefOr[IListDocumentsResponse | Null], IDocument]
    ): Unit = js.native
    
    /**
      * Equivalent to `listDocuments`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent resource name. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents` or
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      *   For example:
      *   `projects/my-project/databases/my-database/documents` or
      *   `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
      * @param {string} request.collectionId
      *   Required. The collection ID, relative to `parent`, to list. For example: `chatrooms`
      *   or `messages`.
      * @param {number} request.pageSize
      *   The maximum number of documents to return.
      * @param {string} request.pageToken
      *   The `next_page_token` value returned from a previous List request, if any.
      * @param {string} request.orderBy
      *   The order to sort results by. For example: `priority desc, name`.
      * @param {google.firestore.v1.DocumentMask} request.mask
      *   The fields to return. If not set, returns all fields.
      *
      *   If a document has a field that is not present in this mask, that field
      *   will not be returned in the response.
      * @param {Buffer} request.transaction
      *   Reads documents in a transaction.
      * @param {google.protobuf.Timestamp} request.readTime
      *   Reads documents as they were at the given time.
      *   This may not be older than 270 seconds.
      * @param {boolean} request.showMissing
      *   If the list should show missing documents. A missing document is a
      *   document that does not exist but has sub-documents. These documents will
      *   be returned with a key but will not have fields, {@link google.firestore.v1.Document.create_time|Document.create_time},
      *   or {@link google.firestore.v1.Document.update_time|Document.update_time} set.
      *
      *   Requests with `show_missing` may not specify `where` or
      *   `order_by`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Document]{@link google.firestore.v1.Document}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.list_documents.js</caption>
      * region_tag:firestore_v1_generated_Firestore_ListDocuments_async
      */
    def listDocumentsAsync(): AsyncIterable[IDocument] = js.native
    def listDocumentsAsync(request: Unit, options: CallOptions): AsyncIterable[IDocument] = js.native
    def listDocumentsAsync(request: IListDocumentsRequest): AsyncIterable[IDocument] = js.native
    def listDocumentsAsync(request: IListDocumentsRequest, options: CallOptions): AsyncIterable[IDocument] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent resource name. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents` or
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      *   For example:
      *   `projects/my-project/databases/my-database/documents` or
      *   `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
      * @param {string} request.collectionId
      *   Required. The collection ID, relative to `parent`, to list. For example: `chatrooms`
      *   or `messages`.
      * @param {number} request.pageSize
      *   The maximum number of documents to return.
      * @param {string} request.pageToken
      *   The `next_page_token` value returned from a previous List request, if any.
      * @param {string} request.orderBy
      *   The order to sort results by. For example: `priority desc, name`.
      * @param {google.firestore.v1.DocumentMask} request.mask
      *   The fields to return. If not set, returns all fields.
      *
      *   If a document has a field that is not present in this mask, that field
      *   will not be returned in the response.
      * @param {Buffer} request.transaction
      *   Reads documents in a transaction.
      * @param {google.protobuf.Timestamp} request.readTime
      *   Reads documents as they were at the given time.
      *   This may not be older than 270 seconds.
      * @param {boolean} request.showMissing
      *   If the list should show missing documents. A missing document is a
      *   document that does not exist but has sub-documents. These documents will
      *   be returned with a key but will not have fields, {@link google.firestore.v1.Document.create_time|Document.create_time},
      *   or {@link google.firestore.v1.Document.update_time|Document.update_time} set.
      *
      *   Requests with `show_missing` may not specify `where` or
      *   `order_by`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Document]{@link google.firestore.v1.Document} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listDocumentsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listDocumentsStream(): Transform = js.native
    def listDocumentsStream(request: Unit, options: CallOptions): Transform = js.native
    def listDocumentsStream(request: IListDocumentsRequest): Transform = js.native
    def listDocumentsStream(request: IListDocumentsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Listens to changes.
      *
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which is both readable and writable. It accepts objects
      *   representing [ListenRequest]{@link google.firestore.v1.ListenRequest} for write() method, and
      *   will emit objects representing [ListenResponse]{@link google.firestore.v1.ListenResponse} on 'data' event asynchronously.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#bi-directional-streaming)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.listen.js</caption>
      * region_tag:firestore_v1_generated_Firestore_Listen_async
      */
    def listen(): CancellableStream = js.native
    def listen(options: CallOptions): CancellableStream = js.native
    
    /**
      * Partitions a query by returning partition cursors that can be used to run
      * the query in parallel. The returned partition cursors are split points that
      * can be used by RunQuery as starting/end points for the query results.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent resource name. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents`.
      *   Document resource names are not supported; only database resource names
      *   can be specified.
      * @param {google.firestore.v1.StructuredQuery} request.structuredQuery
      *   A structured query.
      *   Query must specify collection with all descendants and be ordered by name
      *   ascending. Other filters, order bys, limits, offsets, and start/end
      *   cursors are not supported.
      * @param {number} request.partitionCount
      *   The desired maximum number of partition points.
      *   The partitions may be returned across multiple pages of results.
      *   The number must be positive. The actual number of partitions
      *   returned may be fewer.
      *
      *   For example, this may be set to one fewer than the number of parallel
      *   queries to be run, or in running a data pipeline job, one fewer than the
      *   number of workers or compute instances available.
      * @param {string} request.pageToken
      *   The `next_page_token` value returned from a previous call to
      *   PartitionQuery that may be used to get an additional set of results.
      *   There are no ordering guarantees between sets of results. Thus, using
      *   multiple sets of results will require merging the different result sets.
      *
      *   For example, two subsequent calls using a page_token may return:
      *
      *    * cursor B, cursor M, cursor Q
      *    * cursor A, cursor U, cursor W
      *
      *   To obtain a complete result set ordered with respect to the results of the
      *   query supplied to PartitionQuery, the results sets should be merged:
      *   cursor A, cursor B, cursor M, cursor Q, cursor U, cursor W
      * @param {number} request.pageSize
      *   The maximum number of partitions to return in this call, subject to
      *   `partition_count`.
      *
      *   For example, if `partition_count` = 10 and `page_size` = 8, the first call
      *   to PartitionQuery will return up to 8 partitions and a `next_page_token`
      *   if more results exist. A second call to PartitionQuery will return up to
      *   2 partitions, to complete the total of 10 specified in `partition_count`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Cursor]{@link google.firestore.v1.Cursor}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `partitionQueryAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def partitionQuery(): js.Promise[
        js.Tuple3[js.Array[ICursor], IPartitionQueryRequest | Null, IPartitionQueryResponse]
      ] = js.native
    def partitionQuery(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[ICursor], IPartitionQueryRequest | Null, IPartitionQueryResponse]
      ] = js.native
    def partitionQuery(request: IPartitionQueryRequest): js.Promise[
        js.Tuple3[js.Array[ICursor], IPartitionQueryRequest | Null, IPartitionQueryResponse]
      ] = js.native
    def partitionQuery(
      request: IPartitionQueryRequest,
      callback: PaginationCallback[IPartitionQueryRequest, js.UndefOr[IPartitionQueryResponse | Null], ICursor]
    ): Unit = js.native
    def partitionQuery(request: IPartitionQueryRequest, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[ICursor], IPartitionQueryRequest | Null, IPartitionQueryResponse]
      ] = js.native
    def partitionQuery(
      request: IPartitionQueryRequest,
      options: CallOptions,
      callback: PaginationCallback[IPartitionQueryRequest, js.UndefOr[IPartitionQueryResponse | Null], ICursor]
    ): Unit = js.native
    
    /**
      * Equivalent to `partitionQuery`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent resource name. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents`.
      *   Document resource names are not supported; only database resource names
      *   can be specified.
      * @param {google.firestore.v1.StructuredQuery} request.structuredQuery
      *   A structured query.
      *   Query must specify collection with all descendants and be ordered by name
      *   ascending. Other filters, order bys, limits, offsets, and start/end
      *   cursors are not supported.
      * @param {number} request.partitionCount
      *   The desired maximum number of partition points.
      *   The partitions may be returned across multiple pages of results.
      *   The number must be positive. The actual number of partitions
      *   returned may be fewer.
      *
      *   For example, this may be set to one fewer than the number of parallel
      *   queries to be run, or in running a data pipeline job, one fewer than the
      *   number of workers or compute instances available.
      * @param {string} request.pageToken
      *   The `next_page_token` value returned from a previous call to
      *   PartitionQuery that may be used to get an additional set of results.
      *   There are no ordering guarantees between sets of results. Thus, using
      *   multiple sets of results will require merging the different result sets.
      *
      *   For example, two subsequent calls using a page_token may return:
      *
      *    * cursor B, cursor M, cursor Q
      *    * cursor A, cursor U, cursor W
      *
      *   To obtain a complete result set ordered with respect to the results of the
      *   query supplied to PartitionQuery, the results sets should be merged:
      *   cursor A, cursor B, cursor M, cursor Q, cursor U, cursor W
      * @param {number} request.pageSize
      *   The maximum number of partitions to return in this call, subject to
      *   `partition_count`.
      *
      *   For example, if `partition_count` = 10 and `page_size` = 8, the first call
      *   to PartitionQuery will return up to 8 partitions and a `next_page_token`
      *   if more results exist. A second call to PartitionQuery will return up to
      *   2 partitions, to complete the total of 10 specified in `partition_count`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Cursor]{@link google.firestore.v1.Cursor}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.partition_query.js</caption>
      * region_tag:firestore_v1_generated_Firestore_PartitionQuery_async
      */
    def partitionQueryAsync(): AsyncIterable[ICursor] = js.native
    def partitionQueryAsync(request: Unit, options: CallOptions): AsyncIterable[ICursor] = js.native
    def partitionQueryAsync(request: IPartitionQueryRequest): AsyncIterable[ICursor] = js.native
    def partitionQueryAsync(request: IPartitionQueryRequest, options: CallOptions): AsyncIterable[ICursor] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent resource name. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents`.
      *   Document resource names are not supported; only database resource names
      *   can be specified.
      * @param {google.firestore.v1.StructuredQuery} request.structuredQuery
      *   A structured query.
      *   Query must specify collection with all descendants and be ordered by name
      *   ascending. Other filters, order bys, limits, offsets, and start/end
      *   cursors are not supported.
      * @param {number} request.partitionCount
      *   The desired maximum number of partition points.
      *   The partitions may be returned across multiple pages of results.
      *   The number must be positive. The actual number of partitions
      *   returned may be fewer.
      *
      *   For example, this may be set to one fewer than the number of parallel
      *   queries to be run, or in running a data pipeline job, one fewer than the
      *   number of workers or compute instances available.
      * @param {string} request.pageToken
      *   The `next_page_token` value returned from a previous call to
      *   PartitionQuery that may be used to get an additional set of results.
      *   There are no ordering guarantees between sets of results. Thus, using
      *   multiple sets of results will require merging the different result sets.
      *
      *   For example, two subsequent calls using a page_token may return:
      *
      *    * cursor B, cursor M, cursor Q
      *    * cursor A, cursor U, cursor W
      *
      *   To obtain a complete result set ordered with respect to the results of the
      *   query supplied to PartitionQuery, the results sets should be merged:
      *   cursor A, cursor B, cursor M, cursor Q, cursor U, cursor W
      * @param {number} request.pageSize
      *   The maximum number of partitions to return in this call, subject to
      *   `partition_count`.
      *
      *   For example, if `partition_count` = 10 and `page_size` = 8, the first call
      *   to PartitionQuery will return up to 8 partitions and a `next_page_token`
      *   if more results exist. A second call to PartitionQuery will return up to
      *   2 partitions, to complete the total of 10 specified in `partition_count`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Cursor]{@link google.firestore.v1.Cursor} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `partitionQueryAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def partitionQueryStream(): Transform = js.native
    def partitionQueryStream(request: Unit, options: CallOptions): Transform = js.native
    def partitionQueryStream(request: IPartitionQueryRequest): Transform = js.native
    def partitionQueryStream(request: IPartitionQueryRequest, options: CallOptions): Transform = js.native
    
    /**
      * Rolls back a transaction.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database name. In the format:
      *   `projects/{project_id}/databases/{database_id}`.
      * @param {Buffer} request.transaction
      *   Required. The transaction to roll back.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.rollback.js</caption>
      * region_tag:firestore_v1_generated_Firestore_Rollback_async
      */
    def rollback(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IRollbackRequest], js.UndefOr[js.Object]]] = js.native
    def rollback(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IRollbackRequest], js.UndefOr[js.Object]]] = js.native
    def rollback(request: IRollbackRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IRollbackRequest], js.UndefOr[js.Object]]] = js.native
    def rollback(
      request: IRollbackRequest,
      callback: Callback[IEmpty, js.UndefOr[IRollbackRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def rollback(request: IRollbackRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IRollbackRequest], js.UndefOr[js.Object]]] = js.native
    def rollback(
      request: IRollbackRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IRollbackRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Runs a query.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The parent resource name. In the format:
      *   `projects/{project_id}/databases/{database_id}/documents` or
      *   `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
      *   For example:
      *   `projects/my-project/databases/my-database/documents` or
      *   `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
      * @param {google.firestore.v1.StructuredQuery} request.structuredQuery
      *   A structured query.
      * @param {Buffer} request.transaction
      *   Reads documents in a transaction.
      * @param {google.firestore.v1.TransactionOptions} request.newTransaction
      *   Starts a new transaction and reads the documents.
      *   Defaults to a read-only transaction.
      *   The new transaction ID will be returned as the first response in the
      *   stream.
      * @param {google.protobuf.Timestamp} request.readTime
      *   Reads documents as they were at the given time.
      *   This may not be older than 270 seconds.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits [RunQueryResponse]{@link google.firestore.v1.RunQueryResponse} on 'data' event.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#server-streaming)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.run_query.js</caption>
      * region_tag:firestore_v1_generated_Firestore_RunQuery_async
      */
    def runQuery(): CancellableStream = js.native
    def runQuery(request: Unit, options: CallOptions): CancellableStream = js.native
    def runQuery(request: IRunQueryRequest): CancellableStream = js.native
    def runQuery(request: IRunQueryRequest, options: CallOptions): CancellableStream = js.native
    
    /**
      * Updates or inserts a document.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {google.firestore.v1.Document} request.document
      *   Required. The updated document.
      *   Creates the document if it does not already exist.
      * @param {google.firestore.v1.DocumentMask} request.updateMask
      *   The fields to update.
      *   None of the field paths in the mask may contain a reserved name.
      *
      *   If the document exists on the server and has fields not referenced in the
      *   mask, they are left unchanged.
      *   Fields referenced in the mask, but not present in the input document, are
      *   deleted from the document on the server.
      * @param {google.firestore.v1.DocumentMask} request.mask
      *   The fields to return. If not set, returns all fields.
      *
      *   If the document has a field that is not present in this mask, that field
      *   will not be returned in the response.
      * @param {google.firestore.v1.Precondition} request.currentDocument
      *   An optional precondition on the document.
      *   The request will fail if this is set and not met by the target document.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Document]{@link google.firestore.v1.Document}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.update_document.js</caption>
      * region_tag:firestore_v1_generated_Firestore_UpdateDocument_async
      */
    def updateDocument(): js.Promise[js.Tuple3[IDocument, js.UndefOr[IUpdateDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def updateDocument(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IDocument, js.UndefOr[IUpdateDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def updateDocument(request: IUpdateDocumentRequest): js.Promise[js.Tuple3[IDocument, js.UndefOr[IUpdateDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def updateDocument(
      request: IUpdateDocumentRequest,
      callback: Callback[IDocument, js.UndefOr[IUpdateDocumentRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def updateDocument(request: IUpdateDocumentRequest, options: CallOptions): js.Promise[js.Tuple3[IDocument, js.UndefOr[IUpdateDocumentRequest], js.UndefOr[js.Object]]] = js.native
    def updateDocument(
      request: IUpdateDocumentRequest,
      options: CallOptions,
      callback: Callback[IDocument, js.UndefOr[IUpdateDocumentRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
    
    /**
      * Streams batches of document updates and deletes, in order.
      *
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which is both readable and writable. It accepts objects
      *   representing [WriteRequest]{@link google.firestore.v1.WriteRequest} for write() method, and
      *   will emit objects representing [WriteResponse]{@link google.firestore.v1.WriteResponse} on 'data' event asynchronously.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#bi-directional-streaming)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore.write.js</caption>
      * region_tag:firestore_v1_generated_Firestore_Write_async
      */
    def write(): CancellableStream = js.native
    def write(options: CallOptions): CancellableStream = js.native
  }
}
