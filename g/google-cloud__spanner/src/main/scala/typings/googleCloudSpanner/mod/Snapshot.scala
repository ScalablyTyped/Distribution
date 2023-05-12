package typings.googleCloudSpanner.mod

import typings.googleCloudSpanner.anon.ParamTypes
import typings.googleCloudSpanner.buildSrcTransactionMod.ExecuteSqlRequest
import typings.googleCloudSpanner.buildSrcTransactionMod.ReadRequest
import typings.googleCloudSpanner.buildSrcTransactionMod.TimestampBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/spanner", "Snapshot")
@js.native
open class Snapshot protected ()
  extends typings.googleCloudSpanner.buildSrcTransactionMod.Snapshot {
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
  def this(session: typings.googleCloudSpanner.buildSrcSessionMod.Session) = this()
  def this(session: typings.googleCloudSpanner.buildSrcSessionMod.Session, options: TimestampBounds) = this()
  def this(
    session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
    options: Unit,
    queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any
  ) = this()
  def this(
    session: typings.googleCloudSpanner.buildSrcSessionMod.Session,
    options: TimestampBounds,
    queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IQueryOptions */ Any
  ) = this()
}
/* static members */
object Snapshot {
  
  @JSImport("@google-cloud/spanner", "Snapshot")
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
  inline def encodeKeySet(request: ReadRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeKeySet")(request.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def encodeTimestampBounds(options: TimestampBounds): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeTimestampBounds")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
}
