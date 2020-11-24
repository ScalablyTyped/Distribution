package typings.ensureError.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ensure-error.ensure-error.ErrorWithStack<std.Error> */
@js.native
trait ErrorWithStackError extends js.Object {
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: js.UndefOr[String] with String = js.native
}
object ErrorWithStackError {
  
  @scala.inline
  def apply(message: String, name: String, stack: js.UndefOr[String] with String): ErrorWithStackError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorWithStackError]
  }
  
  @scala.inline
  implicit class ErrorWithStackErrorOps[Self <: ErrorWithStackError] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: js.UndefOr[String] with String): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
}
