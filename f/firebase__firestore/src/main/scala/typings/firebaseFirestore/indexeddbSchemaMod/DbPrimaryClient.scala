package typings.firebaseFirestore.indexeddbSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_schema", "DbPrimaryClient")
@js.native
class DbPrimaryClient protected () extends js.Object {
  def this(
    ownerId: String,
    /** Whether to allow shared access from multiple tabs. */
  allowTabSynchronization: Boolean,
    leaseTimestampMs: Double
  ) = this()
  /** Whether to allow shared access from multiple tabs. */
  var allowTabSynchronization: Boolean = js.native
  var leaseTimestampMs: Double = js.native
  var ownerId: String = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_schema", "DbPrimaryClient")
@js.native
object DbPrimaryClient extends js.Object {
  /**
    * The key string used for the single object that exists in the
    * DbPrimaryClient store.
    */
  var key: String = js.native
  /**
    * Name of the IndexedDb object store.
    *
    * Note that the name 'owner' is chosen to ensure backwards compatibility with
    * older clients that only supported single locked access to the persistence
    * layer.
    */
  var store: String = js.native
}

