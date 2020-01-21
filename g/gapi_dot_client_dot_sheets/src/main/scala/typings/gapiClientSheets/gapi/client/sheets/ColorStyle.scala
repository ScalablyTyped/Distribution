package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStyle extends js.Object {
  /** RGB color. */
  var rgbColor: js.UndefOr[Color] = js.undefined
  /** Theme color. */
  var themeColor: js.UndefOr[String] = js.undefined
}

object ColorStyle {
  @scala.inline
  def apply(rgbColor: Color = null, themeColor: String = null): ColorStyle = {
    val __obj = js.Dynamic.literal()
    if (rgbColor != null) __obj.updateDynamic("rgbColor")(rgbColor.asInstanceOf[js.Any])
    if (themeColor != null) __obj.updateDynamic("themeColor")(themeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStyle]
  }
}

