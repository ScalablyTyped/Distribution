package typings.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EChartOption {
  import org.scalablytyped.runtime.StringDictionary
  import typings.echarts.echarts.EChartOption.DataZoom.Inside
  import typings.echarts.echarts.EChartOption.DataZoom.Slider

  type Calendar = Calendar_
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom-inside
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom-slider
    */
  type DataZoom = Inside | Slider
  type Dataset = Dataset_
  type Legend = Legend_
  /**
    * @see https://echarts.apache.org/en/tutorial.html#Rich%20Text
    */
  type RichStyle = StringDictionary[TextStyle]
  type Series = SeriesLine | SeriesBar | SeriesPie | SeriesScatter | SeriesEffectScatter | SeriesRadar | SeriesTree | SeriesTreemap | SeriesSunburst | SeriesBoxplot | SeriesCandlestick | SeriesHeatmap | SeriesMap | SeriesParallel | SeriesLines | SeriesGraph | SeriesSankey | SeriesFunnel | SeriesGauge | SeriesPictorialBar | SeriesThemeRiver | SeriesCustom
  type SeriesBar = SeriesBar_
  type SeriesBoxplot = SeriesBoxplot_
  type SeriesCandlestick = SeriesCandlestick_
  type SeriesCustom = SeriesCustom_
  type SeriesEffectScatter = SeriesEffectScatter_
  type SeriesFunnel = SeriesFunnel_
  type SeriesGraph = SeriesGraph_
  type SeriesHeatmap = SeriesHeatmap_
  type SeriesLine = SeriesLine_
  type SeriesLines = SeriesLines_
  type SeriesMap = SeriesMap_
  type SeriesParallel = SeriesParallel_
  type SeriesPictorialBar = SeriesPictorialBar_
  type SeriesPie = SeriesPie_
  type SeriesRadar = SeriesRadar_
  type SeriesSankey = SeriesSankey_
  type SeriesScatter = SeriesScatter_
  type SeriesSunburst = SeriesSunburst_
  type SeriesThemeRiver = SeriesThemeRiver_
  type SeriesTree = SeriesTree_
  type SeriesTreemap = SeriesTreemap_
  type Tooltip = Tooltip_
}
