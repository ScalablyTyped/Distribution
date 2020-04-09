package typings.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EChartOption {
  type Calendar = typings.echarts.echarts.EChartOption.Calendar_
  /**
    * Color type for itemStyle / areaStyle etc.
    * [Color](https://echarts.apache.org/zh/option.html#series-line.areaStyle)
    * + Linear gradient. First four parameters are x0, y0, x2, and y2, each ranged from 0 to 1, standing for percentage in the bounding box. If global is `true`, then the first four parameters are in absolute pixel positions.
    * + Radial gradient. First three parameters are x and y positions of center, and radius, similar to linear gradient.
    * + Fill with texture
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.echarts.AnonType
    - typings.echarts.AnonX
    - typings.echarts.AnonImage
  */
  type Color = typings.echarts.echarts.EChartOption._Color | java.lang.String
  /**
    * Data zoom component of inside type.
    * Refer to dataZoom for more information.
    * The inside means it's inside the coordinates.
    * Translation: data area can be translated when moving in coordinates.
    * Scaling:
    * PC: when mouse rolls (similar with touch pad) in coordinates.
    * Mobile: when touches and moved with two fingers in coordinates
    * on touch screens.
    *
    * @todo describe
    * @see https://echarts.apache.org/en/option.html#dataZoom-inside
    * @see https://echarts.apache.org/en/option.html#dataZoom-slider
    */
  type DataZoom = typings.echarts.echarts.EChartOption.DataZoom.Inside | typings.echarts.echarts.EChartOption.DataZoom.Slider
  type Dataset = typings.echarts.echarts.EChartOption.Dataset_
  type Legend = typings.echarts.echarts.EChartOption.Legend_
  /**
    * @see https://echarts.apache.org/en/tutorial.html#Rich%20Text
    */
  type RichStyle = org.scalablytyped.runtime.StringDictionary[typings.echarts.echarts.EChartOption.TextStyle]
  type Series = typings.echarts.echarts.EChartOption.SeriesLine | typings.echarts.echarts.EChartOption.SeriesBar | typings.echarts.echarts.EChartOption.SeriesPie | typings.echarts.echarts.EChartOption.SeriesScatter | typings.echarts.echarts.EChartOption.SeriesEffectScatter | typings.echarts.echarts.EChartOption.SeriesRadar | typings.echarts.echarts.EChartOption.SeriesTree | typings.echarts.echarts.EChartOption.SeriesTreemap | typings.echarts.echarts.EChartOption.SeriesSunburst | typings.echarts.echarts.EChartOption.SeriesBoxplot | typings.echarts.echarts.EChartOption.SeriesCandlestick | typings.echarts.echarts.EChartOption.SeriesHeatmap | typings.echarts.echarts.EChartOption.SeriesMap | typings.echarts.echarts.EChartOption.SeriesParallel | typings.echarts.echarts.EChartOption.SeriesLines | typings.echarts.echarts.EChartOption.SeriesGraph | typings.echarts.echarts.EChartOption.SeriesSankey | typings.echarts.echarts.EChartOption.SeriesFunnel | typings.echarts.echarts.EChartOption.SeriesGauge | typings.echarts.echarts.EChartOption.SeriesPictorialBar | typings.echarts.echarts.EChartOption.SeriesThemeRiver | typings.echarts.echarts.EChartOption.SeriesCustom
  type SeriesBar = typings.echarts.echarts.EChartOption.SeriesBar_
  type SeriesBoxplot = typings.echarts.echarts.EChartOption.SeriesBoxplot_
  type SeriesCandlestick = typings.echarts.echarts.EChartOption.SeriesCandlestick_
  type SeriesCustom = typings.echarts.echarts.EChartOption.SeriesCustom_
  type SeriesEffectScatter = typings.echarts.echarts.EChartOption.SeriesEffectScatter_
  type SeriesFunnel = typings.echarts.echarts.EChartOption.SeriesFunnel_
  type SeriesGauge = typings.echarts.echarts.EChartOption.SeriesGauge_
  type SeriesGraph = typings.echarts.echarts.EChartOption.SeriesGraph_
  type SeriesHeatmap = typings.echarts.echarts.EChartOption.SeriesHeatmap_
  type SeriesLine = typings.echarts.echarts.EChartOption.SeriesLine_
  type SeriesLines = typings.echarts.echarts.EChartOption.SeriesLines_
  type SeriesMap = typings.echarts.echarts.EChartOption.SeriesMap_
  type SeriesParallel = typings.echarts.echarts.EChartOption.SeriesParallel_
  type SeriesPictorialBar = typings.echarts.echarts.EChartOption.SeriesPictorialBar_
  type SeriesPie = typings.echarts.echarts.EChartOption.SeriesPie_
  type SeriesRadar = typings.echarts.echarts.EChartOption.SeriesRadar_
  type SeriesSankey = typings.echarts.echarts.EChartOption.SeriesSankey_
  type SeriesScatter = typings.echarts.echarts.EChartOption.SeriesScatter_
  type SeriesSunburst = typings.echarts.echarts.EChartOption.SeriesSunburst_
  type SeriesThemeRiver = typings.echarts.echarts.EChartOption.SeriesThemeRiver_
  type SeriesTree = typings.echarts.echarts.EChartOption.SeriesTree_
  type SeriesTreemap = typings.echarts.echarts.EChartOption.SeriesTreemap_
  type Tooltip = typings.echarts.echarts.EChartOption.Tooltip_
}
