package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSheetsChartRequest extends js.Object {
  var chartId: js.UndefOr[scala.Double] = js.undefined
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  var linkingMode: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateSheetsChartRequest {
  @scala.inline
  def apply(
    chartId: scala.Int | scala.Double = null,
    elementProperties: PageElementProperties = null,
    linkingMode: java.lang.String = null,
    objectId: java.lang.String = null,
    spreadsheetId: java.lang.String = null
  ): CreateSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties)
    if (linkingMode != null) __obj.updateDynamic("linkingMode")(linkingMode)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    __obj.asInstanceOf[CreateSheetsChartRequest]
  }
}

