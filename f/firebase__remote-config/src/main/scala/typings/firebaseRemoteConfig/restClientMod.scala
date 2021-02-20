package typings.firebaseRemoteConfig

import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import typings.firebaseRemoteConfig.remoteConfigFetchClientMod.RemoteConfigFetchClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restClientMod {
  
  @JSImport("@firebase/remote-config/dist/src/client/rest_client", "RestClient")
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
  }
}
