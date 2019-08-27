package typings.echarts.echartsNs.EChartOptionNs.SeriesHeatmapNs

import typings.echarts.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize
import typings.echarts.Anon_BorderColorBorderTypeBorderWidthColor
import typings.echarts.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorBorderTypeOptional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.data.emphasis
    */
  var emphasis: js.UndefOr[
    Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorBorderTypeOptional
  ] = js.undefined
  /**
    * Style of a single data point. It is valid with
    * [coordinateSystem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.coordinateSystem)
    * of 'cartesian2d' value.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.data.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderTypeBorderWidthColor] = js.undefined
  /**
    * It is valid with
    * [coordinateSystem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.coordinateSystem)
    * of 'cartesian2d' value.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.data.label
    */
  var label: js.UndefOr[
    Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize
  ] = js.undefined
  /**
    * Name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Value of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.data.value
    */
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorBorderTypeOptional = null,
    itemStyle: Anon_BorderColorBorderTypeBorderWidthColor = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize = null,
    name: String = null,
    value: js.Array[_] = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataObject]
  }
}

