package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
@JSImport("firebase", "auth.PhoneAuthProvider_Instance")
@js.native
class PhoneAuthProviderInstance () extends AuthProvider {
  def this(auth: Auth) = this()
  /* CompleteClass */
  override var providerId: String = js.native
  def verifyPhoneNumber(phoneInfoOptions: String, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
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
    * <dt>auth/maximum-second-factor-count-exceeded</dt>
    * <dd>Thrown if The maximum allowed number of second factors on a user
    *     has been exceeded.</dd>
    * <dt>auth/second-factor-already-in-use</dt>
    * <dd>Thrown if the second factor is already enrolled on this account.</dd>
    * <dt>auth/unsupported-first-factor</dt>
    * <dd>Thrown if the first factor being used to sign in is not supported.</dd>
    * <dt>auth/unverified-email</dt>
    * <dd>Thrown if the email of the account is not verified.</dd>
    * </dl>
    *
    * @param phoneInfoOptions The user's {@link firebase.auth.PhoneInfoOptions}.
    *     The phone number should be in E.164 format (e.g. +16505550101).
    * @param applicationVerifier
    * @return A Promise for the verification ID.
    */
  def verifyPhoneNumber(phoneInfoOptions: PhoneInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
}

