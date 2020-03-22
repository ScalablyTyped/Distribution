package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacity extends js.Object {
  /**
  			 * Color to tint the image with
  			 * @default #000000
  			 */
  var color: js.UndefOr[String] = js.undefined
  /** Opacity value that controls the tint effect's transparency (0..1) */
  var opacity: js.UndefOr[Double] = js.undefined
}

object AnonOpacity {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null): AnonOpacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacity]
  }
}

