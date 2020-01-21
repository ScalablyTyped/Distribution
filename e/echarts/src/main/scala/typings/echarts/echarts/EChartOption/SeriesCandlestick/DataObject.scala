package typings.echarts.echarts.EChartOption.SeriesCandlestick

import typings.echarts.AnonBackgroundColorBorderColor
import typings.echarts.AnonBorderColorBorderColor0
import typings.echarts.AnonItemStyleAnonBorderColorBorderColor0
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
  var emphasis: js.UndefOr[AnonItemStyleAnonBorderColorBorderColor0] = js.undefined
  /**
    * Style of a candle box.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderColor0] = js.undefined
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
  var tooltip: js.UndefOr[AnonBackgroundColorBorderColor] = js.undefined
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
    emphasis: AnonItemStyleAnonBorderColorBorderColor0 = null,
    itemStyle: AnonBorderColorBorderColor0 = null,
    name: String = null,
    tooltip: AnonBackgroundColorBorderColor = null,
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

