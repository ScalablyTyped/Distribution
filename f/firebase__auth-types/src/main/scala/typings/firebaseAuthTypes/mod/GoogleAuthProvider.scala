package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "GoogleAuthProvider")
@js.native
class GoogleAuthProvider () extends GoogleAuthProviderInstance

/* static members */
@JSImport("@firebase/auth-types", "GoogleAuthProvider")
@js.native
object GoogleAuthProvider extends js.Object {
  var GOOGLE_SIGN_IN_METHOD: String = js.native
  var PROVIDER_ID: String = js.native
  def credential(): AuthCredential = js.native
  def credential(idToken: js.UndefOr[scala.Nothing], accessToken: String): AuthCredential = js.native
  def credential(idToken: String): AuthCredential = js.native
  def credential(idToken: String, accessToken: String): AuthCredential = js.native
  def credential(idToken: Null, accessToken: String): AuthCredential = js.native
}

