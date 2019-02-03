package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "GoogleAuthProvider")
@js.native
class GoogleAuthProvider () extends GoogleAuthProvider_Instance

/* static members */
@JSImport("@firebase/auth-types", "GoogleAuthProvider")
@js.native
object GoogleAuthProvider extends js.Object {
  var GOOGLE_SIGN_IN_METHOD: java.lang.String = js.native
  var PROVIDER_ID: java.lang.String = js.native
  def credential(): atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.AuthCredential = js.native
  def credential(idToken: java.lang.String): atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.AuthCredential = js.native
  def credential(idToken: java.lang.String, accessToken: java.lang.String): atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.AuthCredential = js.native
  def credential(idToken: scala.Null, accessToken: java.lang.String): atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.AuthCredential = js.native
}

