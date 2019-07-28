package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table cell in the document.
  */
trait TableCell extends js.Object {
  /**
    * Gets the text buffer interval occupied by the current table cell element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Gets the table cell's character length.
    * Value: An integer value specifying the element length in characters.
    */
  var length: Double
  /**
    * Gets the table cell's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: Double
}

object TableCell {
  @scala.inline
  def apply(interval: Interval, length: Double, start: Double): TableCell = {
    val __obj = js.Dynamic.literal(interval = interval, length = length, start = start)
  
    __obj.asInstanceOf[TableCell]
  }
}

