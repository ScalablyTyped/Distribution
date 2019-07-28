package typings.echarts.echartsNs.EChartOptionNs.SeriesMapNs

import typings.echarts.Anon_AreaColorAnonBorderColor
import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistance
import typings.echarts.Anon_ItemStyleLabelAnonAreaColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleLabelAnonAreaColor] = js.undefined
  /**
    * Style of item polygon
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_AreaColorAnonBorderColor] = js.undefined
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter,
    * `label`is taken to be at the same level with `itemStyle`,
    * and has `emphasis` as `itemStyle` does.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.label
    */
  var label: js.UndefOr[Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistance] = js.undefined
  /**
    * The name of the map area where the data belongs to, such
    * as `'China'` or `'United Kingdom'` .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether the are selected.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * The numerical value of this area.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    emphasis: Anon_ItemStyleLabelAnonAreaColor = null,
    itemStyle: Anon_AreaColorAnonBorderColor = null,
    label: Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistance = null,
    name: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    tooltip: Anon_BackgroundColorBorderColor = null,
    value: Int | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

