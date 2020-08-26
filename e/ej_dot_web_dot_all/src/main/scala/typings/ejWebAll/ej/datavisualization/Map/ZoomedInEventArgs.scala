package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomedInEventArgs extends js.Object {
  /** Event parameters from map
    */
  var originalEvent: js.UndefOr[js.Any] = js.native
  /** Returns zoom level value for which the map is zoomed.
    */
  var zoomLevel: js.UndefOr[js.Any] = js.native
}

object ZoomedInEventArgs {
  @scala.inline
  def apply(): ZoomedInEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomedInEventArgs]
  }
  @scala.inline
  implicit class ZoomedInEventArgsOps[Self <: ZoomedInEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
    @scala.inline
    def setZoomLevel(value: js.Any): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomLevel: Self = this.set("zoomLevel", js.undefined)
  }
  
}

