package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FirebaseRemoteConfigObject
import typings.firebaseRemoteConfig.storageMod.Storage
import typings.firebaseRemoteConfigTypes.mod.FetchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/remote-config/dist/src/storage/storage_cache", JSImport.Namespace)
@js.native
object storageCacheMod extends js.Object {
  
  @js.native
  class StorageCache protected () extends js.Object {
    def this(storage: Storage) = this()
    
    var activeConfig: js.Any = js.native
    
    def getActiveConfig(): js.UndefOr[FirebaseRemoteConfigObject] = js.native
    
    /**
      * Memory-only getters
      */
    def getLastFetchStatus(): js.UndefOr[FetchStatus] = js.native
    
    def getLastSuccessfulFetchTimestampMillis(): js.UndefOr[Double] = js.native
    
    /**
      * Memory caches.
      */
    var lastFetchStatus: js.Any = js.native
    
    var lastSuccessfulFetchTimestampMillis: js.Any = js.native
    
    /**
      * Read-ahead getter
      */
    def loadFromStorage(): js.Promise[Unit] = js.native
    
    def setActiveConfig(activeConfig: FirebaseRemoteConfigObject): js.Promise[Unit] = js.native
    
    /**
      * Write-through setters
      */
    def setLastFetchStatus(status: FetchStatus): js.Promise[Unit] = js.native
    
    def setLastSuccessfulFetchTimestampMillis(timestampMillis: Double): js.Promise[Unit] = js.native
    
    val storage: js.Any = js.native
  }
}
