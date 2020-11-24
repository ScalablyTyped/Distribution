package typings.ethereumjsVm.typesMod

import typings.bnJs.mod.^
import typings.ethereumjsCommon.mod.default
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrecompileInput extends js.Object {
  
  var _common: default = js.native
  
  var data: Buffer = js.native
  
  var gasLimit: ^ = js.native
}
object PrecompileInput {
  
  @scala.inline
  def apply(_common: default, data: Buffer, gasLimit: ^): PrecompileInput = {
    val __obj = js.Dynamic.literal(_common = _common.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecompileInput]
  }
  
  @scala.inline
  implicit class PrecompileInputOps[Self <: PrecompileInput] (val x: Self) extends AnyVal {
    
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
    def set_common(value: default): Self = this.set("_common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasLimit(value: ^): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
  }
}
