package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormat
  extends StObject
     with DefaultFormatter {
  
  /**
    * Returns the formatted value of a given value. This method does not require a DataTable.
    */
  def formatValue(value: Double): String
}
object NumberFormat {
  
  inline def apply(format: (DataTable, Double) => Unit, formatValue: Double => String): NumberFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), formatValue = js.Any.fromFunction1(formatValue))
    __obj.asInstanceOf[NumberFormat]
  }
  
  extension [Self <: NumberFormat](x: Self) {
    
    inline def setFormatValue(value: Double => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
  }
}
