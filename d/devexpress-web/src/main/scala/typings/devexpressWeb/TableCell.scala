package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a table cell in the document.
  */
@js.native
trait TableCell extends StObject {
  
  /**
    * Gets the text buffer interval occupied by the current table cell element.
    */
  val interval: Interval = js.native
  
  /**
    * Gets the table cell's character length.
    */
  val length: Double = js.native
  
  /**
    * Gets the table cell's start position in the document.
    */
  val start: Double = js.native
}
object TableCell {
  
  @scala.inline
  def apply(interval: Interval, length: Double, start: Double): TableCell = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
  
  @scala.inline
  implicit class TableCellMutableBuilder[Self <: TableCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
