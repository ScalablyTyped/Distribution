package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateValuesByDataFilterResponse extends js.Object {
  /** The response for each range updated. */
  var responses: js.UndefOr[js.Array[UpdateValuesByDataFilterResponse]] = js.undefined
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of cells updated. */
  var totalUpdatedCells: js.UndefOr[scala.Double] = js.undefined
  /**
    * The total number of columns where at least one cell in the column was
    * updated.
    */
  var totalUpdatedColumns: js.UndefOr[scala.Double] = js.undefined
  /** The total number of rows where at least one cell in the row was updated. */
  var totalUpdatedRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * The total number of sheets where at least one cell in the sheet was
    * updated.
    */
  var totalUpdatedSheets: js.UndefOr[scala.Double] = js.undefined
}

