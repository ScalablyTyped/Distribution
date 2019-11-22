package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableCellFilter extends js.Object {
  var column: Double
  var maxValue: js.UndefOr[js.Any] = js.undefined
  var minValue: js.UndefOr[js.Any] = js.undefined
  var test: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* row */ js.UndefOr[Double], 
      /* column */ js.UndefOr[Double], 
      /* data */ js.UndefOr[DataTable | DataView], 
      Boolean
    ]
  ] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DataTableCellFilter {
  @scala.inline
  def apply(
    column: Double,
    maxValue: js.Any = null,
    minValue: js.Any = null,
    test: (/* value */ js.Any, /* row */ js.UndefOr[Double], /* column */ js.UndefOr[Double], /* data */ js.UndefOr[DataTable | DataView]) => Boolean = null,
    value: js.Any = null
  ): DataTableCellFilter = {
    val __obj = js.Dynamic.literal(column = column)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction4(test))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataTableCellFilter]
  }
}

