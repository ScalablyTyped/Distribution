package typings
package atFirebaseAuthDashTypesLib.authDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "FacebookAuthProvider")
@js.native
class FacebookAuthProvider () extends FacebookAuthProvider_Instance

@JSImport("@firebase/auth-types", "FacebookAuthProvider")
@js.native
object FacebookAuthProvider extends js.Object {
  var FACEBOOK_SIGN_IN_METHOD: java.lang.String = js.native
  var PROVIDER_ID: java.lang.String = js.native
  def credential(token: java.lang.String): atFirebaseAuthDashTypesLib.authDashTypesMod.AuthCredential = js.native
}

