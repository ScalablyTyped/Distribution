package typings.ethereumjsVm.evmMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewContractEvent extends js.Object {
  
  var address: Buffer = js.native
  
  var code: Buffer = js.native
}
object NewContractEvent {
  
  @scala.inline
  def apply(address: Buffer, code: Buffer): NewContractEvent = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewContractEvent]
  }
  
  @scala.inline
  implicit class NewContractEventOps[Self <: NewContractEvent] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Buffer): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Buffer): Self = this.set("code", value.asInstanceOf[js.Any])
  }
}
