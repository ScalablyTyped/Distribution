package typings.gestalt.gestaltMod

import typings.gestalt.Anon_Checked
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: String
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[sm | md] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: Anon_Checked): Unit
}

object RadioButtonProps {
  @scala.inline
  def apply(
    id: String,
    onChange: Anon_Checked => Unit,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: sm | md = null,
    value: String = null
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal(id = id, onChange = js.Any.fromFunction1(onChange))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioButtonProps]
  }
}

