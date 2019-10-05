package typings.firebase.firebaseMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google auth provider.
  *
  * @example
  * ```javascript
  * // Using a redirect.
  * firebase.auth().getRedirectResult().then(function(result) {
  *   if (result.credential) {
  *     // This gives you a Google Access Token.
  *     var token = result.credential.accessToken;
  *   }
  *   var user = result.user;
  * });
  *
  * // Start a sign in process for an unauthenticated user.
  * var provider = new firebase.auth.GoogleAuthProvider();
  * provider.addScope('profile');
  * provider.addScope('email');
  * firebase.auth().signInWithRedirect(provider);
  * ```
  *
  * @example
  * ```javascript
  * // Using a popup.
  * var provider = new firebase.auth.GoogleAuthProvider();
  * provider.addScope('profile');
  * provider.addScope('email');
  * firebase.auth().signInWithPopup(provider).then(function(result) {
  *  // This gives you a Google Access Token.
  *  var token = result.credential.accessToken;
  *  // The signed-in user info.
  *  var user = result.user;
  * });
  * ```
  *
  * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
  * changes.
  */
@JSImport("firebase", "auth.GoogleAuthProvider")
@js.native
class GoogleAuthProvider () extends GoogleAuthProvider_Instance

/* static members */
@JSImport("firebase", "auth.GoogleAuthProvider")
@js.native
object GoogleAuthProvider extends js.Object {
  /**
    * This corresponds to the sign-in method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    */
  var GOOGLE_SIGN_IN_METHOD: String = js.native
  var PROVIDER_ID: String = js.native
  /**
    * Creates a credential for Google. At least one of ID token and access token
    * is required.
    *
    * @example
    * ```javascript
    * // \`googleUser\` from the onsuccess Google Sign In callback.
    * var credential = firebase.auth.GoogleAuthProvider.credential(
    googleUser.getAuthResponse().id_token);
    * firebase.auth().signInWithCredential(credential)
    * ```
    * @param idToken Google ID token.
    * @param accessToken Google access token.
    * @return The auth provider credential.
    */
  def credential(): OAuthCredential = js.native
  def credential(idToken: String): OAuthCredential = js.native
  def credential(idToken: String, accessToken: String): OAuthCredential = js.native
  def credential(idToken: Null, accessToken: String): OAuthCredential = js.native
}

