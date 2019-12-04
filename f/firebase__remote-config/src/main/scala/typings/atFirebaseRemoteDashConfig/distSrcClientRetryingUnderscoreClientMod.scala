package typings.atFirebaseRemoteDashConfig

import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.FetchRequest
import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.FetchResponse
import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.RemoteConfigAbortSignal
import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.RemoteConfigFetchClient
import typings.atFirebaseRemoteDashConfig.distSrcStorageStorageMod.Storage
import typings.atFirebaseRemoteDashConfig.distSrcStorageStorageMod.ThrottleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/client/retrying_client", JSImport.Namespace)
@js.native
object distSrcClientRetryingUnderscoreClientMod extends js.Object {
  @js.native
  class RetryingClient protected () extends RemoteConfigFetchClient {
    def this(client: RemoteConfigFetchClient, storage: Storage) = this()
    val client: js.Any = js.native
    val storage: js.Any = js.native
    /**
      * A recursive helper for attempting a fetch request repeatedly.
      *
      * @throws any non-retriable errors.
      */
    def attemptFetch(request: FetchRequest, hasThrottleEndTimeMillisBackoffCount: ThrottleMetadata): js.Promise[FetchResponse] = js.native
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
  }
  
  def setAbortableTimeout(signal: RemoteConfigAbortSignal, throttleEndTimeMillis: Double): js.Promise[Unit] = js.native
}

