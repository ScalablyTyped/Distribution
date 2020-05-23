package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table in the document.
  */
trait Table extends js.Object {
  /**
    * Gets an index of the table.
    */
  val index: Double
  /**
    * Gets the text buffer interval occupied by the current table element.
    */
  val interval: Interval
  /**
    * Gets the table length in characters.
    */
  val length: Double
  /**
    * Provides access to a collection of table rows.
    */
  val rows: js.Array[TableRow]
  /**
    * Gets the table's start position in the document.
    */
  val start: Double
  /**
    * Gets the name of the style applied to the table (see StyleBase.name).
    */
  val styleName: String
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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

