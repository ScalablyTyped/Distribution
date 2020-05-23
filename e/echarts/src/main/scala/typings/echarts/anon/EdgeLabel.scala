package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.edgeLabel
    */
  var edgeLabel: js.UndefOr[FontStyle] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
}

object EdgeLabel {
  @scala.inline
  def apply(
    edgeLabel: FontStyle = null,
    itemStyle: BorderType = null,
    label: Distance = null,
    lineStyle: ShadowBlur = null
  ): EdgeLabel = {
    val __obj = js.Dynamic.literal()
    if (edgeLabel != null) __obj.updateDynamic("edgeLabel")(edgeLabel.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeLabel]
  }
}

