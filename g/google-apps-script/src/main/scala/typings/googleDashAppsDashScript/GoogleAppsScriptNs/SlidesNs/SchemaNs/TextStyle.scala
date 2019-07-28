package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
  var baselineOffset: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Dimension] = js.undefined
  var foregroundColor: js.UndefOr[OptionalColor] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var link: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Link] = js.undefined
  var smallCaps: js.UndefOr[Boolean] = js.undefined
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
  var weightedFontFamily: js.UndefOr[WeightedFontFamily] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    backgroundColor: OptionalColor = null,
    baselineOffset: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Dimension = null,
    foregroundColor: OptionalColor = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    link: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Link = null,
    smallCaps: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined,
    weightedFontFamily: WeightedFontFamily = null
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (baselineOffset != null) __obj.updateDynamic("baselineOffset")(baselineOffset)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (link != null) __obj.updateDynamic("link")(link)
    if (!js.isUndefined(smallCaps)) __obj.updateDynamic("smallCaps")(smallCaps)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    if (weightedFontFamily != null) __obj.updateDynamic("weightedFontFamily")(weightedFontFamily)
    __obj.asInstanceOf[TextStyle]
  }
}

