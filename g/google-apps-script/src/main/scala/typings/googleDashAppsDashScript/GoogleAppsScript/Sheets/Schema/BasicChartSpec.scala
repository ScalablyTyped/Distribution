package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartSpec extends js.Object {
  var axis: js.UndefOr[js.Array[BasicChartAxis]] = js.undefined
  var chartType: js.UndefOr[String] = js.undefined
  var compareMode: js.UndefOr[String] = js.undefined
  var domains: js.UndefOr[js.Array[BasicChartDomain]] = js.undefined
  var headerCount: js.UndefOr[Double] = js.undefined
  var interpolateNulls: js.UndefOr[Boolean] = js.undefined
  var legendPosition: js.UndefOr[String] = js.undefined
  var lineSmoothing: js.UndefOr[Boolean] = js.undefined
  var series: js.UndefOr[js.Array[BasicChartSeries]] = js.undefined
  var stackedType: js.UndefOr[String] = js.undefined
  var threeDimensional: js.UndefOr[Boolean] = js.undefined
}

object BasicChartSpec {
  @scala.inline
  def apply(
    axis: js.Array[BasicChartAxis] = null,
    chartType: String = null,
    compareMode: String = null,
    domains: js.Array[BasicChartDomain] = null,
    headerCount: Int | Double = null,
    interpolateNulls: js.UndefOr[Boolean] = js.undefined,
    legendPosition: String = null,
    lineSmoothing: js.UndefOr[Boolean] = js.undefined,
    series: js.Array[BasicChartSeries] = null,
    stackedType: String = null,
    threeDimensional: js.UndefOr[Boolean] = js.undefined
  ): BasicChartSpec = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (chartType != null) __obj.updateDynamic("chartType")(chartType.asInstanceOf[js.Any])
    if (compareMode != null) __obj.updateDynamic("compareMode")(compareMode.asInstanceOf[js.Any])
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (headerCount != null) __obj.updateDynamic("headerCount")(headerCount.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolateNulls)) __obj.updateDynamic("interpolateNulls")(interpolateNulls.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(lineSmoothing)) __obj.updateDynamic("lineSmoothing")(lineSmoothing.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (stackedType != null) __obj.updateDynamic("stackedType")(stackedType.asInstanceOf[js.Any])
    if (!js.isUndefined(threeDimensional)) __obj.updateDynamic("threeDimensional")(threeDimensional.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicChartSpec]
  }
}

