package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseOverEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the target node or connector
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object from where the element is dragged
    */
  var source: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object over which the element is being dragged.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}

object MouseOverEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    diagramId: java.lang.String = null,
    element: js.Any = null,
    source: js.Any = null,
    target: js.Any = null
  ): MouseOverEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MouseOverEventArgs]
  }
}

