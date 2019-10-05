package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var allowAlias: js.UndefOr[Boolean] = js.undefined
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var uninterpretedOptionList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption.AsObject
    ],
    allowAlias: js.UndefOr[Boolean] = js.undefined,
    deprecated: js.UndefOr[Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList)
    if (!js.isUndefined(allowAlias)) __obj.updateDynamic("allowAlias")(allowAlias)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    __obj.asInstanceOf[AsObject]
  }
}

