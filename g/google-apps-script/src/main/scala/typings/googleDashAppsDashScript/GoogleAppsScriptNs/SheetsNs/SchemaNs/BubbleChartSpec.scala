package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BubbleChartSpec extends js.Object {
  var bubbleBorderColor: js.UndefOr[Color] = js.undefined
  var bubbleLabels: js.UndefOr[ChartData] = js.undefined
  var bubbleMaxRadiusSize: js.UndefOr[Double] = js.undefined
  var bubbleMinRadiusSize: js.UndefOr[Double] = js.undefined
  var bubbleOpacity: js.UndefOr[Double] = js.undefined
  var bubbleSizes: js.UndefOr[ChartData] = js.undefined
  var bubbleTextStyle: js.UndefOr[TextFormat] = js.undefined
  var domain: js.UndefOr[ChartData] = js.undefined
  var groupIds: js.UndefOr[ChartData] = js.undefined
  var legendPosition: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[ChartData] = js.undefined
}

object BubbleChartSpec {
  @scala.inline
  def apply(
    bubbleBorderColor: Color = null,
    bubbleLabels: ChartData = null,
    bubbleMaxRadiusSize: Int | Double = null,
    bubbleMinRadiusSize: Int | Double = null,
    bubbleOpacity: Int | Double = null,
    bubbleSizes: ChartData = null,
    bubbleTextStyle: TextFormat = null,
    domain: ChartData = null,
    groupIds: ChartData = null,
    legendPosition: String = null,
    series: ChartData = null
  ): BubbleChartSpec = {
    val __obj = js.Dynamic.literal()
    if (bubbleBorderColor != null) __obj.updateDynamic("bubbleBorderColor")(bubbleBorderColor)
    if (bubbleLabels != null) __obj.updateDynamic("bubbleLabels")(bubbleLabels)
    if (bubbleMaxRadiusSize != null) __obj.updateDynamic("bubbleMaxRadiusSize")(bubbleMaxRadiusSize.asInstanceOf[js.Any])
    if (bubbleMinRadiusSize != null) __obj.updateDynamic("bubbleMinRadiusSize")(bubbleMinRadiusSize.asInstanceOf[js.Any])
    if (bubbleOpacity != null) __obj.updateDynamic("bubbleOpacity")(bubbleOpacity.asInstanceOf[js.Any])
    if (bubbleSizes != null) __obj.updateDynamic("bubbleSizes")(bubbleSizes)
    if (bubbleTextStyle != null) __obj.updateDynamic("bubbleTextStyle")(bubbleTextStyle)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (groupIds != null) __obj.updateDynamic("groupIds")(groupIds)
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[BubbleChartSpec]
  }
}

