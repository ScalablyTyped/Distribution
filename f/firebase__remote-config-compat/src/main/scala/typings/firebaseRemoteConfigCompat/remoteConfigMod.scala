package typings.firebaseRemoteConfigCompat

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAppCompat.mod.FirebaseService
import typings.firebaseRemoteConfigCompat.mod.FirebaseApp
import typings.firebaseRemoteConfigTypes.mod.FetchStatus
import typings.firebaseRemoteConfigTypes.mod.LogLevel
import typings.firebaseRemoteConfigTypes.mod.RemoteConfig
import typings.firebaseRemoteConfigTypes.mod.Settings
import typings.firebaseRemoteConfigTypes.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigMod {
  
  @JSImport("@firebase/remote-config-compat/dist/src/remoteConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/remote-config-compat/dist/src/remoteConfig", "RemoteConfigCompatImpl")
  @js.native
  open class RemoteConfigCompatImpl protected ()
    extends StObject
       with RemoteConfig
       with FirebaseService {
    def this(app: FirebaseApp, _delegate: typings.firebaseRemoteConfig.mod.RemoteConfig) = this()
    
    /* CompleteClass */
    var _delegate: Any = js.native
    @JSName("_delegate")
    val _delegate_RemoteConfigCompatImpl: typings.firebaseRemoteConfig.mod.RemoteConfig = js.native
    
    /**
      * Makes the last fetched config available to the getters.
      * Returns a promise which resolves to true if the current call activated the fetched configs.
      * If the fetched configs were already activated, the promise will resolve to false.
      */
    /* CompleteClass */
    override def activate(): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    var app: typings.firebaseAppCompat.mod.FirebaseApp = js.native
    @JSName("app")
    var app_RemoteConfigCompatImpl: FirebaseApp = js.native
    
    /**
      * Object containing default values for conigs.
      */
    /* CompleteClass */
    var defaultConfig: StringDictionary[String | Double | Boolean] = js.native
    @JSName("defaultConfig")
    def defaultConfig_MRemoteConfigCompatImpl: StringDictionary[String | Double | Boolean] = js.native
    
    /**
      * Ensures the last activated config are available to the getters.
      */
    /* CompleteClass */
    override def ensureInitialized(): js.Promise[Unit] = js.native
    
    /**
      * Fetches and caches configuration from the Remote Config service.
      */
    /* CompleteClass */
    override def fetch(): js.Promise[Unit] = js.native
    
    /**
      * Performs fetch and activate operations, as a convenience.
      * Returns a promise which resolves to true if the current call activated the fetched configs.
      * If the fetched configs were already activated, the promise will resolve to false.
      */
    /* CompleteClass */
    override def fetchAndActivate(): js.Promise[Boolean] = js.native
    
    /**
      * The Unix timestamp in milliseconds of the last <i>successful</i> fetch, or negative one if
      * the {@link RemoteConfig} instance either hasn't fetched or initialization
      * is incomplete.
      */
    /* CompleteClass */
    var fetchTimeMillis: Double = js.native
    @JSName("fetchTimeMillis")
    def fetchTimeMillis_MRemoteConfigCompatImpl: Double = js.native
    
    /**
      * Gets all config.
      */
    /* CompleteClass */
    override def getAll(): StringDictionary[Value] = js.native
    
    /**
      * Gets the value for the given key as a boolean.
      *
      * Convenience method for calling <code>remoteConfig.getValue(key).asBoolean()</code>.
      */
    /* CompleteClass */
    override def getBoolean(key: String): Boolean = js.native
    
    /**
      * Gets the value for the given key as a number.
      *
      * Convenience method for calling <code>remoteConfig.getValue(key).asNumber()</code>.
      */
    /* CompleteClass */
    override def getNumber(key: String): Double = js.native
    
    /**
      * Gets the value for the given key as a String.
      *
      * Convenience method for calling <code>remoteConfig.getValue(key).asString()</code>.
      */
    /* CompleteClass */
    override def getString(key: String): String = js.native
    
    /**
      * Gets the {@link Value} for the given key.
      */
    /* CompleteClass */
    override def getValue(key: String): Value = js.native
    
    /**
      * The status of the last fetch <i>attempt</i>.
      */
    /* CompleteClass */
    var lastFetchStatus: FetchStatus = js.native
    @JSName("lastFetchStatus")
    def lastFetchStatus_MRemoteConfigCompatImpl: FetchStatus = js.native
    
    /**
      * Defines the log level to use.
      */
    /* CompleteClass */
    override def setLogLevel(logLevel: LogLevel): Unit = js.native
    
    /**
      * Defines configuration for the Remote Config SDK.
      */
    /* CompleteClass */
    var settings: Settings = js.native
    @JSName("settings")
    def settings_MRemoteConfigCompatImpl: Settings = js.native
  }
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
}
