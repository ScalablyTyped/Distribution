package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndoRedoOptions extends js.Object {
  /** Pass the action to update undo and redo collection
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the cell to update undo and redo collection
    */
  var cell: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Pass the sheet index to update undo and redo collection
    */
  var sheetIndex: js.UndefOr[scala.Double] = js.undefined
}

object UndoRedoOptions {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    cell: stdLib.HTMLElement = null,
    sheetIndex: scala.Int | scala.Double = null
  ): UndoRedoOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (sheetIndex != null) __obj.updateDynamic("sheetIndex")(sheetIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoRedoOptions]
  }
}

