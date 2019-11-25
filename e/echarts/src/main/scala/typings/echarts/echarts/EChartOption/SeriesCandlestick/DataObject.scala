package typings.echarts.echarts.EChartOption.SeriesCandlestick

import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BorderColorBorderColor0
import typings.echarts.Anon_ItemStyleAnonBorderColorBorderColor0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * Emphasis style of a candle box.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.data.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleAnonBorderColorBorderColor0] = js.undefined
  /**
    * Style of a candle box.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.data.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderColor0] = js.undefined
  /**
    * Name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.data.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * Value of data item.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.data.value
    */
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: Anon_ItemStyleAnonBorderColorBorderColor0 = null,
    itemStyle: Anon_BorderColorBorderColor0 = null,
    name: String = null,
    tooltip: Anon_BackgroundColorBorderColor = null,
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

