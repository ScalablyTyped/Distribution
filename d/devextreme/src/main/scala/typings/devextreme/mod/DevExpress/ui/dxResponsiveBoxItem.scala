package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonCol
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxResponsiveBoxItem extends CollectionWidgetItem {
  /** Specifies the item location and size against the widget grid. */
  var location: js.UndefOr[AnonCol | js.Array[AnonCol]] = js.undefined
}

object dxResponsiveBoxItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    location: AnonCol | js.Array[AnonCol] = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxResponsiveBoxItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxResponsiveBoxItem]
  }
}

