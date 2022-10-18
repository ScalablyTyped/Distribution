package typings.firebaseRemoteConfig

import typings.firebaseLogger.mod.Logger
import typings.firebaseRemoteConfig.distEsmSrcClientRemoteConfigFetchClientMod.FetchRequest
import typings.firebaseRemoteConfig.distEsmSrcClientRemoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.distEsmSrcClientRemoteConfigFetchClientMod.RemoteConfigFetchClient
import typings.firebaseRemoteConfig.distEsmSrcStorageStorageCacheMod.StorageCache
import typings.firebaseRemoteConfig.distEsmSrcStorageStorageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcClientCachingClientMod {
  
  @JSImport("@firebase/remote-config/dist/esm/src/client/caching_client", "CachingClient")
  @js.native
  open class CachingClient protected ()
    extends StObject
       with RemoteConfigFetchClient {
    def this(client: RemoteConfigFetchClient, storage: Storage, storageCache: StorageCache, logger: Logger) = this()
    
    /* private */ val client: Any = js.native
    
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
    
    /**
      * Returns true if the age of the cached fetched configs is less than or equal to
      * {@link Settings#minimumFetchIntervalInSeconds}.
      *
      * <p>This is comparable to passing `headers = { 'Cache-Control': max-age <maxAge> }` to the
      * native Fetch API.
      *
      * <p>Visible for testing.
      */
    def isCachedDataFresh(cacheMaxAgeMillis: Double): Boolean = js.native
    def isCachedDataFresh(cacheMaxAgeMillis: Double, lastSuccessfulFetchTimestampMillis: Double): Boolean = js.native
    
    /* private */ val logger: Any = js.native
    
    /* private */ val storage: Any = js.native
    
    /* private */ val storageCache: Any = js.native
  }
}
