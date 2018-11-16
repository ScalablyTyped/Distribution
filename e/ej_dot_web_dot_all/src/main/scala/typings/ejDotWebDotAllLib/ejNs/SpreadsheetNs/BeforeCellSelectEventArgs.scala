package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeCellSelectEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current cell range.
               */
  var currRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the Spreadsheet model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the previous cell range.
               */
  var prevRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

