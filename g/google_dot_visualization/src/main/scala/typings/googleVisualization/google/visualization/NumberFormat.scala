package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class NumberFormatMutableBuilder[Self <: NumberFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatValue(value: Double => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
  }
}
