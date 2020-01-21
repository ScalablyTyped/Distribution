package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreemapChartSpec extends js.Object {
  var colorData: js.UndefOr[ChartData] = js.undefined
  var colorScale: js.UndefOr[TreemapChartColorScale] = js.undefined
  var headerColor: js.UndefOr[Color] = js.undefined
  var hideTooltips: js.UndefOr[Boolean] = js.undefined
  var hintedLevels: js.UndefOr[Double] = js.undefined
  var labels: js.UndefOr[ChartData] = js.undefined
  var levels: js.UndefOr[Double] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var parentLabels: js.UndefOr[ChartData] = js.undefined
  var sizeData: js.UndefOr[ChartData] = js.undefined
  var textFormat: js.UndefOr[TextFormat] = js.undefined
}

object TreemapChartSpec {
  @scala.inline
  def apply(
    colorData: ChartData = null,
    colorScale: TreemapChartColorScale = null,
    headerColor: Color = null,
    hideTooltips: js.UndefOr[Boolean] = js.undefined,
    hintedLevels: Int | Double = null,
    labels: ChartData = null,
    levels: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    parentLabels: ChartData = null,
    sizeData: ChartData = null,
    textFormat: TextFormat = null
  ): TreemapChartSpec = {
    val __obj = js.Dynamic.literal()
    if (colorData != null) __obj.updateDynamic("colorData")(colorData.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTooltips)) __obj.updateDynamic("hideTooltips")(hideTooltips.asInstanceOf[js.Any])
    if (hintedLevels != null) __obj.updateDynamic("hintedLevels")(hintedLevels.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (parentLabels != null) __obj.updateDynamic("parentLabels")(parentLabels.asInstanceOf[js.Any])
    if (sizeData != null) __obj.updateDynamic("sizeData")(sizeData.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapChartSpec]
  }
}

