package typings.firebaseApp

import typings.firebaseLogger.distSrcLoggerMod.LogCallback
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.firebaseLogger.distSrcLoggerMod.LogOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app", "FirebaseError")
  @js.native
  open class FirebaseError protected ()
    extends typings.firebaseUtil.mod.FirebaseError {
    def this(/** The error code for this error. */
    code: String, message: String) = this()
    def this(
      /** The error code for this error. */
    code: String,
      message: String,
      /** Custom data for this error. */
    customData: Record[String, Any]
    ) = this()
  }
  
  @JSImport("@firebase/app", "SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
  
  inline def deleteApp(app: FirebaseApp): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteApp")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")().asInstanceOf[FirebaseApp]
  inline def getApp(name: String): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getApp")(name.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  inline def getApps(): js.Array[FirebaseApp] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApps")().asInstanceOf[js.Array[FirebaseApp]]
  
  inline def initializeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")().asInstanceOf[FirebaseApp]
  inline def initializeApp(options: FirebaseOptions): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  inline def initializeApp(options: FirebaseOptions, config: FirebaseAppSettings): FirebaseApp = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[FirebaseApp]
  inline def initializeApp(options: FirebaseOptions, name: String): FirebaseApp = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[FirebaseApp]
  
  inline def onLog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLog")().asInstanceOf[Unit]
  inline def onLog(logCallback: Null, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onLog(logCallback: LogCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onLog(logCallback: LogCallback, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerVersion(libraryKeyOrName: String, version: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(libraryKeyOrName.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerVersion(libraryKeyOrName: String, version: String, variant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(libraryKeyOrName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait FirebaseApp extends StObject {
    
    /**
      * The settable config flag for GDPR opt-in/opt-out
      */
    var automaticDataCollectionEnabled: Boolean
    
    /**
      * The (read-only) name for this app.
      *
      * The default app's name is `"[DEFAULT]"`.
      *
      * @example
      * ```javascript
      * // The default app's name is "[DEFAULT]"
      * const app = initializeApp(defaultAppConfig);
      * console.log(app.name);  // "[DEFAULT]"
      * ```
      *
      * @example
      * ```javascript
      * // A named app's name is what you provide to initializeApp()
      * const otherApp = initializeApp(otherAppConfig, "other");
      * console.log(otherApp.name);  // "other"
      * ```
      */
    val name: String
    
    /**
      * The (read-only) configuration options for this app. These are the original
      * parameters given in {@link (initializeApp:1) | initializeApp()}.
      *
      * @example
      * ```javascript
      * const app = initializeApp(config);
      * console.log(app.options.databaseURL === config.databaseURL);  // true
      * ```
      */
    val options: FirebaseOptions
  }
  object FirebaseApp {
    
    inline def apply(automaticDataCollectionEnabled: Boolean, name: String, options: FirebaseOptions): FirebaseApp = {
      val __obj = js.Dynamic.literal(automaticDataCollectionEnabled = automaticDataCollectionEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setAutomaticDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: FirebaseOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait FirebaseAppSettings extends StObject {
    
    /**
      * The settable config flag for GDPR opt-in/opt-out
      */
    var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * custom name for the Firebase App.
      * The default value is `"[DEFAULT]"`.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object FirebaseAppSettings {
    
    inline def apply(): FirebaseAppSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseAppSettings]
    }
    
    extension [Self <: FirebaseAppSettings](x: Self) {
      
      inline def setAutomaticDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setAutomaticDataCollectionEnabledUndefined: Self = StObject.set(x, "automaticDataCollectionEnabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait FirebaseOptions extends StObject {
    
    /**
      * An encrypted string used when calling certain APIs that don't need to
      * access private user data
      * (example value: `AIzaSyDOCAbC123dEf456GhI789jKl012-MnO`).
      */
    var apiKey: js.UndefOr[String] = js.undefined
    
    /**
      * Unique identifier for the app.
      */
    var appId: js.UndefOr[String] = js.undefined
    
    /**
      * Auth domain for the project ID.
      */
    var authDomain: js.UndefOr[String] = js.undefined
    
    /**
      * Default Realtime Database URL.
      */
    var databaseURL: js.UndefOr[String] = js.undefined
    
    /**
      * An ID automatically created when you enable Analytics in your
      * Firebase project and register a web app. In versions 7.20.0
      * and higher, this parameter is optional.
      */
    var measurementId: js.UndefOr[String] = js.undefined
    
    /**
      * Unique numerical value used to identify each sender that can send
      * Firebase Cloud Messaging messages to client apps.
      */
    var messagingSenderId: js.UndefOr[String] = js.undefined
    
    /**
      * The unique identifier for the project across all of Firebase and
      * Google Cloud.
      */
    var projectId: js.UndefOr[String] = js.undefined
    
    /**
      * The default Cloud Storage bucket name.
      */
    var storageBucket: js.UndefOr[String] = js.undefined
  }
  object FirebaseOptions {
    
    inline def apply(): FirebaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseOptions]
    }
    
    extension [Self <: FirebaseOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setAuthDomain(value: String): Self = StObject.set(x, "authDomain", value.asInstanceOf[js.Any])
      
      inline def setAuthDomainUndefined: Self = StObject.set(x, "authDomain", js.undefined)
      
      inline def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
      
      inline def setDatabaseURLUndefined: Self = StObject.set(x, "databaseURL", js.undefined)
      
      inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
      
      inline def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
      
      inline def setMessagingSenderId(value: String): Self = StObject.set(x, "messagingSenderId", value.asInstanceOf[js.Any])
      
      inline def setMessagingSenderIdUndefined: Self = StObject.set(x, "messagingSenderId", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
      
      inline def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
    }
  }
}
