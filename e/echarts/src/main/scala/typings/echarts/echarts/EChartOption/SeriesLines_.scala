package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationEasing
import typings.echarts.anon.AnimationEasingUpdate
import typings.echarts.anon.AnimationThreshold
import typings.echarts.anon.ConstantSpeed
import typings.echarts.anon.FontSize
import typings.echarts.anon.LabelFontSize
import typings.echarts.anon.ShadowColor
import typings.echarts.echarts.EChartOption.SeriesLines.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Lines graph**
  *
  * It is used to draw the line data with the information about "from"
  * and "to"; and it is applied fot drawing the air routes on map, which
  * visualizes these routes.
  *
  * ECharts 2.x
  * uses the `markLine` to draw the migrating effect, while in ECharts
  * 3, the `lines` graph is recommended to be used.
  *
  * **Migrating example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-lines)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-lines
  */
trait SeriesLines_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-lines.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-lines.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-lines.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-lines.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-lines.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-lines.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://echarts.apache.org/en/option.html#series-lines.xAxisIndex)
    * and
    * [yAxisIndex](https://echarts.apache.org/en/option.html#series-lines.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://echarts.apache.org/en/option.html#series-lines.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    *
    * @default
    * "geo"
    * @see https://echarts.apache.org/en/option.html#series-lines.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.undefined
  /**
    * The data set of lines.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.undefined
  /**
    * The setting about special effect of lines.
    *
    * **Tips:** All the graphs with trail effect should be put on a
    * individual layer, which means that
    * [zlevel](https://echarts.apache.org/en/option.html#series-lines.zlevel)
    * need to be different with others. And the animation (
    * [animation](https://echarts.apache.org/en/option.html#series-lines.animation)
    * : false) of this layer is suggested to be turned off at the meanwhile.
    * Otherwise, other graphic elements in other series and the
    * [label](https://echarts.apache.org/en/option.html#series-lines.label)
    * of animation would produce unnecessary ghosts.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect
    */
  var effect: js.UndefOr[ConstantSpeed] = js.undefined
  /**
    * Emphasis style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis
    */
  var emphasis: js.UndefOr[LabelFontSize] = js.undefined
  /**
    * Index of
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Label settings. Does not work when
    * [polyline](https://echarts.apache.org/en/option.html#series-lines.polyline)
    * is `true`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.label
    */
  var label: js.UndefOr[FontSize] = js.undefined
  /**
    * Whether to enable the optimization of large-scale lines graph.
    * It could be enabled when there is a particularly large number
    * of data(>=5k) .
    *
    * After being enabled,
    * [largeThreshold](https://echarts.apache.org/en/option.html#series-lines.largeThreshold)
    * can be used to indicate the minimum number for turning on the
    * optimization.
    *
    * The style of a single data item can't be customized
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-lines.large
    */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * The threshold enabling the drawing optimization.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-lines.largeThreshold
    */
  var largeThreshold: js.UndefOr[Double] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.markArea
    */
  var markArea: js.UndefOr[AnimationThreshold] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.markLine
    */
  var markLine: js.UndefOr[AnimationEasingUpdate] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.markPoint
    */
  var markPoint: js.UndefOr[AnimationEasing] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * If draw as polyline.
    *
    * Default to be `false`. Can only draw a two end straight line.
    *
    * If it is set true,
    * [data.coords](https://echarts.apache.org/en/option.html#series-lines.data.coords)
    * can have more than two coord to draw a polyline.
    * It is useful when visualizing GPS track data. See example
    * [lines-bus](https://echarts.apache.org/examples/en/editor.html?c=lines-bmap-bus)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.polyline
    */
  var polyline: js.UndefOr[Boolean] = js.undefined
  /**
    * `progressive` specifies the amount of graphic elements that can
    * be rendered within a frame (about 16ms) if "progressive rendering"
    * enabled.
    *
    * When data amount is from thousand to more than 10 million, it
    * will take too long time to render all of the graphic elements.
    * Since ECharts 4, "progressive rendering" is supported in its
    * workflow, which processes and renders data chunk by chunk alone
    * with each frame, avoiding to block the UI thread of the browser.
    *
    *
    * @default
    * 400
    * @see https://echarts.apache.org/en/option.html#series-lines.progressive
    */
  var progressive: js.UndefOr[Double] = js.undefined
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 3000
    * @see https://echarts.apache.org/en/option.html#series-lines.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Symbol type at the two ends of the line.
    * It can be an array for two ends, or assigned seperately. See
    * [data.symbol](https://echarts.apache.org/en/option.html#series-line.markLine.data.0.symbol)
    * for more format information.
    *
    *
    * @default
    * "none"
    * @see https://echarts.apache.org/en/option.html#series-lines.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | String] = js.undefined
  /**
    * Symbol size at the two ends of the line.
    * It can be an array for two ends, or assigned seperately.
    *
    * **Attention:** You cannot assgin width and height seperately
    * as normal `symbolSize`.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-lines.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.undefined
  /**
    * @default
    * "lines"
    * @see https://echarts.apache.org/en/option.html#series-lines.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * `z` value of all graghical elements in lines graph, which controls
    * order of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-lines.z
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in lines graph.
    *
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements (like those with
    * animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost, and
    * should be used carefully on mobile phones to avoid crash.
    *
    * Canvases with bigger `zlevel` will be placed on Canvases with
    * smaller `zlevel`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesLines_ {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: js.Function | Double = null,
    animationDelayUpdate: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationDurationUpdate: js.Function | Double = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: js.UndefOr[Double] = js.undefined,
    coordinateSystem: String = null,
    data: js.Array[DataObject] = null,
    effect: ConstantSpeed = null,
    emphasis: LabelFontSize = null,
    geoIndex: js.UndefOr[Double] = js.undefined,
    id: String = null,
    label: FontSize = null,
    large: js.UndefOr[Boolean] = js.undefined,
    largeThreshold: js.UndefOr[Double] = js.undefined,
    lineStyle: ShadowColor = null,
    markArea: AnimationThreshold = null,
    markLine: AnimationEasingUpdate = null,
    markPoint: AnimationEasing = null,
    name: String = null,
    polyline: js.UndefOr[Boolean] = js.undefined,
    progressive: js.UndefOr[Double] = js.undefined,
    progressiveThreshold: js.UndefOr[Double] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    symbol: js.Array[_] | String = null,
    symbolSize: js.Array[_] | Double = null,
    `type`: String = null,
    xAxisIndex: js.UndefOr[Double] = js.undefined,
    yAxisIndex: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined,
    zlevel: js.UndefOr[Double] = js.undefined
  ): SeriesLines_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(animationThreshold)) __obj.updateDynamic("animationThreshold")(animationThreshold.get.asInstanceOf[js.Any])
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (!js.isUndefined(geoIndex)) __obj.updateDynamic("geoIndex")(geoIndex.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.get.asInstanceOf[js.Any])
    if (!js.isUndefined(largeThreshold)) __obj.updateDynamic("largeThreshold")(largeThreshold.get.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (markArea != null) __obj.updateDynamic("markArea")(markArea.asInstanceOf[js.Any])
    if (markLine != null) __obj.updateDynamic("markLine")(markLine.asInstanceOf[js.Any])
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(polyline)) __obj.updateDynamic("polyline")(polyline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressiveThreshold)) __obj.updateDynamic("progressiveThreshold")(progressiveThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisIndex)) __obj.updateDynamic("xAxisIndex")(xAxisIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisIndex)) __obj.updateDynamic("yAxisIndex")(yAxisIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zlevel)) __obj.updateDynamic("zlevel")(zlevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLines_]
  }
}

