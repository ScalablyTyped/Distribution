package typings.firebaseFirestore.simpleDbMod

import typings.std.Error
import typings.std.IDBDatabase
import typings.std.IDBTransaction
import typings.std.IDBTransactionMode
import typings.std.IDBValidKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/simple_db", "SimpleDbTransaction")
@js.native
class SimpleDbTransaction protected () extends js.Object {
  def this(transaction: IDBTransaction) = this()
  var aborted: js.Any = js.native
  /**
    * A promise that resolves with the result of the IndexedDb transaction.
    */
  val completionDeferred: js.Any = js.native
  val transaction: js.Any = js.native
  def abort(): Unit = js.native
  def abort(error: Error): Unit = js.native
  def completionPromise(): js.Promise[Unit] = js.native
  /**
    * Returns a SimpleDbStore<KeyType, ValueType> for the specified store. All
    * operations performed on the SimpleDbStore happen within the context of this
    * transaction and it cannot be used anymore once the transaction is
    * completed.
    *
    * Note that we can't actually enforce that the KeyType and ValueType are
    * correct, but they allow type safety through the rest of the consuming code.
    */
  def store[KeyType /* <: IDBValidKey */, ValueType /* <: js.Any */](storeName: String): SimpleDbStore[KeyType, ValueType] = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/local/simple_db", "SimpleDbTransaction")
@js.native
object SimpleDbTransaction extends js.Object {
  def open(db: IDBDatabase, mode: IDBTransactionMode, objectStoreNames: js.Array[String]): SimpleDbTransaction = js.native
}

