package typings.atFirebaseRemoteDashConfig

import typings.atFirebaseLogger.atFirebaseLoggerMod.Logger
import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.FetchRequest
import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.FetchResponse
import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.RemoteConfigFetchClient
import typings.atFirebaseRemoteDashConfig.distSrcStorageStorageMod.Storage
import typings.atFirebaseRemoteDashConfig.distSrcStorageStorageUnderscoreCacheMod.StorageCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/client/caching_client", JSImport.Namespace)
@js.native
object distSrcClientCachingUnderscoreClientMod extends js.Object {
  @js.native
  class CachingClient protected () extends RemoteConfigFetchClient {
    def this(client: RemoteConfigFetchClient, storage: Storage, storageCache: StorageCache, logger: Logger) = this()
    val client: js.Any = js.native
    val logger: js.Any = js.native
    val storage: js.Any = js.native
    val storageCache: js.Any = js.native
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
    def isCachedDataFresh(cacheMaxAgeMillis: Double): Boolean = js.native
    /**
      * Returns true if the age of the cached fetched configs is less than or equal to
      * {@link Settings#minimumFetchIntervalInSeconds}.
      *
      * <p>This is comparable to passing `headers = { 'Cache-Control': max-age <maxAge> }` to the
      * native Fetch API.
      *
      * <p>Visible for testing.
      */
    def isCachedDataFresh(cacheMaxAgeMillis: Double, lastSuccessfulFetchTimestampMillis: Double): Boolean = js.native
  }
  
}

