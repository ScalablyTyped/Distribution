package typings.firebaseAuth

import typings.firebaseAuth.distNodeSrcApiMod.RecaptchaClientType
import typings.firebaseAuth.distNodeSrcApiMod.RecaptchaVersion
import typings.firebaseAuth.distNodeSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcApiAuthenticationSignUpMod {
  
  @JSImport("@firebase/auth/dist/node/src/api/authentication/sign_up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signUp(auth: Auth, request: SignUpRequest): js.Promise[SignUpResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("signUp")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignUpResponse]]
  
  trait SignUpRequest extends StObject {
    
    var captchaResponse: js.UndefOr[String] = js.undefined
    
    var clientType: js.UndefOr[RecaptchaClientType] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var recaptchaVersion: js.UndefOr[RecaptchaVersion] = js.undefined
    
    var returnSecureToken: js.UndefOr[Boolean] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object SignUpRequest {
    
    inline def apply(): SignUpRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignUpRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignUpRequest] (val x: Self) extends AnyVal {
      
      inline def setCaptchaResponse(value: String): Self = StObject.set(x, "captchaResponse", value.asInstanceOf[js.Any])
      
      inline def setCaptchaResponseUndefined: Self = StObject.set(x, "captchaResponse", js.undefined)
      
      inline def setClientType(value: RecaptchaClientType): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
      
      inline def setClientTypeUndefined: Self = StObject.set(x, "clientType", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setRecaptchaVersion(value: RecaptchaVersion): Self = StObject.set(x, "recaptchaVersion", value.asInstanceOf[js.Any])
      
      inline def setRecaptchaVersionUndefined: Self = StObject.set(x, "recaptchaVersion", js.undefined)
      
      inline def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
      
      inline def setReturnSecureTokenUndefined: Self = StObject.set(x, "returnSecureToken", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait SignUpResponse
    extends StObject
       with IdTokenResponse {
    
    @JSName("displayName")
    var displayName_SignUpResponse: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
  }
  object SignUpResponse {
    
    inline def apply(localId: String): SignUpResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignUpResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignUpResponse] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    }
  }
}
