package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "TwitterAuthProvider")
@js.native
class TwitterAuthProvider () extends TwitterAuthProvider_Instance

@JSImport("@firebase/auth-types", "TwitterAuthProvider")
@js.native
object TwitterAuthProvider extends js.Object {
  var PROVIDER_ID: java.lang.String = js.native
  var TWITTER_SIGN_IN_METHOD: java.lang.String = js.native
  def credential(token: java.lang.String, secret: java.lang.String): atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.AuthCredential = js.native
}

