package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentChangeEventArgs extends js.Object {
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the state of editing (starting, dragging, completed)
    */
  var dragState: js.UndefOr[String] = js.undefined
  /** Parameter returns the connector that is being edited
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the current mouse position
    */
  var point: js.UndefOr[js.Any] = js.undefined
}

object SegmentChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    dragState: String = null,
    element: js.Any = null,
    point: js.Any = null
  ): SegmentChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (dragState != null) __obj.updateDynamic("dragState")(dragState)
    if (element != null) __obj.updateDynamic("element")(element)
    if (point != null) __obj.updateDynamic("point")(point)
    __obj.asInstanceOf[SegmentChangeEventArgs]
  }
}

