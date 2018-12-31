package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEndEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the column index which you resized.
    */
  var colIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns new height of the row or shape.
    */
  var newHeight: js.UndefOr[scala.Double] = js.undefined
  /** Returns new width of the column or shape.
    */
  var newWidth: js.UndefOr[scala.Double] = js.undefined
  /** Returns old height of the row or shape.
    */
  var oldHeight: js.UndefOr[scala.Double] = js.undefined
  /** Returns old width of the column or shape.
    */
  var oldWidth: js.UndefOr[scala.Double] = js.undefined
  /** Returns type of the request.
    */
  var reqType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the row index which you resized.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

