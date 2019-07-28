package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthProvider extends js.Object {
  var providerId: String
}

object AuthProvider {
  @scala.inline
  def apply(providerId: String): AuthProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId)
  
    __obj.asInstanceOf[AuthProvider]
  }
}

