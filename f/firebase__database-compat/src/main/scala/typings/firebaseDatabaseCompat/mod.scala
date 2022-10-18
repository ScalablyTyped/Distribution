package typings.firebaseDatabaseCompat

import typings.firebaseDatabase.mod.DataSnapshot
import typings.firebaseDatabase.mod.Database
import typings.firebaseDatabase.mod.DatabaseReference
import typings.firebaseDatabase.mod.EventType
import typings.firebaseDatabase.mod.ListenOptions
import typings.firebaseDatabase.mod.OnDisconnect_
import typings.firebaseDatabase.mod.QueryConstraint
import typings.firebaseDatabase.mod.Query_
import typings.firebaseDatabase.mod.ThenableReference
import typings.firebaseDatabase.mod.TransactionOptions
import typings.firebaseDatabase.mod.TransactionResult
import typings.firebaseDatabase.mod.Unsubscribe
import typings.firebaseDatabaseCompat.anon.Call
import typings.firebaseDatabaseCompat.anon.`0`
import typings.firebaseDatabaseCompat.appCompatMod.FirebaseApp
import typings.firebaseDatabaseCompat.appCompatMod.FirebaseNamespace
import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import typings.firebaseDatabaseTypes.mod.Query
import typings.firebaseDatabaseTypes.mod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/database-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object firebaseDatabaseAugmentingMod {
    
    @JSImport("@firebase/database", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def child(parent: Reference, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("child")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
    
    inline def connectDatabaseEmulator(db: FirebaseDatabase, host: String, port: Double, options: js.UndefOr[`0`]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def get(query: Query): js.Promise[DataSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataSnapshot]]
    
    inline def getDatabase(app: js.UndefOr[FirebaseApp], url: js.UndefOr[String]): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Database]
    
    inline def goOffline(db: FirebaseDatabase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOffline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def goOnline(db: FirebaseDatabase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOnline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def off(
      query: Query,
      eventType: js.UndefOr[EventType],
      callback: js.UndefOr[
          js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any]
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def onChildAdded(
      query: Query,
      callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any],
      cancelCallback: js.UndefOr[js.Function1[/* error */ js.Error, Any]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onChildAdded(
      query: Query,
      callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
      cancelCallback: js.Function1[/* error */ js.Error, Any],
      options: ListenOptions
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onChildAdded(
      query: Query,
      callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
      options: ListenOptions
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    
    inline def onChildChanged(
      query: Query,
      callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
      cancelCallback: js.UndefOr[js.Function1[/* error */ js.Error, Any]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onChildChanged(
      query: Query,
      callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
      cancelCallback: js.Function1[/* error */ js.Error, Any],
      options: ListenOptions
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onChildChanged(
      query: Query,
      callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
      options: ListenOptions
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    
    inline def onChildMoved(
      query: Query,
      callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
      cancelCallback: js.UndefOr[js.Function1[/* error */ js.Error, Any]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onChildMoved(
      query: Query,
      callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
      cancelCallback: js.Function1[/* error */ js.Error, Any],
      options: ListenOptions
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onChildMoved(
      query: Query,
      callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
      options: ListenOptions
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    
    inline def onChildRemoved(
      query: Query,
      callback: js.Function1[/* snapshot */ DataSnapshot, Any],
      cancelCallback: js.UndefOr[js.Function1[/* error */ js.Error, Any]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onChildRemoved(
      query: Query,
      callback: js.Function1[/* snapshot */ DataSnapshot, Any],
      cancelCallback: js.Function1[/* error */ js.Error, Any],
      options: ListenOptions
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onChildRemoved(query: Query, callback: js.Function1[/* snapshot */ DataSnapshot, Any], options: ListenOptions): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    
    inline def onDisconnect(ref: Reference): OnDisconnect_ = ^.asInstanceOf[js.Dynamic].applyDynamic("onDisconnect")(ref.asInstanceOf[js.Any]).asInstanceOf[OnDisconnect_]
    
    inline def onValue(
      query: Query,
      callback: js.Function1[/* snapshot */ DataSnapshot, Any],
      cancelCallback: js.UndefOr[js.Function1[/* error */ js.Error, Any]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onValue(
      query: Query,
      callback: js.Function1[/* snapshot */ DataSnapshot, Any],
      cancelCallback: js.Function1[/* error */ js.Error, Any],
      options: ListenOptions
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onValue(query: Query, callback: js.Function1[/* snapshot */ DataSnapshot, Any], options: ListenOptions): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    
    inline def push(parent: Reference, value: js.UndefOr[Any]): ThenableReference = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ThenableReference]
    
    inline def query(query: Query, queryConstraints: QueryConstraint*): Query_ = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query_]
    
    inline def ref(db: FirebaseDatabase, path: js.UndefOr[String]): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
    
    inline def refFromURL(db: FirebaseDatabase, url: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("refFromURL")(db.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
    
    inline def remove(ref: Reference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def runTransaction(
      ref: Reference,
      transactionUpdate: js.Function1[/* currentData */ Any, Any],
      options: js.UndefOr[TransactionOptions]
    ): js.Promise[TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResult]]
    
    inline def set(ref: Reference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def setPriority(ref: Reference, priority: String | Double | Null): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def setWithPriority(ref: Reference, value: Any, priority: String | Double | Null): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def update(ref: Reference, values: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  inline def registerDatabase(instance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDatabase")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* augmented module */
  object firebaseAppCompatAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      var database: js.UndefOr[js.Function1[/* databaseURL */ js.UndefOr[String], FirebaseDatabase]] = js.undefined
    }
    object FirebaseApp {
      
      inline def apply(): typings.firebaseDatabaseCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.firebaseDatabaseCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp]
      }
      
      extension [Self <: typings.firebaseDatabaseCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp](x: Self) {
        
        inline def setDatabase(value: /* databaseURL */ js.UndefOr[String] => FirebaseDatabase): Self = StObject.set(x, "database", js.Any.fromFunction1(value))
        
        inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      }
    }
    
    trait FirebaseNamespace extends StObject {
      
      var database: js.UndefOr[Call] = js.undefined
    }
    object FirebaseNamespace {
      
      inline def apply(): typings.firebaseDatabaseCompat.mod.firebaseAppCompatAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.firebaseDatabaseCompat.mod.firebaseAppCompatAugmentingMod.FirebaseNamespace]
      }
      
      extension [Self <: typings.firebaseDatabaseCompat.mod.firebaseAppCompatAugmentingMod.FirebaseNamespace](x: Self) {
        
        inline def setDatabase(value: Call): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
        
        inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      }
    }
  }
}
