package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/database_info", JSImport.Namespace)
@js.native
object coreDatabaseInfoMod extends js.Object {
  @js.native
  class DatabaseId protected () extends js.Object {
    def this(projectId: String) = this()
    def this(projectId: String, database: String) = this()
    val database: String = js.native
    val projectId: String = js.native
    def compareTo(other: DatabaseId): Double = js.native
    def isDefaultDatabase(): Boolean = js.native
    def isEqual(other: js.Object): Boolean = js.native
  }
  
  @js.native
  class DatabaseInfo protected () extends js.Object {
    /**
      * Constructs a DatabaseInfo using the provided host, databaseId and
      * persistenceKey.
      *
      * @param databaseId The database to use.
      * @param persistenceKey A unique identifier for this Firestore's local
      * storage (used in conjunction with the databaseId).
      * @param host The Firestore backend host to connect to.
      * @param ssl Whether to use SSL when connecting.
      * @param forceLongPolling Whether to use the forceLongPolling option
      * when using WebChannel as the network transport.
      */
    def this(
      databaseId: DatabaseId,
      persistenceKey: String,
      host: String,
      ssl: Boolean,
      forceLongPolling: Boolean
    ) = this()
    val databaseId: DatabaseId = js.native
    val forceLongPolling: Boolean = js.native
    val host: String = js.native
    val persistenceKey: String = js.native
    val ssl: Boolean = js.native
  }
  
}

