package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MessageOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var mapEntry: js.UndefOr[Boolean] = js.undefined
  var messageSetWireFormat: js.UndefOr[Boolean] = js.undefined
  var noStandardDescriptorAccessor: js.UndefOr[Boolean] = js.undefined
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
    mapEntry: js.UndefOr[Boolean] = js.undefined,
    messageSetWireFormat: js.UndefOr[Boolean] = js.undefined,
    noStandardDescriptorAccessor: js.UndefOr[Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (!js.isUndefined(mapEntry)) __obj.updateDynamic("mapEntry")(mapEntry.asInstanceOf[js.Any])
    if (!js.isUndefined(messageSetWireFormat)) __obj.updateDynamic("messageSetWireFormat")(messageSetWireFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(noStandardDescriptorAccessor)) __obj.updateDynamic("noStandardDescriptorAccessor")(noStandardDescriptorAccessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

