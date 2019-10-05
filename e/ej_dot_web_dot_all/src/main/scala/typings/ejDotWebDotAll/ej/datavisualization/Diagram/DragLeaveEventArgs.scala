package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragLeaveEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the node or connector that is dragged outside of the diagram
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object DragLeaveEventArgs {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, diagramId: String = null, element: js.Any = null): DragLeaveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[DragLeaveEventArgs]
  }
}

