package typings.ethersprojectAbi.fragmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonFragmentType extends js.Object {
  var components: js.UndefOr[js.Array[JsonFragmentType]] = js.undefined
  var indexed: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object JsonFragmentType {
  @scala.inline
  def apply(
    components: js.Array[JsonFragmentType] = null,
    indexed: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    `type`: String = null
  ): JsonFragmentType = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonFragmentType]
  }
}

