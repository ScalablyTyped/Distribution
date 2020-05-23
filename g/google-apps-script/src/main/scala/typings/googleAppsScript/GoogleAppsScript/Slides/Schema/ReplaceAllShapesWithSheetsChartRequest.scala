package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithSheetsChartRequest extends js.Object {
  var chartId: js.UndefOr[Double] = js.undefined
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  var linkingMode: js.UndefOr[String] = js.undefined
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object ReplaceAllShapesWithSheetsChartRequest {
  @scala.inline
  def apply(
    chartId: js.UndefOr[Double] = js.undefined,
    containsText: SubstringMatchCriteria = null,
    linkingMode: String = null,
    pageObjectIds: js.Array[String] = null,
    spreadsheetId: String = null
  ): ReplaceAllShapesWithSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartId)) __obj.updateDynamic("chartId")(chartId.get.asInstanceOf[js.Any])
    if (containsText != null) __obj.updateDynamic("containsText")(containsText.asInstanceOf[js.Any])
    if (linkingMode != null) __obj.updateDynamic("linkingMode")(linkingMode.asInstanceOf[js.Any])
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartRequest]
  }
}

