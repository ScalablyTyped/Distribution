package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelUpperLabel extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_ColorString] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.upperLabel
    */
  var upperLabel: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis] = js.undefined
}

object Anon_ItemStyleLabelUpperLabel {
  @scala.inline
  def apply(
    itemStyle: Anon_ColorString = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis = null,
    upperLabel: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis = null
  ): Anon_ItemStyleLabelUpperLabel = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (upperLabel != null) __obj.updateDynamic("upperLabel")(upperLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemStyleLabelUpperLabel]
  }
}

