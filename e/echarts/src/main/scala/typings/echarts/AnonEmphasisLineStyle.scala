package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmphasisLineStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis
    */
  var emphasis: js.UndefOr[AnonLineStyleAnonColorCurvenessOpacityShadowBlur] = js.undefined
  /**
    * The line stlye of edge.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorCurvenessOpacityShadowBlur] = js.undefined
  /**
    * The
    * [name of source node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * of edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.source
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * The
    * [name of target node](https://echarts.apache.org/en/option.html#series-graph.data.name)
    * of edge
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.target
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * The value of edge, which decides the width of edge.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object AnonEmphasisLineStyle {
  @scala.inline
  def apply(
    emphasis: AnonLineStyleAnonColorCurvenessOpacityShadowBlur = null,
    lineStyle: AnonColorCurvenessOpacityShadowBlur = null,
    source: String = null,
    target: String = null,
    value: Int | Double = null
  ): AnonEmphasisLineStyle = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmphasisLineStyle]
  }
}

