package typings.ethereumProtocol.mod

import typings.ethereumProtocol.mod.AbiType.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorAbi extends FunctionAbi {
  var inputs: js.Array[DataItem]
  var payable: Boolean
  var stateMutability: ConstructorStateMutability
  var `type`: Constructor
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
}

