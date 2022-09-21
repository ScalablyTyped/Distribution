package typings.firebaseApp

import typings.firebaseApp.srcTypesMod.HeartbeatService
import typings.firebaseApp.typesMod.PlatformLoggerService
import typings.firebaseApp.typesMod.VersionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPublicTypesMod {
  
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
  
  trait FirebaseAppInternal
    extends StObject
       with FirebaseApp {
    
    def checkDestroyed(): Unit
    
    var container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ Any
    
    var isDeleted: Boolean
  }
  object FirebaseAppInternal {
    
    inline def apply(
      automaticDataCollectionEnabled: Boolean,
      checkDestroyed: () => Unit,
      container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ Any,
      isDeleted: Boolean,
      name: String,
      options: FirebaseOptions
    ): FirebaseAppInternal = {
      val __obj = js.Dynamic.literal(automaticDataCollectionEnabled = automaticDataCollectionEnabled.asInstanceOf[js.Any], checkDestroyed = js.Any.fromFunction0(checkDestroyed), container = container.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseAppInternal]
    }
    
    extension [Self <: FirebaseAppInternal](x: Self) {
      
      inline def setCheckDestroyed(value: () => Unit): Self = StObject.set(x, "checkDestroyed", js.Any.fromFunction0(value))
      
      inline def setContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ Any
      ): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
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
  
  trait FirebaseService extends StObject {
    
    /**
      * Delete the service and free it's resources - called from
      * {@link @firebase/app#deleteApp | deleteApp()}
      */
    def _delete(): js.Promise[Unit]
    
    var app: FirebaseApp
  }
  object FirebaseService {
    
    inline def apply(_delete: () => js.Promise[Unit], app: FirebaseApp): FirebaseService = {
      val __obj = js.Dynamic.literal(_delete = js.Any.fromFunction0(_delete), app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseService]
    }
    
    extension [Self <: FirebaseService](x: Self) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def set_delete(value: () => js.Promise[Unit]): Self = StObject.set(x, "_delete", js.Any.fromFunction0(value))
    }
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var app: FirebaseApp
      
      var `app-version`: VersionService
      
      var heartbeat: HeartbeatService
      
      var `platform-logger`: PlatformLoggerService
    }
    object NameServiceMapping {
      
      inline def apply(
        app: FirebaseApp,
        `app-version`: VersionService,
        heartbeat: HeartbeatService,
        `platform-logger`: PlatformLoggerService
      ): NameServiceMapping = {
        val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any])
        __obj.updateDynamic("app-version")(`app-version`.asInstanceOf[js.Any])
        __obj.updateDynamic("platform-logger")(`platform-logger`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
        
        inline def `setApp-version`(value: VersionService): Self = StObject.set(x, "app-version", value.asInstanceOf[js.Any])
        
        inline def setHeartbeat(value: HeartbeatService): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
        
        inline def `setPlatform-logger`(value: PlatformLoggerService): Self = StObject.set(x, "platform-logger", value.asInstanceOf[js.Any])
      }
    }
  }
}
