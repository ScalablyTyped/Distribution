package typings.gestalt.mod

import typings.gestalt.AnonValueString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var helperText: js.UndefOr[String] = js.undefined
  var id: String
  var label: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* args */ AnonValueString, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ AnonValueString, Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* args */ AnonValueString, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: AnonValueString): Unit
}

object TextAreaProps {
  @scala.inline
  def apply(
    id: String,
    onChange: AnonValueString => Unit,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    helperText: String = null,
    label: String = null,
    name: String = null,
    onBlur: /* args */ AnonValueString => Unit = null,
    onFocus: /* args */ AnonValueString => Unit = null,
    onKeyDown: /* args */ AnonValueString => Unit = null,
    placeholder: String = null,
    rows: Int | Double = null,
    value: String = null
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaProps]
  }
}

