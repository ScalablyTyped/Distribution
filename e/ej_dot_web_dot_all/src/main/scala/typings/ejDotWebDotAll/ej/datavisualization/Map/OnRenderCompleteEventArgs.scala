package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRenderCompleteEventArgs extends js.Object {
  /** Event parameters from map
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object OnRenderCompleteEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): OnRenderCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[OnRenderCompleteEventArgs]
  }
}

