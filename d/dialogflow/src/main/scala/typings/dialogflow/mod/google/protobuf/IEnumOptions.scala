package typings.dialogflow.mod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EnumOptions. */
trait IEnumOptions extends js.Object {
  /** EnumOptions allowAlias */
  var allowAlias: js.UndefOr[Boolean | Null] = js.undefined
  /** EnumOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** EnumOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IEnumOptions {
  @scala.inline
  def apply(
    allowAlias: js.UndefOr[Boolean] = js.undefined,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IEnumOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAlias)) __obj.updateDynamic("allowAlias")(allowAlias.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumOptions]
  }
}

