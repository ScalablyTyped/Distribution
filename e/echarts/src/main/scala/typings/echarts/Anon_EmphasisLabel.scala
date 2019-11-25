package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmphasisLabel extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.emphasis
    */
  var emphasis: js.UndefOr[Anon_LabelLineStyle] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily] = js.undefined
  /**
    * Line style of edges.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorCurvenessOpacity] = js.undefined
  /**
    * [name of source node](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.source
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * Symbol of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | String] = js.undefined
  /**
    * Symbol size of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | String] = js.undefined
  /**
    * [name of target node](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.target
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * value of edge, can be mapped to edge length in force graph.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_EmphasisLabel {
  @scala.inline
  def apply(
    emphasis: Anon_LabelLineStyle = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = null,
    lineStyle: Anon_ColorCurvenessOpacity = null,
    source: String = null,
    symbol: js.Array[_] | String = null,
    symbolSize: js.Array[_] | String = null,
    target: String = null,
    value: Int | Double = null
  ): Anon_EmphasisLabel = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmphasisLabel]
  }
}

