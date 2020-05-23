package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipSettingsAnimation extends js.Object {
  /** Defines the animation effect for the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {none}
    */
  var effect: js.UndefOr[Effect | String] = js.undefined
  /** Defines the animation speed for the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {0}
    */
  var speed: js.UndefOr[Double] = js.undefined
}

object TooltipSettingsAnimation {
  @scala.inline
  def apply(effect: Effect | String = null, speed: js.UndefOr[Double] = js.undefined): TooltipSettingsAnimation = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipSettingsAnimation]
  }
}

