package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormat extends DefaultFormatter {
  /**
    * Returns the formatted value of a given value. This method does not require a DataTable.
    */
  def formatValue(value: Double): String = js.native
}

object NumberFormat {
  @scala.inline
  def apply(format: (DataTable, Double) => Unit, formatValue: Double => String): NumberFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), formatValue = js.Any.fromFunction1(formatValue))
    __obj.asInstanceOf[NumberFormat]
  }
  @scala.inline
  implicit class NumberFormatOps[Self <: NumberFormat] (val x: Self) extends AnyVal {
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
    def setFormatValue(value: Double => String): Self = this.set("formatValue", js.Any.fromFunction1(value))
  }
  
}

