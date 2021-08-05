package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.ColorType
import typings.googleAppsScript.GoogleAppsScript.Base.RgbColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation for a color.
  */
trait Color extends StObject {
  
  def asRgbColor(): RgbColor
  
  def asThemeColor(): ThemeColor
  
  def getColorType(): ColorType
}
object Color {
  
  inline def apply(asRgbColor: () => RgbColor, asThemeColor: () => ThemeColor, getColorType: () => ColorType): Color = {
    val __obj = js.Dynamic.literal(asRgbColor = js.Any.fromFunction0(asRgbColor), asThemeColor = js.Any.fromFunction0(asThemeColor), getColorType = js.Any.fromFunction0(getColorType))
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setAsRgbColor(value: () => RgbColor): Self = StObject.set(x, "asRgbColor", js.Any.fromFunction0(value))
    
    inline def setAsThemeColor(value: () => ThemeColor): Self = StObject.set(x, "asThemeColor", js.Any.fromFunction0(value))
    
    inline def setGetColorType(value: () => ColorType): Self = StObject.set(x, "getColorType", js.Any.fromFunction0(value))
  }
}
