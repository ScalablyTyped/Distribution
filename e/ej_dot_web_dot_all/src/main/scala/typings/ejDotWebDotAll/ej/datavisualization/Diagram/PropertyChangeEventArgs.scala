package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the property change or not
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the action is nudge or not
    */
  var cause: js.UndefOr[String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the selected element
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new value of the node property that is being changed
    */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the old value of the property that is being changed
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the name of the property that is changed
    */
  var propertyName: js.UndefOr[String] = js.undefined
}

object PropertyChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cause: String = null,
    diagramId: String = null,
    element: js.Any = null,
    newValue: js.Any = null,
    oldValue: js.Any = null,
    propertyName: String = null
  ): PropertyChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangeEventArgs]
  }
}

