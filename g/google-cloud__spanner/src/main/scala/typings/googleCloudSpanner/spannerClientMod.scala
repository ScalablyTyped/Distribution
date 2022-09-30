package typings.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleCloudSpanner.protosMod.google.protobuf.IEmpty
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IBatchCreateSessionsRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IBatchCreateSessionsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IBeginTransactionRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ICommitRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ICommitResponse
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ICreateSessionRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IDeleteSessionRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IExecuteBatchDmlRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IExecuteBatchDmlResponse
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IExecuteSqlRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IGetSessionRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IListSessionsRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IListSessionsResponse
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IPartitionQueryRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IPartitionReadRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IPartitionResponse
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IReadRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IResultSet
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IRollbackRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ISession
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ITransaction
import typings.googleGax.apitypesMod.CancellableStream
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.clientInterfaceMod.Descriptors
import typings.googleGax.clientInterfaceMod.PaginationCallback
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.mod.GoogleAuth
import typings.googleGax.mod.PathTemplate
import typings.node.streamMod.Transform
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spannerClientMod {
  
  @JSImport("@google-cloud/spanner/build/src/v1/spanner_client", "SpannerClient")
  @js.native
  /**
    * Construct an instance of SpannerClient.
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
  open class SpannerClient () extends StObject {
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
      * Creates multiple new sessions.
      *
      * This API can be used to initialize a session cache on the clients.
      * See https://goo.gl/TgSFN2 for best practices on session cache management.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database in which the new sessions are created.
      * @param {google.spanner.v1.Session} request.sessionTemplate
      *   Parameters to be applied to each created session.
      * @param {number} request.sessionCount
      *   Required. The number of sessions to be created in this batch call.
      *   The API may return fewer than the requested number of sessions. If a
      *   specific number of sessions are desired, the client can make additional
      *   calls to BatchCreateSessions (adjusting
      *   {@link google.spanner.v1.BatchCreateSessionsRequest.session_count|session_count} as necessary).
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [BatchCreateSessionsResponse]{@link google.spanner.v1.BatchCreateSessionsResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def batchCreateSessions(): js.Promise[
        js.Tuple3[
          IBatchCreateSessionsResponse, 
          js.UndefOr[IBatchCreateSessionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def batchCreateSessions(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          IBatchCreateSessionsResponse, 
          js.UndefOr[IBatchCreateSessionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def batchCreateSessions(request: IBatchCreateSessionsRequest): js.Promise[
        js.Tuple3[
          IBatchCreateSessionsResponse, 
          js.UndefOr[IBatchCreateSessionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def batchCreateSessions(
      request: IBatchCreateSessionsRequest,
      callback: Callback[
          IBatchCreateSessionsResponse, 
          js.UndefOr[IBatchCreateSessionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def batchCreateSessions(request: IBatchCreateSessionsRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          IBatchCreateSessionsResponse, 
          js.UndefOr[IBatchCreateSessionsRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def batchCreateSessions(
      request: IBatchCreateSessionsRequest,
      options: CallOptions,
      callback: Callback[
          IBatchCreateSessionsResponse, 
          js.UndefOr[IBatchCreateSessionsRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Begins a new transaction. This step can often be skipped:
      * {@link google.spanner.v1.Spanner.Read|Read}, {@link google.spanner.v1.Spanner.ExecuteSql|ExecuteSql} and
      * {@link google.spanner.v1.Spanner.Commit|Commit} can begin a new transaction as a
      * side-effect.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session in which the transaction runs.
      * @param {google.spanner.v1.TransactionOptions} request.options
      *   Required. Options for the new transaction.
      * @param {google.spanner.v1.RequestOptions} request.requestOptions
      *   Common options for this request.
      *   Priority is ignored for this request. Setting the priority in this
      *   request_options struct will not do anything. To set the priority for a
      *   transaction, set it on the reads and writes that are part of this
      *   transaction instead.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Transaction]{@link google.spanner.v1.Transaction}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def beginTransaction(): js.Promise[
        js.Tuple3[ITransaction, js.UndefOr[IBeginTransactionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def beginTransaction(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[ITransaction, js.UndefOr[IBeginTransactionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def beginTransaction(request: IBeginTransactionRequest): js.Promise[
        js.Tuple3[ITransaction, js.UndefOr[IBeginTransactionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def beginTransaction(
      request: IBeginTransactionRequest,
      callback: Callback[
          ITransaction, 
          js.UndefOr[IBeginTransactionRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def beginTransaction(request: IBeginTransactionRequest, options: CallOptions): js.Promise[
        js.Tuple3[ITransaction, js.UndefOr[IBeginTransactionRequest], js.UndefOr[js.Object]]
      ] = js.native
    def beginTransaction(
      request: IBeginTransactionRequest,
      options: CallOptions,
      callback: Callback[
          ITransaction, 
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
      * Commits a transaction. The request includes the mutations to be
      * applied to rows in the database.
      *
      * `Commit` might return an `ABORTED` error. This can occur at any time;
      * commonly, the cause is conflicts with concurrent
      * transactions. However, it can also happen for a variety of other
      * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt
      * the transaction from the beginning, re-using the same session.
      *
      * On very rare occasions, `Commit` might return `UNKNOWN`. This can happen,
      * for example, if the client job experiences a 1+ hour networking failure.
      * At that point, Cloud Spanner has lost track of the transaction outcome and
      * we recommend that you perform another read from the database to see the
      * state of things as they are now.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session in which the transaction to be committed is running.
      * @param {Buffer} request.transactionId
      *   Commit a previously-started transaction.
      * @param {google.spanner.v1.TransactionOptions} request.singleUseTransaction
      *   Execute mutations in a temporary transaction. Note that unlike
      *   commit of a previously-started transaction, commit with a
      *   temporary transaction is non-idempotent. That is, if the
      *   `CommitRequest` is sent to Cloud Spanner more than once (for
      *   instance, due to retries in the application, or in the
      *   transport library), it is possible that the mutations are
      *   executed more than once. If this is undesirable, use
      *   {@link google.spanner.v1.Spanner.BeginTransaction|BeginTransaction} and
      *   {@link google.spanner.v1.Spanner.Commit|Commit} instead.
      * @param {number[]} request.mutations
      *   The mutations to be executed when this transaction commits. All
      *   mutations are applied atomically, in the order they appear in
      *   this list.
      * @param {boolean} request.returnCommitStats
      *   If `true`, then statistics related to the transaction will be included in
      *   the {@link google.spanner.v1.CommitResponse.commit_stats|CommitResponse}. Default value is
      *   `false`.
      * @param {google.spanner.v1.RequestOptions} request.requestOptions
      *   Common options for this request.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [CommitResponse]{@link google.spanner.v1.CommitResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
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
      * Creates a new session. A session can be used to perform
      * transactions that read and/or modify data in a Cloud Spanner database.
      * Sessions are meant to be reused for many consecutive
      * transactions.
      *
      * Sessions can only execute one transaction at a time. To execute
      * multiple concurrent read-write/write-only transactions, create
      * multiple sessions. Note that standalone reads and queries use a
      * transaction internally, and count toward the one transaction
      * limit.
      *
      * Active sessions use additional server resources, so it is a good idea to
      * delete idle and unneeded sessions.
      * Aside from explicit deletes, Cloud Spanner may delete sessions for which no
      * operations are sent for more than an hour. If a session is deleted,
      * requests to it return `NOT_FOUND`.
      *
      * Idle sessions can be kept alive by sending a trivial SQL query
      * periodically, e.g., `"SELECT 1"`.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database in which the new session is created.
      * @param {google.spanner.v1.Session} request.session
      *   Required. The session to create.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Session]{@link google.spanner.v1.Session}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def createSession(): js.Promise[js.Tuple3[ISession, js.UndefOr[ICreateSessionRequest], js.UndefOr[js.Object]]] = js.native
    def createSession(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ISession, js.UndefOr[ICreateSessionRequest], js.UndefOr[js.Object]]] = js.native
    def createSession(request: ICreateSessionRequest): js.Promise[js.Tuple3[ISession, js.UndefOr[ICreateSessionRequest], js.UndefOr[js.Object]]] = js.native
    def createSession(
      request: ICreateSessionRequest,
      callback: Callback[ISession, js.UndefOr[ICreateSessionRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def createSession(request: ICreateSessionRequest, options: CallOptions): js.Promise[js.Tuple3[ISession, js.UndefOr[ICreateSessionRequest], js.UndefOr[js.Object]]] = js.native
    def createSession(
      request: ICreateSessionRequest,
      options: CallOptions,
      callback: Callback[ISession, js.UndefOr[ICreateSessionRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
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
      * Ends a session, releasing server resources associated with it. This will
      * asynchronously trigger cancellation of any operations that are running with
      * this session.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The name of the session to delete.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def deleteSession(): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSessionRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSession(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSessionRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSession(request: IDeleteSessionRequest): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSessionRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSession(
      request: IDeleteSessionRequest,
      callback: Callback[IEmpty, js.UndefOr[IDeleteSessionRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def deleteSession(request: IDeleteSessionRequest, options: CallOptions): js.Promise[js.Tuple3[IEmpty, js.UndefOr[IDeleteSessionRequest], js.UndefOr[js.Object]]] = js.native
    def deleteSession(
      request: IDeleteSessionRequest,
      options: CallOptions,
      callback: Callback[IEmpty, js.UndefOr[IDeleteSessionRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    var descriptors: Descriptors = js.native
    
    /**
      * Executes a batch of SQL DML statements. This method allows many statements
      * to be run with lower latency than submitting them sequentially with
      * {@link google.spanner.v1.Spanner.ExecuteSql|ExecuteSql}.
      *
      * Statements are executed in sequential order. A request can succeed even if
      * a statement fails. The {@link google.spanner.v1.ExecuteBatchDmlResponse.status|ExecuteBatchDmlResponse.status} field in the
      * response provides information about the statement that failed. Clients must
      * inspect this field to determine whether an error occurred.
      *
      * Execution stops after the first failed statement; the remaining statements
      * are not executed.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session in which the DML statements should be performed.
      * @param {google.spanner.v1.TransactionSelector} request.transaction
      *   Required. The transaction to use. Must be a read-write transaction.
      *
      *   To protect against replays, single-use transactions are not supported. The
      *   caller must either supply an existing transaction ID or begin a new
      *   transaction.
      * @param {number[]} request.statements
      *   Required. The list of statements to execute in this batch. Statements are executed
      *   serially, such that the effects of statement `i` are visible to statement
      *   `i+1`. Each statement must be a DML statement. Execution stops at the
      *   first failed statement; the remaining statements are not executed.
      *
      *   Callers must provide at least one statement.
      * @param {number} request.seqno
      *   Required. A per-transaction sequence number used to identify this request. This field
      *   makes each request idempotent such that if the request is received multiple
      *   times, at most one will succeed.
      *
      *   The sequence number must be monotonically increasing within the
      *   transaction. If a request arrives for the first time with an out-of-order
      *   sequence number, the transaction may be aborted. Replays of previously
      *   handled requests will yield the same response as the first execution.
      * @param {google.spanner.v1.RequestOptions} request.requestOptions
      *   Common options for this request.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [ExecuteBatchDmlResponse]{@link google.spanner.v1.ExecuteBatchDmlResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def executeBatchDml(): js.Promise[
        js.Tuple3[IExecuteBatchDmlResponse, js.UndefOr[IExecuteBatchDmlRequest], js.UndefOr[js.Object]]
      ] = js.native
    def executeBatchDml(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IExecuteBatchDmlResponse, js.UndefOr[IExecuteBatchDmlRequest], js.UndefOr[js.Object]]
      ] = js.native
    def executeBatchDml(request: IExecuteBatchDmlRequest): js.Promise[
        js.Tuple3[IExecuteBatchDmlResponse, js.UndefOr[IExecuteBatchDmlRequest], js.UndefOr[js.Object]]
      ] = js.native
    def executeBatchDml(
      request: IExecuteBatchDmlRequest,
      callback: Callback[
          IExecuteBatchDmlResponse, 
          js.UndefOr[IExecuteBatchDmlRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def executeBatchDml(request: IExecuteBatchDmlRequest, options: CallOptions): js.Promise[
        js.Tuple3[IExecuteBatchDmlResponse, js.UndefOr[IExecuteBatchDmlRequest], js.UndefOr[js.Object]]
      ] = js.native
    def executeBatchDml(
      request: IExecuteBatchDmlRequest,
      options: CallOptions,
      callback: Callback[
          IExecuteBatchDmlResponse, 
          js.UndefOr[IExecuteBatchDmlRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Executes an SQL statement, returning all results in a single reply. This
      * method cannot be used to return a result set larger than 10 MiB;
      * if the query yields more data than that, the query fails with
      * a `FAILED_PRECONDITION` error.
      *
      * Operations inside read-write transactions might return `ABORTED`. If
      * this occurs, the application should restart the transaction from
      * the beginning. See {@link google.spanner.v1.Transaction|Transaction} for more details.
      *
      * Larger result sets can be fetched in streaming fashion by calling
      * {@link google.spanner.v1.Spanner.ExecuteStreamingSql|ExecuteStreamingSql} instead.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session in which the SQL query should be performed.
      * @param {google.spanner.v1.TransactionSelector} request.transaction
      *   The transaction to use.
      *
      *   For queries, if none is provided, the default is a temporary read-only
      *   transaction with strong concurrency.
      *
      *   Standard DML statements require a read-write transaction. To protect
      *   against replays, single-use transactions are not supported.  The caller
      *   must either supply an existing transaction ID or begin a new transaction.
      *
      *   Partitioned DML requires an existing Partitioned DML transaction ID.
      * @param {string} request.sql
      *   Required. The SQL string.
      * @param {google.protobuf.Struct} request.params
      *   Parameter names and values that bind to placeholders in the SQL string.
      *
      *   A parameter placeholder consists of the `@` character followed by the
      *   parameter name (for example, `@firstName`). Parameter names must conform
      *   to the naming requirements of identifiers as specified at
      *   https://cloud.google.com/spanner/docs/lexical#identifiers.
      *
      *   Parameters can appear anywhere that a literal value is expected.  The same
      *   parameter name can be used more than once, for example:
      *
      *   `"WHERE id > @msg_id AND id < @msg_id + 100"`
      *
      *   It is an error to execute a SQL statement with unbound parameters.
      * @param {number[]} request.paramTypes
      *   It is not always possible for Cloud Spanner to infer the right SQL type
      *   from a JSON value.  For example, values of type `BYTES` and values
      *   of type `STRING` both appear in {@link google.spanner.v1.ExecuteSqlRequest.params|params} as JSON strings.
      *
      *   In these cases, `param_types` can be used to specify the exact
      *   SQL type for some or all of the SQL statement parameters. See the
      *   definition of {@link google.spanner.v1.Type|Type} for more information
      *   about SQL types.
      * @param {Buffer} request.resumeToken
      *   If this request is resuming a previously interrupted SQL statement
      *   execution, `resume_token` should be copied from the last
      *   {@link google.spanner.v1.PartialResultSet|PartialResultSet} yielded before the interruption. Doing this
      *   enables the new SQL statement execution to resume where the last one left
      *   off. The rest of the request parameters must exactly match the
      *   request that yielded this token.
      * @param {google.spanner.v1.ExecuteSqlRequest.QueryMode} request.queryMode
      *   Used to control the amount of debugging information returned in
      *   {@link google.spanner.v1.ResultSetStats|ResultSetStats}. If {@link google.spanner.v1.ExecuteSqlRequest.partition_token|partition_token} is set, {@link google.spanner.v1.ExecuteSqlRequest.query_mode|query_mode} can only
      *   be set to {@link google.spanner.v1.ExecuteSqlRequest.QueryMode.NORMAL|QueryMode.NORMAL}.
      * @param {Buffer} request.partitionToken
      *   If present, results will be restricted to the specified partition
      *   previously created using PartitionQuery().  There must be an exact
      *   match for the values of fields common to this message and the
      *   PartitionQueryRequest message used to create this partition_token.
      * @param {number} request.seqno
      *   A per-transaction sequence number used to identify this request. This field
      *   makes each request idempotent such that if the request is received multiple
      *   times, at most one will succeed.
      *
      *   The sequence number must be monotonically increasing within the
      *   transaction. If a request arrives for the first time with an out-of-order
      *   sequence number, the transaction may be aborted. Replays of previously
      *   handled requests will yield the same response as the first execution.
      *
      *   Required for DML statements. Ignored for queries.
      * @param {google.spanner.v1.ExecuteSqlRequest.QueryOptions} request.queryOptions
      *   Query optimizer configuration to use for the given query.
      * @param {google.spanner.v1.RequestOptions} request.requestOptions
      *   Common options for this request.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [ResultSet]{@link google.spanner.v1.ResultSet}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def executeSql(): js.Promise[js.Tuple3[IResultSet, js.UndefOr[IExecuteSqlRequest], js.UndefOr[js.Object]]] = js.native
    def executeSql(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IResultSet, js.UndefOr[IExecuteSqlRequest], js.UndefOr[js.Object]]] = js.native
    def executeSql(request: IExecuteSqlRequest): js.Promise[js.Tuple3[IResultSet, js.UndefOr[IExecuteSqlRequest], js.UndefOr[js.Object]]] = js.native
    def executeSql(
      request: IExecuteSqlRequest,
      callback: Callback[IResultSet, js.UndefOr[IExecuteSqlRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def executeSql(request: IExecuteSqlRequest, options: CallOptions): js.Promise[js.Tuple3[IResultSet, js.UndefOr[IExecuteSqlRequest], js.UndefOr[js.Object]]] = js.native
    def executeSql(
      request: IExecuteSqlRequest,
      options: CallOptions,
      callback: Callback[IResultSet, js.UndefOr[IExecuteSqlRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Like {@link google.spanner.v1.Spanner.ExecuteSql|ExecuteSql}, except returns the result
      * set as a stream. Unlike {@link google.spanner.v1.Spanner.ExecuteSql|ExecuteSql}, there
      * is no limit on the size of the returned result set. However, no
      * individual row in the result set can exceed 100 MiB, and no
      * column value can exceed 10 MiB.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session in which the SQL query should be performed.
      * @param {google.spanner.v1.TransactionSelector} request.transaction
      *   The transaction to use.
      *
      *   For queries, if none is provided, the default is a temporary read-only
      *   transaction with strong concurrency.
      *
      *   Standard DML statements require a read-write transaction. To protect
      *   against replays, single-use transactions are not supported.  The caller
      *   must either supply an existing transaction ID or begin a new transaction.
      *
      *   Partitioned DML requires an existing Partitioned DML transaction ID.
      * @param {string} request.sql
      *   Required. The SQL string.
      * @param {google.protobuf.Struct} request.params
      *   Parameter names and values that bind to placeholders in the SQL string.
      *
      *   A parameter placeholder consists of the `@` character followed by the
      *   parameter name (for example, `@firstName`). Parameter names must conform
      *   to the naming requirements of identifiers as specified at
      *   https://cloud.google.com/spanner/docs/lexical#identifiers.
      *
      *   Parameters can appear anywhere that a literal value is expected.  The same
      *   parameter name can be used more than once, for example:
      *
      *   `"WHERE id > @msg_id AND id < @msg_id + 100"`
      *
      *   It is an error to execute a SQL statement with unbound parameters.
      * @param {number[]} request.paramTypes
      *   It is not always possible for Cloud Spanner to infer the right SQL type
      *   from a JSON value.  For example, values of type `BYTES` and values
      *   of type `STRING` both appear in {@link google.spanner.v1.ExecuteSqlRequest.params|params} as JSON strings.
      *
      *   In these cases, `param_types` can be used to specify the exact
      *   SQL type for some or all of the SQL statement parameters. See the
      *   definition of {@link google.spanner.v1.Type|Type} for more information
      *   about SQL types.
      * @param {Buffer} request.resumeToken
      *   If this request is resuming a previously interrupted SQL statement
      *   execution, `resume_token` should be copied from the last
      *   {@link google.spanner.v1.PartialResultSet|PartialResultSet} yielded before the interruption. Doing this
      *   enables the new SQL statement execution to resume where the last one left
      *   off. The rest of the request parameters must exactly match the
      *   request that yielded this token.
      * @param {google.spanner.v1.ExecuteSqlRequest.QueryMode} request.queryMode
      *   Used to control the amount of debugging information returned in
      *   {@link google.spanner.v1.ResultSetStats|ResultSetStats}. If {@link google.spanner.v1.ExecuteSqlRequest.partition_token|partition_token} is set, {@link google.spanner.v1.ExecuteSqlRequest.query_mode|query_mode} can only
      *   be set to {@link google.spanner.v1.ExecuteSqlRequest.QueryMode.NORMAL|QueryMode.NORMAL}.
      * @param {Buffer} request.partitionToken
      *   If present, results will be restricted to the specified partition
      *   previously created using PartitionQuery().  There must be an exact
      *   match for the values of fields common to this message and the
      *   PartitionQueryRequest message used to create this partition_token.
      * @param {number} request.seqno
      *   A per-transaction sequence number used to identify this request. This field
      *   makes each request idempotent such that if the request is received multiple
      *   times, at most one will succeed.
      *
      *   The sequence number must be monotonically increasing within the
      *   transaction. If a request arrives for the first time with an out-of-order
      *   sequence number, the transaction may be aborted. Replays of previously
      *   handled requests will yield the same response as the first execution.
      *
      *   Required for DML statements. Ignored for queries.
      * @param {google.spanner.v1.ExecuteSqlRequest.QueryOptions} request.queryOptions
      *   Query optimizer configuration to use for the given query.
      * @param {google.spanner.v1.RequestOptions} request.requestOptions
      *   Common options for this request.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits [PartialResultSet]{@link google.spanner.v1.PartialResultSet} on 'data' event.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#server-streaming)
      *   for more details and examples.
      */
    def executeStreamingSql(): CancellableStream = js.native
    def executeStreamingSql(request: Unit, options: CallOptions): CancellableStream = js.native
    def executeStreamingSql(request: IExecuteSqlRequest): CancellableStream = js.native
    def executeStreamingSql(request: IExecuteSqlRequest, options: CallOptions): CancellableStream = js.native
    
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: Callback[String, Unit, Unit]): Unit = js.native
    
    /**
      * Gets a session. Returns `NOT_FOUND` if the session does not exist.
      * This is mainly useful for determining whether a session is still
      * alive.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.name
      *   Required. The name of the session to retrieve.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Session]{@link google.spanner.v1.Session}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def getSession(): js.Promise[js.Tuple3[ISession, js.UndefOr[IGetSessionRequest], js.UndefOr[js.Object]]] = js.native
    def getSession(request: Unit, options: CallOptions): js.Promise[js.Tuple3[ISession, js.UndefOr[IGetSessionRequest], js.UndefOr[js.Object]]] = js.native
    def getSession(request: IGetSessionRequest): js.Promise[js.Tuple3[ISession, js.UndefOr[IGetSessionRequest], js.UndefOr[js.Object]]] = js.native
    def getSession(
      request: IGetSessionRequest,
      callback: Callback[ISession, js.UndefOr[IGetSessionRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getSession(request: IGetSessionRequest, options: CallOptions): js.Promise[js.Tuple3[ISession, js.UndefOr[IGetSessionRequest], js.UndefOr[js.Object]]] = js.native
    def getSession(
      request: IGetSessionRequest,
      options: CallOptions,
      callback: Callback[ISession, js.UndefOr[IGetSessionRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
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
      * Lists all sessions in a given database.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database in which to list sessions.
      * @param {number} request.pageSize
      *   Number of sessions to be returned in the response. If 0 or less, defaults
      *   to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.v1.ListSessionsResponse.next_page_token|next_page_token} from a previous
      *   {@link google.spanner.v1.ListSessionsResponse|ListSessionsResponse}.
      * @param {string} request.filter
      *   An expression for filtering the results of the request. Filter rules are
      *   case insensitive. The fields eligible for filtering are:
      *
      *     * `labels.key` where key is the name of a label
      *
      *   Some examples of using filters are:
      *
      *     * `labels.env:*` --> The session has the label "env".
      *     * `labels.env:dev` --> The session has the label "env" and the value of
      *                          the label contains the string "dev".
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of [Session]{@link google.spanner.v1.Session}.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed and will merge results from all the pages into this array.
      *   Note that it can affect your quota.
      *   We recommend using `listSessionsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSessions(): js.Promise[
        js.Tuple3[js.Array[ISession], IListSessionsRequest | Null, IListSessionsResponse]
      ] = js.native
    def listSessions(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[ISession], IListSessionsRequest | Null, IListSessionsResponse]
      ] = js.native
    def listSessions(request: IListSessionsRequest): js.Promise[
        js.Tuple3[js.Array[ISession], IListSessionsRequest | Null, IListSessionsResponse]
      ] = js.native
    def listSessions(
      request: IListSessionsRequest,
      callback: PaginationCallback[IListSessionsRequest, js.UndefOr[IListSessionsResponse | Null], ISession]
    ): Unit = js.native
    def listSessions(request: IListSessionsRequest, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[ISession], IListSessionsRequest | Null, IListSessionsResponse]
      ] = js.native
    def listSessions(
      request: IListSessionsRequest,
      options: CallOptions,
      callback: PaginationCallback[IListSessionsRequest, js.UndefOr[IListSessionsResponse | Null], ISession]
    ): Unit = js.native
    
    /**
      * Equivalent to `listSessions`, but returns an iterable object.
      *
      * `for`-`await`-`of` syntax is used with the iterable to get response elements on-demand.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database in which to list sessions.
      * @param {number} request.pageSize
      *   Number of sessions to be returned in the response. If 0 or less, defaults
      *   to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.v1.ListSessionsResponse.next_page_token|next_page_token} from a previous
      *   {@link google.spanner.v1.ListSessionsResponse|ListSessionsResponse}.
      * @param {string} request.filter
      *   An expression for filtering the results of the request. Filter rules are
      *   case insensitive. The fields eligible for filtering are:
      *
      *     * `labels.key` where key is the name of a label
      *
      *   Some examples of using filters are:
      *
      *     * `labels.env:*` --> The session has the label "env".
      *     * `labels.env:dev` --> The session has the label "env" and the value of
      *                          the label contains the string "dev".
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Object}
      *   An iterable Object that allows [async iteration](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols).
      *   When you iterate the returned iterable, each element will be an object representing
      *   [Session]{@link google.spanner.v1.Session}. The API will be called under the hood as needed, once per the page,
      *   so you can stop the iteration when you don't need more results.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSessionsAsync(): AsyncIterable[ISession] = js.native
    def listSessionsAsync(request: Unit, options: CallOptions): AsyncIterable[ISession] = js.native
    def listSessionsAsync(request: IListSessionsRequest): AsyncIterable[ISession] = js.native
    def listSessionsAsync(request: IListSessionsRequest, options: CallOptions): AsyncIterable[ISession] = js.native
    
    /**
      * Equivalent to `method.name.toCamelCase()`, but returns a NodeJS Stream object.
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.database
      *   Required. The database in which to list sessions.
      * @param {number} request.pageSize
      *   Number of sessions to be returned in the response. If 0 or less, defaults
      *   to the server's maximum allowed page size.
      * @param {string} request.pageToken
      *   If non-empty, `page_token` should contain a
      *   {@link google.spanner.v1.ListSessionsResponse.next_page_token|next_page_token} from a previous
      *   {@link google.spanner.v1.ListSessionsResponse|ListSessionsResponse}.
      * @param {string} request.filter
      *   An expression for filtering the results of the request. Filter rules are
      *   case insensitive. The fields eligible for filtering are:
      *
      *     * `labels.key` where key is the name of a label
      *
      *   Some examples of using filters are:
      *
      *     * `labels.env:*` --> The session has the label "env".
      *     * `labels.env:dev` --> The session has the label "env" and the value of
      *                          the label contains the string "dev".
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits an object representing [Session]{@link google.spanner.v1.Session} on 'data' event.
      *   The client library will perform auto-pagination by default: it will call the API as many
      *   times as needed. Note that it can affect your quota.
      *   We recommend using `listSessionsAsync()`
      *   method described below for async iteration which you can stop as needed.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#auto-pagination)
      *   for more details and examples.
      */
    def listSessionsStream(): Transform = js.native
    def listSessionsStream(request: Unit, options: CallOptions): Transform = js.native
    def listSessionsStream(request: IListSessionsRequest): Transform = js.native
    def listSessionsStream(request: IListSessionsRequest, options: CallOptions): Transform = js.native
    
    /**
      * Parse the database from Database resource.
      *
      * @param {string} databaseName
      *   A fully-qualified path representing Database resource.
      * @returns {string} A string representing the database.
      */
    def matchDatabaseFromDatabaseName(databaseName: String): String | Double = js.native
    
    /**
      * Parse the database from Session resource.
      *
      * @param {string} sessionName
      *   A fully-qualified path representing Session resource.
      * @returns {string} A string representing the database.
      */
    def matchDatabaseFromSessionName(sessionName: String): String | Double = js.native
    
    /**
      * Parse the instance from Database resource.
      *
      * @param {string} databaseName
      *   A fully-qualified path representing Database resource.
      * @returns {string} A string representing the instance.
      */
    def matchInstanceFromDatabaseName(databaseName: String): String | Double = js.native
    
    /**
      * Parse the instance from Session resource.
      *
      * @param {string} sessionName
      *   A fully-qualified path representing Session resource.
      * @returns {string} A string representing the instance.
      */
    def matchInstanceFromSessionName(sessionName: String): String | Double = js.native
    
    /**
      * Parse the project from Database resource.
      *
      * @param {string} databaseName
      *   A fully-qualified path representing Database resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromDatabaseName(databaseName: String): String | Double = js.native
    
    /**
      * Parse the project from Session resource.
      *
      * @param {string} sessionName
      *   A fully-qualified path representing Session resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromSessionName(sessionName: String): String | Double = js.native
    
    /**
      * Parse the session from Session resource.
      *
      * @param {string} sessionName
      *   A fully-qualified path representing Session resource.
      * @returns {string} A string representing the session.
      */
    def matchSessionFromSessionName(sessionName: String): String | Double = js.native
    
    /**
      * Creates a set of partition tokens that can be used to execute a query
      * operation in parallel.  Each of the returned partition tokens can be used
      * by {@link google.spanner.v1.Spanner.ExecuteStreamingSql|ExecuteStreamingSql} to specify a subset
      * of the query result to read.  The same session and read-only transaction
      * must be used by the PartitionQueryRequest used to create the
      * partition tokens and the ExecuteSqlRequests that use the partition tokens.
      *
      * Partition tokens become invalid when the session used to create them
      * is deleted, is idle for too long, begins a new transaction, or becomes too
      * old.  When any of these happen, it is not possible to resume the query, and
      * the whole operation must be restarted from the beginning.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session used to create the partitions.
      * @param {google.spanner.v1.TransactionSelector} request.transaction
      *   Read only snapshot transactions are supported, read/write and single use
      *   transactions are not.
      * @param {string} request.sql
      *   Required. The query request to generate partitions for. The request will fail if
      *   the query is not root partitionable. The query plan of a root
      *   partitionable query has a single distributed union operator. A distributed
      *   union operator conceptually divides one or more tables into multiple
      *   splits, remotely evaluates a subquery independently on each split, and
      *   then unions all results.
      *
      *   This must not contain DML commands, such as INSERT, UPDATE, or
      *   DELETE. Use {@link google.spanner.v1.Spanner.ExecuteStreamingSql|ExecuteStreamingSql} with a
      *   PartitionedDml transaction for large, partition-friendly DML operations.
      * @param {google.protobuf.Struct} request.params
      *   Parameter names and values that bind to placeholders in the SQL string.
      *
      *   A parameter placeholder consists of the `@` character followed by the
      *   parameter name (for example, `@firstName`). Parameter names can contain
      *   letters, numbers, and underscores.
      *
      *   Parameters can appear anywhere that a literal value is expected.  The same
      *   parameter name can be used more than once, for example:
      *
      *   `"WHERE id > @msg_id AND id < @msg_id + 100"`
      *
      *   It is an error to execute a SQL statement with unbound parameters.
      * @param {number[]} request.paramTypes
      *   It is not always possible for Cloud Spanner to infer the right SQL type
      *   from a JSON value.  For example, values of type `BYTES` and values
      *   of type `STRING` both appear in {@link google.spanner.v1.PartitionQueryRequest.params|params} as JSON strings.
      *
      *   In these cases, `param_types` can be used to specify the exact
      *   SQL type for some or all of the SQL query parameters. See the
      *   definition of {@link google.spanner.v1.Type|Type} for more information
      *   about SQL types.
      * @param {google.spanner.v1.PartitionOptions} request.partitionOptions
      *   Additional options that affect how many partitions are created.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [PartitionResponse]{@link google.spanner.v1.PartitionResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def partitionQuery(): js.Promise[
        js.Tuple3[IPartitionResponse, js.UndefOr[IPartitionQueryRequest], js.UndefOr[js.Object]]
      ] = js.native
    def partitionQuery(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IPartitionResponse, js.UndefOr[IPartitionQueryRequest], js.UndefOr[js.Object]]
      ] = js.native
    def partitionQuery(request: IPartitionQueryRequest): js.Promise[
        js.Tuple3[IPartitionResponse, js.UndefOr[IPartitionQueryRequest], js.UndefOr[js.Object]]
      ] = js.native
    def partitionQuery(
      request: IPartitionQueryRequest,
      callback: Callback[
          IPartitionResponse, 
          js.UndefOr[IPartitionQueryRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def partitionQuery(request: IPartitionQueryRequest, options: CallOptions): js.Promise[
        js.Tuple3[IPartitionResponse, js.UndefOr[IPartitionQueryRequest], js.UndefOr[js.Object]]
      ] = js.native
    def partitionQuery(
      request: IPartitionQueryRequest,
      options: CallOptions,
      callback: Callback[
          IPartitionResponse, 
          js.UndefOr[IPartitionQueryRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    /**
      * Creates a set of partition tokens that can be used to execute a read
      * operation in parallel.  Each of the returned partition tokens can be used
      * by {@link google.spanner.v1.Spanner.StreamingRead|StreamingRead} to specify a subset of the read
      * result to read.  The same session and read-only transaction must be used by
      * the PartitionReadRequest used to create the partition tokens and the
      * ReadRequests that use the partition tokens.  There are no ordering
      * guarantees on rows returned among the returned partition tokens, or even
      * within each individual StreamingRead call issued with a partition_token.
      *
      * Partition tokens become invalid when the session used to create them
      * is deleted, is idle for too long, begins a new transaction, or becomes too
      * old.  When any of these happen, it is not possible to resume the read, and
      * the whole operation must be restarted from the beginning.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session used to create the partitions.
      * @param {google.spanner.v1.TransactionSelector} request.transaction
      *   Read only snapshot transactions are supported, read/write and single use
      *   transactions are not.
      * @param {string} request.table
      *   Required. The name of the table in the database to be read.
      * @param {string} request.index
      *   If non-empty, the name of an index on {@link google.spanner.v1.PartitionReadRequest.table|table}. This index is
      *   used instead of the table primary key when interpreting {@link google.spanner.v1.PartitionReadRequest.key_set|key_set}
      *   and sorting result rows. See {@link google.spanner.v1.PartitionReadRequest.key_set|key_set} for further information.
      * @param {string[]} request.columns
      *   The columns of {@link google.spanner.v1.PartitionReadRequest.table|table} to be returned for each row matching
      *   this request.
      * @param {google.spanner.v1.KeySet} request.keySet
      *   Required. `key_set` identifies the rows to be yielded. `key_set` names the
      *   primary keys of the rows in {@link google.spanner.v1.PartitionReadRequest.table|table} to be yielded, unless {@link google.spanner.v1.PartitionReadRequest.index|index}
      *   is present. If {@link google.spanner.v1.PartitionReadRequest.index|index} is present, then {@link google.spanner.v1.PartitionReadRequest.key_set|key_set} instead names
      *   index keys in {@link google.spanner.v1.PartitionReadRequest.index|index}.
      *
      *   It is not an error for the `key_set` to name rows that do not
      *   exist in the database. Read yields nothing for nonexistent rows.
      * @param {google.spanner.v1.PartitionOptions} request.partitionOptions
      *   Additional options that affect how many partitions are created.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [PartitionResponse]{@link google.spanner.v1.PartitionResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def partitionRead(): js.Promise[
        js.Tuple3[IPartitionResponse, js.UndefOr[IPartitionReadRequest], js.UndefOr[js.Object]]
      ] = js.native
    def partitionRead(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IPartitionResponse, js.UndefOr[IPartitionReadRequest], js.UndefOr[js.Object]]
      ] = js.native
    def partitionRead(request: IPartitionReadRequest): js.Promise[
        js.Tuple3[IPartitionResponse, js.UndefOr[IPartitionReadRequest], js.UndefOr[js.Object]]
      ] = js.native
    def partitionRead(
      request: IPartitionReadRequest,
      callback: Callback[
          IPartitionResponse, 
          js.UndefOr[IPartitionReadRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def partitionRead(request: IPartitionReadRequest, options: CallOptions): js.Promise[
        js.Tuple3[IPartitionResponse, js.UndefOr[IPartitionReadRequest], js.UndefOr[js.Object]]
      ] = js.native
    def partitionRead(
      request: IPartitionReadRequest,
      options: CallOptions,
      callback: Callback[
          IPartitionResponse, 
          js.UndefOr[IPartitionReadRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    var pathTemplates: StringDictionary[PathTemplate] = js.native
    
    /**
      * Reads rows from the database using key lookups and scans, as a
      * simple key/value style alternative to
      * {@link google.spanner.v1.Spanner.ExecuteSql|ExecuteSql}.  This method cannot be used to
      * return a result set larger than 10 MiB; if the read matches more
      * data than that, the read fails with a `FAILED_PRECONDITION`
      * error.
      *
      * Reads inside read-write transactions might return `ABORTED`. If
      * this occurs, the application should restart the transaction from
      * the beginning. See {@link google.spanner.v1.Transaction|Transaction} for more details.
      *
      * Larger result sets can be yielded in streaming fashion by calling
      * {@link google.spanner.v1.Spanner.StreamingRead|StreamingRead} instead.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session in which the read should be performed.
      * @param {google.spanner.v1.TransactionSelector} request.transaction
      *   The transaction to use. If none is provided, the default is a
      *   temporary read-only transaction with strong concurrency.
      * @param {string} request.table
      *   Required. The name of the table in the database to be read.
      * @param {string} request.index
      *   If non-empty, the name of an index on {@link google.spanner.v1.ReadRequest.table|table}. This index is
      *   used instead of the table primary key when interpreting {@link google.spanner.v1.ReadRequest.key_set|key_set}
      *   and sorting result rows. See {@link google.spanner.v1.ReadRequest.key_set|key_set} for further information.
      * @param {string[]} request.columns
      *   Required. The columns of {@link google.spanner.v1.ReadRequest.table|table} to be returned for each row matching
      *   this request.
      * @param {google.spanner.v1.KeySet} request.keySet
      *   Required. `key_set` identifies the rows to be yielded. `key_set` names the
      *   primary keys of the rows in {@link google.spanner.v1.ReadRequest.table|table} to be yielded, unless {@link google.spanner.v1.ReadRequest.index|index}
      *   is present. If {@link google.spanner.v1.ReadRequest.index|index} is present, then {@link google.spanner.v1.ReadRequest.key_set|key_set} instead names
      *   index keys in {@link google.spanner.v1.ReadRequest.index|index}.
      *
      *   If the {@link google.spanner.v1.ReadRequest.partition_token|partition_token} field is empty, rows are yielded
      *   in table primary key order (if {@link google.spanner.v1.ReadRequest.index|index} is empty) or index key order
      *   (if {@link google.spanner.v1.ReadRequest.index|index} is non-empty).  If the {@link google.spanner.v1.ReadRequest.partition_token|partition_token} field is not
      *   empty, rows will be yielded in an unspecified order.
      *
      *   It is not an error for the `key_set` to name rows that do not
      *   exist in the database. Read yields nothing for nonexistent rows.
      * @param {number} request.limit
      *   If greater than zero, only the first `limit` rows are yielded. If `limit`
      *   is zero, the default is no limit. A limit cannot be specified if
      *   `partition_token` is set.
      * @param {Buffer} request.resumeToken
      *   If this request is resuming a previously interrupted read,
      *   `resume_token` should be copied from the last
      *   {@link google.spanner.v1.PartialResultSet|PartialResultSet} yielded before the interruption. Doing this
      *   enables the new read to resume where the last read left off. The
      *   rest of the request parameters must exactly match the request
      *   that yielded this token.
      * @param {Buffer} request.partitionToken
      *   If present, results will be restricted to the specified partition
      *   previously created using PartitionRead().    There must be an exact
      *   match for the values of fields common to this message and the
      *   PartitionReadRequest message used to create this partition_token.
      * @param {google.spanner.v1.RequestOptions} request.requestOptions
      *   Common options for this request.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [ResultSet]{@link google.spanner.v1.ResultSet}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      */
    def read(): js.Promise[js.Tuple3[IResultSet, js.UndefOr[IReadRequest], js.UndefOr[js.Object]]] = js.native
    def read(request: Unit, options: CallOptions): js.Promise[js.Tuple3[IResultSet, js.UndefOr[IReadRequest], js.UndefOr[js.Object]]] = js.native
    def read(request: IReadRequest): js.Promise[js.Tuple3[IResultSet, js.UndefOr[IReadRequest], js.UndefOr[js.Object]]] = js.native
    def read(
      request: IReadRequest,
      callback: Callback[IResultSet, js.UndefOr[IReadRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def read(request: IReadRequest, options: CallOptions): js.Promise[js.Tuple3[IResultSet, js.UndefOr[IReadRequest], js.UndefOr[js.Object]]] = js.native
    def read(
      request: IReadRequest,
      options: CallOptions,
      callback: Callback[IResultSet, js.UndefOr[IReadRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    
    /**
      * Rolls back a transaction, releasing any locks it holds. It is a good
      * idea to call this for any transaction that includes one or more
      * {@link google.spanner.v1.Spanner.Read|Read} or {@link google.spanner.v1.Spanner.ExecuteSql|ExecuteSql} requests and
      * ultimately decides not to commit.
      *
      * `Rollback` returns `OK` if it successfully aborts the transaction, the
      * transaction was already aborted, or the transaction is not
      * found. `Rollback` never returns `ABORTED`.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session in which the transaction to roll back is running.
      * @param {Buffer} request.transactionId
      *   Required. The transaction to roll back.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing [Empty]{@link google.protobuf.Empty}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
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
      * Return a fully-qualified session resource name string.
      *
      * @param {string} project
      * @param {string} instance
      * @param {string} database
      * @param {string} session
      * @returns {string} Resource name string.
      */
    def sessionPath(project: String, instance: String, database: String, session: String): String = js.native
    
    var spannerStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    /**
      * Like {@link google.spanner.v1.Spanner.Read|Read}, except returns the result set as a
      * stream. Unlike {@link google.spanner.v1.Spanner.Read|Read}, there is no limit on the
      * size of the returned result set. However, no individual row in
      * the result set can exceed 100 MiB, and no column value can exceed
      * 10 MiB.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.session
      *   Required. The session in which the read should be performed.
      * @param {google.spanner.v1.TransactionSelector} request.transaction
      *   The transaction to use. If none is provided, the default is a
      *   temporary read-only transaction with strong concurrency.
      * @param {string} request.table
      *   Required. The name of the table in the database to be read.
      * @param {string} request.index
      *   If non-empty, the name of an index on {@link google.spanner.v1.ReadRequest.table|table}. This index is
      *   used instead of the table primary key when interpreting {@link google.spanner.v1.ReadRequest.key_set|key_set}
      *   and sorting result rows. See {@link google.spanner.v1.ReadRequest.key_set|key_set} for further information.
      * @param {string[]} request.columns
      *   Required. The columns of {@link google.spanner.v1.ReadRequest.table|table} to be returned for each row matching
      *   this request.
      * @param {google.spanner.v1.KeySet} request.keySet
      *   Required. `key_set` identifies the rows to be yielded. `key_set` names the
      *   primary keys of the rows in {@link google.spanner.v1.ReadRequest.table|table} to be yielded, unless {@link google.spanner.v1.ReadRequest.index|index}
      *   is present. If {@link google.spanner.v1.ReadRequest.index|index} is present, then {@link google.spanner.v1.ReadRequest.key_set|key_set} instead names
      *   index keys in {@link google.spanner.v1.ReadRequest.index|index}.
      *
      *   If the {@link google.spanner.v1.ReadRequest.partition_token|partition_token} field is empty, rows are yielded
      *   in table primary key order (if {@link google.spanner.v1.ReadRequest.index|index} is empty) or index key order
      *   (if {@link google.spanner.v1.ReadRequest.index|index} is non-empty).  If the {@link google.spanner.v1.ReadRequest.partition_token|partition_token} field is not
      *   empty, rows will be yielded in an unspecified order.
      *
      *   It is not an error for the `key_set` to name rows that do not
      *   exist in the database. Read yields nothing for nonexistent rows.
      * @param {number} request.limit
      *   If greater than zero, only the first `limit` rows are yielded. If `limit`
      *   is zero, the default is no limit. A limit cannot be specified if
      *   `partition_token` is set.
      * @param {Buffer} request.resumeToken
      *   If this request is resuming a previously interrupted read,
      *   `resume_token` should be copied from the last
      *   {@link google.spanner.v1.PartialResultSet|PartialResultSet} yielded before the interruption. Doing this
      *   enables the new read to resume where the last read left off. The
      *   rest of the request parameters must exactly match the request
      *   that yielded this token.
      * @param {Buffer} request.partitionToken
      *   If present, results will be restricted to the specified partition
      *   previously created using PartitionRead().    There must be an exact
      *   match for the values of fields common to this message and the
      *   PartitionReadRequest message used to create this partition_token.
      * @param {google.spanner.v1.RequestOptions} request.requestOptions
      *   Common options for this request.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Stream}
      *   An object stream which emits [PartialResultSet]{@link google.spanner.v1.PartialResultSet} on 'data' event.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#server-streaming)
      *   for more details and examples.
      */
    def streamingRead(): CancellableStream = js.native
    def streamingRead(request: Unit, options: CallOptions): CancellableStream = js.native
    def streamingRead(request: IReadRequest): CancellableStream = js.native
    def streamingRead(request: IReadRequest, options: CallOptions): CancellableStream = js.native
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
