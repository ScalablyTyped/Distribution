package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsChartReference extends js.Object {
  var chartId: js.UndefOr[Double] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object SheetsChartReference {
  @scala.inline
  def apply(chartId: js.UndefOr[Double] = js.undefined, spreadsheetId: String = null): SheetsChartReference = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartId)) __obj.updateDynamic("chartId")(chartId.get.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsChartReference]
  }
}

