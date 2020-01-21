package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spreadsheet extends js.Object {
  /** The developer metadata associated with a spreadsheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  /** The named ranges defined in a spreadsheet. */
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.undefined
  /** Overall properties of a spreadsheet. */
  var properties: js.UndefOr[SpreadsheetProperties] = js.undefined
  /** The sheets that are part of a spreadsheet. */
  var sheets: js.UndefOr[js.Array[Sheet]] = js.undefined
  /**
    * The ID of the spreadsheet.
    * This field is read-only.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  /**
    * The url of the spreadsheet.
    * This field is read-only.
    */
  var spreadsheetUrl: js.UndefOr[String] = js.undefined
}

object Spreadsheet {
  @scala.inline
  def apply(
    developerMetadata: js.Array[DeveloperMetadata] = null,
    namedRanges: js.Array[NamedRange] = null,
    properties: SpreadsheetProperties = null,
    sheets: js.Array[Sheet] = null,
    spreadsheetId: String = null,
    spreadsheetUrl: String = null
  ): Spreadsheet = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (sheets != null) __obj.updateDynamic("sheets")(sheets.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (spreadsheetUrl != null) __obj.updateDynamic("spreadsheetUrl")(spreadsheetUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spreadsheet]
  }
}

