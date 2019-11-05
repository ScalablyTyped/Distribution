package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of one or more TableCell instances.
  */
trait TableCellRange extends js.Object {
  def getTableCells(): js.Array[TableCell]
}

object TableCellRange {
  @scala.inline
  def apply(getTableCells: () => js.Array[TableCell]): TableCellRange = {
    val __obj = js.Dynamic.literal(getTableCells = js.Any.fromFunction0(getTableCells))
  
    __obj.asInstanceOf[TableCellRange]
  }
}

