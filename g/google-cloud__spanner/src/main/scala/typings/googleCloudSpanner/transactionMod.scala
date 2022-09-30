package typings.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPreciseDate.mod.PreciseDate
import typings.googleCloudSpanner.anon.OmitIRequestOptionstransa
import typings.googleCloudSpanner.anon.ParamTypes
import typings.googleCloudSpanner.anon.PickIRequestOptionspriori
import typings.googleCloudSpanner.anon.PickIRequestOptionstransa
import typings.googleCloudSpanner.codecMod.JSONOptions
import typings.googleCloudSpanner.codecMod.Json
import typings.googleCloudSpanner.codecMod.Type
import typings.googleCloudSpanner.codecMod.Value
import typings.googleCloudSpanner.commonMod.NormalCallback
import typings.googleCloudSpanner.partialResultStreamMod.PartialResultStream_
import typings.googleCloudSpanner.partialResultStreamMod.ResumeToken
import typings.googleCloudSpanner.partialResultStreamMod.Row
import typings.googleCloudSpanner.protosMod.google.protobuf.IDuration
import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteBatchDmlResponse
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.IQueryOptions
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryMode
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ICommitRequest
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ICommitResponse
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IKeySet
import typings.googleCloudSpanner.protosMod.google.spanner.v1.IRequestOptions
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ITransaction
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ITransactionOptions
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ResultSetMetadata
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ResultSetStats
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.RollbackCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.TransactionOptions.IReadOnly
import typings.googleCloudSpanner.protosMod.google.spanner.v1.TransactionOptions.ReadWrite
import typings.googleCloudSpanner.sessionMod.Session
import typings.googleCloudSpanner.tableMod.Key
import typings.googleGax.gaxMod.CallOptions
import typings.grpcGrpcJs.callMod.ServiceError
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionMod {
  
  @JSImport("@google-cloud/spanner/build/src/transaction", "Dml")
  @js.native
  open class Dml protected () extends Snapshot {
    /**
      * The transaction ID.
      *
      * @name Snapshot#id
      * @type {?(string|Buffer)}
      */
    /**
      * Whether or not the transaction has ended. If true, make no further
      * requests, and discard the transaction.
      *
      * @name Snapshot#ended
      * @type {boolean}
      */
    /**
      * The raw transaction response object. It is populated after
      * {@link Snapshot#begin} is called.
      *
      * @name Snapshot#metadata
      * @type {?TransactionResponse}
      */
    /**
      * **Snapshot only**
      * The timestamp at which all reads are performed.
      *
      * @name Snapshot#readTimestamp
      * @type {?external:PreciseDate}
      */
    /**
      * **Snapshot only**
      * The protobuf version of {@link Snapshot#readTimestamp}. This is useful if
      * you require microsecond precision.
      *
      * @name Snapshot#readTimestampProto
      * @type {?google.protobuf.Timestamp}
      */
    /**
      * @constructor
      *
      * @param {Session} session The parent Session object.
      * @param {TimestampBounds} [options] Snapshot timestamp bounds.
      * @param {QueryOptions} [queryOptions] Default query options to use when none
      *        are specified for a query.
      */
    def this(session: Session) = this()
    def this(session: Session, options: TimestampBounds) = this()
    def this(session: Session, options: Unit, queryOptions: IQueryOptions) = this()
    def this(session: Session, options: TimestampBounds, queryOptions: IQueryOptions) = this()
    
    /**
      * @typedef {array} RunUpdateResponse
      * @property {number} 0 Affected row count.
      */
    /**
      * @callback RunUpdateCallback
      * @param {?Error} err Request error, if any.
      * @param {number} rowCount Affected row count.
      */
    /**
      * Execute a DML statement and get the affected row count.
      *
      * @private
      *
      * @see {@link Transaction#run}
      *
      * @param {string|object} query A DML statement or
      *     [`ExecuteSqlRequest`](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ExecuteSqlRequest)
      *     object.
      * @param {object} [query.params] A map of parameter name to values.
      * @param {object} [query.types] A map of parameter types.
      * @param {RunUpdateCallback} [callback] Callback function.
      * @returns {Promise<RunUpdateResponse>}
      */
    def runUpdate(query: String): js.Promise[RunUpdateResponse] = js.native
    def runUpdate(query: String, callback: RunUpdateCallback): Unit = js.native
    def runUpdate(query: ExecuteSqlRequest): js.Promise[RunUpdateResponse] = js.native
    def runUpdate(query: ExecuteSqlRequest, callback: RunUpdateCallback): Unit = js.native
  }
  
  @JSImport("@google-cloud/spanner/build/src/transaction", "PartitionedDml")
  @js.native
  open class PartitionedDml protected () extends Dml {
    def this(session: Session) = this()
    def this(
      session: Session,
      options: typings.googleCloudSpanner.protosMod.google.spanner.v1.TransactionOptions.PartitionedDml
    ) = this()
  }
  
  @JSImport("@google-cloud/spanner/build/src/transaction", "Snapshot")
  @js.native
  open class Snapshot protected () extends EventEmitter {
    /**
      * The transaction ID.
      *
      * @name Snapshot#id
      * @type {?(string|Buffer)}
      */
    /**
      * Whether or not the transaction has ended. If true, make no further
      * requests, and discard the transaction.
      *
      * @name Snapshot#ended
      * @type {boolean}
      */
    /**
      * The raw transaction response object. It is populated after
      * {@link Snapshot#begin} is called.
      *
      * @name Snapshot#metadata
      * @type {?TransactionResponse}
      */
    /**
      * **Snapshot only**
      * The timestamp at which all reads are performed.
      *
      * @name Snapshot#readTimestamp
      * @type {?external:PreciseDate}
      */
    /**
      * **Snapshot only**
      * The protobuf version of {@link Snapshot#readTimestamp}. This is useful if
      * you require microsecond precision.
      *
      * @name Snapshot#readTimestampProto
      * @type {?google.protobuf.Timestamp}
      */
    /**
      * @constructor
      *
      * @param {Session} session The parent Session object.
      * @param {TimestampBounds} [options] Snapshot timestamp bounds.
      * @param {QueryOptions} [queryOptions] Default query options to use when none
      *        are specified for a query.
      */
    def this(session: Session) = this()
    def this(session: Session, options: TimestampBounds) = this()
    def this(session: Session, options: Unit, queryOptions: IQueryOptions) = this()
    def this(session: Session, options: TimestampBounds, queryOptions: IQueryOptions) = this()
    
    /* protected */ var _options: ITransactionOptions = js.native
    
    /* protected */ var _seqno: Double = js.native
    
    /**
      * @typedef {object} TransactionResponse
      * @property {string|Buffer} id The transaction ID.
      * @property {?google.protobuf.Timestamp} readTimestamp For snapshot read-only
      *     transactions, the read timestamp chosen for the transaction.
      */
    /**
      * @typedef {array} TransactionBeginResponse
      * @property {TransactionResponse} 0 The raw transaction object.
      */
    /**
      * @callback TransactionBeginCallback
      * @param {?Error} err Request error, if any.
      * @param {TransactionResponse} apiResponse The raw transaction object.
      */
    /**
      * Begin a new transaction. Typically, you need not call this unless
      * manually creating transactions via {@link Session} objects.
      *
      * @see [BeginTransaction API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.BeginTransaction)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {TransactionBeginCallback} [callback] Callback function.
      * @returns {Promise<TransactionBeginResponse>}
      *
      * @example
      * ```
      * transaction.begin(function(err) {
      *   if (!err) {
      *     // transaction began successfully.
      *   }
      * });
      *
      * ```
      * @example If the callback is omitted, the function returns a Promise
      * ```
      * transaction.begin()
      *   .then(function(data) {
      *     const apiResponse = data[0];
      *   });
      * ```
      */
    def begin(): js.Promise[BeginResponse] = js.native
    def begin(callback: BeginTransactionCallback): Unit = js.native
    def begin(gaxOptions: CallOptions): js.Promise[BeginResponse] = js.native
    def begin(gaxOptions: CallOptions, callback: BeginTransactionCallback): Unit = js.native
    
    /**
      *
      * @private
      */
    def configureTagOptions(): IRequestOptions | Null = js.native
    def configureTagOptions(singleUse: Boolean): IRequestOptions | Null = js.native
    def configureTagOptions(singleUse: Boolean, transactionTag: String): IRequestOptions | Null = js.native
    def configureTagOptions(singleUse: Boolean, transactionTag: String, requestOptions: js.Object): IRequestOptions | Null = js.native
    def configureTagOptions(singleUse: Boolean, transactionTag: Unit, requestOptions: js.Object): IRequestOptions | Null = js.native
    def configureTagOptions(singleUse: Unit, transactionTag: String): IRequestOptions | Null = js.native
    def configureTagOptions(singleUse: Unit, transactionTag: String, requestOptions: js.Object): IRequestOptions | Null = js.native
    def configureTagOptions(singleUse: Unit, transactionTag: Unit, requestOptions: js.Object): IRequestOptions | Null = js.native
    
    /**
      * A KeyRange represents a range of rows in a table or index.
      *
      * A range has a start key and an end key. These keys can be open or closed,
      * indicating if the range includes rows with that key.
      *
      * Keys are represented by an array of strings where the nth value in the list
      * corresponds to the nth component of the table or index primary key.
      *
      * @typedef {object} KeyRange
      * @property {string[]} [startClosed] If the start is closed, then the range
      *     includes all rows whose first key columns exactly match.
      * @property {string[]} [startOpen] If the start is open, then the range
      *     excludes rows whose first key columns exactly match.
      * @property {string[]} [endClosed] If the end is closed, then the range
      *     includes all rows whose first key columns exactly match.
      * @property {string[]} [endOpen] If the end is open, then the range excludes
      *     rows whose first key columns exactly match.
      */
    /**
      * Read request options. This includes all standard ReadRequest options as
      * well as several convenience properties.
      *
      * @see [StreamingRead API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.StreamingRead)
      * @see [ReadRequest API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ReadRequest)
      *
      * @typedef {object} ReadRequest
      * @property {string} table The name of the table in the database to be read.
      * @property {string[]} columns The columns of the table to be returned for each
      *     row matching this query.
      * @property {string[]|string[][]} keys The primary or index keys of the rows in this table to be
      *     yielded. If using a composite key, provide an array within this array.
      *     See the example below.
      * @property {KeyRange[]} [ranges] An alternative to the keys property; this can
      *     be used to define a range of keys to be yielded.
      * @property {string} [index] The name of an index on the table if a
      *     different index than the primary key should be used to determine which rows to return.
      * @property {boolean} [json=false] Receive the rows as serialized objects. This
      *     is the equivalent of calling `toJSON()` on each row.
      * @property {JSONOptions} [jsonOptions] Configuration options for the serialized
      *     objects.
      * @property {object} [keySet] Defines a collection of keys and/or key ranges to
      *     read.
      * @property {number} [limit] The number of rows to yield.
      * @property {Buffer} [partitionToken]
      *     If present, results will be restricted to the specified partition
      *     previously created using PartitionRead(). There must be an exact
      *     match for the values of fields common to this message and the
      *     PartitionReadRequest message used to create this partition_token.
      * @property {google.spanner.v1.RequestOptions} [requestOptions]
      *     Common options for this request.
      * @property {object} [gaxOptions]
      *     Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * Create a readable object stream to receive rows from the database using key
      * lookups and scans.
      *
      * Wrapper around {@link v1.SpannerClient#streamingRead}.
      *
      * @see {@link v1.SpannerClient#streamingRead}
      * @see [StreamingRead API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.StreamingRead)
      * @see [ReadRequest API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ReadRequest)
      *
      * @fires PartialResultStream#response
      * @fires PartialResultStream#stats
      *
      * @param {string} table The table to read from.
      * @param {ReadRequest} query Configuration object. See official
      *     [`ReadRequest`](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ReadRequest).
      *     API documentation.
      * @returns {ReadableStream} A readable stream that emits rows.
      *
      * @example
      * ```
      * transaction.createReadStream('Singers', {
      *     keys: ['1'],
      *     columns: ['SingerId', 'name']
      *   })
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
      *   })
      *   .on('end', function() {
      *     // All results retrieved.
      *   });
      *
      * ```
      * @example Provide an array for `query.keys` to read with a
      * composite key.
      * ```
      * const query = {
      *   keys: [
      *     [
      *       'Id1',
      *       'Name1'
      *     ],
      *     [
      *       'Id2',
      *       'Name2'
      *     ]
      *   ],
      *   // ...
      * };
      * ```
      *
      * @example Rows are returned as an array of object arrays. Each
      * object has a `name` and `value` property. To get a serialized object, call
      * `toJSON()`.
      * ```
      * transaction.createReadStream('Singers', {
      *     keys: ['1'],
      *     columns: ['SingerId', 'name']
      *   })
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
      * ```
      *
      * @example Alternatively, set `query.json` to `true`, and this step
      * will perform automatically.
      * ```
      * transaction.createReadStream('Singers', {
      *     keys: ['1'],
      *     columns: ['SingerId', 'name'],
      *     json: true,
      *   })
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
      * ```
      *
      * @example If you anticipate many results, you can end a stream
      * early to prevent unnecessary processing and API requests.
      * ```
      * transaction.createReadStream('Singers', {
      *     keys: ['1'],
      *     columns: ['SingerId', 'name']
      *   })
      *   .on('data', function(row) {
      *     this.end();
      *   });
      * ```
      */
    def createReadStream(table: String): PartialResultStream_ = js.native
    def createReadStream(table: String, request: ReadRequest): PartialResultStream_ = js.native
    
    /**
      * Let the client know you're done with a particular transaction. This should
      * mainly be called for {@link Snapshot} objects, however in certain cases
      * you may want to call them for {@link Transaction} objects as well.
      *
      * @example Calling `end` on a read only snapshot
      * ```
      * database.getSnapshot((err, transaction) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   transaction.run('SELECT * FROM Singers', (err, rows) => {
      *     if (err) {
      *       // Error handling omitted.
      *     }
      *
      *     // End the snapshot.
      *     transaction.end();
      *   });
      * });
      * ```
      *
      * @example Calling `end` on a read/write transaction
      * ```
      * database.runTransaction((err, transaction) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   const query = 'UPDATE Account SET Balance = 1000 WHERE Key = 1';
      *
      *   transaction.runUpdate(query, err => {
      *     if (err) {
      *       // In the event of an error, there would be nothing to rollback,
      * so
      *       // instead of continuing, discard the
      * transaction. transaction.end(); return;
      *     }
      *
      *     transaction.commit(err => {});
      *   });
      * });
      * ```
      */
    def end(): Unit = js.native
    
    var ended: Boolean = js.native
    
    var id: js.UndefOr[js.typedarray.Uint8Array | String] = js.native
    
    var metadata: js.UndefOr[ITransaction] = js.native
    
    var queryOptions: js.UndefOr[IQueryOptions] = js.native
    
    def read(table: String, callback: ReadCallback): Unit = js.native
    /**
      * @typedef {array} ReadResponse
      * @property {array[]} 0 Rows are returned as an array of object arrays. Each
      *     object has a `name` and `value` property. To get a serialized object,
      *     call `toJSON()`. Optionally, provide an options object to `toJSON()`
      *     specifying `wrapNumbers: true` to protect large integer values outside
      * of the range of JavaScript Number. If set, FLOAT64 values are returned
      *     as {@link Spanner.Float} objects and INT64 values as {@link
      * Spanner.Int}.
      */
    /**
      * @callback ReadCallback
      * @param {?Error} err Request error, if any.
      * @param {array[]} rows Rows are returned as an array of object arrays. Each
      *     object has a `name` and `value` property. To get a serialized object,
      *     call `toJSON()`. Optionally, provide an options object to `toJSON()`
      *     specifying `wrapNumbers: true` to protect large integer values outside
      * of the range of JavaScript Number. If set, FLOAT64 values are returned
      *     as {@link Spanner.Float} objects and INT64 values as {@link
      * Spanner.Int}.
      */
    /**
      * Performs a read request against the specified Table.
      *
      * Wrapper around {@link v1.SpannerClient#read}.
      *
      * @see {@link v1.SpannerClient#read}
      *
      * @param {string} table The table to read from.
      * @param {ReadRequest} query Configuration object. See official
      *     [`ReadRequest`](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ReadRequest).
      *     API documentation.
      * @param {ReadCallback} [callback] Callback function.
      * @returns {Promise<ReadResponse>}
      *
      * @example
      * ```
      * const query = {
      *   keys: ['1'],
      *   columns: ['SingerId', 'name']
      * };
      *
      * transaction.read('Singers', query, function(err, rows) {
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
      * ```
      * @example Provide an array for `query.keys` to read with a
      * composite key.
      * ```
      * const query = {
      *   keys: [
      *     [
      *       'Id1',
      *       'Name1'
      *     ],
      *     [
      *       'Id2',
      *       'Name2'
      *     ]
      *   ],
      *   // ...
      * };
      * ```
      *
      * @example Rows are returned as an array of object arrays. Each
      * object has a `name` and `value` property. To get a serialized object, call
      * `toJSON()`.
      * ```
      * transaction.read('Singers', query, function(err, rows) {
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
      * ```
      *
      * @example Alternatively, set `query.json` to `true`, and this step
      * will perform automatically.
      * ```
      * query.json = true;
      *
      * transaction.read('Singers', query, function(err, rows) {
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
      * ```
      */
    def read(table: String, request: ReadRequest): js.Promise[ReadResponse] = js.native
    def read(table: String, request: ReadRequest, callback: ReadCallback): Unit = js.native
    
    var readTimestamp: js.UndefOr[PreciseDate] = js.native
    
    var readTimestampProto: js.UndefOr[ITimestamp] = js.native
    
    def request(config: js.Object, callback: js.Function): Unit = js.native
    
    var requestOptions: js.UndefOr[PickIRequestOptionstransa] = js.native
    
    def requestStream(config: js.Object): Readable = js.native
    
    var resourceHeader_ : StringDictionary[String] = js.native
    
    /**
      * Execute a SQL statement on this database inside of a transaction.
      *
      * **Performance Considerations:**
      *
      * This method wraps the streaming method,
      * {@link Snapshot#run} for your convenience. All rows are stored in memory
      * before releasing to your callback. If you intend to receive a lot of
      * results from your query, consider using the streaming method,
      * so you can free each result from memory after consuming it.
      *
      * Wrapper around {@link v1.SpannerClient#executeStreamingSql}.
      *
      * @see {@link v1.SpannerClient#executeStreamingSql}
      * @see [ExecuteStreamingSql API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.ExecuteStreamingSql)
      * @see [ExecuteSqlRequest API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ExecuteSqlRequest)
      *
      * @param {string|ExecuteSqlRequest} query A SQL query or
      *     {@link ExecuteSqlRequest} object.
      * @param {RunCallback} [callback] Callback function.
      * @returns {Promise<RunResponse>}
      *
      * @example
      * ```
      * transaction.run(query, function(err, rows) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // rows = [
      *   //   {
      *   //     SingerId: '1',
      *   //     Name: 'Eddie Wilson'
      *   //   }
      *   // ]
      * });
      *
      * ```
      * @example The SQL query string can contain parameter placeholders.
      * A parameter placeholder consists of '@' followed by the parameter name.
      * ```
      * const query = {
      *   sql: 'SELECT * FROM Singers WHERE name = @name',
      *   params: {
      *     name: 'Eddie Wilson'
      *   }
      * };
      *
      * transaction.run(query, function(err, rows) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      * ```
      *
      * @example If you need to enforce a specific param type, a types map
      * can be provided. This is typically useful if your param value can be null.
      * ```
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
      * transaction.run(query, function(err, rows) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      * ```
      */
    def run(query: String): js.Promise[RunResponse] = js.native
    def run(query: String, callback: RunCallback): Unit = js.native
    def run(query: ExecuteSqlRequest): js.Promise[RunResponse] = js.native
    def run(query: ExecuteSqlRequest, callback: RunCallback): Unit = js.native
    
    /**
      * ExecuteSql request options. This includes all standard ExecuteSqlRequest
      * options as well as several convenience properties.
      *
      * @see [Query Syntax](https://cloud.google.com/spanner/docs/query-syntax)
      * @see [ExecuteSql API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.ExecuteSql)
      *
      * @typedef {object} ExecuteSqlRequest
      * @property {string} resumeToken The token used to resume getting results.
      * @property {google.spanner.v1.ExecuteSqlRequest.QueryMode} queryMode Query plan and
      *     execution statistics for the SQL statement that
      *     produced this result set.
      * @property {string} partitionToken The partition token.
      * @property {number} seqno The Sequence number.
      * @property {string} sql The SQL string.
      * @property {google.spanner.v1.ExecuteSqlRequest.IQueryOptions} [queryOptions]
      *     Default query options to use with the database. These options will be
      *     overridden by any query options set in environment variables or that
      *     are specified on a per-query basis.
      * @property {google.spanner.v1.IRequestOptions} requestOptions The request options to include
      *     with the commit request.
      * @property {Object.<string, *>} [params] A map of parameter names to values.
      * @property {Object.<string, (string|ParamType)>} [types] A map of parameter
      *     names to types. If omitted the client will attempt to guess for all
      *     non-null values.
      * @property {boolean} [json=false] Receive the rows as serialized objects. This
      *     is the equivalent of calling `toJSON()` on each row.
      * @property {JSONOptions} [jsonOptions] Configuration options for the
      *     serialized objects.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      *  @property {number} [maxResumeRetries] The maximum number of times that the
      *     stream will retry to push data downstream, when the downstream indicates
      *     that it is not ready for any more data. Increase this value if you
      *     experience 'Stream is still not ready to receive data' errors as a
      *     result of a slow writer in your receiving stream.
      */
    /**
      * Create a readable object stream to receive resulting rows from a SQL
      * statement.
      *
      * Wrapper around {@link v1.SpannerClient#executeStreamingSql}.
      *
      * @see {@link v1.SpannerClient#executeStreamingSql}
      * @see [ExecuteStreamingSql API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.ExecuteStreamingSql)
      * @see [ExecuteSqlRequest API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ExecuteSqlRequest)
      *
      * @fires PartialResultStream#response
      * @fires PartialResultStream#stats
      *
      * @param {string|ExecuteSqlRequest} query A SQL query or
      *     {@link ExecuteSqlRequest} object.
      * @returns {ReadableStream}
      *
      * @example
      * ```
      * const query = 'SELECT * FROM Singers';
      *
      * transaction.runStream(query)
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
      * ```
      * @example The SQL query string can contain parameter placeholders.
      * A parameter placeholder consists of '@' followed by the parameter name.
      * ```
      * const query = {
      *   sql: 'SELECT * FROM Singers WHERE name = @name',
      *   params: {
      *     name: 'Eddie Wilson'
      *   }
      * };
      *
      * transaction.runStream(query)
      *   .on('error', function(err) {})
      *   .on('data', function(row) {})
      *   .on('end', function() {});
      * ```
      *
      * @example If you anticipate many results, you can end a stream
      * early to prevent unnecessary processing and API requests.
      * ```
      * transaction.runStream(query)
      *   .on('data', function(row) {
      *     this.end();
      *   });
      * ```
      */
    def runStream(query: String): PartialResultStream_ = js.native
    def runStream(query: ExecuteSqlRequest): PartialResultStream_ = js.native
    
    var session: Session = js.native
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@google-cloud/spanner/build/src/transaction", "Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Transforms convenience options `keys` and `ranges` into a KeySet object.
      *
      * @private
      * @static
      *
      * @param {ReadRequest} request The read request.
      * @returns {object}
      */
    inline def encodeKeySet(request: ReadRequest): IKeySet = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeKeySet")(request.asInstanceOf[js.Any]).asInstanceOf[IKeySet]
    
    /**
      * Encodes convenience options `param` and `types` into the proto formatted.
      *
      * @private
      * @static
      *
      * @param {ExecuteSqlRequest} request The SQL request.
      * @returns {object}
      */
    inline def encodeParams(request: ExecuteSqlRequest): ParamTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeParams")(request.asInstanceOf[js.Any]).asInstanceOf[ParamTypes]
    
    /**
      * Formats timestamp options into proto format.
      *
      * @private
      * @static
      *
      * @param {TimestampBounds} options The user supplied options.
      * @returns {object}
      */
    inline def encodeTimestampBounds(options: TimestampBounds): IReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeTimestampBounds")(options.asInstanceOf[js.Any]).asInstanceOf[IReadOnly]
  }
  
  @JSImport("@google-cloud/spanner/build/src/transaction", "Transaction")
  @js.native
  open class Transaction protected () extends Dml {
    /**
      * Timestamp at which the transaction was committed. Will be populated once
      * {@link Transaction#commit} is called.
      *
      * @name Transaction#commitTimestamp
      * @type {?external:PreciseDate}
      */
    /**
      * The protobuf version of {@link Transaction#commitTimestamp}. This is useful
      * if you require microsecond precision.
      *
      * @name Transaction#commitTimestampProto
      * @type {?google.protobuf.Timestamp}
      */
    /**
      * Execute a DML statement and get the affected row count.
      *
      * @name Transaction#runUpdate
      *
      * @see {@link Transaction#run}
      *
      * @param {string|object} query A DML statement or
      *     [`ExecuteSqlRequest`](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ExecuteSqlRequest)
      *     object.
      * @param {object} [query.params] A map of parameter name to values.
      * @param {object} [query.types] A map of parameter types.
      * @param {RunUpdateCallback} [callback] Callback function.
      * @returns {Promise<RunUpdateResponse>}
      *
      * @example
      * ```
      * const query = 'UPDATE Account SET Balance = 1000 WHERE Key = 1';
      *
      * transaction.runUpdate(query, (err, rowCount) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      * ```
      */
    def this(session: Session) = this()
    def this(session: Session, options: ReadWrite) = this()
    def this(session: Session, options: Unit, queryOptions: IQueryOptions) = this()
    def this(session: Session, options: ReadWrite, queryOptions: IQueryOptions) = this()
    def this(session: Session, options: Unit, queryOptions: Unit, requestOptions: PickIRequestOptionstransa) = this()
    def this(
      session: Session,
      options: Unit,
      queryOptions: IQueryOptions,
      requestOptions: PickIRequestOptionstransa
    ) = this()
    def this(
      session: Session,
      options: ReadWrite,
      queryOptions: Unit,
      requestOptions: PickIRequestOptionstransa
    ) = this()
    def this(
      session: Session,
      options: ReadWrite,
      queryOptions: IQueryOptions,
      requestOptions: PickIRequestOptionstransa
    ) = this()
    
    /**
      * Formats the mutations.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @private
      *
      * @param {string} method CRUD method (insert, update, etc.).
      * @param {string} table Table to perform mutations in.
      * @param {object} rows Hash of key value pairs.
      */
    /* private */ var _mutate: Any = js.native
    
    /* private */ var _queuedMutations: Any = js.native
    
    /**
      * @typedef {error} BatchUpdateError
      * @property {number} code gRPC status code.
      * @property {?object} metadata gRPC metadata.
      * @property {number[]} rowCounts The affected row counts for any DML
      *     statements that were executed successfully before this error occurred.
      */
    /**
      * @typedef {object} BatchUpdateOptions
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @property {google.spanner.v1.IRequestOptions} [requestOptions] The request options to include
      *     with the commit request.
      */
    /**
      * @typedef {array} BatchUpdateResponse
      * @property {number[]} 0 Affected row counts.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback BatchUpdateCallback
      * @param {?BatchUpdateError} err Request error, if any.
      * @param {number[]} rowCounts Affected row counts.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Execute a series of DML statements and get the affected row counts.
      *
      * If any of the DML statements fail, the returned error will contain a list
      * of results for all successfully executed statements.
      *
      * @param {string[]|object[]} query A DML statement or
      *     [`ExecuteSqlRequest`](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ExecuteSqlRequest)
      *     object.
      * @param {object} [query.params] A map of parameter name to values.
      * @param {object} [query.types] A map of parameter types.
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {BatchUpdateOptions} [options] Options for configuring the request.
      * @param {RunUpdateCallback} [callback] Callback function.
      * @returns {Promise<RunUpdateResponse>}
      *
      * @example
      * ```
      * const queries = [
      *   {
      *     sql: 'INSERT INTO MyTable (Key, Value) VALUES (@key, @value)',
      *     params: {key: 'my-key', value: 'my-value'},
      *   },
      *   {
      *     sql: 'UPDATE MyTable t SET t.Value = @value WHERE t.KEY = @key',
      *     params: {key: 'my-other-key', value: 'my-other-value'}
      *   }
      * ];
      *
      * transaction.batchUpdate(queries, (err, rowCounts, apiResponse) => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      * });
      *
      * ```
      * @example If the callback is omitted, we'll return a Promise.
      * ```
      * const [rowCounts, apiResponse] = await transaction.batchUpdate(queries);
      * ```
      */
    def batchUpdate(queries: js.Array[String | Statement]): js.Promise[BatchUpdateResponse] = js.native
    def batchUpdate(queries: js.Array[String | Statement], callback: BatchUpdateCallback): Unit = js.native
    def batchUpdate(queries: js.Array[String | Statement], options: BatchUpdateOptions): js.Promise[BatchUpdateResponse] = js.native
    def batchUpdate(queries: js.Array[String | Statement], options: BatchUpdateOptions, callback: BatchUpdateCallback): Unit = js.native
    def batchUpdate(queries: js.Array[String | Statement], options: CallOptions): js.Promise[BatchUpdateResponse] = js.native
    def batchUpdate(queries: js.Array[String | Statement], options: CallOptions, callback: BatchUpdateCallback): Unit = js.native
    
    /**
      * @typedef {object} CommitOptions
      * @property {google.spanner.v1.IRequestOptions} requestOptions The request options to include
      *     with the commit request.
      * @property {boolean} returnCommitStats Include statistics related to the
      *     transaction in the {@link CommitResponse}.
      * @property {object} [gaxOptions] The request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {object} CommitResponse
      * @property {google.protobuf.Timestamp} commitTimestamp The transaction
      *     commit timestamp.
      * @property {google.spanner.v1.CommitResponse.ICommitStats|null} commitStats
      *     The statistics about this commit. Only populated if requested in
      *     {@link CommitOptions}.
      */
    /**
      * @typedef {array} CommitPromiseResponse
      * @property {CommitResponse} 0 The commit response.
      */
    /**
      * @callback CommitCallback
      * @param {?Error} error Request error, if any.
      * @param {CommitResponse} apiResponse The full API response.
      */
    /**
      * Commit the transaction.
      *
      * Wrapper around {@link v1.SpannerClient#commit}.
      *
      * @see {@link v1.SpannerClient#commit}
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {CommitOptions} [options] Options for configuring the request.
      * @param {CommitCallback} [callback] Callback function.
      * @returns {Promise<CommitPromiseResponse>}
      *
      * @example
      * ```
      * database.runTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Queue a mutation (note that there is no callback passed to `insert`).
      *   transaction.insert('Singers', {
      *     SingerId: 'Id3b',
      *     Name: 'Joe West'
      *   });
      *
      *   // Commit the transaction.
      *   transaction.commit(function(err, apiResponse) {
      *     if (!err) {
      *       // Get the commit timestamp on successful commits.
      *       const {commitTimestamp} = apiResponse;
      *     }
      *   });
      * });
      * ```
      */
    def commit(): js.Promise[CommitResponse] = js.native
    def commit(callback: CommitCallback): Unit = js.native
    def commit(options: CommitOptions): js.Promise[CommitResponse] = js.native
    def commit(options: CommitOptions, callback: CommitCallback): Unit = js.native
    def commit(options: CallOptions): js.Promise[CommitResponse] = js.native
    def commit(options: CallOptions, callback: CommitCallback): Unit = js.native
    
    var commitTimestamp: js.UndefOr[PreciseDate] = js.native
    
    var commitTimestampProto: js.UndefOr[ITimestamp] = js.native
    
    /**
      * Delete rows from a table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {string} table The name of the table.
      * @param {array} keys The keys for the rows to delete. If using a
      *     composite key, provide an array within this array. See the example
      * below.
      *
      * @example
      * ```
      * const keys = ['Id1', 'Id2', 'Id3'];
      *
      * database.runTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Queue this mutation until later calling `commit`.
      *   // Note that a callback is not passed to `deleteRows`.
      *   transaction.deleteRows('Singers', keys);
      *
      *   // Commit the transaction.
      *   transaction.commit(function(err) {
      *     if (!err) {
      *       // The rows were deleted successfully.
      *     }
      *   });
      * });
      *
      * ```
      * @example Provide an array for `keys` to delete rows with a
      * composite key.
      * ```
      * const keys = [
      *   [
      *     'Id1',
      *     'Name1'
      *   ],
      *   [
      *     'Id2',
      *     'Name2'
      *   ]
      * ];
      * ```
      */
    def deleteRows(table: String, keys: js.Array[Key]): Unit = js.native
    
    def insert(table: String, rows: js.Array[js.Object]): Unit = js.native
    /**
      * Insert rows of data into this table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {string} table The name of the table.
      * @param {object|object[]} rows A map of names to values of data to insert
      *     into this table.
      *
      * @example
      * ```
      * const row = {
      *   SingerId: 'Id3',
      *   Name: 'Eddie Wilson'
      * };
      *
      * database.runTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Queue this mutation until later calling `commit`.
      *   // Note that a callback is not passed to `insert`.
      *   transaction.insert('Singers', row);
      *
      *   // Commit the transaction.
      *   transaction.commit(function(err) {
      *     if (!err) {
      *       // The row was inserted successfully.
      *     }
      *   });
      * });
      *
      * ```
      * @example Multiple rows can be inserted at once.
      * ```
      * const row2 = {
      *   SingerId: 'Id3b',
      *   Name: 'Joe West'
      * };
      *
      * database.runTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Queue multiple mutations until later calling `commit`.
      *   // Note that a callback is not passed to `insert`.
      *   transaction.insert('Singers', [
      *     row,
      *     row2
      *   ]);
      *
      *   // Commit the transaction.
      *   transaction.commit(function(err) {
      *     if (!err) {
      *       // The rows were inserted successfully.
      *     }
      *   });
      * });
      * ```
      */
    def insert(table: String, rows: js.Object): Unit = js.native
    
    def replace(table: String, rows: js.Array[js.Object]): Unit = js.native
    /**
      * Replace rows of data within a table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {string} table The table to read from.
      * @param {object|object[]} rows A map of names to values of data to insert
      *     into this table.
      *
      * @example
      * ```
      * const row = {
      *   SingerId: 'Id3',
      *   Name: 'Joe West'
      * };
      *
      * database.runTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Queue this mutation until later calling `commit`.
      *   // Note that a callback is not passed to `replace`.
      *   transaction.replace('Singers', row);
      *
      *   // Commit the transaction.
      *   transaction.commit(function(err) {
      *     if (!err) {
      *       // The row was replaced successfully.
      *     }
      *   });
      * });
      * ```
      */
    def replace(table: String, rows: js.Object): Unit = js.native
    
    /**
      * Roll back a transaction, releasing any locks it holds. It is a good idea to
      * call this for any transaction that includes one or more queries that you
      * decide not to commit.
      *
      * Wrapper around {@link v1.SpannerClient#rollback}.
      *
      * @see {@link v1.SpannerClient#rollback}
      * @see [Rollback API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Rollback)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {BasicCallback} [callback] Callback function.
      * @returns {Promise<BasicResponse>}
      *
      * @example
      * ```
      * database.runTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   transaction.rollback(function(err) {
      *     if (!err) {
      *       // Transaction rolled back successfully.
      *     }
      *   });
      * });
      * ```
      */
    def rollback(): js.Promise[Unit] = js.native
    def rollback(callback: RollbackCallback): Unit = js.native
    def rollback(gaxOptions: CallOptions): js.Promise[Unit] = js.native
    def rollback(gaxOptions: CallOptions, callback: RollbackCallback): Unit = js.native
    
    def update(table: String, rows: js.Array[js.Object]): Unit = js.native
    /**
      * Update rows of data within a table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {string} table The table to read from.
      * @param {object|object[]} rows A map of names to values of data to insert
      *     into this table.
      *
      * @example
      * ```
      * const row = {
      *   SingerId: 'Id3',
      *   Name: 'Joe West'
      * };
      *
      * database.runTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Queue this mutation until later calling `commit`.
      *   // Note that a callback is not passed to `update`.
      *   transaction.update('Singers', row);
      *
      *   // Commit the transaction.
      *   transaction.commit(function(err) {
      *     if (!err) {
      *       // The row was updated successfully.
      *     }
      *   });
      * });
      * ```
      */
    def update(table: String, rows: js.Object): Unit = js.native
    
    def upsert(table: String, rows: js.Array[js.Object]): Unit = js.native
    /**
      * Insert or update rows of data within a table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {string} table The table to read from.
      * @param {object|object[]} rows A map of names to values of data to insert
      *     into this table.
      *
      * @example
      * ```
      * const row = {
      *   SingerId: 'Id3',
      *   Name: 'Joe West'
      * };
      *
      * database.runTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Queue this mutation until later calling `commit`.
      *   // Note that a callback is not passed to `upsert`.
      *   transaction.upsert('Singers', row);
      *
      *   // Commit the transaction.
      *   transaction.commit(function(err) {
      *     if (!err) {
      *       // The row was updated or inserted successfully.
      *     }
      *   });
      * });
      * ```
      */
    def upsert(table: String, rows: js.Object): Unit = js.native
  }
  /* static members */
  object Transaction {
    
    @JSImport("@google-cloud/spanner/build/src/transaction", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decorates an error returned by a commit with additional information for
      * specific known errors.
      * @param err the error to check and decorate with additional information if possible
      * @param mutations the mutations included in the commit request
      * @private
      */
    @JSImport("@google-cloud/spanner/build/src/transaction", "Transaction.decorateCommitError")
    @js.native
    def decorateCommitError: Any = js.native
    inline def decorateCommitError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorateCommitError")(x.asInstanceOf[js.Any])
    
    /**
      * Decorates an error returned by a commit with additional information if the
      * error was returned because the application tried to insert an array of
      * objects into a JSON column. An array of objects will by default be encoded
      * as ARRAY<JSON>, but can also be interpreted as JSON. An application must
      * specify a top-level array of objects that should be inserted into a JSON
      * column as a string instead of as an array of objects.
      * @param err the error returned by the commit RPC
      * @param mutations the mutations included in the commit request
      * @private
      */
    @JSImport("@google-cloud/spanner/build/src/transaction", "Transaction.decoratePossibleJsonMismatchError")
    @js.native
    def decoratePossibleJsonMismatchError: Any = js.native
    inline def decoratePossibleJsonMismatchError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decoratePossibleJsonMismatchError")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/spanner/build/src/transaction", "Transaction.extractKnownMetadata")
    @js.native
    def extractKnownMetadata: Any = js.native
    inline def extractKnownMetadata_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extractKnownMetadata")(x.asInstanceOf[js.Any])
    
    /**
      * Takes a list of rows and returns all unique column names.
      *
      * @private
      *
      * @param {object[]} rows The rows.
      * @returns {string[]}
      */
    inline def getUniqueKeys(rows: js.Array[js.Object]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueKeys")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  type BatchUpdateCallback = js.Function3[
    /* err */ Null | BatchUpdateError, 
    /* rowCounts */ js.Array[Double], 
    /* response */ js.UndefOr[ExecuteBatchDmlResponse], 
    Unit
  ]
  
  trait BatchUpdateError
    extends StObject
       with ServiceError {
    
    var rowCounts: js.Array[Double]
  }
  object BatchUpdateError {
    
    inline def apply(
      code: Status,
      details: String,
      message: String,
      metadata: Metadata,
      name: String,
      rowCounts: js.Array[Double]
    ): BatchUpdateError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowCounts = rowCounts.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchUpdateError]
    }
    
    extension [Self <: BatchUpdateError](x: Self) {
      
      inline def setRowCounts(value: js.Array[Double]): Self = StObject.set(x, "rowCounts", value.asInstanceOf[js.Any])
      
      inline def setRowCountsVarargs(value: Double*): Self = StObject.set(x, "rowCounts", js.Array(value*))
    }
  }
  
  trait BatchUpdateOptions extends StObject {
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
    
    var requestOptions: js.UndefOr[OmitIRequestOptionstransa] = js.undefined
  }
  object BatchUpdateOptions {
    
    inline def apply(): BatchUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchUpdateOptions]
    }
    
    extension [Self <: BatchUpdateOptions](x: Self) {
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
      
      inline def setRequestOptions(value: OmitIRequestOptionstransa): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    }
  }
  
  type BatchUpdateResponse = js.Tuple2[js.Array[Double], ExecuteBatchDmlResponse]
  
  type BeginResponse = js.Array[ITransaction]
  
  type BeginTransactionCallback = NormalCallback[ITransaction]
  
  type CommitCallback = NormalCallback[ICommitResponse]
  
  trait CommitOptions extends StObject {
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
    
    var requestOptions: js.UndefOr[PickIRequestOptionspriori] = js.undefined
    
    var returnCommitStats: js.UndefOr[Boolean] = js.undefined
  }
  object CommitOptions {
    
    inline def apply(): CommitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommitOptions]
    }
    
    extension [Self <: CommitOptions](x: Self) {
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
      
      inline def setRequestOptions(value: PickIRequestOptionspriori): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setReturnCommitStats(value: Boolean): Self = StObject.set(x, "returnCommitStats", value.asInstanceOf[js.Any])
      
      inline def setReturnCommitStatsUndefined: Self = StObject.set(x, "returnCommitStats", js.undefined)
    }
  }
  
  type CommitRequest = ICommitRequest
  
  type CommitResponse = js.Array[ICommitResponse]
  
  trait ExecuteSqlRequest
    extends StObject
       with Statement
       with RequestOptions {
    
    var partitionToken: js.UndefOr[js.typedarray.Uint8Array | String] = js.undefined
    
    var queryMode: js.UndefOr[QueryMode] = js.undefined
    
    var queryOptions: js.UndefOr[IQueryOptions] = js.undefined
    
    var requestOptions: js.UndefOr[OmitIRequestOptionstransa] = js.undefined
    
    var resumeToken: js.UndefOr[ResumeToken] = js.undefined
    
    var seqno: js.UndefOr[Double] = js.undefined
  }
  object ExecuteSqlRequest {
    
    inline def apply(sql: String): ExecuteSqlRequest = {
      val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteSqlRequest]
    }
    
    extension [Self <: ExecuteSqlRequest](x: Self) {
      
      inline def setPartitionToken(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
      
      inline def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
      
      inline def setQueryMode(value: QueryMode): Self = StObject.set(x, "queryMode", value.asInstanceOf[js.Any])
      
      inline def setQueryModeUndefined: Self = StObject.set(x, "queryMode", js.undefined)
      
      inline def setQueryOptions(value: IQueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
      
      inline def setQueryOptionsUndefined: Self = StObject.set(x, "queryOptions", js.undefined)
      
      inline def setRequestOptions(value: OmitIRequestOptionstransa): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setResumeToken(value: ResumeToken): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
      
      inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
      
      inline def setSeqno(value: Double): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
      
      inline def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
    }
  }
  
  trait KeyRange extends StObject {
    
    var endClosed: js.UndefOr[js.Array[Value]] = js.undefined
    
    var endOpen: js.UndefOr[js.Array[Value]] = js.undefined
    
    var startClosed: js.UndefOr[js.Array[Value]] = js.undefined
    
    var startOpen: js.UndefOr[js.Array[Value]] = js.undefined
  }
  object KeyRange {
    
    inline def apply(): KeyRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyRange]
    }
    
    extension [Self <: KeyRange](x: Self) {
      
      inline def setEndClosed(value: js.Array[Value]): Self = StObject.set(x, "endClosed", value.asInstanceOf[js.Any])
      
      inline def setEndClosedUndefined: Self = StObject.set(x, "endClosed", js.undefined)
      
      inline def setEndClosedVarargs(value: Value*): Self = StObject.set(x, "endClosed", js.Array(value*))
      
      inline def setEndOpen(value: js.Array[Value]): Self = StObject.set(x, "endOpen", value.asInstanceOf[js.Any])
      
      inline def setEndOpenUndefined: Self = StObject.set(x, "endOpen", js.undefined)
      
      inline def setEndOpenVarargs(value: Value*): Self = StObject.set(x, "endOpen", js.Array(value*))
      
      inline def setStartClosed(value: js.Array[Value]): Self = StObject.set(x, "startClosed", value.asInstanceOf[js.Any])
      
      inline def setStartClosedUndefined: Self = StObject.set(x, "startClosed", js.undefined)
      
      inline def setStartClosedVarargs(value: Value*): Self = StObject.set(x, "startClosed", js.Array(value*))
      
      inline def setStartOpen(value: js.Array[Value]): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
      
      inline def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
      
      inline def setStartOpenVarargs(value: Value*): Self = StObject.set(x, "startOpen", js.Array(value*))
    }
  }
  
  type ReadCallback = NormalCallback[Rows]
  
  trait ReadRequest
    extends StObject
       with RequestOptions {
    
    var columns: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var index: js.UndefOr[String] = js.undefined
    
    var keySet: js.UndefOr[IKeySet | Null] = js.undefined
    
    var keys: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
    
    var limit: js.UndefOr[
        Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) | Null
      ] = js.undefined
    
    var partitionToken: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
    
    var ranges: js.UndefOr[js.Array[KeyRange]] = js.undefined
    
    var requestOptions: js.UndefOr[OmitIRequestOptionstransa] = js.undefined
    
    var resumeToken: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
  }
  object ReadRequest {
    
    inline def apply(): ReadRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadRequest]
    }
    
    extension [Self <: ReadRequest](x: Self) {
      
      inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsNull: Self = StObject.set(x, "columns", null)
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKeySet(value: IKeySet): Self = StObject.set(x, "keySet", value.asInstanceOf[js.Any])
      
      inline def setKeySetNull: Self = StObject.set(x, "keySet", null)
      
      inline def setKeySetUndefined: Self = StObject.set(x, "keySet", js.undefined)
      
      inline def setKeys(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setLimit(
        value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitNull: Self = StObject.set(x, "limit", null)
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPartitionToken(value: js.typedarray.Uint8Array): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
      
      inline def setPartitionTokenNull: Self = StObject.set(x, "partitionToken", null)
      
      inline def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
      
      inline def setRanges(value: js.Array[KeyRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setRangesVarargs(value: KeyRange*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setRequestOptions(value: OmitIRequestOptionstransa): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setResumeToken(value: js.typedarray.Uint8Array): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
      
      inline def setResumeTokenNull: Self = StObject.set(x, "resumeToken", null)
      
      inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  type ReadResponse = js.Array[Rows]
  
  trait RequestOptions extends StObject {
    
    var gaxOptions: js.UndefOr[CallOptions] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var jsonOptions: js.UndefOr[JSONOptions] = js.undefined
    
    var maxResumeRetries: js.UndefOr[Double] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setGaxOptions(value: CallOptions): Self = StObject.set(x, "gaxOptions", value.asInstanceOf[js.Any])
      
      inline def setGaxOptionsUndefined: Self = StObject.set(x, "gaxOptions", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonOptions(value: JSONOptions): Self = StObject.set(x, "jsonOptions", value.asInstanceOf[js.Any])
      
      inline def setJsonOptionsUndefined: Self = StObject.set(x, "jsonOptions", js.undefined)
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMaxResumeRetries(value: Double): Self = StObject.set(x, "maxResumeRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxResumeRetriesUndefined: Self = StObject.set(x, "maxResumeRetries", js.undefined)
    }
  }
  
  type Rows = js.Array[Row | Json]
  
  type RunCallback = js.Function4[
    /* err */ Null | ServiceError, 
    /* rows */ Rows, 
    /* stats */ ResultSetStats, 
    /* metadata */ js.UndefOr[ResultSetMetadata], 
    Unit
  ]
  
  type RunResponse = js.Tuple3[Rows, ResultSetStats, ResultSetMetadata]
  
  type RunUpdateCallback = js.Function2[/* err */ Null | ServiceError, /* rowCount */ Double, Unit]
  
  type RunUpdateResponse = js.Array[Double]
  
  trait Statement extends StObject {
    
    var params: js.UndefOr[StringDictionary[Value]] = js.undefined
    
    var sql: String
    
    var types: js.UndefOr[Type | StringDictionary[Value]] = js.undefined
  }
  object Statement {
    
    inline def apply(sql: String): Statement = {
      val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[Statement]
    }
    
    extension [Self <: Statement](x: Self) {
      
      inline def setParams(value: StringDictionary[Value]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Type | StringDictionary[Value]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
  
  trait TimestampBounds extends StObject {
    
    var exactStaleness: js.UndefOr[Double | IDuration] = js.undefined
    
    var maxStaleness: js.UndefOr[Double | IDuration] = js.undefined
    
    var minReadTimestamp: js.UndefOr[PreciseDate | ITimestamp] = js.undefined
    
    var readTimestamp: js.UndefOr[PreciseDate | ITimestamp] = js.undefined
    
    var returnReadTimestamp: js.UndefOr[Boolean] = js.undefined
    
    var strong: js.UndefOr[Boolean] = js.undefined
  }
  object TimestampBounds {
    
    inline def apply(): TimestampBounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimestampBounds]
    }
    
    extension [Self <: TimestampBounds](x: Self) {
      
      inline def setExactStaleness(value: Double | IDuration): Self = StObject.set(x, "exactStaleness", value.asInstanceOf[js.Any])
      
      inline def setExactStalenessUndefined: Self = StObject.set(x, "exactStaleness", js.undefined)
      
      inline def setMaxStaleness(value: Double | IDuration): Self = StObject.set(x, "maxStaleness", value.asInstanceOf[js.Any])
      
      inline def setMaxStalenessUndefined: Self = StObject.set(x, "maxStaleness", js.undefined)
      
      inline def setMinReadTimestamp(value: PreciseDate | ITimestamp): Self = StObject.set(x, "minReadTimestamp", value.asInstanceOf[js.Any])
      
      inline def setMinReadTimestampUndefined: Self = StObject.set(x, "minReadTimestamp", js.undefined)
      
      inline def setReadTimestamp(value: PreciseDate | ITimestamp): Self = StObject.set(x, "readTimestamp", value.asInstanceOf[js.Any])
      
      inline def setReadTimestampUndefined: Self = StObject.set(x, "readTimestamp", js.undefined)
      
      inline def setReturnReadTimestamp(value: Boolean): Self = StObject.set(x, "returnReadTimestamp", value.asInstanceOf[js.Any])
      
      inline def setReturnReadTimestampUndefined: Self = StObject.set(x, "returnReadTimestamp", js.undefined)
      
      inline def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    }
  }
}
