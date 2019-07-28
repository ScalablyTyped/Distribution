package typings.fundamentalDashReact.libButtonButtonMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactStrings.button
import typings.fundamentalDashReact.fundamentalDashReactStrings.reset
import typings.fundamentalDashReact.fundamentalDashReactStrings.submit
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** if button triggers a dropdown list. */
  var dropdown: js.UndefOr[Boolean] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  /* Set to **true** if button is part of global navbar. */
  var navbar: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* event */ MouseEvent[HTMLButtonElement, typings.std.MouseEvent], Unit]
  ] = js.undefined
  /* Indicates the importance of the button. */
  var option: js.UndefOr[ButtonOptions] = js.undefined
  /* Set to **true** to set state of the button to "selected". */
  var selected: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[ButtonTypes] = js.undefined
  /* Value for the `type` attribute on the `<button>` element. */
  var typeAttr: js.UndefOr[submit | reset | button] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdown: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    navbar: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ MouseEvent[HTMLButtonElement, typings.std.MouseEvent] => Unit = null,
    option: ButtonOptions = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    `type`: ButtonTypes = null,
    typeAttr: submit | reset | button = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dropdown)) __obj.updateDynamic("dropdown")(dropdown)
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (option != null) __obj.updateDynamic("option")(option)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeAttr != null) __obj.updateDynamic("typeAttr")(typeAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

