package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSaveEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the save cell element.
    */
  var cell: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the index of the column.
    */
  var colIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the columnName of clicked cell.
    */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the column field information.
    */
  var columnObject: js.UndefOr[js.Any] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the cell previous value.
    */
  var prevValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the index of the row.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cell value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

