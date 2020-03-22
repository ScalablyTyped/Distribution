package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "PhoneAuthProvider_Instance")
@js.native
class PhoneAuthProviderInstance () extends AuthProvider {
  def this(auth: FirebaseAuth) = this()
  /* CompleteClass */
  override var providerId: String = js.native
  def verifyPhoneNumber(phoneInfoOptions: String, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
  def verifyPhoneNumber(phoneInfoOptions: PhoneInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
}

