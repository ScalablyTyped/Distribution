package typings.gestalt.mod

import typings.gestalt.AnonEventHTMLInputElement
import typings.gestalt.AnonSyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldProps extends js.Object {
  var accessibilityLabel: String
  var id: String
  var onBlur: js.UndefOr[js.Function1[/* args */ AnonEventHTMLInputElement, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ AnonSyntheticEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: AnonSyntheticEvent): Unit
}

object SearchFieldProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    id: String,
    onChange: AnonSyntheticEvent => Unit,
    onBlur: /* args */ AnonEventHTMLInputElement => Unit = null,
    onFocus: /* args */ AnonSyntheticEvent => Unit = null,
    placeholder: String = null,
    value: String = null
  ): SearchFieldProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFieldProps]
  }
}

