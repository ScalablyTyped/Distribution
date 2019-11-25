package typings.getDashStream.getDashStreamMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxBufferErrorClass extends Error {
  @JSName("name")
  val name_MaxBufferErrorClass: typings.getDashStream.getDashStreamStrings.MaxBufferError
}

object MaxBufferErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typings.getDashStream.getDashStreamStrings.MaxBufferError,
    stack: String = null
  ): MaxBufferErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxBufferErrorClass]
  }
}

