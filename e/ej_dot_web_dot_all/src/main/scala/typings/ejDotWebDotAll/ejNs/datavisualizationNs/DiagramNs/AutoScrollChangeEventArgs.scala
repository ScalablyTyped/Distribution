package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScrollChangeEventArgs extends js.Object {
  /** Returns the delay between subsequent auto scrolls
    */
  var delay: js.UndefOr[String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
}

object AutoScrollChangeEventArgs {
  @scala.inline
  def apply(delay: String = null, diagramId: String = null): AutoScrollChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    __obj.asInstanceOf[AutoScrollChangeEventArgs]
  }
}

