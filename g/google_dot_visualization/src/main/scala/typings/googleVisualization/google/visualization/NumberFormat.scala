package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.NumberFormat")
@js.native
class NumberFormat () extends DefaultFormatter {
  def this(options: NumberFormatOptions) = this()
  /**
    * Returns the formatted value of a given value. This method does not require a DataTable.
    */
  def formatValue(value: Double): String = js.native
}

