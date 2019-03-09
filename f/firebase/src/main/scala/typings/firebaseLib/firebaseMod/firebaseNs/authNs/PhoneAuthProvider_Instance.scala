package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait PhoneAuthProvider_Instance extends AuthProvider {
  /**
    * Starts a phone number authentication flow by sending a verification code to
    * the given phone number. Returns an ID that can be passed to
    * {@link firebase.auth.PhoneAuthProvider.credential} to identify this flow.
    *
    * For abuse prevention, this method also requires a
    * {@link firebase.auth.ApplicationVerifier}. The Firebase Auth SDK includes
    * a reCAPTCHA-based implementation, {@link firebase.auth.RecaptchaVerifier}.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/captcha-check-failed</dt>
    * <dd>Thrown if the reCAPTCHA response token was invalid, expired, or if
    *     this method was called from a non-whitelisted domain.</dd>
    * <dt>auth/invalid-phone-number</dt>
    * <dd>Thrown if the phone number has an invalid format.</dd>
    * <dt>auth/missing-phone-number</dt>
    * <dd>Thrown if the phone number is missing.</dd>
    * <dt>auth/quota-exceeded</dt>
    * <dd>Thrown if the SMS quota for the Firebase project has been exceeded.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given phone number has been
    *     disabled.</dd>
    * </dl>
    *
    * @param {string} phoneNumber The user's phone number in E.164 format (e.g.
    *     +16505550101).
    * @param {!firebase.auth.ApplicationVerifier} applicationVerifier
    * @return {!firebase.Promise<string>} A Promise for the verification ID.
    */
  def verifyPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): js.Promise[java.lang.String]
}

object PhoneAuthProvider_Instance {
  @scala.inline
  def apply(
    providerId: java.lang.String,
    verifyPhoneNumber: js.Function2[java.lang.String, ApplicationVerifier, js.Promise[java.lang.String]]
  ): PhoneAuthProvider_Instance = {
    val __obj = js.Dynamic.literal(providerId = providerId, verifyPhoneNumber = verifyPhoneNumber)
  
    __obj.asInstanceOf[PhoneAuthProvider_Instance]
  }
}

