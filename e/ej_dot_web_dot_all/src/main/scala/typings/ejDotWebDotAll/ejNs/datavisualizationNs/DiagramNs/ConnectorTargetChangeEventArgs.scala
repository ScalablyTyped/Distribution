package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorTargetChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the change or not
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** returns the state of connection end point dragging(starting, dragging, completed)
    */
  var dragState: js.UndefOr[String] = js.undefined
  /** parameter returns the connector, the target point of which is being dragged
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the target node of the element
    */
  var node: js.UndefOr[js.Any] = js.undefined
  /** returns the target point of the element
    */
  var point: js.UndefOr[js.Any] = js.undefined
  /** returns the target port of the element
    */
  var port: js.UndefOr[js.Any] = js.undefined
}

object ConnectorTargetChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    dragState: String = null,
    element: js.Any = null,
    node: js.Any = null,
    point: js.Any = null,
    port: js.Any = null
  ): ConnectorTargetChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (dragState != null) __obj.updateDynamic("dragState")(dragState)
    if (element != null) __obj.updateDynamic("element")(element)
    if (node != null) __obj.updateDynamic("node")(node)
    if (point != null) __obj.updateDynamic("point")(point)
    if (port != null) __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[ConnectorTargetChangeEventArgs]
  }
}

