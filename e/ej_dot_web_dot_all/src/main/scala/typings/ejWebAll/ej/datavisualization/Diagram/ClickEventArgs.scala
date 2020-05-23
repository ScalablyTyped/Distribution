package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventArgs extends js.Object {
  /** parameter returns the object that is actually clicked
    */
  var actualObject: js.UndefOr[Double] = js.undefined
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the count of how many times the mouse button is pressed
    */
  var count: js.UndefOr[Double] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the clicked node, connector or diagram
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the event triggered
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the horizontal coordinate of the mouse pointer, relative to the diagram
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /** parameter returns  the vertical coordinate of the mouse pointer, relative to the diagram
    */
  var offsetY: js.UndefOr[Double] = js.undefined
}

object ClickEventArgs {
  @scala.inline
  def apply(
    actualObject: js.UndefOr[Double] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    count: js.UndefOr[Double] = js.undefined,
    diagramId: String = null,
    element: js.Any = null,
    event: js.Any = null,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined
  ): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actualObject)) __obj.updateDynamic("actualObject")(actualObject.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickEventArgs]
  }
}

