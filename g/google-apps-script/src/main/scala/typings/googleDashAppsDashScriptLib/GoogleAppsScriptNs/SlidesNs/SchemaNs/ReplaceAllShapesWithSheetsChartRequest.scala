package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithSheetsChartRequest extends js.Object {
  var chartId: js.UndefOr[scala.Double] = js.undefined
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  var linkingMode: js.UndefOr[java.lang.String] = js.undefined
  var pageObjectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
}

object ReplaceAllShapesWithSheetsChartRequest {
  @scala.inline
  def apply(
    chartId: scala.Int | scala.Double = null,
    containsText: SubstringMatchCriteria = null,
    linkingMode: java.lang.String = null,
    pageObjectIds: js.Array[java.lang.String] = null,
    spreadsheetId: java.lang.String = null
  ): ReplaceAllShapesWithSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (containsText != null) __obj.updateDynamic("containsText")(containsText)
    if (linkingMode != null) __obj.updateDynamic("linkingMode")(linkingMode)
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartRequest]
  }
}

