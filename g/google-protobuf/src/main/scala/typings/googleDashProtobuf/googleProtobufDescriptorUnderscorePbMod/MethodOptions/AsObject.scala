package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var idempotencyLevel: js.UndefOr[IdempotencyLevel] = js.undefined
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
    deprecated: js.UndefOr[Boolean] = js.undefined,
    idempotencyLevel: IdempotencyLevel = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (idempotencyLevel != null) __obj.updateDynamic("idempotencyLevel")(idempotencyLevel)
    __obj.asInstanceOf[AsObject]
  }
}

