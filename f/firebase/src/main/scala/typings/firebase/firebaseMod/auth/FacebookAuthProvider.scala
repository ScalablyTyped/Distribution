package typings.firebase.firebaseMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Facebook auth provider.
  *
  * @example
  * ```javascript
  * // Sign in using a redirect.
  * firebase.auth().getRedirectResult().then(function(result) {
  *   if (result.credential) {
  *     // This gives you a Google Access Token.
  *     var token = result.credential.accessToken;
  *   }
  *   var user = result.user;
  * })
  * // Start a sign in process for an unauthenticated user.
  * var provider = new firebase.auth.FacebookAuthProvider();
  * provider.addScope('user_birthday');
  * firebase.auth().signInWithRedirect(provider);
  * ```
  *
  * @example
  * ```javascript
  * // Sign in using a popup.
  * var provider = new firebase.auth.FacebookAuthProvider();
  * provider.addScope('user_birthday');
  * firebase.auth().signInWithPopup(provider).then(function(result) {
  *   // This gives you a Facebook Access Token.
  *   var token = result.credential.accessToken;
  *   // The signed-in user info.
  *   var user = result.user;
  * });
  * ```
  *
  * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
  * changes.
  */
@JSImport("firebase", "auth.FacebookAuthProvider")
@js.native
class FacebookAuthProvider () extends FacebookAuthProvider_Instance

/* static members */
@JSImport("firebase", "auth.FacebookAuthProvider")
@js.native
object FacebookAuthProvider extends js.Object {
  /**
    * This corresponds to the sign-in method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    */
  var FACEBOOK_SIGN_IN_METHOD: String = js.native
  var PROVIDER_ID: String = js.native
  /**
    * @example
    * ```javascript
    * var cred = firebase.auth.FacebookAuthProvider.credential(
    *     // `event` from the Facebook auth.authResponseChange callback.
    *     event.authResponse.accessToken
    * );
    * ```
    *
    * @param token Facebook access token.
    */
  def credential(token: String): OAuthCredential = js.native
}

