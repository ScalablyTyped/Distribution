package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Colors extends js.Object {
  var colors: js.UndefOr[js.Array[Anon_ColorOpacity]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
}

object Anon_Colors {
  @scala.inline
  def apply(colors: js.Array[Anon_ColorOpacity] = null, max: Int | Double = null, min: Int | Double = null): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Colors]
  }
}

