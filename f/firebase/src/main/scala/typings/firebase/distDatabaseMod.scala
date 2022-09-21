package typings.firebase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseDatabase.anon.MockUserToken
import typings.firebaseDatabase.mod.DatabaseReference
import typings.firebaseDatabase.mod.EventType
import typings.firebaseDatabase.mod.ListenOptions
import typings.firebaseDatabase.mod.Query_
import typings.firebaseDatabase.mod.ThenableReference
import typings.firebaseDatabase.mod.TransactionOptions
import typings.firebaseDatabase.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatabaseMod {
  
  @JSImport("firebase/app-check/dist/database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/app-check/dist/database", "DataSnapshot")
  @js.native
  /* private */ open class DataSnapshot ()
    extends typings.firebaseDatabase.mod.DataSnapshot
  
  @JSImport("firebase/app-check/dist/database", "Database")
  @js.native
  /* private */ open class Database ()
    extends typings.firebaseDatabase.mod.Database
  
  @JSImport("firebase/app-check/dist/database", "OnDisconnect")
  @js.native
  /* private */ open class OnDisconnect_ ()
    extends typings.firebaseDatabase.mod.OnDisconnect_
  
  @JSImport("firebase/app-check/dist/database", "QueryConstraint")
  @js.native
  abstract class QueryConstraint ()
    extends typings.firebaseDatabase.mod.QueryConstraint
  
  @JSImport("firebase/app-check/dist/database", "TransactionResult")
  @js.native
  /* private */ open class TransactionResult ()
    extends typings.firebaseDatabase.mod.TransactionResult
  
  inline def child(parent: DatabaseReference, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("child")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def connectDatabaseEmulator(db: typings.firebaseDatabase.mod.Database, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectDatabaseEmulator(db: typings.firebaseDatabase.mod.Database, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLogging(enabled: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(enabled: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* message */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def endAt(): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")().asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: String): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: String, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Boolean): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Boolean, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Double): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Double, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Null, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def endBefore(): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")().asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: String): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: String, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Boolean): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Boolean, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Double): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Double, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Null, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def equalTo(): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")().asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: String): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: String, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Boolean): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Boolean, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Double): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Double, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Null, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def forceLongPolling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLongPolling")().asInstanceOf[Unit]
  
  inline def forceWebSockets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceWebSockets")().asInstanceOf[Unit]
  
  inline def get(query: Query_): js.Promise[typings.firebaseDatabase.mod.DataSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseDatabase.mod.DataSnapshot]]
  
  inline def getDatabase(): typings.firebaseDatabase.mod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")().asInstanceOf[typings.firebaseDatabase.mod.Database]
  inline def getDatabase(app: Unit, url: String): typings.firebaseDatabase.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.Database]
  inline def getDatabase(app: FirebaseApp): typings.firebaseDatabase.mod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.Database]
  inline def getDatabase(app: FirebaseApp, url: String): typings.firebaseDatabase.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.Database]
  
  inline def goOffline(db: typings.firebaseDatabase.mod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOffline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goOnline(db: typings.firebaseDatabase.mod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOnline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def increment(delta: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(delta.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def limitToFirst(limit: Double): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToFirst")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def off(query: Query_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(
    query: Query_,
    eventType: Unit,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(query: Query_, eventType: EventType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    query: Query_,
    eventType: EventType,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onDisconnect(ref: DatabaseReference): typings.firebaseDatabase.mod.OnDisconnect_ = ^.asInstanceOf[js.Dynamic].applyDynamic("onDisconnect")(ref.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.OnDisconnect_]
  
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.mod.DataSnapshot, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderByChild(path: String): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByChild")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def orderByKey(): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByKey")().asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def orderByPriority(): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByPriority")().asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def orderByValue(): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByValue")().asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def push(parent: DatabaseReference): ThenableReference = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any]).asInstanceOf[ThenableReference]
  inline def push(parent: DatabaseReference, value: Any): ThenableReference = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ThenableReference]
  
  inline def query(query: Query_, queryConstraints: typings.firebaseDatabase.mod.QueryConstraint*): Query_ = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query_]
  
  inline def ref(db: typings.firebaseDatabase.mod.Database): DatabaseReference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any]).asInstanceOf[DatabaseReference]
  inline def ref(db: typings.firebaseDatabase.mod.Database, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def refFromURL(db: typings.firebaseDatabase.mod.Database, url: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("refFromURL")(db.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def remove(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def runTransaction(ref: DatabaseReference, transactionUpdate: js.Function1[/* currentData */ Any, Any]): js.Promise[typings.firebaseDatabase.mod.TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.firebaseDatabase.mod.TransactionResult]]
  inline def runTransaction(
    ref: DatabaseReference,
    transactionUpdate: js.Function1[/* currentData */ Any, Any],
    options: TransactionOptions
  ): js.Promise[typings.firebaseDatabase.mod.TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.firebaseDatabase.mod.TransactionResult]]
  
  inline def serverTimestamp(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[js.Object]
  
  inline def set(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPriority(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setWithPriority(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startAfter(): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")().asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: String): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: String, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Boolean): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Boolean, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Double): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Double, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Null, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def startAt(): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")().asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: String): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: String, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Boolean): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Boolean, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Double): typings.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Double, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Null, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Unit, key: String): typings.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.mod.QueryConstraint]
  
  inline def update(ref: DatabaseReference, values: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
