package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EmphasisLabel extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.emphasis
    */
  var emphasis: js.UndefOr[Anon_LabelLineStyle] = js.native
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.label
    */
  var label: js.UndefOr[
    Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSizeFontStyleFontWeightFormatter
  ] = js.native
  /**
    * Line style of edges.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorCurvenessOpacity] = js.native
  /**
    * [name of source node](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.source
    */
  var source: js.UndefOr[java.lang.String] = js.native
  /**
    * Symbol of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | java.lang.String] = js.native
  /**
    * Symbol size of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | java.lang.String] = js.native
  /**
    * [name of target node](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.target
    */
  var target: js.UndefOr[java.lang.String] = js.native
  /**
    * value of edge, can be mapped to edge length in force graph.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links.value
    */
  var value: js.UndefOr[scala.Double] = js.native
}

