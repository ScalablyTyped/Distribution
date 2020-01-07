package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource that represents a spreadsheet.
  */
@js.native
trait Schema$Spreadsheet extends js.Object {
  /**
    * The developer metadata associated with a spreadsheet.
    */
  var developerMetadata: js.UndefOr[js.Array[Schema$DeveloperMetadata]] = js.native
  /**
    * The named ranges defined in a spreadsheet.
    */
  var namedRanges: js.UndefOr[js.Array[Schema$NamedRange]] = js.native
  /**
    * Overall properties of a spreadsheet.
    */
  var properties: js.UndefOr[Schema$SpreadsheetProperties] = js.native
  /**
    * The sheets that are part of a spreadsheet.
    */
  var sheets: js.UndefOr[js.Array[Schema$Sheet]] = js.native
  /**
    * The ID of the spreadsheet. This field is read-only.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The url of the spreadsheet. This field is read-only.
    */
  var spreadsheetUrl: js.UndefOr[String] = js.native
}

object Schema$Spreadsheet {
  @scala.inline
  def apply(
    developerMetadata: js.Array[Schema$DeveloperMetadata] = null,
    namedRanges: js.Array[Schema$NamedRange] = null,
    properties: Schema$SpreadsheetProperties = null,
    sheets: js.Array[Schema$Sheet] = null,
    spreadsheetId: String = null,
    spreadsheetUrl: String = null
  ): Schema$Spreadsheet = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (sheets != null) __obj.updateDynamic("sheets")(sheets.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (spreadsheetUrl != null) __obj.updateDynamic("spreadsheetUrl")(spreadsheetUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Spreadsheet]
  }
}

