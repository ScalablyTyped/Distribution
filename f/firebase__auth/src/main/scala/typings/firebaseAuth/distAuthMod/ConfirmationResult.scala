package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmationResult extends StObject {
  
  /**
    * Finishes a phone number sign-in, link, or reauthentication.
    *
    * @example
    * ```javascript
    * const confirmationResult = await signInWithPhoneNumber(auth, phoneNumber, applicationVerifier);
    * // Obtain verificationCode from the user.
    * const userCredential = await confirmationResult.confirm(verificationCode);
    * ```
    *
    * @param verificationCode - The code that was sent to the user's mobile device.
    */
  def confirm(verificationCode: String): js.Promise[UserCredential]
  
  /**
    * The phone number authentication operation's verification ID.
    *
    * @remarks
    * This can be used along with the verification code to initialize a
    * {@link PhoneAuthCredential}.
    */
  val verificationId: String
}
object ConfirmationResult {
  
  inline def apply(confirm: String => js.Promise[UserCredential], verificationId: String): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), verificationId = verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationResult]
  }
  
  extension [Self <: ConfirmationResult](x: Self) {
    
    inline def setConfirm(value: String => js.Promise[UserCredential]): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
    
    inline def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
  }
}
