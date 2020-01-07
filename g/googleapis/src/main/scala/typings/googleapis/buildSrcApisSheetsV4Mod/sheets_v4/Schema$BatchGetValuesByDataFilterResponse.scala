package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when retrieving more than one range of values in a spreadsheet
  * selected by DataFilters.
  */
@js.native
trait Schema$BatchGetValuesByDataFilterResponse extends js.Object {
  /**
    * The ID of the spreadsheet the data was retrieved from.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The requested values with the list of data filters that matched them.
    */
  var valueRanges: js.UndefOr[js.Array[Schema$MatchedValueRange]] = js.native
}

object Schema$BatchGetValuesByDataFilterResponse {
  @scala.inline
  def apply(spreadsheetId: String = null, valueRanges: js.Array[Schema$MatchedValueRange] = null): Schema$BatchGetValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (valueRanges != null) __obj.updateDynamic("valueRanges")(valueRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchGetValuesByDataFilterResponse]
  }
}

