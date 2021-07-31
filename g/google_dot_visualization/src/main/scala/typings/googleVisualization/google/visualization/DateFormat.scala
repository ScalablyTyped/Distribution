package typings.googleVisualization.google.visualization

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFormat
  extends StObject
     with DefaultFormatter {
  
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
  
  @scala.inline
  implicit class DateFormatMutableBuilder[Self <: DateFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatValue(value: Date => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
  }
}
