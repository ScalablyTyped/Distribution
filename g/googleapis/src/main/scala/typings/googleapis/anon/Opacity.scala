package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opacity extends js.Object {
  var color: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
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

