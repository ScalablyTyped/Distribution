package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerSelectedEventArgs extends js.Object {
  /** Returns marker object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object MarkerSelectedEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): MarkerSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MarkerSelectedEventArgs]
  }
}

