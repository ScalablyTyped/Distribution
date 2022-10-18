package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.distSrcClientRemoteConfigFetchClientMod.FetchRequest
import typings.firebaseRemoteConfig.distSrcClientRemoteConfigFetchClientMod.FetchResponse
import typings.firebaseRemoteConfig.distSrcClientRemoteConfigFetchClientMod.RemoteConfigFetchClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClientRestClientMod {
  
  @JSImport("@firebase/remote-config/dist/src/client/rest_client", "RestClient")
  @js.native
  open class RestClient protected ()
    extends StObject
       with RemoteConfigFetchClient {
    def this(
      firebaseInstallations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any,
      sdkVersion: String,
      namespace: String,
      projectId: String,
      apiKey: String,
      appId: String
    ) = this()
    
    /* private */ val apiKey: Any = js.native
    
    /* private */ val appId: Any = js.native
    
    /**
      * @throws if response status is not 200 or 304.
      */
    /* CompleteClass */
    override def fetch(request: FetchRequest): js.Promise[FetchResponse] = js.native
    
    /* private */ val firebaseInstallations: Any = js.native
    
    /* private */ val namespace: Any = js.native
    
    /* private */ val projectId: Any = js.native
    
    /* private */ val sdkVersion: Any = js.native
  }
}
