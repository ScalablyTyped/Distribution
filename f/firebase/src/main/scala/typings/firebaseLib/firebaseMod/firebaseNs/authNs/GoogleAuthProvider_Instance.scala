package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait GoogleAuthProvider_Instance extends AuthProvider {
  /**
    * @param scope Google OAuth scope.
    * @return The provider instance itself.
    */
  def addScope(scope: java.lang.String): AuthProvider
  /**
    * Sets the OAuth custom parameters to pass in a Google OAuth request for popup
    * and redirect sign-in operations.
    * Valid parameters include 'hd', 'hl', 'include_granted_scopes', 'login_hint'
    * and 'prompt'.
    * For a detailed list, check the
    * {@link https://goo.gl/Xo01Jm Google}
    * documentation.
    * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
    * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
    * @param customOAuthParameters The custom OAuth parameters to pass
    *     in the OAuth request.
    * @return The provider instance itself.
    */
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider
}

object GoogleAuthProvider_Instance {
  @scala.inline
  def apply(
    addScope: java.lang.String => AuthProvider,
    providerId: java.lang.String,
    setCustomParameters: js.Object => AuthProvider
  ): GoogleAuthProvider_Instance = {
    val __obj = js.Dynamic.literal(addScope = js.Any.fromFunction1(addScope), providerId = providerId, setCustomParameters = js.Any.fromFunction1(setCustomParameters))
  
    __obj.asInstanceOf[GoogleAuthProvider_Instance]
  }
}

