package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md] = js.undefined
  def onChange(args: gestaltLib.Anon_Checked): scala.Unit
}

object CheckboxProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    onChange: js.Function1[gestaltLib.Anon_Checked, scala.Unit],
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    size: gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("onChange")(onChange)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

