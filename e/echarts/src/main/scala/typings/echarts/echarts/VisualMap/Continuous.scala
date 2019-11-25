package typings.echarts.echarts.VisualMap

import typings.echarts.Anon_InRange
import typings.echarts.echarts.EChartOption.BaseTextStyleWithRich
import typings.echarts.echartsStrings.auto
import typings.echarts.echartsStrings.bottom
import typings.echarts.echartsStrings.continuous
import typings.echarts.echartsStrings.horizontal
import typings.echarts.echartsStrings.left
import typings.echarts.echartsStrings.right
import typings.echarts.echartsStrings.top
import typings.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Continuous
  extends typings.echarts.echarts.EChartOption.VisualMap {
  var align: js.UndefOr[auto | left | right | top | bottom] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var bottom: js.UndefOr[Double | String] = js.undefined
  var calculable: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[js.Array[String]] = js.undefined
  var controller: js.UndefOr[Anon_InRange] = js.undefined
  var dimension: js.UndefOr[String | Double] = js.undefined
  var formatter: js.UndefOr[String | js.Function] = js.undefined
  var hoverLink: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inRange: js.UndefOr[RangeObject] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var itemHeight: js.UndefOr[Double] = js.undefined
  var itemWidth: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double | String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orient: js.UndefOr[vertical | horizontal] = js.undefined
  var outOfRange: js.UndefOr[RangeObject] = js.undefined
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  var realtime: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Double | String] = js.undefined
  var seriesIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[js.Array[String]] = js.undefined
  var textGap: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[BaseTextStyleWithRich] = js.undefined
  var top: js.UndefOr[Double | String] = js.undefined
  var `type`: js.UndefOr[continuous] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
  var zlevel: js.UndefOr[Double] = js.undefined
}

object Continuous {
  @scala.inline
  def apply(
    align: auto | left | right | top | bottom = null,
    backgroundColor: String = null,
    borderColor: String = null,
    borderWidth: Int | Double = null,
    bottom: Double | String = null,
    calculable: js.UndefOr[Boolean] = js.undefined,
    color: js.Array[String] = null,
    controller: Anon_InRange = null,
    dimension: String | Double = null,
    formatter: String | js.Function = null,
    hoverLink: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inRange: RangeObject = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    itemHeight: Int | Double = null,
    itemWidth: Int | Double = null,
    left: Double | String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    orient: vertical | horizontal = null,
    outOfRange: RangeObject = null,
    padding: Double | js.Array[Double] = null,
    precision: Int | Double = null,
    range: js.Array[Double] = null,
    realtime: js.UndefOr[Boolean] = js.undefined,
    right: Double | String = null,
    seriesIndex: Double | js.Array[Double] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    text: js.Array[String] = null,
    textGap: Int | Double = null,
    textStyle: BaseTextStyleWithRich = null,
    top: Double | String = null,
    `type`: continuous = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): Continuous = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(calculable)) __obj.updateDynamic("calculable")(calculable.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverLink)) __obj.updateDynamic("hoverLink")(hoverLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inRange != null) __obj.updateDynamic("inRange")(inRange.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (outOfRange != null) __obj.updateDynamic("outOfRange")(outOfRange.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textGap != null) __obj.updateDynamic("textGap")(textGap.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Continuous]
  }
}

