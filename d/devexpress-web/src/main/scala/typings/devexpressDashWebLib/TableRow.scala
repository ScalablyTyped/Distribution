package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table row in the document.
  */
trait TableRow extends js.Object {
  /**
    * Provides information about the table row's cells.
    * Value: An array of TableCell objects storing information about cells.
    */
  var cells: js.Array[TableCell]
  /**
    * Gets the text buffer interval occupied by the current table row element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Gets the table row's character length.
    * Value: An integer value specifying the element length in characters.
    */
  var length: scala.Double
  /**
    * Gets the table row's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: scala.Double
}

object TableRow {
  @scala.inline
  def apply(cells: js.Array[TableCell], interval: Interval, length: scala.Double, start: scala.Double): TableRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cells")(cells)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[TableRow]
  }
}

