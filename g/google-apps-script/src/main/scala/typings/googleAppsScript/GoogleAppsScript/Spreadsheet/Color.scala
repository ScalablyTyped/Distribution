package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.ColorType
import typings.googleAppsScript.GoogleAppsScript.Base.RgbColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation for a color.
  */
@js.native
trait Color extends js.Object {
  def asRgbColor(): RgbColor = js.native
  def asThemeColor(): ThemeColor = js.native
  def getColorType(): ColorType = js.native
}

object Color {
  @scala.inline
  def apply(asRgbColor: () => RgbColor, asThemeColor: () => ThemeColor, getColorType: () => ColorType): Color = {
    val __obj = js.Dynamic.literal(asRgbColor = js.Any.fromFunction0(asRgbColor), asThemeColor = js.Any.fromFunction0(asThemeColor), getColorType = js.Any.fromFunction0(getColorType))
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setAsRgbColor(value: () => RgbColor): Self = this.set("asRgbColor", js.Any.fromFunction0(value))
    @scala.inline
    def setAsThemeColor(value: () => ThemeColor): Self = this.set("asThemeColor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColorType(value: () => ColorType): Self = this.set("getColorType", js.Any.fromFunction0(value))
  }
  
}

