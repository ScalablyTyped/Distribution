package typings.firebaseDatabaseCompat

import typings.firebaseDatabase.mod.DatabaseReference
import typings.firebaseDatabase.mod.Query_
import typings.firebaseDatabaseCompat.anon.FnCallOnfulfilledOnrejected
import typings.firebaseDatabaseCompat.anon.FnCallOnrejected
import typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database
import typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiOnDisconnectMod.OnDisconnect
import typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiTransactionResultMod.TransactionResult
import typings.firebaseUtil.mod.Compat
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatabaseCompatSrcApiReferenceMod {
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/api/Reference", "DataSnapshot")
  @js.native
  open class DataSnapshot protected ()
    extends StObject
       with Compat[typings.firebaseDatabase.mod.DataSnapshot] {
    def this(_database: Database, _delegate: typings.firebaseDatabase.mod.DataSnapshot) = this()
    
    val _database: Database = js.native
    
    /* CompleteClass */
    var _delegate: typings.firebaseDatabase.mod.DataSnapshot = js.native
    
    /**
      * Returns a DataSnapshot of the specified child node's contents.
      *
      * @param path - Path to a child.
      * @returns DataSnapshot for child node.
      */
    def child(path: String): DataSnapshot = js.native
    
    /**
      * Returns whether the snapshot contains a non-null value.
      *
      * @returns Whether the snapshot contains a non-null value, or is empty.
      */
    def exists(): Boolean = js.native
    
    /**
      * Returns the snapshot contents as JSON, including priorities of node.  Suitable for exporting
      * the entire node contents.
      * @returns JSON representation of the DataSnapshot contents, or null if empty.
      */
    def exportVal(): Any = js.native
    
    /**
      * Iterates through child nodes and calls the specified action for each one.
      *
      * @param action - Callback function to be called
      * for each child.
      * @returns True if forEach was canceled by action returning true for
      * one of the child nodes.
      */
    def forEach(action: js.Function1[/* snapshot */ this.type, Boolean | Unit]): Boolean = js.native
    
    /**
      * Returns the priority of the object, or null if no priority was set.
      *
      * @returns The priority.
      */
    def getPriority(): String | Double | Null = js.native
    
    /**
      * @returns The Firebase reference for the location this snapshot's data came
      * from.
      */
    def getRef(): Reference = js.native
    
    /**
      * Returns whether the snapshot contains a child at the specified path.
      *
      * @param path - Path to a child.
      * @returns Whether the child exists.
      */
    def hasChild(path: String): Boolean = js.native
    
    /**
      * Returns whether this DataSnapshot has children.
      * @returns True if the DataSnapshot contains 1 or more child nodes.
      */
    def hasChildren(): Boolean = js.native
    
    def key: String = js.native
    
    /**
      * Returns the number of children for this DataSnapshot.
      * @returns The number of children that this DataSnapshot contains.
      */
    def numChildren(): Double = js.native
    
    def ref: Reference = js.native
    
    def toJSON(): Any = js.native
    
    /**
      * Retrieves the snapshot contents as JSON.  Returns null if the snapshot is
      * empty.
      *
      * @returns JSON representation of the DataSnapshot contents, or null if empty.
      */
    def `val`(): Any = js.native
  }
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/api/Reference", "Query")
  @js.native
  open class Query protected ()
    extends StObject
       with Compat[Query_] {
    def this(database: Database, _delegate: Query_) = this()
    
    /* CompleteClass */
    var _delegate: Query_ = js.native
    
    val database: Database = js.native
    
    def endAt(): Query = js.native
    def endAt(value: String): Query = js.native
    def endAt(value: String, name: String): Query = js.native
    def endAt(value: Boolean): Query = js.native
    def endAt(value: Boolean, name: String): Query = js.native
    def endAt(value: Double): Query = js.native
    def endAt(value: Double, name: String): Query = js.native
    def endAt(value: Null, name: String): Query = js.native
    def endAt(value: Unit, name: String): Query = js.native
    
    def endBefore(): Query = js.native
    def endBefore(value: String): Query = js.native
    def endBefore(value: String, name: String): Query = js.native
    def endBefore(value: Boolean): Query = js.native
    def endBefore(value: Boolean, name: String): Query = js.native
    def endBefore(value: Double): Query = js.native
    def endBefore(value: Double, name: String): Query = js.native
    def endBefore(value: Null, name: String): Query = js.native
    def endBefore(value: Unit, name: String): Query = js.native
    
    /**
      * Load the selection of children with exactly the specified value, and, optionally,
      * the specified name.
      */
    def equalTo(): Query = js.native
    def equalTo(value: String): Query = js.native
    def equalTo(value: String, name: String): Query = js.native
    def equalTo(value: Boolean): Query = js.native
    def equalTo(value: Boolean, name: String): Query = js.native
    def equalTo(value: Double): Query = js.native
    def equalTo(value: Double, name: String): Query = js.native
    def equalTo(value: Null, name: String): Query = js.native
    
    /**
      * Get the server-value for this query, or return a cached value if not connected.
      */
    def get(): js.Promise[DataSnapshot] = js.native
    
    /**
      * Return true if this query and the provided query are equivalent; otherwise, return false.
      */
    def isEqual(other: Query): Boolean = js.native
    
    /**
      * Set a limit and anchor it to the start of the window.
      */
    def limitToFirst(limit: Double): Query = js.native
    
    /**
      * Set a limit and anchor it to the end of the window.
      */
    def limitToLast(limit: Double): Query = js.native
    
    def off(): Unit = js.native
    def off(eventType: String): Unit = js.native
    def off(eventType: String, callback: Unit, context: js.Object): Unit = js.native
    def off(eventType: String, callback: SnapshotCallback): Unit = js.native
    def off(eventType: String, callback: SnapshotCallback, context: js.Object): Unit = js.native
    def off(eventType: Unit, callback: Unit, context: js.Object): Unit = js.native
    def off(eventType: Unit, callback: SnapshotCallback): Unit = js.native
    def off(eventType: Unit, callback: SnapshotCallback, context: js.Object): Unit = js.native
    
    def on(eventType: String, callback: SnapshotCallback): SnapshotCallback = js.native
    def on(
      eventType: String,
      callback: SnapshotCallback,
      cancelCallbackOrContext: js.Function1[/* a */ js.Error, Any]
    ): SnapshotCallback = js.native
    def on(
      eventType: String,
      callback: SnapshotCallback,
      cancelCallbackOrContext: js.Function1[/* a */ js.Error, Any],
      context: js.Object
    ): SnapshotCallback = js.native
    def on(eventType: String, callback: SnapshotCallback, cancelCallbackOrContext: js.Object): SnapshotCallback = js.native
    def on(
      eventType: String,
      callback: SnapshotCallback,
      cancelCallbackOrContext: js.Object,
      context: js.Object
    ): SnapshotCallback = js.native
    def on(eventType: String, callback: SnapshotCallback, cancelCallbackOrContext: Null, context: js.Object): SnapshotCallback = js.native
    def on(eventType: String, callback: SnapshotCallback, cancelCallbackOrContext: Unit, context: js.Object): SnapshotCallback = js.native
    
    /**
      * Attaches a listener, waits for the first event, and then removes the listener
      */
    def once(eventType: String): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, callback: Unit, failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      callback: Unit,
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, callback: Unit, failureCallbackOrContext: js.Object): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, callback: Unit, failureCallbackOrContext: js.Object, context: js.Object): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, callback: Unit, failureCallbackOrContext: Null, context: js.Object): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, callback: Unit, failureCallbackOrContext: Unit, context: js.Object): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, callback: SnapshotCallback): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      callback: SnapshotCallback,
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      callback: SnapshotCallback,
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, callback: SnapshotCallback, failureCallbackOrContext: js.Object): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      callback: SnapshotCallback,
      failureCallbackOrContext: js.Object,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, callback: SnapshotCallback, failureCallbackOrContext: Null, context: js.Object): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, callback: SnapshotCallback, failureCallbackOrContext: Unit, context: js.Object): js.Promise[DataSnapshot] = js.native
    
    /**
      * Given a child path, return a new query ordered by the specified grandchild path.
      */
    def orderByChild(path: String): Query = js.native
    
    /**
      * Return a new query ordered by the KeyIndex
      */
    def orderByKey(): Query = js.native
    
    /**
      * Return a new query ordered by the PriorityIndex
      */
    def orderByPriority(): Query = js.native
    
    /**
      * Return a new query ordered by the ValueIndex
      */
    def orderByValue(): Query = js.native
    
    def ref: Reference = js.native
    
    def startAfter(): Query = js.native
    def startAfter(value: String): Query = js.native
    def startAfter(value: String, name: String): Query = js.native
    def startAfter(value: Boolean): Query = js.native
    def startAfter(value: Boolean, name: String): Query = js.native
    def startAfter(value: Double): Query = js.native
    def startAfter(value: Double, name: String): Query = js.native
    def startAfter(value: Null, name: String): Query = js.native
    def startAfter(value: Unit, name: String): Query = js.native
    
    def startAt(): Query = js.native
    def startAt(value: String): Query = js.native
    def startAt(value: String, name: String): Query = js.native
    def startAt(value: Boolean): Query = js.native
    def startAt(value: Boolean, name: String): Query = js.native
    def startAt(value: Double): Query = js.native
    def startAt(value: Double, name: String): Query = js.native
    def startAt(value: Null, name: String): Query = js.native
    def startAt(value: Unit, name: String): Query = js.native
    
    def toJSON(): String = js.native
  }
  /* static members */
  object Query {
    
    @JSImport("@firebase/database-compat/dist/database-compat/src/api/Reference", "Query")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper used by .on and .once to extract the context and or cancel arguments.
      * @param fnName - The function name (on or once)
      *
      */
    @JSImport("@firebase/database-compat/dist/database-compat/src/api/Reference", "Query.getCancelAndContextArgs_")
    @js.native
    def getCancelAndContextArgs_ : Any = js.native
    inline def getCancelAndContextArgs__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCancelAndContextArgs_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/api/Reference", "Reference")
  @js.native
  open class Reference protected () extends Query {
    /**
      * Call options:
      *   new Reference(Repo, Path) or
      *   new Reference(url: string, string|RepoManager)
      *
      * Externally - this is the firebase.database.Reference type.
      */
    def this(database: Database, _delegate: DatabaseReference) = this()
    
    @JSName("_delegate")
    val _delegate_Reference: DatabaseReference = js.native
    
    def `catch`[TResult](): js.Promise[Reference | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[Reference | TResult] = js.native
    @JSName("catch")
    var catch_Original: FnCallOnrejected = js.native
    
    def child(pathString: String): Reference = js.native
    
    /** @returns {?string} */
    def getKey(): String | Null = js.native
    
    /** @returns {?Reference} */
    def getParent(): Reference | Null = js.native
    
    /** @returns {!Reference} */
    def getRoot(): Reference = js.native
    
    def key: String | Null = js.native
    
    def onDisconnect(): OnDisconnect = js.native
    
    def parent: Reference | Null = js.native
    
    def push(): Reference = js.native
    def push(value: Any): Reference = js.native
    def push(value: Any, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): Reference = js.native
    def push(value: Unit, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): Reference = js.native
    
    def remove(): js.Promise[Unit] = js.native
    def remove(onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def root: Reference = js.native
    
    def set(newVal: Any): js.Promise[Unit] = js.native
    def set(newVal: Any, onComplete: js.Function1[/* error */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def setPriority(): js.Promise[Unit] = js.native
    def setPriority(priority: String): js.Promise[Unit] = js.native
    def setPriority(priority: String, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setPriority(priority: Double): js.Promise[Unit] = js.native
    def setPriority(priority: Double, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setPriority(priority: Null, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def setWithPriority(newVal: Any): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: String): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: String, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: Double): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: Double, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: Null, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Reference, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Reference, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: FnCallOnfulfilledOnrejected = js.native
    
    def transaction(transactionUpdate: js.Function1[/* currentData */ Any, Any]): js.Promise[TransactionResult] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* currentData */ Any, Any],
      onComplete: js.Function3[
          /* error */ js.Error | Null, 
          /* committed */ Boolean, 
          /* dataSnapshot */ DataSnapshot | Null, 
          Unit
        ]
    ): js.Promise[TransactionResult] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* currentData */ Any, Any],
      onComplete: js.Function3[
          /* error */ js.Error | Null, 
          /* committed */ Boolean, 
          /* dataSnapshot */ DataSnapshot | Null, 
          Unit
        ],
      applyLocally: Boolean
    ): js.Promise[TransactionResult] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* currentData */ Any, Any],
      onComplete: Unit,
      applyLocally: Boolean
    ): js.Promise[TransactionResult] = js.native
    
    def update(values: js.Object): js.Promise[Unit] = js.native
    def update(values: js.Object, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  }
  
  type SnapshotCallback = js.Function2[
    /* dataSnapshot */ DataSnapshot, 
    /* previousChildName */ js.UndefOr[String | Null], 
    Any
  ]
}
