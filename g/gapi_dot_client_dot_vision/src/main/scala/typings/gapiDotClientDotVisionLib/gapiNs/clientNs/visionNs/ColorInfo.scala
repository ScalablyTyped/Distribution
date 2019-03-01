package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorInfo extends js.Object {
  /** RGB components of the color. */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * The fraction of pixels the color occupies in the image.
    * Value in range [0, 1].
    */
  var pixelFraction: js.UndefOr[scala.Double] = js.undefined
  /** Image-specific score for this color. Value in range [0, 1]. */
  var score: js.UndefOr[scala.Double] = js.undefined
}

object ColorInfo {
  @scala.inline
  def apply(
    color: Color = null,
    pixelFraction: scala.Int | scala.Double = null,
    score: scala.Int | scala.Double = null
  ): ColorInfo = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (pixelFraction != null) __obj.updateDynamic("pixelFraction")(pixelFraction.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorInfo]
  }
}

