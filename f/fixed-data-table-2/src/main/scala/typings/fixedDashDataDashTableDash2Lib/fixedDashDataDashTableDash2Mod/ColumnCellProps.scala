package typings
package fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnCellProps extends ColumnHeaderProps {
  /** the row index of the cell */
  var rowIndex: scala.Double
}

object ColumnCellProps {
  @scala.inline
  def apply(
    height: scala.Double,
    rowIndex: scala.Double,
    width: scala.Double,
    columnKey: java.lang.String = null
  ): ColumnCellProps = {
    val __obj = js.Dynamic.literal(height = height, rowIndex = rowIndex, width = width)
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    __obj.asInstanceOf[ColumnCellProps]
  }
}

