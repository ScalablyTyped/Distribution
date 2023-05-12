package typings.firebaseAuth

import typings.firebaseAuth.anon.FinalizeEnrollmentTime
import typings.firebaseAuth.anon.PhoneNumber
import typings.firebaseAuth.anon.SessionInfo
import typings.firebaseAuth.distRnSrcApiAuthenticationMfaMod.FinalizeMfaResponse
import typings.firebaseAuth.distRnSrcApiAuthenticationSmsMod.SignInWithPhoneNumberRequest
import typings.firebaseAuth.distRnSrcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcApiAccountManagementMfaMod {
  
  @JSImport("@firebase/auth/dist/rn/src/api/account_management/mfa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def finalizeEnrollPhoneMfa(auth: AuthInternal, request: FinalizePhoneMfaEnrollmentRequest): js.Promise[FinalizePhoneMfaEnrollmentResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("finalizeEnrollPhoneMfa")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FinalizePhoneMfaEnrollmentResponse]]
  
  inline def finalizeEnrollTotpMfa(auth: AuthInternal, request: FinalizeTotpMfaEnrollmentRequest): js.Promise[FinalizeTotpMfaEnrollmentResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("finalizeEnrollTotpMfa")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FinalizeTotpMfaEnrollmentResponse]]
  
  inline def startEnrollPhoneMfa(auth: AuthInternal, request: StartPhoneMfaEnrollmentRequest): js.Promise[StartPhoneMfaEnrollmentResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("startEnrollPhoneMfa")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StartPhoneMfaEnrollmentResponse]]
  
  inline def startEnrollTotpMfa(auth: AuthInternal, request: StartTotpMfaEnrollmentRequest): js.Promise[StartTotpMfaEnrollmentResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("startEnrollTotpMfa")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StartTotpMfaEnrollmentResponse]]
  
  inline def withdrawMfa(auth: AuthInternal, request: WithdrawMfaRequest): js.Promise[WithdrawMfaResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("withdrawMfa")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WithdrawMfaResponse]]
  
  /**
    * MFA Info as returned by the API.
    */
  trait BaseMfaEnrollment extends StObject {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var enrolledAt: Double
    
    var mfaEnrollmentId: String
  }
  object BaseMfaEnrollment {
    
    inline def apply(enrolledAt: Double, mfaEnrollmentId: String): BaseMfaEnrollment = {
      val __obj = js.Dynamic.literal(enrolledAt = enrolledAt.asInstanceOf[js.Any], mfaEnrollmentId = mfaEnrollmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseMfaEnrollment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseMfaEnrollment] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEnrolledAt(value: Double): Self = StObject.set(x, "enrolledAt", value.asInstanceOf[js.Any])
      
      inline def setMfaEnrollmentId(value: String): Self = StObject.set(x, "mfaEnrollmentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait FinalizePhoneMfaEnrollmentRequest extends StObject {
    
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    var idToken: String
    
    var phoneVerificationInfo: SignInWithPhoneNumberRequest
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object FinalizePhoneMfaEnrollmentRequest {
    
    inline def apply(idToken: String, phoneVerificationInfo: SignInWithPhoneNumberRequest): FinalizePhoneMfaEnrollmentRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], phoneVerificationInfo = phoneVerificationInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalizePhoneMfaEnrollmentRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FinalizePhoneMfaEnrollmentRequest] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setPhoneVerificationInfo(value: SignInWithPhoneNumberRequest): Self = StObject.set(x, "phoneVerificationInfo", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  type FinalizePhoneMfaEnrollmentResponse = FinalizeMfaResponse
  
  trait FinalizeTotpMfaEnrollmentRequest extends StObject {
    
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    var idToken: String
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var totpVerificationInfo: TotpVerificationInfo
  }
  object FinalizeTotpMfaEnrollmentRequest {
    
    inline def apply(idToken: String, totpVerificationInfo: TotpVerificationInfo): FinalizeTotpMfaEnrollmentRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], totpVerificationInfo = totpVerificationInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalizeTotpMfaEnrollmentRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FinalizeTotpMfaEnrollmentRequest] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setTotpVerificationInfo(value: TotpVerificationInfo): Self = StObject.set(x, "totpVerificationInfo", value.asInstanceOf[js.Any])
    }
  }
  
  type FinalizeTotpMfaEnrollmentResponse = FinalizeMfaResponse
  
  type MfaEnrollment = PhoneMfaEnrollment | TotpMfaEnrollment
  
  trait PhoneMfaEnrollment
    extends StObject
       with BaseMfaEnrollment {
    
    var phoneInfo: String
  }
  object PhoneMfaEnrollment {
    
    inline def apply(enrolledAt: Double, mfaEnrollmentId: String, phoneInfo: String): PhoneMfaEnrollment = {
      val __obj = js.Dynamic.literal(enrolledAt = enrolledAt.asInstanceOf[js.Any], mfaEnrollmentId = mfaEnrollmentId.asInstanceOf[js.Any], phoneInfo = phoneInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneMfaEnrollment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhoneMfaEnrollment] (val x: Self) extends AnyVal {
      
      inline def setPhoneInfo(value: String): Self = StObject.set(x, "phoneInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartPhoneMfaEnrollmentRequest extends StObject {
    
    var idToken: String
    
    var phoneEnrollmentInfo: PhoneNumber
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object StartPhoneMfaEnrollmentRequest {
    
    inline def apply(idToken: String, phoneEnrollmentInfo: PhoneNumber): StartPhoneMfaEnrollmentRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], phoneEnrollmentInfo = phoneEnrollmentInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartPhoneMfaEnrollmentRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartPhoneMfaEnrollmentRequest] (val x: Self) extends AnyVal {
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setPhoneEnrollmentInfo(value: PhoneNumber): Self = StObject.set(x, "phoneEnrollmentInfo", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait StartPhoneMfaEnrollmentResponse extends StObject {
    
    var phoneSessionInfo: SessionInfo
  }
  object StartPhoneMfaEnrollmentResponse {
    
    inline def apply(phoneSessionInfo: SessionInfo): StartPhoneMfaEnrollmentResponse = {
      val __obj = js.Dynamic.literal(phoneSessionInfo = phoneSessionInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartPhoneMfaEnrollmentResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartPhoneMfaEnrollmentResponse] (val x: Self) extends AnyVal {
      
      inline def setPhoneSessionInfo(value: SessionInfo): Self = StObject.set(x, "phoneSessionInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartTotpMfaEnrollmentRequest extends StObject {
    
    var idToken: String
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object StartTotpMfaEnrollmentRequest {
    
    inline def apply(idToken: String): StartTotpMfaEnrollmentRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartTotpMfaEnrollmentRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartTotpMfaEnrollmentRequest] (val x: Self) extends AnyVal {
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait StartTotpMfaEnrollmentResponse extends StObject {
    
    var totpSessionInfo: FinalizeEnrollmentTime
  }
  object StartTotpMfaEnrollmentResponse {
    
    inline def apply(totpSessionInfo: FinalizeEnrollmentTime): StartTotpMfaEnrollmentResponse = {
      val __obj = js.Dynamic.literal(totpSessionInfo = totpSessionInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartTotpMfaEnrollmentResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartTotpMfaEnrollmentResponse] (val x: Self) extends AnyVal {
      
      inline def setTotpSessionInfo(value: FinalizeEnrollmentTime): Self = StObject.set(x, "totpSessionInfo", value.asInstanceOf[js.Any])
    }
  }
  
  type TotpMfaEnrollment = BaseMfaEnrollment
  
  trait TotpVerificationInfo extends StObject {
    
    var sessionInfo: String
    
    var verificationCode: String
  }
  object TotpVerificationInfo {
    
    inline def apply(sessionInfo: String, verificationCode: String): TotpVerificationInfo = {
      val __obj = js.Dynamic.literal(sessionInfo = sessionInfo.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TotpVerificationInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TotpVerificationInfo] (val x: Self) extends AnyVal {
      
      inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
      
      inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithdrawMfaRequest extends StObject {
    
    var idToken: String
    
    var mfaEnrollmentId: String
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object WithdrawMfaRequest {
    
    inline def apply(idToken: String, mfaEnrollmentId: String): WithdrawMfaRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], mfaEnrollmentId = mfaEnrollmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithdrawMfaRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithdrawMfaRequest] (val x: Self) extends AnyVal {
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setMfaEnrollmentId(value: String): Self = StObject.set(x, "mfaEnrollmentId", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  type WithdrawMfaResponse = FinalizeMfaResponse
}
