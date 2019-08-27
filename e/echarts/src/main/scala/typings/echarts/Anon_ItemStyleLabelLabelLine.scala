package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelLabelLine extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.emphasis.label
    */
  var label: js.UndefOr[
    Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize
  ] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.emphasis.labelLine
    */
  var labelLine: js.UndefOr[Anon_EmphasisLengthLineStyle] = js.undefined
}

object Anon_ItemStyleLabelLabelLine {
  @scala.inline
  def apply(
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize = null,
    labelLine: Anon_EmphasisLengthLineStyle = null
  ): Anon_ItemStyleLabelLabelLine = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine)
    __obj.asInstanceOf[Anon_ItemStyleLabelLabelLine]
  }
}

