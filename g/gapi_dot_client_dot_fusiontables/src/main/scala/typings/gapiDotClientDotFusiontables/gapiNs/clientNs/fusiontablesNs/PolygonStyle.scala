package typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonStyle extends js.Object {
  /** Color of the interior of the polygon in #RRGGBB format. */
  var fillColor: js.UndefOr[String] = js.undefined
  /** Column-value, gradient, or bucket styler that is used to determine the interior color and opacity of the polygon. */
  var fillColorStyler: js.UndefOr[StyleFunction] = js.undefined
  /** Opacity of the interior of the polygon: 0.0 (transparent) to 1.0 (opaque). */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /** Color of the polygon border in #RRGGBB format. */
  var strokeColor: js.UndefOr[String] = js.undefined
  /** Column-value, gradient or buckets styler that is used to determine the border color and opacity. */
  var strokeColorStyler: js.UndefOr[StyleFunction] = js.undefined
  /** Opacity of the polygon border: 0.0 (transparent) to 1.0 (opaque). */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /** Width of the polyon border in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  /** Column-value or bucket styler that is used to determine the width of the polygon border. */
  var strokeWeightStyler: js.UndefOr[StyleFunction] = js.undefined
}

object PolygonStyle {
  @scala.inline
  def apply(
    fillColor: String = null,
    fillColorStyler: StyleFunction = null,
    fillOpacity: Int | Double = null,
    strokeColor: String = null,
    strokeColorStyler: StyleFunction = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null,
    strokeWeightStyler: StyleFunction = null
  ): PolygonStyle = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillColorStyler != null) __obj.updateDynamic("fillColorStyler")(fillColorStyler)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeColorStyler != null) __obj.updateDynamic("strokeColorStyler")(strokeColorStyler)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (strokeWeightStyler != null) __obj.updateDynamic("strokeWeightStyler")(strokeWeightStyler)
    __obj.asInstanceOf[PolygonStyle]
  }
}

