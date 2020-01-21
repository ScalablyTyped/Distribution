package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spreadsheet extends js.Object {
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.undefined
  var properties: js.UndefOr[SpreadsheetProperties] = js.undefined
  var sheets: js.UndefOr[js.Array[Sheet]] = js.undefined
  var spreadsheetId: js.UndefOr[String] = js.undefined
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

