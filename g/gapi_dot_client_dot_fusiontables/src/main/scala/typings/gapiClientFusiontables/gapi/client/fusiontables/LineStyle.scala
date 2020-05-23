package typings.gapiClientFusiontables.gapi.client.fusiontables

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
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeWeight: js.UndefOr[Double] = js.undefined,
    strokeWeightStyler: StyleFunction = null
  ): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeColorStyler != null) __obj.updateDynamic("strokeColorStyler")(strokeColorStyler.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWeight)) __obj.updateDynamic("strokeWeight")(strokeWeight.get.asInstanceOf[js.Any])
    if (strokeWeightStyler != null) __obj.updateDynamic("strokeWeightStyler")(strokeWeightStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

