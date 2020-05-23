package typings.firebaseFirestore.indexeddbSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_schema", "DbClientMetadata")
@js.native
class DbClientMetadata protected () extends js.Object {
  def this(
    /** The auto-generated client id assigned at client startup. */
  clientId: String,
    /** The last time this state was updated. */
  updateTimeMs: Double,
    /** Whether the client's network connection is enabled. */
  networkEnabled: Boolean,
    /** Whether this client is running in a foreground tab. */
  inForeground: Boolean
  ) = this()
  /** The auto-generated client id assigned at client startup. */
  var clientId: String = js.native
  /** Whether this client is running in a foreground tab. */
  var inForeground: Boolean = js.native
  /** Whether the client's network connection is enabled. */
  var networkEnabled: Boolean = js.native
  /** The last time this state was updated. */
  var updateTimeMs: Double = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_schema", "DbClientMetadata")
@js.native
object DbClientMetadata extends js.Object {
  /** Keys are automatically assigned via the clientId properties. */
  var keyPath: String = js.native
  /** Name of the IndexedDb object store. */
  var store: String = js.native
}

