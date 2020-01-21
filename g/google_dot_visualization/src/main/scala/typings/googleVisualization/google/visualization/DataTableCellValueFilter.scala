package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableCellValueFilter extends DataTableCellFilter

object DataTableCellValueFilter {
  @scala.inline
  def apply(
    column: Double,
    maxValue: js.Any = null,
    minValue: js.Any = null,
    test: (/* value */ js.Any, /* row */ js.UndefOr[Double], /* column */ js.UndefOr[Double], /* data */ js.UndefOr[DataTable | DataView]) => Boolean = null,
    value: js.Any = null
  ): DataTableCellValueFilter = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction4(test))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCellValueFilter]
  }
}

