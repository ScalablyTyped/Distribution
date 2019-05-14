package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelAnonAreaColor extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_AreaColor] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.emphasis.label
    */
  var label: js.UndefOr[Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily] = js.undefined
}

object Anon_ItemStyleLabelAnonAreaColor {
  @scala.inline
  def apply(
    itemStyle: Anon_AreaColor = null,
    label: Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily = null
  ): Anon_ItemStyleLabelAnonAreaColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_ItemStyleLabelAnonAreaColor]
  }
}

