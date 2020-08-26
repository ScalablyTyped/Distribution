package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartCrosshair extends js.Object {
  var color: js.UndefOr[String] = js.native
  var focused: js.UndefOr[Color] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[ChartOrientation] = js.native
  var selected: js.UndefOr[Color] = js.native
  var trigger: js.UndefOr[String] = js.native
}

object ChartCrosshair {
  @scala.inline
  def apply(): ChartCrosshair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCrosshair]
  }
  @scala.inline
  implicit class ChartCrosshairOps[Self <: ChartCrosshair] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFocused(value: Color): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOrientation(value: ChartOrientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setSelected(value: Color): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

