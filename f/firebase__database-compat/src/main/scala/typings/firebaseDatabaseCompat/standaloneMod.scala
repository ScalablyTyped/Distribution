package typings.firebaseDatabaseCompat

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseDatabase.mod.DatabaseReference
import typings.firebaseDatabase.mod.Query_
import typings.firebaseDatabaseCompat.anon.Increment
import typings.firebaseDatabaseCompat.anon.Namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object standaloneMod {
  
  @JSImport("@firebase/database-compat/standalone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database-compat/standalone", "DataSnapshot")
  @js.native
  open class DataSnapshot protected ()
    extends typings.firebaseDatabaseCompat.distDatabaseCompatSrcIndexDotstandaloneMod.DataSnapshot {
    def this(
      _database: typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database,
      _delegate: typings.firebaseDatabase.mod.DataSnapshot
    ) = this()
  }
  
  @JSImport("@firebase/database-compat/standalone", "Database")
  @js.native
  open class Database protected ()
    extends typings.firebaseDatabaseCompat.distDatabaseCompatSrcIndexDotstandaloneMod.Database {
    /**
      * The constructor should not be called by users of our public API.
      */
    def this(_delegate: typings.firebaseDatabase.mod.Database, app: FirebaseApp) = this()
  }
  /* static members */
  object Database {
    
    @JSImport("@firebase/database-compat/standalone", "Database.ServerValue")
    @js.native
    val ServerValue: Increment = js.native
  }
  
  @JSImport("@firebase/database-compat/standalone", "OnDisconnect")
  @js.native
  /* private */ open class OnDisconnect ()
    extends typings.firebaseDatabaseCompat.distDatabaseCompatSrcIndexDotstandaloneMod.OnDisconnect
  
  @JSImport("@firebase/database-compat/standalone", "Query")
  @js.native
  open class Query protected ()
    extends typings.firebaseDatabaseCompat.distDatabaseCompatSrcIndexDotstandaloneMod.Query {
    def this(
      database: typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database,
      _delegate: Query_
    ) = this()
  }
  /* static members */
  object Query {
    
    @JSImport("@firebase/database-compat/standalone", "Query")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper used by .on and .once to extract the context and or cancel arguments.
      * @param fnName - The function name (on or once)
      *
      */
    @JSImport("@firebase/database-compat/standalone", "Query.getCancelAndContextArgs_")
    @js.native
    def getCancelAndContextArgs_ : Any = js.native
    inline def getCancelAndContextArgs__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCancelAndContextArgs_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database-compat/standalone", "Reference")
  @js.native
  open class Reference protected ()
    extends typings.firebaseDatabaseCompat.distDatabaseCompatSrcIndexDotstandaloneMod.Reference {
    /**
      * Call options:
      *   new Reference(Repo, Path) or
      *   new Reference(url: string, string|RepoManager)
      *
      * Externally - this is the firebase.database.Reference type.
      */
    def this(
      database: typings.firebaseDatabaseCompat.distDatabaseCompatSrcApiDatabaseMod.Database,
      _delegate: DatabaseReference
    ) = this()
  }
  
  object ServerValue {
    
    @JSImport("@firebase/database-compat/standalone", "ServerValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database-compat/standalone", "ServerValue.TIMESTAMP")
    @js.native
    def TIMESTAMP: js.Object = js.native
    inline def TIMESTAMP_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMESTAMP")(x.asInstanceOf[js.Any])
    
    inline def increment(delta: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(delta.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  }
  
  inline def enableLogging(enabled: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(enabled: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* message */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def initStandalone(app: FirebaseApp, url: String, version: String): Namespace = (^.asInstanceOf[js.Dynamic].applyDynamic("initStandalone")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Namespace]
  inline def initStandalone(app: FirebaseApp, url: String, version: String, nodeAdmin: Boolean): Namespace = (^.asInstanceOf[js.Dynamic].applyDynamic("initStandalone")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any], version.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[Namespace]
}
