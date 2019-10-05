package typings.echarts.echarts

import typings.echarts.echarts.EChartOption.TextStyleWithRich
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartTitleOption extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var bottom: js.UndefOr[String | Double] = js.undefined
  var itemGap: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[String | Double] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var right: js.UndefOr[String | Double] = js.undefined
  var shadowBlur: js.UndefOr[Double] = js.undefined
  var shadowColor: js.UndefOr[Double] = js.undefined
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var sublink: js.UndefOr[String] = js.undefined
  var subtarget: js.UndefOr[String] = js.undefined
  var subtext: js.UndefOr[String] = js.undefined
  var subtextStyle: js.UndefOr[TextStyleWithRich] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var textStyle: js.UndefOr[TextStyleWithRich] = js.undefined
  var textVerticalAlign: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[String | Double] = js.undefined
  var triggerEvent: js.UndefOr[Boolean] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
  var zlevel: js.UndefOr[Double] = js.undefined
}

object EChartTitleOption {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    borderRadius: Double | js.Array[Double] = null,
    borderWidth: Int | Double = null,
    bottom: String | Double = null,
    itemGap: Int | Double = null,
    left: String | Double = null,
    link: String = null,
    padding: Int | Double = null,
    right: String | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: Int | Double = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    sublink: String = null,
    subtarget: String = null,
    subtext: String = null,
    subtextStyle: TextStyleWithRich = null,
    target: String = null,
    text: String = null,
    textAlign: String = null,
    textStyle: TextStyleWithRich = null,
    textVerticalAlign: String = null,
    top: String | Double = null,
    triggerEvent: js.UndefOr[Boolean] = js.undefined,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): EChartTitleOption = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (itemGap != null) __obj.updateDynamic("itemGap")(itemGap.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (sublink != null) __obj.updateDynamic("sublink")(sublink)
    if (subtarget != null) __obj.updateDynamic("subtarget")(subtarget)
    if (subtext != null) __obj.updateDynamic("subtext")(subtext)
    if (subtextStyle != null) __obj.updateDynamic("subtextStyle")(subtextStyle)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (textVerticalAlign != null) __obj.updateDynamic("textVerticalAlign")(textVerticalAlign)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerEvent)) __obj.updateDynamic("triggerEvent")(triggerEvent)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartTitleOption]
  }
}

