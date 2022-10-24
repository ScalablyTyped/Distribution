package typings.firebaseDatabaseCompat

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternal
import typings.firebaseDatabase.mod.DatabaseReference
import typings.firebaseDatabase.mod.Query_
import typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiReferenceMod.Query
import typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiReferenceMod.Reference
import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import typings.firebaseUtil.mod.EmulatorMockTokenOptions
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var mockUserToken: js.UndefOr[EmulatorMockTokenOptions | String] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setMockUserToken(value: EmulatorMockTokenOptions | String): Self = StObject.set(x, "mockUserToken", value.asInstanceOf[js.Any])
      
      inline def setMockUserTokenUndefined: Self = StObject.set(x, "mockUserToken", js.undefined)
    }
  }
  
  trait App[T] extends StObject {
    
    var app: FirebaseApp
    
    var customAuthImpl: FirebaseAuthInternal
    
    var namespace: T
    
    var nodeAdmin: js.UndefOr[Boolean] = js.undefined
    
    var url: String
    
    var version: String
  }
  object App {
    
    inline def apply[T](app: FirebaseApp, customAuthImpl: FirebaseAuthInternal, namespace: T, url: String, version: String): App[T] = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], customAuthImpl = customAuthImpl.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[App[T]]
    }
    
    extension [Self <: App[?], T](x: Self & App[T]) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setCustomAuthImpl(value: FirebaseAuthInternal): Self = StObject.set(x, "customAuthImpl", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: T): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNodeAdmin(value: Boolean): Self = StObject.set(x, "nodeAdmin", value.asInstanceOf[js.Any])
      
      inline def setNodeAdminUndefined: Self = StObject.set(x, "nodeAdmin", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(): FirebaseDatabase = js.native
    def apply(app: typings.firebaseDatabaseCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp): FirebaseDatabase = js.native
    
    var Database: Instantiable0[FirebaseDatabase] = js.native
    
    var ServerValue: typings.firebaseDatabaseTypes.mod.ServerValue = js.native
    
    def enableLogging(): Any = js.native
    def enableLogging(logger: js.Function1[/* a */ String, Any]): Any = js.native
    def enableLogging(logger: js.Function1[/* a */ String, Any], persistent: Boolean): Any = js.native
    def enableLogging(logger: Boolean): Any = js.native
    def enableLogging(logger: Boolean, persistent: Boolean): Any = js.native
    def enableLogging(logger: Unit, persistent: Boolean): Any = js.native
    @JSName("enableLogging")
    var enableLogging_Original: FnCallLoggerPersistent = js.native
  }
  
  trait DataSnapshot extends StObject {
    
    var DataSnapshot: Instantiable2[
        /* _database */ typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database, 
        /* _delegate */ typings.firebaseDatabase.mod.DataSnapshot, 
        typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiReferenceMod.DataSnapshot
      ]
    
    var Database: TypeofDatabase
    
    var INTERNAL: TypeofINTERNAL
    
    var Query: TypeofQuery
    
    var Reference: Instantiable2[
        /* database */ typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database, 
        /* _delegate */ DatabaseReference, 
        typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiReferenceMod.Reference
      ]
    
    var ServerValue: Increment
    
    def enableLogging(enabled: Boolean): Any
    def enableLogging(enabled: Boolean, persistent: Boolean): Any
    def enableLogging(logger: js.Function1[/* message */ String, Any]): Any
    @JSName("enableLogging")
    var enableLogging_Original: FnCall
  }
  object DataSnapshot {
    
    inline def apply(
      DataSnapshot: Instantiable2[
          /* _database */ typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database, 
          /* _delegate */ typings.firebaseDatabase.mod.DataSnapshot, 
          typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiReferenceMod.DataSnapshot
        ],
      Database: TypeofDatabase,
      INTERNAL: TypeofINTERNAL,
      Query: TypeofQuery,
      Reference: Instantiable2[
          /* database */ typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database, 
          /* _delegate */ DatabaseReference, 
          Reference
        ],
      ServerValue: Increment,
      enableLogging: FnCall
    ): DataSnapshot = {
      val __obj = js.Dynamic.literal(DataSnapshot = DataSnapshot.asInstanceOf[js.Any], Database = Database.asInstanceOf[js.Any], INTERNAL = INTERNAL.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], ServerValue = ServerValue.asInstanceOf[js.Any], enableLogging = enableLogging.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSnapshot]
    }
    
    extension [Self <: DataSnapshot](x: Self) {
      
      inline def setDataSnapshot(
        value: Instantiable2[
              /* _database */ typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database, 
              /* _delegate */ typings.firebaseDatabase.mod.DataSnapshot, 
              typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiReferenceMod.DataSnapshot
            ]
      ): Self = StObject.set(x, "DataSnapshot", value.asInstanceOf[js.Any])
      
      inline def setDatabase(value: TypeofDatabase): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
      
      inline def setEnableLogging(value: FnCall): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
      
      inline def setINTERNAL(value: TypeofINTERNAL): Self = StObject.set(x, "INTERNAL", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: TypeofQuery): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
      
      inline def setReference(
        value: Instantiable2[
              /* database */ typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database, 
              /* _delegate */ DatabaseReference, 
              Reference
            ]
      ): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
      
      inline def setServerValue(value: Increment): Self = StObject.set(x, "ServerValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Database extends StObject {
    
    def apply(): FirebaseDatabase = js.native
    def apply(app: typings.firebaseDatabaseCompat.appCompatMod.FirebaseApp): FirebaseDatabase = js.native
    
    var Database: Instantiable0[FirebaseDatabase] = js.native
    
    var ServerValue: typings.firebaseDatabaseTypes.mod.ServerValue = js.native
    
    def enableLogging(): Any = js.native
    def enableLogging(logger: js.Function1[/* a */ String, Any]): Any = js.native
    def enableLogging(logger: js.Function1[/* a */ String, Any], persistent: Boolean): Any = js.native
    def enableLogging(logger: Boolean): Any = js.native
    def enableLogging(logger: Boolean, persistent: Boolean): Any = js.native
    def enableLogging(logger: Unit, persistent: Boolean): Any = js.native
    @JSName("enableLogging")
    var enableLogging_Original: FnCallLoggerPersistent = js.native
  }
  
  trait Delete extends StObject {
    
    def delete(): js.Promise[Unit]
    
    def forceLongPolling(): Unit
    @JSName("forceLongPolling")
    var forceLongPolling_Original: js.Function0[Unit]
    
    def forceWebSockets(): Unit
    @JSName("forceWebSockets")
    var forceWebSockets_Original: js.Function0[Unit]
  }
  object Delete {
    
    inline def apply(delete: () => js.Promise[Unit], forceLongPolling: () => Unit, forceWebSockets: () => Unit): Delete = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), forceLongPolling = js.Any.fromFunction0(forceLongPolling), forceWebSockets = js.Any.fromFunction0(forceWebSockets))
      __obj.asInstanceOf[Delete]
    }
    
    extension [Self <: Delete](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setForceLongPolling(value: () => Unit): Self = StObject.set(x, "forceLongPolling", js.Any.fromFunction0(value))
      
      inline def setForceWebSockets(value: () => Unit): Self = StObject.set(x, "forceWebSockets", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(enabled: Boolean): Any = js.native
    def apply(enabled: Boolean, persistent: Boolean): Any = js.native
    def apply(logger: js.Function1[/* message */ String, Any]): Any = js.native
  }
  
  @js.native
  trait FnCallLoggerPersistent extends StObject {
    
    def apply(): Any = js.native
    def apply(logger: js.Function1[/* a */ String, Any]): Any = js.native
    def apply(logger: js.Function1[/* a */ String, Any], persistent: Boolean): Any = js.native
    def apply(logger: Boolean): Any = js.native
    def apply(logger: Boolean, persistent: Boolean): Any = js.native
    def apply(logger: Unit, persistent: Boolean): Any = js.native
  }
  
  @js.native
  trait FnCallOnfulfilledOnrejected extends StObject {
    
    def apply[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Reference, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Reference, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  }
  
  @js.native
  trait FnCallOnrejected extends StObject {
    
    def apply[TResult](): js.Promise[Reference | TResult] = js.native
    def apply[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[Reference | TResult] = js.native
  }
  
  trait Increment extends StObject {
    
    var TIMESTAMP: js.Object
    
    def increment(delta: Double): js.Object
  }
  object Increment {
    
    inline def apply(TIMESTAMP: js.Object, increment: Double => js.Object): Increment = {
      val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], increment = js.Any.fromFunction1(increment))
      __obj.asInstanceOf[Increment]
    }
    
    extension [Self <: Increment](x: Self) {
      
      inline def setIncrement(value: Double => js.Object): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
      
      inline def setTIMESTAMP(value: js.Object): Self = StObject.set(x, "TIMESTAMP", value.asInstanceOf[js.Any])
    }
  }
  
  trait Instance[T] extends StObject {
    
    var instance: typings.firebaseDatabaseTypes.mod.Database
    
    var namespace: T
  }
  object Instance {
    
    inline def apply[T](instance: typings.firebaseDatabaseTypes.mod.Database, namespace: T): Instance[T] = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance[T]]
    }
    
    extension [Self <: Instance[?], T](x: Self & Instance[T]) {
      
      inline def setInstance(value: typings.firebaseDatabaseTypes.mod.Database): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: T): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait MockUserToken extends StObject {
    
    var mockUserToken: js.UndefOr[EmulatorMockTokenOptions] = js.undefined
  }
  object MockUserToken {
    
    inline def apply(): MockUserToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockUserToken]
    }
    
    extension [Self <: MockUserToken](x: Self) {
      
      inline def setMockUserToken(value: EmulatorMockTokenOptions): Self = StObject.set(x, "mockUserToken", value.asInstanceOf[js.Any])
      
      inline def setMockUserTokenUndefined: Self = StObject.set(x, "mockUserToken", js.undefined)
    }
  }
  
  trait Namespace extends StObject {
    
    var instance: typings.firebaseDatabaseTypes.mod.Database
    
    var namespace: DataSnapshot
  }
  object Namespace {
    
    inline def apply(instance: typings.firebaseDatabaseTypes.mod.Database, namespace: DataSnapshot): Namespace = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Namespace]
    }
    
    extension [Self <: Namespace](x: Self) {
      
      inline def setInstance(value: typings.firebaseDatabaseTypes.mod.Database): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: DataSnapshot): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofDatabase
    extends StObject
       with Instantiable2[
          /* _delegate */ typings.firebaseDatabase.mod.Database, 
          /* app */ FirebaseApp, 
          typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database
        ] {
    
    val ServerValue: Increment = js.native
  }
  
  trait TypeofINTERNAL extends StObject {
    
    def initStandalone[T](param0: App[T]): Instance[T]
  }
  object TypeofINTERNAL {
    
    inline def apply(initStandalone: App[Any] => Instance[Any]): TypeofINTERNAL = {
      val __obj = js.Dynamic.literal(initStandalone = js.Any.fromFunction1(initStandalone))
      __obj.asInstanceOf[TypeofINTERNAL]
    }
    
    extension [Self <: TypeofINTERNAL](x: Self) {
      
      inline def setInitStandalone(value: App[Any] => Instance[Any]): Self = StObject.set(x, "initStandalone", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofQuery
    extends StObject
       with Instantiable2[
          /* database */ typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database, 
          /* _delegate */ Query_, 
          Query
        ] {
    
    /**
      * Helper used by .on and .once to extract the context and or cancel arguments.
      * @param fnName - The function name (on or once)
      *
      */
    /* private */ var getCancelAndContextArgs_ : Any = js.native
  }
}
