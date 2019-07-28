package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeRenderingEventArgs extends js.Object {
  /** Returns the shape values.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object ShapeRenderingEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): ShapeRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[ShapeRenderingEventArgs]
  }
}

