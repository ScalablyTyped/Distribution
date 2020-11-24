package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify existing themes. To set a theme on a spreadsheet, use Spreadsheet.setSpreadsheetTheme(theme).
  */
@js.native
trait SpreadsheetTheme extends js.Object {
  
  def getConcreteColor(themeColorType: ThemeColorType): Color = js.native
  
  def getFontFamily(): String | Null = js.native
  
  def getThemeColors(): js.Array[ThemeColorType] = js.native
  
  def setConcreteColor(themeColorType: ThemeColorType, color: Color): SpreadsheetTheme = js.native
  def setConcreteColor(themeColorType: ThemeColorType, red: Integer, green: Integer, blue: Integer): SpreadsheetTheme = js.native
  
  def setFontFamily(fontFamily: String): SpreadsheetTheme = js.native
}
