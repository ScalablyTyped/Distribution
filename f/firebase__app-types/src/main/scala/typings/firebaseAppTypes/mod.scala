package typings.firebaseAppTypes

import typings.firebaseAppTypes.anon.Call
import typings.firebaseLogger.loggerMod.LogCallback
import typings.firebaseLogger.loggerMod.LogLevelString
import typings.firebaseLogger.loggerMod.LogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/app-types", "FirebaseApp")
  @js.native
  class FirebaseApp () extends StObject {
    
    /**
      * The settable config flag for GDPR opt-in/opt-out
      */
    var automaticDataCollectionEnabled: Boolean = js.native
    
    /**
      * Make the given App unusable and free resources.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * The (read-only) name (identifier) for this App. '[DEFAULT]' is the default
      * App.
      */
    var name: String = js.native
    
    /**
      * The (read-only) configuration options from the app initialization.
      */
    var options: FirebaseOptions = js.native
  }
  
  @js.native
  trait FirebaseAppConfig extends StObject {
    
    var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object FirebaseAppConfig {
    
    @scala.inline
    def apply(): FirebaseAppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseAppConfig]
    }
    
    @scala.inline
    implicit class FirebaseAppConfigMutableBuilder[Self <: FirebaseAppConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "automaticDataCollectionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticDataCollectionEnabledUndefined: Self = StObject.set(x, "automaticDataCollectionEnabled", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait FirebaseNamespace extends StObject {
    
    // The current SDK version.
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
    
    // Sets log handler for all Firebase components.
    def onLog(logCallback: LogCallback): Unit = js.native
    def onLog(logCallback: LogCallback, options: LogOptions): Unit = js.native
    
    /**
      * Registers a library's name and version for platform logging purposes.
      * @param library Name of 1p or 3p library (e.g. firestore, angularfire)
      * @param version Current version of that library.
      */
    def registerVersion(library: String, version: String): Unit = js.native
    def registerVersion(library: String, version: String, variant: String): Unit = js.native
    
    // Sets log level for all Firebase components.
    def setLogLevel(logLevel: LogLevelString): Unit = js.native
  }
  
  @js.native
  trait FirebaseOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var appId: js.UndefOr[String] = js.native
    
    var authDomain: js.UndefOr[String] = js.native
    
    var databaseURL: js.UndefOr[String] = js.native
    
    var measurementId: js.UndefOr[String] = js.native
    
    var messagingSenderId: js.UndefOr[String] = js.native
    
    var projectId: js.UndefOr[String] = js.native
    
    var storageBucket: js.UndefOr[String] = js.native
  }
  object FirebaseOptions {
    
    @scala.inline
    def apply(): FirebaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseOptions]
    }
    
    @scala.inline
    implicit class FirebaseOptionsMutableBuilder[Self <: FirebaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setAuthDomain(value: String): Self = StObject.set(x, "authDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthDomainUndefined: Self = StObject.set(x, "authDomain", js.undefined)
      
      @scala.inline
      def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseURLUndefined: Self = StObject.set(x, "databaseURL", js.undefined)
      
      @scala.inline
      def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
      
      @scala.inline
      def setMessagingSenderId(value: String): Self = StObject.set(x, "messagingSenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagingSenderIdUndefined: Self = StObject.set(x, "messagingSenderId", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      @scala.inline
      def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
    }
  }
  
  @js.native
  trait VersionService extends StObject {
    
    var library: String = js.native
    
    var version: String = js.native
  }
  object VersionService {
    
    @scala.inline
    def apply(library: String, version: String): VersionService = {
      val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionService]
    }
    
    @scala.inline
    implicit class VersionServiceMutableBuilder[Self <: VersionService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  object firebaseComponentAugmentingMod {
    
    @js.native
    trait NameServiceMapping extends StObject {
      
      var app: FirebaseApp = js.native
      
      var `app-version`: VersionService = js.native
      
      var `platform-identifier`: VersionService = js.native
    }
    object NameServiceMapping {
      
      @scala.inline
      def apply(app: FirebaseApp, `app-version`: VersionService, `platform-identifier`: VersionService): NameServiceMapping = {
        val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
        __obj.updateDynamic("app-version")(`app-version`.asInstanceOf[js.Any])
        __obj.updateDynamic("platform-identifier")(`platform-identifier`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setApp-version`(value: VersionService): Self = StObject.set(x, "app-version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setPlatform-identifier`(value: VersionService): Self = StObject.set(x, "platform-identifier", value.asInstanceOf[js.Any])
      }
    }
  }
}
