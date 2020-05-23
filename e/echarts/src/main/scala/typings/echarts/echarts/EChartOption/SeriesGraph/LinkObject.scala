package typings.echarts.echarts.EChartOption.SeriesGraph

import typings.echarts.anon.FontStyle
import typings.echarts.anon.LabelLineStyle
import typings.echarts.anon.ShadowColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis
    */
  var emphasis: js.UndefOr[LabelLineStyle] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.label
    */
  var label: js.UndefOr[FontStyle] = js.undefined
  /**
    * Line style of edges.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.undefined
  /**
    * [name of source node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.source
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * Symbol of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | String] = js.undefined
  /**
    * Symbol size of edge ends.
    * Can be an array with two item to specify two ends, or a string
    * specifies both ends.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | String] = js.undefined
  /**
    * [name of target node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * on edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.target
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * value of edge, can be mapped to edge length in force graph.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object LinkObject {
  @scala.inline
  def apply(
    emphasis: LabelLineStyle = null,
    label: FontStyle = null,
    lineStyle: ShadowColor = null,
    source: String = null,
    symbol: js.Array[_] | String = null,
    symbolSize: js.Array[_] | String = null,
    target: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): LinkObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkObject]
  }
}

