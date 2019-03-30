package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartSpec extends js.Object {
  var axis: js.UndefOr[js.Array[BasicChartAxis]] = js.undefined
  var chartType: js.UndefOr[java.lang.String] = js.undefined
  var compareMode: js.UndefOr[java.lang.String] = js.undefined
  var domains: js.UndefOr[js.Array[BasicChartDomain]] = js.undefined
  var headerCount: js.UndefOr[scala.Double] = js.undefined
  var interpolateNulls: js.UndefOr[scala.Boolean] = js.undefined
  var legendPosition: js.UndefOr[java.lang.String] = js.undefined
  var lineSmoothing: js.UndefOr[scala.Boolean] = js.undefined
  var series: js.UndefOr[js.Array[BasicChartSeries]] = js.undefined
  var stackedType: js.UndefOr[java.lang.String] = js.undefined
  var threeDimensional: js.UndefOr[scala.Boolean] = js.undefined
}

object BasicChartSpec {
  @scala.inline
  def apply(
    axis: js.Array[BasicChartAxis] = null,
    chartType: java.lang.String = null,
    compareMode: java.lang.String = null,
    domains: js.Array[BasicChartDomain] = null,
    headerCount: scala.Int | scala.Double = null,
    interpolateNulls: js.UndefOr[scala.Boolean] = js.undefined,
    legendPosition: java.lang.String = null,
    lineSmoothing: js.UndefOr[scala.Boolean] = js.undefined,
    series: js.Array[BasicChartSeries] = null,
    stackedType: java.lang.String = null,
    threeDimensional: js.UndefOr[scala.Boolean] = js.undefined
  ): BasicChartSpec = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (chartType != null) __obj.updateDynamic("chartType")(chartType)
    if (compareMode != null) __obj.updateDynamic("compareMode")(compareMode)
    if (domains != null) __obj.updateDynamic("domains")(domains)
    if (headerCount != null) __obj.updateDynamic("headerCount")(headerCount.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolateNulls)) __obj.updateDynamic("interpolateNulls")(interpolateNulls)
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition)
    if (!js.isUndefined(lineSmoothing)) __obj.updateDynamic("lineSmoothing")(lineSmoothing)
    if (series != null) __obj.updateDynamic("series")(series)
    if (stackedType != null) __obj.updateDynamic("stackedType")(stackedType)
    if (!js.isUndefined(threeDimensional)) __obj.updateDynamic("threeDimensional")(threeDimensional)
    __obj.asInstanceOf[BasicChartSpec]
  }
}

