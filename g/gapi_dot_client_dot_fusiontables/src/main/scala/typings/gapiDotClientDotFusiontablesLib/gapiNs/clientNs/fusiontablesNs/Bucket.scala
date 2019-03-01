package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  /** Color of line or the interior of a polygon in #RRGGBB format. */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Icon name used for a point. */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum value in the selected column for a row to be styled according to the bucket color, opacity, icon, or weight. */
  var max: js.UndefOr[scala.Double] = js.undefined
  /** Minimum value in the selected column for a row to be styled according to the bucket color, opacity, icon, or weight. */
  var min: js.UndefOr[scala.Double] = js.undefined
  /** Opacity of the color: 0.0 (transparent) to 1.0 (opaque). */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Width of a line (in pixels). */
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object Bucket {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    icon: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    weight: scala.Int | scala.Double = null
  ): Bucket = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

