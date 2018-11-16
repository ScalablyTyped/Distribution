package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SolidFill extends js.Object {
  /**
               * The fraction of this `color` that should be applied to the pixel.
               * That is, the final pixel color is defined by the equation:
               *
               * pixel color = alpha &#42; (color) + (1.0 - alpha) &#42; (background color)
               *
               * This means that a value of 1.0 corresponds to a solid color, whereas
               * a value of 0.0 corresponds to a completely transparent color.
               */
  var alpha: js.UndefOr[scala.Double] = js.undefined
  /** The color value of the solid fill. */
  var color: js.UndefOr[OpaqueColor] = js.undefined
}

