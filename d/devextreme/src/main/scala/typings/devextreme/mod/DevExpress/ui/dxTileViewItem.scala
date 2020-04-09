package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTileViewItem extends CollectionWidgetItem {
  /** @name dxTileViewItem.heightRatio */
  var heightRatio: js.UndefOr[Double] = js.undefined
  /** @name dxTileViewItem.widthRatio */
  var widthRatio: js.UndefOr[Double] = js.undefined
}

object dxTileViewItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    heightRatio: Int | Double = null,
    html: String = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    widthRatio: Int | Double = null
  ): dxTileViewItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (heightRatio != null) __obj.updateDynamic("heightRatio")(heightRatio.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (widthRatio != null) __obj.updateDynamic("widthRatio")(widthRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTileViewItem]
  }
}

