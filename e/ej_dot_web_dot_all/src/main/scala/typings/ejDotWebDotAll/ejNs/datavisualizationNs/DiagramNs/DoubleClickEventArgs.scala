package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleClickEventArgs extends js.Object {
  /** parameter returns the object that is actually clicked
    */
  var actualObject: js.UndefOr[js.Any] = js.undefined
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the selected object
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object DoubleClickEventArgs {
  @scala.inline
  def apply(
    actualObject: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    element: js.Any = null
  ): DoubleClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actualObject != null) __obj.updateDynamic("actualObject")(actualObject)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[DoubleClickEventArgs]
  }
}

