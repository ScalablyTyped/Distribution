package typings.ethersprojectAbi.fragmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonFragment extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var constant: js.UndefOr[Boolean] = js.undefined
  var gas: js.UndefOr[String] = js.undefined
  var inputs: js.UndefOr[js.Array[JsonFragmentType]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var outputs: js.UndefOr[js.Array[JsonFragmentType]] = js.undefined
  var payable: js.UndefOr[Boolean] = js.undefined
  var stateMutability: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object JsonFragment {
  @scala.inline
  def apply(
    anonymous: js.UndefOr[Boolean] = js.undefined,
    constant: js.UndefOr[Boolean] = js.undefined,
    gas: String = null,
    inputs: js.Array[JsonFragmentType] = null,
    name: String = null,
    outputs: js.Array[JsonFragmentType] = null,
    payable: js.UndefOr[Boolean] = js.undefined,
    stateMutability: String = null,
    `type`: String = null
  ): JsonFragment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(constant)) __obj.updateDynamic("constant")(constant.get.asInstanceOf[js.Any])
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (!js.isUndefined(payable)) __obj.updateDynamic("payable")(payable.get.asInstanceOf[js.Any])
    if (stateMutability != null) __obj.updateDynamic("stateMutability")(stateMutability.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonFragment]
  }
}

