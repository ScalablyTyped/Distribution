package typings.firebase.mod.default.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Email and password auth provider implementation.
  *
  * To authenticate: {@link firebase.auth.Auth.createUserWithEmailAndPassword}
  * and {@link firebase.auth.Auth.signInWithEmailAndPassword}.
  */
@JSImport("firebase", "auth.EmailAuthProvider")
@js.native
class EmailAuthProvider ()
  extends typings.firebase.mod.firebase.auth.EmailAuthProviderInstance
/* static members */
@JSImport("firebase", "auth.EmailAuthProvider")
@js.native
object EmailAuthProvider extends js.Object {
  
  /**
    * This corresponds to the sign-in method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    */
  var EMAIL_LINK_SIGN_IN_METHOD: String = js.native
  
  /**
    * This corresponds to the sign-in method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    */
  var EMAIL_PASSWORD_SIGN_IN_METHOD: String = js.native
  
  var PROVIDER_ID: String = js.native
  
  /**
    * @example
    * ```javascript
    * var cred = firebase.auth.EmailAuthProvider.credential(
    *     email,
    *     password
    * );
    * ```
    *
    * @param email Email address.
    * @param password User account password.
    * @return The auth provider credential.
    */
  def credential(email: String, password: String): typings.firebase.mod.firebase.auth.AuthCredential = js.native
  
  /**
    * Initialize an `EmailAuthProvider` credential using an email and an email link
    * after a sign in with email link operation.
    *
    * @example
    * ```javascript
    * var cred = firebase.auth.EmailAuthProvider.credentialWithLink(
    *     email,
    *     emailLink
    * );
    * ```
    *
    * @param email Email address.
    * @param emailLink Sign-in email link.
    * @return The auth provider credential.
    */
  def credentialWithLink(email: String, emailLink: String): typings.firebase.mod.firebase.auth.AuthCredential = js.native
}
