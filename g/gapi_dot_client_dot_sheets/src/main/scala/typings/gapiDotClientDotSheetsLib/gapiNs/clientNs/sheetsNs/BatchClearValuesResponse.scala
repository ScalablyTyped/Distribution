package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchClearValuesResponse extends js.Object {
  /**
    * The ranges that were cleared, in A1 notation.
    * (If the requests were for an unbounded range or a ranger larger
    * than the bounds of the sheet, this will be the actual ranges
    * that were cleared, bounded to the sheet's limits.)
    */
  var clearedRanges: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
}

