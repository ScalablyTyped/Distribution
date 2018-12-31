package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpreadsheetByDataFilterRequest extends js.Object {
  /**
    * The DataFilters used to select which ranges to retrieve from
    * the spreadsheet.
    */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  /**
    * True if grid data should be returned.
    * This parameter is ignored if a field mask was set in the request.
    */
  var includeGridData: js.UndefOr[scala.Boolean] = js.undefined
}

