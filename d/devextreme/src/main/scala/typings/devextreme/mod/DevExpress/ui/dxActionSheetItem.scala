package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonElementEvent
import typings.devextreme.devextremeStrings.back
import typings.devextreme.devextremeStrings.danger
import typings.devextreme.devextremeStrings.default_
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.success
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxActionSheetItem extends CollectionWidgetItem {
  /** Specifies the icon to be displayed on the action sheet button. */
  var icon: js.UndefOr[String] = js.undefined
  /** A handler for the click event raised for the button representing the given action sheet button. */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonElementEvent, _]) | String] = js.undefined
  /** Specifies the type of the button that represents an action sheet item. */
  var `type`: js.UndefOr[back | danger | default_ | normal | success] = js.undefined
}

object dxActionSheetItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    icon: String = null,
    onClick: (js.Function1[/* e */ AnonElementEvent, _]) | String = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    `type`: back | danger | default_ | normal | success = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxActionSheetItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxActionSheetItem]
  }
}

