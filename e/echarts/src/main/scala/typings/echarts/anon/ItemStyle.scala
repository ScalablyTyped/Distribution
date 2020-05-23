package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BarBorderWidth] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.emphasis.label
    */
  var label: js.UndefOr[BorderRadius] = js.undefined
}

object ItemStyle {
  @scala.inline
  def apply(itemStyle: BarBorderWidth = null, label: BorderRadius = null): ItemStyle = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStyle]
  }
}

