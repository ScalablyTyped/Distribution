package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
    * The fraction of this color that should be applied to the pixel. That is,
    * the final pixel color is defined by the equation:
    *
    * pixel color = alpha &#42; (this color) + (1.0 - alpha) &#42; (background color)
    *
    * This means that a value of 1.0 corresponds to a solid color, whereas
    * a value of 0.0 corresponds to a completely transparent color. This
    * uses a wrapper message rather than a simple float scalar so that it is
    * possible to distinguish between a default value and the value being unset.
    * If omitted, this color object is to be rendered as a solid color
    * (as if the alpha value had been explicitly given with a value of 1.0).
    */
  var alpha: js.UndefOr[scala.Double] = js.undefined
  /** The amount of blue in the color as a value in the interval [0, 1]. */
  var blue: js.UndefOr[scala.Double] = js.undefined
  /** The amount of green in the color as a value in the interval [0, 1]. */
  var green: js.UndefOr[scala.Double] = js.undefined
  /** The amount of red in the color as a value in the interval [0, 1]. */
  var red: js.UndefOr[scala.Double] = js.undefined
}

