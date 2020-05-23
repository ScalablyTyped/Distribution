package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

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
    bubbleMaxRadiusSize: js.UndefOr[Double] = js.undefined,
    bubbleMinRadiusSize: js.UndefOr[Double] = js.undefined,
    bubbleOpacity: js.UndefOr[Double] = js.undefined,
    bubbleSizes: ChartData = null,
    bubbleTextStyle: TextFormat = null,
    domain: ChartData = null,
    groupIds: ChartData = null,
    legendPosition: String = null,
    series: ChartData = null
  ): BubbleChartSpec = {
    val __obj = js.Dynamic.literal()
    if (bubbleBorderColor != null) __obj.updateDynamic("bubbleBorderColor")(bubbleBorderColor.asInstanceOf[js.Any])
    if (bubbleLabels != null) __obj.updateDynamic("bubbleLabels")(bubbleLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbleMaxRadiusSize)) __obj.updateDynamic("bubbleMaxRadiusSize")(bubbleMaxRadiusSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbleMinRadiusSize)) __obj.updateDynamic("bubbleMinRadiusSize")(bubbleMinRadiusSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbleOpacity)) __obj.updateDynamic("bubbleOpacity")(bubbleOpacity.get.asInstanceOf[js.Any])
    if (bubbleSizes != null) __obj.updateDynamic("bubbleSizes")(bubbleSizes.asInstanceOf[js.Any])
    if (bubbleTextStyle != null) __obj.updateDynamic("bubbleTextStyle")(bubbleTextStyle.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (groupIds != null) __obj.updateDynamic("groupIds")(groupIds.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleChartSpec]
  }
}

