package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyleBarBorderWidth extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BarBorderWidth] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.undefined
}

object ItemStyleBarBorderWidth {
  @scala.inline
  def apply(itemStyle: BarBorderWidth = null, label: Distance = null): ItemStyleBarBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStyleBarBorderWidth]
  }
}

