package typings.gestalt.mod

import typings.gestalt.anon.SyntheticEvent
import typings.gestalt.anon.`0`
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.name
import typings.gestalt.gestaltStrings.off
import typings.gestalt.gestaltStrings.on
import typings.gestalt.gestaltStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldProps extends js.Object {
  var accessibilityLabel: String
  var autoComplete: js.UndefOr[on | off | username | name] = js.undefined
  var id: String
  var onBlur: js.UndefOr[js.Function1[/* args */ `0`, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ SyntheticEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[md | lg] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: SyntheticEvent): Unit
}

object SearchFieldProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    id: String,
    onChange: SyntheticEvent => Unit,
    autoComplete: on | off | username | name = null,
    onBlur: /* args */ `0` => Unit = null,
    onFocus: /* args */ SyntheticEvent => Unit = null,
    placeholder: String = null,
    size: md | lg = null,
    value: String = null
  ): SearchFieldProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFieldProps]
  }
}

