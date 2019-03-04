package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var displayName: java.lang.String
  var entityTypeDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var isList: js.UndefOr[scala.Boolean] = js.undefined
  var mandatory: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var prompts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Parameter {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    name: java.lang.String,
    defaultValue: java.lang.String = null,
    entityTypeDisplayName: java.lang.String = null,
    isList: js.UndefOr[scala.Boolean] = js.undefined,
    mandatory: js.UndefOr[scala.Boolean] = js.undefined,
    prompts: js.Array[java.lang.String] = null,
    value: java.lang.String = null
  ): Parameter = {
    val __obj = js.Dynamic.literal(displayName = displayName, name = name)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (entityTypeDisplayName != null) __obj.updateDynamic("entityTypeDisplayName")(entityTypeDisplayName)
    if (!js.isUndefined(isList)) __obj.updateDynamic("isList")(isList)
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory)
    if (prompts != null) __obj.updateDynamic("prompts")(prompts)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Parameter]
  }
}

