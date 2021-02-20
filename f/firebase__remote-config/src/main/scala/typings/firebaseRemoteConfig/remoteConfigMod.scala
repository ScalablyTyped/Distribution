package typings.firebaseRemoteConfig

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseLogger.mod.Logger
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typings.firebaseRemoteConfig.storageCacheMod.StorageCache
import typings.firebaseRemoteConfig.storageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigMod {
  
  @JSImport("@firebase/remote-config/dist/src/remote_config", "RemoteConfig")
  @js.native
  class RemoteConfig protected ()
    extends typings.firebaseRemoteConfigTypes.mod.RemoteConfig {
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
    
    val app: FirebaseApp = js.native
  }
}
