package typings.googleCloudFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Database
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.ExportDocumentsMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.ExportDocumentsResponse
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Field
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FieldOperationMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.ICreateIndexRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IDatabase
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IDeleteIndexRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IExportDocumentsMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IExportDocumentsRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IExportDocumentsResponse
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IField
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IFieldOperationMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IGetDatabaseRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IGetFieldRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IGetIndexRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IImportDocumentsMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IImportDocumentsRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IIndex
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IIndexOperationMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IListDatabasesRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IListDatabasesResponse
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IListFieldsRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IListFieldsResponse
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IListIndexesRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IListIndexesResponse
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IUpdateDatabaseMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IUpdateDatabaseRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IUpdateFieldRequest
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.ImportDocumentsMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Index
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.IndexOperationMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1.UpdateDatabaseMetadata
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.longrunning.IOperation
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.Empty
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.IEmpty
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.clientInterfaceMod.Descriptors
import typings.googleGax.clientInterfaceMod.LROperation
import typings.googleGax.clientInterfaceMod.PaginationCallback
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.mod.GoogleAuth
import typings.googleGax.mod.OperationsClient
import typings.googleGax.mod.PathTemplate
import typings.node.streamMod.Transform
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreAdminClientMod {
  
  @JSImport("@google-cloud/firestore/types/v1/firestore_admin_client", "FirestoreAdminClient")
  @js.native
  /**
    * Construct an instance of FirestoreAdminClient.
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
  open class FirestoreAdminClient () extends StObject {
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
      * Check the status of the long running operation returned by `createIndex()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.create_index.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_CreateIndex_async
      */
    def checkCreateIndexProgress(name: String): js.Promise[LROperation[Index, IndexOperationMetadata]] = js.native
    
    /**
      * Check the status of the long running operation returned by `exportDocuments()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.export_documents.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_ExportDocuments_async
      */
    def checkExportDocumentsProgress(name: String): js.Promise[LROperation[ExportDocumentsResponse, ExportDocumentsMetadata]] = js.native
    
    /**
      * Check the status of the long running operation returned by `importDocuments()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.import_documents.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_ImportDocuments_async
      */
    def checkImportDocumentsProgress(name: String): js.Promise[LROperation[Empty, ImportDocumentsMetadata]] = js.native
    
    /**
      * Check the status of the long running operation returned by `updateDatabase()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.update_database.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_UpdateDatabase_async
      */
    def checkUpdateDatabaseProgress(name: String): js.Promise[LROperation[Database, UpdateDatabaseMetadata]] = js.native
    
    /**
      * Check the status of the long running operation returned by `updateField()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.update_field.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_UpdateField_async
      */
    def checkUpdateFieldProgress(name: String): js.Promise[LROperation[Field, FieldOperationMetadata]] = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Return a fully-qualified collectionGroup resource name string.
      *
      * @param {string} project
      * @param {string} database
      * @param {string} collection
      * @returns {string} Resource name string.
      */
    def collectionGroupPath(project: String, database: String, collection: String): String = js.native
    
    /**
      * Creates a composite index. This returns a {@link google.longrunning.Operation|google.longrunning.Operation}
      * which may be used to track the status of the creation. The metadata for
      * the operation will be the type {@link google.firestore.admin.v1.IndexOperationMetadata|IndexOperationMetadata}.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. A parent name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
      * @param {google.firestore.admin.v1.Index} request.index
      *   Required. The composite index to create.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.create_index.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_CreateIndex_async
      */
    def createIndex(): js.Promise[
        js.Tuple3[
          LROperation[IIndex, IIndexOperationMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createIndex(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IIndex, IIndexOperationMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createIndex(request: ICreateIndexRequest): js.Promise[
        js.Tuple3[
          LROperation[IIndex, IIndexOperationMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createIndex(
      request: ICreateIndexRequest,
      callback: Callback[
          LROperation[IIndex, IIndexOperationMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def createIndex(request: ICreateIndexRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IIndex, IIndexOperationMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createIndex(
      request: ICreateIndexRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IIndex, IIndexOperationMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Return a fully-qualified database resource name string.
      *
      * @param {string} project
      * @param {string} database
      * @returns {string} Resource name string.
      */
    def databasePath(project: String, database: String): String = js.native
    
    /**
      * Deletes a composite index.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. A name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.delete_index.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_DeleteIndex_async
      */
    def deleteIndex(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteIndexRequest], js.UndefOr[js.Object]]] = js.native
    def deleteIndex(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteIndexRequest], js.UndefOr[js.Object]]] = js.native
    def deleteIndex(request: IDeleteIndexRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteIndexRequest], js.UndefOr[js.Object]]] = js.native
    def deleteIndex(
      request: IDeleteIndexRequest,
      callback: Callback[IEmpty, js.UndefOr[IDeleteIndexRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def deleteIndex(request: IDeleteIndexRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteIndexRequest], js.UndefOr[js.Object]]] = js.native
    def deleteIndex(
      request: IDeleteIndexRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDeleteIndexRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var descriptors: Descriptors = js.native
    
    /**
      * Exports a copy of all or a subset of documents from Google Cloud Firestore
      * to another storage system, such as Google Cloud Storage. Recent updates to
      * documents may not be reflected in the export. The export occurs in the
      * background and its progress can be monitored and managed via the
      * Operation resource that is created. The output of an export may only be
      * used once the associated operation is done. If an export operation is
      * cancelled before completion it may leave partial data behind in Google
      * Cloud Storage.
      *
      * For more details on export behavior and output format, refer to:
      * https://cloud.google.com/firestore/docs/manage-data/export-import
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. Database to export. Should be of the form:
      *   `projects/{project_id}/databases/{database_id}`.
      * @param {string[]} request.collectionIds
      *   Which collection ids to export. Unspecified means all collections.
      * @param {string} request.outputUriPrefix
      *   The output URI. Currently only supports Google Cloud Storage URIs of the
      *   form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the name
      *   of the Google Cloud Storage bucket and `NAMESPACE_PATH` is an optional
      *   Google Cloud Storage namespace path. When
      *   choosing a name, be sure to consider Google Cloud Storage naming
      *   guidelines: https://cloud.google.com/storage/docs/naming.
      *   If the URI is a bucket (without a namespace path), a prefix will be
      *   generated based on the start time.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.export_documents.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_ExportDocuments_async
      */
    def exportDocuments(): js.Promise[
        js.Tuple3[
          LROperation[IExportDocumentsResponse, IExportDocumentsMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def exportDocuments(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IExportDocumentsResponse, IExportDocumentsMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def exportDocuments(request: IExportDocumentsRequest): js.Promise[
        js.Tuple3[
          LROperation[IExportDocumentsResponse, IExportDocumentsMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def exportDocuments(
      request: IExportDocumentsRequest,
      callback: Callback[
          LROperation[IExportDocumentsResponse, IExportDocumentsMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def exportDocuments(request: IExportDocumentsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IExportDocumentsResponse, IExportDocumentsMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def exportDocuments(
      request: IExportDocumentsRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IExportDocumentsResponse, IExportDocumentsMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Return a fully-qualified field resource name string.
      *
      * @param {string} project
      * @param {string} database
      * @param {string} collection
      * @param {string} field
      * @returns {string} Resource name string.
      */
    def fieldPath(project: String, database: String, collection: String, field: String): String = js.native
    
    var firestoreAdminStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    /**
      * Gets information about a database.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. A name of the form
      *   `projects/{project_id}/databases/{database_id}`
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Database]{@link google.firestore.admin.v1.Database}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.get_database.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_GetDatabase_async
      */
    def getDatabase(): js.Promise[js.Tuple3[IDatabase, js.UndefOr[IGetDatabaseRequest], js.UndefOr[js.Object]]] = js.native
    def getDatabase(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IDatabase, js.UndefOr[IGetDatabaseRequest], js.UndefOr[js.Object]]] = js.native
    def getDatabase(request: IGetDatabaseRequest): js.Promise[js.Tuple3[IDatabase, js.UndefOr[IGetDatabaseRequest], js.UndefOr[js.Object]]] = js.native
    def getDatabase(
      request: IGetDatabaseRequest,
      callback: Callback[IDatabase, js.UndefOr[IGetDatabaseRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getDatabase(request: IGetDatabaseRequest, options: CallOptions): js.Promise[js.Tuple3[IDatabase, js.UndefOr[IGetDatabaseRequest], js.UndefOr[js.Object]]] = js.native
    def getDatabase(
      request: IGetDatabaseRequest,
      options: CallOptions,
      callback: Callback[IDatabase, js.UndefOr[IGetDatabaseRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Gets the metadata and configuration for a Field.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. A name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_id}`
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Field]{@link google.firestore.admin.v1.Field}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.get_field.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_GetField_async
      */
    def getField(): js.Promise[js.Tuple3[IField, js.UndefOr[IGetFieldRequest], js.UndefOr[js.Object]]] = js.native
    def getField(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IField, js.UndefOr[IGetFieldRequest], js.UndefOr[js.Object]]] = js.native
    def getField(request: IGetFieldRequest): js.Promise[js.Tuple3[IField, js.UndefOr[IGetFieldRequest], js.UndefOr[js.Object]]] = js.native
    def getField(
      request: IGetFieldRequest,
      callback: Callback[IField, js.UndefOr[IGetFieldRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getField(request: IGetFieldRequest, options: CallOptions): js.Promise[js.Tuple3[IField, js.UndefOr[IGetFieldRequest], js.UndefOr[js.Object]]] = js.native
    def getField(
      request: IGetFieldRequest,
      options: CallOptions,
      callback: Callback[IField, js.UndefOr[IGetFieldRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Gets a composite index.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. A name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Index]{@link google.firestore.admin.v1.Index}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.get_index.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_GetIndex_async
      */
    def getIndex(): js.Promise[js.Tuple3[IIndex, js.UndefOr[IGetIndexRequest], js.UndefOr[js.Object]]] = js.native
    def getIndex(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IIndex, js.UndefOr[IGetIndexRequest], js.UndefOr[js.Object]]] = js.native
    def getIndex(request: IGetIndexRequest): js.Promise[js.Tuple3[IIndex, js.UndefOr[IGetIndexRequest], js.UndefOr[js.Object]]] = js.native
    def getIndex(
      request: IGetIndexRequest,
      callback: Callback[IIndex, js.UndefOr[IGetIndexRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getIndex(request: IGetIndexRequest, options: CallOptions): js.Promise[js.Tuple3[IIndex, js.UndefOr[IGetIndexRequest], js.UndefOr[js.Object]]] = js.native
    def getIndex(
      request: IGetIndexRequest,
      options: CallOptions,
      callback: Callback[IIndex, js.UndefOr[IGetIndexRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: Callback[String, Unit, Unit]): Unit = js.native
    
    /**
      * Imports documents into Google Cloud Firestore. Existing documents with the
      * same name are overwritten. The import occurs in the background and its
      * progress can be monitored and managed via the Operation resource that is
      * created. If an ImportDocuments operation is cancelled, it is possible
      * that a subset of the data has already been imported to Cloud Firestore.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. Database to import into. Should be of the form:
      *   `projects/{project_id}/databases/{database_id}`.
      * @param {string[]} request.collectionIds
      *   Which collection ids to import. Unspecified means all collections included
      *   in the import.
      * @param {string} request.inputUriPrefix
      *   Location of the exported files.
      *   This must match the output_uri_prefix of an ExportDocumentsResponse from
      *   an export that has completed successfully.
      *   See:
      *   {@link google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix|google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.import_documents.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_ImportDocuments_async
      */
    def importDocuments(): js.Promise[
        js.Tuple3[
          LROperation[IEmpty, IImportDocumentsMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def importDocuments(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IEmpty, IImportDocumentsMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def importDocuments(request: IImportDocumentsRequest): js.Promise[
        js.Tuple3[
          LROperation[IEmpty, IImportDocumentsMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def importDocuments(
      request: IImportDocumentsRequest,
      callback: Callback[
          LROperation[IEmpty, IImportDocumentsMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def importDocuments(request: IImportDocumentsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IEmpty, IImportDocumentsMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def importDocuments(
      request: IImportDocumentsRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IEmpty, IImportDocumentsMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Return a fully-qualified index resource name string.
      *
      * @param {string} project
      * @param {string} database
      * @param {string} collection
      * @param {string} index
      * @returns {string} Resource name string.
      */
    def indexPath(project: String, database: String, collection: String, index: String): String = js.native
    
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
      * List all the databases in the project.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. A parent name of the form
      *   `projects/{project_id}`
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [ListDatabasesResponse]{@link google.firestore.admin.v1.ListDatabasesResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.list_databases.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_ListDatabases_async
      */
    def listDatabases(): js.Promise[
        js.Tuple3[IListDatabasesResponse, js.UndefOr[IListDatabasesRequest], js.UndefOr[js.Object]]
      ] = js.native
    def listDatabases(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IListDatabasesResponse, js.UndefOr[IListDatabasesRequest], js.UndefOr[js.Object]]
      ] = js.native
    def listDatabases(request: IListDatabasesRequest): js.Promise[
        js.Tuple3[IListDatabasesResponse, js.UndefOr[IListDatabasesRequest], js.UndefOr[js.Object]]
      ] = js.native
    def listDatabases(
      request: IListDatabasesRequest,
      callback: Callback[
          IListDatabasesResponse, 
          js.UndefOr[IListDatabasesRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def listDatabases(request: IListDatabasesRequest, options: CallOptions): js.Promise[
        js.Tuple3[IListDatabasesResponse, js.UndefOr[IListDatabasesRequest], js.UndefOr[js.Object]]
      ] = js.native
    def listDatabases(
      request: IListDatabasesRequest,
      options: CallOptions,
      callback: Callback[
          IListDatabasesResponse, 
          js.UndefOr[IListDatabasesRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Lists the field configuration and metadata for this database.
      *
      * Currently, {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields} only supports listing fields
      * that have been explicitly overridden. To issue this query, call
      * {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields} with the filter set to
      * `indexConfig.usesAncestorConfig:false` .
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. A parent name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
      * @param {string} request.filter
      *   The filter to apply to list results. Currently,
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields} only supports listing fields
      *   that have been explicitly overridden. To issue this query, call
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields} with a filter that includes
      *   `indexConfig.usesAncestorConfig:false` .
      * @param {number} request.pageSize
      *   The number of results to return.
      * @param {string} request.pageToken
      *   A page token, returned from a previous call to
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields}, that may be used to get the next
      *   page of results.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Field]{@link google.firestore.admin.v1.Field}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listFieldsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listFields(): js.Promise[js.Tuple3[js.Array[IField], IListFieldsRequest | Null, IListFieldsResponse]] = js.native
    def listFields(request: Unit, options: CallOptions): js.Promise[js.Tuple3[js.Array[IField], IListFieldsRequest | Null, IListFieldsResponse]] = js.native
    def listFields(request: IListFieldsRequest): js.Promise[js.Tuple3[js.Array[IField], IListFieldsRequest | Null, IListFieldsResponse]] = js.native
    def listFields(
      request: IListFieldsRequest,
      callback: PaginationCallback[IListFieldsRequest, js.UndefOr[IListFieldsResponse | Null], IField]
    ): Unit = js.native
    def listFields(request: IListFieldsRequest, options: CallOptions): js.Promise[js.Tuple3[js.Array[IField], IListFieldsRequest | Null, IListFieldsResponse]] = js.native
    def listFields(
      request: IListFieldsRequest,
      options: CallOptions,
      callback: PaginationCallback[IListFieldsRequest, js.UndefOr[IListFieldsResponse | Null], IField]
    ): Unit = js.native
    
    /**
      * Equivalent to `listFields`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. A parent name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
      * @param {string} request.filter
      *   The filter to apply to list results. Currently,
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields} only supports listing fields
      *   that have been explicitly overridden. To issue this query, call
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields} with a filter that includes
      *   `indexConfig.usesAncestorConfig:false` .
      * @param {number} request.pageSize
      *   The number of results to return.
      * @param {string} request.pageToken
      *   A page token, returned from a previous call to
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields}, that may be used to get the next
      *   page of results.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Field]{@link google.firestore.admin.v1.Field}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.list_fields.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_ListFields_async
      */
    def listFieldsAsync(): AsyncIterable[IField] = js.native
    def listFieldsAsync(request: Unit, options: CallOptions): AsyncIterable[IField] = js.native
    def listFieldsAsync(request: IListFieldsRequest): AsyncIterable[IField] = js.native
    def listFieldsAsync(request: IListFieldsRequest, options: CallOptions): AsyncIterable[IField] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. A parent name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
      * @param {string} request.filter
      *   The filter to apply to list results. Currently,
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields} only supports listing fields
      *   that have been explicitly overridden. To issue this query, call
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields} with a filter that includes
      *   `indexConfig.usesAncestorConfig:false` .
      * @param {number} request.pageSize
      *   The number of results to return.
      * @param {string} request.pageToken
      *   A page token, returned from a previous call to
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListFields|FirestoreAdmin.ListFields}, that may be used to get the next
      *   page of results.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Field]{@link google.firestore.admin.v1.Field} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listFieldsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listFieldsStream(): Transform = js.native
    def listFieldsStream(request: Unit, options: CallOptions): Transform = js.native
    def listFieldsStream(request: IListFieldsRequest): Transform = js.native
    def listFieldsStream(request: IListFieldsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists composite indexes.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. A parent name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
      * @param {string} request.filter
      *   The filter to apply to list results.
      * @param {number} request.pageSize
      *   The number of results to return.
      * @param {string} request.pageToken
      *   A page token, returned from a previous call to
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListIndexes|FirestoreAdmin.ListIndexes}, that may be used to get the next
      *   page of results.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Index]{@link google.firestore.admin.v1.Index}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listIndexesAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listIndexes(): js.Promise[js.Tuple3[js.Array[IIndex], IListIndexesRequest | Null, IListIndexesResponse]] = js.native
    def listIndexes(request: Unit, options: CallOptions): js.Promise[js.Tuple3[js.Array[IIndex], IListIndexesRequest | Null, IListIndexesResponse]] = js.native
    def listIndexes(request: IListIndexesRequest): js.Promise[js.Tuple3[js.Array[IIndex], IListIndexesRequest | Null, IListIndexesResponse]] = js.native
    def listIndexes(
      request: IListIndexesRequest,
      callback: PaginationCallback[IListIndexesRequest, js.UndefOr[IListIndexesResponse | Null], IIndex]
    ): Unit = js.native
    def listIndexes(request: IListIndexesRequest, options: CallOptions): js.Promise[js.Tuple3[js.Array[IIndex], IListIndexesRequest | Null, IListIndexesResponse]] = js.native
    def listIndexes(
      request: IListIndexesRequest,
      options: CallOptions,
      callback: PaginationCallback[IListIndexesRequest, js.UndefOr[IListIndexesResponse | Null], IIndex]
    ): Unit = js.native
    
    /**
      * Equivalent to `listIndexes`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. A parent name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
      * @param {string} request.filter
      *   The filter to apply to list results.
      * @param {number} request.pageSize
      *   The number of results to return.
      * @param {string} request.pageToken
      *   A page token, returned from a previous call to
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListIndexes|FirestoreAdmin.ListIndexes}, that may be used to get the next
      *   page of results.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Index]{@link google.firestore.admin.v1.Index}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.list_indexes.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_ListIndexes_async
      */
    def listIndexesAsync(): AsyncIterable[IIndex] = js.native
    def listIndexesAsync(request: Unit, options: CallOptions): AsyncIterable[IIndex] = js.native
    def listIndexesAsync(request: IListIndexesRequest): AsyncIterable[IIndex] = js.native
    def listIndexesAsync(request: IListIndexesRequest, options: CallOptions): AsyncIterable[IIndex] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. A parent name of the form
      *   `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
      * @param {string} request.filter
      *   The filter to apply to list results.
      * @param {number} request.pageSize
      *   The number of results to return.
      * @param {string} request.pageToken
      *   A page token, returned from a previous call to
      *   {@link google.firestore.admin.v1.FirestoreAdmin.ListIndexes|FirestoreAdmin.ListIndexes}, that may be used to get the next
      *   page of results.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Index]{@link google.firestore.admin.v1.Index} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listIndexesAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listIndexesStream(): Transform = js.native
    def listIndexesStream(request: Unit, options: CallOptions): Transform = js.native
    def listIndexesStream(request: IListIndexesRequest): Transform = js.native
    def listIndexesStream(request: IListIndexesRequest, options: CallOptions): Transform = js.native
    
    /**
      * Parse the collection from CollectionGroup resource.
      *
      * @param {string} collectionGroupName
      *   A fully-qualified path representing CollectionGroup resource.
      * @returns {string} A string representing the collection.
      */
    def matchCollectionFromCollectionGroupName(collectionGroupName: String): String | Double = js.native
    
    /**
      * Parse the collection from Field resource.
      *
      * @param {string} fieldName
      *   A fully-qualified path representing Field resource.
      * @returns {string} A string representing the collection.
      */
    def matchCollectionFromFieldName(fieldName: String): String | Double = js.native
    
    /**
      * Parse the collection from Index resource.
      *
      * @param {string} indexName
      *   A fully-qualified path representing Index resource.
      * @returns {string} A string representing the collection.
      */
    def matchCollectionFromIndexName(indexName: String): String | Double = js.native
    
    /**
      * Parse the database from CollectionGroup resource.
      *
      * @param {string} collectionGroupName
      *   A fully-qualified path representing CollectionGroup resource.
      * @returns {string} A string representing the database.
      */
    def matchDatabaseFromCollectionGroupName(collectionGroupName: String): String | Double = js.native
    
    /**
      * Parse the database from Database resource.
      *
      * @param {string} databaseName
      *   A fully-qualified path representing Database resource.
      * @returns {string} A string representing the database.
      */
    def matchDatabaseFromDatabaseName(databaseName: String): String | Double = js.native
    
    /**
      * Parse the database from Field resource.
      *
      * @param {string} fieldName
      *   A fully-qualified path representing Field resource.
      * @returns {string} A string representing the database.
      */
    def matchDatabaseFromFieldName(fieldName: String): String | Double = js.native
    
    /**
      * Parse the database from Index resource.
      *
      * @param {string} indexName
      *   A fully-qualified path representing Index resource.
      * @returns {string} A string representing the database.
      */
    def matchDatabaseFromIndexName(indexName: String): String | Double = js.native
    
    /**
      * Parse the field from Field resource.
      *
      * @param {string} fieldName
      *   A fully-qualified path representing Field resource.
      * @returns {string} A string representing the field.
      */
    def matchFieldFromFieldName(fieldName: String): String | Double = js.native
    
    /**
      * Parse the index from Index resource.
      *
      * @param {string} indexName
      *   A fully-qualified path representing Index resource.
      * @returns {string} A string representing the index.
      */
    def matchIndexFromIndexName(indexName: String): String | Double = js.native
    
    /**
      * Parse the project from CollectionGroup resource.
      *
      * @param {string} collectionGroupName
      *   A fully-qualified path representing CollectionGroup resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromCollectionGroupName(collectionGroupName: String): String | Double = js.native
    
    /**
      * Parse the project from Database resource.
      *
      * @param {string} databaseName
      *   A fully-qualified path representing Database resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromDatabaseName(databaseName: String): String | Double = js.native
    
    /**
      * Parse the project from Field resource.
      *
      * @param {string} fieldName
      *   A fully-qualified path representing Field resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromFieldName(fieldName: String): String | Double = js.native
    
    /**
      * Parse the project from Index resource.
      *
      * @param {string} indexName
      *   A fully-qualified path representing Index resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromIndexName(indexName: String): String | Double = js.native
    
    /**
      * Parse the project from Project resource.
      *
      * @param {string} projectName
      *   A fully-qualified path representing Project resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromProjectName(projectName: String): String | Double = js.native
    
    var operationsClient: OperationsClient = js.native
    
    var pathTemplates: StringDictionary[PathTemplate] = js.native
    
    /**
      * Return a fully-qualified project resource name string.
      *
      * @param {string} project
      * @returns {string} Resource name string.
      */
    def projectPath(project: String): String = js.native
    
    /**
      * Updates a database.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {google.firestore.admin.v1.Database} request.database
      *   Required. The database to update.
      * @param {google.protobuf.FieldMask} request.updateMask
      *   The list of fields to be updated.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.update_database.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_UpdateDatabase_async
      */
    def updateDatabase(): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, IUpdateDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateDatabase(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, IUpdateDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateDatabase(request: IUpdateDatabaseRequest): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, IUpdateDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateDatabase(
      request: IUpdateDatabaseRequest,
      callback: Callback[
          LROperation[IDatabase, IUpdateDatabaseMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def updateDatabase(request: IUpdateDatabaseRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, IUpdateDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateDatabase(
      request: IUpdateDatabaseRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IDatabase, IUpdateDatabaseMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Updates a field configuration. Currently, field updates apply only to
      * single field index configuration. However, calls to
      * {@link google.firestore.admin.v1.FirestoreAdmin.UpdateField|FirestoreAdmin.UpdateField} should provide a field mask to avoid
      * changing any configuration that the caller isn't aware of. The field mask
      * should be specified as: `{ paths: "index_config" }`.
      *
      * This call returns a {@link google.longrunning.Operation|google.longrunning.Operation} which may be used to
      * track the status of the field update. The metadata for
      * the operation will be the type {@link google.firestore.admin.v1.FieldOperationMetadata|FieldOperationMetadata}.
      *
      * To configure the default field settings for the database, use
      * the special `Field` with resource name:
      * `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/ *`.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {google.firestore.admin.v1.Field} request.field
      *   Required. The field to be updated.
      * @param {google.protobuf.FieldMask} request.updateMask
      *   A mask, relative to the field. If specified, only configuration specified
      *   by this field_mask will be updated in the field.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/firestore_admin.update_field.js</caption>
      * region_tag:firestore_v1_generated_FirestoreAdmin_UpdateField_async
      */
    def updateField(): js.Promise[
        js.Tuple3[
          LROperation[IField, IFieldOperationMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateField(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IField, IFieldOperationMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateField(request: IUpdateFieldRequest): js.Promise[
        js.Tuple3[
          LROperation[IField, IFieldOperationMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateField(
      request: IUpdateFieldRequest,
      callback: Callback[
          LROperation[IField, IFieldOperationMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def updateField(request: IUpdateFieldRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IField, IFieldOperationMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateField(
      request: IUpdateFieldRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IField, IFieldOperationMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
