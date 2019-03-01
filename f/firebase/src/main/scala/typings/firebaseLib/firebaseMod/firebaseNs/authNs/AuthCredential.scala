package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCredential extends js.Object {
  var providerId: java.lang.String
  var signInMethod: java.lang.String
}

object AuthCredential {
  @scala.inline
  def apply(providerId: java.lang.String, signInMethod: java.lang.String): AuthCredential = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("providerId")(providerId)
    __obj.updateDynamic("signInMethod")(signInMethod)
    __obj.asInstanceOf[AuthCredential]
  }
}

