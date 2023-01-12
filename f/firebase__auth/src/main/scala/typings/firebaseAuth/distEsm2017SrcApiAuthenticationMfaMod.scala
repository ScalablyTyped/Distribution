package typings.firebaseAuth

import typings.firebaseAuth.anon.RecaptchaToken
import typings.firebaseAuth.anon.SessionInfo
import typings.firebaseAuth.distEsm2017SrcApiAccountManagementMfaMod.MfaEnrollment
import typings.firebaseAuth.distEsm2017SrcApiAuthenticationSmsMod.SignInWithPhoneNumberRequest
import typings.firebaseAuth.distEsm2017SrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcApiAuthenticationMfaMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/api/authentication/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def finalizeSignInPhoneMfa(auth: Auth, request: FinalizePhoneMfaSignInRequest): js.Promise[FinalizePhoneMfaSignInResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("finalizeSignInPhoneMfa")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FinalizePhoneMfaSignInResponse]]
  
  inline def startSignInPhoneMfa(auth: Auth, request: StartPhoneMfaSignInRequest): js.Promise[StartPhoneMfaSignInResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("startSignInPhoneMfa")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StartPhoneMfaSignInResponse]]
  
  trait FinalizeMfaResponse extends StObject {
    
    var idToken: String
    
    var refreshToken: String
  }
  object FinalizeMfaResponse {
    
    inline def apply(idToken: String, refreshToken: String): FinalizeMfaResponse = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalizeMfaResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FinalizeMfaResponse] (val x: Self) extends AnyVal {
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait FinalizePhoneMfaSignInRequest extends StObject {
    
    var mfaPendingCredential: String
    
    var phoneVerificationInfo: SignInWithPhoneNumberRequest
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object FinalizePhoneMfaSignInRequest {
    
    inline def apply(mfaPendingCredential: String, phoneVerificationInfo: SignInWithPhoneNumberRequest): FinalizePhoneMfaSignInRequest = {
      val __obj = js.Dynamic.literal(mfaPendingCredential = mfaPendingCredential.asInstanceOf[js.Any], phoneVerificationInfo = phoneVerificationInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalizePhoneMfaSignInRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FinalizePhoneMfaSignInRequest] (val x: Self) extends AnyVal {
      
      inline def setMfaPendingCredential(value: String): Self = StObject.set(x, "mfaPendingCredential", value.asInstanceOf[js.Any])
      
      inline def setPhoneVerificationInfo(value: SignInWithPhoneNumberRequest): Self = StObject.set(x, "phoneVerificationInfo", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  type FinalizePhoneMfaSignInResponse = FinalizeMfaResponse
  
  trait IdTokenMfaResponse
    extends StObject
       with IdTokenResponse {
    
    var mfaInfo: js.UndefOr[js.Array[MfaEnrollment]] = js.undefined
    
    var mfaPendingCredential: js.UndefOr[String] = js.undefined
  }
  object IdTokenMfaResponse {
    
    inline def apply(localId: String): IdTokenMfaResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdTokenMfaResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdTokenMfaResponse] (val x: Self) extends AnyVal {
      
      inline def setMfaInfo(value: js.Array[MfaEnrollment]): Self = StObject.set(x, "mfaInfo", value.asInstanceOf[js.Any])
      
      inline def setMfaInfoUndefined: Self = StObject.set(x, "mfaInfo", js.undefined)
      
      inline def setMfaInfoVarargs(value: MfaEnrollment*): Self = StObject.set(x, "mfaInfo", js.Array(value*))
      
      inline def setMfaPendingCredential(value: String): Self = StObject.set(x, "mfaPendingCredential", value.asInstanceOf[js.Any])
      
      inline def setMfaPendingCredentialUndefined: Self = StObject.set(x, "mfaPendingCredential", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.distEsm2017SrcApiAuthenticationSmsMod.SignInWithPhoneNumberResponse
    - typings.firebaseAuth.distEsm2017SrcApiAuthenticationIdpMod.SignInWithIdpResponse
    - typings.firebaseAuth.distEsm2017SrcModelIdTokenMod.IdTokenResponse
  */
  trait PhoneOrOauthTokenResponse extends StObject
  object PhoneOrOauthTokenResponse {
    
    inline def IdTokenResponse(localId: String): typings.firebaseAuth.distEsm2017SrcModelIdTokenMod.IdTokenResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAuth.distEsm2017SrcModelIdTokenMod.IdTokenResponse]
    }
    
    inline def SignInWithIdpResponse(localId: String): typings.firebaseAuth.distEsm2017SrcApiAuthenticationIdpMod.SignInWithIdpResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAuth.distEsm2017SrcApiAuthenticationIdpMod.SignInWithIdpResponse]
    }
    
    inline def SignInWithPhoneNumberResponse(localId: String): typings.firebaseAuth.distEsm2017SrcApiAuthenticationSmsMod.SignInWithPhoneNumberResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAuth.distEsm2017SrcApiAuthenticationSmsMod.SignInWithPhoneNumberResponse]
    }
  }
  
  trait StartPhoneMfaSignInRequest extends StObject {
    
    var mfaEnrollmentId: String
    
    var mfaPendingCredential: String
    
    var phoneSignInInfo: RecaptchaToken
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object StartPhoneMfaSignInRequest {
    
    inline def apply(mfaEnrollmentId: String, mfaPendingCredential: String, phoneSignInInfo: RecaptchaToken): StartPhoneMfaSignInRequest = {
      val __obj = js.Dynamic.literal(mfaEnrollmentId = mfaEnrollmentId.asInstanceOf[js.Any], mfaPendingCredential = mfaPendingCredential.asInstanceOf[js.Any], phoneSignInInfo = phoneSignInInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartPhoneMfaSignInRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartPhoneMfaSignInRequest] (val x: Self) extends AnyVal {
      
      inline def setMfaEnrollmentId(value: String): Self = StObject.set(x, "mfaEnrollmentId", value.asInstanceOf[js.Any])
      
      inline def setMfaPendingCredential(value: String): Self = StObject.set(x, "mfaPendingCredential", value.asInstanceOf[js.Any])
      
      inline def setPhoneSignInInfo(value: RecaptchaToken): Self = StObject.set(x, "phoneSignInInfo", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait StartPhoneMfaSignInResponse extends StObject {
    
    var phoneResponseInfo: SessionInfo
  }
  object StartPhoneMfaSignInResponse {
    
    inline def apply(phoneResponseInfo: SessionInfo): StartPhoneMfaSignInResponse = {
      val __obj = js.Dynamic.literal(phoneResponseInfo = phoneResponseInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartPhoneMfaSignInResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartPhoneMfaSignInResponse] (val x: Self) extends AnyVal {
      
      inline def setPhoneResponseInfo(value: SessionInfo): Self = StObject.set(x, "phoneResponseInfo", value.asInstanceOf[js.Any])
    }
  }
}
