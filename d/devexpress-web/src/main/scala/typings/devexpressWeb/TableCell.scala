package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table cell in the document.
  */
trait TableCell extends js.Object {
  /**
    * Gets the text buffer interval occupied by the current table cell element.
    */
  val interval: Interval
  /**
    * Gets the table cell's character length.
    */
  val length: Double
  /**
    * Gets the table cell's start position in the document.
    */
  val start: Double
}

object TableCell {
  @scala.inline
  def apply(interval: Interval, length: Double, start: Double): TableCell = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
}

