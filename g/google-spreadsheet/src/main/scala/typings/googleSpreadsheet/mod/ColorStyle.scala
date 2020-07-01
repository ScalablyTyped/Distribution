package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStyle extends js.Object {
  var rgbColor: Color
  var themeColor: ThemeColorType
}

object ColorStyle {
  @scala.inline
  def apply(rgbColor: Color, themeColor: ThemeColorType): ColorStyle = {
    val __obj = js.Dynamic.literal(rgbColor = rgbColor.asInstanceOf[js.Any], themeColor = themeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStyle]
  }
}

