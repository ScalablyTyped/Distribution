package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var allowAlias: js.UndefOr[scala.Boolean] = js.undefined
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
    allowAlias: js.UndefOr[scala.Boolean] = js.undefined,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uninterpretedOptionList")(uninterpretedOptionList)
    if (!js.isUndefined(allowAlias)) __obj.updateDynamic("allowAlias")(allowAlias)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    __obj.asInstanceOf[AsObject]
  }
}

