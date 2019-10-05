package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartSeries extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  var series: js.UndefOr[ChartData] = js.undefined
  var targetAxis: js.UndefOr[String] = js.undefined
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

