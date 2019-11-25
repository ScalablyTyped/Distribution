package typings.fundamentalDashReact.libComboboxInputComboboxInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxInputProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[js.Object] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[js.Object] = js.undefined
  /* An object containing a `Menu` component. */
  var menu: ReactElement
  var placeholder: js.UndefOr[String] = js.undefined
  var popoverProps: js.UndefOr[js.Object] = js.undefined
}

object ComboboxInputProps {
  @scala.inline
  def apply(
    menu: ReactElement,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    buttonProps: js.Object = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    inputProps: js.Object = null,
    placeholder: String = null,
    popoverProps: js.Object = null
  ): ComboboxInputProps = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxInputProps]
  }
}

