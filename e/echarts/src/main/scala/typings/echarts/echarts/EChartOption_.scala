package typings.echarts.echarts

import typings.echarts.echarts.EChartOption.AxisPointer
import typings.echarts.echarts.EChartOption.BaseTextStyle
import typings.echarts.echarts.EChartOption.Calendar
import typings.echarts.echarts.EChartOption.DataZoom
import typings.echarts.echarts.EChartOption.Dataset
import typings.echarts.echarts.EChartOption.Grid
import typings.echarts.echarts.EChartOption.Legend
import typings.echarts.echarts.EChartOption.SingleAxis
import typings.echarts.echarts.EChartOption.Tooltip
import typings.echarts.echarts.EChartOption.XAxis
import typings.echarts.echarts.EChartOption.YAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EChartOption_[TSeries] extends js.Object {
  /**
    * The angle axis in Polar Coordinate.
    *
    * @see https://echarts.apache.org/en/option.html#angleAxis
    */
  var angleAxis: js.UndefOr[js.Object] = js.native
  /**
    * Whether to enable animation.
    *
    * @see https://echarts.apache.org/en/option.html#animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data
    * to have different animation effect.
    *
    * @example
    * animationDelay: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://echarts.apache.org/en/option.html#animationDelay
    */
  var animationDelay: js.UndefOr[Double | js.Function] = js.native
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * @example
    * animationDelayUpdate: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://echarts.apache.org/en/option.html#animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[Double | js.Function] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect
    *
    * @example
    * animationDuration: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://echarts.apache.org/en/option.html#animationDuration
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect
    *
    * @example
    * animationDurationUpdate: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://echarts.apache.org/en/option.html#animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[Double | js.Function] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at `easing effect example`.
    *
    * @see https://echarts.apache.org/en/option.html#animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    * @see https://echarts.apache.org/en/option.html#animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.native
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than threshold.
    *
    * @see https://echarts.apache.org/en/option.html#animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * `dataset` component is published since ECharts 4.
    * `dataset` brings convenience in data management separated with styles
    * and enables data reuse by different series.
    * More importantly, is enables data encoding from data to visual,
    * which brings convenience in some scenarios.
    * More details about `dataset` can be checked in the tutorial.
    * @see https://echarts.apache.org/en/option.html#aria
    */
  var aria: js.UndefOr[js.Object] = js.native
  /**
    * `axisPointer` is a tool for displaying reference line and axis value
    * under mouse pointer.
    *
    * @see https://echarts.apache.org/en/option.html#axisPointer
    */
  var axisPointer: js.UndefOr[AxisPointer] = js.native
  /**
    * Background color. Defaults to have no background.
    *
    * @see https://echarts.apache.org/en/option.html#backgroundColor
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Equal to CanvasRenderingContext2D.globalCompositeOperation
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation
    *
    */
  var blendMode: js.UndefOr[String] = js.native
  /**
    * `brush` is an area-selecting component, with which user can select
    * part of data from a chart to display in detail, or doing calculations
    * with them.
    *
    * @see https://echarts.apache.org/en/option.html#brush
    */
  var brush: js.UndefOr[js.Object] = js.native
  /**
    * Calendar coordinates.
    * In ECharts, we are very creative to achieve the calendar chart,
    * by using the calendar coordinates
    * to achieve the calendar chart, as shown in the following example,
    * we can use calendar coordinates
    * in `heatmap`, `scatter`, `effectScatter`, and `graph`.
    * @see https://echarts.apache.org/en/option.html#calendar
    */
  var calendar: js.UndefOr[Calendar | js.Array[Calendar]] = js.native
  /**
    * The color list of palette.
    * If no color is set in series, the colors would be adopted sequentially
    * and circularly from this list
    * as the colors of series.
    * @default
    * [
    *   '#c23531','#2f4554','#61a0a8','#d48265','#91c7ae',
    *   '#749f83', '#ca8622','#bda29a','#6e7074','#546570',
    *   '#c4ccd3'
    * ]
    *
    * @see https://echarts.apache.org/en/option.html#color
    */
  var color: js.UndefOr[js.Array[String]] = js.native
  /**
    * `dataZoom` component is used for zooming a specific area,
    * which enables user to investigate data in detail,
    * or get an overview of the data,
    * or get rid of outlier points.
    * These types of `dataZoom` component are supported:
    * + `dataZoomInside`: Data zoom functionalities is embeded
    *   inside coordinate systems, enable user to zoom
    *   or roam coordinate system by mouse dragging,
    *   mouse move or finger touch (in touch screen).
    * + `dataZoomSlider`: A special slider bar is provided,
    *   on which coordinate systems can be zoomed or roamed
    *   by mouse dragging or finger touch (in touch screen).
    * + `dataZoomSelect`: A marquee tool is provided for zooming
    *   or roaming coordinate system.
    *   That is `toolbox.feature.dataZoom`, which can only be configured
    *   in toolbox.
    *
    * @see https://echarts.apache.org/en/option.html#dataZoom
    */
  var dataZoom: js.UndefOr[js.Array[DataZoom]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#dataset
    */
  var dataset: js.UndefOr[Dataset | js.Array[Dataset]] = js.native
  /**
    * Geographic coorinate system component.
    * Geographic coorinate system component is used to draw maps,
    * which also supports `scatter series`, and `line series`.
    *
    * @see https://echarts.apache.org/en/option.html#geo
    */
  var geo: js.UndefOr[js.Object] = js.native
  /**
    * `graphic` component enable creating graphic elements in echarts.
    * Those graphic type are supported.
    * `image`, `text`, `circle`, `sector`, `ring`, `polygon`,
    * `polyline`, `rect`, `line`, `bezierCurve`, `arc`, `group`,
    *
    * @see https://echarts.apache.org/en/option.html#graphic
    */
  var graphic: js.UndefOr[js.Object | js.Array[js.Object]] = js.native
  /**
    * Drawing grid in rectangular coordinate.
    * In a single grid, at most two X and Y axes each is allowed.
    * `Line chart`, `bar chart`, and `scatter chart (bubble chart)`
    * can be drawn in grid.
    * In ECharts 2.x, there could only be one single grid component
    * at most in a single echarts instance.
    * But in ECharts 3, there is no limitation.
    *
    * @see https://echarts.apache.org/en/option.html#grid
    */
  var grid: js.UndefOr[Grid | js.Array[Grid]] = js.native
  /**
    * Threshold of if use single hover layer to optimize.
    * It is recommended that `hoverLayerThreshold` is equivalent to or less than
    * `progressiveThreshold`, otherwise hover will cause restart of progressive,
    * which is unexpected.
    * see example <echarts/test/heatmap-large.html>.
    *
    * @default 3000
    */
  var hoverLayerThreshold: js.UndefOr[Double] = js.native
  /**
    * Legend component.
    * Legend component shows symbol, color and name of different series.
    * You can click legends to toggle displaying series in the chart.
    * In ECharts 3, a single echarts instance may contain multiple
    * legend components, which makes it easier for the layout of multiple
    * legend components.
    * If there have to be too many legend items, `vertically scrollable` legend
    * or `horizontally scrollable` legend are options to paginate them.
    * Check `legend.type` please.
    *
    * @see https://echarts.apache.org/en/option.html#legend
    */
  var legend: js.UndefOr[Legend] = js.native
  /**
    * `Parallel Coordinates` is a common way of visualizing high-dimensional
    * geometry and analyzing multivariate data.
    * For example, `series-parallel.data` is the following data:
    *
    * @example
    * [
    *     [1,  55,  9,   56,  0.46,  18,  6,  'good'],
    *     [2,  25,  11,  21,  0.65,  34,  9,  'excellent'],
    *     [3,  56,  7,   63,  0.3,   14,  5,  'good'],
    *     [4,  33,  7,   29,  0.33,  16,  6,  'excellent'],
    *     { // Data item can also be an Object,
    *       // so that perticular settings of its line can be set here.
    *         value: [5,  42,  24,  44,  0.76,  40,  16, 'excellent']
    *         lineStyle: {...},
    *     }
    *     ...
    * ]
    *
    * @see https://echarts.apache.org/en/option.html#parallel
    */
  var parallel: js.UndefOr[js.Object] = js.native
  /**
    * This component is the coordinate axis for parallel coordinate.
    *
    * @see https://echarts.apache.org/en/option.html#parallelAxis
    */
  var parallelAxis: js.UndefOr[js.Object] = js.native
  /**
    * Polar coordinate can be used in scatter and line chart.
    * Every polar coordinate has an `angleAxis` and a `radiusAxis`.
    *
    * @see https://echarts.apache.org/en/option.html#polar
    */
  var polar: js.UndefOr[js.Object] = js.native
  /**
    * Configuration for progressive/incremental rendering
    *
    * @default 400
    */
  var progressive: js.UndefOr[Double] = js.native
  /**
    * Configuration for progressive/incremental rendering
    *
    * @default 3000
    */
  var progressiveThreshold: js.UndefOr[Double] = js.native
  /**
    * Coordinate for `radar charts`.
    * This component is equal to the polar component in ECharts 2.
    * Because the polar component in the echarts 3 is reconstructed
    * to be the standard polar coordinate component,
    * this component is renamed to be radar to avoid confusion.
    * Radar chart coordinate is different from polar coordinate,
    * in that every axis indicator of the radar chart coordinate
    * is an individual dimension.
    * The style of indicator coordinate axis could be configured
    * through the following configuration items,
    * including `name`, `axisLine`, `axisTick`, `axisLabel`,
    * `splitLine`, `splitArea`.
    *
    * @see https://echarts.apache.org/en/option.html#radar
    */
  var radar: js.UndefOr[js.Object] = js.native
  /**
    * Radial axis of polar coordinate.
    *
    * @see https://echarts.apache.org/en/option.html#radiusAxis
    */
  var radiusAxis: js.UndefOr[js.Object] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series
    */
  var series: js.UndefOr[js.Array[TSeries]] = js.native
  /**
    * An axis with a single dimension. It can be used to display data
    * in one dimension.
    *
    * @see https://echarts.apache.org/en/option.html#singleAxis
    */
  var singleAxis: js.UndefOr[SingleAxis | js.Array[SingleAxis]] = js.native
  /**
    * Global font style.
    *
    * @see https://echarts.apache.org/en/option.html#textStyle
    */
  var textStyle: js.UndefOr[BaseTextStyle] = js.native
  /**
    * `timeline` component, which provides functions like switching and playing
    * between multiple ECharts `options`.
    *
    * @see https://echarts.apache.org/en/option.html#timeline
    */
  var timeline: js.UndefOr[js.Object] = js.native
  /**
    * Title component, including main title and subtitle.
    * In ECharts 2.x, a single instance of ECharts could contains
    * one title component at most.
    * However, in ECharts 3, there could be one or more
    * than one title components.
    * It is more useful when multiple diagrams in one instance all need titles.
    *
    * @see https://echarts.apache.org/en/option.html#title
    */
  var title: js.UndefOr[EChartTitleOption | js.Array[EChartTitleOption]] = js.native
  /**
    * A group of utility tools, which includes `export`, `data view`,
    * `dynamic type switching`, `data area zooming`, and `reset`.
    *
    * @see https://echarts.apache.org/en/option.html#toolbox
    */
  var toolbox: js.UndefOr[js.Object] = js.native
  /**
    * Tooltip component.
    * It can be configured on different places:
    * + Configured on global: `tooltip`
    * + Configured in a coordinate system: `grid.tooltip`,
    *   `polar.tooltip`, `single.tooltip`
    * + Configured in a series: `series.tooltip`
    * + Configured in each item of `series.data`: `series.data.tooltip`
    *
    * @see https://echarts.apache.org/en/option.html#tooltip
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  /**
    * Whether to use UTC in display.
    * - `true`: When `axis.type` is `'time'`, ticks is determined
    *   according to UTC, and `axisLabel` and `tooltip` use UTC by default.
    * - `false`: When `axis.type` is `'time'`, ticks is determined
    *   according to local time, and `axisLabel` and `tooltip` use local time
    *   by default.
    *
    * The default value of useUTC is false, for sake of considering:
    * - In many cases, labels should be displayed in local time
    *   (whether the time is stored in server in local time or UTC).
    * - If user uses time string (like '2012-01-02') in data,
    * it usually means local time if time zone is not specified.
    * Time should be displayed in its original time zone by default.
    *
    * Notice: the setting only effects 'display time', but not 'parse time'.
    * About how time value (like `1491339540396`, `'2013-01-04'`, ...)
    * is parsed in echarts, see `the time part in date`.
    *
    * @see https://echarts.apache.org/en/option.html#useUTC
    */
  var useUTC: js.UndefOr[Boolean] = js.native
  /**
    * `visualMap` is a type of component for visual encoding,
    * which maps the data to visual channels, including:
    * + symbol: Type of symbol.
    * + symbolSize: Symbol size.
    * + color: Symbol color.
    * + colorAlpha: Symbol alpha channel.
    * + opacity: Opacity of symbol and others (like labels).
    * + colorLightness: Lightness in HSL.
    * + colorSaturation: Saturation in HSL.
    * + colorHue: Hue in HSL.
    * Myltiple `visualMap` component could be defined in a chart instance,
    * which enable that different dimensions
    * of a series data are mapped to different visual channels.
    * `visualMap` could be defined as `Piecewise (visualMapPiecewise)`
    * or `Continuous (visualMapContinuous)`,
    * which is distinguished by the property type.
    *
    * @example
    * option = {
    *   visualMap: [
    *       { // the first visualMap component
    *           type: 'continuous', // defined to be continuous viusalMap
    *           ...
    *       },
    *       { // the sencond visualMap component
    *           type: 'piecewise', // defined to be piecewise visualMap
    *           ...
    *       }
    *   ],
    *   ...
    * };
    *
    * @see https://echarts.apache.org/en/option.html#visualMap
    */
  var visualMap: js.UndefOr[js.Array[typings.echarts.echarts.EChartOption.VisualMap]] = js.native
  /**
    * The x axis in cartesian(rectangular) coordinate.
    * Usually a single grid component can place at most 2 x axis,
    * one on the bottom and another on the top.
    * offset can be used to avoid overlap when you need to put more
    * than two x axis.
    *
    * @see https://echarts.apache.org/en/option.html#xAxis
    */
  var xAxis: js.UndefOr[XAxis | js.Array[XAxis]] = js.native
  /**
    * The y axis in cartesian(rectangular) coordinate.
    * Usually a single grid component can place at most 2 y axis,
    * one on the left and another on the right. offset can be used
    * to avoid overlap when you need to put more than two y axis.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis
    */
  var yAxis: js.UndefOr[YAxis | js.Array[YAxis]] = js.native
}

object EChartOption_ {
  @scala.inline
  def apply[TSeries](): EChartOption_[TSeries] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartOption_[TSeries]]
  }
  @scala.inline
  implicit class EChartOption_Ops[Self <: EChartOption_[_], TSeries] (val x: Self with EChartOption_[TSeries]) extends AnyVal {
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
    def setAngleAxis(value: js.Object): Self = this.set("angleAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngleAxis: Self = this.set("angleAxis", js.undefined)
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationDelay(value: Double | js.Function): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    @scala.inline
    def setAnimationDelayUpdate(value: Double | js.Function): Self = this.set("animationDelayUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelayUpdate: Self = this.set("animationDelayUpdate", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationDurationUpdate(value: Double | js.Function): Self = this.set("animationDurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDurationUpdate: Self = this.set("animationDurationUpdate", js.undefined)
    @scala.inline
    def setAnimationEasing(value: String): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    @scala.inline
    def setAnimationEasingUpdate(value: String): Self = this.set("animationEasingUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasingUpdate: Self = this.set("animationEasingUpdate", js.undefined)
    @scala.inline
    def setAnimationThreshold(value: Double): Self = this.set("animationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationThreshold: Self = this.set("animationThreshold", js.undefined)
    @scala.inline
    def setAria(value: js.Object): Self = this.set("aria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    @scala.inline
    def setAxisPointer(value: AxisPointer): Self = this.set("axisPointer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisPointer: Self = this.set("axisPointer", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBlendMode(value: String): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendMode: Self = this.set("blendMode", js.undefined)
    @scala.inline
    def setBrush(value: js.Object): Self = this.set("brush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrush: Self = this.set("brush", js.undefined)
    @scala.inline
    def setCalendarVarargs(value: Calendar*): Self = this.set("calendar", js.Array(value :_*))
    @scala.inline
    def setCalendar(value: Calendar | js.Array[Calendar]): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setColorVarargs(value: String*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: js.Array[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDataZoomVarargs(value: DataZoom*): Self = this.set("dataZoom", js.Array(value :_*))
    @scala.inline
    def setDataZoom(value: js.Array[DataZoom]): Self = this.set("dataZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataZoom: Self = this.set("dataZoom", js.undefined)
    @scala.inline
    def setDatasetVarargs(value: Dataset*): Self = this.set("dataset", js.Array(value :_*))
    @scala.inline
    def setDataset(value: Dataset | js.Array[Dataset]): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    @scala.inline
    def setGeo(value: js.Object): Self = this.set("geo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    @scala.inline
    def setGraphicVarargs(value: js.Object*): Self = this.set("graphic", js.Array(value :_*))
    @scala.inline
    def setGraphic(value: js.Object | js.Array[js.Object]): Self = this.set("graphic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphic: Self = this.set("graphic", js.undefined)
    @scala.inline
    def setGridVarargs(value: Grid*): Self = this.set("grid", js.Array(value :_*))
    @scala.inline
    def setGrid(value: Grid | js.Array[Grid]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHoverLayerThreshold(value: Double): Self = this.set("hoverLayerThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverLayerThreshold: Self = this.set("hoverLayerThreshold", js.undefined)
    @scala.inline
    def setLegend(value: Legend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setParallel(value: js.Object): Self = this.set("parallel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    @scala.inline
    def setParallelAxis(value: js.Object): Self = this.set("parallelAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallelAxis: Self = this.set("parallelAxis", js.undefined)
    @scala.inline
    def setPolar(value: js.Object): Self = this.set("polar", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolar: Self = this.set("polar", js.undefined)
    @scala.inline
    def setProgressive(value: Double): Self = this.set("progressive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressive: Self = this.set("progressive", js.undefined)
    @scala.inline
    def setProgressiveThreshold(value: Double): Self = this.set("progressiveThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressiveThreshold: Self = this.set("progressiveThreshold", js.undefined)
    @scala.inline
    def setRadar(value: js.Object): Self = this.set("radar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadar: Self = this.set("radar", js.undefined)
    @scala.inline
    def setRadiusAxis(value: js.Object): Self = this.set("radiusAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusAxis: Self = this.set("radiusAxis", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: TSeries*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[TSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSingleAxisVarargs(value: SingleAxis*): Self = this.set("singleAxis", js.Array(value :_*))
    @scala.inline
    def setSingleAxis(value: SingleAxis | js.Array[SingleAxis]): Self = this.set("singleAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleAxis: Self = this.set("singleAxis", js.undefined)
    @scala.inline
    def setTextStyle(value: BaseTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setTimeline(value: js.Object): Self = this.set("timeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeline: Self = this.set("timeline", js.undefined)
    @scala.inline
    def setTitleVarargs(value: EChartTitleOption*): Self = this.set("title", js.Array(value :_*))
    @scala.inline
    def setTitle(value: EChartTitleOption | js.Array[EChartTitleOption]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToolbox(value: js.Object): Self = this.set("toolbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbox: Self = this.set("toolbox", js.undefined)
    @scala.inline
    def setTooltip(value: Tooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setUseUTC(value: Boolean): Self = this.set("useUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseUTC: Self = this.set("useUTC", js.undefined)
    @scala.inline
    def setVisualMapVarargs(value: typings.echarts.echarts.EChartOption.VisualMap*): Self = this.set("visualMap", js.Array(value :_*))
    @scala.inline
    def setVisualMap(value: js.Array[typings.echarts.echarts.EChartOption.VisualMap]): Self = this.set("visualMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisualMap: Self = this.set("visualMap", js.undefined)
    @scala.inline
    def setXAxisVarargs(value: XAxis*): Self = this.set("xAxis", js.Array(value :_*))
    @scala.inline
    def setXAxis(value: XAxis | js.Array[XAxis]): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    @scala.inline
    def setYAxisVarargs(value: YAxis*): Self = this.set("yAxis", js.Array(value :_*))
    @scala.inline
    def setYAxis(value: YAxis | js.Array[YAxis]): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
  
}

