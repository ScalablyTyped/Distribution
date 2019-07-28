package typings.ethereumDashProtocol.ethereumDashProtocolMod

import typings.ethereumDashProtocol.ethereumDashProtocolMod.AbiType.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodAbi extends FunctionAbi {
  var constant: Boolean
  var inputs: js.Array[DataItem]
  var name: String
  var outputs: js.Array[DataItem]
  var payable: Boolean
  var stateMutability: StateMutability
  var `type`: Function
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
    val __obj = js.Dynamic.literal(constant = constant, inputs = inputs, name = name, outputs = outputs, payable = payable, stateMutability = stateMutability)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MethodAbi]
  }
}

