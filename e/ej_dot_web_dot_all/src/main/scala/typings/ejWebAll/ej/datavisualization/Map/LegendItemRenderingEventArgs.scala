package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendItemRenderingEventArgs extends js.Object {
  /** Returns the legend item.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object LegendItemRenderingEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): LegendItemRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendItemRenderingEventArgs]
  }
}

