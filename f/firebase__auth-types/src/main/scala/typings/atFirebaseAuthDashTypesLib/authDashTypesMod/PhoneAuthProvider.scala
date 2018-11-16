package typings
package atFirebaseAuthDashTypesLib.authDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "PhoneAuthProvider")
@js.native
class PhoneAuthProvider () extends PhoneAuthProvider_Instance

@JSImport("@firebase/auth-types", "PhoneAuthProvider")
@js.native
object PhoneAuthProvider extends js.Object {
  var PHONE_SIGN_IN_METHOD: java.lang.String = js.native
  var PROVIDER_ID: java.lang.String = js.native
  def credential(verificationId: java.lang.String, verificationCode: java.lang.String): atFirebaseAuthDashTypesLib.authDashTypesMod.AuthCredential = js.native
}

