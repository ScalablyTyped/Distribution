package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollChangeEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Parameter returns the new zoom value, horizontal and vertical scroll offsets.
    */
  var cause: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
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
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cause: java.lang.String = null,
    diagramId: java.lang.String = null,
    newValues: js.Any = null,
    oldValues: js.Any = null
  ): ScrollChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (newValues != null) __obj.updateDynamic("newValues")(newValues)
    if (oldValues != null) __obj.updateDynamic("oldValues")(oldValues)
    __obj.asInstanceOf[ScrollChangeEventArgs]
  }
}

