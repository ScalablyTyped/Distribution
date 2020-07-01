package typings.echarts.echarts.EChartOption.SeriesFunnel

import typings.echarts.anon.BorderType
import typings.echarts.anon.FontWeight
import typings.echarts.anon.LabelLabelLine
import typings.echarts.anon.Length
import typings.echarts.echarts.EChartOption.BaseTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.emphasis
    */
  var emphasis: js.UndefOr[LabelLabelLine] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * The label configuration of a single data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.label
    */
  var label: js.UndefOr[FontWeight] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.data.labelLine
    */
  var labelLine: js.UndefOr[Length] = js.undefined
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
  var tooltip: js.UndefOr[BaseTooltip] = js.undefined
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
    emphasis: LabelLabelLine = null,
    itemStyle: BorderType = null,
    label: FontWeight = null,
    labelLine: Length = null,
    name: String = null,
    tooltip: BaseTooltip = null,
    value: js.UndefOr[Double] = js.undefined
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

