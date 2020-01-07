package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A themeable solid color value.
  */
@js.native
trait Schema$OpaqueColor extends js.Object {
  /**
    * An opaque RGB color.
    */
  var rgbColor: js.UndefOr[Schema$RgbColor] = js.native
  /**
    * An opaque theme color.
    */
  var themeColor: js.UndefOr[String] = js.native
}

object Schema$OpaqueColor {
  @scala.inline
  def apply(rgbColor: Schema$RgbColor = null, themeColor: String = null): Schema$OpaqueColor = {
    val __obj = js.Dynamic.literal()
    if (rgbColor != null) __obj.updateDynamic("rgbColor")(rgbColor.asInstanceOf[js.Any])
    if (themeColor != null) __obj.updateDynamic("themeColor")(themeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OpaqueColor]
  }
}

