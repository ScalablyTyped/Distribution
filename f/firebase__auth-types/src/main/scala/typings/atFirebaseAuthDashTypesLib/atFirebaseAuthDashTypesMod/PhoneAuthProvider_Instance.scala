package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "PhoneAuthProvider_Instance")
@js.native
class PhoneAuthProvider_Instance () extends AuthProvider {
  def this(auth: FirebaseAuth) = this()
  /* CompleteClass */
  override var providerId: java.lang.String = js.native
  def verifyPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): js.Promise[java.lang.String] = js.native
}

