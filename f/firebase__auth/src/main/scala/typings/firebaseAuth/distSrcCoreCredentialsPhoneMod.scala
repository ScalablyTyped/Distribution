package typings.firebaseAuth

import typings.firebaseAuth.distSrcApiAuthenticationSmsMod.SignInWithPhoneNumberRequest
import typings.firebaseAuth.distSrcCoreCredentialsAuthCredentialMod.AuthCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreCredentialsPhoneMod {
  
  @JSImport("@firebase/auth/dist/src/core/credentials/phone", "PhoneAuthCredential")
  @js.native
  /* private */ open class PhoneAuthCredential () extends AuthCredential {
    
    /** @internal */
    def _makeVerificationRequest(): SignInWithPhoneNumberRequest = js.native
    
    /* private */ val params: Any = js.native
  }
  /* static members */
  object PhoneAuthCredential {
    
    @JSImport("@firebase/auth/dist/src/core/credentials/phone", "PhoneAuthCredential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromTokenResponse(phoneNumber: String, temporaryProof: String): PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromTokenResponse")(phoneNumber.asInstanceOf[js.Any], temporaryProof.asInstanceOf[js.Any])).asInstanceOf[PhoneAuthCredential]
    
    /** @internal */
    inline def _fromVerification(verificationId: String, verificationCode: String): PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromVerification")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[PhoneAuthCredential]
    
    inline def fromJSON(json: String): PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PhoneAuthCredential | Null]
    /** Generates a phone credential based on a plain object or a JSON string. */
    inline def fromJSON(json: js.Object): PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PhoneAuthCredential | Null]
  }
  
  trait PhoneAuthCredentialParameters extends StObject {
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var temporaryProof: js.UndefOr[String] = js.undefined
    
    var verificationCode: js.UndefOr[String] = js.undefined
    
    var verificationId: js.UndefOr[String] = js.undefined
  }
  object PhoneAuthCredentialParameters {
    
    inline def apply(): PhoneAuthCredentialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneAuthCredentialParameters]
    }
    
    extension [Self <: PhoneAuthCredentialParameters](x: Self) {
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
      
      inline def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
      
      inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
      
      inline def setVerificationCodeUndefined: Self = StObject.set(x, "verificationCode", js.undefined)
      
      inline def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
      
      inline def setVerificationIdUndefined: Self = StObject.set(x, "verificationId", js.undefined)
    }
  }
}
