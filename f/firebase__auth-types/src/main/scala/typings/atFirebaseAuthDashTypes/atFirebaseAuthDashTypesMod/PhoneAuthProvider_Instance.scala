package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "PhoneAuthProvider_Instance")
@js.native
class PhoneAuthProvider_Instance () extends AuthProvider {
  def this(auth: FirebaseAuth) = this()
  /* CompleteClass */
  override var providerId: String = js.native
  def verifyPhoneNumber(phoneNumber: String, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
}

