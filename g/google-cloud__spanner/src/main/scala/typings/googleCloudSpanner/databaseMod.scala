package typings.googleCloudSpanner

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudCommon.serviceObjectMod.ExistsCallback
import typings.googleCloudCommon.serviceObjectMod.GetConfig
import typings.googleCloudSpanner.batchTransactionMod.BatchTransaction
import typings.googleCloudSpanner.batchTransactionMod.TransactionIdentifier
import typings.googleCloudSpanner.commonMod.IOperation
import typings.googleCloudSpanner.commonMod.LongRunningCallback
import typings.googleCloudSpanner.commonMod.NormalCallback
import typings.googleCloudSpanner.commonMod.PagedOptionsWithFilter
import typings.googleCloudSpanner.commonMod.PagedResponse
import typings.googleCloudSpanner.commonMod.RequestCallback
import typings.googleCloudSpanner.commonMod.ResourceCallback
import typings.googleCloudSpanner.commonMod.Schema
import typings.googleCloudSpanner.instanceMod.GetDatabaseOperationsCallback
import typings.googleCloudSpanner.instanceMod.GetDatabaseOperationsOptions
import typings.googleCloudSpanner.instanceMod.GetDatabaseOperationsResponse
import typings.googleCloudSpanner.instanceMod.Instance
import typings.googleCloudSpanner.mod.EnumKey
import typings.googleCloudSpanner.mod.RequestConfig
import typings.googleCloudSpanner.partialResultStreamMod.PartialResultStream_
import typings.googleCloudSpanner.protosMod.google.protobuf.IEmpty
import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.Database.State
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseDialect
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IBackupInfo
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IEncryptionConfig
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IEncryptionInfo
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IGetDatabaseDdlResponse
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IGetDatabaseRequest
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.IRestoreDatabaseEncryptionConfig
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreSourceType
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.IQueryOptions
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IBatchCreateSessionsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IListSessionsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ISession
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ITransaction
import typings.googleCloudSpanner.sessionMod.Session
import typings.googleCloudSpanner.sessionPoolMod.SessionPoolCloseCallback
import typings.googleCloudSpanner.sessionPoolMod.SessionPoolInterface
import typings.googleCloudSpanner.sessionPoolMod.SessionPoolOptions
import typings.googleCloudSpanner.tableMod.CreateTableCallback
import typings.googleCloudSpanner.tableMod.CreateTableResponse
import typings.googleCloudSpanner.tableMod.Table
import typings.googleCloudSpanner.transactionMod.ExecuteSqlRequest
import typings.googleCloudSpanner.transactionMod.RunCallback
import typings.googleCloudSpanner.transactionMod.RunResponse
import typings.googleCloudSpanner.transactionMod.RunUpdateCallback
import typings.googleCloudSpanner.transactionMod.Snapshot
import typings.googleCloudSpanner.transactionMod.TimestampBounds
import typings.googleCloudSpanner.transactionMod.Transaction
import typings.googleCloudSpanner.transactionRunnerMod.AsyncRunTransactionCallback
import typings.googleCloudSpanner.transactionRunnerMod.RunTransactionCallback
import typings.googleCloudSpanner.transactionRunnerMod.RunTransactionOptions
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.mod.Operation_
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.std.ReadableStream
import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  /**
    * Create a Database object to interact with a Cloud Spanner database.
    *
    * @class
    *
    * @param {string} name Name of the database.
    * @param {SessionPoolOptions|SessionPoolInterface} options Session pool
    *     configuration options or custom pool interface.
    * @param {google.spanner.v1.ExecuteSqlRequest.IQueryOptions} queryOptions
    *     The default query options to use for queries on the database.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    * const instance = spanner.instance('my-instance');
    * const database = instance.database('my-database');
    * ```
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify common.GrpcServiceObject * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify common.GrpcServiceObject * / any */ @JSImport("@google-cloud/spanner/build/src/database", "Database")
  @js.native
  open class Database protected () extends StObject {
    def this(instance: Instance, name: String) = this()
    def this(instance: Instance, name: String, poolOptions: SessionPoolConstructor) = this()
    def this(instance: Instance, name: String, poolOptions: SessionPoolOptions) = this()
    def this(instance: Instance, name: String, poolOptions: Unit, queryOptions: IQueryOptions) = this()
    def this(instance: Instance, name: String, poolOptions: SessionPoolConstructor, queryOptions: IQueryOptions) = this()
    def this(instance: Instance, name: String, poolOptions: SessionPoolOptions, queryOptions: IQueryOptions) = this()
    
    /**
      * Decorates transaction so that when end() is called it will return the session
      * back into the pool.
      *
      * @private
      *
      * @param {Session} session The session to release.
      * @param {Transaction} transaction The transaction to observe.
      * @returns {Transaction}
      */
    /* private */ var _releaseOnEnd: Any = js.native
    
    def _runPartitionedUpdate(session: Session, query: String): Unit | js.Promise[Double] = js.native
    def _runPartitionedUpdate(session: Session, query: String, callback: RunUpdateCallback): Unit | js.Promise[Double] = js.native
    def _runPartitionedUpdate(session: Session, query: ExecuteSqlRequest): Unit | js.Promise[Double] = js.native
    def _runPartitionedUpdate(session: Session, query: ExecuteSqlRequest, callback: RunUpdateCallback): Unit | js.Promise[Double] = js.native
    
    /**
      * @typedef {object} BatchCreateSessionsOptions
      * @property {number} count The number of sessions to create.
      * @property {object.<string, string>} [labels] Labels to apply to each
      *     session.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} BatchCreateSessionsResponse
      * @property {Session[]} 0 The newly created sessions.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback BatchCreateSessionsCallback
      * @param {?Error} err Request error, if any.
      * @param {Session[]} sessions The newly created sessions.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Create a batch of sessions, which can be used to perform transactions that
      * read and/or modify data.
      *
      * **It is unlikely you will need to interact with sessions directly. By
      * default, sessions are created and utilized for maximum performance
      * automatically.**
      *
      * Wrapper around {@link v1.SpannerClient#batchCreateSessions}.
      *
      * @see {@link v1.SpannerClient#batchCreateSessions}
      * @see [BatchCreateSessions API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.BatchCreateSessions)
      *
      * @param {number|BatchCreateSessionsOptions} options Desired session count or
      *     a configuration object.
      * @param {BatchCreateSessionsCallback} [callback] Callback function.
      * @returns {Promise<BatchCreateSessionsResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * const count = 5;
      *
      * database.batchCreateSession(count, (err, sessions, response) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // `sessions` is an array of Session objects.
      * });
      *
      * ```
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * const [sessions, response] = await database.batchCreateSessions(count);
      * ```
      */
    def batchCreateSessions(options: Double): js.Promise[BatchCreateSessionsResponse] = js.native
    def batchCreateSessions(options: Double, callback: BatchCreateSessionsCallback): Unit = js.native
    def batchCreateSessions(options: BatchCreateSessionsOptions): js.Promise[BatchCreateSessionsResponse] = js.native
    def batchCreateSessions(options: BatchCreateSessionsOptions, callback: BatchCreateSessionsCallback): Unit = js.native
    
    /**
      * Get a reference to a {@link BatchTransaction} object.
      *
      * @see {@link BatchTransaction#identifier} to generate an identifier.
      *
      * @param {TransactionIdentifier} identifier The transaction identifier.
      * @param {object} [options] [Transaction options](https://cloud.google.com/spanner/docs/timestamp-bounds).
      * @returns {BatchTransaction} A batch transaction object.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * const transaction = database.batchTransaction({
      *   session: 'my-session',
      *   transaction: 'my-transaction',
      *   readTimestamp: 1518464696657
      * });
      * ```
      */
    def batchTransaction(identifier: TransactionIdentifier): BatchTransaction = js.native
    def batchTransaction(identifier: TransactionIdentifier, options: TimestampBounds): BatchTransaction = js.native
    
    def close(): js.Promise[DatabaseCloseResponse] = js.native
    /**
      * @callback CloseDatabaseCallback
      * @param {?Error} err Request error, if any.
      */
    /**
      * Close the database connection and destroy all sessions associated with it.
      *
      * @param {CloseDatabaseCallback} [callback] Callback function.
      * @returns {Promise}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.close(function(err) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      *
      * //-
      * // In the event of a session leak, the error object will contain a
      * // `messages` field.
      * //-
      * database.close(function(err) {
      *   if (err && err.messages) {
      *     err.messages.forEach(function(message) {
      *       console.error(message);
      *     });
      *   }
      * });
      * ```
      */
    def close(callback: SessionPoolCloseCallback): Unit = js.native
    
    /**
      * @typedef {array} CreateTransactionResponse
      * @property {BatchTransaction} 0 The {@link BatchTransaction}.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback CreateTransactionCallback
      * @param {?Error} err Request error, if any.
      * @param {BatchTransaction} transaction The {@link BatchTransaction}.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Create a transaction that can be used for batch querying.
      *
      * @param {object} [options] [Transaction options](https://cloud.google.com/spanner/docs/timestamp-bounds).
      * @param {CreateTransactionCallback} [callback] Callback function.
      * @returns {Promise<CreateTransactionResponse>}
      */
    def createBatchTransaction(): js.Promise[CreateBatchTransactionResponse] = js.native
    def createBatchTransaction(callback: CreateBatchTransactionCallback): Unit = js.native
    def createBatchTransaction(options: TimestampBounds): js.Promise[CreateBatchTransactionResponse] = js.native
    def createBatchTransaction(options: TimestampBounds, callback: CreateBatchTransactionCallback): Unit = js.native
    
    def createSession(callback: CreateSessionCallback): Unit = js.native
    /**
      * Create a new session.
      *
      * @typedef {object} CreateSessionOptions
      * @property {Object.<string, string>} [labels] The labels for the session.
      *
      *   * Label keys must be between 1 and 63 characters long and must conform to
      *     the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
      *   * Label values must be between 0 and 63 characters long and must conform
      *     to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
      *   * No more than 64 labels can be associated with a given session.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} CreateSessionResponse
      * @property {Session} 0 The newly created session.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback CreateSessionCallback
      * @param {?Error} err Request error, if any.
      * @param {Session} session The newly created session.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Create a new session, which can be used to perform transactions that read
      * and/or modify data.
      *
      * Sessions can only execute one transaction at a time. To execute multiple
      * concurrent read-write/write-only transactions, create multiple sessions.
      * Note that standalone reads and queries use a transaction internally, and
      * count toward the one transaction limit.
      *
      * **It is unlikely you will need to interact with sessions directly. By
      * default, sessions are created and utilized for maximum performance
      * automatically.**
      *
      * Wrapper around {@link v1.SpannerClient#createSession}.
      *
      * @see {@link v1.SpannerClient#createSession}
      * @see [CreateSession API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.CreateSession)
      *
      * @param {CreateSessionOptions} [options] Configuration object.
      * @param {CreateSessionCallback} [callback] Callback function.
      * @returns {Promise<CreateSessionResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.createSession(function(err, session, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // `session` is a Session object.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.createSession().then(function(data) {
      *   const session = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def createSession(options: CreateSessionOptions): js.Promise[CreateSessionResponse] = js.native
    def createSession(options: CreateSessionOptions, callback: CreateSessionCallback): Unit = js.native
    
    /**
      * @typedef {array} CreateTableResponse
      * @property {Table} 0 The new {@link Table}.
      * @property {google.longrunning.Operation} 1 An {@link Operation} object that can be used to check
      *     the status of the request.
      * @property {object} 2 The full API response.
      */
    /**
      * @callback CreateTableCallback
      * @param {?Error} err Request error, if any.
      * @param {Table} table The new {@link Table}.
      * @param {google.longrunning.Operation} operation An {@link Operation} object that can be used to
      *     check the status of the request.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Create a table.
      *
      * Wrapper around {@link Database#updateSchema}.
      *
      * @see {@link Database#updateSchema}
      *
      * @param {string} schema A DDL CREATE statement describing the table.
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {CreateTableCallback} [callback] Callback function.
      * @returns {Promise<CreateTableResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * const schema =
      *   'CREATE TABLE Singers (' +
      *   '  SingerId INT64 NOT NULL,' +
      *   '  FirstName STRING(1024),' +
      *   '  LastName STRING(1024),' +
      *   '  SingerInfo BYTES(MAX),' +
      *   ') PRIMARY KEY(SingerId)';
      *
      * database.createTable(schema, function(err, table, operation, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   operation
      *     .on('error', function(err) {})
      *     .on('complete', function() {
      *       // Table created successfully.
      *     });
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.createTable(schema)
      *   .then(function(data) {
      *     const table = data[0];
      *     const operation = data[1];
      *
      *     return operation.promise();
      *   })
      *   .then(function() {
      *     // Table created successfully.
      *   });
      * ```
      */
    def createTable(schema: Schema): js.Promise[CreateTableResponse] = js.native
    def createTable(schema: Schema, callback: CreateTableCallback): Unit = js.native
    def createTable(schema: Schema, gaxOptions: CallOptions): js.Promise[CreateTableResponse] = js.native
    def createTable(schema: Schema, gaxOptions: CallOptions, callback: CreateTableCallback): Unit = js.native
    
    /**
      * @typedef {array} DatabaseDeleteResponse
      * @property {object} 0 The full API response.
      */
    /**
      * @callback DatabaseDeleteCallback
      * @param {?Error} err Request error, if any.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Delete the database.
      *
      * Wrapper around {@link v1.DatabaseAdminClient#dropDatabase}.
      *
      * @see {@link v1.DatabaseAdminClient#dropDatabase}
      * @see [DropDatabase API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.database.v1#google.spanner.admin.database.v1.DatabaseAdmin.DropDatabase)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DatabaseDeleteCallback} [callback] Callback function.
      * @returns {Promise<DatabaseDeleteResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.delete(function(err, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Database was deleted successfully.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.delete().then(function(data) {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def delete(): js.Promise[DatabaseDeleteResponse] = js.native
    def delete(callback: DatabaseDeleteCallback): Unit = js.native
    def delete(gaxOptions: CallOptions): js.Promise[DatabaseDeleteResponse] = js.native
    def delete(gaxOptions: CallOptions, callback: DatabaseDeleteCallback): Unit = js.native
    
    /**
      * @typedef {array} DatabaseExistsResponse
      * @property {boolean} 0 Whether the {@link Database} exists.
      */
    /**
      * @callback DatabaseExistsCallback
      * @param {?Error} err Request error, if any.
      * @param {boolean} exists Whether the {@link Database} exists.
      */
    /**
      * Check if a database exists.
      *
      * @method Database#exists
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DatabaseExistsCallback} [callback] Callback function.
      * @returns {Promise<DatabaseExistsResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.exists(function(err, exists) {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.exists().then(function(data) {
      *   const exists = data[0];
      * });
      * ```
      */
    def exists(): js.Promise[js.Array[Boolean]] = js.native
    def exists(callback: ExistsCallback): Unit = js.native
    def exists(gaxOptions: CallOptions): js.Promise[js.Array[Boolean]] = js.native
    def exists(gaxOptions: CallOptions, callback: ExistsCallback): Unit = js.native
    
    var formattedName_ : String = js.native
    
    /**
      * @typedef {array} GetDatabaseResponse
      * @property {Database} 0 The {@link Database}.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetDatabaseCallback
      * @param {?Error} err Request error, if any.
      * @param {Database} database The {@link Database}.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get a database if it exists.
      *
      * You may optionally use this to "get or create" an object by providing an
      * object with `autoCreate` set to `true`. Any extra configuration that is
      * normally required for the `create` method must be contained within this
      * object as well.
      *
      * @param {options} [options] Configuration object.
      * @param {boolean} [options.autoCreate=false] Automatically create the
      *     object if it does not exist.
      * @param {object} [options.gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {GetDatabaseCallback} [callback] Callback function.
      * @returns {Promise<GetDatabaseResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.get(function(err, database, apiResponse) {
      *   // `database.metadata` has been populated.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.get().then(function(data) {
      *   const database = data[0];
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def get(): js.Promise[DatabaseResponse] = js.native
    def get(callback: DatabaseCallback): Unit = js.native
    def get(options: GetDatabaseConfig): js.Promise[DatabaseResponse] = js.native
    def get(options: GetDatabaseConfig, callback: DatabaseCallback): Unit = js.native
    
    /**
      * @typedef {array} GetDatabaseMetadataResponse
      * @property {object} 0 The {@link Database} metadata.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetDatabaseMetadataCallback
      * @param {?Error} err Request error, if any.
      * @param {object} metadata The {@link Database} metadata.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get the database's metadata.
      *
      * Wrapper around {@link v1.DatabaseAdminClient#getDatabase}.
      *
      * @see {@link v1.DatabaseAdminClient#getDatabase}
      * @see [GetDatabase API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.database.v1#google.spanner.admin.database.v1.DatabaseAdmin.GetDatabase)
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {GetDatabaseMetadataCallback} [callback] Callback function.
      * @returns {Promise<GetDatabaseMetadataResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.getMetadata(function(err, metadata) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Database was deleted successfully.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.getMetadata().then(function(data) {
      *   const metadata = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def getMetadata(): js.Promise[GetDatabaseMetadataResponse] = js.native
    def getMetadata(callback: GetDatabaseMetadataCallback): Unit = js.native
    def getMetadata(gaxOptions: CallOptions): js.Promise[GetDatabaseMetadataResponse] = js.native
    def getMetadata(gaxOptions: CallOptions, callback: GetDatabaseMetadataCallback): Unit = js.native
    
    /**
      * Query object for listing database operations.
      *
      * @typedef {object} GetDatabaseOperationsOptions
      * @property {string} [filter] An expression for filtering the results of the
      *     request. Filter can be configured as outlined in
      *     {@link v1.DatabaseAdminClient#listDatabaseOperations}.
      * @property {number} [pageSize] Maximum number of results per page.
      * @property {string} [pageToken] A previously-returned page token
      *     representing part of the larger set of results to view.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {GetDatabaseOperationsCallback} [callback] Callback function.
      */
    /**
      * @typedef {array} GetDatabaseOperationsResponse
      * @property {IOperation[]} 0 Array of {@link IOperation} instances.
      * @property {object} 1 The full API response.
      */
    /**
      * List pending and completed operations for the database.
      *
      * @see {@link Instance.getDatabaseOperations}
      *
      * @param {GetDatabaseOperationsOptions} [options] Contains query object for
      *     listing database operations and request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @returns {Promise<GetDatabaseOperationsResponse>} When resolved, contains
      *     a paged list of database operations.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const [operations] = await database.getOperations();
      *
      * //-
      * // To manually handle pagination, set autoPaginate:false in gaxOptions.
      * //-
      * let pageToken = undefined;
      * do {
      *   const [operations, , response] = await database.getOperations({
      *     pageSize: 3,
      *     pageToken,
      *     gaxOptions: {autoPaginate: false},
      *   });
      *   operations.forEach(operation => {
      *     // Do something with operation
      *   });
      *   pageToken = response.nextPageToken;
      * } while (pageToken);
      * ```
      */
    def getOperations(): js.Promise[GetDatabaseOperationsResponse] = js.native
    def getOperations(callback: GetDatabaseOperationsCallback): Unit = js.native
    def getOperations(options: GetDatabaseOperationsOptions): js.Promise[GetDatabaseOperationsResponse] = js.native
    def getOperations(options: GetDatabaseOperationsOptions, callback: GetDatabaseOperationsCallback): Unit = js.native
    
    /**
      * {@link google.spanner.admin.database.v1#RestoreInfo} structure with restore
      * source type enum translated to string form.
      *
      * @typedef {object} IRestoreInfoTranslatedEnum
      */
    /**
      * @callback GetRestoreInfoCallback
      * @param {?Error} err Request error, if any.
      * @param {IRestoreInfoTranslatedEnum | undefined} restoreInfo Contains the restore
      *     information for the database if it was restored from a backup.
      */
    /**
      * Retrieves the restore information of the database.
      *
      * @see {@link #getMetadata}
      *
      * @method Database#getRestoreInfo
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {GetRestoreInfoCallback} [callback] Callback function.
      * @returns {Promise<IRestoreInfoTranslatedEnum | undefined>} When resolved,
      *     contains the restore information for the database if it was restored
      *     from a backup.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const restoreInfo = await database.getRestoreInfo();
      * console.log(`Database restored from ${restoreInfo.backupInfo.backup}`);
      * ```
      */
    def getRestoreInfo(): js.Promise[js.UndefOr[IRestoreInfoTranslatedEnum]] = js.native
    def getRestoreInfo(callback: GetRestoreInfoCallback): Unit = js.native
    def getRestoreInfo(options: CallOptions): js.Promise[js.UndefOr[IRestoreInfoTranslatedEnum]] = js.native
    def getRestoreInfo(options: CallOptions, callback: GetRestoreInfoCallback): Unit = js.native
    
    /**
      * @typedef {array} GetSchemaResponse
      * @property {string[]} 0 An array of database DDL statements.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetSchemaCallback
      * @param {?Error} err Request error, if any.
      * @param {string[]} statements An array of database DDL statements.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get this database's schema as a list of formatted DDL statements.
      *
      * Wrapper around {@link v1.DatabaseAdminClient#getDatabaseDdl}.
      *
      * @see {@link v1.DatabaseAdminClient#getDatabaseDdl}
      * @see [Data Definition Language (DDL)](https://cloud.google.com/spanner/docs/data-definition-language)
      * @see [GetDatabaseDdl API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.database.v1#google.spanner.admin.database.v1.DatabaseAdmin.GetDatabaseDdl)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {GetSchemaCallback} [callback] Callback function.
      * @returns {Promise<GetSchemaResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.getSchema(function(err, statements, apiResponse) {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.getSchema().then(function(data) {
      *   const statements = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def getSchema(): js.Promise[GetSchemaResponse] = js.native
    def getSchema(callback: GetSchemaCallback): Unit = js.native
    def getSchema(options: CallOptions): js.Promise[GetSchemaResponse] = js.native
    def getSchema(options: CallOptions, callback: GetSchemaCallback): Unit = js.native
    
    /**
      * Options object for listing sessions.
      *
      * @typedef {object} GetSessionsOptions
      * @property {string} [filter] An expression for filtering the results of the
      *     request. Filter rules are case insensitive. The fields eligible for
      *     filtering are:
      *     - **`name`**
      *     - **`display_name`**
      *     - **`labels.key`** where key is the name of a label
      *
      *     Some examples of using filters are:
      *     - **`name:*`** The instance has a name.
      *     - **`name:Howl`** The instance's name is howl.
      *     - **`labels.env:*`** The instance has the label env.
      *     - **`labels.env:dev`** The instance's label env has the value dev.
      *     - **`name:howl labels.env:dev`** The instance's name is howl and it has
      *       the label env with value dev.
      * @property {number} [pageSize] Maximum number of results per page.
      * @property {string} [pageToken] A previously-returned page token
      *     representing part of the larger set of results to view.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} GetSessionsResponse
      * @property {Session[]} 0 Array of {@link Session} instances.
      * @property {object} 1 A query object to receive more results.
      * @property {object} 2 The full API response.
      */
    /**
      * @callback GetSessionsCallback
      * @param {?Error} err Request error, if any.
      * @param {Session[]} instances Array of {@link Session} instances.
      * @param {object} nextQuery A query object to receive more results.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Gets a list of sessions.
      *
      * Wrapper around {@link v1.SpannerClient#listSessions}
      *
      * @see {@link v1.SpannerClient#listSessions}
      * @see [ListSessions API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.ListSessions)
      *
      * @param {GetSessionsOptions} [options] Options object for listing sessions.
      * @param {GetSessionsCallback} [callback] Callback function.
      * @returns {Promise<GetSessionsResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.getSessions(function(err, sessions) {
      *   // `sessions` is an array of `Session` objects.
      * });
      *
      * //-
      * // To control how many API requests are made and page through the results
      * // manually, set `autoPaginate` to `false`.
      * //-
      * function callback(err, sessions, nextQuery, apiResponse) {
      *   if (nextQuery) {
      *     // More results exist.
      *     database.getSessions(nextQuery, callback);
      *   }
      * }
      *
      * database.getInstances({
      *   gaxOptions: {autoPaginate: false}
      * }, callback);
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.getInstances().then(function(data) {
      *   const sessions = data[0];
      * });
      * ```
      */
    def getSessions(): js.Promise[GetSessionsResponse] = js.native
    def getSessions(callback: GetSessionsCallback): Unit = js.native
    def getSessions(options: GetSessionsOptions): js.Promise[GetSessionsResponse] = js.native
    def getSessions(options: GetSessionsOptions, callback: GetSessionsCallback): Unit = js.native
    
    /**
      * Get a list of sessions as a readable object stream.
      *
      * Wrapper around {@link v1.SpannerClient#listSessions}
      *
      * @see {@link v1.SpannerClient#listSessions}
      * @see [ListSessions API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.ListSessions)
      *
      * @method Spanner#getSessionsStream
      * @param {GetSessionsOptions} [options] Options object for listing sessions.
      * @returns {ReadableStream} A readable stream that emits {@link Session}
      *     instances.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.getSessionsStream()
      *   .on('error', console.error)
      *   .on('data', function(database) {
      *     // `sessions` is a `Session` object.
      *   })
      *   .on('end', function() {
      *     // All sessions retrieved.
      *   });
      *
      * //-
      * // If you anticipate many results, you can end a stream early to prevent
      * // unnecessary processing and API requests.
      * //-
      * database.getSessionsStream()
      *   .on('data', function(session) {
      *     this.end();
      *   });
      * ```
      */
    def getSessionsStream(): ReadableStream[Any] = js.native
    def getSessionsStream(options: GetSessionsOptions): ReadableStream[Any] = js.native
    
    /**
      * @typedef {array} GetSnapshotResponse
      * @property {Snapshot} 0 The snapshot object.
      */
    /**
      * @callback GetSnapshotCallback
      * @param {?Error} err Request error, if any.
      * @param {Snapshot} snapshot The snapshot object.
      */
    /**
      * Get a read only {@link Snapshot} transaction.
      *
      * Wrapper around {@link v1.SpannerClient#beginTransaction}.
      *
      * **NOTE:** When finished with the Snapshot, {@link Snapshot#end} should be
      * called to release the underlying {@link Session}. **Failure to do could
      * result in a Session leak.**
      *
      * **NOTE:** Since the returned {@link Snapshot} transaction is not a
      * single-use transaction, it is invalid to set the `minReadTimestamp` and
      * `maxStaleness` parameters in {@link TimestampBounds} as those parameters
      * can only be set for single-use transactions.
      * https://cloud.google.com/spanner/docs/reference/rest/v1/TransactionOptions#bounded-staleness
      *
      * @see {@link v1.SpannerClient#beginTransaction}
      *
      * @param {TimestampBounds} [options] Timestamp bounds.
      * @param {GetSnapshotCallback} [callback] Callback function.
      * @returns {Promise<GetSnapshotResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.getSnapshot(function(err, transaction) {
      *   if (err) {
      *    // Error handling omitted.
      *   }
      *
      *   // Should be called when finished with Snapshot.
      *   transaction.end();
      * });
      * ```
      *
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * database.getSnapshot().then(function(data) {
      *   const transaction = data[0];
      * });
      * ```
      *
      * @example <caption>include:samples/transaction.js</caption>
      * region_tag:spanner_read_only_transaction
      * Read-only transaction:
      */
    def getSnapshot(): js.Promise[js.Array[Snapshot]] = js.native
    def getSnapshot(callback: GetSnapshotCallback): Unit = js.native
    def getSnapshot(options: TimestampBounds): js.Promise[js.Array[Snapshot]] = js.native
    def getSnapshot(options: TimestampBounds, callback: GetSnapshotCallback): Unit = js.native
    
    /**
      * @callback GetStateCallback
      * @param {?Error} err Request error, if any.
      * @param {EnumKey<typeof, google.spanner.admin.database.v1.Database.State> | undefined} state
      *     Contains the current state of the database if the state is defined.
      */
    /**
      * Retrieves the state of the database.
      *
      * The database state indicates if the database is ready after creation or
      * after being restored from a backup.
      *
      * @see {@link #getMetadata}
      *
      * @method Database#getState
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {GetStateCallback} [callback] Callback function.
      * @returns {Promise<EnumKey<typeof, google.spanner.admin.database.v1.Database.State> | undefined>}
      *     When resolved, contains the current state of the database if the state
      *     is defined.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const state = await database.getState();
      * const isReady = (state === 'READY');
      * ```
      */
    def getState(): js.Promise[
        js.UndefOr[
          EnumKey[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
          ]
        ]
      ] = js.native
    def getState(callback: GetStateCallback): Unit = js.native
    def getState(options: CallOptions): js.Promise[
        js.UndefOr[
          EnumKey[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
          ]
        ]
      ] = js.native
    def getState(options: CallOptions, callback: GetStateCallback): Unit = js.native
    
    /**
      * @typedef {array} GetTransactionResponse
      * @property {Transaction} 0 The transaction object.
      */
    /**
      * @callback GetTransactionCallback
      * @param {?Error} err Request error, if any.
      * @param {Transaction} transaction The transaction object.
      */
    /**
      * Get a read/write ready {@link Transaction} object.
      *
      * **NOTE:** In the event that you encounter an error while reading/writing,
      * if you decide to forgo calling {@link Transaction#commit} or
      * {@link Transaction#rollback}, then you need to call
      * {@link Transaction#end} to release the underlying {@link Session} object.
      * **Failure to do could result in a Session leak.**
      *
      * Wrapper around {@link v1.SpannerClient#beginTransaction}.
      *
      * @see {@link v1.SpannerClient#beginTransaction}
      *
      * @param {GetTransactionCallback} [callback] Callback function.
      * @returns {Promise<GetTransactionResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.getTransaction(function(err, transaction) {});
      *
      * ```
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * database.getTransaction().then(function(data) {
      *   const transaction = data[0];
      * });
      * ```
      */
    def getTransaction(): js.Promise[js.Array[Transaction]] = js.native
    def getTransaction(callback: GetTransactionCallback): Unit = js.native
    
    /* private */ var instance: Any = js.native
    
    /**
      * Make an API request, first assuring an active session is used.
      *
      * @private
      *
      * @param {object} config Request config
      * @param {function} callback Callback function
      */
    def makePooledRequest_(config: RequestConfig): js.Promise[Session] = js.native
    def makePooledRequest_(config: RequestConfig, callback: PoolRequestCallback): Unit = js.native
    
    /**
      * Make an API request as a stream, first assuring an active session is used.
      *
      * @private
      *
      * @param {object} config Request config
      * @returns {Stream}
      */
    def makePooledStreamingRequest_(config: RequestConfig): Readable = js.native
    
    var pool_ : SessionPoolInterface = js.native
    
    var queryOptions_ : js.UndefOr[IQueryOptions] = js.native
    
    def request(config: RequestConfig, callback: ResourceCallback[Operation_, IOperation]): Unit = js.native
    def request[T](config: RequestConfig, callback: RequestCallback[T, Unit]): Unit = js.native
    @JSName("request")
    var request_Original: DatabaseRequest = js.native
    @JSName("request")
    def request_TR[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    
    var resourceHeader_ : StringDictionary[String] = js.native
    
    /**
      * @typedef {object} RestoreOptions
      * @property {google.spanner.admin.database.v1.IRestoreDatabaseEncryptionConfig}
      *     encryptionConfig An encryption configuration describing
      *     the encryption type and key resources in Cloud KMS used to
      *     encrypt/decrypt the database to restore to.
      * @property {CallOptions} [gaxOptions] The request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} RestoreDatabaseResponse
      * @property {Database} 0 The new {@link Database}.
      * @property {google.longrunning.Operation} 1 An {@link Operation} object that can be used to check
      *     the status of the request.
      * @property {object} 2 The full API response.
      */
    /**
      * @callback RestoreDatabaseCallback
      * @param {?Error} err Request error, if any.
      * @param {Database} database The new {@link Database}.
      * @param {google.longrunning.Operation} operation An {@link Operation} object that can be used to
      *     check the status of the request.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Restore a backup into this database.
      *
      * When this call completes, the restore will have commenced but will not
      * necessarily have completed.
      *
      * @param {string} backupPath The path of the backup to restore.
      * @param {RestoreOptions} [options] Request configuration options.
      * @param {RestoreDatabaseCallback} [callback] Callback function.
      * @returns {Promise<RestoreDatabaseResponse>} When resolved, contains the restore operation.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const backupName = 'projects/my-project/instances/my-instance/backups/my-backup';
      * const [, restoreOperation] = await database.restore(backupName);
      * // Wait for restore to complete
      * await restoreOperation.promise();
      *
      * //-
      * // Restore database with a different encryption key to the one used by the
      * // backup.
      * //-
      * const [, restoreWithKeyOperation] = await database.restore(
      *   backupName,
      *   {
      *     encryptionConfig: {
      *       encryptionType: 'CUSTOMER_MANAGED_ENCRYPTION',
      *       kmsKeyName: 'projects/my-project-id/my-region/keyRings/my-key-ring/cryptoKeys/my-key',
      *     }
      *   },
      * );
      * // Wait for restore to complete
      * await restoreWithKeyOperation.promise();
      * ```
      */
    def restore(backupPath: String): js.Promise[RestoreDatabaseResponse] = js.native
    def restore(backupPath: String, callback: RestoreDatabaseCallback): Unit = js.native
    def restore(backupPath: String, options: RestoreOptions): js.Promise[RestoreDatabaseResponse] = js.native
    def restore(backupPath: String, options: RestoreOptions, callback: RestoreDatabaseCallback): Unit = js.native
    def restore(backupPath: String, options: CallOptions): js.Promise[RestoreDatabaseResponse] = js.native
    def restore(backupPath: String, options: CallOptions, callback: RestoreDatabaseCallback): Unit = js.native
    
    /**
      * Transaction options.
      *
      * @typedef {object} DatabaseRunRequest
      * @property {number} [exactStaleness] Executes all reads at the timestamp
      *     that is `exactStaleness` old.
      * @property {date} [readTimestamp] Execute all reads at the given
      *     timestamp.
      * @property {boolean} [strong] Read at the timestamp where all previously
      *     committed transactions are visible.
      */
    /**
      * @typedef {array} RunResponse
      * @property {Array<Row | Json>} 0 Rows are returned as an array objects. Each
      *     object has a `name` and `value` property. To get a serialized object,
      *     call `toJSON()`.
      * @property {?google.spanner.v1.IResultSetStats} 1 Query statistics, if the query is executed in
      *     PLAN or PROFILE mode.
      */
    /**
      * @callback RunCallback
      * @param {?Error} err Request error, if any.
      * @param {Array<Row | Json>} rows Rows are returned as an array of objects.
      *     Each object has a `name` and `value` property. To get a serialized
      *     object, call `toJSON()`.
      * @param {?google.spanner.v1.IResultSetStats} stats Query statistics, if the query is executed
      *     in PLAN or PROFILE mode.
      */
    /**
      * Execute a SQL statement on this database.
      *
      * Wrapper around {@link v1.SpannerClient#executeStreamingSql}.
      *
      * @see {@link v1.SpannerClient#executeStreamingSql}
      * @see [Query Syntax](https://cloud.google.com/spanner/docs/query-syntax)
      * @see [ExecuteSql API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.ExecuteSql)
      *
      * @param {string|ExecuteSqlRequest} query A SQL query or
      *     {@link ExecuteSqlRequest} object.
      * @param {TimestampBounds} [options] Snapshot timestamp bounds.
      * @param {RunCallback} [callback] Callback function.
      * @returns {Promise<RunResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * const query = 'SELECT * FROM Singers';
      *
      * database.run(query, function(err, rows) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   const firstRow = rows[0];
      *
      *   // firstRow = [
      *   //   {
      *   //     name: 'SingerId',
      *   //     value: '1'
      *   //   },
      *   //   {
      *   //     name: 'Name',
      *   //     value: 'Eddie Wilson'
      *   //   }
      *   // ]
      * });
      *
      * //-
      * // Rows are returned as an array of object arrays. Each object has a `name`
      * // and `value` property. To get a serialized object, call `toJSON()`.
      * //-
      * database.run(query, function(err, rows) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   const firstRow = rows[0];
      *
      *   // firstRow.toJSON() = {
      *   //   SingerId: '1',
      *   //   Name: 'Eddie Wilson'
      *   // }
      * });
      *
      * //-
      * // Alternatively, set `query.json` to `true`, and this step will be performed
      * // automatically.
      * //-
      * database.run(query, function(err, rows) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   const firstRow = rows[0];
      *
      *   // firstRow = {
      *   //   SingerId: '1',
      *   //   Name: 'Eddie Wilson'
      *   // }
      * });
      *
      * //-
      * // The SQL query string can contain parameter placeholders. A parameter
      * // placeholder consists of '@' followed by the parameter name.
      * //-
      * const query = {
      *   sql: 'SELECT * FROM Singers WHERE name = @name',
      *   params: {
      *     name: 'Eddie Wilson'
      *   }
      * };
      *
      * database.run(query, function(err, rows) {});
      *
      * //-
      * // If you need to enforce a specific param type, a types map can be provided.
      * // This is typically useful if your param value can be null.
      * //-
      * const query = {
      *   sql: 'SELECT * FROM Singers WHERE name = @name AND id = @id',
      *   params: {
      *     id: spanner.int(8),
      *     name: null
      *   },
      *   types: {
      *     id: 'int64',
      *     name: 'string'
      *   }
      * };
      *
      * database.run(query, function(err, rows) {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.run(query).then(function(data) {
      *   const rows = data[0];
      * });
      *
      * ```
      * @example <caption>include:samples/crud.js</caption>
      * region_tag:spanner_query_data
      * Full example:
      *
      * @example <caption>include:samples/index-query-data.js</caption>
      * region_tag:spanner_query_data_with_index
      * Querying data with an index:
      */
    def run(query: String): js.Promise[RunResponse] = js.native
    def run(query: String, callback: RunCallback): Unit = js.native
    def run(query: String, options: TimestampBounds): js.Promise[RunResponse] = js.native
    def run(query: String, options: TimestampBounds, callback: RunCallback): Unit = js.native
    def run(query: ExecuteSqlRequest): js.Promise[RunResponse] = js.native
    def run(query: ExecuteSqlRequest, callback: RunCallback): Unit = js.native
    def run(query: ExecuteSqlRequest, options: TimestampBounds): js.Promise[RunResponse] = js.native
    def run(query: ExecuteSqlRequest, options: TimestampBounds, callback: RunCallback): Unit = js.native
    
    def runPartitionedUpdate(query: String): Unit = js.native
    def runPartitionedUpdate(query: String, callback: RunUpdateCallback): Unit = js.native
    def runPartitionedUpdate(query: ExecuteSqlRequest): Unit = js.native
    def runPartitionedUpdate(query: ExecuteSqlRequest, callback: RunUpdateCallback): Unit = js.native
    /**
      * Partitioned DML transactions are used to execute DML statements with a
      * different execution strategy that provides different, and often better,
      * scalability properties for large, table-wide operations than DML in a
      * Transaction transaction. Smaller scoped statements, such as an OLTP workload,
      * should prefer using Transaction transactions.
      *
      * @see {@link Transaction#runUpdate}
      *
      * @param {string|ExecuteSqlRequest} query A DML statement or
      *     {@link ExecuteSqlRequest} object.
      * @param {RunUpdateCallback} [callback] Callback function.
      * @returns {Promise<RunUpdateResponse>}
      */
    @JSName("runPartitionedUpdate")
    def runPartitionedUpdate_Promise(query: String): js.Promise[js.Array[Double]] = js.native
    @JSName("runPartitionedUpdate")
    def runPartitionedUpdate_Promise(query: ExecuteSqlRequest): js.Promise[js.Array[Double]] = js.native
    
    /**
      * Create a readable object stream to receive resulting rows from a SQL
      * statement.
      *
      * Wrapper around {@link v1.SpannerClient#executeStreamingSql}.
      *
      * @see {@link v1.SpannerClient#executeStreamingSql}
      * @see [Query Syntax](https://cloud.google.com/spanner/docs/query-syntax)
      * @see [ExecuteSql API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.ExecuteSql)
      *
      * @fires PartialResultStream#response
      *
      * @param {string|ExecuteSqlRequest} query A SQL query or
      *     {@link ExecuteSqlRequest} object.
      * @param {TimestampBounds} [options] Snapshot timestamp bounds.
      * @returns {PartialResultStream} A readable stream that emits rows.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * const query = 'SELECT * FROM Singers';
      *
      * database.runStream(query)
      *   .on('error', function(err) {})
      *   .on('data', function(row) {
      *     // row = [
      *     //   {
      *     //     name: 'SingerId',
      *     //     value: '1'
      *     //   },
      *     //   {
      *     //     name: 'Name',
      *     //     value: 'Eddie Wilson'
      *     //   }
      *     // ]
      *   // ]
      *   })
      *   .on('end', function() {
      *     // All results retrieved.
      *   });
      *
      * //-
      * // Rows are returned as an array of objects. Each object has a `name` and
      * // `value` property. To get a serialized object, call `toJSON()`.
      * //-
      * database.runStream(query)
      *   .on('error', function(err) {})
      *   .on('data', function(row) {
      *     // row.toJSON() = {
      *     //   SingerId: '1',
      *     //   Name: 'Eddie Wilson'
      *     // }
      *   })
      *   .on('end', function() {
      *     // All results retrieved.
      *   });
      *
      * //-
      * // Alternatively, set `query.json` to `true`, and this step will be performed
      * // automatically.
      * //-
      * query.json = true;
      *
      * database.runStream(query)
      *   .on('error', function(err) {})
      *   .on('data', function(row) {
      *     // row = {
      *     //   SingerId: '1',
      *     //   Name: 'Eddie Wilson'
      *     // }
      *   })
      *   .on('end', function() {
      *     // All results retrieved.
      *   });
      *
      * //-
      * // The SQL query string can contain parameter placeholders. A parameter
      * // placeholder consists of '@' followed by the parameter name.
      * //-
      * const query = {
      *   sql: 'SELECT * FROM Singers WHERE name = @name',
      *   params: {
      *     name: 'Eddie Wilson'
      *   }
      * };
      *
      * database.runStream(query)
      *   .on('error', function(err) {})
      *   .on('data', function(row) {})
      *   .on('end', function() {});
      *
      * //-
      * // If you need to enforce a specific param type, a types map can be provided.
      * // This is typically useful if your param value can be null.
      * //-
      * const query = {
      *   sql: 'SELECT * FROM Singers WHERE name = @name',
      *   params: {
      *     name: 'Eddie Wilson'
      *   },
      *   types: {
      *     name: 'string'
      *   }
      * };
      *
      * database.runStream(query)
      *   .on('error', function(err) {})
      *   .on('data', function(row) {})
      *   .on('end', function() {});
      *
      * //-
      * // If you anticipate many results, you can end a stream early to prevent
      * // unnecessary processing and API requests.
      * //-
      * database.runStream(query)
      *   .on('data', function(row) {
      *     this.end();
      *   });
      * ```
      */
    def runStream(query: String): PartialResultStream_ = js.native
    def runStream(query: String, options: TimestampBounds): PartialResultStream_ = js.native
    def runStream(query: ExecuteSqlRequest): PartialResultStream_ = js.native
    def runStream(query: ExecuteSqlRequest, options: TimestampBounds): PartialResultStream_ = js.native
    
    def runTransaction(options: RunTransactionOptions, runFn: RunTransactionCallback): Unit = js.native
    /**
      * @typedef {object} RunTransactionOptions
      * @property {number} [timeout] The maximum amount of time (in ms) that a
      *     {@link Transaction} should be ran for.
      */
    /**
      * @callback RunTransactionCallback
      * @param {?Error} err An error returned while making this request.
      * @param {Transaction} transaction The transaction object. The transaction has
      *     already been created, and is ready to be queried and committed against.
      */
    /**
      * A transaction in Cloud Spanner is a set of reads and writes that execute
      * atomically at a single logical point in time across columns, rows, and tables
      * in a database.
      *
      * Note that Cloud Spanner does not support nested transactions. If a new
      * transaction is started inside of the run function, it will be an independent
      * transaction.
      *
      * The callback you provide to this function will become the "run function". It
      * will be executed with either an error or a {@link Transaction}
      * object. The Transaction object will let you run queries and queue mutations
      * until you are ready to {@link Transaction#commit}.
      *
      * In the event that an aborted error occurs, we will re-run the `runFn` in its
      * entirety. If you prefer to handle aborted errors for yourself please refer to
      * {@link Database#getTransaction}.
      *
      * **NOTE:** In the event that you encounter an error while reading/writing,
      * if you decide to forgo calling {@link Transaction#commit} or
      * {@link Transaction#rollback}, then you need to call
      * {@link Transaction#end} to release the underlying {@link Session} object.
      * **Failure to do could result in a Session leak.**
      *
      * For a more complete listing of functionality available to a Transaction, see
      * the {@link Transaction} API documentation. For a general overview of
      * transactions within Cloud Spanner, see
      * [Transactions](https://cloud.google.com/spanner/docs/transactions) from the
      * official Cloud Spanner documentation.
      *
      * If you would like to run a transaction and receive a promise or use
      * async/await, use {@link Database#runTransactionAsync}.
      *
      * @see [Transactions](https://cloud.google.com/spanner/docs/transactions)
      *
      * @param {RunTransactionOptions} [options] Transaction runner options.
      * @param {RunTransactionCallback} callback A function to execute in the context
      *     of a transaction.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.runTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Run a transactional query.
      *   transaction.run('SELECT * FROM Singers', function(err, rows) {
      *     if (err) {
      *       // Error handling omitted.
      *     }
      *
      *     // Queue a mutation (note that there is no callback passed to `insert`).
      *     transaction.insert('Singers', {
      *       SingerId: 'Id3b',
      *       Name: 'Joe West'
      *     });
      *
      *     // Commit the transaction.
      *     transaction.commit(function(err) {
      *       if (!err) {
      *         // Transaction committed successfully.
      *       }
      *     });
      *   });
      * });
      *
      * ```
      * @example <caption>include:samples/transaction.js</caption>
      * region_tag:spanner_read_write_transaction
      * Read-write transaction:
      */
    def runTransaction(runFn: RunTransactionCallback): Unit = js.native
    
    def runTransactionAsync[T](options: RunTransactionOptions, runFn: AsyncRunTransactionCallback[T]): js.Promise[T] = js.native
    def runTransactionAsync[T](runFn: AsyncRunTransactionCallback[T]): js.Promise[T] = js.native
    
    /**
      * Create a Session object.
      *
      * It is unlikely you will need to interact with sessions directly. By default,
      * sessions are created and utilized for maximum performance automatically.
      *
      * @param {string} [name] The name of the session. If not provided, it is
      *     assumed you are going to create it.
      * @returns {Session} A Session object.
      *
      * @example
      * ```
      * var session = database.session('session-name');
      * ```
      */
    def session(): Session = js.native
    def session(name: String): Session = js.native
    
    /**
      * Get a reference to a Table object.
      *
      * @throws {GoogleError} If a name is not provided.
      *
      * @param {string} name The name of the table.
      * @return {Table} A Table object.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * const table = database.table('Singers');
      * ```
      */
    def table(name: String): Table = js.native
    
    /**
      * Update the schema of the database by creating/altering/dropping tables,
      * columns, indexes, etc.
      *
      * This method immediately responds with an Operation object. Register event
      * handlers for the "error" and "complete" events to see how the operation
      * finishes. Follow along with the examples below.
      *
      * Wrapper around {@link v1.DatabaseAdminClient#updateDatabaseDdl}.
      *
      * @see {@link v1.DatabaseAdminClient#updateDatabaseDdl}
      * @see [Data Definition Language (DDL)](https://cloud.google.com/spanner/docs/data-definition-language)
      * @see [Schema and Data Model](https://cloud.google.com/spanner/docs/schema-and-data-model)
      * @see [UpdateDatabaseDdl API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.database.v1#google.spanner.admin.database.v1.UpdateDatabaseDdlRequest)
      *
      * @param {string|string[]|object} statements An array of database DDL
      *     statements, or an
      *     [`UpdateDatabaseDdlRequest` object](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.admin.database.v1#google.spanner.admin.database.v1.UpdateDatabaseDdlRequest).
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {LongRunningOperationCallback} [callback] Callback function.
      * @returns {Promise<LongRunningOperationResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * const statements = [
      *   'CREATE TABLE Singers (' +
      *   '  SingerId INT64 NOT NULL,' +
      *   '  FirstName STRING(1024),' +
      *   '  LastName STRING(1024),' +
      *   '  SingerInfo BYTES(MAX),' +
      *   ') PRIMARY KEY(SingerId)'
      * ];
      *
      * database.updateSchema(statements, function(err, operation, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   operation
      *     .on('error', function(err) {})
      *     .on('complete', function() {
      *       // Database schema updated successfully.
      *     });
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.updateSchema(statements)
      *   .then(function(data) {
      *     const operation = data[0];
      *     return operation.promise();
      *   })
      *   .then(function() {
      *     // Database schema updated successfully.
      *   });
      *
      * ```
      * @example <caption>include:samples/schema.js</caption>
      * region_tag:spanner_add_column
      * Adding a column:
      *
      * @example <caption>include:samples/index-create.js</caption>
      * region_tag:spanner_create_index
      * Creating an index:
      *
      * @example <caption>include:samples/index-create-stroing.js</caption>
      * region_tag:spanner_create_storing_index
      * Creating a storing index:
      */
    def updateSchema(statements: Schema): js.Promise[UpdateSchemaResponse] = js.native
    def updateSchema(statements: Schema, callback: UpdateSchemaCallback): Unit = js.native
    def updateSchema(statements: Schema, gaxOptions: CallOptions): js.Promise[UpdateSchemaResponse] = js.native
    def updateSchema(statements: Schema, gaxOptions: CallOptions, callback: UpdateSchemaCallback): Unit = js.native
  }
  object Database {
    
    @JSImport("@google-cloud/spanner/build/src/database", "Database")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format the database name to include the instance name.
      *
      * @private
      *
      * @param {string} instanceName The formatted instance name.
      * @param {string} name The table name.
      * @returns {string}
      *
      * @example
      * ```
      * Database.formatName_(
      *   'projects/grape-spaceship-123/instances/my-instance',
      *   'my-database'
      * );
      * // 'projects/grape-spaceship-123/instances/my-instance/databases/my-database'
      * ```
      */
    /* static member */
    inline def formatName(instanceName: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(instanceName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def getEnvironmentQueryOptions(): IQueryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentQueryOptions")().asInstanceOf[IQueryOptions]
  }
  
  type BatchCreateSessionsCallback = ResourceCallback[js.Array[Session], IBatchCreateSessionsResponse]
  
  trait BatchCreateSessionsOptions
    extends StObject
       with CreateSessionOptions {
    
    var count: Double
  }
  object BatchCreateSessionsOptions {
    
    inline def apply(count: Double): BatchCreateSessionsOptions = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchCreateSessionsOptions]
    }
    
    extension [Self <: BatchCreateSessionsOptions](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  type BatchCreateSessionsResponse = js.Tuple2[js.Array[Session], IBatchCreateSessionsResponse]
  
  @js.native
  trait CancelableDuplex extends Duplex {
    
    def cancel(): Unit = js.native
  }
  
  type CreateBatchTransactionCallback = ResourceCallback[BatchTransaction, ITransaction | ISession]
  
  type CreateBatchTransactionResponse = js.Tuple2[BatchTransaction, ITransaction | ISession]
  
  type CreateSessionCallback = ResourceCallback[Session, ISession]
  
  trait CreateSessionOptions extends StObject {
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
    
    var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  }
  object CreateSessionOptions {
    
    inline def apply(): CreateSessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSessionOptions]
    }
    
    extension [Self <: CreateSessionOptions](x: Self) {
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
      
      inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsNull: Self = StObject.set(x, "labels", null)
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    }
  }
  
  type CreateSessionResponse = js.Tuple2[Session, ISession]
  
  type DatabaseCallback = ResourceCallback[Database, Response[Any]]
  
  type DatabaseCloseResponse = js.Array[IEmpty]
  
  type DatabaseDeleteCallback = NormalCallback[IEmpty]
  
  type DatabaseDeleteResponse = js.Array[IEmpty]
  
  @js.native
  trait DatabaseRequest extends StObject {
    
    def apply(config: RequestConfig, callback: ResourceCallback[Operation_, IOperation]): Unit = js.native
    def apply[T](config: RequestConfig, callback: RequestCallback[T, Unit]): Unit = js.native
  }
  
  type DatabaseResponse = js.Tuple2[Database, Response[Any]]
  
  trait GetDatabaseConfig
    extends StObject
       with GetConfig
       with IGetDatabaseRequest {
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
  }
  object GetDatabaseConfig {
    
    inline def apply(): GetDatabaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDatabaseConfig]
    }
    
    extension [Self <: GetDatabaseConfig](x: Self) {
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
    }
  }
  
  type GetDatabaseMetadataCallback = RequestCallback[IDatabaseTranslatedEnum, Unit]
  
  type GetDatabaseMetadataResponse = js.Array[IDatabaseTranslatedEnum]
  
  type GetRestoreInfoCallback = NormalCallback[IRestoreInfoTranslatedEnum]
  
  type GetSchemaCallback = RequestCallback[String, IGetDatabaseDdlResponse]
  
  type GetSchemaResponse = js.Tuple2[js.Array[String], IGetDatabaseDdlResponse]
  
  type GetSessionsCallback = RequestCallback[Session, IListSessionsResponse]
  
  type GetSessionsOptions = PagedOptionsWithFilter
  
  type GetSessionsResponse = PagedResponse[Session, IListSessionsResponse]
  
  type GetSnapshotCallback = NormalCallback[Snapshot]
  
  type GetStateCallback = NormalCallback[
    EnumKey[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
    ]
  ]
  
  type GetTransactionCallback = NormalCallback[Transaction]
  
  /**
    * IDatabase structure with database state enum translated to string form.
    */
  /* Inlined std.Omit<@google-cloud/spanner.@google-cloud/spanner.TranslateEnumKeys<@google-cloud/spanner.@google-cloud/spanner/build/protos/protos.google.spanner.admin.database.v1.IDatabase, 'state', / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State * / any>, 'restoreInfo'> & {  restoreInfo :@google-cloud/spanner.@google-cloud/spanner/build/src/database.IRestoreInfoTranslatedEnum | null | undefined} */
  trait IDatabaseTranslatedEnum extends StObject {
    
    var createTime: js.UndefOr[
        ITimestamp | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
        ])
      ] = js.undefined
    
    var databaseDialect: js.UndefOr[
        DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
        ])
      ] = js.undefined
    
    var defaultLeader: js.UndefOr[
        String | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
        ])
      ] = js.undefined
    
    var earliestVersionTime: js.UndefOr[
        ITimestamp | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
        ])
      ] = js.undefined
    
    var encryptionConfig: js.UndefOr[
        IEncryptionConfig | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
        ])
      ] = js.undefined
    
    var encryptionInfo: js.UndefOr[
        js.Array[IEncryptionInfo] | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
        ])
      ] = js.undefined
    
    var name: js.UndefOr[
        String | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
        ])
      ] = js.undefined
    
    var restoreInfo: js.UndefOr[IRestoreInfoTranslatedEnum | Null] = js.undefined
    
    var state: js.UndefOr[
        State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Database.State * / any */ String) | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
        ])
      ] = js.undefined
    
    var versionRetentionPeriod: js.UndefOr[
        String | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
        ])
      ] = js.undefined
  }
  object IDatabaseTranslatedEnum {
    
    inline def apply(): IDatabaseTranslatedEnum = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatabaseTranslatedEnum]
    }
    
    extension [Self <: IDatabaseTranslatedEnum](x: Self) {
      
      inline def setCreateTime(
        value: ITimestamp | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
            ])
      ): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
      
      inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      inline def setDatabaseDialect(
        value: DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
            ])
      ): Self = StObject.set(x, "databaseDialect", value.asInstanceOf[js.Any])
      
      inline def setDatabaseDialectNull: Self = StObject.set(x, "databaseDialect", null)
      
      inline def setDatabaseDialectUndefined: Self = StObject.set(x, "databaseDialect", js.undefined)
      
      inline def setDefaultLeader(
        value: String | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
            ])
      ): Self = StObject.set(x, "defaultLeader", value.asInstanceOf[js.Any])
      
      inline def setDefaultLeaderNull: Self = StObject.set(x, "defaultLeader", null)
      
      inline def setDefaultLeaderUndefined: Self = StObject.set(x, "defaultLeader", js.undefined)
      
      inline def setEarliestVersionTime(
        value: ITimestamp | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
            ])
      ): Self = StObject.set(x, "earliestVersionTime", value.asInstanceOf[js.Any])
      
      inline def setEarliestVersionTimeNull: Self = StObject.set(x, "earliestVersionTime", null)
      
      inline def setEarliestVersionTimeUndefined: Self = StObject.set(x, "earliestVersionTime", js.undefined)
      
      inline def setEncryptionConfig(
        value: IEncryptionConfig | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
            ])
      ): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfigNull: Self = StObject.set(x, "encryptionConfig", null)
      
      inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
      
      inline def setEncryptionInfo(
        value: js.Array[IEncryptionInfo] | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
            ])
      ): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
      
      inline def setEncryptionInfoNull: Self = StObject.set(x, "encryptionInfo", null)
      
      inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
      
      inline def setEncryptionInfoVarargs(value: IEncryptionInfo*): Self = StObject.set(x, "encryptionInfo", js.Array(value*))
      
      inline def setName(
        value: String | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
            ])
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRestoreInfo(value: IRestoreInfoTranslatedEnum): Self = StObject.set(x, "restoreInfo", value.asInstanceOf[js.Any])
      
      inline def setRestoreInfoNull: Self = StObject.set(x, "restoreInfo", null)
      
      inline def setRestoreInfoUndefined: Self = StObject.set(x, "restoreInfo", js.undefined)
      
      inline def setState(
        value: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.Database.State * / any */ String) | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
            ])
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setVersionRetentionPeriod(
        value: String | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.Database.State */ Any
            ])
      ): Self = StObject.set(x, "versionRetentionPeriod", value.asInstanceOf[js.Any])
      
      inline def setVersionRetentionPeriodNull: Self = StObject.set(x, "versionRetentionPeriod", null)
      
      inline def setVersionRetentionPeriodUndefined: Self = StObject.set(x, "versionRetentionPeriod", js.undefined)
    }
  }
  
  /**
    * IRestoreInfo structure with restore source type enum translated to string form.
    */
  /* Inlined @google-cloud/spanner.@google-cloud/spanner.TranslateEnumKeys<@google-cloud/spanner.@google-cloud/spanner/build/protos/protos.google.spanner.admin.database.v1.IRestoreInfo, 'sourceType', / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.RestoreSourceType * / any> */
  trait IRestoreInfoTranslatedEnum extends StObject {
    
    var backupInfo: js.UndefOr[
        IBackupInfo | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.RestoreSourceType */ Any
        ])
      ] = js.undefined
    
    var sourceType: js.UndefOr[
        RestoreSourceType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreSourceType * / any */ String) | Null | (EnumKey[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.RestoreSourceType */ Any
        ])
      ] = js.undefined
  }
  object IRestoreInfoTranslatedEnum {
    
    inline def apply(): IRestoreInfoTranslatedEnum = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRestoreInfoTranslatedEnum]
    }
    
    extension [Self <: IRestoreInfoTranslatedEnum](x: Self) {
      
      inline def setBackupInfo(
        value: IBackupInfo | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.RestoreSourceType */ Any
            ])
      ): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
      
      inline def setBackupInfoNull: Self = StObject.set(x, "backupInfo", null)
      
      inline def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
      
      inline def setSourceType(
        value: RestoreSourceType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreSourceType * / any */ String) | (EnumKey[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof databaseAdmin.spanner.admin.database.v1.RestoreSourceType */ Any
            ])
      ): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
  
  type PoolRequestCallback = RequestCallback[Session, Unit]
  
  type RestoreDatabaseCallback = LongRunningCallback[Database]
  
  type RestoreDatabaseResponse = js.Tuple3[
    Database, 
    Operation_, 
    typings.googleCloudSpanner.protosMod.google.longrunning.IOperation
  ]
  
  trait RestoreOptions extends StObject {
    
    var encryptionConfig: js.UndefOr[IRestoreDatabaseEncryptionConfig] = js.undefined
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
  }
  object RestoreOptions {
    
    inline def apply(): RestoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestoreOptions]
    }
    
    extension [Self <: RestoreOptions](x: Self) {
      
      inline def setEncryptionConfig(value: IRestoreDatabaseEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
    }
  }
  
  @js.native
  trait SessionPoolConstructor
    extends StObject
       with Instantiable1[/* database */ Database, SessionPoolInterface]
       with Instantiable2[/* database */ Database, /* options */ SessionPoolOptions, SessionPoolInterface]
  
  type UpdateSchemaCallback = ResourceCallback[Operation_, typings.googleCloudSpanner.protosMod.google.longrunning.IOperation]
  
  type UpdateSchemaResponse = js.Tuple2[Operation_, typings.googleCloudSpanner.protosMod.google.longrunning.IOperation]
}
