package typings.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleCloudSpanner.protosMod.google.iam.v1.IGetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.IPolicy
import typings.googleCloudSpanner.protosMod.google.iam.v1.ISetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ITestIamPermissionsRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ITestIamPermissionsResponse
import typings.googleCloudSpanner.protosMod.google.longrunning.CancelOperationRequest
import typings.googleCloudSpanner.protosMod.google.longrunning.DeleteOperationRequest
import typings.googleCloudSpanner.protosMod.google.longrunning.GetOperationRequest
import typings.googleCloudSpanner.protosMod.google.longrunning.IOperation
import typings.googleCloudSpanner.protosMod.google.longrunning.ListOperationsRequest
import typings.googleCloudSpanner.protosMod.google.longrunning.ListOperationsResponse
import typings.googleCloudSpanner.protosMod.google.longrunning.Operation
import typings.googleCloudSpanner.protosMod.google.protobuf.Empty
import typings.googleCloudSpanner.protosMod.google.protobuf.IEmpty
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Backup
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CopyBackupMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CreateBackupMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CreateDatabaseMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Database
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IBackup
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICopyBackupMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICopyBackupRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICreateBackupMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICreateBackupRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICreateDatabaseMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.ICreateDatabaseRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IDatabase
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IDatabaseRole
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IDeleteBackupRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IDropDatabaseRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IGetBackupRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IGetDatabaseDdlRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IGetDatabaseDdlResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IGetDatabaseRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListBackupOperationsRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListBackupOperationsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListBackupsRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListBackupsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListDatabaseOperationsRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListDatabaseOperationsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListDatabaseRolesRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListDatabaseRolesResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListDatabasesRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IListDatabasesResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IRestoreDatabaseMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IRestoreDatabaseRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IUpdateBackupRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IUpdateDatabaseDdlMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IUpdateDatabaseDdlRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreDatabaseMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata
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

object databaseAdminClientMod {
  
  @JSImport("@google-cloud/spanner/build/src/v1/database_admin_client", "DatabaseAdminClient")
  @js.native
  /**
    * Construct an instance of DatabaseAdminClient.
    *
    * @param {object} [options] - The configuration object.
    * The options accepted by the constructor are described in detail
    * in [this document](https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#creating-the-client-instance).
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
    * @param {boolean | "rest"} [options.fallback] - Use HTTP fallback mode.
    *     Pass "rest" to use HTTP/1.1 REST API instead of gRPC.
    *     For more information, please check the
    *     {@link https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#http11-rest-api-mode documentation}.
    */
  open class DatabaseAdminClient () extends StObject {
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
      * Return a fully-qualified backup resource name string.
      *
      * @param {string} project
      * @param {string} instance
      * @param {string} backup
      * @returns {string} Resource name string.
      */
    def backupPath(project: String, instance: String, backup: String): String = js.native
    
