package typings.getStream.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxBufferErrorClass extends Error {
  @JSName("name")
  val name_MaxBufferErrorClass: typings.getStream.getStreamStrings.MaxBufferError
}

object MaxBufferErrorClass {
  @scala.inline
  def apply(message: String, name: typings.getStream.getStreamStrings.MaxBufferError, stack: String = null): MaxBufferErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxBufferErrorClass]
  }
}

