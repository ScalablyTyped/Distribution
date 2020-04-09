package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTabPanelItem extends CollectionWidgetItem {
  /** @name dxTabPanelItem.badge */
  var badge: js.UndefOr[String] = js.undefined
  /** @name dxTabPanelItem.icon */
  var icon: js.UndefOr[String] = js.undefined
  /** @name dxTabPanelItem.tabTemplate */
  var tabTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.undefined
  /** @name dxTabPanelItem.title */
  var title: js.UndefOr[String] = js.undefined
}

object dxTabPanelItem {
  @scala.inline
  def apply(
    badge: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    icon: String = null,
    tabTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxTabPanelItem = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (tabTemplate != null) __obj.updateDynamic("tabTemplate")(tabTemplate.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTabPanelItem]
  }
}

