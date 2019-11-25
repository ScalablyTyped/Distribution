package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeSelectedEventArgs extends js.Object {
  /** Returns selected shape object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object ShapeSelectedEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): ShapeSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeSelectedEventArgs]
  }
}

