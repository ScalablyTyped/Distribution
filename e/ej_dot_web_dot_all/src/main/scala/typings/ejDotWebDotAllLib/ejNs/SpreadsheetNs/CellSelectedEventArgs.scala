package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellSelectedEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns Spreadsheet model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the selected range.
               */
  var selectedRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the active sheet index.
               */
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns the target element.
               */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

