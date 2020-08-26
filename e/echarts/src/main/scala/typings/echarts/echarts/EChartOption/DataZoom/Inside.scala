package typings.echarts.echarts.EChartOption.DataZoom

import typings.echarts.echartsStrings.empty
import typings.echarts.echartsStrings.filter
import typings.echarts.echartsStrings.none
import typings.echarts.echartsStrings.weakFilter
import typings.std.Date
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
  * @see https://echarts.apache.org/en/option.html#dataZoom-inside
  */
@js.native
trait Inside extends js.Object {
  var angleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var disable: js.UndefOr[Boolean] = js.native
  var end: js.UndefOr[Double] = js.native
  var endValue: js.UndefOr[Double | String | Date] = js.native
  var filterMode: js.UndefOr[filter | weakFilter | empty | none] = js.native
  var id: js.UndefOr[String] = js.native
  var maxSpan: js.UndefOr[Double] = js.native
  var maxValueSpan: js.UndefOr[Double | String | Date] = js.native
  var minSpan: js.UndefOr[Double] = js.native
  var minValueSpan: js.UndefOr[Double | String | Date] = js.native
  var moveOnMouseMove: js.UndefOr[Boolean] = js.native
  var moveOnMouseWheel: js.UndefOr[Boolean] = js.native
  var orient: js.UndefOr[String] = js.native
  var preventDefaultMouseMove: js.UndefOr[Boolean] = js.native
  var radiusAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var rangeMode: js.UndefOr[js.Array[String]] = js.native
  var singleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var start: js.UndefOr[Double] = js.native
  var startValue: js.UndefOr[Double | String | Date] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var xAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var yAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var zoomLock: js.UndefOr[Boolean] = js.native
  var zoomOnMouseWheel: js.UndefOr[Boolean] = js.native
}

object Inside {
  @scala.inline
  def apply(): Inside = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inside]
  }
  @scala.inline
  implicit class InsideOps[Self <: Inside] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngleAxisIndexVarargs(value: Double*): Self = this.set("angleAxisIndex", js.Array(value :_*))
    @scala.inline
    def setAngleAxisIndex(value: Double | js.Array[Double]): Self = this.set("angleAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngleAxisIndex: Self = this.set("angleAxisIndex", js.undefined)
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEndValue(value: Double | String | Date): Self = this.set("endValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    @scala.inline
    def setFilterMode(value: filter | weakFilter | empty | none): Self = this.set("filterMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMode: Self = this.set("filterMode", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaxSpan(value: Double): Self = this.set("maxSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSpan: Self = this.set("maxSpan", js.undefined)
    @scala.inline
    def setMaxValueSpan(value: Double | String | Date): Self = this.set("maxValueSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValueSpan: Self = this.set("maxValueSpan", js.undefined)
    @scala.inline
    def setMinSpan(value: Double): Self = this.set("minSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSpan: Self = this.set("minSpan", js.undefined)
    @scala.inline
    def setMinValueSpan(value: Double | String | Date): Self = this.set("minValueSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValueSpan: Self = this.set("minValueSpan", js.undefined)
    @scala.inline
    def setMoveOnMouseMove(value: Boolean): Self = this.set("moveOnMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveOnMouseMove: Self = this.set("moveOnMouseMove", js.undefined)
    @scala.inline
    def setMoveOnMouseWheel(value: Boolean): Self = this.set("moveOnMouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveOnMouseWheel: Self = this.set("moveOnMouseWheel", js.undefined)
    @scala.inline
    def setOrient(value: String): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    @scala.inline
    def setPreventDefaultMouseMove(value: Boolean): Self = this.set("preventDefaultMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefaultMouseMove: Self = this.set("preventDefaultMouseMove", js.undefined)
    @scala.inline
    def setRadiusAxisIndexVarargs(value: Double*): Self = this.set("radiusAxisIndex", js.Array(value :_*))
    @scala.inline
    def setRadiusAxisIndex(value: Double | js.Array[Double]): Self = this.set("radiusAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusAxisIndex: Self = this.set("radiusAxisIndex", js.undefined)
    @scala.inline
    def setRangeModeVarargs(value: String*): Self = this.set("rangeMode", js.Array(value :_*))
    @scala.inline
    def setRangeMode(value: js.Array[String]): Self = this.set("rangeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeMode: Self = this.set("rangeMode", js.undefined)
    @scala.inline
    def setSingleAxisIndexVarargs(value: Double*): Self = this.set("singleAxisIndex", js.Array(value :_*))
    @scala.inline
    def setSingleAxisIndex(value: Double | js.Array[Double]): Self = this.set("singleAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleAxisIndex: Self = this.set("singleAxisIndex", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartValue(value: Double | String | Date): Self = this.set("startValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setXAxisIndexVarargs(value: Double*): Self = this.set("xAxisIndex", js.Array(value :_*))
    @scala.inline
    def setXAxisIndex(value: Double | js.Array[Double]): Self = this.set("xAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisIndex: Self = this.set("xAxisIndex", js.undefined)
    @scala.inline
    def setYAxisIndexVarargs(value: Double*): Self = this.set("yAxisIndex", js.Array(value :_*))
    @scala.inline
    def setYAxisIndex(value: Double | js.Array[Double]): Self = this.set("yAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisIndex: Self = this.set("yAxisIndex", js.undefined)
    @scala.inline
    def setZoomLock(value: Boolean): Self = this.set("zoomLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomLock: Self = this.set("zoomLock", js.undefined)
    @scala.inline
    def setZoomOnMouseWheel(value: Boolean): Self = this.set("zoomOnMouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOnMouseWheel: Self = this.set("zoomOnMouseWheel", js.undefined)
  }
  
}

