package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpaqueColor extends js.Object {
  /** An opaque RGB color. */
  var rgbColor: js.UndefOr[RgbColor] = js.undefined
  /** An opaque theme color. */
  var themeColor: js.UndefOr[java.lang.String] = js.undefined
}

object OpaqueColor {
  @scala.inline
  def apply(rgbColor: RgbColor = null, themeColor: java.lang.String = null): OpaqueColor = {
    val __obj = js.Dynamic.literal()
    if (rgbColor != null) __obj.updateDynamic("rgbColor")(rgbColor)
    if (themeColor != null) __obj.updateDynamic("themeColor")(themeColor)
    __obj.asInstanceOf[OpaqueColor]
  }
}

