package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A row in a table. A row consists of a list of table cells. A row is identified by the row index.
  */
trait TableRow extends js.Object {
  def getCell(cellIndex: Integer): TableCell
  def getIndex(): Integer
  def getMinimumHeight(): Double
  def getNumCells(): Integer
  def getParentTable(): Table
  def remove(): Unit
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
}

