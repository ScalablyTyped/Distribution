package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

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
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The url of the spreadsheet.
    * This field is read-only.
    */
  var spreadsheetUrl: js.UndefOr[java.lang.String] = js.undefined
}

