package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorAbi extends FunctionAbi {
  var inputs: js.Array[DataItem]
  var payable: scala.Boolean
  var stateMutability: ConstructorStateMutability
  var `type`: AbiType
}

object ConstructorAbi {
  @scala.inline
  def apply(
    inputs: js.Array[DataItem],
    payable: scala.Boolean,
    stateMutability: ConstructorStateMutability,
    `type`: AbiType
  ): ConstructorAbi = {
    val __obj = js.Dynamic.literal(inputs = inputs, payable = payable, stateMutability = stateMutability)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConstructorAbi]
  }
}

