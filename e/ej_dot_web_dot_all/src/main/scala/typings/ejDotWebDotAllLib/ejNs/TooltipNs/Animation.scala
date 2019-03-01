package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  /** Determines the type of effect.
    * @Default {ej.Tooltip.Effect.None}
    */
  var effect: js.UndefOr[effect | java.lang.String] = js.undefined
  /** Sets the animation speed in milliseconds.
    * @Default {4000}
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object Animation {
  @scala.inline
  def apply(effect: effect | java.lang.String = null, speed: scala.Int | scala.Double = null): Animation = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

