package typings.firebaseDatabase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseDatabase.anon.MockUserToken
import typings.firebaseDatabase.eventMod.EventType
import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.onDisconnectMod.OnDisconnect
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.referenceMod.DatabaseReference
import typings.firebaseDatabase.referenceMod.ListenOptions
import typings.firebaseDatabase.referenceMod.Query
import typings.firebaseDatabase.referenceMod.ThenableReference
import typings.firebaseDatabase.referenceMod.Unsubscribe
import typings.firebaseDatabase.repoMod.Repo
import typings.firebaseDatabase.transactionMod.TransactionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexNodeMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/index.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/index.node", "DataSnapshot")
  @js.native
  open class DataSnapshot protected ()
    extends typings.firebaseDatabase.apiMod.DataSnapshot {
    /**
      * @param _node - A SnapshotNode to wrap.
      * @param ref - The location this snapshot came from.
      * @param _index - The iteration order for this snapshot
      * @hideconstructor
      */
    def this(_node: Node, /**
      * The location of this DataSnapshot.
      */
    ref: DatabaseReference, _index: Index) = this()
  }
  
  @JSImport("@firebase/database/dist/node-esm/src/index.node", "Database")
  @js.native
  open class Database protected ()
    extends typings.firebaseDatabase.apiMod.Database {
    /** @hideconstructor */
    def this(
      _repoInternal: Repo,
      /** The {@link @firebase/app#FirebaseApp} associated with this Realtime Database instance. */
    app: FirebaseApp
    ) = this()
  }
  
  @JSImport("@firebase/database/dist/node-esm/src/index.node", "OnDisconnect")
  @js.native
  open class OnDisconnect_ protected ()
    extends typings.firebaseDatabase.apiMod.OnDisconnect_ {
    /** @hideconstructor */
    def this(_repo: Repo, _path: Path) = this()
  }
  
  @JSImport("@firebase/database/dist/node-esm/src/index.node", "QueryConstraint")
  @js.native
  abstract class QueryConstraint ()
    extends typings.firebaseDatabase.apiMod.QueryConstraint
  
  @JSImport("@firebase/database/dist/node-esm/src/index.node", "_QueryImpl")
  @js.native
  open class QueryImpl protected ()
    extends typings.firebaseDatabase.apiMod.QueryImpl {
    /**
      * @hideconstructor
      */
    def this(
      _repo: Repo,
      _path: Path,
      _queryParams: typings.firebaseDatabase.queryParamsMod.QueryParams,
      _orderByCalled: Boolean
    ) = this()
  }
  
  @JSImport("@firebase/database/dist/node-esm/src/index.node", "_QueryParams")
  @js.native
  open class QueryParams ()
    extends typings.firebaseDatabase.apiMod.QueryParams
  
  @JSImport("@firebase/database/dist/node-esm/src/index.node", "_ReferenceImpl")
  @js.native
  open class ReferenceImpl protected ()
    extends typings.firebaseDatabase.apiMod.ReferenceImpl {
    /** @hideconstructor */
    def this(repo: Repo, path: Path) = this()
  }
  
  inline def TESTACCESSForceRestClient(forceRestClient: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_TEST_ACCESS_forceRestClient")(forceRestClient.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def TESTACCESSHijackHash(newHash: js.Function0[String]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_TEST_ACCESS_hijackHash")(newHash.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@firebase/database/dist/node-esm/src/index.node", "TransactionResult")
  @js.native
  open class TransactionResult protected ()
    extends typings.firebaseDatabase.apiMod.TransactionResult {
    /** @hideconstructor */
    def this(
      /** Whether the transaction was successfully committed. */
    committed: Boolean,
      /** The resulting data snapshot. */
    snapshot: typings.firebaseDatabase.referenceImplMod.DataSnapshot
    ) = this()
  }
  
  inline def child(parent: DatabaseReference, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("child")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def connectDatabaseEmulator(db: typings.firebaseDatabase.databaseMod.Database, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectDatabaseEmulator(
    db: typings.firebaseDatabase.databaseMod.Database,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLogging(enabled: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(enabled: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* message */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def endAt(): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")().asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endAt(value: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endAt(value: String, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endAt(value: Boolean): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endAt(value: Boolean, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endAt(value: Double): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endAt(value: Double, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endAt(value: Null, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def endBefore(): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")().asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endBefore(value: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endBefore(value: String, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endBefore(value: Boolean): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endBefore(value: Boolean, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endBefore(value: Double): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endBefore(value: Double, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def endBefore(value: Null, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def equalTo(): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")().asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def equalTo(value: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def equalTo(value: String, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def equalTo(value: Boolean): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def equalTo(value: Boolean, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def equalTo(value: Double): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def equalTo(value: Double, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def equalTo(value: Null, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def forceLongPolling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLongPolling")().asInstanceOf[Unit]
  
  inline def forceWebSockets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceWebSockets")().asInstanceOf[Unit]
  
  inline def get(query: Query): js.Promise[typings.firebaseDatabase.referenceImplMod.DataSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseDatabase.referenceImplMod.DataSnapshot]]
  
  inline def getDatabase(): typings.firebaseDatabase.databaseMod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")().asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def getDatabase(app: Unit, url: String): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def getDatabase(app: FirebaseApp): typings.firebaseDatabase.databaseMod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def getDatabase(app: FirebaseApp, url: String): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  
  inline def goOffline(db: typings.firebaseDatabase.databaseMod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOffline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goOnline(db: typings.firebaseDatabase.databaseMod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOnline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def increment(delta: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(delta.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def limitToFirst(limit: Double): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToFirst")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def off(query: Query): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(
    query: Query,
    eventType: Unit,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(query: Query, eventType: EventType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    query: Query,
    eventType: EventType,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onDisconnect(ref: DatabaseReference): OnDisconnect = ^.asInstanceOf[js.Dynamic].applyDynamic("onDisconnect")(ref.asInstanceOf[js.Any]).asInstanceOf[OnDisconnect]
  
  inline def onValue(
    query: Query,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[/* snapshot */ typings.firebaseDatabase.referenceImplMod.DataSnapshot, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderByChild(path: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByChild")(path.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def orderByKey(): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByKey")().asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def orderByPriority(): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByPriority")().asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def orderByValue(): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByValue")().asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def push(parent: DatabaseReference): ThenableReference = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any]).asInstanceOf[ThenableReference]
  inline def push(parent: DatabaseReference, value: Any): ThenableReference = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ThenableReference]
  
  inline def query(query: Query, queryConstraints: typings.firebaseDatabase.referenceImplMod.QueryConstraint*): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query]
  
  inline def ref(db: typings.firebaseDatabase.databaseMod.Database): DatabaseReference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any]).asInstanceOf[DatabaseReference]
  inline def ref(db: typings.firebaseDatabase.databaseMod.Database, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def refFromURL(db: typings.firebaseDatabase.databaseMod.Database, url: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("refFromURL")(db.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def remove(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def repoManagerDatabaseFromApp(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: String
  ): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: String,
    nodeAdmin: Boolean
  ): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: Unit,
    nodeAdmin: Boolean
  ): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName]
  ): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: String
  ): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: String,
    nodeAdmin: Boolean
  ): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: Unit,
    nodeAdmin: Boolean
  ): typings.firebaseDatabase.databaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.databaseMod.Database]
  
  inline def runTransaction(ref: DatabaseReference, transactionUpdate: js.Function1[/* currentData */ Any, Any]): js.Promise[typings.firebaseDatabase.transactionMod.TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.firebaseDatabase.transactionMod.TransactionResult]]
  inline def runTransaction(
    ref: DatabaseReference,
    transactionUpdate: js.Function1[/* currentData */ Any, Any],
    options: TransactionOptions
  ): js.Promise[typings.firebaseDatabase.transactionMod.TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.firebaseDatabase.transactionMod.TransactionResult]]
  
  inline def serverTimestamp(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[js.Object]
  
  inline def set(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPriority(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setSDKVersion(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setSDKVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setWithPriority(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startAfter(): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")().asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAfter(value: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAfter(value: String, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAfter(value: Boolean): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAfter(value: Boolean, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAfter(value: Double): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAfter(value: Double, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAfter(value: Null, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def startAt(): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")().asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAt(value: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAt(value: String, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAt(value: Boolean): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAt(value: Boolean, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAt(value: Double): typings.firebaseDatabase.referenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAt(value: Double, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAt(value: Null, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  inline def startAt(value: Unit, key: String): typings.firebaseDatabase.referenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseDatabase.referenceImplMod.QueryConstraint]
  
  inline def update(ref: DatabaseReference, values: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def validatePathString(fnName: String, argumentName: String, pathString: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validatePathString")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], pathString.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateWritablePath(fnName: String, path: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateWritablePath")(fnName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
