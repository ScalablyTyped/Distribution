package typings.echarts.echarts.EChartOption.DataZoom

import typings.echarts.echarts.EChartOption.BaseTextStyle
import typings.echarts.echartsStrings.empty
import typings.echarts.echartsStrings.filter
import typings.echarts.echartsStrings.horizontal
import typings.echarts.echartsStrings.none
import typings.echarts.echartsStrings.vertical
import typings.echarts.echartsStrings.weakFilter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom-slider
  */
trait Slider extends js.Object {
  var angleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var bottom: js.UndefOr[String | Double] = js.undefined
  var dataBackground: js.UndefOr[js.Object] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var endValue: js.UndefOr[Double | String | Date] = js.undefined
  var fillerColor: js.UndefOr[String] = js.undefined
  var filterMode: js.UndefOr[filter | weakFilter | empty | none] = js.undefined
  var handleIcon: js.UndefOr[String] = js.undefined
  var handleSize: js.UndefOr[Double] = js.undefined
  var handleStyle: js.UndefOr[js.Object] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labelFormatter: js.UndefOr[String | js.Function] = js.undefined
  var labelPrecision: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[String | Double] = js.undefined
  var maxSpan: js.UndefOr[Double] = js.undefined
  var maxValueSpan: js.UndefOr[Double | String | Date] = js.undefined
  var minSpan: js.UndefOr[Double] = js.undefined
  var minValueSpan: js.UndefOr[Double | String | Date] = js.undefined
  var orient: js.UndefOr[vertical | horizontal] = js.undefined
  var radiusAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var rangeMode: js.UndefOr[js.Array[String]] = js.undefined
  var realtime: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[String | Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var showDataShadow: js.UndefOr[String] = js.undefined
  var showDetail: js.UndefOr[Boolean] = js.undefined
  var singleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var startValue: js.UndefOr[Double | String | Date] = js.undefined
  var textStyle: js.UndefOr[BaseTextStyle] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[String | Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var xAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var yAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
  var zlevel: js.UndefOr[Double] = js.undefined
  var zoomLock: js.UndefOr[Boolean] = js.undefined
}

object Slider {
  @scala.inline
  def apply(
    angleAxisIndex: Double | js.Array[Double] = null,
    backgroundColor: String = null,
    borderColor: String = null,
    bottom: String | Double = null,
    dataBackground: js.Object = null,
    end: Int | Double = null,
    endValue: Double | String | Date = null,
    fillerColor: String = null,
    filterMode: filter | weakFilter | empty | none = null,
    handleIcon: String = null,
    handleSize: Int | Double = null,
    handleStyle: js.Object = null,
    id: String = null,
    labelFormatter: String | js.Function = null,
    labelPrecision: Int | Double = null,
    left: String | Double = null,
    maxSpan: Int | Double = null,
    maxValueSpan: Double | String | Date = null,
    minSpan: Int | Double = null,
    minValueSpan: Double | String | Date = null,
    orient: vertical | horizontal = null,
    radiusAxisIndex: Double | js.Array[Double] = null,
    rangeMode: js.Array[String] = null,
    realtime: js.UndefOr[Boolean] = js.undefined,
    right: String | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    showDataShadow: String = null,
    showDetail: js.UndefOr[Boolean] = js.undefined,
    singleAxisIndex: Double | js.Array[Double] = null,
    start: Int | Double = null,
    startValue: Double | String | Date = null,
    textStyle: BaseTextStyle = null,
    throttle: Int | Double = null,
    top: String | Double = null,
    `type`: String = null,
    xAxisIndex: Double | js.Array[Double] = null,
    yAxisIndex: Double | js.Array[Double] = null,
    z: Int | Double = null,
    zlevel: Int | Double = null,
    zoomLock: js.UndefOr[Boolean] = js.undefined
  ): Slider = {
    val __obj = js.Dynamic.literal()
    if (angleAxisIndex != null) __obj.updateDynamic("angleAxisIndex")(angleAxisIndex.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (dataBackground != null) __obj.updateDynamic("dataBackground")(dataBackground.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (fillerColor != null) __obj.updateDynamic("fillerColor")(fillerColor.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (handleIcon != null) __obj.updateDynamic("handleIcon")(handleIcon.asInstanceOf[js.Any])
    if (handleSize != null) __obj.updateDynamic("handleSize")(handleSize.asInstanceOf[js.Any])
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(labelFormatter.asInstanceOf[js.Any])
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (maxSpan != null) __obj.updateDynamic("maxSpan")(maxSpan.asInstanceOf[js.Any])
    if (maxValueSpan != null) __obj.updateDynamic("maxValueSpan")(maxValueSpan.asInstanceOf[js.Any])
    if (minSpan != null) __obj.updateDynamic("minSpan")(minSpan.asInstanceOf[js.Any])
    if (minValueSpan != null) __obj.updateDynamic("minValueSpan")(minValueSpan.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (radiusAxisIndex != null) __obj.updateDynamic("radiusAxisIndex")(radiusAxisIndex.asInstanceOf[js.Any])
    if (rangeMode != null) __obj.updateDynamic("rangeMode")(rangeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (showDataShadow != null) __obj.updateDynamic("showDataShadow")(showDataShadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showDetail)) __obj.updateDynamic("showDetail")(showDetail.asInstanceOf[js.Any])
    if (singleAxisIndex != null) __obj.updateDynamic("singleAxisIndex")(singleAxisIndex.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLock)) __obj.updateDynamic("zoomLock")(zoomLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
}

