package typings.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/indexeddb_schema", "DbMutationQueue")
@js.native
class DbMutationQueue protected () extends js.Object {
  def this(
    /**
    * The normalized user ID to which this queue belongs.
    */
  userId: String,
    /**
    * An identifier for the highest numbered batch that has been acknowledged
    * by the server. All MutationBatches in this queue with batchIds less
    * than or equal to this value are considered to have been acknowledged by
    * the server.
    *
    * NOTE: this is deprecated and no longer used by the code.
    */
  lastAcknowledgedBatchId: Double,
    /**
    * A stream token that was previously sent by the server.
    *
    * See StreamingWriteRequest in datastore.proto for more details about
    * usage.
    *
    * After sending this token, earlier tokens may not be used anymore so
    * only a single stream token is retained.
    */
  lastStreamToken: String
  ) = this()
  /**
    * An identifier for the highest numbered batch that has been acknowledged
    * by the server. All MutationBatches in this queue with batchIds less
    * than or equal to this value are considered to have been acknowledged by
    * the server.
    *
    * NOTE: this is deprecated and no longer used by the code.
    */
  var lastAcknowledgedBatchId: Double = js.native
  /**
    * A stream token that was previously sent by the server.
    *
    * See StreamingWriteRequest in datastore.proto for more details about
    * usage.
    *
    * After sending this token, earlier tokens may not be used anymore so
    * only a single stream token is retained.
    */
  var lastStreamToken: String = js.native
  /**
    * The normalized user ID to which this queue belongs.
    */
  var userId: String = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/local/indexeddb_schema", "DbMutationQueue")
@js.native
object DbMutationQueue extends js.Object {
  /** Keys are automatically assigned via the userId property. */
  var keyPath: String = js.native
  /** Name of the IndexedDb object store.  */
  var store: String = js.native
}

