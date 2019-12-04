package typings.atFirebaseMessaging

import typings.std.IDBKeyRange
import typings.std.IDBOpenDBRequest
import typings.std.IDBValidKey
import typings.std.IDBVersionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/models/db-interface", JSImport.Namespace)
@js.native
object distSrcModelsDbDashInterfaceMod extends js.Object {
  @js.native
  abstract class DbInterface () extends js.Object {
    /**
      * Creates an IndexedDB Transaction and passes its objectStore to the
      * runRequest function, which runs the database request.
      *
      * @return Promise that resolves with the result of the runRequest function
      */
    var createTransaction: js.Any = js.native
    val dbName: String = js.native
    var dbPromise: js.Any = js.native
    val dbVersion: Double = js.native
    /** Gets the cached db connection or opens a new one. */
    var getDb: js.Any = js.native
    val objectStoreName: String = js.native
    /**
      * Close the currently open database.
      */
    def closeDatabase(): js.Promise[Unit] = js.native
    def delete(key: IDBKeyRange): js.Promise[Unit] = js.native
    /** Deletes record(s) from the objectStore that match the given key. */
    def delete(key: IDBValidKey): js.Promise[Unit] = js.native
    /** Gets record(s) from the objectStore that match the given key. */
    def get[T](key: IDBValidKey): js.Promise[js.UndefOr[T]] = js.native
    /** Gets record(s) from the objectStore that match the given index. */
    def getIndex[T](index: String, key: IDBValidKey): js.Promise[js.UndefOr[T]] = js.native
    /**
      * Database initialization.
      *
      * This function should create and update object stores.
      */
    /* protected */ def onDbUpgrade(request: IDBOpenDBRequest, event: IDBVersionChangeEvent): Unit = js.native
    /** Assigns or overwrites the record for the given value. */
    def put(value: js.Any): js.Promise[Unit] = js.native
  }
  
}

