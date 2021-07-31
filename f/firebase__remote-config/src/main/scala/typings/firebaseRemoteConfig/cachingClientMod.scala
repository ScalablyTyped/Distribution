package typings.firebaseRemoteConfig

import typings.firebaseLogger.mod.Logger
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typings.firebaseRemoteConfig.storageCacheMod.StorageCache
import typings.firebaseRemoteConfig.storageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cachingClientMod {
  
  @JSImport("@firebase/remote-config/dist/src/client/caching_client", "CachingClient")
  @js.native
  class CachingClient protected ()
    extends StObject
       with RemoteConfigFetchClient {
    def this(client: RemoteConfigFetchClient, storage: Storage, storageCache: StorageCache, logger: Logger) = this()
    
    val client: js.Any = js.native
    
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
    
    val logger: js.Any = js.native
    
    val storage: js.Any = js.native
    
    val storageCache: js.Any = js.native
  }
}
