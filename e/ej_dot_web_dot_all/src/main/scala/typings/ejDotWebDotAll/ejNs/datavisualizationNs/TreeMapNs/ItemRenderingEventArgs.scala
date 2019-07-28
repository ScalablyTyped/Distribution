package typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRenderingEventArgs extends js.Object {
  /** Returns treemap leaf item
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object ItemRenderingEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): ItemRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[ItemRenderingEventArgs]
  }
}

