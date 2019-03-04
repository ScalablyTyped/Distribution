package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneAuthProvider_Instance extends AuthProvider {
  def verifyPhoneNumber(phoneNumber: java.lang.String, applicationVerifier: ApplicationVerifier): js.Promise[java.lang.String]
}

object PhoneAuthProvider_Instance {
  @scala.inline
  def apply(
    providerId: java.lang.String,
    verifyPhoneNumber: js.Function2[java.lang.String, ApplicationVerifier, js.Promise[java.lang.String]]
  ): PhoneAuthProvider_Instance = {
    val __obj = js.Dynamic.literal(providerId = providerId, verifyPhoneNumber = verifyPhoneNumber)
  
    __obj.asInstanceOf[PhoneAuthProvider_Instance]
  }
}

