package typings.fundamentalDashReact.libFormsFormInputMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormInputProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /* Value for the `name` attribute on the input. */
  var name: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /* Sets the state of the input. Can be left empty for default styles. */
  var state: js.UndefOr[InputType] = js.undefined
  /* Value for the `type` attribute on the input. */
  var `type`: js.UndefOr[String] = js.undefined
  /* Value for the `value` attribute on the input. */
  var value: js.UndefOr[String] = js.undefined
}

object FormInputProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    state: InputType = null,
    `type`: String = null,
    value: String = null
  ): FormInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (state != null) __obj.updateDynamic("state")(state)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FormInputProps]
  }
}

