package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodAbi extends FunctionAbi {
  
  var constant: Boolean = js.native
  
  var inputs: js.Array[DataItem] = js.native
  
  var name: String = js.native
  
  var outputs: js.Array[DataItem] = js.native
  
  var payable: Boolean = js.native
  
  var stateMutability: StateMutability = js.native
  
  var `type`: Function = js.native
}
object MethodAbi {
  
  @scala.inline
  def apply(
    constant: Boolean,
    inputs: js.Array[DataItem],
    name: String,
    outputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: StateMutability,
    `type`: Function
  ): MethodAbi = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodAbi]
  }
  
  @scala.inline
  implicit class MethodAbiOps[Self <: MethodAbi] (val x: Self) extends AnyVal {
    
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
    def setConstant(value: Boolean): Self = this.set("constant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: DataItem*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[DataItem]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: DataItem*): Self = this.set("outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[DataItem]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayable(value: Boolean): Self = this.set("payable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMutability(value: StateMutability): Self = this.set("stateMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Function): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
