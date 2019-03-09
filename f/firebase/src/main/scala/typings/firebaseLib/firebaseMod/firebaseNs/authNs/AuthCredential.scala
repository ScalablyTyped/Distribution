package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that represents the credentials returned by an auth provider.
  * Implementations specify the details about each auth provider's credential
  * requirements.
  *
  */
trait AuthCredential extends js.Object {
  /**
    * The authentication provider ID for the credential.
    * For example, 'facebook.com', or 'google.com'.
    */
  var providerId: java.lang.String
  /**
    * The authentication sign in method for the credential.
    * For example, 'password', or 'emailLink. This corresponds to the sign-in
    * method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    */
  var signInMethod: java.lang.String
}

object AuthCredential {
  @scala.inline
  def apply(providerId: java.lang.String, signInMethod: java.lang.String): AuthCredential = {
    val __obj = js.Dynamic.literal(providerId = providerId, signInMethod = signInMethod)
  
    __obj.asInstanceOf[AuthCredential]
  }
}

