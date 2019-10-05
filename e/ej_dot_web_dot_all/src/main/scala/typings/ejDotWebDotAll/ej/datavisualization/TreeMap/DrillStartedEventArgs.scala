package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrillStartedEventArgs extends js.Object {
  /** Returns selected drilled treeMap object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object DrillStartedEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): DrillStartedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[DrillStartedEventArgs]
  }
}

