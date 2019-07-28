package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.ethereumDashProtocol.ethereumDashProtocolMod.AbiType.Constructor
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
    val __obj = js.Dynamic.literal(inputs = inputs, payable = payable, stateMutability = stateMutability)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConstructorAbi]
  }
}

