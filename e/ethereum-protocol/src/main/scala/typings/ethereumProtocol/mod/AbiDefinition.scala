package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Constructor
import typings.ethereumProtocol.mod.AbiType.Event
import typings.ethereumProtocol.mod.AbiType.Fallback
import typings.ethereumProtocol.mod.AbiType.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ethereumProtocol.mod.FunctionAbi
  - typings.ethereumProtocol.mod.EventAbi
*/
trait AbiDefinition extends StObject
object AbiDefinition {
  
  @scala.inline
  def ConstructorAbi(
    inputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: ConstructorStateMutability,
    `type`: Constructor
  ): typings.ethereumProtocol.mod.ConstructorAbi = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ethereumProtocol.mod.ConstructorAbi]
  }
  
  @scala.inline
  def EventAbi(anonymous: Boolean, inputs: js.Array[EventParameter], name: String, `type`: Event): typings.ethereumProtocol.mod.EventAbi = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ethereumProtocol.mod.EventAbi]
  }
  
  @scala.inline
  def FallbackAbi(payable: Boolean, `type`: Fallback): typings.ethereumProtocol.mod.FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ethereumProtocol.mod.FallbackAbi]
  }
  
  @scala.inline
  def MethodAbi(
    constant: Boolean,
    inputs: js.Array[DataItem],
    name: String,
    outputs: js.Array[DataItem],
    payable: Boolean,
    stateMutability: StateMutability,
    `type`: Function
  ): typings.ethereumProtocol.mod.MethodAbi = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ethereumProtocol.mod.MethodAbi]
  }
}
