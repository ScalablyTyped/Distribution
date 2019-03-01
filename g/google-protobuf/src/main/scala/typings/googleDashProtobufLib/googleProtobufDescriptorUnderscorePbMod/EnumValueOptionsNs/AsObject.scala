package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
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
    deprecated: js.UndefOr[scala.Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uninterpretedOptionList")(uninterpretedOptionList)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    __obj.asInstanceOf[AsObject]
  }
}

