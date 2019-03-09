package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that represents an auth provider.
  */
trait AuthProvider extends js.Object {
  var providerId: java.lang.String
}

object AuthProvider {
  @scala.inline
  def apply(providerId: java.lang.String): AuthProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId)
  
    __obj.asInstanceOf[AuthProvider]
  }
}

