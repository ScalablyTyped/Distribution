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
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Set to **true** when the radio input is checked and an uncontrolled component. */
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
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
    customStyles: StringDictionary[js.Any] = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    value: String = null
  ): FormRadioItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormRadioItemProps]
  }
}

