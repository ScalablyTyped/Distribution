package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartTitleOption extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var bottom: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var itemGap: js.UndefOr[scala.Double] = js.undefined
  var left: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var right: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  var shadowColor: js.UndefOr[scala.Double] = js.undefined
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var sublink: js.UndefOr[java.lang.String] = js.undefined
  var subtarget: js.UndefOr[java.lang.String] = js.undefined
  var subtext: js.UndefOr[java.lang.String] = js.undefined
  var subtextStyle: js.UndefOr[js.Object] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  var textStyle: js.UndefOr[js.Object] = js.undefined
  var textVerticalAlign: js.UndefOr[java.lang.String] = js.undefined
  var top: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var triggerEvent: js.UndefOr[scala.Boolean] = js.undefined
  var z: js.UndefOr[scala.Double] = js.undefined
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

object EChartTitleOption {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderRadius: scala.Double | js.Array[scala.Double] = null,
    borderWidth: scala.Int | scala.Double = null,
    bottom: java.lang.String | scala.Double = null,
    itemGap: scala.Int | scala.Double = null,
    left: java.lang.String | scala.Double = null,
    link: java.lang.String = null,
    padding: scala.Int | scala.Double = null,
    right: java.lang.String | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: scala.Int | scala.Double = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    sublink: java.lang.String = null,
    subtarget: java.lang.String = null,
    subtext: java.lang.String = null,
    subtextStyle: js.Object = null,
    target: java.lang.String = null,
    text: java.lang.String = null,
    textAlign: java.lang.String = null,
    textStyle: js.Object = null,
    textVerticalAlign: java.lang.String = null,
    top: java.lang.String | scala.Double = null,
    triggerEvent: js.UndefOr[scala.Boolean] = js.undefined,
    z: scala.Int | scala.Double = null,
    zlevel: scala.Int | scala.Double = null
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

