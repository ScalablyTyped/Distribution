package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxListItem extends CollectionWidgetItem {
  /** @name dxListItem.badge */
  var badge: js.UndefOr[String] = js.undefined
  /** @name dxListItem.icon */
  var icon: js.UndefOr[String] = js.undefined
  /** @name dxListItem.key */
  var key: js.UndefOr[String] = js.undefined
  /** @name dxListItem.showChevron */
  var showChevron: js.UndefOr[Boolean] = js.undefined
}

object dxListItem {
  @scala.inline
  def apply(
    badge: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    icon: String = null,
    key: String = null,
    showChevron: js.UndefOr[Boolean] = js.undefined,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxListItem = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(showChevron)) __obj.updateDynamic("showChevron")(showChevron.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxListItem]
  }
}

