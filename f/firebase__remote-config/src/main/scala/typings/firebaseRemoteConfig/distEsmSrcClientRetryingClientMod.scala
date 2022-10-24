package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.distEsmSrcClientRemoteConfigFetchClientMod.FetchRequest
import typings.firebaseRemoteConfig.distEsmSrcClientRemoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.distEsmSrcClientRemoteConfigFetchClientMod.RemoteConfigAbortSignal
import typings.firebaseRemoteConfig.distEsmSrcClientRemoteConfigFetchClientMod.RemoteConfigFetchClient
import typings.firebaseRemoteConfig.distEsmSrcStorageStorageMod.Storage
import typings.firebaseRemoteConfig.distEsmSrcStorageStorageMod.ThrottleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcClientRetryingClientMod {
  
  @JSImport("@firebase/remote-config/dist/esm/src/client/retrying_client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/remote-config/dist/esm/src/client/retrying_client", "RetryingClient")
  @js.native
  open class RetryingClient protected ()
    extends StObject
       with RemoteConfigFetchClient {
    def this(client: RemoteConfigFetchClient, storage: Storage) = this()
    
    /**
      * A recursive helper for attempting a fetch request repeatedly.
      *
      * @throws any non-retriable errors.
      */
    def attemptFetch(request: FetchRequest, param1: ThrottleMetadata): js.Promise[FetchResponse] = js.native
    
    /* private */ val client: Any = js.native
    
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
    
    /* private */ val storage: Any = js.native
  }
  
  inline def setAbortableTimeout(signal: RemoteConfigAbortSignal, throttleEndTimeMillis: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAbortableTimeout")(signal.asInstanceOf[js.Any], throttleEndTimeMillis.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
