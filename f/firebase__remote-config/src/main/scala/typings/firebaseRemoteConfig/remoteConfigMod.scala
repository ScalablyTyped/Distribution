package typings.firebaseRemoteConfig

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseLogger.mod.Logger
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typings.firebaseRemoteConfig.storageCacheMod.StorageCache
import typings.firebaseRemoteConfig.storageMod.Storage
import typings.firebaseRemoteConfigTypes.mod.FetchStatus
import typings.firebaseRemoteConfigTypes.mod.LogLevel
import typings.firebaseRemoteConfigTypes.mod.Settings
import typings.firebaseRemoteConfigTypes.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigMod {
  
  @JSImport("@firebase/remote-config/dist/src/remote_config", "RemoteConfig")
  @js.native
  class RemoteConfig protected ()
    extends StObject
       with typings.firebaseRemoteConfigTypes.mod.RemoteConfig {
    def this(
      app: FirebaseApp,
      _client: RemoteConfigFetchClient,
      _storageCache: StorageCache,
      _storage: Storage,
      _logger: Logger
    ) = this()
    
    val _client: js.Any = js.native
    
    var _initializePromise: js.Any = js.native
    
    var _isInitializationComplete: js.Any = js.native
    
    val _logger: js.Any = js.native
    
    val _storage: js.Any = js.native
    
    val _storageCache: js.Any = js.native
    
    /**
      * Makes the last fetched config available to the getters.
      * Returns a promise which resolves to true if the current call activated the fetched configs.
      * If the fetched configs were already activated, the promise will resolve to false.
      */
    /* CompleteClass */
    override def activate(): js.Promise[Boolean] = js.native
    
    val app: FirebaseApp = js.native
    
    /**
      * Object containing default values for conigs.
      */
    /* CompleteClass */
    var defaultConfig: StringDictionary[String | Double | Boolean] = js.native
    
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
  }
}
