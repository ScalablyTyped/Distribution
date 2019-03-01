package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MessageOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  var mapEntry: js.UndefOr[scala.Boolean] = js.undefined
  var messageSetWireFormat: js.UndefOr[scala.Boolean] = js.undefined
  var noStandardDescriptorAccessor: js.UndefOr[scala.Boolean] = js.undefined
  var uninterpretedOptionList: js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
    ],
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    mapEntry: js.UndefOr[scala.Boolean] = js.undefined,
    messageSetWireFormat: js.UndefOr[scala.Boolean] = js.undefined,
    noStandardDescriptorAccessor: js.UndefOr[scala.Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uninterpretedOptionList")(uninterpretedOptionList)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (!js.isUndefined(mapEntry)) __obj.updateDynamic("mapEntry")(mapEntry)
    if (!js.isUndefined(messageSetWireFormat)) __obj.updateDynamic("messageSetWireFormat")(messageSetWireFormat)
    if (!js.isUndefined(noStandardDescriptorAccessor)) __obj.updateDynamic("noStandardDescriptorAccessor")(noStandardDescriptorAccessor)
    __obj.asInstanceOf[AsObject]
  }
}

