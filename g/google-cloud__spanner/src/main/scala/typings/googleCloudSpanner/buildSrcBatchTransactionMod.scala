package typings.googleCloudSpanner

import typings.googleCloudSpanner.buildSrcPartialResultStreamMod.PartialResultStream_
import typings.googleCloudSpanner.buildSrcSessionMod.Session
import typings.googleCloudSpanner.buildSrcTransactionMod.Snapshot
import typings.googleCloudSpanner.buildSrcTransactionMod.TimestampBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcBatchTransactionMod {
  
  /**
    * Use a BatchTransaction object to create partitions and read/query against
    * your Cloud Spanner database.
    *
    * @class
    * @extends Snapshot
    *
    * @param {TimestampBounds} [options] [Timestamp Bounds](https://cloud.google.com/spanner/docs/timestamp-bounds).
    */
  @JSImport("@google-cloud/spanner/build/src/batch-transaction", "BatchTransaction")
  @js.native
  open class BatchTransaction protected () extends Snapshot {
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
    def this(
      session: Session,
      options: Unit,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any
    ) = this()
    def this(
      session: Session,
      options: TimestampBounds,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any
    ) = this()
    
    /**
      * Closes all open resources.
      *
      * When the transaction is no longer needed, you should call this method to
      * free up resources allocated by the Batch client.
      *
      * Calling this method would render the transaction unusable everywhere. In
      * particular if this transaction object was being used across multiple
      * machines, calling this method on any of the machine would make the
      * transaction unusable on all the machines. This should only be called when
      * the transaction is no longer needed anywhere
      *
      * @param {BasicCallback} [callback] Callback function.
      * @returns {Promise<BasicResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.createBatchTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   transaction.close(function(err, apiResponse) {});
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * database.createBatchTransaction().then(function(data) {
      *   const transaction = data[0];
      *   return transaction.close();
      * });
      * ```
      */
    def close(): Unit = js.native
    def close(callback: Any): Unit = js.native
    
    /**
      * Generic create partition method. Handles common parameters used in both
      * {@link BatchTransaction#createQueryPartitions} and {@link
      * BatchTransaction#createReadPartitions}
      *
      * @private
      *
      * @param {object} config The request config.
      * @param {function} callback Callback function.
      */
    def createPartitions_(config: Any, callback: Any): Unit = js.native
    
    /**
      * @see [`ExecuteSqlRequest`](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ExecuteSqlRequest)
      * @typedef {object} QueryPartition
      * @property {string} partitionToken The partition token.
      */
    /**
      * @typedef {array} CreateQueryPartitionsResponse
      * @property {QueryPartition[]} 0 List of query partitions.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback CreateQueryPartitionsCallback
      * @param {?Error} err Request error, if any.
      * @param {QueryPartition[]} partitions List of query partitions.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Creates a set of query partitions that can be used to execute a query
      * operation in parallel. Partitions become invalid when the transaction used
      * to create them is closed.
      *
      * @param {string|object} query A SQL query or
      *     [`ExecuteSqlRequest`](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ExecuteSqlRequest)
      *     object.
      * @param {object} [query.gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {object} [query.params] A map of parameter name to values.
      * @param {object} [query.partitionOptions] A map of partition options.
      * @param {object} [query.types] A map of parameter types.
      * @param {CreateQueryPartitionsCallback} [callback] Callback callback function.
      * @returns {Promise<CreateQueryPartitionsResponse>}
      *
      * @example <caption>include:samples/batch.js</caption>
      * region_tag:spanner_batch_client
      */
    def createQueryPartitions(query: Any, callback: Any): Unit = js.native
    
    /**
      * @typedef {object} ReadPartition
      * @mixes ReadRequestOptions
      * @property {string} partitionToken The partition token.
      * @property {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * @typedef {array} CreateReadPartitionsResponse
      * @property {ReadPartition[]} 0 List of read partitions.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback CreateReadPartitionsCallback
      * @param {?Error} err Request error, if any.
      * @param {ReadPartition[]} partitions List of read partitions.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Creates a set of read partitions that can be used to execute a read
      * operation in parallel. Partitions become invalid when the transaction used
      * to create them is closed.
      *
      * @param {ReadRequestOptions} options Configuration object, describing what to
      *     read from.
      * @param {CreateReadPartitionsCallback} [callback] Callback function.
      * @returns {Promise<CreateReadPartitionsResponse>}
      */
    def createReadPartitions(options: Any, callback: Any): Unit = js.native
    
    /**
      * Executes partition.
      *
      * @see {@link Transaction#read} when using {@link ReadPartition}.
      * @see {@link Transaction#run} when using {@link QueryParition}.
      *
      * @param {ReadPartition|QueryParition} partition The partition object.
      * @param {object} [partition.gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {TransactionRequestReadCallback|RunCallback} [callback] Callback
      *     function.
      * @returns {Promise<RunResponse>|Promise<TransactionRequestReadResponse>}
      *
      * @example <caption>include:samples/batch.js</caption>
      * region_tag:spanner_batch_execute_partitions
      */
    def execute(partition: Any, callback: Any): Unit = js.native
    
    /**
      * Executes partition in streaming mode.
      *
      * @see {@link Transaction#createReadStream} when using {@link ReadPartition}.
      * @see {@link Transaction#runStream} when using {@link QueryPartition}.
      *
      * @param {ReadPartition|QueryPartition} partition The partition object.
      * @returns {ReadableStream} A readable stream that emits rows.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.createBatchTransaction(function(err, transaction) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   transaction.createReadPartitions(options, function(err, partitions) {
      *     const partition = partitions[0];
      *
      *     transaction
      *       .executeStream(partition)
      *       .on('error', function(err) {})
      *       .on('data', function(row) {
      *         // row = [
      *         //   {
      *         //     name: 'SingerId',
      *         //     value: '1'
      *         //   },
      *         //   {
      *         //     name: 'Name',
      *         //     value: 'Eddie Wilson'
      *         //   }
      *         // ]
      *       })
      *       .on('end', function() {
      *         // All results retrieved
      *       });
      *   });
      * });
      * ```
      */
    def executeStream(partition: Any): PartialResultStream_ = js.native
    
    /**
      * @typedef {object} TransactionIdentifier
      * @property {string|Session} session The full session name.
      * @property {string} transaction The transaction ID.
      * @property {string|Date} readTimestamp The transaction read timestamp.
      */
    /**
      * Creates a transaction identifier used to reference the transaction in
      * workers.
      *
      * @returns {TransactionIdentifier}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      *
      * database.createBatchTransaction(function(err, transaction) {
      *   const identifier = transaction.identifier();
      * });
      * ```
      */
    def identifier(): TransactionIdentifier = js.native
  }
  
  trait TransactionIdentifier extends StObject {
    
    var session: String | typings.googleCloudSpanner.mod.Session
    
    var timestamp: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.ITimestamp */ Any
      ] = js.undefined
    
    var transaction: js.UndefOr[String] = js.undefined
  }
  object TransactionIdentifier {
    
    inline def apply(session: String | typings.googleCloudSpanner.mod.Session): TransactionIdentifier = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionIdentifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionIdentifier] (val x: Self) extends AnyVal {
      
      inline def setSession(value: String | typings.googleCloudSpanner.mod.Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.ITimestamp */ Any
      ): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    }
  }
}
