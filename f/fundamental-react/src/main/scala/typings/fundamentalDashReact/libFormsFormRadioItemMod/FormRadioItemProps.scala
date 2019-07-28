package typings.fundamentalDashReact.libFormsFormRadioItemMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormRadioItemProps
  extends /* x */ StringDictionary[js.Any] {
  /* Set to **true** when radio input is checked and a controlled component. */
  var checked: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /* Set to **true** when the radio input is checked and an uncontrolled component. */
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /* Sets the `name` for the radio input. */
  var name: js.UndefOr[String] = js.undefined
  /* Sets the `value` for the radio input. */
  var value: js.UndefOr[String] = js.undefined
}

object FormRadioItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    value: String = null
  ): FormRadioItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FormRadioItemProps]
  }
}

