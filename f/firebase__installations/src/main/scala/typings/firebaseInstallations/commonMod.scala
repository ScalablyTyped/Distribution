package typings.firebaseInstallations

import typings.firebaseInstallations.anon.Code
import typings.firebaseInstallations.apiResponseMod.GenerateAuthTokenResponse
import typings.firebaseInstallations.appConfigMod.AppConfig
import typings.firebaseInstallations.installationEntryMod.CompletedAuthToken
import typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import typings.firebaseUtil.mod.FirebaseError
import typings.std.Headers
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@firebase/installations/dist/src/api/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extractAuthTokenInfoFromResponse(response: GenerateAuthTokenResponse): CompletedAuthToken = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAuthTokenInfoFromResponse")(response.asInstanceOf[js.Any]).asInstanceOf[CompletedAuthToken]
  
  @scala.inline
  def getErrorFromResponse(requestName: String, response: Response): js.Promise[FirebaseError] = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFromResponse")(requestName.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FirebaseError]]
  
  @scala.inline
  def getHeaders(hasApiKey: AppConfig): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaders")(hasApiKey.asInstanceOf[js.Any]).asInstanceOf[Headers]
  
  @scala.inline
  def getHeadersWithAuth(appConfig: AppConfig, hasRefreshToken: RegisteredInstallationEntry): Headers = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersWithAuth")(appConfig.asInstanceOf[js.Any], hasRefreshToken.asInstanceOf[js.Any])).asInstanceOf[Headers]
  
  @scala.inline
  def getInstallationsEndpoint(hasProjectId: AppConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallationsEndpoint")(hasProjectId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def retryIfServerError(fn: js.Function0[js.Promise[Response]]): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryIfServerError")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  
  trait ErrorResponse extends StObject {
    
    var error: Code
  }
  object ErrorResponse {
    
    @scala.inline
    def apply(error: Code): ErrorResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResponse]
    }
    
    @scala.inline
    implicit class ErrorResponseMutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
