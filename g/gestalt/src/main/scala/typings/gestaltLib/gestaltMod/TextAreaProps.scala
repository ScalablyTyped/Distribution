package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps extends js.Object {
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
  var rows: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  def onChange(args: gestaltLib.Anon_EventValue): scala.Unit
}

object TextAreaProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    onChange: gestaltLib.Anon_EventValue => scala.Unit,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    errorMessage: java.lang.String = null,
    idealErrorDirection: gestaltLib.gestaltLibStrings.up | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.down | gestaltLib.gestaltLibStrings.left = null,
    name: java.lang.String = null,
    onBlur: /* args */ gestaltLib.Anon_EventValueElement => scala.Unit = null,
    onFocus: /* args */ gestaltLib.Anon_EventValueElement => scala.Unit = null,
    placeholder: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    value: java.lang.String = null
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal(id = id, onChange = js.Any.fromFunction1(onChange))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextAreaProps]
  }
}

