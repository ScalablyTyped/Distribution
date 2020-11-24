package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorAbi extends FunctionAbi {
  
  var inputs: js.Array[DataItem] = js.native
  
  var payable: Boolean = js.native
  
  var stateMutability: ConstructorStateMutability = js.native
  
  var `type`: Constructor = js.native
}
object ConstructorAbi {
  
  @scala.inline
  def apply(
    inputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: ConstructorStateMutability,
    `type`: Constructor
  ): ConstructorAbi = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorAbi]
  }
  
  @scala.inline
  implicit class ConstructorAbiOps[Self <: ConstructorAbi] (val x: Self) extends AnyVal {
    
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
    def setInputsVarargs(value: DataItem*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[DataItem]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayable(value: Boolean): Self = this.set("payable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMutability(value: ConstructorStateMutability): Self = this.set("stateMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Constructor): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
