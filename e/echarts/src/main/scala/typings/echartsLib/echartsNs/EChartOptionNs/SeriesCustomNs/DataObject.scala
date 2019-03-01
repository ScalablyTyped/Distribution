package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesCustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleAnonBorderColor] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderTypeBorderWidth] = js.undefined
  /**
    * Name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * Value of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.value
    */
  var value: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: echartsLib.Anon_ItemStyleAnonBorderColor = null,
    itemStyle: echartsLib.Anon_BorderColorBorderTypeBorderWidth = null,
    name: java.lang.String = null,
    tooltip: echartsLib.Anon_BackgroundColorBorderColor = null,
    value: scala.Double | js.Array[scala.Double] = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

