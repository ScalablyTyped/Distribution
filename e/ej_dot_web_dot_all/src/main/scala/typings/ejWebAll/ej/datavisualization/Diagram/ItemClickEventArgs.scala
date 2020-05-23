package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemClickEventArgs extends js.Object {
  /** parameter returns the object that was actually clicked
    */
  var actualObject: js.UndefOr[js.Any] = js.undefined
  /** parameter returns whether or not to cancel the drop event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the model of the diagram
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object that is selected
    */
  var selectedObject: js.UndefOr[js.Any] = js.undefined
}

object ItemClickEventArgs {
  @scala.inline
  def apply(
    actualObject: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    event: js.Any = null,
    selectedObject: js.Any = null
  ): ItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actualObject != null) __obj.updateDynamic("actualObject")(actualObject.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (selectedObject != null) __obj.updateDynamic("selectedObject")(selectedObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemClickEventArgs]
  }
}

