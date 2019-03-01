package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTextStyle extends js.Object {
  var auraColor: js.UndefOr[java.lang.String] = js.undefined
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontName: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object ChartTextStyle {
  @scala.inline
  def apply(
    auraColor: java.lang.String = null,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    fontName: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null
  ): ChartTextStyle = {
    val __obj = js.Dynamic.literal()
    if (auraColor != null) __obj.updateDynamic("auraColor")(auraColor)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTextStyle]
  }
}

