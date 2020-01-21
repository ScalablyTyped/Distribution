package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Phone number auth provider.
  *
  * @example
  * ```javascript
  * // 'recaptcha-container' is the ID of an element in the DOM.
  * var applicationVerifier = new firebase.auth.RecaptchaVerifier(
  *     'recaptcha-container');
  * var provider = new firebase.auth.PhoneAuthProvider();
  * provider.verifyPhoneNumber('+16505550101', applicationVerifier)
  *     .then(function(verificationId) {
  *       var verificationCode = window.prompt('Please enter the verification ' +
  *           'code that was sent to your mobile device.');
  *       return firebase.auth.PhoneAuthProvider.credential(verificationId,
  *           verificationCode);
  *     })
  *     .then(function(phoneCredential) {
  *       return firebase.auth().signInWithCredential(phoneCredential);
  *     });
  * ```
  * @param auth The Firebase Auth instance in which
  *     sign-ins should occur. Uses the default Auth instance if unspecified.
  */
@JSImport("firebase", "auth.PhoneAuthProvider")
@js.native
class PhoneAuthProvider () extends PhoneAuthProviderInstance

/* static members */
@JSImport("firebase", "auth.PhoneAuthProvider")
@js.native
object PhoneAuthProvider extends js.Object {
  /**
    * This corresponds to the sign-in method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    */
  var PHONE_SIGN_IN_METHOD: String = js.native
  var PROVIDER_ID: String = js.native
  /**
    * Creates a phone auth credential, given the verification ID from
    * {@link firebase.auth.PhoneAuthProvider.verifyPhoneNumber} and the code
    * that was sent to the user's mobile device.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/missing-verification-code</dt>
    * <dd>Thrown if the verification code is missing.</dd>
    * <dt>auth/missing-verification-id</dt>
    * <dd>Thrown if the verification ID is missing.</dd>
    * </dl>
    *
    * @param verificationId The verification ID returned from
    *     {@link firebase.auth.PhoneAuthProvider.verifyPhoneNumber}.
    * @param verificationCode The verification code sent to the user's
    *     mobile device.
    * @return The auth provider credential.
    */
  def credential(verificationId: String, verificationCode: String): AuthCredential = js.native
}

