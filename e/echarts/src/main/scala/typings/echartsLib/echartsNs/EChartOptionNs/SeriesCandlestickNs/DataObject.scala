package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesCandlestickNs

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
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleAnonBorderColorBorderColor0BorderWidth] = js.undefined
  /**
    * Style of a candle box.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.data.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderColor0] = js.undefined
  /**
    * Name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.data.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
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
    emphasis: echartsLib.Anon_ItemStyleAnonBorderColorBorderColor0BorderWidth = null,
    itemStyle: echartsLib.Anon_BorderColorBorderColor0 = null,
    name: java.lang.String = null,
    tooltip: echartsLib.Anon_BackgroundColorBorderColor = null,
    value: js.Array[_] = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataObject]
  }
}

