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
    borderWidth: js.UndefOr[Double] = js.undefined,
    bottom: String | Double = null,
    itemGap: js.UndefOr[Double] = js.undefined,
    left: String | Double = null,
    link: String = null,
    padding: js.UndefOr[Double] = js.undefined,
    right: String | Double = null,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowColor: js.UndefOr[Double] = js.undefined,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined,
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
    z: js.UndefOr[Double] = js.undefined,
    zlevel: js.UndefOr[Double] = js.undefined
  ): EChartTitleOption = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(itemGap)) __obj.updateDynamic("itemGap")(itemGap.get.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowBlur)) __obj.updateDynamic("shadowBlur")(shadowBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowColor)) __obj.updateDynamic("shadowColor")(shadowColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetX)) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetY)) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (sublink != null) __obj.updateDynamic("sublink")(sublink.asInstanceOf[js.Any])
    if (subtarget != null) __obj.updateDynamic("subtarget")(subtarget.asInstanceOf[js.Any])
    if (subtext != null) __obj.updateDynamic("subtext")(subtext.asInstanceOf[js.Any])
    if (subtextStyle != null) __obj.updateDynamic("subtextStyle")(subtextStyle.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (textVerticalAlign != null) __obj.updateDynamic("textVerticalAlign")(textVerticalAlign.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerEvent)) __obj.updateDynamic("triggerEvent")(triggerEvent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zlevel)) __obj.updateDynamic("zlevel")(zlevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartTitleOption]
  }
}

