package typings.firebase.mod.default.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic OAuth provider.
  *
  * @example
  * ```javascript
  * // Using a redirect.
  * firebase.auth().getRedirectResult().then(function(result) {
  *   if (result.credential) {
  *     // This gives you the OAuth Access Token for that provider.
  *     var token = result.credential.accessToken;
  *   }
  *   var user = result.user;
  * });
  *
  * // Start a sign in process for an unauthenticated user.
  * var provider = new firebase.auth.OAuthProvider('google.com');
  * provider.addScope('profile');
  * provider.addScope('email');
  * firebase.auth().signInWithRedirect(provider);
  * ```
  * @example
  * ```javascript
  * // Using a popup.
  * var provider = new firebase.auth.OAuthProvider('google.com');
  * provider.addScope('profile');
  * provider.addScope('email');
  * firebase.auth().signInWithPopup(provider).then(function(result) {
  *  // This gives you the OAuth Access Token for that provider.
  *  var token = result.credential.accessToken;
  *  // The signed-in user info.
  *  var user = result.user;
  * });
  * ```
  *
  * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
  * changes.
  * @param providerId The associated provider ID, such as `github.com`.
  */
@JSImport("firebase", "auth.OAuthProvider")
@js.native
class OAuthProvider protected ()
  extends typings.firebase.mod.firebase.auth.OAuthProvider {
  def this(providerId: String) = this()
}
