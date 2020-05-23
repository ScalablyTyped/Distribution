package typings.firebaseAuthTypes.anon

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseAuthTypes.mod.AuthCredential
import typings.firebaseAuthTypes.mod.PhoneAuthProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPhoneAuthProvider extends Instantiable0[PhoneAuthProvider] {
  var PHONE_SIGN_IN_METHOD: String = js.native
  var PROVIDER_ID: String = js.native
  def credential(verificationId: String, verificationCode: String): AuthCredential = js.native
}

