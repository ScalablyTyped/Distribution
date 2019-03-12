package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldProps extends js.Object {
  var accessibilityLabel: java.lang.String
  var id: java.lang.String
  var onBlur: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventHTMLInputElement, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_SyntheticEvent, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  def onChange(args: gestaltLib.Anon_SyntheticEvent): scala.Unit
}

object SearchFieldProps {
  @scala.inline
  def apply(
    accessibilityLabel: java.lang.String,
    id: java.lang.String,
    onChange: gestaltLib.Anon_SyntheticEvent => scala.Unit,
    onBlur: /* args */ gestaltLib.Anon_EventHTMLInputElement => scala.Unit = null,
    onFocus: /* args */ gestaltLib.Anon_SyntheticEvent => scala.Unit = null,
    placeholder: java.lang.String = null,
    value: java.lang.String = null
  ): SearchFieldProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel, id = id, onChange = js.Any.fromFunction1(onChange))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SearchFieldProps]
  }
}

