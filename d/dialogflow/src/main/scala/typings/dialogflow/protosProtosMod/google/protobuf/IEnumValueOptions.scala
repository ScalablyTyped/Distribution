package typings.dialogflow.protosProtosMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EnumValueOptions. */
trait IEnumValueOptions extends js.Object {
  /** EnumValueOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** EnumValueOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IEnumValueOptions {
  @scala.inline
  def apply(
    deprecated: js.UndefOr[Boolean] = js.undefined,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IEnumValueOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption)
    __obj.asInstanceOf[IEnumValueOptions]
  }
}

