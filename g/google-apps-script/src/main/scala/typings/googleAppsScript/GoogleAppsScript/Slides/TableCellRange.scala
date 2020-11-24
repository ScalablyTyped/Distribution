package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of one or more TableCell instances.
  */
@js.native
trait TableCellRange extends js.Object {
  
  def getTableCells(): js.Array[TableCell] = js.native
}
object TableCellRange {
  
  @scala.inline
  def apply(getTableCells: () => js.Array[TableCell]): TableCellRange = {
    val __obj = js.Dynamic.literal(getTableCells = js.Any.fromFunction0(getTableCells))
    __obj.asInstanceOf[TableCellRange]
  }
  
  @scala.inline
  implicit class TableCellRangeOps[Self <: TableCellRange] (val x: Self) extends AnyVal {
    
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
    def setGetTableCells(value: () => js.Array[TableCell]): Self = this.set("getTableCells", js.Any.fromFunction0(value))
  }
}
