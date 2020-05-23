package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a table row in the document.
  */
@JSGlobal("TableRow")
@js.native
class TableRow ()
  extends typings.devexpressWeb.TableRow {
  /**
    * Provides information about the table row's cells.
    */
  /* CompleteClass */
  override val cells: js.Array[typings.devexpressWeb.TableCell] = js.native
  /**
    * Gets the text buffer interval occupied by the current table row element.
    */
  /* CompleteClass */
  override val interval: typings.devexpressWeb.Interval = js.native
  /**
    * Gets the table row's character length.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * Gets the table row's start position in the document.
    */
  /* CompleteClass */
  override val start: Double = js.native
}

