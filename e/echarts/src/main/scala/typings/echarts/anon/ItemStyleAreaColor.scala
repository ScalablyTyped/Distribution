package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemStyleAreaColor extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AreaColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.label
    */
  var label: js.UndefOr[Rotate] = js.undefined
}

object ItemStyleAreaColor {
  @scala.inline
  def apply(itemStyle: AreaColor = null, label: Rotate = null): ItemStyleAreaColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStyleAreaColor]
  }
}

