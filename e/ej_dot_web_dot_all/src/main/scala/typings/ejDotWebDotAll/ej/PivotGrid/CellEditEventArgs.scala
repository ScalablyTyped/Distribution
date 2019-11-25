package typings.ejDotWebDotAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellEditEventArgs extends js.Object {
  /** contains the array of cells selected for editing.
    */
  var editCellsInfo: js.UndefOr[js.Array[_]] = js.undefined
}

object CellEditEventArgs {
  @scala.inline
  def apply(editCellsInfo: js.Array[_] = null): CellEditEventArgs = {
    val __obj = js.Dynamic.literal()
    if (editCellsInfo != null) __obj.updateDynamic("editCellsInfo")(editCellsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellEditEventArgs]
  }
}

