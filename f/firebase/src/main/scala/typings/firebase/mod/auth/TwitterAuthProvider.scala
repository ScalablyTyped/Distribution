package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Twitter auth provider.
  *
  * @example
  * ```javascript
  * // Using a redirect.
  * firebase.auth().getRedirectResult().then(function(result) {
  *   if (result.credential) {
  *     // For accessing the Twitter API.
  *     var token = result.credential.accessToken;
  *     var secret = result.credential.secret;
  *   }
  *   var user = result.user;
  * });
  *
  * // Start a sign in process for an unauthenticated user.
  * var provider = new firebase.auth.TwitterAuthProvider();
  * firebase.auth().signInWithRedirect(provider);
  * ```
  * @example
  * ```javascript
  * // Using a popup.
  * var provider = new firebase.auth.TwitterAuthProvider();
  * firebase.auth().signInWithPopup(provider).then(function(result) {
  *   // For accessing the Twitter API.
  *   var token = result.credential.accessToken;
  *   var secret = result.credential.secret;
  *   // The signed-in user info.
  *   var user = result.user;
  * });
  * ```
  *
  * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
  * changes.
  */
@JSImport("firebase", "auth.TwitterAuthProvider")
@js.native
class TwitterAuthProvider () extends TwitterAuthProviderInstance

/* static members */
@JSImport("firebase", "auth.TwitterAuthProvider")
@js.native
object TwitterAuthProvider extends js.Object {
  var PROVIDER_ID: String = js.native
  /**
    * This corresponds to the sign-in method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    *
    */
  var TWITTER_SIGN_IN_METHOD: String = js.native
  /**
    * @param token Twitter access token.
    * @param secret Twitter secret.
    * @return The auth provider credential.
    */
  def credential(token: String, secret: String): OAuthCredential = js.native
}

