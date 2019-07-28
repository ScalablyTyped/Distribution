package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "GoogleAuthProvider_Instance")
@js.native
class GoogleAuthProvider_Instance () extends AuthProvider {
  /* CompleteClass */
  override var providerId: String = js.native
  def addScope(scope: String): AuthProvider = js.native
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}

