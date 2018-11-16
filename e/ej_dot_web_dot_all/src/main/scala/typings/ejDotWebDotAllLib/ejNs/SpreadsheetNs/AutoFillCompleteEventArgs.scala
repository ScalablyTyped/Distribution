package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoFillCompleteEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns auto fill begin cell range.
               */
  var dataRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns which direction to drag the auto fill.
               */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** Returns fill cells range.
               */
  var fillRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the auto fill type.
               */
  var fillType: js.UndefOr[java.lang.String] = js.undefined
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

