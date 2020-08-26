package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation for a theme color.
  */
@js.native
trait ThemeColor extends js.Object {
  def getColorType(): ColorType = js.native
  def getThemeColorType(): ThemeColorType = js.native
}

object ThemeColor {
  @scala.inline
  def apply(getColorType: () => ColorType, getThemeColorType: () => ThemeColorType): ThemeColor = {
    val __obj = js.Dynamic.literal(getColorType = js.Any.fromFunction0(getColorType), getThemeColorType = js.Any.fromFunction0(getThemeColorType))
    __obj.asInstanceOf[ThemeColor]
  }
  @scala.inline
  implicit class ThemeColorOps[Self <: ThemeColor] (val x: Self) extends AnyVal {
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
    def setGetColorType(value: () => ColorType): Self = this.set("getColorType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetThemeColorType(value: () => ThemeColorType): Self = this.set("getThemeColorType", js.Any.fromFunction0(value))
  }
  
}

