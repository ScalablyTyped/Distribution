package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxMenuBaseItem extends CollectionWidgetItem {
  /** Specifies whether a group separator is displayed over the item. */
  var beginGroup: js.UndefOr[Boolean] = js.undefined
  /** Specifies if a menu is closed when a user clicks the item. */
  var closeMenuOnClick: js.UndefOr[Boolean] = js.undefined
  /** Specifies the menu item's icon. */
  var icon: js.UndefOr[String] = js.undefined
  /** Specifies nested menu items. */
  var items: js.UndefOr[js.Array[dxMenuBaseItem]] = js.undefined
  /** Specifies whether or not a user can select a menu item. */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not the item is selected. */
  var selected: js.UndefOr[Boolean] = js.undefined
}

object dxMenuBaseItem {
  @scala.inline
  def apply(
    beginGroup: js.UndefOr[Boolean] = js.undefined,
    closeMenuOnClick: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    icon: String = null,
    items: js.Array[dxMenuBaseItem] = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxMenuBaseItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beginGroup)) __obj.updateDynamic("beginGroup")(beginGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(closeMenuOnClick)) __obj.updateDynamic("closeMenuOnClick")(closeMenuOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxMenuBaseItem]
  }
}

