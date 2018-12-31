package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EChartOptionNs {
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
  type DataZoom = echartsLib.echartsNs.EChartOptionNs.DataZoomNs.Inside | echartsLib.echartsNs.EChartOptionNs.DataZoomNs.Slider
  type Series = SeriesLine | SeriesBar | SeriesPie | SeriesScatter | SeriesEffectScatter | SeriesRadar | SeriesTree | SeriesTreemap | SeriesSunburst | SeriesBoxplot | SeriesCandlestick | SeriesHeatmap | SeriesMap | SeriesParallel | SeriesLines | SeriesGraph | SeriesSankey | SeriesFunnel | SeriesGauge | SeriesPictorialBar | SeriesThemeRiver | SeriesCustom
}
