package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Formatter
@js.native
trait DefaultFormatter extends StObject {
  
  /**
    * Reformats the data in the specified column.
    *
    * @param data - A DataTable containing the data to reformat. You cannot use a DataView here.
    * @param columnIndex - The zero-based index of the column to format. To format multiple columns, you must call this method multiple times, with different colIndex values.
    */
  def format(data: DataTable, columnIndex: Double): Unit = js.native
}
object DefaultFormatter {
  
  @scala.inline
  def apply(format: (DataTable, Double) => Unit): DefaultFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format))
    __obj.asInstanceOf[DefaultFormatter]
  }
  
  @scala.inline
  implicit class DefaultFormatterMutableBuilder[Self <: DefaultFormatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: (DataTable, Double) => Unit): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
  }
}
