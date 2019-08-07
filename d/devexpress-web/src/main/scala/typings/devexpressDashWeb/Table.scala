package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table in the document.
  */
@JSGlobal("Table")
@js.native
class Table () extends js.Object {
  /**
    * Gets an index of the table.
    */
  val index: Double = js.native
  /**
    * Gets the text buffer interval occupied by the current table element.
    */
  val interval: Interval = js.native
  /**
    * Gets the table length in characters.
    */
  val length: Double = js.native
  /**
    * Provides access to a collection of table rows.
    */
  val rows: js.Array[TableRow] = js.native
  /**
    * Gets the table's start position in the document.
    */
  val start: Double = js.native
  /**
    * Gets the name of the style applied to the table (see StyleBase.name).
    */
  val styleName: String = js.native
}

