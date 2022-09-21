package typings.firebaseAuthCompat

import typings.firebaseAuthCompat.firebaseAuthCompatStrings.phone
import typings.firebaseAuthTypes.mod.ApplicationVerifier
import typings.firebaseAuthTypes.mod.AuthCredential
import typings.firebaseAuthTypes.mod.PhoneMultiFactorEnrollInfoOptions
import typings.firebaseAuthTypes.mod.PhoneMultiFactorSignInInfoOptions
import typings.firebaseAuthTypes.mod.PhoneSingleFactorInfoOptions
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneAuthProviderMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/phone_auth_provider", "PhoneAuthProvider")
  @js.native
  open class PhoneAuthProvider ()
    extends typings.firebaseAuthTypes.mod.PhoneAuthProvider
       with Compat[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.PhoneAuthProvider */ Any
        ] {
    
    /* CompleteClass */
    var _delegate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.PhoneAuthProvider */ Any = js.native
    
    def unwrap(): Any = js.native
    
    def verifyPhoneNumber(phoneInfoOptions: PhoneMultiFactorEnrollInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
    def verifyPhoneNumber(phoneInfoOptions: PhoneMultiFactorSignInInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
    def verifyPhoneNumber(phoneInfoOptions: PhoneSingleFactorInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
  }
  /* static members */
  object PhoneAuthProvider {
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/phone_auth_provider", "PhoneAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/phone_auth_provider", "PhoneAuthProvider.PHONE_SIGN_IN_METHOD")
    @js.native
    def PHONE_SIGN_IN_METHOD: phone = js.native
    inline def PHONE_SIGN_IN_METHOD_=(x: phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHONE_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/phone_auth_provider", "PhoneAuthProvider.PROVIDER_ID")
    @js.native
    def PROVIDER_ID: phone = js.native
    inline def PROVIDER_ID_=(x: phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
    
    inline def credential(verificationId: String, verificationCode: String): AuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[AuthCredential]
  }
}
