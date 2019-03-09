package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait FacebookAuthProvider_Instance extends AuthProvider {
  /**
    * @param {string} scope Facebook OAuth scope.
    * @return {!firebase.auth.AuthProvider} The provider instance itself.
    */
  def addScope(scope: java.lang.String): AuthProvider
  /**
    * Sets the OAuth custom parameters to pass in a Facebook OAuth request for
    * popup and redirect sign-in operations.
    * Valid parameters include 'auth_type', 'display' and 'locale'.
    * For a detailed list, check the
    * {@link https://goo.gl/pve4fo Facebook}
    * documentation.
    * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
    * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
    * @param {!Object} customOAuthParameters The custom OAuth parameters to pass
    *     in the OAuth request.
    * @return {!firebase.auth.AuthProvider} The provider instance itself.
    */
  def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): AuthProvider
}

object FacebookAuthProvider_Instance {
  @scala.inline
  def apply(
    addScope: js.Function1[java.lang.String, AuthProvider],
    providerId: java.lang.String,
    setCustomParameters: js.Function1[coreDashJsLib.Object, AuthProvider]
  ): FacebookAuthProvider_Instance = {
    val __obj = js.Dynamic.literal(addScope = addScope, providerId = providerId, setCustomParameters = setCustomParameters)
  
    __obj.asInstanceOf[FacebookAuthProvider_Instance]
  }
}

