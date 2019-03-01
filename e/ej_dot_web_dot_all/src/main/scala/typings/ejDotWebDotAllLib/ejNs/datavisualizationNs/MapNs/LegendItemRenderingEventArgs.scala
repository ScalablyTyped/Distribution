package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

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
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[LegendItemRenderingEventArgs]
  }
}

