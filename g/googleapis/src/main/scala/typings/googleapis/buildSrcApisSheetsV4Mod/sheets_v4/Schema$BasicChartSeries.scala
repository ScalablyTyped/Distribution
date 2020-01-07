package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single series of data in a chart. For example, if charting stock prices
  * over time, multiple series may exist, one for the &quot;Open Price&quot;,
  * &quot;High Price&quot;, &quot;Low Price&quot; and &quot;Close Price&quot;.
  */
@js.native
trait Schema$BasicChartSeries extends js.Object {
  /**
    * The color for elements (i.e. bars, lines, points) associated with this
    * series.  If empty, a default color is used.
    */
  var color: js.UndefOr[Schema$Color] = js.native
  /**
    * The line style of this series. Valid only if the chartType is AREA, LINE,
    * or SCATTER. COMBO charts are also supported if the series chart type is
    * AREA or LINE.
    */
  var lineStyle: js.UndefOr[Schema$LineStyle] = js.native
  /**
    * The data being visualized in this chart series.
    */
  var series: js.UndefOr[Schema$ChartData] = js.native
  /**
    * The minor axis that will specify the range of values for this series. For
    * example, if charting stocks over time, the &quot;Volume&quot; series may
    * want to be pinned to the right with the prices pinned to the left,
    * because the scale of trading volume is different than the scale of
    * prices. It is an error to specify an axis that isn&#39;t a valid minor
    * axis for the chart&#39;s type.
    */
  var targetAxis: js.UndefOr[String] = js.native
  /**
    * The type of this series. Valid only if the chartType is COMBO. Different
    * types will change the way the series is visualized. Only LINE, AREA, and
    * COLUMN are supported.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$BasicChartSeries {
  @scala.inline
  def apply(
    color: Schema$Color = null,
    lineStyle: Schema$LineStyle = null,
    series: Schema$ChartData = null,
    targetAxis: String = null,
    `type`: String = null
  ): Schema$BasicChartSeries = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (targetAxis != null) __obj.updateDynamic("targetAxis")(targetAxis.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BasicChartSeries]
  }
}

