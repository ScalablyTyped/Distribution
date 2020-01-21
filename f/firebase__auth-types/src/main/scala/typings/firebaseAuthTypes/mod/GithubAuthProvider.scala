package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "GithubAuthProvider")
@js.native
class GithubAuthProvider () extends GithubAuthProviderInstance

/* static members */
@JSImport("@firebase/auth-types", "GithubAuthProvider")
@js.native
object GithubAuthProvider extends js.Object {
  var GITHUB_SIGN_IN_METHOD: String = js.native
  var PROVIDER_ID: String = js.native
  def credential(token: String): AuthCredential = js.native
}

