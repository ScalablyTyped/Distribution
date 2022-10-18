package typings.firebaseRemoteConfig

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseLogger.mod.Logger
import typings.firebaseRemoteConfig.distEsmSrcClientRemoteConfigFetchClientMod.RemoteConfigFetchClient
import typings.firebaseRemoteConfig.distEsmSrcPublicTypesMod.FetchStatus
import typings.firebaseRemoteConfig.distEsmSrcPublicTypesMod.RemoteConfigSettings
import typings.firebaseRemoteConfig.distEsmSrcStorageStorageCacheMod.StorageCache
import typings.firebaseRemoteConfig.distEsmSrcStorageStorageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcRemoteConfigMod {
  
  @JSImport("@firebase/remote-config/dist/esm/src/remote_config", "RemoteConfig")
  @js.native
  open class RemoteConfig protected ()
    extends StObject
       with typings.firebaseRemoteConfig.distEsmSrcPublicTypesMod.RemoteConfig {
    def this(
      app: FirebaseApp,
      /**
      * @internal
      */
    _client: RemoteConfigFetchClient,
      /**
      * @internal
      */
    _storageCache: StorageCache,
      /**
      * @internal
      */
    _storage: Storage,
      /**
      * @internal
      */
    _logger: Logger
    ) = this()
    
    /**
      * @internal
      */
    val _client: RemoteConfigFetchClient = js.native
    
    /**
      * De-duplicates initialization calls.
      * @internal
      */
    var _initializePromise: js.UndefOr[js.Promise[Unit]] = js.native
    
    /**
      * Tracks completion of initialization promise.
      * @internal
      */
    var _isInitializationComplete: Boolean = js.native
    
    /**
      * @internal
      */
    val _logger: Logger = js.native
    
    /**
      * @internal
      */
    val _storage: Storage = js.native
    
    /**
      * @internal
      */
    val _storageCache: StorageCache = js.native
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `RemoteConfig` instance is associated with.
      */
    /* CompleteClass */
    var app: FirebaseApp = js.native
    
    /**
      * Object containing default values for configs.
      */
    /* CompleteClass */
    var defaultConfig: StringDictionary[String | Double | Boolean] = js.native
    
    /**
      * The Unix timestamp in milliseconds of the last <i>successful</i> fetch, or negative one if
      * the {@link RemoteConfig} instance either hasn't fetched or initialization
      * is incomplete.
      */
    /* CompleteClass */
    var fetchTimeMillis: Double = js.native
    
    /**
      * The status of the last fetch <i>attempt</i>.
      */
    /* CompleteClass */
    var lastFetchStatus: FetchStatus = js.native
    
    /**
      * Defines configuration for the Remote Config SDK.
      */
    /* CompleteClass */
    var settings: RemoteConfigSettings = js.native
  }
}
