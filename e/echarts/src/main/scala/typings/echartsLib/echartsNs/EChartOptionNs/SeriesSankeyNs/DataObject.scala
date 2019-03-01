package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesSankeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.data.emphasis
    */
  var emphasis: js.UndefOr[
    echartsLib.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorOptional
  ] = js.undefined
  /**
    * The style of this node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.data.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderTypeBorderWidth] = js.undefined
  /**
    * The lable style of this node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.data.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize
  ] = js.undefined
  /**
    * The name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.data.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * The value of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.data.value
    */
  var value: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: echartsLib.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorOptional = null,
    itemStyle: echartsLib.Anon_BorderColorBorderTypeBorderWidth = null,
    label: echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize = null,
    name: java.lang.String = null,
    tooltip: echartsLib.Anon_BackgroundColorBorderColor = null,
    value: js.Array[_] | scala.Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

