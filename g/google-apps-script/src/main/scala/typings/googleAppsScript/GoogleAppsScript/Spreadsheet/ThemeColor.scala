package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation for a theme color.
  */
trait ThemeColor extends StObject {
  
  def getColorType(): ColorType
  
  def getThemeColorType(): ThemeColorType
}
object ThemeColor {
  
  inline def apply(getColorType: () => ColorType, getThemeColorType: () => ThemeColorType): ThemeColor = {
    val __obj = js.Dynamic.literal(getColorType = js.Any.fromFunction0(getColorType), getThemeColorType = js.Any.fromFunction0(getThemeColorType))
    __obj.asInstanceOf[ThemeColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeColor] (val x: Self) extends AnyVal {
    
    inline def setGetColorType(value: () => ColorType): Self = StObject.set(x, "getColorType", js.Any.fromFunction0(value))
    
    inline def setGetThemeColorType(value: () => ThemeColorType): Self = StObject.set(x, "getThemeColorType", js.Any.fromFunction0(value))
  }
}
