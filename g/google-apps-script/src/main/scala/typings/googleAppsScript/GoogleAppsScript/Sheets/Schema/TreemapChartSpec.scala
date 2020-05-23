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
    hintedLevels: js.UndefOr[Double] = js.undefined,
    labels: ChartData = null,
    levels: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    parentLabels: ChartData = null,
    sizeData: ChartData = null,
    textFormat: TextFormat = null
  ): TreemapChartSpec = {
    val __obj = js.Dynamic.literal()
    if (colorData != null) __obj.updateDynamic("colorData")(colorData.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTooltips)) __obj.updateDynamic("hideTooltips")(hideTooltips.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hintedLevels)) __obj.updateDynamic("hintedLevels")(hintedLevels.get.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(levels)) __obj.updateDynamic("levels")(levels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (parentLabels != null) __obj.updateDynamic("parentLabels")(parentLabels.asInstanceOf[js.Any])
    if (sizeData != null) __obj.updateDynamic("sizeData")(sizeData.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapChartSpec]
  }
}

