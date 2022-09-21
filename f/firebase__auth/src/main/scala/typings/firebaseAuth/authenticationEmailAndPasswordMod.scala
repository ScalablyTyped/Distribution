package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.EMAIL_SIGNIN
import typings.firebaseAuth.firebaseAuthStrings.PASSWORD_RESET
import typings.firebaseAuth.firebaseAuthStrings.VERIFY_AND_CHANGE_EMAIL
import typings.firebaseAuth.firebaseAuthStrings.VERIFY_EMAIL
import typings.firebaseAuth.idTokenMod.IdToken
import typings.firebaseAuth.idTokenMod.IdTokenResponse
import typings.firebaseAuth.publicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticationEmailAndPasswordMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/api/authentication/email_and_password", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendEmailVerification(auth: Auth, request: VerifyEmailRequest): js.Promise[VerifyEmailResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyEmailResponse]]
  
  inline def sendPasswordResetEmail(auth: Auth, request: PasswordResetRequest): js.Promise[PasswordResetResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPasswordResetEmail")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PasswordResetResponse]]
  
  inline def sendSignInLinkToEmail(auth: Auth, request: EmailSignInRequest): js.Promise[EmailSignInResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSignInLinkToEmail")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EmailSignInResponse]]
  
  inline def signInWithPassword(auth: Auth, request: SignInWithPasswordRequest): js.Promise[SignInWithPasswordResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPassword")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignInWithPasswordResponse]]
  
  inline def verifyAndChangeEmail(auth: Auth, request: VerifyAndChangeEmailRequest): js.Promise[VerifyAndChangeEmailResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyAndChangeEmail")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyAndChangeEmailResponse]]
  
  trait EmailSignInRequest
    extends StObject
       with GetOobCodeRequest {
    
    @JSName("email")
    var email_EmailSignInRequest: String
    
    var requestType: EMAIL_SIGNIN
  }
  object EmailSignInRequest {
    
    inline def apply(email: String): EmailSignInRequest = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], requestType = "EMAIL_SIGNIN")
      __obj.asInstanceOf[EmailSignInRequest]
    }
    
    extension [Self <: EmailSignInRequest](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: EMAIL_SIGNIN): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    }
  }
  
  type EmailSignInResponse = GetOobCodeResponse
  
  trait GetOobCodeRequest extends StObject {
    
    var androidInstallApp: js.UndefOr[Boolean] = js.undefined
    
    var androidMinimumVersionCode: js.UndefOr[String] = js.undefined
    
    var androidPackageName: js.UndefOr[String] = js.undefined
    
    var canHandleCodeInApp: js.UndefOr[Boolean] = js.undefined
    
    var continueUrl: js.UndefOr[String] = js.undefined
    
    var dynamicLinkDomain: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var iOSBundleId: js.UndefOr[String] = js.undefined
    
    var iosAppStoreId: js.UndefOr[String] = js.undefined
    
    var targetProjectid: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object GetOobCodeRequest {
    
    inline def apply(): GetOobCodeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOobCodeRequest]
    }
    
    extension [Self <: GetOobCodeRequest](x: Self) {
      
      inline def setAndroidInstallApp(value: Boolean): Self = StObject.set(x, "androidInstallApp", value.asInstanceOf[js.Any])
      
      inline def setAndroidInstallAppUndefined: Self = StObject.set(x, "androidInstallApp", js.undefined)
      
      inline def setAndroidMinimumVersionCode(value: String): Self = StObject.set(x, "androidMinimumVersionCode", value.asInstanceOf[js.Any])
      
      inline def setAndroidMinimumVersionCodeUndefined: Self = StObject.set(x, "androidMinimumVersionCode", js.undefined)
      
      inline def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
      
      inline def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
      
      inline def setCanHandleCodeInApp(value: Boolean): Self = StObject.set(x, "canHandleCodeInApp", value.asInstanceOf[js.Any])
      
      inline def setCanHandleCodeInAppUndefined: Self = StObject.set(x, "canHandleCodeInApp", js.undefined)
      
      inline def setContinueUrl(value: String): Self = StObject.set(x, "continueUrl", value.asInstanceOf[js.Any])
      
      inline def setContinueUrlUndefined: Self = StObject.set(x, "continueUrl", js.undefined)
      
      inline def setDynamicLinkDomain(value: String): Self = StObject.set(x, "dynamicLinkDomain", value.asInstanceOf[js.Any])
      
      inline def setDynamicLinkDomainUndefined: Self = StObject.set(x, "dynamicLinkDomain", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setIOSBundleId(value: String): Self = StObject.set(x, "iOSBundleId", value.asInstanceOf[js.Any])
      
      inline def setIOSBundleIdUndefined: Self = StObject.set(x, "iOSBundleId", js.undefined)
      
      inline def setIosAppStoreId(value: String): Self = StObject.set(x, "iosAppStoreId", value.asInstanceOf[js.Any])
      
      inline def setIosAppStoreIdUndefined: Self = StObject.set(x, "iosAppStoreId", js.undefined)
      
      inline def setTargetProjectid(value: String): Self = StObject.set(x, "targetProjectid", value.asInstanceOf[js.Any])
      
      inline def setTargetProjectidUndefined: Self = StObject.set(x, "targetProjectid", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait GetOobCodeResponse extends StObject {
    
    var email: String
  }
  object GetOobCodeResponse {
    
    inline def apply(email: String): GetOobCodeResponse = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOobCodeResponse]
    }
    
    extension [Self <: GetOobCodeResponse](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  trait PasswordResetRequest
    extends StObject
       with GetOobCodeRequest {
    
    var captchaResp: js.UndefOr[String] = js.undefined
    
    @JSName("email")
    var email_PasswordResetRequest: String
    
    var requestType: PASSWORD_RESET
  }
  object PasswordResetRequest {
    
    inline def apply(email: String): PasswordResetRequest = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], requestType = "PASSWORD_RESET")
      __obj.asInstanceOf[PasswordResetRequest]
    }
    
    extension [Self <: PasswordResetRequest](x: Self) {
      
      inline def setCaptchaResp(value: String): Self = StObject.set(x, "captchaResp", value.asInstanceOf[js.Any])
      
      inline def setCaptchaRespUndefined: Self = StObject.set(x, "captchaResp", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: PASSWORD_RESET): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    }
  }
  
  type PasswordResetResponse = GetOobCodeResponse
  
  trait SignInWithPasswordRequest extends StObject {
    
    var email: String
    
    var password: String
    
    var returnSecureToken: js.UndefOr[Boolean] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object SignInWithPasswordRequest {
    
    inline def apply(email: String, password: String): SignInWithPasswordRequest = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInWithPasswordRequest]
    }
    
    extension [Self <: SignInWithPasswordRequest](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
      
      inline def setReturnSecureTokenUndefined: Self = StObject.set(x, "returnSecureToken", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait SignInWithPasswordResponse
    extends StObject
       with IdTokenResponse {
    
    @JSName("displayName")
    var displayName_SignInWithPasswordResponse: String
    
    var email: String
  }
  object SignInWithPasswordResponse {
    
    inline def apply(displayName: String, email: String, localId: String): SignInWithPasswordResponse = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInWithPasswordResponse]
    }
    
    extension [Self <: SignInWithPasswordResponse](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerifyAndChangeEmailRequest
    extends StObject
       with GetOobCodeRequest {
    
    var idToken: IdToken
    
    var newEmail: String
    
    var requestType: VERIFY_AND_CHANGE_EMAIL
  }
  object VerifyAndChangeEmailRequest {
    
    inline def apply(idToken: IdToken, newEmail: String): VerifyAndChangeEmailRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], newEmail = newEmail.asInstanceOf[js.Any], requestType = "VERIFY_AND_CHANGE_EMAIL")
      __obj.asInstanceOf[VerifyAndChangeEmailRequest]
    }
    
    extension [Self <: VerifyAndChangeEmailRequest](x: Self) {
      
      inline def setIdToken(value: IdToken): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setNewEmail(value: String): Self = StObject.set(x, "newEmail", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: VERIFY_AND_CHANGE_EMAIL): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyAndChangeEmailResponse = GetOobCodeRequest
  
  trait VerifyEmailRequest
    extends StObject
       with GetOobCodeRequest {
    
    var idToken: IdToken
    
    var requestType: VERIFY_EMAIL
  }
  object VerifyEmailRequest {
    
    inline def apply(idToken: IdToken): VerifyEmailRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], requestType = "VERIFY_EMAIL")
      __obj.asInstanceOf[VerifyEmailRequest]
    }
    
    extension [Self <: VerifyEmailRequest](x: Self) {
      
      inline def setIdToken(value: IdToken): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: VERIFY_EMAIL): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyEmailResponse = GetOobCodeResponse
}
