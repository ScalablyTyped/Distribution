package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Constructor
import org.scalablytyped.runtime.StObject
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
  implicit class ConstructorAbiMutableBuilder[Self <: ConstructorAbi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[DataItem]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: DataItem*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMutability(value: ConstructorStateMutability): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Constructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
