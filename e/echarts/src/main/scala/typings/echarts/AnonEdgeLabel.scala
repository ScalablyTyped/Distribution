package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdgeLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.edgeLabel
    */
  var edgeLabel: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorOpacityShadowBlur] = js.undefined
}

object AnonEdgeLabel {
  @scala.inline
  def apply(
    edgeLabel: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = null,
    itemStyle: AnonBorderColorBorderType = null,
    label: AnonAlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    lineStyle: AnonColorOpacityShadowBlur = null
  ): AnonEdgeLabel = {
    val __obj = js.Dynamic.literal()
    if (edgeLabel != null) __obj.updateDynamic("edgeLabel")(edgeLabel.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdgeLabel]
  }
}

