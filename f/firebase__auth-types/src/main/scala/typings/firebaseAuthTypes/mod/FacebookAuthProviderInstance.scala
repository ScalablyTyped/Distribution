package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "FacebookAuthProvider_Instance")
@js.native
class FacebookAuthProviderInstance () extends AuthProvider {
  /* CompleteClass */
  override var providerId: String = js.native
  def addScope(scope: String): AuthProvider = js.native
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}

