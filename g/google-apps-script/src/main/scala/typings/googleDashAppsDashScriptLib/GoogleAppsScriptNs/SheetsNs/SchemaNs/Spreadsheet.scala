package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spreadsheet extends js.Object {
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.undefined
  var properties: js.UndefOr[SpreadsheetProperties] = js.undefined
  var sheets: js.UndefOr[js.Array[Sheet]] = js.undefined
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
  var spreadsheetUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Spreadsheet {
  @scala.inline
  def apply(
    developerMetadata: js.Array[DeveloperMetadata] = null,
    namedRanges: js.Array[NamedRange] = null,
    properties: SpreadsheetProperties = null,
    sheets: js.Array[Sheet] = null,
    spreadsheetId: java.lang.String = null,
    spreadsheetUrl: java.lang.String = null
  ): Spreadsheet = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata)
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (sheets != null) __obj.updateDynamic("sheets")(sheets)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (spreadsheetUrl != null) __obj.updateDynamic("spreadsheetUrl")(spreadsheetUrl)
    __obj.asInstanceOf[Spreadsheet]
  }
}

