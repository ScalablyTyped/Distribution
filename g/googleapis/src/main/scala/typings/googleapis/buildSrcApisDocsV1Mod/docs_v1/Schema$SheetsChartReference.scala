package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a linked chart embedded from Google Sheets.
  */
@js.native
trait Schema$SheetsChartReference extends js.Object {
  /**
    * The ID of the specific chart in the Google Sheets spreadsheet that is
    * embedded.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The ID of the Google Sheets spreadsheet that contains the source chart.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}

object Schema$SheetsChartReference {
  @scala.inline
  def apply(chartId: Int | Double = null, spreadsheetId: String = null): Schema$SheetsChartReference = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SheetsChartReference]
  }
}

