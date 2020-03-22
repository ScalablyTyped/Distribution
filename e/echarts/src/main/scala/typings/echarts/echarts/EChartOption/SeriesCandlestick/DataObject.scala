package typings.echarts.echarts.EChartOption.SeriesCandlestick

import typings.echarts.AnonBorderColor0
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonItemStyleAnonBorderColor0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * Emphasis style of a candle box.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleAnonBorderColor0] = js.undefined
  /**
    * Style of a candle box.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColor0] = js.undefined
  /**
    * Name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * Value of data item.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.value
    */
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: AnonItemStyleAnonBorderColor0 = null,
    itemStyle: AnonBorderColor0 = null,
    name: String = null,
    tooltip: AnonExtraCssText = null,
    value: js.Array[_] = null
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

