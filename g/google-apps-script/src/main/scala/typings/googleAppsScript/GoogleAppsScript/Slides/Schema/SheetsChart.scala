package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsChart extends js.Object {
  var chartId: js.UndefOr[Double] = js.undefined
  var contentUrl: js.UndefOr[String] = js.undefined
  var sheetsChartProperties: js.UndefOr[SheetsChartProperties] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object SheetsChart {
  @scala.inline
  def apply(
    chartId: Int | Double = null,
    contentUrl: String = null,
    sheetsChartProperties: SheetsChartProperties = null,
    spreadsheetId: String = null
  ): SheetsChart = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (sheetsChartProperties != null) __obj.updateDynamic("sheetsChartProperties")(sheetsChartProperties.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsChart]
  }
}

