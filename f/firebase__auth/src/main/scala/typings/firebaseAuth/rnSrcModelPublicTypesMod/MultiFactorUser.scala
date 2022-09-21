package typings.firebaseAuth.rnSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiFactorUser extends StObject {
  
  /**
    *
    * Enrolls a second factor as identified by the {@link MultiFactorAssertion} for the
    * user.
    *
    * @remarks
    * On resolution, the user tokens are updated to reflect the change in the JWT payload.
    * Accepts an additional display name parameter used to identify the second factor to the end
    * user. Recent re-authentication is required for this operation to succeed. On successful
    * enrollment, existing Firebase sessions (refresh tokens) are revoked. When a new factor is
    * enrolled, an email notification is sent to the user’s email.
    *
    * @example
    * ```javascript
    * const multiFactorUser = multiFactor(auth.currentUser);
    * const multiFactorSession = await multiFactorUser.getSession();
    *
    * // Send verification code.
    * const phoneAuthProvider = new PhoneAuthProvider(auth);
    * const phoneInfoOptions = {
    *   phoneNumber: phoneNumber,
    *   session: multiFactorSession
    * };
    * const verificationId = await phoneAuthProvider.verifyPhoneNumber(phoneInfoOptions, appVerifier);
    *
    * // Obtain verification code from user.
    * const phoneAuthCredential = PhoneAuthProvider.credential(verificationId, verificationCode);
    * const multiFactorAssertion = PhoneMultiFactorGenerator.assertion(phoneAuthCredential);
    * await multiFactorUser.enroll(multiFactorAssertion);
    * // Second factor enrolled.
    * ```
    *
    * @param assertion - The multi-factor assertion to enroll with.
    * @param displayName - The display name of the second factor.
    */
  def enroll(assertion: MultiFactorAssertion): js.Promise[Unit] = js.native
  def enroll(assertion: MultiFactorAssertion, displayName: String): js.Promise[Unit] = js.native
  
  /** Returns a list of the user's enrolled second factors. */
  val enrolledFactors: js.Array[MultiFactorInfo] = js.native
  
  /**
    * Returns the session identifier for a second factor enrollment operation. This is used to
    * identify the user trying to enroll a second factor.
    *
    * @example
    * ```javascript
    * const multiFactorUser = multiFactor(auth.currentUser);
    * const multiFactorSession = await multiFactorUser.getSession();
    *
    * // Send verification code.
    * const phoneAuthProvider = new PhoneAuthProvider(auth);
    * const phoneInfoOptions = {
    *   phoneNumber: phoneNumber,
    *   session: multiFactorSession
    * };
    * const verificationId = await phoneAuthProvider.verifyPhoneNumber(phoneInfoOptions, appVerifier);
    *
    * // Obtain verification code from user.
    * const phoneAuthCredential = PhoneAuthProvider.credential(verificationId, verificationCode);
    * const multiFactorAssertion = PhoneMultiFactorGenerator.assertion(phoneAuthCredential);
    * await multiFactorUser.enroll(multiFactorAssertion);
    * ```
    *
    * @returns The promise that resolves with the {@link MultiFactorSession}.
    */
  def getSession(): js.Promise[MultiFactorSession] = js.native
  
  def unenroll(option: String): js.Promise[Unit] = js.native
  /**
    * Unenrolls the specified second factor.
    *
    * @remarks
    * To specify the factor to remove, pass a {@link MultiFactorInfo} object (retrieved from
    * {@link MultiFactorUser.enrolledFactors}) or the
    * factor's UID string. Sessions are not revoked when the account is unenrolled. An email
    * notification is likely to be sent to the user notifying them of the change. Recent
    * re-authentication is required for this operation to succeed. When an existing factor is
    * unenrolled, an email notification is sent to the user’s email.
    *
    * @example
    * ```javascript
    * const multiFactorUser = multiFactor(auth.currentUser);
    * // Present user the option to choose which factor to unenroll.
    * await multiFactorUser.unenroll(multiFactorUser.enrolledFactors[i])
    * ```
    *
    * @param option - The multi-factor option to unenroll.
    * @returns - A `Promise` which resolves when the unenroll operation is complete.
    */
  def unenroll(option: MultiFactorInfo): js.Promise[Unit] = js.native
}
