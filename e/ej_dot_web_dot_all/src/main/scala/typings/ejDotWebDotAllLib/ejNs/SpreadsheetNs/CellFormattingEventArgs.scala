package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormattingEventArgs extends js.Object {
  /** Returns the cell index.
    */
  var Cell: js.UndefOr[scala.Double] = js.undefined
  /** Returns the applied style format object
    */
  var Format: js.UndefOr[js.Any] = js.undefined
  /** Returns the sheet index
    */
  var SheetIdx: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the CSS theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

