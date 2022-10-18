package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.anon.ApplicationDefault
import typings.firebaseAdmin.libAppCheckAppCheckNamespaceMod.appCheck.AppCheck
import typings.firebaseAdmin.libAppCoreMod.AppOptions
import typings.firebaseAdmin.libAppLifecycleMod.AppStore
import typings.firebaseAdmin.libAuthAuthNamespaceMod.auth.Auth
import typings.firebaseAdmin.libDatabaseDatabaseNamespaceMod.database.Database
import typings.firebaseAdmin.libFirebaseNamespaceApiMod.app.App
import typings.firebaseAdmin.libFirebaseNamespaceApiMod.firestore.Firestore
import typings.firebaseAdmin.libInstallationsInstallationsNamespaceMod.installations.Installations
import typings.firebaseAdmin.libInstanceIdInstanceIdNamespaceMod.instanceId.InstanceId
import typings.firebaseAdmin.libMachineLearningMachineLearningNamespaceMod.machineLearning.MachineLearning
import typings.firebaseAdmin.libMessagingMessagingNamespaceMod.messaging.Messaging
import typings.firebaseAdmin.libProjectManagementProjectManagementNamespaceMod.projectManagement.ProjectManagement
import typings.firebaseAdmin.libRemoteConfigRemoteConfigNamespaceMod.remoteConfig.RemoteConfig
import typings.firebaseAdmin.libSecurityRulesSecurityRulesNamespaceMod.securityRules.SecurityRules
import typings.firebaseAdmin.libStorageStorageNamespaceMod.storage.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppFirebaseNamespaceMod {
  
  @JSImport("firebase-admin/lib/app/firebase-namespace", "FirebaseNamespace")
  @js.native
  open class FirebaseNamespace () extends StObject {
    def this(appStore: AppStore) = this()
    
    var INTERNAL: FirebaseNamespaceInternals = js.native
    
    var Promise: Any = js.native
    
    var SDK_VERSION: String = js.native
    
    var __esModule: Boolean = js.native
    
    /**
      * Returns the FirebaseApp instance with the provided name (or the default FirebaseApp instance
      * if no name is provided).
      *
      * @param appName - Optional name of the FirebaseApp instance to return.
      * @returns The FirebaseApp instance which has the provided name.
      */
    def app(): App = js.native
    def app(appName: String): App = js.native
    
    /**
      * Gets the `AppCheck` service namespace. The returned namespace can be used to get the
      * `AppCheck` service for the default app or an explicitly specified app.
      */
    def appCheck: FirebaseServiceNamespace[AppCheck] = js.native
    
    def apps: js.Array[App] = js.native
    
    /**
      * Gets the `Auth` service namespace. The returned namespace can be used to get the
      * `Auth` service for the default app or an explicitly specified app.
      */
    def auth: FirebaseServiceNamespace[Auth] = js.native
    
    var credential: ApplicationDefault = js.native
    
    /**
      * Gets the `Database` service namespace. The returned namespace can be used to get the
      * `Database` service for the default app or an explicitly specified app.
      */
    def database: FirebaseServiceNamespace[Database] = js.native
    
    /* private */ var ensureApp: Any = js.native
    
    /**
      * Gets the `Firestore` service namespace. The returned namespace can be used to get the
      * `Firestore` service for the default app or an explicitly specified app.
      */
    def firestore: FirebaseServiceNamespace[Firestore] = js.native
    
    /**
      * Initializes the FirebaseApp instance.
      *
      * @param options - Optional options for the FirebaseApp instance.
      *   If none present will try to initialize from the FIREBASE_CONFIG environment variable.
      *   If the environment variable contains a string that starts with '{' it will be parsed as JSON,
      *   otherwise it will be assumed to be pointing to a file.
      * @param appName - Optional name of the FirebaseApp instance.
      *
      * @returns A new FirebaseApp instance.
      */
    def initializeApp(): App = js.native
    def initializeApp(options: Unit, appName: String): App = js.native
    def initializeApp(options: AppOptions): App = js.native
    def initializeApp(options: AppOptions, appName: String): App = js.native
    
    /**
      * Gets the `Installations` service namespace. The returned namespace can be used to get the
      * `Installations` service for the default app or an explicitly specified app.
      */
    def installations: FirebaseServiceNamespace[Installations] = js.native
    
    /**
      * Gets the `InstanceId` service namespace. The returned namespace can be used to get the
      * `Instance` service for the default app or an explicitly specified app.
      */
    def instanceId: FirebaseServiceNamespace[InstanceId] = js.native
    
    /**
      * Gets the `MachineLearning` service namespace. The returned namespace can be
      * used to get the `MachineLearning` service for the default app or an
      * explicityly specified app.
      */
    def machineLearning: FirebaseServiceNamespace[MachineLearning] = js.native
    
    /**
      * Gets the `Messaging` service namespace. The returned namespace can be used to get the
      * `Messaging` service for the default app or an explicitly specified app.
      */
    def messaging: FirebaseServiceNamespace[Messaging] = js.native
    
    /**
      * Gets the `ProjectManagement` service namespace. The returned namespace can be used to get the
      * `ProjectManagement` service for the default app or an explicitly specified app.
      */
    def projectManagement: FirebaseServiceNamespace[ProjectManagement] = js.native
    
    /**
      * Gets the `RemoteConfig` service namespace. The returned namespace can be used to get the
      * `RemoteConfig` service for the default app or an explicitly specified app.
      */
    def remoteConfig: FirebaseServiceNamespace[RemoteConfig] = js.native
    
    /**
      * Gets the `SecurityRules` service namespace. The returned namespace can be used to get the
      * `SecurityRules` service for the default app or an explicitly specified app.
      */
    def securityRules: FirebaseServiceNamespace[SecurityRules] = js.native
    
    /**
      * Gets the `Storage` service namespace. The returned namespace can be used to get the
      * `Storage` service for the default app or an explicitly specified app.
      */
    def storage: FirebaseServiceNamespace[Storage] = js.native
  }
  
  @JSImport("firebase-admin/lib/app/firebase-namespace", "FirebaseNamespaceInternals")
  @js.native
  open class FirebaseNamespaceInternals protected () extends StObject {
    def this(appStore: AppStore) = this()
    
    /**
      * Returns the App instance with the provided name (or the default App instance
      * if no name is provided).
      *
      * @param appName - Optional name of the FirebaseApp instance to return.
      * @returns The App instance which has the provided name.
      */
    def app(): App = js.native
    def app(appName: String): App = js.native
    
    /* private */ val appStore: Any = js.native
    
    def apps: js.Array[App] = js.native
    
    /**
      * Initializes the App instance.
      *
      * @param options - Optional options for the App instance. If none present will try to initialize
      *   from the FIREBASE_CONFIG environment variable. If the environment variable contains a string
      *   that starts with '{' it will be parsed as JSON, otherwise it will be assumed to be pointing
      *   to a file.
      * @param appName - Optional name of the FirebaseApp instance.
      *
      * @returns A new App instance.
      */
    def initializeApp(): App = js.native
    def initializeApp(options: Unit, appName: String): App = js.native
    def initializeApp(options: AppOptions): App = js.native
    def initializeApp(options: AppOptions, appName: String): App = js.native
  }
  
  @js.native
  trait FirebaseServiceNamespace[T]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    def apply(): T = js.native
    def apply(app: App): T = js.native
  }
}
