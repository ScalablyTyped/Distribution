package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait TwitterAuthProvider_Instance extends AuthProvider {
  /**
    * Sets the OAuth custom parameters to pass in a Twitter OAuth request for popup
    * and redirect sign-in operations.
    * Valid parameters include 'lang'.
    * Reserved required OAuth 1.0 parameters such as 'oauth_consumer_key',
    * 'oauth_token', 'oauth_signature', etc are not allowed and will be ignored.
    * @param {!Object} customOAuthParameters The custom OAuth parameters to pass
    *     in the OAuth request.
    * @return {!firebase.auth.AuthProvider} The provider instance itself.
    */
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider
}

object TwitterAuthProvider_Instance {
  @scala.inline
  def apply(providerId: java.lang.String, setCustomParameters: js.Object => AuthProvider): TwitterAuthProvider_Instance = {
    val __obj = js.Dynamic.literal(providerId = providerId, setCustomParameters = js.Any.fromFunction1(setCustomParameters))
  
    __obj.asInstanceOf[TwitterAuthProvider_Instance]
  }
}

