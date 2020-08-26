package typings.fixedDataTable2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnCellProps extends ColumnHeaderProps {
  /** the row index of the cell */
  var rowIndex: Double = js.native
}

object ColumnCellProps {
  @scala.inline
  def apply(height: Double, rowIndex: Double, width: Double): ColumnCellProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnCellProps]
  }
  @scala.inline
  implicit class ColumnCellPropsOps[Self <: ColumnCellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
  }
  
}

