package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodAbi
  extends StObject
     with FunctionAbi {
  
  var constant: Boolean
  
  var inputs: js.Array[DataItem]
  
  var name: String
  
  var outputs: js.Array[DataItem]
  
  var payable: Boolean
  
  var stateMutability: StateMutability
  
  var `type`: Function
}
object MethodAbi {
  
  inline def apply(
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
  
  extension [Self <: MethodAbi](x: Self) {
    
    inline def setConstant(value: Boolean): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[DataItem]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: DataItem*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[DataItem]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: DataItem*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
    
    inline def setStateMutability(value: StateMutability): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
    
    inline def setType(value: Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
