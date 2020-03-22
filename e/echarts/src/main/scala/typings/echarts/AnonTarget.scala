package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis
    */
  var emphasis: js.UndefOr[AnonLineStyleAnonCurvenessOpacity] = js.undefined
  /**
    * The line stlye of edge.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.lineStyle
    */
  var lineStyle: js.UndefOr[AnonCurvenessOpacity] = js.undefined
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

object AnonTarget {
  @scala.inline
  def apply(
    emphasis: AnonLineStyleAnonCurvenessOpacity = null,
    lineStyle: AnonCurvenessOpacity = null,
    source: String = null,
    target: String = null,
    value: Int | Double = null
  ): AnonTarget = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTarget]
  }
}

