package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigAbortSignal
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import typings.firebaseRemoteConfig.storageMod.Storage
import typings.firebaseRemoteConfig.storageMod.ThrottleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryingClientMod {
  
  @JSImport("@firebase/remote-config/dist/src/client/retrying_client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/remote-config/dist/src/client/retrying_client", "RetryingClient")
  @js.native
  class RetryingClient protected ()
    extends StObject
       with RemoteConfigFetchClient {
    def this(client: RemoteConfigFetchClient, storage: Storage) = this()
    
    /**
      * A recursive helper for attempting a fetch request repeatedly.
      *
      * @throws any non-retriable errors.
      */
    def attemptFetch(request: FetchRequest, hasThrottleEndTimeMillisBackoffCount: ThrottleMetadata): js.Promise[FetchResponse] = js.native
    
    val client: js.Any = js.native
    
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
    
    val storage: js.Any = js.native
  }
  
  @scala.inline
  def setAbortableTimeout(signal: RemoteConfigAbortSignal, throttleEndTimeMillis: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAbortableTimeout")(signal.asInstanceOf[js.Any], throttleEndTimeMillis.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
