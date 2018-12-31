package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the cell index on the selection.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the selecting record object
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the Gantt object Model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected cell index
    */
  var previousCellIndex: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected row data
    */
  var previousData: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected row index
    */
  var previousRowIndex: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected cell element
    */
  var previousTargetCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the previously selected row element
    */
  var previousTargetRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index on the selection
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the selecting cell element
    */
  var targetCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the selecting row element
    */
  var targetRow: js.UndefOr[js.Any] = js.undefined
}

