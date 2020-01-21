package typings.firebaseRemoteConfig

import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/client/rest_client", JSImport.Namespace)
@js.native
object restClientMod extends js.Object {
  @js.native
  class RestClient protected () extends RemoteConfigFetchClient {
    def this(
      firebaseInstallations: FirebaseInstallations,
      sdkVersion: String,
      namespace: String,
      projectId: String,
      apiKey: String,
      appId: String
    ) = this()
    val apiKey: js.Any = js.native
    val appId: js.Any = js.native
    val firebaseInstallations: js.Any = js.native
    val namespace: js.Any = js.native
    val projectId: js.Any = js.native
    val sdkVersion: js.Any = js.native
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
  }
  
}

