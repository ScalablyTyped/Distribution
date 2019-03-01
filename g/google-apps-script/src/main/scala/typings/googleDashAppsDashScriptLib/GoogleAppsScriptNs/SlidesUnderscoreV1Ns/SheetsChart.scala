package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsChart extends js.Object {
  // The ID of the specific chart in the Google Sheets spreadsheet that is
  // embedded.
  var chart_id: scala.Double
  // The URL of an image of the embedded chart, with a default lifetime of 30
  // minutes. This URL is tagged with the account of the requester. Anyone with
  // the URL effectively accesses the image as the original requester. Access to
  // the image may be lost if the presentation's sharing settings change.
  var content_url: java.lang.String
  // The properties of the Sheets chart.
  var sheets_chart_properties: SheetsChartProperties
  // The ID of the Google Sheets spreadsheet that contains the source chart.
  var spreadsheet_id: java.lang.String
}

object SheetsChart {
  @scala.inline
  def apply(
    chart_id: scala.Double,
    content_url: java.lang.String,
    sheets_chart_properties: SheetsChartProperties,
    spreadsheet_id: java.lang.String
  ): SheetsChart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart_id")(chart_id)
    __obj.updateDynamic("content_url")(content_url)
    __obj.updateDynamic("sheets_chart_properties")(sheets_chart_properties)
    __obj.updateDynamic("spreadsheet_id")(spreadsheet_id)
    __obj.asInstanceOf[SheetsChart]
  }
}

