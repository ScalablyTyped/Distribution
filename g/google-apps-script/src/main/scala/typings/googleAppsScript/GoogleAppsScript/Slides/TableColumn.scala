package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A column in a table. A column consists of a list of table cells. A column is identified by the
  * column index.
  */
@js.native
trait TableColumn extends js.Object {
  def getCell(cellIndex: Integer): TableCell = js.native
  def getIndex(): Integer = js.native
  def getNumCells(): Integer = js.native
  def getParentTable(): Table = js.native
  def getWidth(): Double = js.native
  def remove(): Unit = js.native
}

object TableColumn {
  @scala.inline
  def apply(
    getCell: Integer => TableCell,
    getIndex: () => Integer,
    getNumCells: () => Integer,
    getParentTable: () => Table,
    getWidth: () => Double,
    remove: () => Unit
  ): TableColumn = {
    val __obj = js.Dynamic.literal(getCell = js.Any.fromFunction1(getCell), getIndex = js.Any.fromFunction0(getIndex), getNumCells = js.Any.fromFunction0(getNumCells), getParentTable = js.Any.fromFunction0(getParentTable), getWidth = js.Any.fromFunction0(getWidth), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[TableColumn]
  }
  @scala.inline
  implicit class TableColumnOps[Self <: TableColumn] (val x: Self) extends AnyVal {
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
    def setGetNumCells(value: () => Integer): Self = this.set("getNumCells", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentTable(value: () => Table): Self = this.set("getParentTable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

