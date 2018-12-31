package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendValuesResponse extends js.Object {
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The range (in A1 notation) of the table that values are being appended to
    * (before the values were appended).
    * Empty if no table was found.
    */
  var tableRange: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the updates that were applied. */
  var updates: js.UndefOr[UpdateValuesResponse] = js.undefined
}

