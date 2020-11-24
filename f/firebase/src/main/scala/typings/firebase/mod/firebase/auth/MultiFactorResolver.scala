package typings.firebase.mod.firebase.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The class used to facilitate recovery from
  * {@link firebase.auth.MultiFactorError} when a user needs to provide a second
  * factor to sign in.
  *
  * @example
  * ```javascript
  * firebase.auth().signInWithEmailAndPassword()
  *     .then(function(result) {
  *       // User signed in. No 2nd factor challenge is needed.
  *     })
  *     .catch(function(error) {
  *       if (error.code == 'auth/multi-factor-auth-required') {
  *         var resolver = error.resolver;
  *         // Show UI to let user select second factor.
  *         var multiFactorHints = resolver.hints;
  *       } else {
  *         // Handle other errors.
  *       }
  *     });
  *
  * // The enrolled second factors that can be used to complete
  * // sign-in are returned in the `MultiFactorResolver.hints` list.
  * // UI needs to be presented to allow the user to select a second factor
  * // from that list.
  *
  * var selectedHint = // ; selected from multiFactorHints
  * var phoneAuthProvider = new firebase.auth.PhoneAuthProvider();
  * var phoneInfoOptions = {
  *   multiFactorHint: selectedHint,
  *   session: resolver.session
  * };
  * phoneAuthProvider.verifyPhoneNumber(
  *   phoneInfoOptions,
  *   appVerifier
  * ).then(function(verificationId) {
  *   // store verificationID and show UI to let user enter verification code.
  * });
  *
  * // UI to enter verification code and continue.
  * // Continue button click handler
  * var phoneAuthCredential =
  *     firebase.auth.PhoneAuthProvider.credential(verificationId, verificationCode);
  * var multiFactorAssertion =
  *     firebase.auth.PhoneMultiFactorGenerator.assertion(phoneAuthCredential);
  * resolver.resolveSignIn(multiFactorAssertion)
  *     .then(function(userCredential) {
  *       // User signed in.
  *     });
  * ```
  */
@js.native
trait MultiFactorResolver extends js.Object {
  
  /**
    * The Auth instance used to sign in with the first factor.
    */
  var auth: Auth = js.native
  
  /**
    * The list of hints for the second factors needed to complete the sign-in
    * for the current session.
    */
  var hints: js.Array[MultiFactorInfo] = js.native
  
  /**
    * A helper function to help users complete sign in with a second factor
    * using an {@link firebase.auth.MultiFactorAssertion} confirming the user
    * successfully completed the second factor challenge.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/invalid-verification-code</dt>
    * <dd>Thrown if the verification code is not valid.</dd>
    * <dt>auth/missing-verification-code</dt>
    * <dd>Thrown if the verification code is missing.</dd>
    * <dt>auth/invalid-verification-id</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential} and the verification
    *     ID of the credential is not valid.</dd>
    * <dt>auth/missing-verification-id</dt>
    * <dd>Thrown if the verification ID is missing.</dd>
    * <dt>auth/code-expired</dt>
    * <dd>Thrown if the verification code has expired.</dd>
    * <dt>auth/invalid-multi-factor-session</dt>
    * <dd>Thrown if the request does not contain a valid proof of first factor
    *     successful sign-in.</dd>
    * <dt>auth/missing-multi-factor-session</dt>
    * <dd>Thrown if The request is missing proof of first factor successful
    *     sign-in.</dd>
    * </dl>
    *
    * @param assertion The multi-factor assertion to resolve sign-in with.
    * @return The promise that resolves with the user credential object.
    */
  def resolveSignIn(assertion: MultiFactorAssertion): js.Promise[UserCredential] = js.native
  
  /**
    * The session identifier for the current sign-in flow, which can be used
    * to complete the second factor sign-in.
    */
  var session: MultiFactorSession = js.native
}
object MultiFactorResolver {
  
  @scala.inline
  def apply(
    auth: Auth,
    hints: js.Array[MultiFactorInfo],
    resolveSignIn: MultiFactorAssertion => js.Promise[UserCredential],
    session: MultiFactorSession
  ): MultiFactorResolver = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], resolveSignIn = js.Any.fromFunction1(resolveSignIn), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorResolver]
  }
  
  @scala.inline
  implicit class MultiFactorResolverOps[Self <: MultiFactorResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: Auth): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintsVarargs(value: MultiFactorInfo*): Self = this.set("hints", js.Array(value :_*))
    
    @scala.inline
    def setHints(value: js.Array[MultiFactorInfo]): Self = this.set("hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveSignIn(value: MultiFactorAssertion => js.Promise[UserCredential]): Self = this.set("resolveSignIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: MultiFactorSession): Self = this.set("session", value.asInstanceOf[js.Any])
  }
}
