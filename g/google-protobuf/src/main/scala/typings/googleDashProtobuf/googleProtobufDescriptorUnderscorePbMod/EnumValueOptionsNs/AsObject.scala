package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumValueOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var uninterpretedOptionList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
    ],
    deprecated: js.UndefOr[Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    __obj.asInstanceOf[AsObject]
  }
}

