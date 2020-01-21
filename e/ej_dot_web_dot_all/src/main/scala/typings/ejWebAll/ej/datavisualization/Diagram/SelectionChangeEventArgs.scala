package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionChangeEventArgs extends js.Object {
  /** parameter to specify whether or not to cancel the selection change event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the actual cause of the event
    */
  var cause: js.UndefOr[String] = js.undefined
  /** parameter returns whether the item is selected or removed selection
    */
  var changeType: js.UndefOr[String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the item which is selected or to be selected
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the collection of nodes and connectors that have to be added to selection list
    */
  var newItems: js.UndefOr[js.Array[_]] = js.undefined
  /** parameter returns the collection of nodes and connectors that have to be removed from selection list
    */
  var oldItems: js.UndefOr[js.Array[_]] = js.undefined
  /** parameter returns the collection of nodes and connectors that will be selected after selection change
    */
  var selectedItems: js.UndefOr[js.Array[_]] = js.undefined
  /** triggers before and after adding the selection to the object in the diagram which can be differentiated through `state` argument. We can cancel the event only before the selection
    * of the object.
    */
  var state: js.UndefOr[String] = js.undefined
}

object SelectionChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cause: String = null,
    changeType: String = null,
    diagramId: String = null,
    element: js.Any = null,
    newItems: js.Array[_] = null,
    oldItems: js.Array[_] = null,
    selectedItems: js.Array[_] = null,
    state: String = null
  ): SelectionChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (newItems != null) __obj.updateDynamic("newItems")(newItems.asInstanceOf[js.Any])
    if (oldItems != null) __obj.updateDynamic("oldItems")(oldItems.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangeEventArgs]
  }
}

