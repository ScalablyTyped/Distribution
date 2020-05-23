package typings.googleVisualization.google.visualization

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFormat extends DefaultFormatter {
  /**
    * Returns the formatted value of a given value. This method does not require a DataTable.
    */
  def formatValue(value: Date): String
}

object DateFormat {
  @scala.inline
  def apply(format: (DataTable, Double) => Unit, formatValue: Date => String): DateFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), formatValue = js.Any.fromFunction1(formatValue))
    __obj.asInstanceOf[DateFormat]
  }
}

