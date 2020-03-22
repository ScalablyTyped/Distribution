package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The error thrown when the user needs to provide a second factor to sign in
  * successfully.
  * The error code for this error is <code>auth/multi-factor-auth-required</code>.
  * This error provides a {@link firebase.auth.MultiFactorResolver} object,
  * which you can use to get the second sign-in factor from the user.
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
  *         var multiFactorHints = resolver.hints;
  *       } else {
  *         // Handle other errors.
  *       }
  *     });
  *
  * resolver.resolveSignIn(multiFactorAssertion)
  *     .then(function(userCredential) {
  *       // User signed in.
  *     });
  * ```
  */
trait MultiFactorError extends AuthError {
  /**
    * The multi-factor resolver to complete second factor sign-in.
    */
  var resolver: MultiFactorResolver
}

object MultiFactorError {
  @scala.inline
  def apply(
    code: String,
    message: String,
    resolver: MultiFactorResolver,
    credential: AuthCredential = null,
    email: String = null,
    phoneNumber: String = null,
    tenantId: String = null
  ): MultiFactorError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorError]
  }
}

