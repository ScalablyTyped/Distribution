package typings.ethereumjsVm.interpreterMod

import typings.ethereumjsVm.exceptionsMod.VmError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpreterResult extends js.Object {
  
  var exceptionError: js.UndefOr[VmError] = js.native
  
  var runState: js.UndefOr[RunState] = js.native
}
object InterpreterResult {
  
  @scala.inline
  def apply(): InterpreterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpreterResult]
  }
  
  @scala.inline
  implicit class InterpreterResultOps[Self <: InterpreterResult] (val x: Self) extends AnyVal {
    
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
    def setExceptionError(value: VmError): Self = this.set("exceptionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionError: Self = this.set("exceptionError", js.undefined)
    
    @scala.inline
    def setRunState(value: RunState): Self = this.set("runState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunState: Self = this.set("runState", js.undefined)
  }
}
