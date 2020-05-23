package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorCollectionChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the collection change or not
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns whether the connector is inserted or removed
    */
  var changeType: js.UndefOr[String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the connector that is to be added or deleted
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** triggers before and after adding the connector in the diagram which can be differentiated through `state` argument. We can cancel the event only before adding the connector.
    */
  var state: js.UndefOr[String] = js.undefined
}

object ConnectorCollectionChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    changeType: String = null,
    diagramId: String = null,
    element: js.Any = null,
    state: String = null
  ): ConnectorCollectionChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (changeType != null) __obj.updateDynamic("changeType")(changeType.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorCollectionChangeEventArgs]
  }
}

