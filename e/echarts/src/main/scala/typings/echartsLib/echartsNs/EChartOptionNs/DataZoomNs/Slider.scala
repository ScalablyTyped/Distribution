package typings
package echartsLib.echartsNs.EChartOptionNs.DataZoomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom-slider
  */
trait Slider
  extends echartsLib.echartsNs.EChartOptionNs.DataZoom {
  var angleAxisIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var bottom: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var dataBackground: js.UndefOr[js.Object] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var endValue: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var filterMode: js.UndefOr[
    echartsLib.echartsLibStrings.filter | echartsLib.echartsLibStrings.weakFilter | echartsLib.echartsLibStrings.empty | echartsLib.echartsLibStrings.none
  ] = js.undefined
  var handleIcon: js.UndefOr[java.lang.String] = js.undefined
  var handleSize: js.UndefOr[scala.Double] = js.undefined
  var handleStyle: js.UndefOr[js.Object] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var labelFormatter: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var labelPrecision: js.UndefOr[scala.Double] = js.undefined
  var left: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var maxSpan: js.UndefOr[scala.Double] = js.undefined
  var maxValueSpan: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var minSpan: js.UndefOr[scala.Double] = js.undefined
  var minValueSpan: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var orient: js.UndefOr[echartsLib.echartsLibStrings.vertical | echartsLib.echartsLibStrings.horizontal] = js.undefined
  var radiusAxisIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var rangeMode: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var realtime: js.UndefOr[scala.Boolean] = js.undefined
  var right: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var showDataShadow: js.UndefOr[java.lang.String] = js.undefined
  var showDetail: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var startValue: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var textStyle: js.UndefOr[js.Object] = js.undefined
  var throttle: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var xAxisIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var yAxisIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var z: js.UndefOr[scala.Double] = js.undefined
  var zlevel: js.UndefOr[scala.Double] = js.undefined
  var zoomLock: js.UndefOr[scala.Boolean] = js.undefined
}

object Slider {
  @scala.inline
  def apply(
    angleAxisIndex: scala.Double | js.Array[scala.Double] = null,
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    bottom: java.lang.String | scala.Double = null,
    dataBackground: js.Object = null,
    end: scala.Int | scala.Double = null,
    endValue: scala.Double | java.lang.String | stdLib.Date = null,
    fillColor: java.lang.String = null,
    filterMode: echartsLib.echartsLibStrings.filter | echartsLib.echartsLibStrings.weakFilter | echartsLib.echartsLibStrings.empty | echartsLib.echartsLibStrings.none = null,
    handleIcon: java.lang.String = null,
    handleSize: scala.Int | scala.Double = null,
    handleStyle: js.Object = null,
    id: java.lang.String = null,
    labelFormatter: java.lang.String | js.Function = null,
    labelPrecision: scala.Int | scala.Double = null,
    left: java.lang.String | scala.Double = null,
    maxSpan: scala.Int | scala.Double = null,
    maxValueSpan: scala.Double | java.lang.String | stdLib.Date = null,
    minSpan: scala.Int | scala.Double = null,
    minValueSpan: scala.Double | java.lang.String | stdLib.Date = null,
    orient: echartsLib.echartsLibStrings.vertical | echartsLib.echartsLibStrings.horizontal = null,
    radiusAxisIndex: scala.Double | js.Array[scala.Double] = null,
    rangeMode: js.Array[java.lang.String] = null,
    realtime: js.UndefOr[scala.Boolean] = js.undefined,
    right: java.lang.String | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    showDataShadow: java.lang.String = null,
    showDetail: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    startValue: scala.Double | java.lang.String | stdLib.Date = null,
    textStyle: js.Object = null,
    throttle: scala.Int | scala.Double = null,
    top: java.lang.String | scala.Double = null,
    `type`: java.lang.String = null,
    xAxisIndex: scala.Double | js.Array[scala.Double] = null,
    yAxisIndex: scala.Double | js.Array[scala.Double] = null,
    z: scala.Int | scala.Double = null,
    zlevel: scala.Int | scala.Double = null,
    zoomLock: js.UndefOr[scala.Boolean] = js.undefined
  ): Slider = {
    val __obj = js.Dynamic.literal()
    if (angleAxisIndex != null) __obj.updateDynamic("angleAxisIndex")(angleAxisIndex.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (dataBackground != null) __obj.updateDynamic("dataBackground")(dataBackground)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (handleIcon != null) __obj.updateDynamic("handleIcon")(handleIcon)
    if (handleSize != null) __obj.updateDynamic("handleSize")(handleSize.asInstanceOf[js.Any])
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(labelFormatter.asInstanceOf[js.Any])
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (maxSpan != null) __obj.updateDynamic("maxSpan")(maxSpan.asInstanceOf[js.Any])
    if (maxValueSpan != null) __obj.updateDynamic("maxValueSpan")(maxValueSpan.asInstanceOf[js.Any])
    if (minSpan != null) __obj.updateDynamic("minSpan")(minSpan.asInstanceOf[js.Any])
    if (minValueSpan != null) __obj.updateDynamic("minValueSpan")(minValueSpan.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (radiusAxisIndex != null) __obj.updateDynamic("radiusAxisIndex")(radiusAxisIndex.asInstanceOf[js.Any])
    if (rangeMode != null) __obj.updateDynamic("rangeMode")(rangeMode)
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (showDataShadow != null) __obj.updateDynamic("showDataShadow")(showDataShadow)
    if (!js.isUndefined(showDetail)) __obj.updateDynamic("showDetail")(showDetail)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLock)) __obj.updateDynamic("zoomLock")(zoomLock)
    __obj.asInstanceOf[Slider]
  }
}

