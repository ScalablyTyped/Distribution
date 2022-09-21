package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignCreateAuthUriResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignDeleteAccountResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignDownloadAccountResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignEmailLinkSigninResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignGetAccountInfoResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignGetOobConfirmationCodeResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignGetRecaptchaParamResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignResetPasswordResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignSetAccountInfoResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignSignupNewUserResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignUploadAccountResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignVerifyAssertionResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignVerifyCustomTokenResponse
import typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignVerifyPasswordResponse
import typings.firebaseAuth.nodeSrcApiAuthenticationMfaMod.PhoneOrOauthTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeSrcModelIdTokenMod {
  
  type IdToken = String
  
  trait IdTokenResponse
    extends StObject
       with PhoneOrOauthTokenResponse {
    
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    var expiresIn: js.UndefOr[String] = js.undefined
    
    var idToken: js.UndefOr[IdToken] = js.undefined
    
    var isNewUser: js.UndefOr[Boolean] = js.undefined
    
    var kind: js.UndefOr[IdTokenResponseKind] = js.undefined
    
    var localId: String
    
    var photoUrl: js.UndefOr[String | Null] = js.undefined
    
    var providerId: js.UndefOr[String] = js.undefined
    
    var rawUserInfo: js.UndefOr[String] = js.undefined
    
    var refreshToken: js.UndefOr[String] = js.undefined
    
    var screenName: js.UndefOr[String | Null] = js.undefined
  }
  object IdTokenResponse {
    
    inline def apply(localId: String): IdTokenResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdTokenResponse]
    }
    
    extension [Self <: IdTokenResponse](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setIdToken(value: IdToken): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
      
      inline def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
      
      inline def setKind(value: IdTokenResponseKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
      
      inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
      
      inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
      
      inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
      
      inline def setRawUserInfo(value: String): Self = StObject.set(x, "rawUserInfo", value.asInstanceOf[js.Any])
      
      inline def setRawUserInfoUndefined: Self = StObject.set(x, "rawUserInfo", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
      
      inline def setScreenNameNull: Self = StObject.set(x, "screenName", null)
      
      inline def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignCreateAuthUriResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignDeleteAccountResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignDownloadAccountResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignEmailLinkSigninResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignGetAccountInfoResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignGetOobConfirmationCodeResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignGetRecaptchaParamResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignResetPasswordResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignSetAccountInfoResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignSignupNewUserResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignUploadAccountResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignVerifyAssertionResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignVerifyCustomTokenResponse
    - typings.firebaseAuth.firebaseAuthStrings.identitytoolkitNumbersignVerifyPasswordResponse
  */
  trait IdTokenResponseKind extends StObject
  object IdTokenResponseKind {
    
    inline def CreateAuthUri: identitytoolkitNumbersignCreateAuthUriResponse = "identitytoolkit#CreateAuthUriResponse".asInstanceOf[identitytoolkitNumbersignCreateAuthUriResponse]
    
    inline def DeleteAccount: identitytoolkitNumbersignDeleteAccountResponse = "identitytoolkit#DeleteAccountResponse".asInstanceOf[identitytoolkitNumbersignDeleteAccountResponse]
    
    inline def DownloadAccount: identitytoolkitNumbersignDownloadAccountResponse = "identitytoolkit#DownloadAccountResponse".asInstanceOf[identitytoolkitNumbersignDownloadAccountResponse]
    
    inline def EmailLinkSignin: identitytoolkitNumbersignEmailLinkSigninResponse = "identitytoolkit#EmailLinkSigninResponse".asInstanceOf[identitytoolkitNumbersignEmailLinkSigninResponse]
    
    inline def GetAccountInfo: identitytoolkitNumbersignGetAccountInfoResponse = "identitytoolkit#GetAccountInfoResponse".asInstanceOf[identitytoolkitNumbersignGetAccountInfoResponse]
    
    inline def GetOobConfirmationCode: identitytoolkitNumbersignGetOobConfirmationCodeResponse = "identitytoolkit#GetOobConfirmationCodeResponse".asInstanceOf[identitytoolkitNumbersignGetOobConfirmationCodeResponse]
    
    inline def GetRecaptchaParam: identitytoolkitNumbersignGetRecaptchaParamResponse = "identitytoolkit#GetRecaptchaParamResponse".asInstanceOf[identitytoolkitNumbersignGetRecaptchaParamResponse]
    
    inline def ResetPassword: identitytoolkitNumbersignResetPasswordResponse = "identitytoolkit#ResetPasswordResponse".asInstanceOf[identitytoolkitNumbersignResetPasswordResponse]
    
    inline def SetAccountInfo: identitytoolkitNumbersignSetAccountInfoResponse = "identitytoolkit#SetAccountInfoResponse".asInstanceOf[identitytoolkitNumbersignSetAccountInfoResponse]
    
    inline def SignupNewUser: identitytoolkitNumbersignSignupNewUserResponse = "identitytoolkit#SignupNewUserResponse".asInstanceOf[identitytoolkitNumbersignSignupNewUserResponse]
    
    inline def UploadAccount: identitytoolkitNumbersignUploadAccountResponse = "identitytoolkit#UploadAccountResponse".asInstanceOf[identitytoolkitNumbersignUploadAccountResponse]
    
    inline def VerifyAssertion: identitytoolkitNumbersignVerifyAssertionResponse = "identitytoolkit#VerifyAssertionResponse".asInstanceOf[identitytoolkitNumbersignVerifyAssertionResponse]
    
    inline def VerifyCustomToken: identitytoolkitNumbersignVerifyCustomTokenResponse = "identitytoolkit#VerifyCustomTokenResponse".asInstanceOf[identitytoolkitNumbersignVerifyCustomTokenResponse]
    
    inline def VerifyPassword: identitytoolkitNumbersignVerifyPasswordResponse = "identitytoolkit#VerifyPasswordResponse".asInstanceOf[identitytoolkitNumbersignVerifyPasswordResponse]
  }
  
  trait ParsedIdToken extends StObject {
    
    var anonymous: Boolean
    
    var aud: String
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var exp: Double
    
    var federatedId: js.UndefOr[String] = js.undefined
    
    var iat: Double
    
    var iss: String
    
    var photoURL: js.UndefOr[String] = js.undefined
    
    var providerId: js.UndefOr[String] = js.undefined
    
    var sub: String
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var verified: Boolean
  }
  object ParsedIdToken {
    
    inline def apply(
      anonymous: Boolean,
      aud: String,
      exp: Double,
      iat: Double,
      iss: String,
      sub: String,
      verified: Boolean
    ): ParsedIdToken = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedIdToken]
    }
    
    extension [Self <: ParsedIdToken](x: Self) {
      
      inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFederatedId(value: String): Self = StObject.set(x, "federatedId", value.asInstanceOf[js.Any])
      
      inline def setFederatedIdUndefined: Self = StObject.set(x, "federatedId", js.undefined)
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
      
      inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaggedWithTokenResponse extends StObject {
    
    var _tokenResponse: js.UndefOr[PhoneOrOauthTokenResponse] = js.undefined
  }
  object TaggedWithTokenResponse {
    
    inline def apply(): TaggedWithTokenResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaggedWithTokenResponse]
    }
    
    extension [Self <: TaggedWithTokenResponse](x: Self) {
      
      inline def set_tokenResponse(value: PhoneOrOauthTokenResponse): Self = StObject.set(x, "_tokenResponse", value.asInstanceOf[js.Any])
      
      inline def set_tokenResponseUndefined: Self = StObject.set(x, "_tokenResponse", js.undefined)
    }
  }
}
