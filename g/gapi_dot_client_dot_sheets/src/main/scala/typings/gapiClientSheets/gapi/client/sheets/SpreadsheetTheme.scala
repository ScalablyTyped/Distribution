package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetTheme extends js.Object {
  /** / Name of the primary font family. */
  var primaryFontFamily: js.UndefOr[String] = js.native
  /**
    * The spreadsheet theme color pairs. To update you must provide all theme
    * color pairs.
    */
  var themeColors: js.UndefOr[js.Array[ThemeColorPair]] = js.native
}

object SpreadsheetTheme {
  @scala.inline
  def apply(): SpreadsheetTheme = {
    val __obj = js.Dynamic.literal()
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
    def deletePrimaryFontFamily: Self = this.set("primaryFontFamily", js.undefined)
    @scala.inline
    def setThemeColorsVarargs(value: ThemeColorPair*): Self = this.set("themeColors", js.Array(value :_*))
    @scala.inline
    def setThemeColors(value: js.Array[ThemeColorPair]): Self = this.set("themeColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeColors: Self = this.set("themeColors", js.undefined)
  }
  
}

