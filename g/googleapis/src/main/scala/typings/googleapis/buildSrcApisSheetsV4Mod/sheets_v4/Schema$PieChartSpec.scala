package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A &lt;a href=&quot;/chart/interactive/docs/gallery/piechart&quot;&gt;pie
  * chart&lt;/a&gt;.
  */
@js.native
trait Schema$PieChartSpec extends js.Object {
  /**
    * The data that covers the domain of the pie chart.
    */
  var domain: js.UndefOr[Schema$ChartData] = js.native
  /**
    * Where the legend of the pie chart should be drawn.
    */
  var legendPosition: js.UndefOr[String] = js.native
  /**
    * The size of the hole in the pie chart.
    */
  var pieHole: js.UndefOr[Double] = js.native
  /**
    * The data that covers the one and only series of the pie chart.
    */
  var series: js.UndefOr[Schema$ChartData] = js.native
  /**
    * True if the pie is three dimensional.
    */
  var threeDimensional: js.UndefOr[Boolean] = js.native
}

object Schema$PieChartSpec {
  @scala.inline
  def apply(
    domain: Schema$ChartData = null,
    legendPosition: String = null,
    pieHole: Int | Double = null,
    series: Schema$ChartData = null,
    threeDimensional: js.UndefOr[Boolean] = js.undefined
  ): Schema$PieChartSpec = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (pieHole != null) __obj.updateDynamic("pieHole")(pieHole.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(threeDimensional)) __obj.updateDynamic("threeDimensional")(threeDimensional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PieChartSpec]
  }
}

