package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opacity extends js.Object {
  /**
    * Color to tint the image with
    * @default #000000
    */
  var color: js.UndefOr[String] = js.undefined
  /** Opacity value that controls the tint effect's transparency (0..1) */
  var opacity: js.UndefOr[Double] = js.undefined
}

object Opacity {
  @scala.inline
  def apply(color: String = null, opacity: js.UndefOr[Double] = js.undefined): Opacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
}

