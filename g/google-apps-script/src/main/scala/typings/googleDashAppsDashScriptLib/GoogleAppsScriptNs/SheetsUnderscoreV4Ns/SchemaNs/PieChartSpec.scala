package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartSpec extends js.Object {
  var domain: js.UndefOr[ChartData] = js.undefined
  var legendPosition: js.UndefOr[java.lang.String] = js.undefined
  var pieHole: js.UndefOr[stdLib.Number] = js.undefined
  var series: js.UndefOr[ChartData] = js.undefined
  var threeDimensional: js.UndefOr[scala.Boolean] = js.undefined
}

object PieChartSpec {
  @scala.inline
  def apply(
    domain: ChartData = null,
    legendPosition: java.lang.String = null,
    pieHole: stdLib.Number = null,
    series: ChartData = null,
    threeDimensional: js.UndefOr[scala.Boolean] = js.undefined
  ): PieChartSpec = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition)
    if (pieHole != null) __obj.updateDynamic("pieHole")(pieHole)
    if (series != null) __obj.updateDynamic("series")(series)
    if (!js.isUndefined(threeDimensional)) __obj.updateDynamic("threeDimensional")(threeDimensional)
    __obj.asInstanceOf[PieChartSpec]
  }
}

