package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorAbi
  extends StObject
     with FunctionAbi {
  
  var inputs: js.Array[DataItem]
  
  var payable: Boolean
  
  var stateMutability: ConstructorStateMutability
  
  var `type`: Constructor
}
object ConstructorAbi {
  
  inline def apply(
    inputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: ConstructorStateMutability,
    `type`: Constructor
  ): ConstructorAbi = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorAbi]
  }
  
  extension [Self <: ConstructorAbi](x: Self) {
    
    inline def setInputs(value: js.Array[DataItem]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: DataItem*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
    
    inline def setStateMutability(value: ConstructorStateMutability): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
    
    inline def setType(value: Constructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
