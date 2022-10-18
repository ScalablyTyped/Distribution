package typings.firebaseAuth

import typings.firebaseAuth.distRnSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distRnSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcApiAuthenticationSmsMod {
  
  @JSImport("@firebase/auth/dist/rn/src/api/authentication/sms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linkWithPhoneNumber(auth: Auth, request: LinkWithPhoneNumberRequest): js.Promise[SignInWithPhoneNumberResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPhoneNumber")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignInWithPhoneNumberResponse]]
  
  inline def sendPhoneVerificationCode(auth: Auth, request: SendPhoneVerificationCodeRequest): js.Promise[SendPhoneVerificationCodeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPhoneVerificationCode")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendPhoneVerificationCodeResponse]]
  
  inline def signInWithPhoneNumber(auth: Auth, request: SignInWithPhoneNumberRequest): js.Promise[SignInWithPhoneNumberResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPhoneNumber")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignInWithPhoneNumberResponse]]
  
  inline def verifyPhoneNumberForExisting(auth: Auth, request: SignInWithPhoneNumberRequest): js.Promise[SignInWithPhoneNumberResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPhoneNumberForExisting")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignInWithPhoneNumberResponse]]
  
  trait LinkWithPhoneNumberRequest
    extends StObject
       with SignInWithPhoneNumberRequest {
    
    var idToken: String
  }
  object LinkWithPhoneNumberRequest {
    
    inline def apply(idToken: String): LinkWithPhoneNumberRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkWithPhoneNumberRequest]
    }
    
    extension [Self <: LinkWithPhoneNumberRequest](x: Self) {
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendPhoneVerificationCodeRequest extends StObject {
    
    var phoneNumber: String
    
    var recaptchaToken: String
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object SendPhoneVerificationCodeRequest {
    
    inline def apply(phoneNumber: String, recaptchaToken: String): SendPhoneVerificationCodeRequest = {
      val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], recaptchaToken = recaptchaToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendPhoneVerificationCodeRequest]
    }
    
    extension [Self <: SendPhoneVerificationCodeRequest](x: Self) {
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setRecaptchaToken(value: String): Self = StObject.set(x, "recaptchaToken", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait SendPhoneVerificationCodeResponse extends StObject {
    
    var sessionInfo: String
  }
  object SendPhoneVerificationCodeResponse {
    
    inline def apply(sessionInfo: String): SendPhoneVerificationCodeResponse = {
      val __obj = js.Dynamic.literal(sessionInfo = sessionInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendPhoneVerificationCodeResponse]
    }
    
    extension [Self <: SendPhoneVerificationCodeResponse](x: Self) {
      
      inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignInWithPhoneNumberRequest extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var sessionInfo: js.UndefOr[String] = js.undefined
    
    var temporaryProof: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object SignInWithPhoneNumberRequest {
    
    inline def apply(): SignInWithPhoneNumberRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignInWithPhoneNumberRequest]
    }
    
    extension [Self <: SignInWithPhoneNumberRequest](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
      
      inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
      
      inline def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
      
      inline def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseAuth.distRnSrcApiAuthenticationMfaMod.PhoneOrOauthTokenResponse because Already inherited */ trait SignInWithPhoneNumberResponse
    extends StObject
       with IdTokenResponse {
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var temporaryProof: js.UndefOr[String] = js.undefined
  }
  object SignInWithPhoneNumberResponse {
    
    inline def apply(localId: String): SignInWithPhoneNumberResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInWithPhoneNumberResponse]
    }
    
    extension [Self <: SignInWithPhoneNumberResponse](x: Self) {
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
      
      inline def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
    }
  }
}
