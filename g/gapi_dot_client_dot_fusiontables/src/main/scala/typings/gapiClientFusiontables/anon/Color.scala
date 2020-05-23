package typings.gapiClientFusiontables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /** Color in #RRGGBB format. */
  var color: js.UndefOr[String] = js.undefined
  /** Opacity of the color: 0.0 (transparent) to 1.0 (opaque). */
  var opacity: js.UndefOr[Double] = js.undefined
}

object Color {
  @scala.inline
  def apply(color: String = null, opacity: js.UndefOr[Double] = js.undefined): Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

