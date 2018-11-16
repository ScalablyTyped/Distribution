package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClearValuesResponse extends js.Object {
  /**
               * The range (in A1 notation) that was cleared.
               * (If the request was for an unbounded range or a ranger larger
               * than the bounds of the sheet, this will be the actual range
               * that was cleared, bounded to the sheet's limits.)
               */
  var clearedRange: js.UndefOr[java.lang.String] = js.undefined
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
}

