package typings.firebaseFirestore.simpleDbMod

import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.std.IDBCursorWithValue
import typings.std.IDBValidKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "IterationController")
@js.native
class IterationController protected () extends js.Object {
  def this(dbCursor: IDBCursorWithValue) = this()
  var dbCursor: js.Any = js.native
  var nextKey: js.Any = js.native
  var shouldStop: js.Any = js.native
  def cursor(value: IDBCursorWithValue): js.Any = js.native
  /**
    * Delete the current cursor value from the object store.
    *
    * NOTE: You CANNOT do this with a keysOnly query.
    */
  def delete(): PersistencePromise[Unit] = js.native
  /**
    * This function can be called to stop iteration at any point.
    */
  def done(): Unit = js.native
  def isDone: Boolean = js.native
  /**
    * This function can be called to skip to that next key, which could be
    * an index or a primary key.
    */
  def skip(key: IDBValidKey): Unit = js.native
  def skipToKey: IDBValidKey | Null = js.native
}

