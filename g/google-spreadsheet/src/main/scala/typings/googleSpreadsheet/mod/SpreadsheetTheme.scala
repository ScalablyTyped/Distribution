package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetTheme extends js.Object {
  var primaryFontFamily: String
  var themeColors: js.Array[ThemeColorPair]
}

object SpreadsheetTheme {
  @scala.inline
  def apply(primaryFontFamily: String, themeColors: js.Array[ThemeColorPair]): SpreadsheetTheme = {
    val __obj = js.Dynamic.literal(primaryFontFamily = primaryFontFamily.asInstanceOf[js.Any], themeColors = themeColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetTheme]
  }
}

