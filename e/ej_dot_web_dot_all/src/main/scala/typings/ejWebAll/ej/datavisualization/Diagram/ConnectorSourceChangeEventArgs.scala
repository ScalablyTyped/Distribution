package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorSourceChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the change or not
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** returns the state of connection end point dragging(starting, dragging, completed)
    */
  var dragState: js.UndefOr[String] = js.undefined
  /** returns the connector, the source point of which is being dragged
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the source node of the element
    */
  var node: js.UndefOr[js.Any] = js.undefined
  /** returns the source point of the element
    */
  var point: js.UndefOr[js.Any] = js.undefined
  /** returns the source port of the element
    */
  var port: js.UndefOr[js.Any] = js.undefined
}

object ConnectorSourceChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    dragState: String = null,
    element: js.Any = null,
    node: js.Any = null,
    point: js.Any = null,
    port: js.Any = null
  ): ConnectorSourceChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (dragState != null) __obj.updateDynamic("dragState")(dragState.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorSourceChangeEventArgs]
  }
}

