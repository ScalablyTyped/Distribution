package typings.firebaseAppCompat

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.firebaseAppCompat.anon.Call
import typings.firebaseAppCompat.anon.Dictindex
import typings.firebaseLogger.distSrcLoggerMod.LogCallback
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.firebaseLogger.distSrcLoggerMod.LogOptions
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@firebase/app-compat", JSImport.Default)
  @js.native
  val default: FirebaseNamespace = js.native
  
  type FirebaseApp = _FirebaseApp
  
  trait FirebaseAppConfig extends StObject {
    
    var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object FirebaseAppConfig {
    
    inline def apply(): FirebaseAppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseAppConfig]
    }
    
    extension [Self <: FirebaseAppConfig](x: Self) {
      
      inline def setAutomaticDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setAutomaticDataCollectionEnabledUndefined: Self = StObject.set(x, "automaticDataCollectionEnabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait FirebaseAppContructor
    extends StObject
       with Instantiable0[FirebaseApp]
  
  @js.native
  trait FirebaseNamespace extends StObject {
    
    var SDK_VERSION: String = js.native
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def app(): FirebaseApp = js.native
    def app(name: String): FirebaseApp = js.native
    @JSName("app")
    var app_Original: Call = js.native
    
    /**
      * A (read-only) array of all the initialized Apps.
      */
    var apps: js.Array[FirebaseApp] = js.native
    
    /**
      * Create (and initialize) a FirebaseApp.
      *
      * @param options Options to configure the services used in the App.
      * @param config The optional config for your firebase app
      */
    def initializeApp(options: FirebaseOptions): FirebaseApp = js.native
    def initializeApp(options: FirebaseOptions, config: FirebaseAppConfig): FirebaseApp = js.native
    def initializeApp(options: FirebaseOptions, name: String): FirebaseApp = js.native
    
    def onLog(logCallback: LogCallback): Unit = js.native
    def onLog(logCallback: LogCallback, options: LogOptions): Unit = js.native
    
    /**
      * Registers a library's name and version for platform logging purposes.
      * @param library Name of 1p or 3p library (e.g. firestore, angularfire)
      * @param version Current version of that library.
      */
    def registerVersion(library: String, version: String): Unit = js.native
    def registerVersion(library: String, version: String, variant: String): Unit = js.native
    
    def setLogLevel(logLevel: LogLevelString): Unit = js.native
  }
  
  trait FirebaseOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var appId: js.UndefOr[String] = js.undefined
    
    var authDomain: js.UndefOr[String] = js.undefined
    
    var databaseURL: js.UndefOr[String] = js.undefined
    
    var measurementId: js.UndefOr[String] = js.undefined
    
    var messagingSenderId: js.UndefOr[String] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
    
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
  
  trait FirebaseService
    extends StObject
       with Compat[Any] {
    
    var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.undefined
    
    var app: FirebaseApp
  }
  object FirebaseService {
    
    inline def apply(_delegate: Any, app: FirebaseApp): FirebaseService = {
      val __obj = js.Dynamic.literal(_delegate = _delegate.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseService]
    }
    
    extension [Self <: FirebaseService](x: Self) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setINTERNAL(value: FirebaseServiceInternals): Self = StObject.set(x, "INTERNAL", value.asInstanceOf[js.Any])
      
      inline def setINTERNALUndefined: Self = StObject.set(x, "INTERNAL", js.undefined)
    }
  }
  
  trait FirebaseServiceInternals extends StObject {
    
    /**
      * Delete the service and free it's resources - called from
      * app.delete().
      */
    def delete(): js.Promise[Unit]
  }
  object FirebaseServiceInternals {
    
    inline def apply(delete: () => js.Promise[Unit]): FirebaseServiceInternals = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[FirebaseServiceInternals]
    }
    
    extension [Self <: FirebaseServiceInternals](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * All ServiceNamespaces extend from FirebaseServiceNamespace
    */
  type FirebaseServiceNamespace[T /* <: FirebaseService */] = js.Function1[/* app */ js.UndefOr[FirebaseApp], T]
  
  trait _FirebaseApp extends StObject {
    
    /**
      * The settable config flag for GDPR opt-in/opt-out
      */
    var automaticDataCollectionEnabled: Boolean
    
    /**
      * Make the given App unusable and free resources.
      */
    def delete(): js.Promise[Unit]
    
    /**
      * The (read-only) name (identifier) for this App. '[DEFAULT]' is the default
      * App.
      */
    var name: String
    
    /**
      * The (read-only) configuration options from the app initialization.
      */
    var options: FirebaseOptions
  }
  object _FirebaseApp {
    
    inline def apply(
      automaticDataCollectionEnabled: Boolean,
      delete: () => js.Promise[Unit],
      name: String,
      options: FirebaseOptions
    ): _FirebaseApp = {
      val __obj = js.Dynamic.literal(automaticDataCollectionEnabled = automaticDataCollectionEnabled.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[_FirebaseApp]
    }
    
    extension [Self <: _FirebaseApp](x: Self) {
      
      inline def setAutomaticDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: FirebaseOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _FirebaseNamespace
    extends StObject
       with FirebaseNamespace {
    
    var INTERNAL: Dictindex = js.native
  }
  
  type _To = FirebaseNamespace
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FirebaseNamespace = default
}
