package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFormat extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var foregroundColor: js.UndefOr[Color] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
}

object TextFormat {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    foregroundColor: Color = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): TextFormat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[TextFormat]
  }
}

