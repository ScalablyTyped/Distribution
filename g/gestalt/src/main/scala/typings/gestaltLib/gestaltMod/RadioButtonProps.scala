package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  def onChange(args: gestaltLib.Anon_Checked): scala.Unit
}

object RadioButtonProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    onChange: js.Function1[gestaltLib.Anon_Checked, scala.Unit],
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    size: gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md = null,
    value: java.lang.String = null
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("onChange")(onChange)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioButtonProps]
  }
}

