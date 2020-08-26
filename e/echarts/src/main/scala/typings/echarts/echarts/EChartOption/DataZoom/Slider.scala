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
  * @see https://echarts.apache.org/en/option.html#dataZoom-slider
  */
@js.native
trait Slider extends js.Object {
  var angleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var bottom: js.UndefOr[String | Double] = js.native
  var dataBackground: js.UndefOr[js.Object] = js.native
  var end: js.UndefOr[Double] = js.native
  var endValue: js.UndefOr[Double | String | Date] = js.native
  var fillerColor: js.UndefOr[String] = js.native
  var filterMode: js.UndefOr[filter | weakFilter | empty | none] = js.native
  var handleIcon: js.UndefOr[String] = js.native
  var handleSize: js.UndefOr[Double | String] = js.native
  var handleStyle: js.UndefOr[js.Object] = js.native
  var id: js.UndefOr[String] = js.native
  var labelFormatter: js.UndefOr[String | js.Function] = js.native
  var labelPrecision: js.UndefOr[Double] = js.native
  var left: js.UndefOr[String | Double] = js.native
  var maxSpan: js.UndefOr[Double] = js.native
  var maxValueSpan: js.UndefOr[Double | String | Date] = js.native
  var minSpan: js.UndefOr[Double] = js.native
  var minValueSpan: js.UndefOr[Double | String | Date] = js.native
  var orient: js.UndefOr[vertical | horizontal] = js.native
  var radiusAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var rangeMode: js.UndefOr[js.Array[String]] = js.native
  var realtime: js.UndefOr[Boolean] = js.native
  var right: js.UndefOr[String | Double] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var showDataShadow: js.UndefOr[String] = js.native
  var showDetail: js.UndefOr[Boolean] = js.native
  var singleAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var start: js.UndefOr[Double] = js.native
  var startValue: js.UndefOr[Double | String | Date] = js.native
  var textStyle: js.UndefOr[BaseTextStyle] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var top: js.UndefOr[String | Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var xAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var yAxisIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var z: js.UndefOr[Double] = js.native
  var zlevel: js.UndefOr[Double] = js.native
  var zoomLock: js.UndefOr[Boolean] = js.native
}

object Slider {
  @scala.inline
  def apply(): Slider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slider]
  }
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBottom(value: String | Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setDataBackground(value: js.Object): Self = this.set("dataBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataBackground: Self = this.set("dataBackground", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEndValue(value: Double | String | Date): Self = this.set("endValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    @scala.inline
    def setFillerColor(value: String): Self = this.set("fillerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillerColor: Self = this.set("fillerColor", js.undefined)
    @scala.inline
    def setFilterMode(value: filter | weakFilter | empty | none): Self = this.set("filterMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMode: Self = this.set("filterMode", js.undefined)
    @scala.inline
    def setHandleIcon(value: String): Self = this.set("handleIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleIcon: Self = this.set("handleIcon", js.undefined)
    @scala.inline
    def setHandleSize(value: Double | String): Self = this.set("handleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleSize: Self = this.set("handleSize", js.undefined)
    @scala.inline
    def setHandleStyle(value: js.Object): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabelFormatter(value: String | js.Function): Self = this.set("labelFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFormatter: Self = this.set("labelFormatter", js.undefined)
    @scala.inline
    def setLabelPrecision(value: Double): Self = this.set("labelPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPrecision: Self = this.set("labelPrecision", js.undefined)
    @scala.inline
    def setLeft(value: String | Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
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
    def setOrient(value: vertical | horizontal): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
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
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
    @scala.inline
    def setRight(value: String | Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setShowDataShadow(value: String): Self = this.set("showDataShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDataShadow: Self = this.set("showDataShadow", js.undefined)
    @scala.inline
    def setShowDetail(value: Boolean): Self = this.set("showDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDetail: Self = this.set("showDetail", js.undefined)
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
    def setTextStyle(value: BaseTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    @scala.inline
    def setTop(value: String | Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
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
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    @scala.inline
    def setZlevel(value: Double): Self = this.set("zlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZlevel: Self = this.set("zlevel", js.undefined)
    @scala.inline
    def setZoomLock(value: Boolean): Self = this.set("zoomLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomLock: Self = this.set("zoomLock", js.undefined)
  }
  
}

