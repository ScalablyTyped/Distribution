package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
  var baselineOffset: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var fontSize: js.UndefOr[Dimension] = js.undefined
  var foregroundColor: js.UndefOr[OptionalColor] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var link: js.UndefOr[Link] = js.undefined
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
    fontSize: Dimension = null,
    foregroundColor: OptionalColor = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    link: Link = null,
    smallCaps: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined,
    weightedFontFamily: WeightedFontFamily = null
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (baselineOffset != null) __obj.updateDynamic("baselineOffset")(baselineOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(smallCaps)) __obj.updateDynamic("smallCaps")(smallCaps.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (weightedFontFamily != null) __obj.updateDynamic("weightedFontFamily")(weightedFontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

