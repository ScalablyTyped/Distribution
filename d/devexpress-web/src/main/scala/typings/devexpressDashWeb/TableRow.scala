package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table row in the document.
  */
@JSGlobal("TableRow")
@js.native
class TableRow () extends js.Object {
  /**
    * Provides information about the table row's cells.
    */
  val cells: js.Array[TableCell] = js.native
  /**
    * Gets the text buffer interval occupied by the current table row element.
    */
  val interval: Interval = js.native
  /**
    * Gets the table row's character length.
    */
  val length: Double = js.native
  /**
    * Gets the table row's start position in the document.
    */
  val start: Double = js.native
}

