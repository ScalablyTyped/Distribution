package typings.atFirebaseRemoteDashConfig

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseLogger.atFirebaseLoggerMod.Logger
import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.RemoteConfigFetchClient
import typings.atFirebaseRemoteDashConfig.distSrcStorageStorageMod.Storage
import typings.atFirebaseRemoteDashConfig.distSrcStorageStorageUnderscoreCacheMod.StorageCache
import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.FetchStatus
import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.LogLevel
import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.Settings
import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/remote_config", JSImport.Namespace)
@js.native
object distSrcRemoteUnderscoreConfigMod extends js.Object {
  @js.native
  class RemoteConfig protected ()
    extends typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.RemoteConfig {
    def this(
      app: FirebaseApp,
      _client: RemoteConfigFetchClient,
      _storageCache: StorageCache,
      _storage: Storage,
      _logger: Logger
    ) = this()
    val _client: js.Any = js.native
    var _initializePromise: js.UndefOr[js.Any] = js.native
    var _isInitializationComplete: js.Any = js.native
    val _logger: js.Any = js.native
    val _storage: js.Any = js.native
    val _storageCache: js.Any = js.native
    val app: FirebaseApp = js.native
    /**
      * Object containing default values for conigs.
      */
    /* CompleteClass */
    override var defaultConfig: StringDictionary[String | Double | Boolean] = js.native
    /**
      * The Unix timestamp in milliseconds of the last <i>successful</i> fetch, or negative one if
      * the {@link RemoteConfig} instance either hasn't fetched or initialization
      * is incomplete.
      */
    /* CompleteClass */
    override var fetchTimeMillis: Double = js.native
    /**
      * The status of the last fetch <i>attempt</i>.
      */
    /* CompleteClass */
    override var lastFetchStatus: FetchStatus = js.native
    /**
      * Defines configuration for the Remote Config SDK.
      */
    /* CompleteClass */
    override var settings: Settings = js.native
    /**
      * Makes the last fetched config available to the getters.
      * Returns a promise which resolves to true if the current call activated the fetched configs.
      * If the fetched configs were already activated, the promise will resolve to false.
      */
    /* CompleteClass */
    override def activate(): js.Promise[Boolean] = js.native
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
      * Defines the log level to use.
      */
    /* CompleteClass */
    override def setLogLevel(logLevel: LogLevel): Unit = js.native
  }
  
}

