package typings
package echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Label extends TextStyle {
  var formatter: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var inside: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double | js.Function] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var rotate: js.UndefOr[scala.Double] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var showMaxLabel: js.UndefOr[scala.Boolean] = js.undefined
  var showMinLabel: js.UndefOr[scala.Boolean] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    backgroundColor: java.lang.String | js.Object = null,
    borderColor: java.lang.String = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: echartsLib.echartsLibStrings.normal | echartsLib.echartsLibStrings.italic | echartsLib.echartsLibStrings.oblique = null,
    fontWeight: echartsLib.echartsLibStrings.normal | echartsLib.echartsLibStrings.bold | echartsLib.echartsLibStrings.bolder | echartsLib.echartsLibStrings.lighter | echartsLib.echartsLibStrings.`100` | echartsLib.echartsLibStrings.`200` | echartsLib.echartsLibStrings.`300` | echartsLib.echartsLibStrings.`400` = null,
    formatter: java.lang.String | js.Function = null,
    height: scala.Double | java.lang.String = null,
    inside: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Double | js.Function = null,
    lineHeight: scala.Int | scala.Double = null,
    margin: scala.Int | scala.Double = null,
    padding: scala.Double | js.Array[scala.Double] = null,
    rich: RichStyle = null,
    rotate: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    showMaxLabel: js.UndefOr[scala.Boolean] = js.undefined,
    showMinLabel: js.UndefOr[scala.Boolean] = js.undefined,
    textBorderColor: java.lang.String = null,
    textBorderWidth: scala.Int | scala.Double = null,
    textShadowBlur: scala.Int | scala.Double = null,
    textShadowColor: java.lang.String = null,
    textShadowOffsetX: scala.Int | scala.Double = null,
    textShadowOffsetY: scala.Int | scala.Double = null,
    verticalAlign: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rich != null) __obj.updateDynamic("rich")(rich)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(showMaxLabel)) __obj.updateDynamic("showMaxLabel")(showMaxLabel)
    if (!js.isUndefined(showMinLabel)) __obj.updateDynamic("showMinLabel")(showMinLabel)
    if (textBorderColor != null) __obj.updateDynamic("textBorderColor")(textBorderColor)
    if (textBorderWidth != null) __obj.updateDynamic("textBorderWidth")(textBorderWidth.asInstanceOf[js.Any])
    if (textShadowBlur != null) __obj.updateDynamic("textShadowBlur")(textShadowBlur.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor)
    if (textShadowOffsetX != null) __obj.updateDynamic("textShadowOffsetX")(textShadowOffsetX.asInstanceOf[js.Any])
    if (textShadowOffsetY != null) __obj.updateDynamic("textShadowOffsetY")(textShadowOffsetY.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

