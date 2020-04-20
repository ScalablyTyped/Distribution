package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetTheme extends js.Object {
  /** / Name of the primary font family. */
  var primaryFontFamily: js.UndefOr[String] = js.undefined
  /**
    * The spreadsheet theme color pairs. To update you must provide all theme
    * color pairs.
    */
  var themeColors: js.UndefOr[js.Array[ThemeColorPair]] = js.undefined
}

object SpreadsheetTheme {
  @scala.inline
  def apply(primaryFontFamily: String = null, themeColors: js.Array[ThemeColorPair] = null): SpreadsheetTheme = {
    val __obj = js.Dynamic.literal()
    if (primaryFontFamily != null) __obj.updateDynamic("primaryFontFamily")(primaryFontFamily.asInstanceOf[js.Any])
    if (themeColors != null) __obj.updateDynamic("themeColors")(themeColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetTheme]
  }
}

