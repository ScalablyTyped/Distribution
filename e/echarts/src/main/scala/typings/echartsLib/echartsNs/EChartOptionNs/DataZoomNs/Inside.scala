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
trait Inside extends js.Object {
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

