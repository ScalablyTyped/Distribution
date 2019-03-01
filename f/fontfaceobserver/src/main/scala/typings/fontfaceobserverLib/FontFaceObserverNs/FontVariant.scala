package typings
package fontfaceobserverLib.FontFaceObserverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontVariant extends js.Object {
  var stretch: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object FontVariant {
  @scala.inline
  def apply(
    stretch: java.lang.String = null,
    style: java.lang.String = null,
    weight: scala.Double | java.lang.String = null
  ): FontVariant = {
    val __obj = js.Dynamic.literal()
    if (stretch != null) __obj.updateDynamic("stretch")(stretch)
    if (style != null) __obj.updateDynamic("style")(style)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontVariant]
  }
}

