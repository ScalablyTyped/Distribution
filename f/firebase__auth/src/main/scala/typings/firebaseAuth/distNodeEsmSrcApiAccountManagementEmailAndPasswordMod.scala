package typings.firebaseAuth

import typings.firebaseAuth.distNodeEsmSrcApiAccountManagementMfaMod.MfaEnrollment
import typings.firebaseAuth.distNodeEsmSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.ActionCodeOperation
import typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcApiAccountManagementEmailAndPasswordMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/api/account_management/email_and_password", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyActionCode(auth: Auth, request: ApplyActionCodeRequest): js.Promise[ApplyActionCodeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyActionCode")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApplyActionCodeResponse]]
  
  inline def resetPassword(auth: Auth, request: ResetPasswordRequest): js.Promise[ResetPasswordResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResetPasswordResponse]]
  
  inline def updateEmailPassword(auth: Auth, request: UpdateEmailPasswordRequest): js.Promise[UpdateEmailPasswordResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateEmailPassword")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateEmailPasswordResponse]]
  
  trait ApplyActionCodeRequest extends StObject {
    
    var oobCode: String
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object ApplyActionCodeRequest {
    
    inline def apply(oobCode: String): ApplyActionCodeRequest = {
      val __obj = js.Dynamic.literal(oobCode = oobCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyActionCodeRequest]
    }
    
    extension [Self <: ApplyActionCodeRequest](x: Self) {
      
      inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait ApplyActionCodeResponse extends StObject
  
  trait ResetPasswordRequest extends StObject {
    
    var newPassword: js.UndefOr[String] = js.undefined
    
    var oobCode: String
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object ResetPasswordRequest {
    
    inline def apply(oobCode: String): ResetPasswordRequest = {
      val __obj = js.Dynamic.literal(oobCode = oobCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResetPasswordRequest]
    }
    
    extension [Self <: ResetPasswordRequest](x: Self) {
      
      inline def setNewPassword(value: String): Self = StObject.set(x, "newPassword", value.asInstanceOf[js.Any])
      
      inline def setNewPasswordUndefined: Self = StObject.set(x, "newPassword", js.undefined)
      
      inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait ResetPasswordResponse extends StObject {
    
    var email: String
    
    var mfaInfo: js.UndefOr[MfaEnrollment] = js.undefined
    
    var newEmail: js.UndefOr[String] = js.undefined
    
    var requestType: js.UndefOr[ActionCodeOperation] = js.undefined
  }
  object ResetPasswordResponse {
    
    inline def apply(email: String): ResetPasswordResponse = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResetPasswordResponse]
    }
    
    extension [Self <: ResetPasswordResponse](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setMfaInfo(value: MfaEnrollment): Self = StObject.set(x, "mfaInfo", value.asInstanceOf[js.Any])
      
      inline def setMfaInfoUndefined: Self = StObject.set(x, "mfaInfo", js.undefined)
      
      inline def setNewEmail(value: String): Self = StObject.set(x, "newEmail", value.asInstanceOf[js.Any])
      
      inline def setNewEmailUndefined: Self = StObject.set(x, "newEmail", js.undefined)
      
      inline def setRequestType(value: ActionCodeOperation): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    }
  }
  
  trait UpdateEmailPasswordRequest extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var idToken: String
    
    var password: js.UndefOr[String] = js.undefined
    
    var returnSecureToken: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateEmailPasswordRequest {
    
    inline def apply(idToken: String): UpdateEmailPasswordRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateEmailPasswordRequest]
    }
    
    extension [Self <: UpdateEmailPasswordRequest](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
      
      inline def setReturnSecureTokenUndefined: Self = StObject.set(x, "returnSecureToken", js.undefined)
    }
  }
  
  type UpdateEmailPasswordResponse = IdTokenResponse
}
