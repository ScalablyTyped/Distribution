package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellContextEventArgs extends js.Object {
  /** returns the original event object.
    */
  var args: js.UndefOr[js.Any] = js.undefined
  /** returns the cell position (row index and column index) in table.
    */
  var cellPosition: js.UndefOr[java.lang.String] = js.undefined
  /** returns the type of the cell.
    */
  var cellType: js.UndefOr[java.lang.String] = js.undefined
  /** returns the content of the cell.
    */
  var cellValue: js.UndefOr[java.lang.String] = js.undefined
  /** returns JSON record corresponding to the selected cell.
    */
  var rawdata: js.UndefOr[js.Any] = js.undefined
  /** returns the role of the cell in PivotGrid.
    */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /** returns the unique name of levels/members.
    */
  var uniqueName: js.UndefOr[java.lang.String] = js.undefined
}

object CellContextEventArgs {
  @scala.inline
  def apply(
    args: js.Any = null,
    cellPosition: java.lang.String = null,
    cellType: java.lang.String = null,
    cellValue: java.lang.String = null,
    rawdata: js.Any = null,
    role: java.lang.String = null,
    uniqueName: java.lang.String = null
  ): CellContextEventArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (cellPosition != null) __obj.updateDynamic("cellPosition")(cellPosition)
    if (cellType != null) __obj.updateDynamic("cellType")(cellType)
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue)
    if (rawdata != null) __obj.updateDynamic("rawdata")(rawdata)
    if (role != null) __obj.updateDynamic("role")(role)
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.asInstanceOf[CellContextEventArgs]
  }
}

