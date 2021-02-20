package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Function
import org.scalablytyped.runtime.StObject
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
  implicit class MethodAbiMutableBuilder[Self <: MethodAbi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstant(value: Boolean): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: js.Array[DataItem]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: DataItem*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: js.Array[DataItem]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: DataItem*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMutability(value: StateMutability): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
