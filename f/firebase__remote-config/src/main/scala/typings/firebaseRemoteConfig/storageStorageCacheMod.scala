package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.clientRemoteConfigFetchClientMod.FirebaseRemoteConfigObject
import typings.firebaseRemoteConfig.storageStorageMod.Storage
import typings.firebaseRemoteConfigTypes.mod.FetchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageStorageCacheMod {
  
  @JSImport("@firebase/remote-config/dist/src/storage/storage_cache", "StorageCache")
  @js.native
  open class StorageCache protected () extends StObject {
    def this(storage: Storage) = this()
    
    /* private */ var activeConfig: Any = js.native
    
    def getActiveConfig(): js.UndefOr[FirebaseRemoteConfigObject] = js.native
    
    /**
      * Memory-only getters
      */
    def getLastFetchStatus(): js.UndefOr[FetchStatus] = js.native
    
    def getLastSuccessfulFetchTimestampMillis(): js.UndefOr[Double] = js.native
    
    /**
      * Memory caches.
      */
    /* private */ var lastFetchStatus: Any = js.native
    
    /* private */ var lastSuccessfulFetchTimestampMillis: Any = js.native
    
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
    
    /* private */ val storage: Any = js.native
  }
}
