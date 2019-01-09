package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleLabelAnonAreaColor] = js.undefined
  /**
    * Style of item polygon
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_AreaColorAnonBorderColor] = js.undefined
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
  var label: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistance] = js.undefined
  /**
    * The name of the map area where the data belongs to, such
    * as `'China'` or `'United Kingdom'` .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the are selected.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.selected
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * The numerical value of this area.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

