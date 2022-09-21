package typings.firebaseDatabaseCompat

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseDatabase.mod.DatabaseReference
import typings.firebaseDatabase.mod.OnDisconnect_
import typings.firebaseDatabase.mod.Query_
import typings.firebaseDatabaseCompat.anon.Increment
import typings.firebaseDatabaseCompat.anon.Namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexStandaloneMod {
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "DataSnapshot")
  @js.native
  open class DataSnapshot protected ()
    extends typings.firebaseDatabaseCompat.referenceMod.DataSnapshot {
    def this(
      _database: typings.firebaseDatabaseCompat.databaseMod.Database,
      _delegate: typings.firebaseDatabase.mod.DataSnapshot
    ) = this()
  }
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "Database")
  @js.native
  open class Database protected ()
    extends typings.firebaseDatabaseCompat.databaseMod.Database {
    /**
      * The constructor should not be called by users of our public API.
      */
    def this(_delegate: typings.firebaseDatabase.mod.Database, app: FirebaseApp) = this()
  }
  /* static members */
  object Database {
    
    @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "Database.ServerValue")
    @js.native
    val ServerValue: Increment = js.native
  }
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "OnDisconnect")
  @js.native
  /* private */ open class OnDisconnect () extends OnDisconnect_
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "Query")
  @js.native
  open class Query protected ()
    extends typings.firebaseDatabaseCompat.referenceMod.Query {
    def this(database: typings.firebaseDatabaseCompat.databaseMod.Database, _delegate: Query_) = this()
  }
  /* static members */
  object Query {
    
    @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "Query")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper used by .on and .once to extract the context and or cancel arguments.
      * @param fnName - The function name (on or once)
      *
      */
    @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "Query.getCancelAndContextArgs_")
    @js.native
    def getCancelAndContextArgs_ : Any = js.native
    inline def getCancelAndContextArgs__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCancelAndContextArgs_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "Reference")
  @js.native
  open class Reference protected ()
    extends typings.firebaseDatabaseCompat.referenceMod.Reference {
    /**
      * Call options:
      *   new Reference(Repo, Path) or
      *   new Reference(url: string, string|RepoManager)
      *
      * Externally - this is the firebase.database.Reference type.
      */
    def this(database: typings.firebaseDatabaseCompat.databaseMod.Database, _delegate: DatabaseReference) = this()
  }
  
  object ServerValue {
    
    @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "ServerValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database-compat/dist/database-compat/src/index.standalone", "ServerValue.TIMESTAMP")
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
