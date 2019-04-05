package typings
package getDashStreamLib.getDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxBufferErrorClass
  extends stdLib.Error {
  @JSName("name")
  val name_MaxBufferErrorClass: getDashStreamLib.getDashStreamLibStrings.MaxBufferError
}

object MaxBufferErrorClass {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: getDashStreamLib.getDashStreamLibStrings.MaxBufferError,
    stack: java.lang.String = null
  ): MaxBufferErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MaxBufferErrorClass]
  }
}

