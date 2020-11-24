package typings.firebase.mod.default.auth

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
@JSImport("firebase", "auth.MultiFactorResolver")
@js.native
class MultiFactorResolver protected ()
  extends typings.firebase.mod.firebase.auth.MultiFactorResolver
