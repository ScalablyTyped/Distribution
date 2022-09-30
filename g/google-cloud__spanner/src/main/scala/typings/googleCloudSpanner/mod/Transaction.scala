package typings.googleCloudSpanner.mod

import typings.googleCloudSpanner.anon.PickIRequestOptionstransa
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.IQueryOptions
import typings.googleCloudSpanner.protosMod.google.spanner.v1.TransactionOptions.ReadWrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/spanner", "Transaction")
@js.native
open class Transaction protected ()
  extends typings.googleCloudSpanner.transactionMod.Transaction {
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
  def this(session: typings.googleCloudSpanner.sessionMod.Session) = this()
  def this(session: typings.googleCloudSpanner.sessionMod.Session, options: ReadWrite) = this()
  def this(session: typings.googleCloudSpanner.sessionMod.Session, options: Unit, queryOptions: IQueryOptions) = this()
  def this(
    session: typings.googleCloudSpanner.sessionMod.Session,
    options: ReadWrite,
    queryOptions: IQueryOptions
  ) = this()
  def this(
    session: typings.googleCloudSpanner.sessionMod.Session,
    options: Unit,
    queryOptions: Unit,
    requestOptions: PickIRequestOptionstransa
  ) = this()
  def this(
    session: typings.googleCloudSpanner.sessionMod.Session,
    options: Unit,
    queryOptions: IQueryOptions,
    requestOptions: PickIRequestOptionstransa
  ) = this()
  def this(
    session: typings.googleCloudSpanner.sessionMod.Session,
    options: ReadWrite,
    queryOptions: Unit,
    requestOptions: PickIRequestOptionstransa
  ) = this()
  def this(
    session: typings.googleCloudSpanner.sessionMod.Session,
    options: ReadWrite,
    queryOptions: IQueryOptions,
    requestOptions: PickIRequestOptionstransa
  ) = this()
}
/* static members */
object Transaction {
  
  @JSImport("@google-cloud/spanner", "Transaction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decorates an error returned by a commit with additional information for
    * specific known errors.
    * @param err the error to check and decorate with additional information if possible
    * @param mutations the mutations included in the commit request
    * @private
    */
  @JSImport("@google-cloud/spanner", "Transaction.decorateCommitError")
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
  @JSImport("@google-cloud/spanner", "Transaction.decoratePossibleJsonMismatchError")
  @js.native
  def decoratePossibleJsonMismatchError: Any = js.native
  inline def decoratePossibleJsonMismatchError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decoratePossibleJsonMismatchError")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/spanner", "Transaction.extractKnownMetadata")
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
