package typings.echarts.echarts.EChartOption.SeriesCustom

import typings.echarts.AnonBorderType
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonItemStyleAnonBorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-custom.data.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleAnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-custom.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * Name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.data.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * Value of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.data.value
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: AnonItemStyleAnonBorderType = null,
    itemStyle: AnonBorderType = null,
    name: String = null,
    tooltip: AnonExtraCssText = null,
    value: Double | js.Array[Double] = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

