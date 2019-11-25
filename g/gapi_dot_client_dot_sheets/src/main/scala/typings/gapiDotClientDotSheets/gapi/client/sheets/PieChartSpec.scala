package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartSpec extends js.Object {
  /** The data that covers the domain of the pie chart. */
  var domain: js.UndefOr[ChartData] = js.undefined
  /** Where the legend of the pie chart should be drawn. */
  var legendPosition: js.UndefOr[String] = js.undefined
  /** The size of the hole in the pie chart. */
  var pieHole: js.UndefOr[Double] = js.undefined
  /** The data that covers the one and only series of the pie chart. */
  var series: js.UndefOr[ChartData] = js.undefined
  /** True if the pie is three dimensional. */
  var threeDimensional: js.UndefOr[Boolean] = js.undefined
}

object PieChartSpec {
  @scala.inline
  def apply(
    domain: ChartData = null,
    legendPosition: String = null,
    pieHole: Int | Double = null,
    series: ChartData = null,
    threeDimensional: js.UndefOr[Boolean] = js.undefined
  ): PieChartSpec = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (pieHole != null) __obj.updateDynamic("pieHole")(pieHole.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(threeDimensional)) __obj.updateDynamic("threeDimensional")(threeDimensional.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartSpec]
  }
}

