package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettingsAnimation extends js.Object {
  /** Defines the animation effect for the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {none}
    */
  var effect: js.UndefOr[Effect | String] = js.native
  /** Defines the animation speed for the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {0}
    */
  var speed: js.UndefOr[Double] = js.native
}

object TooltipSettingsAnimation {
  @scala.inline
  def apply(): TooltipSettingsAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettingsAnimation]
  }
  @scala.inline
  implicit class TooltipSettingsAnimationOps[Self <: TooltipSettingsAnimation] (val x: Self) extends AnyVal {
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
    def setEffect(value: Effect | String): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
  
}

