package typings.durandal.binderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingInstruction extends js.Object {
  
  var applyBindings: Boolean = js.native
}
object BindingInstruction {
  
  @scala.inline
  def apply(applyBindings: Boolean): BindingInstruction = {
    val __obj = js.Dynamic.literal(applyBindings = applyBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingInstruction]
  }
  
  @scala.inline
  implicit class BindingInstructionOps[Self <: BindingInstruction] (val x: Self) extends AnyVal {
    
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
    def setApplyBindings(value: Boolean): Self = this.set("applyBindings", value.asInstanceOf[js.Any])
  }
}
