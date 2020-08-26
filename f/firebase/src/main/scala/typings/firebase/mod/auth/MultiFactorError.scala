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
@js.native
trait MultiFactorError extends AuthError {
  /**
    * The multi-factor resolver to complete second factor sign-in.
    */
  var resolver: MultiFactorResolver = js.native
}

object MultiFactorError {
  @scala.inline
  def apply(code: String, message: String, resolver: MultiFactorResolver): MultiFactorError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorError]
  }
  @scala.inline
  implicit class MultiFactorErrorOps[Self <: MultiFactorError] (val x: Self) extends AnyVal {
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
    def setResolver(value: MultiFactorResolver): Self = this.set("resolver", value.asInstanceOf[js.Any])
  }
  
}

