package typings
package fundamentalDashReactLib.libButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /* Set to **true** if button triggers a dropdown list. */
  var dropdown: js.UndefOr[scala.Boolean] = js.undefined
  var glyph: js.UndefOr[java.lang.String] = js.undefined
  /* Set to **true** if button is part of global navbar. */
  var navbar: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /* Indicates the importance of the button. */
  var option: js.UndefOr[ButtonOptions] = js.undefined
  /* Set to **true** to set state of the button to "selected". */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[ButtonTypes] = js.undefined
  /* Value for the `type` attribute on the `<button>` element. */
  var typeAttr: js.UndefOr[
    fundamentalDashReactLib.fundamentalDashReactLibStrings.submit | fundamentalDashReactLib.fundamentalDashReactLibStrings.reset | fundamentalDashReactLib.fundamentalDashReactLibStrings.button
  ] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdown: js.UndefOr[scala.Boolean] = js.undefined,
    glyph: java.lang.String = null,
    navbar: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, stdLib.MouseEvent] => scala.Unit = null,
    option: ButtonOptions = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: ButtonTypes = null,
    typeAttr: fundamentalDashReactLib.fundamentalDashReactLibStrings.submit | fundamentalDashReactLib.fundamentalDashReactLibStrings.reset | fundamentalDashReactLib.fundamentalDashReactLibStrings.button = null
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

