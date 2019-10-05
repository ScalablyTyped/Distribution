package typings.ejDotWebDotAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  /** Determines the type of effect.
    * @Default {ej.Tooltip.Effect.None}
    */
  var effect: js.UndefOr[typings.ejDotWebDotAll.ej.Tooltip.effect | String] = js.undefined
  /** Sets the animation speed in milliseconds.
    * @Default {4000}
    */
  var speed: js.UndefOr[Double] = js.undefined
}

object Animation {
  @scala.inline
  def apply(effect: effect | String = null, speed: Int | Double = null): Animation = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

