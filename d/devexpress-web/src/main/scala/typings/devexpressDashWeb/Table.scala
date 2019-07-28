package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table in the document.
  */
trait Table extends js.Object {
  /**
    * Gets an index of the table.
    * Value: An integer value specifying the table's index.
    */
  var index: Double
  /**
    * Gets the text buffer interval occupied by the current table element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Gets the table length in characters.
    * Value: A integer value specifying the character length of the table.
    */
  var length: Double
  /**
    * Provides access to a collection of table rows.
    * Value: An array of TableRow objects storing information about individual table rows.
    */
  var rows: js.Array[TableRow]
  /**
    * Gets the table's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: Double
  /**
    * Gets the name of the style applied to the table (see name).
    * Value: A string value specifying the style name.
    */
  var styleName: String
}

object Table {
  @scala.inline
  def apply(
    index: Double,
    interval: Interval,
    length: Double,
    rows: js.Array[TableRow],
    start: Double,
    styleName: String
  ): Table = {
    val __obj = js.Dynamic.literal(index = index, interval = interval, length = length, rows = rows, start = start, styleName = styleName)
  
    __obj.asInstanceOf[Table]
  }
}

