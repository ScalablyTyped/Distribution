package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableCellRangeFilter extends DataTableCellFilter

object DataTableCellRangeFilter {
  @scala.inline
  def apply(column: Double, maxValue: js.Any = null, minValue: js.Any = null, value: js.Any = null): DataTableCellRangeFilter = {
    val __obj = js.Dynamic.literal(column = column)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataTableCellRangeFilter]
  }
}

