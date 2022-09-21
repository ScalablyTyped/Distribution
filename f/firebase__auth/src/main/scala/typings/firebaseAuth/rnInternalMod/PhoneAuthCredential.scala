package typings.firebaseAuth.rnInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/rn/internal", "PhoneAuthCredential")
@js.native
/* private */ open class PhoneAuthCredential ()
  extends typings.firebaseAuth.rnMod.PhoneAuthCredential
/* static members */
object PhoneAuthCredential {
  
  @JSImport("@firebase/auth/dist/rn/internal", "PhoneAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromTokenResponse(phoneNumber: String, temporaryProof: String): typings.firebaseAuth.rnSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromTokenResponse")(phoneNumber.asInstanceOf[js.Any], temporaryProof.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.rnSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
  
  /** @internal */
  inline def _fromVerification(verificationId: String, verificationCode: String): typings.firebaseAuth.rnSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromVerification")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.rnSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
  
  inline def fromJSON(json: String): typings.firebaseAuth.rnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.rnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
  /** Generates a phone credential based on a plain object or a JSON string. */
  inline def fromJSON(json: js.Object): typings.firebaseAuth.rnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.rnSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
}
