package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionWidgetItem extends js.Object {
  /** @name CollectionWidgetItem.disabled */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** @name CollectionWidgetItem.html */
  var html: js.UndefOr[String] = js.undefined
  /** @name CollectionWidgetItem.template */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.undefined
  /** @name CollectionWidgetItem.text */
  var text: js.UndefOr[String] = js.undefined
  /** @name CollectionWidgetItem.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CollectionWidgetItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CollectionWidgetItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionWidgetItem]
  }
}

