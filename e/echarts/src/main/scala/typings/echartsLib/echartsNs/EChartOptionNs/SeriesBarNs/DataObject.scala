package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BarBorderColorBarBorderRadius] = js.undefined
  /**
    * The style setting of the text label in a single bar.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance
  ] = js.undefined
  /**
    * The name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * The value of a single data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.data.value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    itemStyle: echartsLib.Anon_BarBorderColorBarBorderRadius = null,
    label: echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistance = null,
    name: java.lang.String = null,
    tooltip: echartsLib.Anon_BackgroundColorBorderColor = null,
    value: scala.Int | scala.Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

