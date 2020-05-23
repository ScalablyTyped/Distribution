package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollChangeEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Parameter returns the new zoom value, horizontal and vertical scroll offsets.
    */
  var cause: js.UndefOr[String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** Parameter returns the new zoom value, horizontal and vertical scroll offsets.
    */
  var newValues: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the previous zoom value, horizontal and vertical scroll offsets.
    */
  var oldValues: js.UndefOr[js.Any] = js.undefined
}

object ScrollChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cause: String = null,
    diagramId: String = null,
    newValues: js.Any = null,
    oldValues: js.Any = null
  ): ScrollChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (newValues != null) __obj.updateDynamic("newValues")(newValues.asInstanceOf[js.Any])
    if (oldValues != null) __obj.updateDynamic("oldValues")(oldValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollChangeEventArgs]
  }
}

