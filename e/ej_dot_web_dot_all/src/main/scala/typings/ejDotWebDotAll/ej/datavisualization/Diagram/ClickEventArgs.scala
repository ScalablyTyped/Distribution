package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
    actualObject: Int | Double = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    diagramId: String = null,
    element: js.Any = null,
    event: js.Any = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null
  ): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actualObject != null) __obj.updateDynamic("actualObject")(actualObject.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickEventArgs]
  }
}

