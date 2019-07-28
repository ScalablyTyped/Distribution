package typings.fontfaceobserver.FontFaceObserverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontVariant extends js.Object {
  var stretch: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double | String] = js.undefined
}

object FontVariant {
  @scala.inline
  def apply(stretch: String = null, style: String = null, weight: Double | String = null): FontVariant = {
    val __obj = js.Dynamic.literal()
    if (stretch != null) __obj.updateDynamic("stretch")(stretch)
    if (style != null) __obj.updateDynamic("style")(style)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontVariant]
  }
}

