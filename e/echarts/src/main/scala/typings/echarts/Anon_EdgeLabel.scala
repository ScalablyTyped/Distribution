package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EdgeLabel extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.emphasis.edgeLabel
    */
  var edgeLabel: js.UndefOr[
    Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeightFormatter
  ] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColor] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
}

object Anon_EdgeLabel {
  @scala.inline
  def apply(
    edgeLabel: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeightFormatter = null,
    itemStyle: Anon_BorderColor = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null
  ): Anon_EdgeLabel = {
    val __obj = js.Dynamic.literal()
    if (edgeLabel != null) __obj.updateDynamic("edgeLabel")(edgeLabel)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    __obj.asInstanceOf[Anon_EdgeLabel]
  }
}

