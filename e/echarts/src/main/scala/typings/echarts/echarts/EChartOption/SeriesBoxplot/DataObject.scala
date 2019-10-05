package typings.echarts.echarts.EChartOption.SeriesBoxplot

import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BorderColorBorderType
import typings.echarts.Anon_ItemStyleAnonBorderColorBorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.data.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleAnonBorderColorBorderType] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.data.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * Name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.data.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * Value of data item.
    *
    * ```
    * [min, Q1, median (or Q2), Q3, max]
    *
    * ```
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.data.value
    */
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: Anon_ItemStyleAnonBorderColorBorderType = null,
    itemStyle: Anon_BorderColorBorderType = null,
    name: String = null,
    tooltip: Anon_BackgroundColorBorderColor = null,
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

