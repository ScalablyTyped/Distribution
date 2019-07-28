package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "TwitterAuthProvider")
@js.native
class TwitterAuthProvider () extends TwitterAuthProvider_Instance

/* static members */
@JSImport("@firebase/auth-types", "TwitterAuthProvider")
@js.native
object TwitterAuthProvider extends js.Object {
  var PROVIDER_ID: String = js.native
  var TWITTER_SIGN_IN_METHOD: String = js.native
  def credential(token: String, secret: String): AuthCredential = js.native
}

