package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a table in the document.
  */
@js.native
trait Table extends js.Object {
  
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
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: TableRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[TableRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleName(value: String): Self = this.set("styleName", value.asInstanceOf[js.Any])
  }
}
