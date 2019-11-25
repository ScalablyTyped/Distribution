package typings.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnCellProps extends ColumnHeaderProps {
  /** the row index of the cell */
  var rowIndex: Double
}

object ColumnCellProps {
  @scala.inline
  def apply(height: Double, rowIndex: Double, width: Double, columnKey: String = null): ColumnCellProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnCellProps]
  }
}

