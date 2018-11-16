package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeCellFormatEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the selected cells.
               */
  var cells: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  /** Returns the applied style format object.
               */
  var format: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the sheet index.
               */
  var sheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

