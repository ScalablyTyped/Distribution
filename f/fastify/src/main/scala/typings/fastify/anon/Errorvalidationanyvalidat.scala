package typings.fastify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & {  validation :any,   validationContext :string} */
@js.native
trait Errorvalidationanyvalidat extends js.Object {
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: js.UndefOr[String] = js.native
  
  var validation: js.Any = js.native
  
  var validationContext: String = js.native
}
object Errorvalidationanyvalidat {
  
  @scala.inline
  def apply(message: String, name: String, validation: js.Any, validationContext: String): Errorvalidationanyvalidat = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], validationContext = validationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorvalidationanyvalidat]
  }
  
  @scala.inline
  implicit class ErrorvalidationanyvalidatOps[Self <: Errorvalidationanyvalidat] (val x: Self) extends AnyVal {
    
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
    def setValidation(value: js.Any): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationContext(value: String): Self = this.set("validationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
