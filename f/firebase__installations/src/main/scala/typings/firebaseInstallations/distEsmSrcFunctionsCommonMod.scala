package typings.firebaseInstallations

import typings.firebaseInstallations.anon.Code
import typings.firebaseInstallations.distEsmSrcInterfacesApiResponseMod.GenerateAuthTokenResponse
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.CompletedAuthToken
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry
import typings.firebaseInstallations.distEsmSrcInterfacesInstallationImplMod.AppConfig
import typings.firebaseUtil.mod.FirebaseError
import typings.std.Headers
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcFunctionsCommonMod {
  
  @JSImport("@firebase/installations/dist/esm/src/functions/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractAuthTokenInfoFromResponse(response: GenerateAuthTokenResponse): CompletedAuthToken = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAuthTokenInfoFromResponse")(response.asInstanceOf[js.Any]).asInstanceOf[CompletedAuthToken]
  
  inline def getErrorFromResponse(requestName: String, response: Response): js.Promise[FirebaseError] = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFromResponse")(requestName.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FirebaseError]]
  
  inline def getHeaders(param0: AppConfig): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaders")(param0.asInstanceOf[js.Any]).asInstanceOf[Headers]
  
  inline def getHeadersWithAuth(appConfig: AppConfig, param1: RegisteredInstallationEntry): Headers = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersWithAuth")(appConfig.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Headers]
  
  inline def getInstallationsEndpoint(param0: AppConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallationsEndpoint")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def retryIfServerError(fn: js.Function0[js.Promise[Response]]): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryIfServerError")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  
  trait ErrorResponse extends StObject {
    
    var error: Code
  }
  object ErrorResponse {
    
    inline def apply(error: Code): ErrorResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
