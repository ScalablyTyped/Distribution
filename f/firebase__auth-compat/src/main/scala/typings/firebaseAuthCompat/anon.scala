package typings.firebaseAuthCompat

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.firebaseAuthCompat.mod.FirebaseApp
import typings.firebaseAuthTypes.mod.AuthCredential
import typings.firebaseAuthTypes.mod.EmailAuthProvider
import typings.firebaseAuthTypes.mod.EmailAuthProviderInstance
import typings.firebaseAuthTypes.mod.FacebookAuthProvider
import typings.firebaseAuthTypes.mod.FacebookAuthProviderInstance
import typings.firebaseAuthTypes.mod.FirebaseAuth
import typings.firebaseAuthTypes.mod.GithubAuthProvider
import typings.firebaseAuthTypes.mod.GithubAuthProviderInstance
import typings.firebaseAuthTypes.mod.GoogleAuthProvider
import typings.firebaseAuthTypes.mod.GoogleAuthProviderInstance
import typings.firebaseAuthTypes.mod.PhoneAuthCredential
import typings.firebaseAuthTypes.mod.PhoneAuthProvider
import typings.firebaseAuthTypes.mod.PhoneAuthProviderInstance
import typings.firebaseAuthTypes.mod.PhoneMultiFactorAssertion
import typings.firebaseAuthTypes.mod.PhoneMultiFactorGenerator
import typings.firebaseAuthTypes.mod.RecaptchaVerifierInstance
import typings.firebaseAuthTypes.mod.TwitterAuthProvider
import typings.firebaseAuthTypes.mod.TwitterAuthProviderInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(): FirebaseAuth = js.native
    def apply(app: FirebaseApp): FirebaseAuth = js.native
    
    var Auth: TypeofFirebaseAuth = js.native
    
    var EmailAuthProvider: TypeofEmailAuthProvider = js.native
    
    var EmailAuthProvider_Instance: Instantiable0[EmailAuthProviderInstance] = js.native
    
    var FacebookAuthProvider: TypeofFacebookAuthProvide = js.native
    
    var FacebookAuthProvider_Instance: Instantiable0[FacebookAuthProviderInstance] = js.native
    
    var GithubAuthProvider: TypeofGithubAuthProvider = js.native
    
    var GithubAuthProvider_Instance: Instantiable0[GithubAuthProviderInstance] = js.native
    
    var GoogleAuthProvider: TypeofGoogleAuthProvider = js.native
    
    var GoogleAuthProvider_Instance: Instantiable0[GoogleAuthProviderInstance] = js.native
    
    var OAuthProvider: Instantiable1[/* providerId */ String, typings.firebaseAuthTypes.mod.OAuthProvider] = js.native
    
    var PhoneAuthProvider: TypeofPhoneAuthProvider = js.native
    
    var PhoneAuthProvider_Instance: Instantiable0[PhoneAuthProviderInstance] = js.native
    
    var PhoneMultiFactorGenerator: TypeofPhoneMultiFactorGen = js.native
    
    var RecaptchaVerifier: Instantiable1[/* container */ Any, typings.firebaseAuthTypes.mod.RecaptchaVerifier] = js.native
    
    var RecaptchaVerifier_Instance: Instantiable1[/* container */ Any, RecaptchaVerifierInstance] = js.native
    
    var SAMLAuthProvider: Instantiable1[/* providerId */ String, typings.firebaseAuthTypes.mod.SAMLAuthProvider] = js.native
    
    var TwitterAuthProvider: TypeofTwitterAuthProvider = js.native
    
    var TwitterAuthProvider_Instance: Instantiable0[TwitterAuthProviderInstance] = js.native
  }
  
  trait DisableWarnings extends StObject {
    
    var disableWarnings: Boolean
  }
  object DisableWarnings {
    
    inline def apply(disableWarnings: Boolean): DisableWarnings = {
      val __obj = js.Dynamic.literal(disableWarnings = disableWarnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableWarnings]
    }
    
    extension [Self <: DisableWarnings](x: Self) {
      
      inline def setDisableWarnings(value: Boolean): Self = StObject.set(x, "disableWarnings", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayName extends StObject {
    
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    var photoURL: js.UndefOr[String | Null] = js.undefined
  }
  object DisplayName {
    
    inline def apply(): DisplayName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayName]
    }
    
    extension [Self <: DisplayName](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
      
      inline def setPhotoURLNull: Self = StObject.set(x, "photoURL", null)
      
      inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
    }
  }
  
  trait LOCAL extends StObject {
    
    var LOCAL: String
    
    var NONE: String
    
    var SESSION: String
  }
  object LOCAL {
    
    inline def apply(LOCAL: String, NONE: String, SESSION: String): LOCAL = {
      val __obj = js.Dynamic.literal(LOCAL = LOCAL.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], SESSION = SESSION.asInstanceOf[js.Any])
      __obj.asInstanceOf[LOCAL]
    }
    
    extension [Self <: LOCAL](x: Self) {
      
      inline def setLOCAL(value: String): Self = StObject.set(x, "LOCAL", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: String): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setSESSION(value: String): Self = StObject.set(x, "SESSION", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofEmailAuthProvider
    extends StObject
       with Instantiable0[EmailAuthProvider] {
    
    var EMAIL_LINK_SIGN_IN_METHOD: String = js.native
    
    var EMAIL_PASSWORD_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(email: String, password: String): AuthCredential = js.native
    
    def credentialWithLink(email: String, emailLink: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofFacebookAuthProvide
    extends StObject
       with Instantiable0[FacebookAuthProvider] {
    
    var FACEBOOK_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(token: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofFirebaseAuth
    extends StObject
       with Instantiable0[FirebaseAuth] {
    
    var Persistence: typings.firebaseAuthTypes.anon.LOCAL = js.native
  }
  
  @js.native
  trait TypeofGithubAuthProvider
    extends StObject
       with Instantiable0[GithubAuthProvider] {
    
    var GITHUB_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(token: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofGoogleAuthProvider
    extends StObject
       with Instantiable0[GoogleAuthProvider] {
    
    var GOOGLE_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(): AuthCredential = js.native
    def credential(idToken: String): AuthCredential = js.native
    def credential(idToken: String, accessToken: String): AuthCredential = js.native
    def credential(idToken: Null, accessToken: String): AuthCredential = js.native
    def credential(idToken: Unit, accessToken: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofPhoneAuthProvider
    extends StObject
       with Instantiable0[PhoneAuthProvider] {
    
    var PHONE_SIGN_IN_METHOD: String = js.native
    
    var PROVIDER_ID: String = js.native
    
    def credential(verificationId: String, verificationCode: String): AuthCredential = js.native
  }
  
  @js.native
  trait TypeofPhoneMultiFactorGen
    extends StObject
       with Instantiable0[PhoneMultiFactorGenerator] {
    
    var FACTOR_ID: String = js.native
    
    def assertion(phoneAuthCredential: PhoneAuthCredential): PhoneMultiFactorAssertion = js.native
  }
  
  @js.native
  trait TypeofTwitterAuthProvider
    extends StObject
       with Instantiable0[TwitterAuthProvider] {
    
    var PROVIDER_ID: String = js.native
    
    var TWITTER_SIGN_IN_METHOD: String = js.native
    
    def credential(token: String, secret: String): AuthCredential = js.native
  }
}
