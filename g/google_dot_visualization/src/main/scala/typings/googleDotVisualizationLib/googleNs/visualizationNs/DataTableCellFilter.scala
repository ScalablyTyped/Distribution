package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableCellFilter extends js.Object {
  var column: scala.Double
  var maxValue: js.UndefOr[js.Any] = js.undefined
  var minValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DataTableCellFilter {
  @scala.inline
  def apply(column: scala.Double, maxValue: js.Any = null, minValue: js.Any = null, value: js.Any = null): DataTableCellFilter = {
    val __obj = js.Dynamic.literal(column = column)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataTableCellFilter]
  }
}

