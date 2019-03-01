package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsChart extends js.Object {
  /**
    * The ID of the specific chart in the Google Sheets spreadsheet that is
    * embedded.
    */
  var chartId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The URL of an image of the embedded chart, with a default lifetime of 30
    * minutes. This URL is tagged with the account of the requester. Anyone with
    * the URL effectively accesses the image as the original requester. Access to
    * the image may be lost if the presentation's sharing settings change.
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The properties of the Sheets chart. */
  var sheetsChartProperties: js.UndefOr[SheetsChartProperties] = js.undefined
  /** The ID of the Google Sheets spreadsheet that contains the source chart. */
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
}

object SheetsChart {
  @scala.inline
  def apply(
    chartId: scala.Int | scala.Double = null,
    contentUrl: java.lang.String = null,
    sheetsChartProperties: SheetsChartProperties = null,
    spreadsheetId: java.lang.String = null
  ): SheetsChart = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (sheetsChartProperties != null) __obj.updateDynamic("sheetsChartProperties")(sheetsChartProperties)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    __obj.asInstanceOf[SheetsChart]
  }
}

