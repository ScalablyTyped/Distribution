package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartSeries extends js.Object {
  /**
    * The color for elements (i.e. bars, lines, points) associated with this
    * series.  If empty, a default color is used.
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * The line style of this series. Valid only if the
    * chartType is AREA,
    * LINE, or SCATTER.
    * COMBO charts are also supported if the
    * series chart type is
    * AREA or LINE.
    */
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  /** The data being visualized in this chart series. */
  var series: js.UndefOr[ChartData] = js.undefined
  /**
    * The minor axis that will specify the range of values for this series.
    * For example, if charting stocks over time, the "Volume" series
    * may want to be pinned to the right with the prices pinned to the left,
    * because the scale of trading volume is different than the scale of
    * prices.
    * It is an error to specify an axis that isn't a valid minor axis
    * for the chart's type.
    */
  var targetAxis: js.UndefOr[String] = js.undefined
  /**
    * The type of this series. Valid only if the
    * chartType is
    * COMBO.
    * Different types will change the way the series is visualized.
    * Only LINE, AREA,
    * and COLUMN are supported.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BasicChartSeries {
  @scala.inline
  def apply(
    color: Color = null,
    lineStyle: LineStyle = null,
    series: ChartData = null,
    targetAxis: String = null,
    `type`: String = null
  ): BasicChartSeries = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (series != null) __obj.updateDynamic("series")(series)
    if (targetAxis != null) __obj.updateDynamic("targetAxis")(targetAxis)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BasicChartSeries]
  }
}

