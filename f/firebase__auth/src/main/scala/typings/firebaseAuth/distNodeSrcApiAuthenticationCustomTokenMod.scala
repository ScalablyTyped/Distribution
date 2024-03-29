package typings.firebaseAuth

import typings.firebaseAuth.distNodeSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcApiAuthenticationCustomTokenMod {
  
  @JSImport("@firebase/auth/dist/node/src/api/authentication/custom_token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signInWithCustomToken(auth: Auth, request: SignInWithCustomTokenRequest): js.Promise[SignInWithCustomTokenResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCustomToken")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignInWithCustomTokenResponse]]
  
  trait SignInWithCustomTokenRequest extends StObject {
    
    var returnSecureToken: Boolean
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var token: String
  }
  object SignInWithCustomTokenRequest {
    
    inline def apply(returnSecureToken: Boolean, token: String): SignInWithCustomTokenRequest = {
      val __obj = js.Dynamic.literal(returnSecureToken = returnSecureToken.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInWithCustomTokenRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignInWithCustomTokenRequest] (val x: Self) extends AnyVal {
      
      inline def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  type SignInWithCustomTokenResponse = IdTokenResponse
}
