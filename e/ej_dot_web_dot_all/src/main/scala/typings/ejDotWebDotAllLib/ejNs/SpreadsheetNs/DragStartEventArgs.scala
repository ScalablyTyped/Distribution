package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DragStartEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current cell row and column index.
               */
  var currentCell: js.UndefOr[js.Any] = js.undefined
  /** Returns the drag cells range object.
               */
  var dragAndDropRange: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the sheet index.
               */
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns the target item.
               */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

