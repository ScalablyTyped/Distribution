package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.ColorType
import typings.googleAppsScript.GoogleAppsScript.Base.RgbColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The builder for ColorBuilder. To create a new builder, use SpreadsheetApp.newColor().
  */
@js.native
trait ColorBuilder extends js.Object {
  
  def asRgbColor(): RgbColor = js.native
  
  def asThemeColor(): ThemeColor = js.native
  
  def build(): Color = js.native
  
  def getColorType(): ColorType = js.native
  
  def setRgbColor(cssString: String): ColorBuilder = js.native
  
  def setThemeColor(themeColorType: ThemeColorType): ColorBuilder = js.native
}
object ColorBuilder {
  
  @scala.inline
  def apply(
    asRgbColor: () => RgbColor,
    asThemeColor: () => ThemeColor,
    build: () => Color,
    getColorType: () => ColorType,
    setRgbColor: String => ColorBuilder,
    setThemeColor: ThemeColorType => ColorBuilder
  ): ColorBuilder = {
    val __obj = js.Dynamic.literal(asRgbColor = js.Any.fromFunction0(asRgbColor), asThemeColor = js.Any.fromFunction0(asThemeColor), build = js.Any.fromFunction0(build), getColorType = js.Any.fromFunction0(getColorType), setRgbColor = js.Any.fromFunction1(setRgbColor), setThemeColor = js.Any.fromFunction1(setThemeColor))
    __obj.asInstanceOf[ColorBuilder]
  }
  
  @scala.inline
  implicit class ColorBuilderOps[Self <: ColorBuilder] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => Color): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColorType(value: () => ColorType): Self = this.set("getColorType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetRgbColor(value: String => ColorBuilder): Self = this.set("setRgbColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetThemeColor(value: ThemeColorType => ColorBuilder): Self = this.set("setThemeColor", js.Any.fromFunction1(value))
  }
}
