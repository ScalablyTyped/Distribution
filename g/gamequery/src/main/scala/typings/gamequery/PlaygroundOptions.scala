package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaygroundOptions extends js.Object {
  var disableCollision: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var keyTracker: js.UndefOr[Boolean] = js.native
  var mouseTracker: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String] = js.native
  var refreshRate: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PlaygroundOptions {
  @scala.inline
  def apply(): PlaygroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaygroundOptions]
  }
  @scala.inline
  implicit class PlaygroundOptionsOps[Self <: PlaygroundOptions] (val x: Self) extends AnyVal {
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
    def setDisableCollision(value: Boolean): Self = this.set("disableCollision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCollision: Self = this.set("disableCollision", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setKeyTracker(value: Boolean): Self = this.set("keyTracker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyTracker: Self = this.set("keyTracker", js.undefined)
    @scala.inline
    def setMouseTracker(value: Boolean): Self = this.set("mouseTracker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseTracker: Self = this.set("mouseTracker", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRefreshRate(value: Double): Self = this.set("refreshRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshRate: Self = this.set("refreshRate", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

