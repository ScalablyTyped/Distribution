package typings.firebaseDatabase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseDatabase.anon.MockUserToken
import typings.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.ReferenceImpl
import typings.firebaseDatabase.distNodeEsmSrcCoreRepoMod.Repo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcApiDatabaseMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/api/Database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/database/dist/node-esm/src/api/Database", "Database")
  @js.native
  open class Database protected () extends StObject {
    /** @hideconstructor */
    def this(
      _repoInternal: Repo,
      /** The {@link @firebase/app#FirebaseApp} associated with this Realtime Database instance. */
    app: FirebaseApp
    ) = this()
    
    def _checkNotDeleted(apiName: String): Unit = js.native
    
    def _delete(): js.Promise[Unit] = js.native
    
    /** Track if the instance has been used (root or repo accessed) */
    var _instanceStarted: Boolean = js.native
    
    def _repo: Repo = js.native
    
    var _repoInternal: Repo = js.native
    
    def _root: ReferenceImpl = js.native
    
    /** Backing state for root_ */
    /* private */ var _rootInternal: Any = js.native
    
    /** The {@link @firebase/app#FirebaseApp} associated with this Realtime Database instance. */
    val app: FirebaseApp = js.native
    
    /** Represents a `Database` instance. */
    val `type`: /* "database" */ String = js.native
  }
  
  inline def connectDatabaseEmulator(db: Database, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectDatabaseEmulator(db: Database, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLogging(enabled: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(enabled: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* message */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def forceLongPolling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLongPolling")().asInstanceOf[Unit]
  
  inline def forceWebSockets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceWebSockets")().asInstanceOf[Unit]
  
  inline def getDatabase(): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")().asInstanceOf[Database]
  inline def getDatabase(app: Unit, url: String): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def getDatabase(app: FirebaseApp): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def getDatabase(app: FirebaseApp, url: String): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Database]
  
  inline def goOffline(db: Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOffline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goOnline(db: Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOnline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def repoManagerDatabaseFromApp(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: String
  ): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: String,
    nodeAdmin: Boolean
  ): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: Unit,
    nodeAdmin: Boolean
  ): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName]
  ): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: String
  ): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: String,
    nodeAdmin: Boolean
  ): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: Unit,
    nodeAdmin: Boolean
  ): Database = (^.asInstanceOf[js.Dynamic].applyDynamic("repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[Database]
  
  inline def repoManagerForceRestClient(forceRestClient: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repoManagerForceRestClient")(forceRestClient.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
