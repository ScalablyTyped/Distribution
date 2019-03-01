package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterAuthProvider_Instance extends AuthProvider {
  def setCustomParameters(customOAuthParameters: coreDashJsLib.Object): AuthProvider
}

object TwitterAuthProvider_Instance {
  @scala.inline
  def apply(
    providerId: java.lang.String,
    setCustomParameters: js.Function1[coreDashJsLib.Object, AuthProvider]
  ): TwitterAuthProvider_Instance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("providerId")(providerId)
    __obj.updateDynamic("setCustomParameters")(setCustomParameters)
    __obj.asInstanceOf[TwitterAuthProvider_Instance]
  }
}

