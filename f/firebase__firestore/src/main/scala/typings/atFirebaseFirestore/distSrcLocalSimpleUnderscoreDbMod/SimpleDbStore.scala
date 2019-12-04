package typings.atFirebaseFirestore.distSrcLocalSimpleUnderscoreDbMod

import typings.atFirebaseFirestore.distSrcLocalPersistenceUnderscorePromiseMod.PersistencePromise
import typings.std.IDBKeyRange
import typings.std.IDBObjectStore
import typings.std.IDBValidKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/simple_db", "SimpleDbStore")
@js.native
class SimpleDbStore[KeyType /* <: IDBValidKey */, ValueType /* <: js.Any */] protected () extends js.Object {
  def this(store: IDBObjectStore) = this()
  var cursor: js.Any = js.native
  var iterateCursor: js.Any = js.native
  var options: js.Any = js.native
  var store: js.Any = js.native
  /**
    * Adds a new value into an Object Store and returns the new key. Similar to
    * IndexedDb's `add()`, this method will fail on primary key collisions.
    *
    * @param value The object to write.
    * @return The key of the value to add.
    */
  def add(value: ValueType): PersistencePromise[KeyType] = js.native
  /**
    * If we ever need more of the count variants, we can add overloads. For now,
    * all we need is to count everything in a store.
    *
    * Returns the number of rows in the store.
    */
  def count(): PersistencePromise[Double] = js.native
  def delete(key: KeyType): PersistencePromise[Unit] = js.native
  def delete(key: IDBKeyRange): PersistencePromise[Unit] = js.native
  def deleteAll(): PersistencePromise[Unit] = js.native
  def deleteAll(index: String, range: IDBKeyRange): PersistencePromise[Unit] = js.native
  def deleteAll(range: IDBKeyRange): PersistencePromise[Unit] = js.native
  /**
    * Gets the object with the specified key from the specified store, or null
    * if no object exists with the specified key.
    *
    * @key The key of the object to get.
    * @return The object with the specified key or null if no object exists.
    */
  def get(key: KeyType): PersistencePromise[ValueType | Null] = js.native
  /**
    * Iterates over keys and values in an object store.
    *
    * @param options Options specifying how to iterate the objects in the store.
    * @param callback will be called for each iterated object. Iteration can be
    * canceled at any point by calling the doneFn passed to the callback.
    * The callback can return a PersistencePromise if it performs async
    * operations but note that iteration will continue without waiting for them
    * to complete.
    * @returns A PersistencePromise that resolves once all PersistencePromises
    * returned by callbacks resolve.
    */
  def iterate(callback: IterateCallback[KeyType, ValueType]): PersistencePromise[Unit] = js.native
  def iterate(options: IterateOptions, callback: IterateCallback[KeyType, ValueType]): PersistencePromise[Unit] = js.native
  /**
    * Iterates over a store, but waits for the given callback to complete for
    * each entry before iterating the next entry. This allows the callback to do
    * asynchronous work to determine if this iteration should continue.
    *
    * The provided callback should return `true` to continue iteration, and
    * `false` otherwise.
    */
  def iterateSerial(callback: js.Function2[/* k */ KeyType, /* v */ ValueType, PersistencePromise[Boolean]]): PersistencePromise[Unit] = js.native
  def loadAll(): PersistencePromise[js.Array[ValueType]] = js.native
  def loadAll(index: String, range: IDBKeyRange): PersistencePromise[js.Array[ValueType]] = js.native
  def loadAll(range: IDBKeyRange): PersistencePromise[js.Array[ValueType]] = js.native
  def put(key: KeyType, value: ValueType): PersistencePromise[Unit] = js.native
  /**
    * Writes a value into the Object Store.
    *
    * @param key Optional explicit key to use when writing the object, else the
    * key will be auto-assigned (e.g. via the defined keyPath for the store).
    * @param value The object to write.
    */
  def put(value: ValueType): PersistencePromise[Unit] = js.native
}

