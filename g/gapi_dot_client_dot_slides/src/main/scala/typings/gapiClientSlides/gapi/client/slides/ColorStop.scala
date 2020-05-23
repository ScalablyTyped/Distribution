package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStop extends js.Object {
  /**
    * The alpha value of this color in the gradient band. Defaults to 1.0,
    * fully opaque.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /** The color of the gradient stop. */
  var color: js.UndefOr[OpaqueColor] = js.undefined
  /**
    * The relative position of the color stop in the gradient band measured
    * in percentage. The value should be in the interval [0.0, 1.0].
    */
  var position: js.UndefOr[Double] = js.undefined
}

object ColorStop {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    color: OpaqueColor = null,
    position: js.UndefOr[Double] = js.undefined
  ): ColorStop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStop]
  }
}

