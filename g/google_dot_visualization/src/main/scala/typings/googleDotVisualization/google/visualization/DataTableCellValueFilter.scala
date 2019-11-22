package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableCellValueFilter extends DataTableCellFilter

object DataTableCellValueFilter {
  @scala.inline
  def apply(
    column: Double,
    value: js.Any,
    maxValue: js.Any = null,
    minValue: js.Any = null,
    test: (/* value */ js.Any, /* row */ js.UndefOr[Double], /* column */ js.UndefOr[Double], /* data */ js.UndefOr[DataTable | DataView]) => Boolean = null
  ): DataTableCellValueFilter = {
    val __obj = js.Dynamic.literal(column = column, value = value)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction4(test))
    __obj.asInstanceOf[DataTableCellValueFilter]
  }
}

