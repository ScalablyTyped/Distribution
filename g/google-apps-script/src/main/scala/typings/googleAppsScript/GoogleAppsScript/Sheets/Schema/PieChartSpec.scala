package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartSpec extends js.Object {
  var domain: js.UndefOr[ChartData] = js.undefined
  var legendPosition: js.UndefOr[String] = js.undefined
  var pieHole: js.UndefOr[Double] = js.undefined
  var series: js.UndefOr[ChartData] = js.undefined
  var threeDimensional: js.UndefOr[Boolean] = js.undefined
}

object PieChartSpec {
  @scala.inline
  def apply(
    domain: ChartData = null,
    legendPosition: String = null,
    pieHole: js.UndefOr[Double] = js.undefined,
    series: ChartData = null,
    threeDimensional: js.UndefOr[Boolean] = js.undefined
  ): PieChartSpec = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(pieHole)) __obj.updateDynamic("pieHole")(pieHole.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(threeDimensional)) __obj.updateDynamic("threeDimensional")(threeDimensional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartSpec]
  }
}

