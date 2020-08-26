package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigAbortSignal
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typings.firebaseRemoteConfig.storageMod.Storage
import typings.firebaseRemoteConfig.storageMod.ThrottleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/client/retrying_client", JSImport.Namespace)
@js.native
object retryingClientMod extends js.Object {
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
  }
  
  def setAbortableTimeout(signal: RemoteConfigAbortSignal, throttleEndTimeMillis: Double): js.Promise[Unit] = js.native
}

