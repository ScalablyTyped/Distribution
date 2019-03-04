package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

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
    val __obj = js.Dynamic.literal(providerId = providerId, signInMethod = signInMethod)
  
    __obj.asInstanceOf[AuthCredential]
  }
}

