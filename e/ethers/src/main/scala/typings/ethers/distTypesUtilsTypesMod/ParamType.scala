package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamType extends js.Object {
  var components: js.UndefOr[js.Array[_]] = js.undefined
  var indexed: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: String
}

object ParamType {
  @scala.inline
  def apply(
    `type`: String,
    components: js.Array[_] = null,
    indexed: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): ParamType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (components != null) __obj.updateDynamic("components")(components)
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ParamType]
  }
}

