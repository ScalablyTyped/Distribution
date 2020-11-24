package typings.ethereumjsVm.interpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpreterOpts extends js.Object {
  
  var pc: js.UndefOr[Double] = js.native
}
object InterpreterOpts {
  
  @scala.inline
  def apply(): InterpreterOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpreterOpts]
  }
  
  @scala.inline
  implicit class InterpreterOptsOps[Self <: InterpreterOpts] (val x: Self) extends AnyVal {
    
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
    def setPc(value: Double): Self = this.set("pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePc: Self = this.set("pc", js.undefined)
  }
}
