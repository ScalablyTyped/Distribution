package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/auth", "PhoneAuthCredential")
@js.native
/* private */ open class PhoneAuthCredential () extends AuthCredential {
  
  /** @internal */
  def _makeVerificationRequest(): SignInWithPhoneNumberRequest = js.native
  
  /* private */ val params: Any = js.native
}
/* static members */
object PhoneAuthCredential {
  
  @JSImport("@firebase/auth/dist/auth", "PhoneAuthCredential")
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
