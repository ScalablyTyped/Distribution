package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsChart extends js.Object {
  /**
    * The ID of the specific chart in the Google Sheets spreadsheet that is
    * embedded.
    */
  var chartId: js.UndefOr[Double] = js.undefined
  /**
    * The URL of an image of the embedded chart, with a default lifetime of 30
    * minutes. This URL is tagged with the account of the requester. Anyone with
    * the URL effectively accesses the image as the original requester. Access to
    * the image may be lost if the presentation's sharing settings change.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  /** The properties of the Sheets chart. */
  var sheetsChartProperties: js.UndefOr[SheetsChartProperties] = js.undefined
  /** The ID of the Google Sheets spreadsheet that contains the source chart. */
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

