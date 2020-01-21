package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTextStyle extends js.Object {
  var auraColor: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontName: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object ChartTextStyle {
  @scala.inline
  def apply(
    auraColor: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fontName: String = null,
    fontSize: Int | Double = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null
  ): ChartTextStyle = {
    val __obj = js.Dynamic.literal()
    if (auraColor != null) __obj.updateDynamic("auraColor")(auraColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontName != null) __obj.updateDynamic("fontName")(fontName.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTextStyle]
  }
}

