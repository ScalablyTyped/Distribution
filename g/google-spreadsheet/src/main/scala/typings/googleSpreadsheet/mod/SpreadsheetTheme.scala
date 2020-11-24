package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetTheme extends js.Object {
  
  var primaryFontFamily: String = js.native
  
  var themeColors: js.Array[ThemeColorPair] = js.native
}
object SpreadsheetTheme {
  
  @scala.inline
  def apply(primaryFontFamily: String, themeColors: js.Array[ThemeColorPair]): SpreadsheetTheme = {
    val __obj = js.Dynamic.literal(primaryFontFamily = primaryFontFamily.asInstanceOf[js.Any], themeColors = themeColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetTheme]
  }
  
  @scala.inline
  implicit class SpreadsheetThemeOps[Self <: SpreadsheetTheme] (val x: Self) extends AnyVal {
    
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
    def setPrimaryFontFamily(value: String): Self = this.set("primaryFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorsVarargs(value: ThemeColorPair*): Self = this.set("themeColors", js.Array(value :_*))
    
    @scala.inline
    def setThemeColors(value: js.Array[ThemeColorPair]): Self = this.set("themeColors", value.asInstanceOf[js.Any])
  }
}
