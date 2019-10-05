package typings.echarts.echarts.EChartOption

import typings.echarts.echartsStrings.`100`
import typings.echarts.echartsStrings.`200`
import typings.echarts.echartsStrings.`300`
import typings.echarts.echartsStrings.`400`
import typings.echarts.echartsStrings.bold
import typings.echarts.echartsStrings.bolder
import typings.echarts.echartsStrings.italic
import typings.echarts.echartsStrings.lighter
import typings.echarts.echartsStrings.normal
import typings.echarts.echartsStrings.oblique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends BaseTextStyle {
  var align: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var shadowBlur: js.UndefOr[Double] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  var verticalAlign: js.UndefOr[String] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    align: String = null,
    backgroundColor: String | js.Object = null,
    borderColor: String = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    color: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: normal | italic | oblique = null,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` = null,
    height: Double | String = null,
    lineHeight: Int | Double = null,
    padding: Double | js.Array[Double] = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    textBorderColor: String = null,
    textBorderWidth: Int | Double = null,
    textShadowBlur: Int | Double = null,
    textShadowColor: String = null,
    textShadowOffsetX: Int | Double = null,
    textShadowOffsetY: Int | Double = null,
    verticalAlign: String = null,
    width: Double | String = null
  ): TextStyle = {
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
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (textBorderColor != null) __obj.updateDynamic("textBorderColor")(textBorderColor)
    if (textBorderWidth != null) __obj.updateDynamic("textBorderWidth")(textBorderWidth.asInstanceOf[js.Any])
    if (textShadowBlur != null) __obj.updateDynamic("textShadowBlur")(textShadowBlur.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor)
    if (textShadowOffsetX != null) __obj.updateDynamic("textShadowOffsetX")(textShadowOffsetX.asInstanceOf[js.Any])
    if (textShadowOffsetY != null) __obj.updateDynamic("textShadowOffsetY")(textShadowOffsetY.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

