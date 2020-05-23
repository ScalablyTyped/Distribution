package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxMenuItem extends dxMenuBaseItem {
  /** @name dxMenuItem.items */
  @JSName("items")
  var items_dxMenuItem: js.UndefOr[js.Array[dxMenuItem]] = js.undefined
}

object dxMenuItem {
  @scala.inline
  def apply(
    beginGroup: js.UndefOr[Boolean] = js.undefined,
    closeMenuOnClick: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    icon: String = null,
    items: js.Array[dxMenuItem] = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxMenuItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beginGroup)) __obj.updateDynamic("beginGroup")(beginGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeMenuOnClick)) __obj.updateDynamic("closeMenuOnClick")(closeMenuOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxMenuItem]
  }
}

