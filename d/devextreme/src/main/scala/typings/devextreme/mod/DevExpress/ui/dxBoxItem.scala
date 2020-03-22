package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxBoxItem extends CollectionWidgetItem {
  /** Specifies the base size of an item element along the main direction. */
  var baseSize: js.UndefOr[Double | auto] = js.undefined
  /** Holds a Box configuration object for the item. */
  var box: js.UndefOr[dxBoxOptions] = js.undefined
  /** Specifies the ratio value used to count the item element size along the main direction. */
  var ratio: js.UndefOr[Double] = js.undefined
  /** A factor that defines how much an item shrinks relative to the rest of the items in the container. */
  var shrink: js.UndefOr[Double] = js.undefined
}

object dxBoxItem {
  @scala.inline
  def apply(
    baseSize: Double | auto = null,
    box: dxBoxOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    ratio: Int | Double = null,
    shrink: Int | Double = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxBoxItem = {
    val __obj = js.Dynamic.literal()
    if (baseSize != null) __obj.updateDynamic("baseSize")(baseSize.asInstanceOf[js.Any])
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxBoxItem]
  }
}

