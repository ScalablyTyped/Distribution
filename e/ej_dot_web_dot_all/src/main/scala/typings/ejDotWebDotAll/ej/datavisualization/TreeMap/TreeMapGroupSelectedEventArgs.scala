package typings.ejDotWebDotAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMapGroupSelectedEventArgs extends js.Object {
  /** Returns the  selected group of treeMapItems as  object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object TreeMapGroupSelectedEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): TreeMapGroupSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeMapGroupSelectedEventArgs]
  }
}

