package typings.ensureError.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonError extends Error {
  @JSName("name")
  var name_NonError: typings.ensureError.ensureErrorStrings.NonError = js.native
  @JSName("stack")
  var stack_NonError: String = js.native
}

object NonError {
  @scala.inline
  def apply(message: String, name: typings.ensureError.ensureErrorStrings.NonError, stack: String): NonError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonError]
  }
  @scala.inline
  implicit class NonErrorOps[Self <: NonError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.ensureError.ensureErrorStrings.NonError): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
  
}

