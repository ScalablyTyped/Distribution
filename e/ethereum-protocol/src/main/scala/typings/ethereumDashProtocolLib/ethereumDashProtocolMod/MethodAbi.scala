package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodAbi extends FunctionAbi {
  var constant: scala.Boolean
  var inputs: js.Array[DataItem]
  var name: java.lang.String
  var outputs: js.Array[DataItem]
  var payable: scala.Boolean
  var stateMutability: StateMutability
  var `type`: AbiType
}

object MethodAbi {
  @scala.inline
  def apply(
    constant: scala.Boolean,
    inputs: js.Array[DataItem],
    name: java.lang.String,
    outputs: js.Array[DataItem],
    payable: scala.Boolean,
    stateMutability: StateMutability,
    `type`: AbiType
  ): MethodAbi = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("constant")(constant)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("outputs")(outputs)
    __obj.updateDynamic("payable")(payable)
    __obj.updateDynamic("stateMutability")(stateMutability)
    __obj.asInstanceOf[MethodAbi]
  }
}

