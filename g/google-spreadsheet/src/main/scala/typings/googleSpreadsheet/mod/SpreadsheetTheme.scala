package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetTheme extends StObject {
  
  var primaryFontFamily: String
  
  var themeColors: js.Array[ThemeColorPair]
}
object SpreadsheetTheme {
  
  inline def apply(primaryFontFamily: String, themeColors: js.Array[ThemeColorPair]): SpreadsheetTheme = {
    val __obj = js.Dynamic.literal(primaryFontFamily = primaryFontFamily.asInstanceOf[js.Any], themeColors = themeColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadsheetTheme] (val x: Self) extends AnyVal {
    
    inline def setPrimaryFontFamily(value: String): Self = StObject.set(x, "primaryFontFamily", value.asInstanceOf[js.Any])
    
    inline def setThemeColors(value: js.Array[ThemeColorPair]): Self = StObject.set(x, "themeColors", value.asInstanceOf[js.Any])
    
    inline def setThemeColorsVarargs(value: ThemeColorPair*): Self = StObject.set(x, "themeColors", js.Array(value*))
  }
}
