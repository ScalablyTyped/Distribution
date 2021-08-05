package typings.firebaseRemoteConfig

import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchRequest
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restClientMod {
  
  @JSImport("@firebase/remote-config/dist/src/client/rest_client", "RestClient")
  @js.native
  class RestClient protected ()
    extends StObject
       with RemoteConfigFetchClient {
    def this(
      firebaseInstallations: FirebaseInstallations,
      sdkVersion: String,
      namespace: String,
      projectId: String,
      apiKey: String,
      appId: String
    ) = this()
    
    /* private */ val apiKey: js.Any = js.native
    
    /* private */ val appId: js.Any = js.native
    
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
    
    /* private */ val firebaseInstallations: js.Any = js.native
    
    /* private */ val namespace: js.Any = js.native
    
    /* private */ val projectId: js.Any = js.native
    
    /* private */ val sdkVersion: js.Any = js.native
  }
}
