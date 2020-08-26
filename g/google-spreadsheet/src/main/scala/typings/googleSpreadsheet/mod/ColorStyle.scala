package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorStyle extends js.Object {
  var rgbColor: Color = js.native
  var themeColor: ThemeColorType = js.native
}

object ColorStyle {
  @scala.inline
  def apply(rgbColor: Color, themeColor: ThemeColorType): ColorStyle = {
    val __obj = js.Dynamic.literal(rgbColor = rgbColor.asInstanceOf[js.Any], themeColor = themeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStyle]
  }
  @scala.inline
  implicit class ColorStyleOps[Self <: ColorStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRgbColor(value: Color): Self = this.set("rgbColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeColor(value: ThemeColorType): Self = this.set("themeColor", value.asInstanceOf[js.Any])
  }
  
}

