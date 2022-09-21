package typings.firebaseInstallations

import typings.firebaseInstallations.anon.Code
import typings.firebaseInstallations.interfacesApiResponseMod.GenerateAuthTokenResponse
import typings.firebaseInstallations.interfacesInstallationEntryMod.CompletedAuthToken
import typings.firebaseInstallations.interfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.interfacesInstallationImplMod.AppConfig
import typings.firebaseUtil.mod.FirebaseError
import typings.std.Headers
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsCommonMod {
  
  @JSImport("@firebase/installations/dist/src/functions/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractAuthTokenInfoFromResponse(response: GenerateAuthTokenResponse): CompletedAuthToken = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAuthTokenInfoFromResponse")(response.asInstanceOf[js.Any]).asInstanceOf[CompletedAuthToken]
  
  inline def getErrorFromResponse(requestName: String, response: Response): js.Promise[FirebaseError] = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFromResponse")(requestName.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FirebaseError]]
  
  inline def getHeaders(hasApiKey: AppConfig): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaders")(hasApiKey.asInstanceOf[js.Any]).asInstanceOf[Headers]
  
  inline def getHeadersWithAuth(appConfig: AppConfig, hasRefreshToken: RegisteredInstallationEntry): Headers = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersWithAuth")(appConfig.asInstanceOf[js.Any], hasRefreshToken.asInstanceOf[js.Any])).asInstanceOf[Headers]
  
  inline def getInstallationsEndpoint(hasProjectId: AppConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallationsEndpoint")(hasProjectId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def retryIfServerError(fn: js.Function0[js.Promise[Response]]): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryIfServerError")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  
  trait ErrorResponse extends StObject {
    
    var error: Code
  }
  object ErrorResponse {
    
    inline def apply(error: Code): ErrorResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResponse]
    }
    
    extension [Self <: ErrorResponse](x: Self) {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
