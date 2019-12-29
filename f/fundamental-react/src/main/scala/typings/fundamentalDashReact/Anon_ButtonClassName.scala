package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.fundamentalDashReactStrings.button_
import typings.fundamentalDashReact.fundamentalDashReactStrings.reset
import typings.fundamentalDashReact.fundamentalDashReactStrings.submit
import typings.fundamentalDashReact.libButtonButtonMod.ButtonOptions
import typings.fundamentalDashReact.libButtonButtonMod.ButtonTypes
import typings.react.reactMod.RefObject
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  /* Set to **true** if button is part of global navbar. */
  var navbar: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* event */ typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
  ] = js.undefined
  /* Indicates the importance of the button. */
  var option: js.UndefOr[ButtonOptions] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLButtonElement]] = js.undefined
  /* Set to **true** to set state of the button to "selected". */
  var selected: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[ButtonTypes] = js.undefined
  /* Value for the `type` attribute on the `<button>` element. */
  var typeAttr: js.UndefOr[submit | reset | button_] = js.undefined
}

object Anon_ButtonClassName {
  @scala.inline
  def apply(
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    navbar: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ typings.react.reactMod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit = null,
    option: ButtonOptions = null,
    ref: RefObject[HTMLButtonElement] = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    `type`: ButtonTypes = null,
    typeAttr: submit | reset | button_ = null
  ): Anon_ButtonClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeAttr != null) __obj.updateDynamic("typeAttr")(typeAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ButtonClassName]
  }
}

