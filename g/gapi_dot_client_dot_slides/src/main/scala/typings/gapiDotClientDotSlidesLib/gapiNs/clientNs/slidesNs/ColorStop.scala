package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStop extends js.Object {
  /**
    * The alpha value of this color in the gradient band. Defaults to 1.0,
    * fully opaque.
    */
  var alpha: js.UndefOr[scala.Double] = js.undefined
  /** The color of the gradient stop. */
  var color: js.UndefOr[OpaqueColor] = js.undefined
  /**
    * The relative position of the color stop in the gradient band measured
    * in percentage. The value should be in the interval [0.0, 1.0].
    */
  var position: js.UndefOr[scala.Double] = js.undefined
}

object ColorStop {
  @scala.inline
  def apply(
    alpha: scala.Int | scala.Double = null,
    color: OpaqueColor = null,
    position: scala.Int | scala.Double = null
  ): ColorStop = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStop]
  }
}

