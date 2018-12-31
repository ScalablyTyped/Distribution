package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDeselectingEventArgs extends js.Object {
  /** Returns current record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns whether the ctrl key is pressed while deselecting row
    */
  var isCtrlKeyPressed: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns whether the shift key is pressed while deselecting row
    */
  var isShiftKeyPressed: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the deselecting row element.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the deselecting row index value.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns current record object (JSON).
    */
  var selectedData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

