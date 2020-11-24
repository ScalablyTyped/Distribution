package typings.ethereumjsVm.opcodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opcode extends js.Object {
  
  var fee: Double = js.native
  
  var isAsync: Boolean = js.native
  
  var name: String = js.native
}
object Opcode {
  
  @scala.inline
  def apply(fee: Double, isAsync: Boolean, name: String): Opcode = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], isAsync = isAsync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opcode]
  }
  
  @scala.inline
  implicit class OpcodeOps[Self <: Opcode] (val x: Self) extends AnyVal {
    
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
    def setFee(value: Double): Self = this.set("fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAsync(value: Boolean): Self = this.set("isAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
