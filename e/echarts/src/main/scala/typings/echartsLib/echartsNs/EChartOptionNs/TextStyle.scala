package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait TextStyle extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[
    echartsLib.echartsLibStrings.normal | echartsLib.echartsLibStrings.italic | echartsLib.echartsLibStrings.oblique
  ] = js.undefined
  var fontWeight: js.UndefOr[
    echartsLib.echartsLibStrings.normal | echartsLib.echartsLibStrings.bold | echartsLib.echartsLibStrings.bolder | echartsLib.echartsLibStrings.lighter | echartsLib.echartsLibStrings.`100` | echartsLib.echartsLibStrings.`200` | echartsLib.echartsLibStrings.`300` | echartsLib.echartsLibStrings.`400`
  ] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var textBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var textBorderWidth: js.UndefOr[scala.Double] = js.undefined
  var textShadowBlur: js.UndefOr[scala.Double] = js.undefined
  var textShadowColor: js.UndefOr[java.lang.String] = js.undefined
  var textShadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  var textShadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: echartsLib.echartsLibStrings.normal | echartsLib.echartsLibStrings.italic | echartsLib.echartsLibStrings.oblique = null,
    fontWeight: echartsLib.echartsLibStrings.normal | echartsLib.echartsLibStrings.bold | echartsLib.echartsLibStrings.bolder | echartsLib.echartsLibStrings.lighter | echartsLib.echartsLibStrings.`100` | echartsLib.echartsLibStrings.`200` | echartsLib.echartsLibStrings.`300` | echartsLib.echartsLibStrings.`400` = null,
    height: scala.Double | java.lang.String = null,
    lineHeight: scala.Int | scala.Double = null,
    textBorderColor: java.lang.String = null,
    textBorderWidth: scala.Int | scala.Double = null,
    textShadowBlur: scala.Int | scala.Double = null,
    textShadowColor: java.lang.String = null,
    textShadowOffsetX: scala.Int | scala.Double = null,
    textShadowOffsetY: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textBorderColor != null) __obj.updateDynamic("textBorderColor")(textBorderColor)
    if (textBorderWidth != null) __obj.updateDynamic("textBorderWidth")(textBorderWidth.asInstanceOf[js.Any])
    if (textShadowBlur != null) __obj.updateDynamic("textShadowBlur")(textShadowBlur.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor)
    if (textShadowOffsetX != null) __obj.updateDynamic("textShadowOffsetX")(textShadowOffsetX.asInstanceOf[js.Any])
    if (textShadowOffsetY != null) __obj.updateDynamic("textShadowOffsetY")(textShadowOffsetY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

