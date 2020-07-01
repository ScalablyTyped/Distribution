package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorPair extends js.Object {
  var color: ColorStyle
  var colorType: ThemeColorType
}

object ThemeColorPair {
  @scala.inline
  def apply(color: ColorStyle, colorType: ThemeColorType): ThemeColorPair = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorPair]
  }
}

