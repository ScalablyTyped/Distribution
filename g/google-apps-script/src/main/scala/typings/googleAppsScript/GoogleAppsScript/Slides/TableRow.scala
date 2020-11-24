package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A row in a table. A row consists of a list of table cells. A row is identified by the row index.
  */
@js.native
trait TableRow extends js.Object {
  
  def getCell(cellIndex: Integer): TableCell = js.native
  
  def getIndex(): Integer = js.native
  
  def getMinimumHeight(): Double = js.native
  
  def getNumCells(): Integer = js.native
  
  def getParentTable(): Table = js.native
  
  def remove(): Unit = js.native
}
object TableRow {
  
  @scala.inline
  def apply(
    getCell: Integer => TableCell,
    getIndex: () => Integer,
    getMinimumHeight: () => Double,
    getNumCells: () => Integer,
    getParentTable: () => Table,
    remove: () => Unit
  ): TableRow = {
    val __obj = js.Dynamic.literal(getCell = js.Any.fromFunction1(getCell), getIndex = js.Any.fromFunction0(getIndex), getMinimumHeight = js.Any.fromFunction0(getMinimumHeight), getNumCells = js.Any.fromFunction0(getNumCells), getParentTable = js.Any.fromFunction0(getParentTable), remove = js.Any.fromFunction0(remove))
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
    def setGetCell(value: Integer => TableCell): Self = this.set("getCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinimumHeight(value: () => Double): Self = this.set("getMinimumHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumCells(value: () => Integer): Self = this.set("getNumCells", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentTable(value: () => Table): Self = this.set("getParentTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
}
