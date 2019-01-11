package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "EmailAuthProvider")
@js.native
class EmailAuthProvider () extends EmailAuthProvider_Instance

@JSImport("@firebase/auth-types", "EmailAuthProvider")
@js.native
object EmailAuthProvider extends js.Object {
  var EMAIL_LINK_SIGN_IN_METHOD: java.lang.String = js.native
  var EMAIL_PASSWORD_SIGN_IN_METHOD: java.lang.String = js.native
  var PROVIDER_ID: java.lang.String = js.native
  def credential(email: java.lang.String, password: java.lang.String): atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.AuthCredential = js.native
  def credentialWithLink(email: java.lang.String, emailLink: java.lang.String): atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod.AuthCredential = js.native
}

