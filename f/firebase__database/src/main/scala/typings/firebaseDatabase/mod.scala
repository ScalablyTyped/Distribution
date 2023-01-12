package typings.firebaseDatabase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseDatabase.anon.MockUserToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database", "DataSnapshot")
  @js.native
  /* private */ open class DataSnapshot () extends StObject {
    
    /**
      * Gets another `DataSnapshot` for the location at the specified relative path.
      *
      * Passing a relative path to the `child()` method of a DataSnapshot returns
      * another `DataSnapshot` for the location at the specified relative path. The
      * relative path can either be a simple child name (for example, "ada") or a
      * deeper, slash-separated path (for example, "ada/name/first"). If the child
      * location has no data, an empty `DataSnapshot` (that is, a `DataSnapshot`
      * whose value is `null`) is returned.
      *
      * @param path - A relative path to the location of child data.
      */
    def child(path: String): DataSnapshot = js.native
    
    /**
      * Returns true if this `DataSnapshot` contains any data. It is slightly more
      * efficient than using `snapshot.val() !== null`.
      */
    def exists(): Boolean = js.native
    
    /**
      * Exports the entire contents of the DataSnapshot as a JavaScript object.
      *
      * The `exportVal()` method is similar to `val()`, except priority information
      * is included (if available), making it suitable for backing up your data.
      *
      * @returns The DataSnapshot's contents as a JavaScript value (Object,
      *   Array, string, number, boolean, or `null`).
      */
    def exportVal(): Any = js.native
    
    /**
      * Enumerates the top-level children in the `DataSnapshot`.
      *
      * Because of the way JavaScript objects work, the ordering of data in the
      * JavaScript object returned by `val()` is not guaranteed to match the
      * ordering on the server nor the ordering of `onChildAdded()` events. That is
      * where `forEach()` comes in handy. It guarantees the children of a
      * `DataSnapshot` will be iterated in their query order.
      *
      * If no explicit `orderBy*()` method is used, results are returned
      * ordered by key (unless priorities are used, in which case, results are
      * returned by priority).
      *
      * @param action - A function that will be called for each child DataSnapshot.
      * The callback can return true to cancel further enumeration.
      * @returns true if enumeration was canceled due to your callback returning
      * true.
      */
    def forEach(action: js.Function1[/* child */ this.type, Boolean | Unit]): Boolean = js.native
    
    /**
      * Returns true if the specified child path has (non-null) data.
      *
      * @param path - A relative path to the location of a potential child.
      * @returns `true` if data exists at the specified child path; else
      *  `false`.
      */
    def hasChild(path: String): Boolean = js.native
    
    /**
      * Returns whether or not the `DataSnapshot` has any non-`null` child
      * properties.
      *
      * You can use `hasChildren()` to determine if a `DataSnapshot` has any
      * children. If it does, you can enumerate them using `forEach()`. If it
      * doesn't, then either this snapshot contains a primitive value (which can be
      * retrieved with `val()`) or it is empty (in which case, `val()` will return
      * `null`).
      *
      * @returns true if this snapshot has any children; else false.
      */
    def hasChildren(): Boolean = js.native
    
    /**
      * The key (last part of the path) of the location of this `DataSnapshot`.
      *
      * The last token in a Database location is considered its key. For example,
      * "ada" is the key for the /users/ada/ node. Accessing the key on any
      * `DataSnapshot` will return the key for the location that generated it.
      * However, accessing the key on the root URL of a Database will return
      * `null`.
      */
    def key: String | Null = js.native
    
    /**
      * Gets the priority value of the data in this `DataSnapshot`.
      *
      * Applications need not use priority but can order collections by
      * ordinary properties (see
      * {@link https://firebase.google.com/docs/database/web/lists-of-data#sorting_and_filtering_data |Sorting and filtering data}
      * ).
      */
    def priority: String | Double | Null = js.native
    
    /**
      * The location of this DataSnapshot.
      */
    val ref: DatabaseReference = js.native
    
    /** Returns the number of child properties of this `DataSnapshot`. */
    def size: Double = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      */
    def toJSON(): js.Object | Null = js.native
    
    /**
      * Extracts a JavaScript value from a `DataSnapshot`.
      *
      * Depending on the data in a `DataSnapshot`, the `val()` method may return a
      * scalar type (string, number, or boolean), an array, or an object. It may
      * also return null, indicating that the `DataSnapshot` is empty (contains no
      * data).
      *
      * @returns The DataSnapshot's contents as a JavaScript value (Object,
      *   Array, string, number, boolean, or `null`).
      */
    def `val`(): Any = js.native
  }
  
  @JSImport("@firebase/database", "Database")
  @js.native
  /* private */ open class Database () extends StObject {
    
    /** The {@link @firebase/app#FirebaseApp} associated with this Realtime Database instance. */
    val app: FirebaseApp = js.native
    
    /** Represents a `Database` instance. */
    val `type`: /* "database" */ String = js.native
  }
  
  @JSImport("@firebase/database", "OnDisconnect")
  @js.native
  /* private */ open class OnDisconnect_ () extends StObject {
    
    /**
      * Cancels all previously queued `onDisconnect()` set or update events for this
      * location and all children.
      *
      * If a write has been queued for this location via a `set()` or `update()` at a
      * parent location, the write at this location will be canceled, though writes
      * to sibling locations will still occur.
      *
      * @returns Resolves when synchronization to the server is complete.
      */
    def cancel(): js.Promise[Unit] = js.native
    
    /**
      * Ensures the data at this location is deleted when the client is disconnected
      * (due to closing the browser, navigating to a new page, or network issues).
      *
      * @returns Resolves when synchronization to the server is complete.
      */
    def remove(): js.Promise[Unit] = js.native
    
    /**
      * Ensures the data at this location is set to the specified value when the
      * client is disconnected (due to closing the browser, navigating to a new page,
      * or network issues).
      *
      * `set()` is especially useful for implementing "presence" systems, where a
      * value should be changed or cleared when a user disconnects so that they
      * appear "offline" to other users. See
      * {@link https://firebase.google.com/docs/database/web/offline-capabilities | Enabling Offline Capabilities in JavaScript}
      * for more information.
      *
      * Note that `onDisconnect` operations are only triggered once. If you want an
      * operation to occur each time a disconnect occurs, you'll need to re-establish
      * the `onDisconnect` operations each time.
      *
      * @param value - The value to be written to this location on disconnect (can
      * be an object, array, string, number, boolean, or null).
      * @returns Resolves when synchronization to the Database is complete.
      */
    def set(value: Any): js.Promise[Unit] = js.native
    
    /**
      * Ensures the data at this location is set to the specified value and priority
      * when the client is disconnected (due to closing the browser, navigating to a
      * new page, or network issues).
      *
      * @param value - The value to be written to this location on disconnect (can
      * be an object, array, string, number, boolean, or null).
      * @param priority - The priority to be written (string, number, or null).
      * @returns Resolves when synchronization to the Database is complete.
      */
    def setWithPriority(value: Any): js.Promise[Unit] = js.native
    def setWithPriority(value: Any, priority: String): js.Promise[Unit] = js.native
    def setWithPriority(value: Any, priority: Double): js.Promise[Unit] = js.native
    
    /**
      * Writes multiple values at this location when the client is disconnected (due
      * to closing the browser, navigating to a new page, or network issues).
      *
      * The `values` argument contains multiple property-value pairs that will be
      * written to the Database together. Each child property can either be a simple
      * property (for example, "name") or a relative path (for example, "name/first")
      * from the current location to the data to update.
      *
      * As opposed to the `set()` method, `update()` can be use to selectively update
      * only the referenced properties at the current location (instead of replacing
      * all the child properties at the current location).
      *
      * @param values - Object containing multiple values.
      * @returns Resolves when synchronization to the Database is complete.
      */
    def update(values: js.Object): js.Promise[Unit] = js.native
  }
  
  /* note: abstract class */ @JSImport("@firebase/database", "QueryConstraint")
  @js.native
  open class QueryConstraint () extends StObject {
    
    /** The type of this query constraints */
    val `type`: QueryConstraintType = js.native
  }
  
  @JSImport("@firebase/database", "TransactionResult")
  @js.native
  /* private */ open class TransactionResult () extends StObject {
    
    /** Whether the transaction was successfully committed. */
    val committed: Boolean = js.native
    
    /** The resulting data snapshot. */
    val snapshot: DataSnapshot = js.native
    
    /** Returns a JSON-serializable representation of this object. */
    def toJSON(): js.Object = js.native
  }
  
  inline def child(parent: DatabaseReference, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("child")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def connectDatabaseEmulator(db: Database, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectDatabaseEmulator(db: Database, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLogging(enabled: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(enabled: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* message */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def endAt(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")().asInstanceOf[QueryConstraint]
  inline def endAt(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endAt(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endAt(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endAt(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endAt(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endAt(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endAt(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def endBefore(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")().asInstanceOf[QueryConstraint]
  inline def endBefore(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endBefore(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def equalTo(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")().asInstanceOf[QueryConstraint]
  inline def equalTo(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def equalTo(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def forceLongPolling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLongPolling")().asInstanceOf[Unit]
  
  inline def forceWebSockets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceWebSockets")().asInstanceOf[Unit]
  
  inline def get(query: Query_): js.Promise[DataSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataSnapshot]]
  
  inline def getDatabase(): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")().asInstanceOf[Database]
  inline def getDatabase(app: Unit, url: String): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def getDatabase(app: FirebaseApp): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def getDatabase(app: FirebaseApp, url: String): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Database]
  
  inline def goOffline(db: Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOffline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goOnline(db: Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOnline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def increment(delta: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(delta.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def limitToFirst(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToFirst")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def limitToLast(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def off(query: Query_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(
    query: Query_,
    eventType: Unit,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(query: Query_, eventType: EventType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    query: Query_,
    eventType: EventType,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildRemoved(query: Query_, callback: js.Function1[/* snapshot */ DataSnapshot, Any]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(query: Query_, callback: js.Function1[/* snapshot */ DataSnapshot, Any], options: ListenOptions): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onDisconnect(ref: DatabaseReference): OnDisconnect_ = ^.asInstanceOf[js.Dynamic].applyDynamic("onDisconnect")(ref.asInstanceOf[js.Any]).asInstanceOf[OnDisconnect_]
  
  inline def onValue(query: Query_, callback: js.Function1[/* snapshot */ DataSnapshot, Any]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(query: Query_, callback: js.Function1[/* snapshot */ DataSnapshot, Any], options: ListenOptions): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderByChild(path: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByChild")(path.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def orderByKey(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByKey")().asInstanceOf[QueryConstraint]
  
  inline def orderByPriority(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByPriority")().asInstanceOf[QueryConstraint]
  
  inline def orderByValue(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByValue")().asInstanceOf[QueryConstraint]
  
  inline def push(parent: DatabaseReference): ThenableReference = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any]).asInstanceOf[ThenableReference]
  inline def push(parent: DatabaseReference, value: Any): ThenableReference = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ThenableReference]
  
  inline def query(query: Query_, queryConstraints: QueryConstraint*): Query_ = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query_]
  
  inline def ref(db: Database): DatabaseReference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any]).asInstanceOf[DatabaseReference]
  inline def ref(db: Database, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def refFromURL(db: Database, url: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("refFromURL")(db.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def remove(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def runTransaction(ref: DatabaseReference, transactionUpdate: js.Function1[/* currentData */ Any, Any]): js.Promise[TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResult]]
  inline def runTransaction(
    ref: DatabaseReference,
    transactionUpdate: js.Function1[/* currentData */ Any, Any],
    options: TransactionOptions
  ): js.Promise[TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResult]]
  
  inline def serverTimestamp(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[js.Object]
  
  inline def set(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPriority(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setWithPriority(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startAfter(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")().asInstanceOf[QueryConstraint]
  inline def startAfter(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAfter(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def startAt(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")().asInstanceOf[QueryConstraint]
  inline def startAt(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAt(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAt(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAt(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAt(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAt(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAt(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAt(value: Unit, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def update(ref: DatabaseReference, values: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @js.native
  trait DatabaseReference
    extends StObject
       with Query_ {
    
    /**
      * The last part of the `DatabaseReference`'s path.
      *
      * For example, `"ada"` is the key for
      * `https://<DATABASE_NAME>.firebaseio.com/users/ada`.
      *
      * The key of a root `DatabaseReference` is `null`.
      */
    val key: String | Null = js.native
    
    /**
      * The parent location of a `DatabaseReference`.
      *
      * The parent of a root `DatabaseReference` is `null`.
      */
    val parent: DatabaseReference | Null = js.native
    
    /** The root `DatabaseReference` of the Database. */
    val root: DatabaseReference = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseDatabase.firebaseDatabaseStrings.value
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_added
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_changed
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_moved
    - typings.firebaseDatabase.firebaseDatabaseStrings.child_removed
  */
  trait EventType extends StObject
  object EventType {
    
    inline def child_added: typings.firebaseDatabase.firebaseDatabaseStrings.child_added = "child_added".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.child_added]
    
    inline def child_changed: typings.firebaseDatabase.firebaseDatabaseStrings.child_changed = "child_changed".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.child_changed]
    
    inline def child_moved: typings.firebaseDatabase.firebaseDatabaseStrings.child_moved = "child_moved".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.child_moved]
    
    inline def child_removed: typings.firebaseDatabase.firebaseDatabaseStrings.child_removed = "child_removed".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.child_removed]
    
    inline def value: typings.firebaseDatabase.firebaseDatabaseStrings.value = "value".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.value]
  }
  
  trait ListenOptions extends StObject {
    
    /** Whether to remove the listener after its first invocation. */
    val onlyOnce: js.UndefOr[Boolean] = js.undefined
  }
  object ListenOptions {
    
    inline def apply(): ListenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListenOptions] (val x: Self) extends AnyVal {
      
      inline def setOnlyOnce(value: Boolean): Self = StObject.set(x, "onlyOnce", value.asInstanceOf[js.Any])
      
      inline def setOnlyOnceUndefined: Self = StObject.set(x, "onlyOnce", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseDatabase.firebaseDatabaseStrings.endAt
    - typings.firebaseDatabase.firebaseDatabaseStrings.endBefore
    - typings.firebaseDatabase.firebaseDatabaseStrings.startAt
    - typings.firebaseDatabase.firebaseDatabaseStrings.startAfter
    - typings.firebaseDatabase.firebaseDatabaseStrings.limitToFirst
    - typings.firebaseDatabase.firebaseDatabaseStrings.limitToLast
    - typings.firebaseDatabase.firebaseDatabaseStrings.orderByChild
    - typings.firebaseDatabase.firebaseDatabaseStrings.orderByKey
    - typings.firebaseDatabase.firebaseDatabaseStrings.orderByPriority
    - typings.firebaseDatabase.firebaseDatabaseStrings.orderByValue
    - typings.firebaseDatabase.firebaseDatabaseStrings.equalTo
  */
  trait QueryConstraintType extends StObject
  object QueryConstraintType {
    
    inline def endAt: typings.firebaseDatabase.firebaseDatabaseStrings.endAt = "endAt".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.endAt]
    
    inline def endBefore: typings.firebaseDatabase.firebaseDatabaseStrings.endBefore = "endBefore".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.endBefore]
    
    inline def equalTo: typings.firebaseDatabase.firebaseDatabaseStrings.equalTo = "equalTo".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.equalTo]
    
    inline def limitToFirst: typings.firebaseDatabase.firebaseDatabaseStrings.limitToFirst = "limitToFirst".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.limitToFirst]
    
    inline def limitToLast: typings.firebaseDatabase.firebaseDatabaseStrings.limitToLast = "limitToLast".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.limitToLast]
    
    inline def orderByChild: typings.firebaseDatabase.firebaseDatabaseStrings.orderByChild = "orderByChild".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.orderByChild]
    
    inline def orderByKey: typings.firebaseDatabase.firebaseDatabaseStrings.orderByKey = "orderByKey".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.orderByKey]
    
    inline def orderByPriority: typings.firebaseDatabase.firebaseDatabaseStrings.orderByPriority = "orderByPriority".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.orderByPriority]
    
    inline def orderByValue: typings.firebaseDatabase.firebaseDatabaseStrings.orderByValue = "orderByValue".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.orderByValue]
    
    inline def startAfter: typings.firebaseDatabase.firebaseDatabaseStrings.startAfter = "startAfter".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.startAfter]
    
    inline def startAt: typings.firebaseDatabase.firebaseDatabaseStrings.startAt = "startAt".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.startAt]
  }
  
  @js.native
  trait Query_ extends StObject {
    
    /**
      * Returns whether or not the current and provided queries represent the same
      * location, have the same query parameters, and are from the same instance of
      * `FirebaseApp`.
      *
      * Two `DatabaseReference` objects are equivalent if they represent the same location
      * and are from the same instance of `FirebaseApp`.
      *
      * Two `Query` objects are equivalent if they represent the same location,
      * have the same query parameters, and are from the same instance of
      * `FirebaseApp`. Equivalent queries share the same sort order, limits, and
      * starting and ending points.
      *
      * @param other - The query to compare against.
      * @returns Whether or not the current and provided queries are equivalent.
      */
    def isEqual(): Boolean = js.native
    def isEqual(other: Query_): Boolean = js.native
    
    /** The `DatabaseReference` for the `Query`'s location. */
    val ref: DatabaseReference = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): String = js.native
  }
  
  /* Inlined parent @firebase/database.@firebase/database.DatabaseReference */
  /* Inlined parent std.Pick<std.Promise<@firebase/database.@firebase/database.DatabaseReference>, 'then' | 'catch'> */
  @js.native
  trait ThenableReference extends StObject {
    
    def `catch`[TResult](): js.Promise[DatabaseReference | TResult] = js.native
    @JSName("catch")
    var catch_Original: js.Function0[js.Promise[DatabaseReference | scala.Nothing]] = js.native
    
    /**
      * Returns whether or not the current and provided queries represent the same
      * location, have the same query parameters, and are from the same instance of
      * `FirebaseApp`.
      *
      * Two `DatabaseReference` objects are equivalent if they represent the same location
      * and are from the same instance of `FirebaseApp`.
      *
      * Two `Query` objects are equivalent if they represent the same location,
      * have the same query parameters, and are from the same instance of
      * `FirebaseApp`. Equivalent queries share the same sort order, limits, and
      * starting and ending points.
      *
      * @param other - The query to compare against.
      * @returns Whether or not the current and provided queries are equivalent.
      */
    def isEqual(): Boolean = js.native
    def isEqual(other: Query_): Boolean = js.native
    
    /**
      * The last part of the `DatabaseReference`'s path.
      *
      * For example, `"ada"` is the key for
      * `https://<DATABASE_NAME>.firebaseio.com/users/ada`.
      *
      * The key of a root `DatabaseReference` is `null`.
      */
    val key: String | Null = js.native
    
    /**
      * The parent location of a `DatabaseReference`.
      *
      * The parent of a root `DatabaseReference` is `null`.
      */
    val parent: DatabaseReference | Null = js.native
    
    /** The `DatabaseReference` for the `Query`'s location. */
    val ref: DatabaseReference = js.native
    
    /** The root `DatabaseReference` of the Database. */
    val root: DatabaseReference = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: js.Function0[js.Promise[DatabaseReference | scala.Nothing]] = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): String = js.native
  }
  
  trait TransactionOptions extends StObject {
    
    /**
      * By default, events are raised each time the transaction update function
      * runs. So if it is run multiple times, you may see intermediate states. You
      * can set this to false to suppress these intermediate states and instead
      * wait until the transaction has completed before events are raised.
      */
    val applyLocally: js.UndefOr[Boolean] = js.undefined
  }
  object TransactionOptions {
    
    inline def apply(): TransactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
      
      inline def setApplyLocally(value: Boolean): Self = StObject.set(x, "applyLocally", value.asInstanceOf[js.Any])
      
      inline def setApplyLocallyUndefined: Self = StObject.set(x, "applyLocally", js.undefined)
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
