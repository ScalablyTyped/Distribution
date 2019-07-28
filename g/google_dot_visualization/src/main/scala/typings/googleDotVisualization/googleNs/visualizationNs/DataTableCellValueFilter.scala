package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableCellValueFilter extends DataTableCellFilter

object DataTableCellValueFilter {
  @scala.inline
  def apply(column: Double, value: js.Any, maxValue: js.Any = null, minValue: js.Any = null): DataTableCellValueFilter = {
    val __obj = js.Dynamic.literal(column = column, value = value)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    __obj.asInstanceOf[DataTableCellValueFilter]
  }
}

