package typings.gestalt.gestaltMod

import typings.gestalt.Anon_EventHTMLInputElement
import typings.gestalt.Anon_SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldProps extends js.Object {
  var accessibilityLabel: String
  var id: String
  var onBlur: js.UndefOr[js.Function1[/* args */ Anon_EventHTMLInputElement, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ Anon_SyntheticEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: Anon_SyntheticEvent): Unit
}

object SearchFieldProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    id: String,
    onChange: Anon_SyntheticEvent => Unit,
    onBlur: /* args */ Anon_EventHTMLInputElement => Unit = null,
    onFocus: /* args */ Anon_SyntheticEvent => Unit = null,
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

