package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSheetsChartRequest extends js.Object {
  var chartId: js.UndefOr[Double] = js.undefined
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var linkingMode: js.UndefOr[String] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object CreateSheetsChartRequest {
  @scala.inline
  def apply(
    chartId: Int | Double = null,
    elementProperties: PageElementProperties = null,
    linkingMode: String = null,
    objectId: String = null,
    spreadsheetId: String = null
  ): CreateSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (linkingMode != null) __obj.updateDynamic("linkingMode")(linkingMode.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSheetsChartRequest]
  }
}

