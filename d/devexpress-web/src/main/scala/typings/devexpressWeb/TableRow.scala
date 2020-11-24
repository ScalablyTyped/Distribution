package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a table row in the document.
  */
@js.native
trait TableRow extends js.Object {
  
  /**
    * Provides information about the table row's cells.
    */
  val cells: js.Array[TableCell] = js.native
  
  /**
    * Gets the text buffer interval occupied by the current table row element.
    */
  val interval: Interval = js.native
  
  /**
    * Gets the table row's character length.
    */
  val length: Double = js.native
  
  /**
    * Gets the table row's start position in the document.
    */
  val start: Double = js.native
}
object TableRow {
  
  @scala.inline
  def apply(cells: js.Array[TableCell], interval: Interval, length: Double, start: Double): TableRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRow]
  }
  
  @scala.inline
  implicit class TableRowOps[Self <: TableRow] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: TableCell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[TableCell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
