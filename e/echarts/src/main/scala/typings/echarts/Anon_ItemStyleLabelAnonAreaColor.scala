package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelAnonAreaColor extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_AreaColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.label
    */
  var label: js.UndefOr[Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistance] = js.undefined
}

object Anon_ItemStyleLabelAnonAreaColor {
  @scala.inline
  def apply(
    itemStyle: Anon_AreaColor = null,
    label: Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistance = null
  ): Anon_ItemStyleLabelAnonAreaColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemStyleLabelAnonAreaColor]
  }
}

