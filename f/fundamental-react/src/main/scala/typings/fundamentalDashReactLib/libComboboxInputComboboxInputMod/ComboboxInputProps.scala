package typings
package fundamentalDashReactLib.libComboboxInputComboboxInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxInputProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[js.Object] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var inputProps: js.UndefOr[js.Object] = js.undefined
  /* An object containing a `Menu` component. */
  var menu: reactLib.reactMod.ReactElement[fundamentalDashReactLib.libMenuMenuMod.MenuProps]
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var popoverProps: js.UndefOr[js.Object] = js.undefined
}

object ComboboxInputProps {
  @scala.inline
  def apply(
    menu: reactLib.reactMod.ReactElement[fundamentalDashReactLib.libMenuMenuMod.MenuProps],
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    buttonProps: js.Object = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    inputProps: js.Object = null,
    placeholder: java.lang.String = null,
    popoverProps: js.Object = null
  ): ComboboxInputProps = {
    val __obj = js.Dynamic.literal(menu = menu)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps)
    __obj.asInstanceOf[ComboboxInputProps]
  }
}

