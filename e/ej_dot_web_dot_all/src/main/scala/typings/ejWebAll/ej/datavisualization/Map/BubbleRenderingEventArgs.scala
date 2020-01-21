package typings.ejWebAll.ej.datavisualization.Map

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
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleRenderingEventArgs]
  }
}

