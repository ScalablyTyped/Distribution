package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  /** Determines the type of effect.
    * @Default {ej.Tooltip.Effect.None}
    */
  var effect: js.UndefOr[typings.ejWebAll.ej.Tooltip.effect | String] = js.undefined
  /** Sets the animation speed in milliseconds.
    * @Default {4000}
    */
  var speed: js.UndefOr[Double] = js.undefined
}

object Animation {
  @scala.inline
  def apply(effect: effect | String = null, speed: js.UndefOr[Double] = js.undefined): Animation = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