    /**
      * Starts asynchronous cancellation on a long-running operation.  The server
      * makes a best effort to cancel the operation, but success is not
      * guaranteed.  If the server doesn't support this method, it returns
      * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use
      * {@link Operations.GetOperation} or
      * other methods to check whether the cancellation succeeded or whether the
      * operation completed despite cancellation. On successful cancellation,
      * the operation is not deleted; instead, it becomes an operation with
      * an {@link Operation.error} value with a {@link google.rpc.Status.code} of
      * 1, corresponding to `Code.CANCELLED`.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation resource to be cancelled.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      * e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      * https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      * details.
      * @param {function(?Error)=} callback
      *   The function which will be called with the result of the API call.
      * @return {Promise} - The promise which resolves when API call finishes.
      *   The promise has a method named "cancel" which cancels the ongoing API
      * call.
      *
      * @example
      * ```
      * const client = longrunning.operationsClient();
      * await client.cancelOperation({name: ''});
      * ```
      */
    def cancelOperation(request: CancelOperationRequest): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      options: Unit,
      callback: Callback[CancelOperationRequest, Empty, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      options: Callback[Empty, CancelOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      options: Callback[Empty, CancelOperationRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[CancelOperationRequest, Empty, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def cancelOperation(request: CancelOperationRequest, options: CallOptions): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      options: CallOptions,
      callback: Callback[CancelOperationRequest, Empty, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    
    /**
      * Check the status of the long running operation returned by `copyBackup()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.copy_backup.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_CopyBackup_async
      */
    def checkCopyBackupProgress(name: String): js.Promise[LROperation[Backup, CopyBackupMetadata]] = js.native
    
    /**
      * Check the status of the long running operation returned by `createBackup()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.create_backup.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_CreateBackup_async
      */
    def checkCreateBackupProgress(name: String): js.Promise[LROperation[Backup, CreateBackupMetadata]] = js.native
    
    /**
      * Check the status of the long running operation returned by `createDatabase()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.create_database.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_CreateDatabase_async
      */
    def checkCreateDatabaseProgress(name: String): js.Promise[LROperation[Database, CreateDatabaseMetadata]] = js.native
    
    /**
      * Check the status of the long running operation returned by `restoreDatabase()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.restore_database.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_RestoreDatabase_async
      */
    def checkRestoreDatabaseProgress(name: String): js.Promise[LROperation[Database, RestoreDatabaseMetadata]] = js.native
    
    /**
      * Check the status of the long running operation returned by `updateDatabaseDdl()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.update_database_ddl.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_UpdateDatabaseDdl_async
      */
    def checkUpdateDatabaseDdlProgress(name: String): js.Promise[LROperation[Empty, UpdateDatabaseDdlMetadata]] = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Starts copying a Cloud Spanner Backup.
      * The returned backup {@link google.longrunning.Operation|long-running operation}
      * will have a name of the format
      * `projects/<project>/instances/<instance>/backups/<backup>/operations/<operation_id>`
      * and can be used to track copying of the backup. The operation is associated
      * with the destination backup.
      * The {@link google.longrunning.Operation.metadata|metadata} field type is
      * {@link google.spanner.admin.database.v1.CopyBackupMetadata|CopyBackupMetadata}.
      * The {@link google.longrunning.Operation.response|response} field type is
      * {@link google.spanner.admin.database.v1.Backup|Backup}, if successful. Cancelling the returned operation will stop the
      * copying and delete the backup.
      * Concurrent CopyBackup requests can run on the same source backup.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the destination instance that will contain the backup copy.
      *   Values are of the form: `projects/<project>/instances/<instance>`.
      * @param {string} request.backupId
      *   Required. The id of the backup copy.
      *   The `backup_id` appended to `parent` forms the full backup_uri of the form
      *   `projects/<project>/instances/<instance>/backups/<backup>`.
      * @param {string} request.sourceBackup
      *   Required. The source backup to be copied.
      *   The source backup needs to be in READY state for it to be copied.
      *   Once CopyBackup is in progress, the source backup cannot be deleted or
      *   cleaned up on expiration until CopyBackup is finished.
      *   Values are of the form:
      *   `projects/<project>/instances/<instance>/backups/<backup>`.
      * @param {google.protobuf.Timestamp} request.expireTime
      *   Required. The expiration time of the backup in microsecond granularity.
      *   The expiration time must be at least 6 hours and at most 366 days
      *   from the `create_time` of the source backup. Once the `expire_time` has
      *   passed, the backup is eligible to be automatically deleted by Cloud Spanner
      *   to free the resources used by the backup.
      * @param {google.spanner.admin.database.v1.CopyBackupEncryptionConfig} [request.encryptionConfig]
      *   Optional. The encryption configuration used to encrypt the backup. If this field is
      *   not specified, the backup will use the same
      *   encryption configuration as the source backup by default, namely
      *   {@link google.spanner.admin.database.v1.CopyBackupEncryptionConfig.encryption_type|encryption_type} =
      *   `USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.copy_backup.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_CopyBackup_async
      */
    def copyBackup(): js.Promise[
        js.Tuple3[
          LROperation[IBackup, ICopyBackupMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def copyBackup(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IBackup, ICopyBackupMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def copyBackup(request: ICopyBackupRequest): js.Promise[
        js.Tuple3[
          LROperation[IBackup, ICopyBackupMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def copyBackup(
      request: ICopyBackupRequest,
      callback: Callback[
          LROperation[IBackup, ICopyBackupMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def copyBackup(request: ICopyBackupRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IBackup, ICopyBackupMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def copyBackup(
      request: ICopyBackupRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IBackup, ICopyBackupMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Starts creating a new Cloud Spanner Backup.
      * The returned backup {@link google.longrunning.Operation|long-running operation}
      * will have a name of the format
      * `projects/<project>/instances/<instance>/backups/<backup>/operations/<operation_id>`
      * and can be used to track creation of the backup. The
      * {@link google.longrunning.Operation.metadata|metadata} field type is
      * {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata}. The
      * {@link google.longrunning.Operation.response|response} field type is
      * {@link google.spanner.admin.database.v1.Backup|Backup}, if successful. Cancelling the returned operation will stop the
      * creation and delete the backup.
      * There can be only one pending backup creation per database. Backup creation
      * of different databases can run concurrently.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the instance in which the backup will be
      *   created. This must be the same instance that contains the database the
      *   backup will be created from. The backup will be stored in the
      *   location(s) specified in the instance configuration of this
      *   instance. Values are of the form
      *   `projects/<project>/instances/<instance>`.
      * @param {string} request.backupId
      *   Required. The id of the backup to be created. The `backup_id` appended to
      *   `parent` forms the full backup name of the form
      *   `projects/<project>/instances/<instance>/backups/<backup_id>`.
      * @param {google.spanner.admin.database.v1.Backup} request.backup
      *   Required. The backup to create.
      * @param {google.spanner.admin.database.v1.CreateBackupEncryptionConfig} [request.encryptionConfig]
      *   Optional. The encryption configuration used to encrypt the backup. If this field is
      *   not specified, the backup will use the same
      *   encryption configuration as the database by default, namely
      *   {@link google.spanner.admin.database.v1.CreateBackupEncryptionConfig.encryption_type|encryption_type} =
      *   `USE_DATABASE_ENCRYPTION`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.create_backup.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_CreateBackup_async
      */
    def createBackup(): js.Promise[
        js.Tuple3[
          LROperation[IBackup, ICreateBackupMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createBackup(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IBackup, ICreateBackupMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createBackup(request: ICreateBackupRequest): js.Promise[
        js.Tuple3[
          LROperation[IBackup, ICreateBackupMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createBackup(
      request: ICreateBackupRequest,
      callback: Callback[
          LROperation[IBackup, ICreateBackupMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def createBackup(request: ICreateBackupRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IBackup, ICreateBackupMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createBackup(
      request: ICreateBackupRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IBackup, ICreateBackupMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Creates a new Cloud Spanner database and starts to prepare it for serving.
      * The returned {@link google.longrunning.Operation|long-running operation} will
      * have a name of the format `<database_name>/operations/<operation_id>` and
      * can be used to track preparation of the database. The
      * {@link google.longrunning.Operation.metadata|metadata} field type is
      * {@link google.spanner.admin.database.v1.CreateDatabaseMetadata|CreateDatabaseMetadata}. The
      * {@link google.longrunning.Operation.response|response} field type is
      * {@link google.spanner.admin.database.v1.Database|Database}, if successful.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the instance that will serve the new database.
      *   Values are of the form `projects/<project>/instances/<instance>`.
      * @param {string} request.createStatement
      *   Required. A `CREATE DATABASE` statement, which specifies the ID of the
      *   new database.  The database ID must conform to the regular expression
      *   `{@link a-z0-9_\-|a-z}*[a-z0-9]` and be between 2 and 30 characters in length.
      *   If the database ID is a reserved word or if it contains a hyphen, the
      *   database ID must be enclosed in backticks (`` ` ``).
      * @param {string[]} [request.extraStatements]
      *   Optional. A list of DDL statements to run inside the newly created
      *   database. Statements can create tables, indexes, etc. These
      *   statements execute atomically with the creation of the database:
      *   if there is an error in any statement, the database is not created.
      * @param {google.spanner.admin.database.v1.EncryptionConfig} [request.encryptionConfig]
      *   Optional. The encryption configuration for the database. If this field is not
      *   specified, Cloud Spanner will encrypt/decrypt all data at rest using
      *   Google default encryption.
      * @param {google.spanner.admin.database.v1.DatabaseDialect} [request.databaseDialect]
      *   Optional. The dialect of the Cloud Spanner Database.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.create_database.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_CreateDatabase_async
      */
    def createDatabase(): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, ICreateDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createDatabase(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, ICreateDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createDatabase(request: ICreateDatabaseRequest): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, ICreateDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createDatabase(
      request: ICreateDatabaseRequest,
      callback: Callback[
          LROperation[IDatabase, ICreateDatabaseMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def createDatabase(request: ICreateDatabaseRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, ICreateDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def createDatabase(
      request: ICreateDatabaseRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IDatabase, ICreateDatabaseMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Return a fully-qualified cryptoKey resource name string.
      *
      * @param {string} project
      * @param {string} location
      * @param {string} key_ring
      * @param {string} crypto_key
      * @returns {string} Resource name string.
      */
    def cryptoKeyPath(project: String, location: String, keyRing: String, cryptoKey: String): String = js.native
    
    var databaseAdminStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    /**
      * Return a fully-qualified database resource name string.
      *
      * @param {string} project
      * @param {string} instance
      * @param {string} database
      * @returns {string} Resource name string.
      */
    def databasePath(project: String, instance: String, database: String): String = js.native
    
    /**
      * Return a fully-qualified databaseRole resource name string.
      *
      * @param {string} project
      * @param {string} instance
      * @param {string} database
      * @param {string} role
      * @returns {string} Resource name string.
      */
    def databaseRolePath(project: String, instance: String, database: String, role: String): String = js.native
    
    /**
      * Deletes a pending or completed {@link google.spanner.admin.database.v1.Backup|Backup}.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. Name of the backup to delete.
      *   Values are of the form
      *   `projects/<project>/instances/<instance>/backups/<backup>`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.delete_backup.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_DeleteBackup_async
      */
    def deleteBackup(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteBackupRequest], js.UndefOr[js.Object]]] = js.native
    def deleteBackup(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteBackupRequest], js.UndefOr[js.Object]]] = js.native
    def deleteBackup(request: IDeleteBackupRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteBackupRequest], js.UndefOr[js.Object]]] = js.native
    def deleteBackup(
      request: IDeleteBackupRequest,
      callback: Callback[IEmpty, js.UndefOr[IDeleteBackupRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def deleteBackup(request: IDeleteBackupRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteBackupRequest], js.UndefOr[js.Object]]] = js.native
    def deleteBackup(
      request: IDeleteBackupRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDeleteBackupRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Deletes a long-running operation. This method indicates that the client is
      * no longer interested in the operation result. It does not cancel the
      * operation. If the server doesn't support this method, it returns
      * `google.rpc.Code.UNIMPLEMENTED`.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation resource to be deleted.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      * e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      * https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      * details.
      * @param {function(?Error)=} callback
      *   The function which will be called with the result of the API call.
      * @return {Promise} - The promise which resolves when API call finishes.
      *   The promise has a method named "cancel" which cancels the ongoing API
      * call.
      *
      * @example
      * ```
      * const client = longrunning.operationsClient();
      * await client.deleteOperation({name: ''});
      * ```
      */
    def deleteOperation(request: DeleteOperationRequest): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      options: Unit,
      callback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      options: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      options: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def deleteOperation(request: DeleteOperationRequest, options: CallOptions): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      options: CallOptions,
      callback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    
    var descriptors: Descriptors = js.native
    
    /**
      * Drops (aka deletes) a Cloud Spanner database.
      * Completed backups for the database will be retained according to their
      * `expire_time`.
      * Note: Cloud Spanner might continue to accept requests for a few seconds
      * after the database has been deleted.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database to be dropped.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.drop_database.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_DropDatabase_async
      */
    def dropDatabase(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDropDatabaseRequest], js.UndefOr[js.Object]]] = js.native
    def dropDatabase(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDropDatabaseRequest], js.UndefOr[js.Object]]] = js.native
    def dropDatabase(request: IDropDatabaseRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDropDatabaseRequest], js.UndefOr[js.Object]]] = js.native
    def dropDatabase(
      request: IDropDatabaseRequest,
      callback: Callback[IEmpty, js.UndefOr[IDropDatabaseRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def dropDatabase(request: IDropDatabaseRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDropDatabaseRequest], js.UndefOr[js.Object]]] = js.native
    def dropDatabase(
      request: IDropDatabaseRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDropDatabaseRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Gets metadata on a pending or completed {@link google.spanner.admin.database.v1.Backup|Backup}.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. Name of the backup.
      *   Values are of the form
      *   `projects/<project>/instances/<instance>/backups/<backup>`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Backup]{@link google.spanner.admin.database.v1.Backup}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.get_backup.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_GetBackup_async
      */
    def getBackup(): js.Promise[js.Tuple3[IBackup, js.UndefOr[IGetBackupRequest], js.UndefOr[js.Object]]] = js.native
    def getBackup(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IBackup, js.UndefOr[IGetBackupRequest], js.UndefOr[js.Object]]] = js.native
    def getBackup(request: IGetBackupRequest): js.Promise[js.Tuple3[IBackup, js.UndefOr[IGetBackupRequest], js.UndefOr[js.Object]]] = js.native
    def getBackup(
      request: IGetBackupRequest,
      callback: Callback[IBackup, js.UndefOr[IGetBackupRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getBackup(request: IGetBackupRequest, options: CallOptions): js.Promise[js.Tuple3[IBackup, js.UndefOr[IGetBackupRequest], js.UndefOr[js.Object]]] = js.native
    def getBackup(
      request: IGetBackupRequest,
      options: CallOptions,
      callback: Callback[IBackup, js.UndefOr[IGetBackupRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Gets the state of a Cloud Spanner database.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The name of the requested database. Values are of the form
      *   `projects/<project>/instances/<instance>/databases/<database>`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Database]{@link google.spanner.admin.database.v1.Database}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.get_database.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_GetDatabase_async
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
      * Returns the schema of a Cloud Spanner database as a list of formatted
      * DDL statements. This method does not show pending schema updates, those may
      * be queried using the {@link google.longrunning.Operations|Operations} API.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database whose schema we wish to get.
      *   Values are of the form
      *   `projects/<project>/instances/<instance>/databases/<database>`
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [GetDatabaseDdlResponse]{@link google.spanner.admin.database.v1.GetDatabaseDdlResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.get_database_ddl.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_GetDatabaseDdl_async
      */
    def getDatabaseDdl(): js.Promise[
        js.Tuple3[IGetDatabaseDdlResponse, js.UndefOr[IGetDatabaseDdlRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getDatabaseDdl(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IGetDatabaseDdlResponse, js.UndefOr[IGetDatabaseDdlRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getDatabaseDdl(request: IGetDatabaseDdlRequest): js.Promise[
        js.Tuple3[IGetDatabaseDdlResponse, js.UndefOr[IGetDatabaseDdlRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getDatabaseDdl(
      request: IGetDatabaseDdlRequest,
      callback: Callback[
          IGetDatabaseDdlResponse, 
          js.UndefOr[IGetDatabaseDdlRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def getDatabaseDdl(request: IGetDatabaseDdlRequest, options: CallOptions): js.Promise[
        js.Tuple3[IGetDatabaseDdlResponse, js.UndefOr[IGetDatabaseDdlRequest], js.UndefOr[js.Object]]
      ] = js.native
    def getDatabaseDdl(
      request: IGetDatabaseDdlRequest,
      options: CallOptions,
      callback: Callback[
          IGetDatabaseDdlResponse, 
          js.UndefOr[IGetDatabaseDdlRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Gets the access control policy for a database or backup resource.
      * Returns an empty policy if a database or backup exists but does not have a
      * policy set.
      *
      * Authorization requires `spanner.databases.getIamPolicy` permission on
      * {@link google.iam.v1.GetIamPolicyRequest.resource|resource}.
      * For backups, authorization requires `spanner.backups.getIamPolicy`
      * permission on {@link google.iam.v1.GetIamPolicyRequest.resource|resource}.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy is being requested.
      *   See the operation documentation for the appropriate value for this field.
      * @param {google.iam.v1.GetPolicyOptions} request.options
      *   OPTIONAL: A `GetPolicyOptions` object for specifying options to
      *   `GetIamPolicy`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.get_iam_policy.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_GetIamPolicy_async
      */
    def getIamPolicy(): js.Promise[js.Tuple3[IPolicy, js.UndefOr[IGetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def getIamPolicy(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IPolicy, js.UndefOr[IGetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def getIamPolicy(request: IGetIamPolicyRequest): js.Promise[js.Tuple3[IPolicy, js.UndefOr[IGetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def getIamPolicy(
      request: IGetIamPolicyRequest,
      callback: Callback[IPolicy, js.UndefOr[IGetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getIamPolicy(request: IGetIamPolicyRequest, options: CallOptions): js.Promise[js.Tuple3[IPolicy, js.UndefOr[IGetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def getIamPolicy(
      request: IGetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[IPolicy, js.UndefOr[IGetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Gets the latest state of a long-running operation.  Clients can use this
      * method to poll the operation result at intervals as recommended by the API
      * service.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation resource.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      *   e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      *   https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      *   details.
      * @param {function(?Error, ?Object)=} callback
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is an object representing
      * [google.longrunning.Operation]{@link
      * external:"google.longrunning.Operation"}.
      * @return {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      * [google.longrunning.Operation]{@link
      * external:"google.longrunning.Operation"}. The promise has a method named
      * "cancel" which cancels the ongoing API call.
      *
      * @example
      * ```
      * const client = longrunning.operationsClient();
      * const name = '';
      * const [response] = await client.getOperation({name});
      * // doThingsWith(response)
      * ```
      */
    def getOperation(request: GetOperationRequest): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      options: Unit,
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      options: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      options: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    def getOperation(request: GetOperationRequest, options: CallOptions): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      options: CallOptions,
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    
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
      * Return a fully-qualified instance resource name string.
      *
      * @param {string} project
      * @param {string} instance
      * @returns {string} Resource name string.
      */
    def instancePath(project: String, instance: String): String = js.native
    
    /**
      * Lists the backup {@link google.longrunning.Operation|long-running operations} in
      * the given instance. A backup operation has a name of the form
      * `projects/<project>/instances/<instance>/backups/<backup>/operations/<operation>`.
      * The long-running operation
      * {@link google.longrunning.Operation.metadata|metadata} field type
      * `metadata.type_url` describes the type of the metadata. Operations returned
      * include those that have completed/failed/canceled within the last 7 days,
      * and pending operations. Operations returned are ordered by
      * `operation.metadata.value.progress.start_time` in descending order starting
      * from the most recently started operation.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance of the backup operations. Values are of
      *   the form `projects/<project>/instances/<instance>`.
      * @param {string} request.filter
      *   An expression that filters the list of returned backup operations.
      *
      *   A filter expression consists of a field name, a
      *   comparison operator, and a value for filtering.
      *   The value must be a string, a number, or a boolean. The comparison operator
      *   must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`.
      *   Colon `:` is the contains operator. Filter rules are not case sensitive.
      *
      *   The following fields in the {@link google.longrunning.Operation|operation}
      *   are eligible for filtering:
      *
      *     * `name` - The name of the long-running operation
      *     * `done` - False if the operation is in progress, else true.
      *     * `metadata.@type` - the type of metadata. For example, the type string
      *        for {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata} is
      *        `type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata`.
      *     * `metadata.<field_name>` - any field in metadata.value.
      *        `metadata.@type` must be specified first if filtering on metadata
      *        fields.
      *     * `error` - Error associated with the long-running operation.
      *     * `response.@type` - the type of response.
      *     * `response.<field_name>` - any field in response.value.
      *
      *   You can combine multiple expressions by enclosing each expression in
      *   parentheses. By default, expressions are combined with AND logic, but
      *   you can specify AND, OR, and NOT logic explicitly.
      *
      *   Here are a few examples:
      *
      *     * `done:true` - The operation is complete.
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \
      *        `metadata.database:prod` - Returns operations where:
      *        * The operation's metadata type is {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata}.
      *        * The database the backup was taken from has a name containing the
      *        string "prod".
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \
      *       `(metadata.name:howl) AND` \
      *       `(metadata.progress.start_time < \"2018-03-28T14:50:00Z\") AND` \
      *       `(error:*)` - Returns operations where:
      *       * The operation's metadata type is {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata}.
      *       * The backup name contains the string "howl".
      *       * The operation started before 2018-03-28T14:50:00Z.
      *       * The operation resulted in an error.
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CopyBackupMetadata) AND` \
      *       `(metadata.source_backup:test) AND` \
      *       `(metadata.progress.start_time < \"2022-01-18T14:50:00Z\") AND` \
      *       `(error:*)` - Returns operations where:
      *       * The operation's metadata type is {@link google.spanner.admin.database.v1.CopyBackupMetadata|CopyBackupMetadata}.
      *       * The source backup of the copied backup name contains the string
      *       "test".
      *       * The operation started before 2022-01-18T14:50:00Z.
      *       * The operation resulted in an error.
      *     * `((metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \
      *       `(metadata.database:test_db)) OR` \
      *       `((metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CopyBackupMetadata)
      *       AND` \
      *       `(metadata.source_backup:test_bkp)) AND` \
      *       `(error:*)` - Returns operations where:
      *       * The operation's metadata matches either of criteria:
      *         * The operation's metadata type is {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata} AND the
      *         database the backup was taken from has name containing string
      *         "test_db"
      *         * The operation's metadata type is {@link google.spanner.admin.database.v1.CopyBackupMetadata|CopyBackupMetadata} AND the
      *         backup the backup was copied from has name containing string
      *         "test_bkp"
      *       * The operation resulted in an error.
      * @param {number} request.pageSize
      *   Number of operations to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListBackupOperationsResponse.next_page_token|next_page_token}
      *   from a previous {@link google.spanner.admin.database.v1.ListBackupOperationsResponse|ListBackupOperationsResponse} to the
      *   same `parent` and with the same `filter`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Operation]{@link google.longrunning.Operation}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listBackupOperationsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listBackupOperations(): js.Promise[
        js.Tuple3[
          js.Array[IOperation], 
          IListBackupOperationsRequest | Null, 
          IListBackupOperationsResponse
        ]
      ] = js.native
    def listBackupOperations(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[IOperation], 
          IListBackupOperationsRequest | Null, 
          IListBackupOperationsResponse
        ]
      ] = js.native
    def listBackupOperations(request: IListBackupOperationsRequest): js.Promise[
        js.Tuple3[
          js.Array[IOperation], 
          IListBackupOperationsRequest | Null, 
          IListBackupOperationsResponse
        ]
      ] = js.native
    def listBackupOperations(
      request: IListBackupOperationsRequest,
      callback: PaginationCallback[
          IListBackupOperationsRequest, 
          js.UndefOr[IListBackupOperationsResponse | Null], 
          IOperation
        ]
    ): Unit = js.native
    def listBackupOperations(request: IListBackupOperationsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[IOperation], 
          IListBackupOperationsRequest | Null, 
          IListBackupOperationsResponse
        ]
      ] = js.native
    def listBackupOperations(
      request: IListBackupOperationsRequest,
      options: CallOptions,
      callback: PaginationCallback[
          IListBackupOperationsRequest, 
          js.UndefOr[IListBackupOperationsResponse | Null], 
          IOperation
        ]
    ): Unit = js.native
    
    /**
      * Equivalent to `listBackupOperations`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance of the backup operations. Values are of
      *   the form `projects/<project>/instances/<instance>`.
      * @param {string} request.filter
      *   An expression that filters the list of returned backup operations.
      *
      *   A filter expression consists of a field name, a
      *   comparison operator, and a value for filtering.
      *   The value must be a string, a number, or a boolean. The comparison operator
      *   must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`.
      *   Colon `:` is the contains operator. Filter rules are not case sensitive.
      *
      *   The following fields in the {@link google.longrunning.Operation|operation}
      *   are eligible for filtering:
      *
      *     * `name` - The name of the long-running operation
      *     * `done` - False if the operation is in progress, else true.
      *     * `metadata.@type` - the type of metadata. For example, the type string
      *        for {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata} is
      *        `type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata`.
      *     * `metadata.<field_name>` - any field in metadata.value.
      *        `metadata.@type` must be specified first if filtering on metadata
      *        fields.
      *     * `error` - Error associated with the long-running operation.
      *     * `response.@type` - the type of response.
      *     * `response.<field_name>` - any field in response.value.
      *
      *   You can combine multiple expressions by enclosing each expression in
      *   parentheses. By default, expressions are combined with AND logic, but
      *   you can specify AND, OR, and NOT logic explicitly.
      *
      *   Here are a few examples:
      *
      *     * `done:true` - The operation is complete.
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \
      *        `metadata.database:prod` - Returns operations where:
      *        * The operation's metadata type is {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata}.
      *        * The database the backup was taken from has a name containing the
      *        string "prod".
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \
      *       `(metadata.name:howl) AND` \
      *       `(metadata.progress.start_time < \"2018-03-28T14:50:00Z\") AND` \
      *       `(error:*)` - Returns operations where:
      *       * The operation's metadata type is {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata}.
      *       * The backup name contains the string "howl".
      *       * The operation started before 2018-03-28T14:50:00Z.
      *       * The operation resulted in an error.
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CopyBackupMetadata) AND` \
      *       `(metadata.source_backup:test) AND` \
      *       `(metadata.progress.start_time < \"2022-01-18T14:50:00Z\") AND` \
      *       `(error:*)` - Returns operations where:
      *       * The operation's metadata type is {@link google.spanner.admin.database.v1.CopyBackupMetadata|CopyBackupMetadata}.
      *       * The source backup of the copied backup name contains the string
      *       "test".
      *       * The operation started before 2022-01-18T14:50:00Z.
      *       * The operation resulted in an error.
      *     * `((metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \
      *       `(metadata.database:test_db)) OR` \
      *       `((metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CopyBackupMetadata)
      *       AND` \
      *       `(metadata.source_backup:test_bkp)) AND` \
      *       `(error:*)` - Returns operations where:
      *       * The operation's metadata matches either of criteria:
      *         * The operation's metadata type is {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata} AND the
      *         database the backup was taken from has name containing string
      *         "test_db"
      *         * The operation's metadata type is {@link google.spanner.admin.database.v1.CopyBackupMetadata|CopyBackupMetadata} AND the
      *         backup the backup was copied from has name containing string
      *         "test_bkp"
      *       * The operation resulted in an error.
      * @param {number} request.pageSize
      *   Number of operations to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListBackupOperationsResponse.next_page_token|next_page_token}
      *   from a previous {@link google.spanner.admin.database.v1.ListBackupOperationsResponse|ListBackupOperationsResponse} to the
      *   same `parent` and with the same `filter`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Operation]{@link google.longrunning.Operation}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.list_backup_operations.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_ListBackupOperations_async
      */
    def listBackupOperationsAsync(): AsyncIterable[IOperation] = js.native
    def listBackupOperationsAsync(request: Unit, options: CallOptions): AsyncIterable[IOperation] = js.native
    def listBackupOperationsAsync(request: IListBackupOperationsRequest): AsyncIterable[IOperation] = js.native
    def listBackupOperationsAsync(request: IListBackupOperationsRequest, options: CallOptions): AsyncIterable[IOperation] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance of the backup operations. Values are of
      *   the form `projects/<project>/instances/<instance>`.
      * @param {string} request.filter
      *   An expression that filters the list of returned backup operations.
      *
      *   A filter expression consists of a field name, a
      *   comparison operator, and a value for filtering.
      *   The value must be a string, a number, or a boolean. The comparison operator
      *   must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`.
      *   Colon `:` is the contains operator. Filter rules are not case sensitive.
      *
      *   The following fields in the {@link google.longrunning.Operation|operation}
      *   are eligible for filtering:
      *
      *     * `name` - The name of the long-running operation
      *     * `done` - False if the operation is in progress, else true.
      *     * `metadata.@type` - the type of metadata. For example, the type string
      *        for {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata} is
      *        `type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata`.
      *     * `metadata.<field_name>` - any field in metadata.value.
      *        `metadata.@type` must be specified first if filtering on metadata
      *        fields.
      *     * `error` - Error associated with the long-running operation.
      *     * `response.@type` - the type of response.
      *     * `response.<field_name>` - any field in response.value.
      *
      *   You can combine multiple expressions by enclosing each expression in
      *   parentheses. By default, expressions are combined with AND logic, but
      *   you can specify AND, OR, and NOT logic explicitly.
      *
      *   Here are a few examples:
      *
      *     * `done:true` - The operation is complete.
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \
      *        `metadata.database:prod` - Returns operations where:
      *        * The operation's metadata type is {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata}.
      *        * The database the backup was taken from has a name containing the
      *        string "prod".
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \
      *       `(metadata.name:howl) AND` \
      *       `(metadata.progress.start_time < \"2018-03-28T14:50:00Z\") AND` \
      *       `(error:*)` - Returns operations where:
      *       * The operation's metadata type is {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata}.
      *       * The backup name contains the string "howl".
      *       * The operation started before 2018-03-28T14:50:00Z.
      *       * The operation resulted in an error.
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CopyBackupMetadata) AND` \
      *       `(metadata.source_backup:test) AND` \
      *       `(metadata.progress.start_time < \"2022-01-18T14:50:00Z\") AND` \
      *       `(error:*)` - Returns operations where:
      *       * The operation's metadata type is {@link google.spanner.admin.database.v1.CopyBackupMetadata|CopyBackupMetadata}.
      *       * The source backup of the copied backup name contains the string
      *       "test".
      *       * The operation started before 2022-01-18T14:50:00Z.
      *       * The operation resulted in an error.
      *     * `((metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CreateBackupMetadata) AND` \
      *       `(metadata.database:test_db)) OR` \
      *       `((metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.CopyBackupMetadata)
      *       AND` \
      *       `(metadata.source_backup:test_bkp)) AND` \
      *       `(error:*)` - Returns operations where:
      *       * The operation's metadata matches either of criteria:
      *         * The operation's metadata type is {@link google.spanner.admin.database.v1.CreateBackupMetadata|CreateBackupMetadata} AND the
      *         database the backup was taken from has name containing string
      *         "test_db"
      *         * The operation's metadata type is {@link google.spanner.admin.database.v1.CopyBackupMetadata|CopyBackupMetadata} AND the
      *         backup the backup was copied from has name containing string
      *         "test_bkp"
      *       * The operation resulted in an error.
      * @param {number} request.pageSize
      *   Number of operations to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListBackupOperationsResponse.next_page_token|next_page_token}
      *   from a previous {@link google.spanner.admin.database.v1.ListBackupOperationsResponse|ListBackupOperationsResponse} to the
      *   same `parent` and with the same `filter`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Operation]{@link google.longrunning.Operation} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listBackupOperationsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listBackupOperationsStream(): Transform = js.native
    def listBackupOperationsStream(request: Unit, options: CallOptions): Transform = js.native
    def listBackupOperationsStream(request: IListBackupOperationsRequest): Transform = js.native
    def listBackupOperationsStream(request: IListBackupOperationsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists completed and pending backups.
      * Backups returned are ordered by `create_time` in descending order,
      * starting from the most recent `create_time`.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance to list backups from.  Values are of the
      *   form `projects/<project>/instances/<instance>`.
      * @param {string} request.filter
      *   An expression that filters the list of returned backups.
      *
      *   A filter expression consists of a field name, a comparison operator, and a
      *   value for filtering.
      *   The value must be a string, a number, or a boolean. The comparison operator
      *   must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`.
      *   Colon `:` is the contains operator. Filter rules are not case sensitive.
      *
      *   The following fields in the {@link google.spanner.admin.database.v1.Backup|Backup} are eligible for filtering:
      *
      *     * `name`
      *     * `database`
      *     * `state`
      *     * `create_time`  (and values are of the format YYYY-MM-DDTHH:MM:SSZ)
      *     * `expire_time`  (and values are of the format YYYY-MM-DDTHH:MM:SSZ)
      *     * `version_time` (and values are of the format YYYY-MM-DDTHH:MM:SSZ)
      *     * `size_bytes`
      *
      *   You can combine multiple expressions by enclosing each expression in
      *   parentheses. By default, expressions are combined with AND logic, but
      *   you can specify AND, OR, and NOT logic explicitly.
      *
      *   Here are a few examples:
      *
      *     * `name:Howl` - The backup's name contains the string "howl".
      *     * `database:prod`
      *            - The database's name contains the string "prod".
      *     * `state:CREATING` - The backup is pending creation.
      *     * `state:READY` - The backup is fully created and ready for use.
      *     * `(name:howl) AND (create_time < \"2018-03-28T14:50:00Z\")`
      *            - The backup name contains the string "howl" and `create_time`
      *                of the backup is before 2018-03-28T14:50:00Z.
      *     * `expire_time < \"2018-03-28T14:50:00Z\"`
      *            - The backup `expire_time` is before 2018-03-28T14:50:00Z.
      *     * `size_bytes > 10000000000` - The backup's size is greater than 10GB
      * @param {number} request.pageSize
      *   Number of backups to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListBackupsResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.database.v1.ListBackupsResponse|ListBackupsResponse} to the same `parent` and with the same
      *   `filter`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Backup]{@link google.spanner.admin.database.v1.Backup}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listBackupsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listBackups(): js.Promise[js.Tuple3[js.Array[IBackup], IListBackupsRequest | Null, IListBackupsResponse]] = js.native
    def listBackups(request: Unit, options: CallOptions): js.Promise[js.Tuple3[js.Array[IBackup], IListBackupsRequest | Null, IListBackupsResponse]] = js.native
    def listBackups(request: IListBackupsRequest): js.Promise[js.Tuple3[js.Array[IBackup], IListBackupsRequest | Null, IListBackupsResponse]] = js.native
    def listBackups(
      request: IListBackupsRequest,
      callback: PaginationCallback[IListBackupsRequest, js.UndefOr[IListBackupsResponse | Null], IBackup]
    ): Unit = js.native
    def listBackups(request: IListBackupsRequest, options: CallOptions): js.Promise[js.Tuple3[js.Array[IBackup], IListBackupsRequest | Null, IListBackupsResponse]] = js.native
    def listBackups(
      request: IListBackupsRequest,
      options: CallOptions,
      callback: PaginationCallback[IListBackupsRequest, js.UndefOr[IListBackupsResponse | Null], IBackup]
    ): Unit = js.native
    
    /**
      * Equivalent to `listBackups`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance to list backups from.  Values are of the
      *   form `projects/<project>/instances/<instance>`.
      * @param {string} request.filter
      *   An expression that filters the list of returned backups.
      *
      *   A filter expression consists of a field name, a comparison operator, and a
      *   value for filtering.
      *   The value must be a string, a number, or a boolean. The comparison operator
      *   must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`.
      *   Colon `:` is the contains operator. Filter rules are not case sensitive.
      *
      *   The following fields in the {@link google.spanner.admin.database.v1.Backup|Backup} are eligible for filtering:
      *
      *     * `name`
      *     * `database`
      *     * `state`
      *     * `create_time`  (and values are of the format YYYY-MM-DDTHH:MM:SSZ)
      *     * `expire_time`  (and values are of the format YYYY-MM-DDTHH:MM:SSZ)
      *     * `version_time` (and values are of the format YYYY-MM-DDTHH:MM:SSZ)
      *     * `size_bytes`
      *
      *   You can combine multiple expressions by enclosing each expression in
      *   parentheses. By default, expressions are combined with AND logic, but
      *   you can specify AND, OR, and NOT logic explicitly.
      *
      *   Here are a few examples:
      *
      *     * `name:Howl` - The backup's name contains the string "howl".
      *     * `database:prod`
      *            - The database's name contains the string "prod".
      *     * `state:CREATING` - The backup is pending creation.
      *     * `state:READY` - The backup is fully created and ready for use.
      *     * `(name:howl) AND (create_time < \"2018-03-28T14:50:00Z\")`
      *            - The backup name contains the string "howl" and `create_time`
      *                of the backup is before 2018-03-28T14:50:00Z.
      *     * `expire_time < \"2018-03-28T14:50:00Z\"`
      *            - The backup `expire_time` is before 2018-03-28T14:50:00Z.
      *     * `size_bytes > 10000000000` - The backup's size is greater than 10GB
      * @param {number} request.pageSize
      *   Number of backups to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListBackupsResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.database.v1.ListBackupsResponse|ListBackupsResponse} to the same `parent` and with the same
      *   `filter`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Backup]{@link google.spanner.admin.database.v1.Backup}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.list_backups.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_ListBackups_async
      */
    def listBackupsAsync(): AsyncIterable[IBackup] = js.native
    def listBackupsAsync(request: Unit, options: CallOptions): AsyncIterable[IBackup] = js.native
    def listBackupsAsync(request: IListBackupsRequest): AsyncIterable[IBackup] = js.native
    def listBackupsAsync(request: IListBackupsRequest, options: CallOptions): AsyncIterable[IBackup] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance to list backups from.  Values are of the
      *   form `projects/<project>/instances/<instance>`.
      * @param {string} request.filter
      *   An expression that filters the list of returned backups.
      *
      *   A filter expression consists of a field name, a comparison operator, and a
      *   value for filtering.
      *   The value must be a string, a number, or a boolean. The comparison operator
      *   must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`.
      *   Colon `:` is the contains operator. Filter rules are not case sensitive.
      *
      *   The following fields in the {@link google.spanner.admin.database.v1.Backup|Backup} are eligible for filtering:
      *
      *     * `name`
      *     * `database`
      *     * `state`
      *     * `create_time`  (and values are of the format YYYY-MM-DDTHH:MM:SSZ)
      *     * `expire_time`  (and values are of the format YYYY-MM-DDTHH:MM:SSZ)
      *     * `version_time` (and values are of the format YYYY-MM-DDTHH:MM:SSZ)
      *     * `size_bytes`
      *
      *   You can combine multiple expressions by enclosing each expression in
      *   parentheses. By default, expressions are combined with AND logic, but
      *   you can specify AND, OR, and NOT logic explicitly.
      *
      *   Here are a few examples:
      *
      *     * `name:Howl` - The backup's name contains the string "howl".
      *     * `database:prod`
      *            - The database's name contains the string "prod".
      *     * `state:CREATING` - The backup is pending creation.
      *     * `state:READY` - The backup is fully created and ready for use.
      *     * `(name:howl) AND (create_time < \"2018-03-28T14:50:00Z\")`
      *            - The backup name contains the string "howl" and `create_time`
      *                of the backup is before 2018-03-28T14:50:00Z.
      *     * `expire_time < \"2018-03-28T14:50:00Z\"`
      *            - The backup `expire_time` is before 2018-03-28T14:50:00Z.
      *     * `size_bytes > 10000000000` - The backup's size is greater than 10GB
      * @param {number} request.pageSize
      *   Number of backups to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListBackupsResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.database.v1.ListBackupsResponse|ListBackupsResponse} to the same `parent` and with the same
      *   `filter`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Backup]{@link google.spanner.admin.database.v1.Backup} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listBackupsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listBackupsStream(): Transform = js.native
    def listBackupsStream(request: Unit, options: CallOptions): Transform = js.native
    def listBackupsStream(request: IListBackupsRequest): Transform = js.native
    def listBackupsStream(request: IListBackupsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists database {@link google.longrunning.Operation|longrunning-operations}.
      * A database operation has a name of the form
      * `projects/<project>/instances/<instance>/databases/<database>/operations/<operation>`.
      * The long-running operation
      * {@link google.longrunning.Operation.metadata|metadata} field type
      * `metadata.type_url` describes the type of the metadata. Operations returned
      * include those that have completed/failed/canceled within the last 7 days,
      * and pending operations.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance of the database operations.
      *   Values are of the form `projects/<project>/instances/<instance>`.
      * @param {string} request.filter
      *   An expression that filters the list of returned operations.
      *
      *   A filter expression consists of a field name, a
      *   comparison operator, and a value for filtering.
      *   The value must be a string, a number, or a boolean. The comparison operator
      *   must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`.
      *   Colon `:` is the contains operator. Filter rules are not case sensitive.
      *
      *   The following fields in the {@link google.longrunning.Operation|Operation}
      *   are eligible for filtering:
      *
      *     * `name` - The name of the long-running operation
      *     * `done` - False if the operation is in progress, else true.
      *     * `metadata.@type` - the type of metadata. For example, the type string
      *        for {@link google.spanner.admin.database.v1.RestoreDatabaseMetadata|RestoreDatabaseMetadata} is
      *        `type.googleapis.com/google.spanner.admin.database.v1.RestoreDatabaseMetadata`.
      *     * `metadata.<field_name>` - any field in metadata.value.
      *        `metadata.@type` must be specified first, if filtering on metadata
      *        fields.
      *     * `error` - Error associated with the long-running operation.
      *     * `response.@type` - the type of response.
      *     * `response.<field_name>` - any field in response.value.
      *
      *   You can combine multiple expressions by enclosing each expression in
      *   parentheses. By default, expressions are combined with AND logic. However,
      *   you can specify AND, OR, and NOT logic explicitly.
      *
      *   Here are a few examples:
      *
      *     * `done:true` - The operation is complete.
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.RestoreDatabaseMetadata) AND` \
      *       `(metadata.source_type:BACKUP) AND` \
      *       `(metadata.backup_info.backup:backup_howl) AND` \
      *       `(metadata.name:restored_howl) AND` \
      *       `(metadata.progress.start_time < \"2018-03-28T14:50:00Z\") AND` \
      *       `(error:*)` - Return operations where:
      *       * The operation's metadata type is {@link google.spanner.admin.database.v1.RestoreDatabaseMetadata|RestoreDatabaseMetadata}.
      *       * The database is restored from a backup.
      *       * The backup name contains "backup_howl".
      *       * The restored database's name contains "restored_howl".
      *       * The operation started before 2018-03-28T14:50:00Z.
      *       * The operation resulted in an error.
      * @param {number} request.pageSize
      *   Number of operations to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListDatabaseOperationsResponse.next_page_token|next_page_token}
      *   from a previous {@link google.spanner.admin.database.v1.ListDatabaseOperationsResponse|ListDatabaseOperationsResponse} to the
      *   same `parent` and with the same `filter`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Operation]{@link google.longrunning.Operation}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listDatabaseOperationsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listDatabaseOperations(): js.Promise[
        js.Tuple3[
          js.Array[IOperation], 
          IListDatabaseOperationsRequest | Null, 
          IListDatabaseOperationsResponse
        ]
      ] = js.native
    def listDatabaseOperations(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[IOperation], 
          IListDatabaseOperationsRequest | Null, 
          IListDatabaseOperationsResponse
        ]
      ] = js.native
    def listDatabaseOperations(request: IListDatabaseOperationsRequest): js.Promise[
        js.Tuple3[
          js.Array[IOperation], 
          IListDatabaseOperationsRequest | Null, 
          IListDatabaseOperationsResponse
        ]
      ] = js.native
    def listDatabaseOperations(
      request: IListDatabaseOperationsRequest,
      callback: PaginationCallback[
          IListDatabaseOperationsRequest, 
          js.UndefOr[IListDatabaseOperationsResponse | Null], 
          IOperation
        ]
    ): Unit = js.native
    def listDatabaseOperations(request: IListDatabaseOperationsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[IOperation], 
          IListDatabaseOperationsRequest | Null, 
          IListDatabaseOperationsResponse
        ]
      ] = js.native
    def listDatabaseOperations(
      request: IListDatabaseOperationsRequest,
      options: CallOptions,
      callback: PaginationCallback[
          IListDatabaseOperationsRequest, 
          js.UndefOr[IListDatabaseOperationsResponse | Null], 
          IOperation
        ]
    ): Unit = js.native
    
    /**
      * Equivalent to `listDatabaseOperations`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance of the database operations.
      *   Values are of the form `projects/<project>/instances/<instance>`.
      * @param {string} request.filter
      *   An expression that filters the list of returned operations.
      *
      *   A filter expression consists of a field name, a
      *   comparison operator, and a value for filtering.
      *   The value must be a string, a number, or a boolean. The comparison operator
      *   must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`.
      *   Colon `:` is the contains operator. Filter rules are not case sensitive.
      *
      *   The following fields in the {@link google.longrunning.Operation|Operation}
      *   are eligible for filtering:
      *
      *     * `name` - The name of the long-running operation
      *     * `done` - False if the operation is in progress, else true.
      *     * `metadata.@type` - the type of metadata. For example, the type string
      *        for {@link google.spanner.admin.database.v1.RestoreDatabaseMetadata|RestoreDatabaseMetadata} is
      *        `type.googleapis.com/google.spanner.admin.database.v1.RestoreDatabaseMetadata`.
      *     * `metadata.<field_name>` - any field in metadata.value.
      *        `metadata.@type` must be specified first, if filtering on metadata
      *        fields.
      *     * `error` - Error associated with the long-running operation.
      *     * `response.@type` - the type of response.
      *     * `response.<field_name>` - any field in response.value.
      *
      *   You can combine multiple expressions by enclosing each expression in
      *   parentheses. By default, expressions are combined with AND logic. However,
      *   you can specify AND, OR, and NOT logic explicitly.
      *
      *   Here are a few examples:
      *
      *     * `done:true` - The operation is complete.
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.RestoreDatabaseMetadata) AND` \
      *       `(metadata.source_type:BACKUP) AND` \
      *       `(metadata.backup_info.backup:backup_howl) AND` \
      *       `(metadata.name:restored_howl) AND` \
      *       `(metadata.progress.start_time < \"2018-03-28T14:50:00Z\") AND` \
      *       `(error:*)` - Return operations where:
      *       * The operation's metadata type is {@link google.spanner.admin.database.v1.RestoreDatabaseMetadata|RestoreDatabaseMetadata}.
      *       * The database is restored from a backup.
      *       * The backup name contains "backup_howl".
      *       * The restored database's name contains "restored_howl".
      *       * The operation started before 2018-03-28T14:50:00Z.
      *       * The operation resulted in an error.
      * @param {number} request.pageSize
      *   Number of operations to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListDatabaseOperationsResponse.next_page_token|next_page_token}
      *   from a previous {@link google.spanner.admin.database.v1.ListDatabaseOperationsResponse|ListDatabaseOperationsResponse} to the
      *   same `parent` and with the same `filter`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Operation]{@link google.longrunning.Operation}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.list_database_operations.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_ListDatabaseOperations_async
      */
    def listDatabaseOperationsAsync(): AsyncIterable[IOperation] = js.native
    def listDatabaseOperationsAsync(request: Unit, options: CallOptions): AsyncIterable[IOperation] = js.native
    def listDatabaseOperationsAsync(request: IListDatabaseOperationsRequest): AsyncIterable[IOperation] = js.native
    def listDatabaseOperationsAsync(request: IListDatabaseOperationsRequest, options: CallOptions): AsyncIterable[IOperation] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance of the database operations.
      *   Values are of the form `projects/<project>/instances/<instance>`.
      * @param {string} request.filter
      *   An expression that filters the list of returned operations.
      *
      *   A filter expression consists of a field name, a
      *   comparison operator, and a value for filtering.
      *   The value must be a string, a number, or a boolean. The comparison operator
      *   must be one of: `<`, `>`, `<=`, `>=`, `!=`, `=`, or `:`.
      *   Colon `:` is the contains operator. Filter rules are not case sensitive.
      *
      *   The following fields in the {@link google.longrunning.Operation|Operation}
      *   are eligible for filtering:
      *
      *     * `name` - The name of the long-running operation
      *     * `done` - False if the operation is in progress, else true.
      *     * `metadata.@type` - the type of metadata. For example, the type string
      *        for {@link google.spanner.admin.database.v1.RestoreDatabaseMetadata|RestoreDatabaseMetadata} is
      *        `type.googleapis.com/google.spanner.admin.database.v1.RestoreDatabaseMetadata`.
      *     * `metadata.<field_name>` - any field in metadata.value.
      *        `metadata.@type` must be specified first, if filtering on metadata
      *        fields.
      *     * `error` - Error associated with the long-running operation.
      *     * `response.@type` - the type of response.
      *     * `response.<field_name>` - any field in response.value.
      *
      *   You can combine multiple expressions by enclosing each expression in
      *   parentheses. By default, expressions are combined with AND logic. However,
      *   you can specify AND, OR, and NOT logic explicitly.
      *
      *   Here are a few examples:
      *
      *     * `done:true` - The operation is complete.
      *     * `(metadata.@type=type.googleapis.com/google.spanner.admin.database.v1.RestoreDatabaseMetadata) AND` \
      *       `(metadata.source_type:BACKUP) AND` \
      *       `(metadata.backup_info.backup:backup_howl) AND` \
      *       `(metadata.name:restored_howl) AND` \
      *       `(metadata.progress.start_time < \"2018-03-28T14:50:00Z\") AND` \
      *       `(error:*)` - Return operations where:
      *       * The operation's metadata type is {@link google.spanner.admin.database.v1.RestoreDatabaseMetadata|RestoreDatabaseMetadata}.
      *       * The database is restored from a backup.
      *       * The backup name contains "backup_howl".
      *       * The restored database's name contains "restored_howl".
      *       * The operation started before 2018-03-28T14:50:00Z.
      *       * The operation resulted in an error.
      * @param {number} request.pageSize
      *   Number of operations to be returned in the response. If 0 or
      *   less, defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListDatabaseOperationsResponse.next_page_token|next_page_token}
      *   from a previous {@link google.spanner.admin.database.v1.ListDatabaseOperationsResponse|ListDatabaseOperationsResponse} to the
      *   same `parent` and with the same `filter`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Operation]{@link google.longrunning.Operation} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listDatabaseOperationsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listDatabaseOperationsStream(): Transform = js.native
    def listDatabaseOperationsStream(request: Unit, options: CallOptions): Transform = js.native
    def listDatabaseOperationsStream(request: IListDatabaseOperationsRequest): Transform = js.native
    def listDatabaseOperationsStream(request: IListDatabaseOperationsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists Cloud Spanner database roles.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The database whose roles should be listed.
      *   Values are of the form
      *   `projects/<project>/instances/<instance>/databases/<database>/databaseRoles`.
      * @param {number} request.pageSize
      *   Number of database roles to be returned in the response. If 0 or less,
      *   defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListDatabaseRolesResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.database.v1.ListDatabaseRolesResponse|ListDatabaseRolesResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [DatabaseRole]{@link google.spanner.admin.database.v1.DatabaseRole}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listDatabaseRolesAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listDatabaseRoles(): js.Promise[
        js.Tuple3[
          js.Array[IDatabaseRole], 
          IListDatabaseRolesRequest | Null, 
          IListDatabaseRolesResponse
        ]
      ] = js.native
    def listDatabaseRoles(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[IDatabaseRole], 
          IListDatabaseRolesRequest | Null, 
          IListDatabaseRolesResponse
        ]
      ] = js.native
    def listDatabaseRoles(request: IListDatabaseRolesRequest): js.Promise[
        js.Tuple3[
          js.Array[IDatabaseRole], 
          IListDatabaseRolesRequest | Null, 
          IListDatabaseRolesResponse
        ]
      ] = js.native
    def listDatabaseRoles(
      request: IListDatabaseRolesRequest,
      callback: PaginationCallback[
          IListDatabaseRolesRequest, 
          js.UndefOr[IListDatabaseRolesResponse | Null], 
          IDatabaseRole
        ]
    ): Unit = js.native
    def listDatabaseRoles(request: IListDatabaseRolesRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          js.Array[IDatabaseRole], 
          IListDatabaseRolesRequest | Null, 
          IListDatabaseRolesResponse
        ]
      ] = js.native
    def listDatabaseRoles(
      request: IListDatabaseRolesRequest,
      options: CallOptions,
      callback: PaginationCallback[
          IListDatabaseRolesRequest, 
          js.UndefOr[IListDatabaseRolesResponse | Null], 
          IDatabaseRole
        ]
    ): Unit = js.native
    
    /**
      * Equivalent to `listDatabaseRoles`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The database whose roles should be listed.
      *   Values are of the form
      *   `projects/<project>/instances/<instance>/databases/<database>/databaseRoles`.
      * @param {number} request.pageSize
      *   Number of database roles to be returned in the response. If 0 or less,
      *   defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListDatabaseRolesResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.database.v1.ListDatabaseRolesResponse|ListDatabaseRolesResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [DatabaseRole]{@link google.spanner.admin.database.v1.DatabaseRole}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.list_database_roles.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_ListDatabaseRoles_async
      */
    def listDatabaseRolesAsync(): AsyncIterable[IDatabaseRole] = js.native
    def listDatabaseRolesAsync(request: Unit, options: CallOptions): AsyncIterable[IDatabaseRole] = js.native
    def listDatabaseRolesAsync(request: IListDatabaseRolesRequest): AsyncIterable[IDatabaseRole] = js.native
    def listDatabaseRolesAsync(request: IListDatabaseRolesRequest, options: CallOptions): AsyncIterable[IDatabaseRole] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The database whose roles should be listed.
      *   Values are of the form
      *   `projects/<project>/instances/<instance>/databases/<database>/databaseRoles`.
      * @param {number} request.pageSize
      *   Number of database roles to be returned in the response. If 0 or less,
      *   defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListDatabaseRolesResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.database.v1.ListDatabaseRolesResponse|ListDatabaseRolesResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [DatabaseRole]{@link google.spanner.admin.database.v1.DatabaseRole} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listDatabaseRolesAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listDatabaseRolesStream(): Transform = js.native
    def listDatabaseRolesStream(request: Unit, options: CallOptions): Transform = js.native
    def listDatabaseRolesStream(request: IListDatabaseRolesRequest): Transform = js.native
    def listDatabaseRolesStream(request: IListDatabaseRolesRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists Cloud Spanner databases.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance whose databases should be listed.
      *   Values are of the form `projects/<project>/instances/<instance>`.
      * @param {number} request.pageSize
      *   Number of databases to be returned in the response. If 0 or less,
      *   defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListDatabasesResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.database.v1.ListDatabasesResponse|ListDatabasesResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Database]{@link google.spanner.admin.database.v1.Database}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listDatabasesAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listDatabases(): js.Promise[
        js.Tuple3[js.Array[IDatabase], IListDatabasesRequest | Null, IListDatabasesResponse]
      ] = js.native
    def listDatabases(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[IDatabase], IListDatabasesRequest | Null, IListDatabasesResponse]
      ] = js.native
    def listDatabases(request: IListDatabasesRequest): js.Promise[
        js.Tuple3[js.Array[IDatabase], IListDatabasesRequest | Null, IListDatabasesResponse]
      ] = js.native
    def listDatabases(
      request: IListDatabasesRequest,
      callback: PaginationCallback[IListDatabasesRequest, js.UndefOr[IListDatabasesResponse | Null], IDatabase]
    ): Unit = js.native
    def listDatabases(request: IListDatabasesRequest, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[IDatabase], IListDatabasesRequest | Null, IListDatabasesResponse]
      ] = js.native
    def listDatabases(
      request: IListDatabasesRequest,
      options: CallOptions,
      callback: PaginationCallback[IListDatabasesRequest, js.UndefOr[IListDatabasesResponse | Null], IDatabase]
    ): Unit = js.native
    
    /**
      * Equivalent to `listDatabases`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance whose databases should be listed.
      *   Values are of the form `projects/<project>/instances/<instance>`.
      * @param {number} request.pageSize
      *   Number of databases to be returned in the response. If 0 or less,
      *   defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListDatabasesResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.database.v1.ListDatabasesResponse|ListDatabasesResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Database]{@link google.spanner.admin.database.v1.Database}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.list_databases.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_ListDatabases_async
      */
    def listDatabasesAsync(): AsyncIterable[IDatabase] = js.native
    def listDatabasesAsync(request: Unit, options: CallOptions): AsyncIterable[IDatabase] = js.native
    def listDatabasesAsync(request: IListDatabasesRequest): AsyncIterable[IDatabase] = js.native
    def listDatabasesAsync(request: IListDatabasesRequest, options: CallOptions): AsyncIterable[IDatabase] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The instance whose databases should be listed.
      *   Values are of the form `projects/<project>/instances/<instance>`.
      * @param {number} request.pageSize
      *   Number of databases to be returned in the response. If 0 or less,
      *   defaults to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.admin.database.v1.ListDatabasesResponse.next_page_token|next_page_token} from a
      *   previous {@link google.spanner.admin.database.v1.ListDatabasesResponse|ListDatabasesResponse}.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Database]{@link google.spanner.admin.database.v1.Database} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listDatabasesAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listDatabasesStream(): Transform = js.native
    def listDatabasesStream(request: Unit, options: CallOptions): Transform = js.native
    def listDatabasesStream(request: IListDatabasesRequest): Transform = js.native
    def listDatabasesStream(request: IListDatabasesRequest, options: CallOptions): Transform = js.native
    
    /**
      * Lists operations that match the specified filter in the request. If the
      * server doesn't support this method, it returns `UNIMPLEMENTED`. Returns an iterable object.
      *
      * For-await-of syntax is used with the iterable to recursively get response element on-demand.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation collection.
      * @param {string} request.filter - The standard list filter.
      * @param {number=} request.pageSize -
      *   The maximum number of resources contained in the underlying API
      *   response. If page streaming is performed per-resource, this
      *   parameter does not affect the return value. If page streaming is
      *   performed per-page, this determines the maximum number of
      *   resources in a page.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      *   e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      *   https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      *   details.
      * @returns {Object}
      *   An iterable Object that conforms to @link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols.
      *
      * @example
      * ```
      * const client = longrunning.operationsClient();
      * for await (const response of client.listOperationsAsync(request));
      * // doThingsWith(response)
      * ```
      */
    def listOperationsAsync(request: ListOperationsRequest): AsyncIterable[ListOperationsResponse] = js.native
    def listOperationsAsync(request: ListOperationsRequest, options: CallOptions): AsyncIterable[ListOperationsResponse] = js.native
    
    /**
      * Parse the backup from Backup resource.
      *
      * @param {string} backupName
      *   A fully-qualified path representing Backup resource.
      * @returns {string} A string representing the backup.
      */
    def matchBackupFromBackupName(backupName: String): String | Double = js.native
    
    /**
      * Parse the crypto_key from CryptoKey resource.
      *
      * @param {string} cryptoKeyName
      *   A fully-qualified path representing CryptoKey resource.
      * @returns {string} A string representing the crypto_key.
      */
    def matchCryptoKeyFromCryptoKeyName(cryptoKeyName: String): String | Double = js.native
    
    /**
      * Parse the database from Database resource.
      *
      * @param {string} databaseName
      *   A fully-qualified path representing Database resource.
      * @returns {string} A string representing the database.
      */
    def matchDatabaseFromDatabaseName(databaseName: String): String | Double = js.native
    
    /**
      * Parse the database from DatabaseRole resource.
      *
      * @param {string} databaseRoleName
      *   A fully-qualified path representing DatabaseRole resource.
      * @returns {string} A string representing the database.
      */
    def matchDatabaseFromDatabaseRoleName(databaseRoleName: String): String | Double = js.native
    
    /**
      * Parse the instance from Backup resource.
      *
      * @param {string} backupName
      *   A fully-qualified path representing Backup resource.
      * @returns {string} A string representing the instance.
      */
    def matchInstanceFromBackupName(backupName: String): String | Double = js.native
    
    /**
      * Parse the instance from Database resource.
      *
      * @param {string} databaseName
      *   A fully-qualified path representing Database resource.
      * @returns {string} A string representing the instance.
      */
    def matchInstanceFromDatabaseName(databaseName: String): String | Double = js.native
    
    /**
      * Parse the instance from DatabaseRole resource.
      *
      * @param {string} databaseRoleName
      *   A fully-qualified path representing DatabaseRole resource.
      * @returns {string} A string representing the instance.
      */
    def matchInstanceFromDatabaseRoleName(databaseRoleName: String): String | Double = js.native
    
    /**
      * Parse the instance from Instance resource.
      *
      * @param {string} instanceName
      *   A fully-qualified path representing Instance resource.
      * @returns {string} A string representing the instance.
      */
    def matchInstanceFromInstanceName(instanceName: String): String | Double = js.native
    
    /**
      * Parse the key_ring from CryptoKey resource.
      *
      * @param {string} cryptoKeyName
      *   A fully-qualified path representing CryptoKey resource.
      * @returns {string} A string representing the key_ring.
      */
    def matchKeyRingFromCryptoKeyName(cryptoKeyName: String): String | Double = js.native
    
    /**
      * Parse the location from CryptoKey resource.
      *
      * @param {string} cryptoKeyName
      *   A fully-qualified path representing CryptoKey resource.
      * @returns {string} A string representing the location.
      */
    def matchLocationFromCryptoKeyName(cryptoKeyName: String): String | Double = js.native
    
    /**
      * Parse the project from Backup resource.
      *
      * @param {string} backupName
      *   A fully-qualified path representing Backup resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromBackupName(backupName: String): String | Double = js.native
    
    /**
      * Parse the project from CryptoKey resource.
      *
      * @param {string} cryptoKeyName
      *   A fully-qualified path representing CryptoKey resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromCryptoKeyName(cryptoKeyName: String): String | Double = js.native
    
    /**
      * Parse the project from Database resource.
      *
      * @param {string} databaseName
      *   A fully-qualified path representing Database resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromDatabaseName(databaseName: String): String | Double = js.native
    
    /**
      * Parse the project from DatabaseRole resource.
      *
      * @param {string} databaseRoleName
      *   A fully-qualified path representing DatabaseRole resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromDatabaseRoleName(databaseRoleName: String): String | Double = js.native
    
    /**
      * Parse the project from Instance resource.
      *
      * @param {string} instanceName
      *   A fully-qualified path representing Instance resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromInstanceName(instanceName: String): String | Double = js.native
    
    /**
      * Parse the role from DatabaseRole resource.
      *
      * @param {string} databaseRoleName
      *   A fully-qualified path representing DatabaseRole resource.
      * @returns {string} A string representing the role.
      */
    def matchRoleFromDatabaseRoleName(databaseRoleName: String): String | Double = js.native
    
    var operationsClient: OperationsClient = js.native
    
    var pathTemplates: StringDictionary[PathTemplate] = js.native
    
    /**
      * Create a new database by restoring from a completed backup. The new
      * database must be in the same project and in an instance with the same
      * instance configuration as the instance containing
      * the backup. The returned database [long-running
      * operation][google.longrunning.Operation] has a name of the format
      * `projects/<project>/instances/<instance>/databases/<database>/operations/<operation_id>`,
      * and can be used to track the progress of the operation, and to cancel it.
      * The {@link google.longrunning.Operation.metadata|metadata} field type is
      * {@link google.spanner.admin.database.v1.RestoreDatabaseMetadata|RestoreDatabaseMetadata}.
      * The {@link google.longrunning.Operation.response|response} type
      * is {@link google.spanner.admin.database.v1.Database|Database}, if
      * successful. Cancelling the returned operation will stop the restore and
      * delete the database.
      * There can be only one database being restored into an instance at a time.
      * Once the restore operation completes, a new restore operation can be
      * initiated, without waiting for the optimize operation associated with the
      * first restore to complete.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   Required. The name of the instance in which to create the
      *   restored database. This instance must be in the same project and
      *   have the same instance configuration as the instance containing
      *   the source backup. Values are of the form
      *   `projects/<project>/instances/<instance>`.
      * @param {string} request.databaseId
      *   Required. The id of the database to create and restore to. This
      *   database must not already exist. The `database_id` appended to
      *   `parent` forms the full database name of the form
      *   `projects/<project>/instances/<instance>/databases/<database_id>`.
      * @param {string} request.backup
      *   Name of the backup from which to restore.  Values are of the form
      *   `projects/<project>/instances/<instance>/backups/<backup>`.
      * @param {google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig} [request.encryptionConfig]
      *   Optional. An encryption configuration describing the encryption type and key
      *   resources in Cloud KMS used to encrypt/decrypt the database to restore to.
      *   If this field is not specified, the restored database will use
      *   the same encryption configuration as the backup by default, namely
      *   {@link google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.encryption_type|encryption_type} =
      *   `USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.restore_database.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_RestoreDatabase_async
      */
    def restoreDatabase(): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, IRestoreDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def restoreDatabase(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, IRestoreDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def restoreDatabase(request: IRestoreDatabaseRequest): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, IRestoreDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def restoreDatabase(
      request: IRestoreDatabaseRequest,
      callback: Callback[
          LROperation[IDatabase, IRestoreDatabaseMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def restoreDatabase(request: IRestoreDatabaseRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IDatabase, IRestoreDatabaseMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def restoreDatabase(
      request: IRestoreDatabaseRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IDatabase, IRestoreDatabaseMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Sets the access control policy on a database or backup resource.
      * Replaces any existing policy.
      *
      * Authorization requires `spanner.databases.setIamPolicy`
      * permission on {@link google.iam.v1.SetIamPolicyRequest.resource|resource}.
      * For backups, authorization requires `spanner.backups.setIamPolicy`
      * permission on {@link google.iam.v1.SetIamPolicyRequest.resource|resource}.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy is being specified.
      *   See the operation documentation for the appropriate value for this field.
      * @param {google.iam.v1.Policy} request.policy
      *   REQUIRED: The complete policy to be applied to the `resource`. The size of
      *   the policy is limited to a few 10s of KB. An empty policy is a
      *   valid policy but certain Cloud Platform services (such as Projects)
      *   might reject them.
      * @param {google.protobuf.FieldMask} request.updateMask
      *   OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only
      *   the fields in the mask will be modified. If no mask is provided, the
      *   following default mask is used:
      *
      *   `paths: "bindings, etag"`
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Policy]{@link google.iam.v1.Policy}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.set_iam_policy.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_SetIamPolicy_async
      */
    def setIamPolicy(): js.Promise[js.Tuple3[IPolicy, js.UndefOr[ISetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def setIamPolicy(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IPolicy, js.UndefOr[ISetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def setIamPolicy(request: ISetIamPolicyRequest): js.Promise[js.Tuple3[IPolicy, js.UndefOr[ISetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def setIamPolicy(
      request: ISetIamPolicyRequest,
      callback: Callback[IPolicy, js.UndefOr[ISetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def setIamPolicy(request: ISetIamPolicyRequest, options: CallOptions): js.Promise[js.Tuple3[IPolicy, js.UndefOr[ISetIamPolicyRequest], js.UndefOr[js.Object]]] = js.native
    def setIamPolicy(
      request: ISetIamPolicyRequest,
      options: CallOptions,
      callback: Callback[IPolicy, js.UndefOr[ISetIamPolicyRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Returns permissions that the caller has on the specified database or backup
      * resource.
      *
      * Attempting this RPC on a non-existent Cloud Spanner database will
      * result in a NOT_FOUND error if the user has
      * `spanner.databases.list` permission on the containing Cloud
      * Spanner instance. Otherwise returns an empty set of permissions.
      * Calling this method on a backup that does not exist will
      * result in a NOT_FOUND error if the user has
      * `spanner.backups.list` permission on the containing instance.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.resource
      *   REQUIRED: The resource for which the policy detail is being requested.
      *   See the operation documentation for the appropriate value for this field.
      * @param {string[]} request.permissions
      *   The set of permissions to check for the `resource`. Permissions with
      *   wildcards (such as '*' or 'storage.*') are not allowed. For more
      *   information see
      *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link google.iam.v1.TestIamPermissionsResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.test_iam_permissions.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_TestIamPermissions_async
      */
    def testIamPermissions(): js.Promise[
        js.Tuple3[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def testIamPermissions(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def testIamPermissions(request: ITestIamPermissionsRequest): js.Promise[
        js.Tuple3[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def testIamPermissions(
      request: ITestIamPermissionsRequest,
      callback: Callback[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def testIamPermissions(request: ITestIamPermissionsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def testIamPermissions(
      request: ITestIamPermissionsRequest,
      options: CallOptions,
      callback: Callback[
          ITestIamPermissionsResponse, 
          js.UndefOr[ITestIamPermissionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Updates a pending or completed {@link google.spanner.admin.database.v1.Backup|Backup}.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {google.spanner.admin.database.v1.Backup} request.backup
      *   Required. The backup to update. `backup.name`, and the fields to be updated
      *   as specified by `update_mask` are required. Other fields are ignored.
      *   Update is only supported for the following fields:
      *    * `backup.expire_time`.
      * @param {google.protobuf.FieldMask} request.updateMask
      *   Required. A mask specifying which fields (e.g. `expire_time`) in the
      *   Backup resource should be updated. This mask is relative to the Backup
      *   resource, not to the request message. The field mask must always be
      *   specified; this prevents any future fields from being erased accidentally
      *   by clients that do not know about them.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Backup]{@link google.spanner.admin.database.v1.Backup}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.update_backup.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_UpdateBackup_async
      */
    def updateBackup(): js.Promise[js.Tuple3[IBackup, js.UndefOr[IUpdateBackupRequest], js.UndefOr[js.Object]]] = js.native
    def updateBackup(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IBackup, js.UndefOr[IUpdateBackupRequest], js.UndefOr[js.Object]]] = js.native
    def updateBackup(request: IUpdateBackupRequest): js.Promise[js.Tuple3[IBackup, js.UndefOr[IUpdateBackupRequest], js.UndefOr[js.Object]]] = js.native
    def updateBackup(
      request: IUpdateBackupRequest,
      callback: Callback[IBackup, js.UndefOr[IUpdateBackupRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def updateBackup(request: IUpdateBackupRequest, options: CallOptions): js.Promise[js.Tuple3[IBackup, js.UndefOr[IUpdateBackupRequest], js.UndefOr[js.Object]]] = js.native
    def updateBackup(
      request: IUpdateBackupRequest,
      options: CallOptions,
      callback: Callback[IBackup, js.UndefOr[IUpdateBackupRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Updates the schema of a Cloud Spanner database by
      * creating/altering/dropping tables, columns, indexes, etc. The returned
      * {@link google.longrunning.Operation|long-running operation} will have a name of
      * the format `<database_name>/operations/<operation_id>` and can be used to
      * track execution of the schema change(s). The
      * {@link google.longrunning.Operation.metadata|metadata} field type is
      * {@link google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata|UpdateDatabaseDdlMetadata}.  The operation has no response.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database to update.
      * @param {string[]} request.statements
      *   Required. DDL statements to be applied to the database.
      * @param {string} request.operationId
      *   If empty, the new update request is assigned an
      *   automatically-generated operation ID. Otherwise, `operation_id`
      *   is used to construct the name of the resulting
      *   {@link google.longrunning.Operation|Operation}.
      *
      *   Specifying an explicit operation ID simplifies determining
      *   whether the statements were executed in the event that the
      *   {@link google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabaseDdl|UpdateDatabaseDdl} call is replayed,
      *   or the return value is otherwise lost: the {@link google.spanner.admin.database.v1.UpdateDatabaseDdlRequest.database|database} and
      *   `operation_id` fields can be combined to form the
      *   {@link google.longrunning.Operation.name|name} of the resulting
      *   {@link google.longrunning.Operation|longrunning.Operation}: `<database>/operations/<operation_id>`.
      *
      *   `operation_id` should be unique within the database, and must be
      *   a valid identifier: `{@link a-z0-9_|a-z}*`. Note that
      *   automatically-generated operation IDs always begin with an
      *   underscore. If the named operation already exists,
      *   {@link google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabaseDdl|UpdateDatabaseDdl} returns
      *   `ALREADY_EXISTS`.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1/database_admin.update_database_ddl.js</caption>
      * region_tag:spanner_v1_generated_DatabaseAdmin_UpdateDatabaseDdl_async
      */
    def updateDatabaseDdl(): js.Promise[
        js.Tuple3[
          LROperation[IEmpty, IUpdateDatabaseDdlMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateDatabaseDdl(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IEmpty, IUpdateDatabaseDdlMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateDatabaseDdl(request: IUpdateDatabaseDdlRequest): js.Promise[
        js.Tuple3[
          LROperation[IEmpty, IUpdateDatabaseDdlMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateDatabaseDdl(
      request: IUpdateDatabaseDdlRequest,
      callback: Callback[
          LROperation[IEmpty, IUpdateDatabaseDdlMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def updateDatabaseDdl(request: IUpdateDatabaseDdlRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[IEmpty, IUpdateDatabaseDdlMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def updateDatabaseDdl(
      request: IUpdateDatabaseDdlRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[IEmpty, IUpdateDatabaseDdlMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
