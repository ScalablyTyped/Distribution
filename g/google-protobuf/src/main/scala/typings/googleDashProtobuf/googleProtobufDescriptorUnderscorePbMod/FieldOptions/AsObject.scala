package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ctype: js.UndefOr[CType] = js.undefined
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var jstype: js.UndefOr[JSType] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var packed: js.UndefOr[Boolean] = js.undefined
  var uninterpretedOptionList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption.AsObject
  ]
  var weak: js.UndefOr[Boolean] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption.AsObject
    ],
    ctype: CType = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    jstype: JSType = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    packed: js.UndefOr[Boolean] = js.undefined,
    weak: js.UndefOr[Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList)
    if (ctype != null) __obj.updateDynamic("ctype")(ctype)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (jstype != null) __obj.updateDynamic("jstype")(jstype)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(packed)) __obj.updateDynamic("packed")(packed)
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak)
    __obj.asInstanceOf[AsObject]
  }
}

