package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a table in the document.
  */
@js.native
trait Table extends StObject {
  
  /**
    * Gets an index of the table.
    */
  val index: Double = js.native
  
  /**
    * Gets the text buffer interval occupied by the current table element.
    */
  val interval: Interval = js.native
  
  /**
    * Gets the table length in characters.
    */
  val length: Double = js.native
  
  /**
    * Provides access to a collection of table rows.
    */
  val rows: js.Array[TableRow] = js.native
  
  /**
    * Gets the table's start position in the document.
    */
  val start: Double = js.native
  
  /**
    * Gets the name of the style applied to the table (see StyleBase.name).
    */
  val styleName: String = js.native
}
object Table {
  
  @scala.inline
  def apply(
    index: Double,
    interval: Interval,
    length: Double,
    rows: js.Array[TableRow],
    start: Double,
    styleName: String
  ): Table = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[TableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: TableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
  }
}
