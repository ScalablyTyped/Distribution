package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrillDownItemSelectedEventArgs extends js.Object {
  /** Returns selected drilldown treeMap object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object DrillDownItemSelectedEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): DrillDownItemSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrillDownItemSelectedEventArgs]
  }
}

