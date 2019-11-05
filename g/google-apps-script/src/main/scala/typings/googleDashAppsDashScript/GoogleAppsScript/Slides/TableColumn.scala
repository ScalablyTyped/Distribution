package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A column in a table. A column consists of a list of table cells. A column is identified by the
  * column index.
  */
trait TableColumn extends js.Object {
  def getCell(cellIndex: Integer): TableCell
  def getIndex(): Integer
  def getNumCells(): Integer
  def getParentTable(): Table
  def getWidth(): Double
  def remove(): Unit
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
}

