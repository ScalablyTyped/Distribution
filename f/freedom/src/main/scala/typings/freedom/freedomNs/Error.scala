package typings.freedom.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var errcode: String
  var message: String
}

object Error {
  @scala.inline
  def apply(errcode: String, message: String): Error = {
    val __obj = js.Dynamic.literal(errcode = errcode, message = message)
  
    __obj.asInstanceOf[Error]
  }
}

