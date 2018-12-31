package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonStyle extends js.Object {
  /** Color of the interior of the polygon in #RRGGBB format. */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /** Column-value, gradient, or bucket styler that is used to determine the interior color and opacity of the polygon. */
  var fillColorStyler: js.UndefOr[StyleFunction] = js.undefined
  /** Opacity of the interior of the polygon: 0.0 (transparent) to 1.0 (opaque). */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Color of the polygon border in #RRGGBB format. */
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  /** Column-value, gradient or buckets styler that is used to determine the border color and opacity. */
  var strokeColorStyler: js.UndefOr[StyleFunction] = js.undefined
  /** Opacity of the polygon border: 0.0 (transparent) to 1.0 (opaque). */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Width of the polyon border in pixels. */
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
  /** Column-value or bucket styler that is used to determine the width of the polygon border. */
  var strokeWeightStyler: js.UndefOr[StyleFunction] = js.undefined
}

