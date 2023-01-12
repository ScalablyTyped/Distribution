package typings.firebaseAuth

import typings.firebaseAuth.distNodeEsmSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcApiAuthenticationEmailLinkMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/api/authentication/email_link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signInWithEmailLink(auth: Auth, request: SignInWithEmailLinkRequest): js.Promise[SignInWithEmailLinkResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLink")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignInWithEmailLinkResponse]]
  
  inline def signInWithEmailLinkForLinking(auth: Auth, request: SignInWithEmailLinkForLinkingRequest): js.Promise[SignInWithEmailLinkResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithEmailLinkForLinking")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignInWithEmailLinkResponse]]
  
  trait SignInWithEmailLinkForLinkingRequest
    extends StObject
       with SignInWithEmailLinkRequest {
    
    var idToken: String
  }
  object SignInWithEmailLinkForLinkingRequest {
    
    inline def apply(email: String, idToken: String, oobCode: String): SignInWithEmailLinkForLinkingRequest = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], oobCode = oobCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInWithEmailLinkForLinkingRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignInWithEmailLinkForLinkingRequest] (val x: Self) extends AnyVal {
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignInWithEmailLinkRequest extends StObject {
    
    var email: String
    
    var oobCode: String
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object SignInWithEmailLinkRequest {
    
    inline def apply(email: String, oobCode: String): SignInWithEmailLinkRequest = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], oobCode = oobCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInWithEmailLinkRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignInWithEmailLinkRequest] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait SignInWithEmailLinkResponse
    extends StObject
       with IdTokenResponse {
    
    var email: String
    
    @JSName("isNewUser")
    var isNewUser_SignInWithEmailLinkResponse: Boolean
  }
  object SignInWithEmailLinkResponse {
    
    inline def apply(email: String, isNewUser: Boolean, localId: String): SignInWithEmailLinkResponse = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], isNewUser = isNewUser.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInWithEmailLinkResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignInWithEmailLinkResponse] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    }
  }
}
