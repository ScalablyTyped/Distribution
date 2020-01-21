package typings.googleProtobuf.descriptorPbMod.FieldOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ctype: js.UndefOr[CType] = js.undefined
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var jstype: js.UndefOr[JSType] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var packed: js.UndefOr[Boolean] = js.undefined
  var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
  var weak: js.UndefOr[Boolean] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject],
    ctype: CType = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    jstype: JSType = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    packed: js.UndefOr[Boolean] = js.undefined,
    weak: js.UndefOr[Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
    if (ctype != null) __obj.updateDynamic("ctype")(ctype.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (jstype != null) __obj.updateDynamic("jstype")(jstype.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(packed)) __obj.updateDynamic("packed")(packed.asInstanceOf[js.Any])
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

