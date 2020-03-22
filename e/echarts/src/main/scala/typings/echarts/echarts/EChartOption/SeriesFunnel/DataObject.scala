package typings.echarts.echarts.EChartOption.SeriesFunnel

import typings.echarts.AnonBorderType
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonLabelLabelLine
import typings.echarts.AnonLength
import typings.echarts.AnonLineHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis
    */
  var emphasis: js.UndefOr[AnonLabelLabelLine] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * The label configuration of a single data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.label
    */
  var label: js.UndefOr[AnonLineHeight] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.labelLine
    */
  var labelLine: js.UndefOr[AnonLength] = js.undefined
  /**
    * the name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * data value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: AnonLabelLabelLine = null,
    itemStyle: AnonBorderType = null,
    label: AnonLineHeight = null,
    labelLine: AnonLength = null,
    name: String = null,
    tooltip: AnonExtraCssText = null,
    value: Int | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

