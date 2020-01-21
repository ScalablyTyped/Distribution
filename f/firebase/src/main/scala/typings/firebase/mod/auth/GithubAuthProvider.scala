package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GitHub auth provider.
  *
  * GitHub requires an OAuth 2.0 redirect, so you can either handle the redirect
  * directly, or use the signInWithPopup handler:
  *
  * @example
  * ```javascript
  * // Using a redirect.
  * firebase.auth().getRedirectResult().then(function(result) {
  *   if (result.credential) {
  *     // This gives you a GitHub Access Token.
  *     var token = result.credential.accessToken;
  *   }
  *   var user = result.user;
  * }).catch(function(error) {
  *   // Handle Errors here.
  *   var errorCode = error.code;
  *   var errorMessage = error.message;
  *   // The email of the user's account used.
  *   var email = error.email;
  *   // The firebase.auth.AuthCredential type that was used.
  *   var credential = error.credential;
  *   if (errorCode === 'auth/account-exists-with-different-credential') {
  *     alert('You have signed up with a different provider for that email.');
  *     // Handle linking here if your app allows it.
  *   } else {
  *     console.error(error);
  *   }
  * });
  *
  * // Start a sign in process for an unauthenticated user.
  * var provider = new firebase.auth.GithubAuthProvider();
  * provider.addScope('repo');
  * firebase.auth().signInWithRedirect(provider);
  * ```
  *
  * @example
  * ```javascript
  * // With popup.
  * var provider = new firebase.auth.GithubAuthProvider();
  *  provider.addScope('repo');
  *  firebase.auth().signInWithPopup(provider).then(function(result) {
  *    // This gives you a GitHub Access Token.
  *    var token = result.credential.accessToken;
  *    // The signed-in user info.
  *    var user = result.user;
  *  }).catch(function(error) {
  *    // Handle Errors here.
  *    var errorCode = error.code;
  *    var errorMessage = error.message;
  *    // The email of the user's account used.
  *    var email = error.email;
  *    // The firebase.auth.AuthCredential type that was used.
  *    var credential = error.credential;
  *    if (errorCode === 'auth/account-exists-with-different-credential') {
  *      alert('You have signed up with a different provider for that email.');
  *      // Handle linking here if your app allows it.
  *    } else {
  *      console.error(error);
  *    }
  *  });
  * ```
  *
  * @see {@link firebase.auth.Auth.onAuthStateChanged} to receive sign in state
  * changes.
  */
@JSImport("firebase", "auth.GithubAuthProvider")
@js.native
class GithubAuthProvider () extends GithubAuthProviderInstance

/* static members */
@JSImport("firebase", "auth.GithubAuthProvider")
@js.native
object GithubAuthProvider extends js.Object {
  /**
    * This corresponds to the sign-in method identifier as returned in
    * {@link firebase.auth.Auth.fetchSignInMethodsForEmail}.
    */
  var GITHUB_SIGN_IN_METHOD: String = js.native
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
    * @param token Github access token.
    * @return {!firebase.auth.OAuthCredential} The auth provider credential.
    */
  def credential(token: String): OAuthCredential = js.native
}

