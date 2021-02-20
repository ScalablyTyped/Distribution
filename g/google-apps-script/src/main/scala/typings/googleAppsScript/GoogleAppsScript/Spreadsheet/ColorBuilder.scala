package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.ColorType
import typings.googleAppsScript.GoogleAppsScript.Base.RgbColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The builder for ColorBuilder. To create a new builder, use SpreadsheetApp.newColor().
  */
@js.native
trait ColorBuilder extends StObject {
  
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
  implicit class ColorBuilderMutableBuilder[Self <: ColorBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsRgbColor(value: () => RgbColor): Self = StObject.set(x, "asRgbColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsThemeColor(value: () => ThemeColor): Self = StObject.set(x, "asThemeColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuild(value: () => Color): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColorType(value: () => ColorType): Self = StObject.set(x, "getColorType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetRgbColor(value: String => ColorBuilder): Self = StObject.set(x, "setRgbColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetThemeColor(value: ThemeColorType => ColorBuilder): Self = StObject.set(x, "setThemeColor", js.Any.fromFunction1(value))
  }
}
