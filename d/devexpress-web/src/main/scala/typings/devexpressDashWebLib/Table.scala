package typings
package devexpressDashWebLib

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
  var index: scala.Double
  /**
    * Gets the text buffer interval occupied by the current table element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Gets the table length in characters.
    * Value: A integer value specifying the character length of the table.
    */
  var length: scala.Double
  /**
    * Provides access to a collection of table rows.
    * Value: An array of TableRow objects storing information about individual table rows.
    */
  var rows: js.Array[TableRow]
  /**
    * Gets the table's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: scala.Double
  /**
    * Gets the name of the style applied to the table (see name).
    * Value: A string value specifying the style name.
    */
  var styleName: java.lang.String
}

object Table {
  @scala.inline
  def apply(
    index: scala.Double,
    interval: Interval,
    length: scala.Double,
    rows: js.Array[TableRow],
    start: scala.Double,
    styleName: java.lang.String
  ): Table = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("rows")(rows)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("styleName")(styleName)
    __obj.asInstanceOf[Table]
  }
}

