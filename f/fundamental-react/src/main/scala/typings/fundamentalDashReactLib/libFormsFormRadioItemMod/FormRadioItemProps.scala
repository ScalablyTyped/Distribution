package typings
package fundamentalDashReactLib.libFormsFormRadioItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormRadioItemProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Set to **true** when radio input is checked and a controlled component. */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Set to **true** when the radio input is checked and an uncontrolled component. */
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /* Sets the `name` for the radio input. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /* Sets the `value` for the radio input. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object FormRadioItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    value: java.lang.String = null
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

