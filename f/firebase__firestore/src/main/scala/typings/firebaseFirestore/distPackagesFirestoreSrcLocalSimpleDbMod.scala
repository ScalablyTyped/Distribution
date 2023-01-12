package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError
import typings.std.IDBCursorWithValue
import typings.std.IDBDatabase
import typings.std.IDBKeyRange
import typings.std.IDBObjectStore
import typings.std.IDBTransaction
import typings.std.IDBTransactionMode
import typings.std.IDBValidKey
import typings.std.IDBVersionChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalSimpleDbMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "IndexedDbTransactionError")
  @js.native
  open class IndexedDbTransactionError protected () extends FirestoreError {
    def this(actionName: String, cause: String) = this()
    def this(actionName: String, cause: js.Error) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "IterationController")
  @js.native
  open class IterationController protected () extends StObject {
    def this(dbCursor: IDBCursorWithValue) = this()
    
    def cursor_=(value: IDBCursorWithValue): Unit = js.native
    
    /* private */ var dbCursor: Any = js.native
    
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
    
    /* private */ var nextKey: Any = js.native
    
    /* private */ var shouldStop: Any = js.native
    
    /**
      * This function can be called to skip to that next key, which could be
      * an index or a primary key.
      */
    def skip(key: IDBValidKey): Unit = js.native
    
    def skipToKey: IDBValidKey | Null = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "SimpleDb")
  @js.native
  open class SimpleDb protected () extends StObject {
    def this(name: String, version: Double, schemaConverter: SimpleDbSchemaConverter) = this()
    
    def close(): Unit = js.native
    
    /* private */ var db: Any = js.native
    
    /**
      * Opens the specified database, creating or upgrading it if necessary.
      */
    def ensureDb(action: String): js.Promise[IDBDatabase] = js.native
    
    /* private */ val name: Any = js.native
    
    def runTransaction[T](
      action: String,
      mode: SimpleDbTransactionMode,
      objectStores: js.Array[String],
      transactionFn: js.Function1[/* transaction */ SimpleDbTransaction, PersistencePromise[T]]
    ): js.Promise[T] = js.native
    
    /* private */ val schemaConverter: Any = js.native
    
    def setVersionChangeListener(versionChangeListener: js.Function1[/* event */ IDBVersionChangeEvent, Unit]): Unit = js.native
    
    /* private */ val version: Any = js.native
    
    /* private */ var versionchangelistener: Any = js.native
  }
  /* static members */
  object SimpleDb {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "SimpleDb")
    @js.native
    val ^ : js.Any = js.native
    
    /** Deletes the specified database. */
    inline def delete(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /** Parse User Agent to determine Android version. Returns -1 if not found. */
    inline def getAndroidVersion(ua: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidVersion")(ua.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** Parse User Agent to determine iOS version. Returns -1 if not found. */
    inline def getIOSVersion(ua: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getIOSVersion")(ua.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** Helper to get a typed SimpleDbStore from a transaction. */
    inline def getStore[KeyType /* <: IDBValidKey */, ValueType /* <: Any */](txn: SimpleDbTransaction, store: String): SimpleDbStore[KeyType, ValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStore")(txn.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[SimpleDbStore[KeyType, ValueType]]
    
    /** Returns true if IndexedDB is available in the current environment. */
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
    
    /**
      * Returns true if the backing IndexedDB store is the Node IndexedDBShim
      * (see https://github.com/axemclion/IndexedDBShim).
      */
    inline def isMockPersistence(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMockPersistence")().asInstanceOf[Boolean]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "SimpleDbStore")
  @js.native
  open class SimpleDbStore[KeyType /* <: IDBValidKey */, ValueType /* <: Any */] protected () extends StObject {
    def this(store: IDBObjectStore) = this()
    
    /**
      * Adds a new value into an Object Store and returns the new key. Similar to
      * IndexedDb's `add()`, this method will fail on primary key collisions.
      *
      * @param value - The object to write.
      * @returns The key of the value to add.
      */
    def add(value: ValueType): PersistencePromise[KeyType] = js.native
    
    /**
      * If we ever need more of the count variants, we can add overloads. For now,
      * all we need is to count everything in a store.
      *
      * Returns the number of rows in the store.
      */
    def count(): PersistencePromise[Double] = js.native
    
    /* private */ var cursor: Any = js.native
    
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
      * @returns The object with the specified key or null if no object exists.
      */
    def get(key: KeyType): PersistencePromise[ValueType | Null] = js.native
    
    /**
      * Iterates over keys and values in an object store.
      *
      * @param options - Options specifying how to iterate the objects in the
      * store.
      * @param callback - will be called for each iterated object. Iteration can be
      * canceled at any point by calling the doneFn passed to the callback.
      * The callback can return a PersistencePromise if it performs async
      * operations but note that iteration will continue without waiting for them
      * to complete.
      * @returns A PersistencePromise that resolves once all PersistencePromises
      * returned by callbacks resolve.
      */
    def iterate(callback: IterateCallback[KeyType, ValueType]): PersistencePromise[Unit] = js.native
    def iterate(options: IterateOptions, callback: IterateCallback[KeyType, ValueType]): PersistencePromise[Unit] = js.native
    
    /* private */ var iterateCursor: Any = js.native
    
    /**
      * Iterates over a store, but waits for the given callback to complete for
      * each entry before iterating the next entry. This allows the callback to do
      * asynchronous work to determine if this iteration should continue.
      *
      * The provided callback should return `true` to continue iteration, and
      * `false` otherwise.
      */
    def iterateSerial(callback: js.Function2[/* k */ KeyType, /* v */ ValueType, PersistencePromise[Boolean]]): PersistencePromise[Unit] = js.native
    
    /** Loads all elements from the object store. */
    def loadAll(): PersistencePromise[js.Array[ValueType]] = js.native
    /** Loads all elements ordered by the given index. */
    def loadAll(index: String): PersistencePromise[js.Array[ValueType]] = js.native
    /**
      * Loads all elements from the object store that fall into the provided in the
      * index range for the given index.
      */
    def loadAll(index: String, range: IDBKeyRange): PersistencePromise[js.Array[ValueType]] = js.native
    /** Loads all elements for the index range from the object store. */
    def loadAll(range: IDBKeyRange): PersistencePromise[js.Array[ValueType]] = js.native
    
    /**
      * Loads the first `count` elements from the provided index range. Loads all
      * elements if no limit is provided.
      */
    def loadFirst(range: IDBKeyRange): PersistencePromise[js.Array[ValueType]] = js.native
    def loadFirst(range: IDBKeyRange, count: Double): PersistencePromise[js.Array[ValueType]] = js.native
    
    /* private */ var options: Any = js.native
    
    def put(key: KeyType, value: ValueType): PersistencePromise[Unit] = js.native
    /**
      * Writes a value into the Object Store.
      *
      * @param key - Optional explicit key to use when writing the object, else the
      * key will be auto-assigned (e.g. via the defined keyPath for the store).
      * @param value - The object to write.
      */
    def put(value: ValueType): PersistencePromise[Unit] = js.native
    
    /* private */ var store: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "SimpleDbTransaction")
  @js.native
  open class SimpleDbTransaction protected () extends StObject {
    def this(action: String, transaction: IDBTransaction) = this()
    
    def abort(): Unit = js.native
    def abort(error: js.Error): Unit = js.native
    
    /* private */ var aborted: Any = js.native
    
    /* private */ val action: Any = js.native
    
    /**
      * A `Promise` that resolves with the result of the IndexedDb transaction.
      */
    /* private */ val completionDeferred: Any = js.native
    
    def completionPromise: js.Promise[Unit] = js.native
    
    def maybeCommit(): Unit = js.native
    
    /**
      * Returns a SimpleDbStore<KeyType, ValueType> for the specified store. All
      * operations performed on the SimpleDbStore happen within the context of this
      * transaction and it cannot be used anymore once the transaction is
      * completed.
      *
      * Note that we can't actually enforce that the KeyType and ValueType are
      * correct, but they allow type safety through the rest of the consuming code.
      */
    def store[KeyType /* <: IDBValidKey */, ValueType /* <: Any */](storeName: String): SimpleDbStore[KeyType, ValueType] = js.native
    
    /* private */ val transaction: Any = js.native
  }
  /* static members */
  object SimpleDbTransaction {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "SimpleDbTransaction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def open(db: IDBDatabase, action: String, mode: IDBTransactionMode, objectStoreNames: js.Array[String]): SimpleDbTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(db.asInstanceOf[js.Any], action.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], objectStoreNames.asInstanceOf[js.Any])).asInstanceOf[SimpleDbTransaction]
  }
  
  inline def isIndexedDbTransactionError(e: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedDbTransactionError")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type IterateCallback[KeyType, ValueType] = js.Function3[
    /* key */ KeyType, 
    /* value */ ValueType, 
    /* control */ IterationController, 
    Unit | PersistencePromise[Unit]
  ]
  
  trait IterateOptions extends StObject {
    
    /** Index to iterate over (else primary keys will be iterated) */
    var index: js.UndefOr[String] = js.undefined
    
    /** If true, values aren't read while iterating. */
    var keysOnly: js.UndefOr[Boolean] = js.undefined
    
    /** IndxedDB Range to iterate over (else entire store will be iterated) */
    var range: js.UndefOr[IDBKeyRange] = js.undefined
    
    /** If true, iterate over the store in reverse. */
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object IterateOptions {
    
    inline def apply(): IterateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IterateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IterateOptions] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKeysOnly(value: Boolean): Self = StObject.set(x, "keysOnly", value.asInstanceOf[js.Any])
      
      inline def setKeysOnlyUndefined: Self = StObject.set(x, "keysOnly", js.undefined)
      
      inline def setRange(value: IDBKeyRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait SimpleDbSchemaConverter extends StObject {
    
    def createOrUpgrade(db: IDBDatabase, txn: IDBTransaction, fromVersion: Double, toVersion: Double): PersistencePromise[Unit]
  }
  object SimpleDbSchemaConverter {
    
    inline def apply(createOrUpgrade: (IDBDatabase, IDBTransaction, Double, Double) => PersistencePromise[Unit]): SimpleDbSchemaConverter = {
      val __obj = js.Dynamic.literal(createOrUpgrade = js.Any.fromFunction4(createOrUpgrade))
      __obj.asInstanceOf[SimpleDbSchemaConverter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleDbSchemaConverter] (val x: Self) extends AnyVal {
      
      inline def setCreateOrUpgrade(value: (IDBDatabase, IDBTransaction, Double, Double) => PersistencePromise[Unit]): Self = StObject.set(x, "createOrUpgrade", js.Any.fromFunction4(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.readonly
    - typings.firebaseFirestore.firebaseFirestoreStrings.readwrite
  */
  trait SimpleDbTransactionMode extends StObject
  object SimpleDbTransactionMode {
    
    inline def readonly: typings.firebaseFirestore.firebaseFirestoreStrings.readonly = "readonly".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.readonly]
    
    inline def readwrite: typings.firebaseFirestore.firebaseFirestoreStrings.readwrite = "readwrite".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.readwrite]
  }
}
