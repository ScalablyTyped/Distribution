package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleAuthProvider_Instance extends AuthProvider {
  def addScope(scope: java.lang.String): AuthProvider
  def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): AuthProvider
}

object GoogleAuthProvider_Instance {
  @scala.inline
  def apply(
    addScope: js.Function1[java.lang.String, AuthProvider],
    providerId: java.lang.String,
    setCustomParameters: js.Function1[coreDashJsLib.Object, AuthProvider]
  ): GoogleAuthProvider_Instance = {
    val __obj = js.Dynamic.literal(addScope = addScope, providerId = providerId, setCustomParameters = setCustomParameters)
  
    __obj.asInstanceOf[GoogleAuthProvider_Instance]
  }
}

