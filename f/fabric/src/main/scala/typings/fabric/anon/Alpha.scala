package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object Alpha {
  @scala.inline
  def apply(alpha: js.UndefOr[Double] = js.undefined, color: String = null, mode: String = null): Alpha = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
}

