package typings.ejDotWebDotAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellContextEventArgs extends js.Object {
  /** returns the original event object.
    */
  var args: js.UndefOr[js.Any] = js.undefined
  /** returns the cell position (row index and column index) in table.
    */
  var cellPosition: js.UndefOr[String] = js.undefined
  /** returns the type of the cell.
    */
  var cellType: js.UndefOr[String] = js.undefined
  /** returns the content of the cell.
    */
  var cellValue: js.UndefOr[String] = js.undefined
  /** returns JSON record corresponding to the selected cell.
    */
  var rawdata: js.UndefOr[js.Any] = js.undefined
  /** returns the role of the cell in PivotGrid.
    */
  var role: js.UndefOr[String] = js.undefined
  /** returns the unique name of levels/members.
    */
  var uniqueName: js.UndefOr[String] = js.undefined
}

object CellContextEventArgs {
  @scala.inline
  def apply(
    args: js.Any = null,
    cellPosition: String = null,
    cellType: String = null,
    cellValue: String = null,
    rawdata: js.Any = null,
    role: String = null,
    uniqueName: String = null
  ): CellContextEventArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (cellPosition != null) __obj.updateDynamic("cellPosition")(cellPosition.asInstanceOf[js.Any])
    if (cellType != null) __obj.updateDynamic("cellType")(cellType.asInstanceOf[js.Any])
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue.asInstanceOf[js.Any])
    if (rawdata != null) __obj.updateDynamic("rawdata")(rawdata.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellContextEventArgs]
  }
}

