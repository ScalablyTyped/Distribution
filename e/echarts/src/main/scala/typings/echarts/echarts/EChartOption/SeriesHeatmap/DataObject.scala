package typings.echarts.echarts.EChartOption.SeriesHeatmap

import typings.echarts.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth
import typings.echarts.Anon_BorderColorBorderType
import typings.echarts.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorBorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.data.emphasis
    */
  var emphasis: js.UndefOr[
    Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorBorderType
  ] = js.undefined
  /**
    * Style of a single data point. It is valid with
    * [coordinateSystem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.coordinateSystem)
    * of 'cartesian2d' value.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.data.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * It is valid with
    * [coordinateSystem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.coordinateSystem)
    * of 'cartesian2d' value.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-heatmap.data.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
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
    emphasis: Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthAnonBorderColorBorderType = null,
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidth = null,
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

