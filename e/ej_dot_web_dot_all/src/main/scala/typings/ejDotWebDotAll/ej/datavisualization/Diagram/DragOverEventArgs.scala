package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragOverEventArgs extends js.Object {
  /** parameter defines whether the symbol can be dropped at the current mouse position
    */
  var allowDrop: js.UndefOr[Boolean] = js.undefined
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the node or connector that is dragged over diagram
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new position of the node/connector
    */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the previous position of the node/connector
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the node/connector over which the symbol is dragged
    */
  var target: js.UndefOr[js.Any] = js.undefined
}

object DragOverEventArgs {
  @scala.inline
  def apply(
    allowDrop: js.UndefOr[Boolean] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    element: js.Any = null,
    newValue: js.Any = null,
    oldValue: js.Any = null,
    target: js.Any = null
  ): DragOverEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DragOverEventArgs]
  }
}

