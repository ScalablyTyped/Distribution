package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: java.lang.String
  var message: java.lang.String
}

object Error {
  @scala.inline
  def apply(code: java.lang.String, message: java.lang.String): Error = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[Error]
  }
}

