package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionFragment extends js.Object {
  var constant: Boolean
  var inputs: js.Array[ParamType]
  var name: String
  var outputs: js.Array[ParamType]
  var payable: Boolean
  var stateMutability: String
  var `type`: String
}

object FunctionFragment {
  @scala.inline
  def apply(
    constant: Boolean,
    inputs: js.Array[ParamType],
    name: String,
    outputs: js.Array[ParamType],
    payable: Boolean,
    stateMutability: String,
    `type`: String
  ): FunctionFragment = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], payable = payable.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionFragment]
  }
}

