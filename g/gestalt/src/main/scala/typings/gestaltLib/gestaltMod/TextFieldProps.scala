package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldProps extends js.Object {
  var autoComplete: js.UndefOr[
    gestaltLib.gestaltLibStrings.`current-password` | gestaltLib.gestaltLibStrings.on | gestaltLib.gestaltLibStrings.off | gestaltLib.gestaltLibStrings.username
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var idealErrorDirection: js.UndefOr[
    gestaltLib.gestaltLibStrings.up | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.down | gestaltLib.gestaltLibStrings.left
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventValueElement, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventValueElement, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    gestaltLib.gestaltLibStrings.date | gestaltLib.gestaltLibStrings.email | gestaltLib.gestaltLibStrings.number | gestaltLib.gestaltLibStrings.password | gestaltLib.gestaltLibStrings.text | gestaltLib.gestaltLibStrings.url
  ] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  def onChange(args: gestaltLib.Anon_EventValue): scala.Unit
}

object TextFieldProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    onChange: js.Function1[gestaltLib.Anon_EventValue, scala.Unit],
    autoComplete: gestaltLib.gestaltLibStrings.`current-password` | gestaltLib.gestaltLibStrings.on | gestaltLib.gestaltLibStrings.off | gestaltLib.gestaltLibStrings.username = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    errorMessage: java.lang.String = null,
    idealErrorDirection: gestaltLib.gestaltLibStrings.up | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.down | gestaltLib.gestaltLibStrings.left = null,
    name: java.lang.String = null,
    onBlur: js.Function1[/* args */ gestaltLib.Anon_EventValueElement, scala.Unit] = null,
    onFocus: js.Function1[/* args */ gestaltLib.Anon_EventValueElement, scala.Unit] = null,
    placeholder: java.lang.String = null,
    `type`: gestaltLib.gestaltLibStrings.date | gestaltLib.gestaltLibStrings.email | gestaltLib.gestaltLibStrings.number | gestaltLib.gestaltLibStrings.password | gestaltLib.gestaltLibStrings.text | gestaltLib.gestaltLibStrings.url = null,
    value: java.lang.String = null
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal(id = id, onChange = onChange)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextFieldProps]
  }
}

