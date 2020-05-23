package typings.firebaseFirestore.simpleDbMod

import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.std.IDBDatabase
import typings.std.IDBValidKey
import typings.std.IDBVersionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "SimpleDb")
@js.native
class SimpleDb protected () extends js.Object {
  def this(db: IDBDatabase) = this()
  var db: js.Any = js.native
  def close(): Unit = js.native
  def runTransaction[T](
    mode: SimpleDbTransactionMode,
    objectStores: js.Array[String],
    transactionFn: js.Function1[/* transaction */ SimpleDbTransaction, PersistencePromise[T]]
  ): js.Promise[T] = js.native
  def setVersionChangeListener(versionChangeListener: js.Function1[/* event */ IDBVersionChangeEvent, Unit]): Unit = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "SimpleDb")
@js.native
object SimpleDb extends js.Object {
  /** Deletes the specified database. */
  def delete(name: String): js.Promise[Unit] = js.native
  /** Parse User Agent to determine Android version. Returns -1 if not found. */
  def getAndroidVersion(ua: String): Double = js.native
  /** Parse User Agent to determine iOS version. Returns -1 if not found. */
  def getIOSVersion(ua: String): Double = js.native
  /** Helper to get a typed SimpleDbStore from a transaction. */
  def getStore[KeyType /* <: IDBValidKey */, ValueType /* <: js.Any */](txn: SimpleDbTransaction, store: String): SimpleDbStore[KeyType, ValueType] = js.native
  /** Returns true if IndexedDB is available in the current environment. */
  def isAvailable(): Boolean = js.native
  /**
    * Returns true if the backing IndexedDB store is the Node IndexedDBShim
    * (see https://github.com/axemclion/IndexedDBShim).
    */
  def isMockPersistence(): Boolean = js.native
  /**
    * Opens the specified database, creating or upgrading it if necessary.
    *
    * Note that `version` must not be a downgrade. IndexedDB does not support downgrading the schema
    * version. We currently do not support any way to do versioning outside of IndexedDB's versioning
    * mechanism, as only version-upgrade transactions are allowed to do things like create
    * objectstores.
    */
  def openOrCreate(name: String, version: Double, schemaConverter: SimpleDbSchemaConverter): js.Promise[SimpleDb] = js.native
}

