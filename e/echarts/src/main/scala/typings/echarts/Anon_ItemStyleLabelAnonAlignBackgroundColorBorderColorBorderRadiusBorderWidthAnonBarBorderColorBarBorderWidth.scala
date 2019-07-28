package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBarBorderColorBarBorderWidth extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BarBorderColorBarBorderWidth] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.data.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
}

object Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBarBorderColorBarBorderWidth {
  @scala.inline
  def apply(
    itemStyle: Anon_BarBorderColorBarBorderWidth = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth = null
  ): Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBarBorderColorBarBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBarBorderColorBarBorderWidth]
  }
}

