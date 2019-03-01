package typings
package echartsLib.echartsNs.EChartOptionNs.DataZoomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data zoom component of inside type.
  * Refer to dataZoom for more information.
  * The inside means it's inside the coordinates.
  * Translation: data area can be translated when moving in coordinates.
  * Scaling:
  * PC: when mouse rolls (similar with touch pad) in coordinates.
  * Mobile: when touches and moved with two fingers in coordinates
  * on touch screens.
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom-inside
  */
trait Inside
  extends echartsLib.echartsNs.EChartOptionNs.DataZoom {
  var angleAxisIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var endValue: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var filterMode: js.UndefOr[
    echartsLib.echartsLibStrings.filter | echartsLib.echartsLibStrings.weakFilter | echartsLib.echartsLibStrings.empty | echartsLib.echartsLibStrings.none
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var maxSpan: js.UndefOr[scala.Double] = js.undefined
  var maxValueSpan: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var minSpan: js.UndefOr[scala.Double] = js.undefined
  var minValueSpan: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var moveOnMouseMove: js.UndefOr[scala.Boolean] = js.undefined
  var moveOnMouseWheel: js.UndefOr[scala.Boolean] = js.undefined
  var orient: js.UndefOr[java.lang.String] = js.undefined
  var preventDefaultMouseMove: js.UndefOr[scala.Boolean] = js.undefined
  var radiusAxisIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var rangeMode: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var startValue: js.UndefOr[scala.Double | java.lang.String | stdLib.Date] = js.undefined
  var throttle: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var xAxisIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var yAxisIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var zoomLock: js.UndefOr[scala.Boolean] = js.undefined
  var zoomOnMouseWheel: js.UndefOr[scala.Boolean] = js.undefined
}

object Inside {
  @scala.inline
  def apply(
    angleAxisIndex: scala.Double | js.Array[scala.Double] = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    endValue: scala.Double | java.lang.String | stdLib.Date = null,
    filterMode: echartsLib.echartsLibStrings.filter | echartsLib.echartsLibStrings.weakFilter | echartsLib.echartsLibStrings.empty | echartsLib.echartsLibStrings.none = null,
    id: java.lang.String = null,
    maxSpan: scala.Int | scala.Double = null,
    maxValueSpan: scala.Double | java.lang.String | stdLib.Date = null,
    minSpan: scala.Int | scala.Double = null,
    minValueSpan: scala.Double | java.lang.String | stdLib.Date = null,
    moveOnMouseMove: js.UndefOr[scala.Boolean] = js.undefined,
    moveOnMouseWheel: js.UndefOr[scala.Boolean] = js.undefined,
    orient: java.lang.String = null,
    preventDefaultMouseMove: js.UndefOr[scala.Boolean] = js.undefined,
    radiusAxisIndex: scala.Double | js.Array[scala.Double] = null,
    rangeMode: js.Array[java.lang.String] = null,
    start: scala.Int | scala.Double = null,
    startValue: scala.Double | java.lang.String | stdLib.Date = null,
    throttle: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    xAxisIndex: scala.Double | js.Array[scala.Double] = null,
    yAxisIndex: scala.Double | js.Array[scala.Double] = null,
    zoomLock: js.UndefOr[scala.Boolean] = js.undefined,
    zoomOnMouseWheel: js.UndefOr[scala.Boolean] = js.undefined
  ): Inside = {
    val __obj = js.Dynamic.literal()
    if (angleAxisIndex != null) __obj.updateDynamic("angleAxisIndex")(angleAxisIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxSpan != null) __obj.updateDynamic("maxSpan")(maxSpan.asInstanceOf[js.Any])
    if (maxValueSpan != null) __obj.updateDynamic("maxValueSpan")(maxValueSpan.asInstanceOf[js.Any])
    if (minSpan != null) __obj.updateDynamic("minSpan")(minSpan.asInstanceOf[js.Any])
    if (minValueSpan != null) __obj.updateDynamic("minValueSpan")(minValueSpan.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnMouseMove)) __obj.updateDynamic("moveOnMouseMove")(moveOnMouseMove)
    if (!js.isUndefined(moveOnMouseWheel)) __obj.updateDynamic("moveOnMouseWheel")(moveOnMouseWheel)
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (!js.isUndefined(preventDefaultMouseMove)) __obj.updateDynamic("preventDefaultMouseMove")(preventDefaultMouseMove)
    if (radiusAxisIndex != null) __obj.updateDynamic("radiusAxisIndex")(radiusAxisIndex.asInstanceOf[js.Any])
    if (rangeMode != null) __obj.updateDynamic("rangeMode")(rangeMode)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLock)) __obj.updateDynamic("zoomLock")(zoomLock)
    if (!js.isUndefined(zoomOnMouseWheel)) __obj.updateDynamic("zoomOnMouseWheel")(zoomOnMouseWheel)
    __obj.asInstanceOf[Inside]
  }
}

