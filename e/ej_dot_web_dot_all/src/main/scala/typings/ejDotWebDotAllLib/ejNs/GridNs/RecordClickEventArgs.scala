package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current selected cell.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the cell index value.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the corresponding cell value.
    */
  var cellValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the Header text of the column corresponding to the selected cell.
    */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the jQuery object of the current selected row.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns current record object (JSON).
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index of the selected row.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

