package typings.echarts.echartsNs

import typings.echarts.echartsNs.EChartOptionNs.AxisPointer
import typings.echarts.echartsNs.EChartOptionNs.Calendar
import typings.echarts.echartsNs.EChartOptionNs.DataZoom
import typings.echarts.echartsNs.EChartOptionNs.Dataset
import typings.echarts.echartsNs.EChartOptionNs.Grid
import typings.echarts.echartsNs.EChartOptionNs.Legend
import typings.echarts.echartsNs.EChartOptionNs.SingleAxis
import typings.echarts.echartsNs.EChartOptionNs.TextStyle
import typings.echarts.echartsNs.EChartOptionNs.Tooltip
import typings.echarts.echartsNs.EChartOptionNs.VisualMap
import typings.echarts.echartsNs.EChartOptionNs.XAxis
import typings.echarts.echartsNs.EChartOptionNs.YAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartOption[TSeries] extends js.Object {
  /**
    * The angle axis in Polar Coordinate.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#angleAxis
    */
  var angleAxis: js.UndefOr[js.Object] = js.undefined
  /**
    * Whether to enable animation.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#animationDelay
    */
  var animationDelay: js.UndefOr[Double | js.Function] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * @example
    * animationDelayUpdate: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[Double | js.Function] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect
    *
    * @example
    * animationDuration: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#animationDuration
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect
    *
    * @example
    * animationDurationUpdate: function (idx) {
    *     // delay for later data is larger
    *     return idx * 100;
    * }
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[Double | js.Function] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at `easing effect example`.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than threshold.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * `dataset` component is published since ECharts 4.
    * `dataset` brings convenience in data management separated with styles
    * and enables data reuse by different series.
    * More importantly, is enables data encoding from data to visual,
    * which brings convenience in some scenarios.
    * More details about `dataset` can be checked in the tutorial.
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#aria
    */
  var aria: js.UndefOr[js.Object] = js.undefined
  /**
    * `axisPointer` is a tool for displaying reference line and axis value
    * under mouse pointer.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#axisPointer
    */
  var axisPointer: js.UndefOr[AxisPointer] = js.undefined
  /**
    * Background color. Defaults to have no background.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#backgroundColor
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Equal to CanvasRenderingContext2D.globalCompositeOperation
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation
    *
    */
  var blendMode: js.UndefOr[String] = js.undefined
  /**
    * `brush` is an area-selecting component, with which user can select
    * part of data from a chart to display in detail, or doing calculations
    * with them.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#brush
    */
  var brush: js.UndefOr[js.Object] = js.undefined
  /**
    * Calendar coordinates.
    * In ECharts, we are very creative to achieve the calendar chart,
    * by using the calendar coordinates
    * to achieve the calendar chart, as shown in the following example,
    * we can use calendar coordinates
    * in `heatmap`, `scatter`, `effectScatter`, and `graph`.
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#calendar
    */
  var calendar: js.UndefOr[Calendar | js.Array[Calendar]] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#color
    */
  var color: js.UndefOr[js.Array[String]] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom
    */
  var dataZoom: js.UndefOr[js.Array[DataZoom]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset
    */
  var dataset: js.UndefOr[Dataset | js.Array[Dataset]] = js.undefined
  /**
    * Geographic coorinate system component.
    * Geographic coorinate system component is used to draw maps,
    * which also supports `scatter series`, and `line series`.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#geo
    */
  var geo: js.UndefOr[js.Object] = js.undefined
  /**
    * `graphic` component enable creating graphic elements in echarts.
    * Those graphic type are supported.
    * `image`, `text`, `circle`, `sector`, `ring`, `polygon`,
    * `polyline`, `rect`, `line`, `bezierCurve`, `arc`, `group`,
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#graphic
    */
  var graphic: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined
  /**
    * Drawing grid in rectangular coordinate.
    * In a single grid, at most two X and Y axes each is allowed.
    * `Line chart`, `bar chart`, and `scatter chart (bubble chart)`
    * can be drawn in grid.
    * In ECharts 2.x, there could only be one single grid component
    * at most in a single echarts instance.
    * But in ECharts 3, there is no limitation.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#grid
    */
  var grid: js.UndefOr[Grid | js.Array[Grid]] = js.undefined
  /**
    * Threshold of if use single hover layer to optimize.
    * It is recommended that `hoverLayerThreshold` is equivalent to or less than
    * `progressiveThreshold`, otherwise hover will cause restart of progressive,
    * which is unexpected.
    * see example <echarts/test/heatmap-large.html>.
    *
    * @default 3000
    */
  var hoverLayerThreshold: js.UndefOr[Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#legend
    */
  var legend: js.UndefOr[Legend] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#parallel
    */
  var parallel: js.UndefOr[js.Object] = js.undefined
  /**
    * This component is the coordinate axis for parallel coordinate.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#parallelAxis
    */
  var parallelAxis: js.UndefOr[js.Object] = js.undefined
  /**
    * Polar coordinate can be used in scatter and line chart.
    * Every polar coordinate has an `angleAxis` and a `radiusAxis`.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#polar
    */
  var polar: js.UndefOr[js.Object] = js.undefined
  /**
    * Configuration for progressive/incremental rendering
    *
    * @default 400
    */
  var progressive: js.UndefOr[Double] = js.undefined
  /**
    * Configuration for progressive/incremental rendering
    *
    * @default 3000
    */
  var progressiveThreshold: js.UndefOr[Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#radar
    */
  var radar: js.UndefOr[js.Object] = js.undefined
  /**
    * Radial axis of polar coordinate.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#radiusAxis
    */
  var radiusAxis: js.UndefOr[js.Object] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series
    */
  var series: js.UndefOr[js.Array[TSeries]] = js.undefined
  /**
    * An axis with a single dimension. It can be used to display data
    * in one dimension.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#singleAxis
    */
  var singleAxis: js.UndefOr[SingleAxis | js.Array[SingleAxis]] = js.undefined
  /**
    * Global font style.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#textStyle
    */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  /**
    * `timeline` component, which provides functions like switching and playing
    * between multiple ECharts `options`.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#timeline
    */
  var timeline: js.UndefOr[js.Object] = js.undefined
  /**
    * Title component, including main title and subtitle.
    * In ECharts 2.x, a single instance of ECharts could contains
    * one title component at most.
    * However, in ECharts 3, there could be one or more
    * than one title components.
    * It is more useful when multiple diagrams in one instance all need titles.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#title
    */
  var title: js.UndefOr[EChartTitleOption | js.Array[EChartTitleOption]] = js.undefined
  /**
    * A group of utility tools, which includes `export`, `data view`,
    * `dynamic type switching`, `data area zooming`, and `reset`.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#toolbox
    */
  var toolbox: js.UndefOr[js.Object] = js.undefined
  /**
    * Tooltip component.
    * It can be configured on different places:
    * + Configured on global: `tooltip`
    * + Configured in a coordinate system: `grid.tooltip`,
    *   `polar.tooltip`, `single.tooltip`
    * + Configured in a series: `series.tooltip`
    * + Configured in each item of `series.data`: `series.data.tooltip`
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#useUTC
    */
  var useUTC: js.UndefOr[Boolean] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap
    */
  var visualMap: js.UndefOr[js.Array[VisualMap]] = js.undefined
  /**
    * The x axis in cartesian(rectangular) coordinate.
    * Usually a single grid component can place at most 2 x axis,
    * one on the bottom and another on the top.
    * offset can be used to avoid overlap when you need to put more
    * than two x axis.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis
    */
  var xAxis: js.UndefOr[XAxis | js.Array[XAxis]] = js.undefined
  /**
    * The y axis in cartesian(rectangular) coordinate.
    * Usually a single grid component can place at most 2 y axis,
    * one on the left and another on the right. offset can be used
    * to avoid overlap when you need to put more than two y axis.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis
    */
  var yAxis: js.UndefOr[YAxis | js.Array[YAxis]] = js.undefined
}

object EChartOption {
  @scala.inline
  def apply[TSeries](
    angleAxis: js.Object = null,
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: Double | js.Function = null,
    animationDelayUpdate: Double | js.Function = null,
    animationDuration: Int | Double = null,
    animationDurationUpdate: Double | js.Function = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: Int | Double = null,
    aria: js.Object = null,
    axisPointer: AxisPointer = null,
    backgroundColor: String = null,
    blendMode: String = null,
    brush: js.Object = null,
    calendar: Calendar | js.Array[Calendar] = null,
    color: js.Array[String] = null,
    dataZoom: js.Array[DataZoom] = null,
    dataset: Dataset | js.Array[Dataset] = null,
    geo: js.Object = null,
    graphic: js.Object | js.Array[js.Object] = null,
    grid: Grid | js.Array[Grid] = null,
    hoverLayerThreshold: Int | Double = null,
    legend: Legend = null,
    parallel: js.Object = null,
    parallelAxis: js.Object = null,
    polar: js.Object = null,
    progressive: Int | Double = null,
    progressiveThreshold: Int | Double = null,
    radar: js.Object = null,
    radiusAxis: js.Object = null,
    series: js.Array[TSeries] = null,
    singleAxis: SingleAxis | js.Array[SingleAxis] = null,
    textStyle: TextStyle = null,
    timeline: js.Object = null,
    title: EChartTitleOption | js.Array[EChartTitleOption] = null,
    toolbox: js.Object = null,
    tooltip: Tooltip = null,
    useUTC: js.UndefOr[Boolean] = js.undefined,
    visualMap: js.Array[VisualMap] = null,
    xAxis: XAxis | js.Array[XAxis] = null,
    yAxis: YAxis | js.Array[YAxis] = null
  ): EChartOption[TSeries] = {
    val __obj = js.Dynamic.literal()
    if (angleAxis != null) __obj.updateDynamic("angleAxis")(angleAxis)
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate)
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (aria != null) __obj.updateDynamic("aria")(aria)
    if (axisPointer != null) __obj.updateDynamic("axisPointer")(axisPointer)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode)
    if (brush != null) __obj.updateDynamic("brush")(brush)
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (dataZoom != null) __obj.updateDynamic("dataZoom")(dataZoom)
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo)
    if (graphic != null) __obj.updateDynamic("graphic")(graphic.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (hoverLayerThreshold != null) __obj.updateDynamic("hoverLayerThreshold")(hoverLayerThreshold.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (parallel != null) __obj.updateDynamic("parallel")(parallel)
    if (parallelAxis != null) __obj.updateDynamic("parallelAxis")(parallelAxis)
    if (polar != null) __obj.updateDynamic("polar")(polar)
    if (progressive != null) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    if (progressiveThreshold != null) __obj.updateDynamic("progressiveThreshold")(progressiveThreshold.asInstanceOf[js.Any])
    if (radar != null) __obj.updateDynamic("radar")(radar)
    if (radiusAxis != null) __obj.updateDynamic("radiusAxis")(radiusAxis)
    if (series != null) __obj.updateDynamic("series")(series)
    if (singleAxis != null) __obj.updateDynamic("singleAxis")(singleAxis.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (timeline != null) __obj.updateDynamic("timeline")(timeline)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toolbox != null) __obj.updateDynamic("toolbox")(toolbox)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC)
    if (visualMap != null) __obj.updateDynamic("visualMap")(visualMap)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartOption[TSeries]]
  }
}

