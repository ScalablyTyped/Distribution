package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BubbleRenderingEventArgs extends js.Object {
  /** Returns the bubble values.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object BubbleRenderingEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): BubbleRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[BubbleRenderingEventArgs]
  }
}

