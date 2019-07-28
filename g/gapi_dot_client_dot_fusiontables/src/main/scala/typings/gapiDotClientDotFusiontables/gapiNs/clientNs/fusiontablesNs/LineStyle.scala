package typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  /** Color of the line in #RRGGBB format. */
  var strokeColor: js.UndefOr[String] = js.undefined
  /** Column-value, gradient or buckets styler that is used to determine the line color and opacity. */
  var strokeColorStyler: js.UndefOr[StyleFunction] = js.undefined
  /** Opacity of the line : 0.0 (transparent) to 1.0 (opaque). */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /** Width of the line in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  /** Column-value or bucket styler that is used to determine the width of the line. */
  var strokeWeightStyler: js.UndefOr[StyleFunction] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(
    strokeColor: String = null,
    strokeColorStyler: StyleFunction = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null,
    strokeWeightStyler: StyleFunction = null
  ): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeColorStyler != null) __obj.updateDynamic("strokeColorStyler")(strokeColorStyler)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (strokeWeightStyler != null) __obj.updateDynamic("strokeWeightStyler")(strokeWeightStyler)
    __obj.asInstanceOf[LineStyle]
  }
}

