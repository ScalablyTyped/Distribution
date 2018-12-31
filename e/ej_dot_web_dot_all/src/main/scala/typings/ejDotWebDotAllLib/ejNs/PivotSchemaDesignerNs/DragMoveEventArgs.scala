package typings
package ejDotWebDotAllLib.ejNs.PivotSchemaDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragMoveEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the HTML element of the dragged field from PivotSchemaDesigner.
    */
  var dragTarget: js.UndefOr[js.Any] = js.undefined
  /** return the JSON details of the dragged field.
    */
  var draggedElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the PivotSchemaDesigner model
    */
  var model: js.UndefOr[js.Any] = js.undefined
}

