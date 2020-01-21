package typings.domexception.domexceptionImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMExceptionImpl extends js.Object {
  val code: String
  var message: String
  var name: String
}

object DOMExceptionImpl {
  @scala.inline
  def apply(code: String, message: String, name: String): DOMExceptionImpl = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DOMExceptionImpl]
  }
}

