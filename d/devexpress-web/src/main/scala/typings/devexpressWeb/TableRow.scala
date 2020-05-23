package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table row in the document.
  */
trait TableRow extends js.Object {
  /**
    * Provides information about the table row's cells.
    */
  val cells: js.Array[TableCell]
  /**
    * Gets the text buffer interval occupied by the current table row element.
    */
  val interval: Interval
  /**
    * Gets the table row's character length.
    */
  val length: Double
  /**
    * Gets the table row's start position in the document.
    */
  val start: Double
}

object TableRow {
  @scala.inline
  def apply(cells: js.Array[TableCell], interval: Interval, length: Double, start: Double): TableRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRow]
  }
}

