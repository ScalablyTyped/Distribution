package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScrollChangeEventArgs extends js.Object {
  /** Returns the delay between subsequent auto scrolls
    */
  var delay: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
}

object AutoScrollChangeEventArgs {
  @scala.inline
  def apply(delay: java.lang.String = null, diagramId: java.lang.String = null): AutoScrollChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    __obj.asInstanceOf[AutoScrollChangeEventArgs]
  }
}

