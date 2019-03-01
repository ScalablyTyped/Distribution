package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationChangeEventArgs extends js.Object {
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the actual click event arguments that explains which button is clicked
    */
  var cause: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the node that is rotated
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new rotation angle
    */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the previous rotation angle
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
}

object RotationChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cause: java.lang.String = null,
    diagramId: java.lang.String = null,
    element: js.Any = null,
    newValue: js.Any = null,
    oldValue: js.Any = null
  ): RotationChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[RotationChangeEventArgs]
  }
}

