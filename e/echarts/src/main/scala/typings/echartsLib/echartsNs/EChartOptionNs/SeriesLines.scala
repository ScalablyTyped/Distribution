package typings
package echartsLib.echartsNs.EChartOptionNs

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
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines
  */
trait SeriesLines extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.lines)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.lines)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.lines)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.lines)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.xAxisIndex)
    * and
    * [yAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    *
    * @default
    * "geo"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The data set of lines.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data
    */
  var data: js.UndefOr[js.Array[echartsLib.echartsNs.EChartOptionNs.SeriesLinesNs.DataObject]] = js.undefined
  /**
    * The setting about special effect of lines.
    *
    * **Tips:** All the graphs with trail effect should be put on a
    * individual layer, which means that
    * [zlevel](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.zlevel)
    * need to be different with others. And the animation (
    * [animation](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.animation)
    * : false) of this layer is suggested to be turned off at the meanwhile.
    * Otherwise, other graphic elements in other series and the
    * [label](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.label)
    * of animation would produce unnecessary ghosts.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.effect
    */
  var effect: js.UndefOr[echartsLib.Anon_Delay] = js.undefined
  /**
    * Emphasis style.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_LineStyleLabelAnonShadowOffsetXShadowBlurColorShadowColor] = js.undefined
  /**
    * Index of
    * [geographic coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.geoIndex
    */
  var geoIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label settings. Does not work when
    * [polyline](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.polyline)
    * is `true`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_ShadowOffsetXBackgroundColorShowAlignTextBorderWidthVerticalAlignShadowBlurHeightBorderWidth
  ] = js.undefined
  /**
    * Whether to enable the optimization of large-scale lines graph.
    * It could be enabled when there is a particularly large number
    * of data(>=5k) .
    *
    * After being enabled,
    * [largeThreshold](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.largeThreshold)
    * can be used to indicate the minimum number for turning on the
    * optimization.
    *
    * The style of a single data item can't be customized
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.large
    */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The threshold enabling the drawing optimization.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.largeThreshold
    */
  var largeThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.lineStyle
    */
  var lineStyle: js.UndefOr[echartsLib.Anon_ShadowOffsetXShadowBlurColorShadowColorOpacityShadowOffsetYType] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.markArea
    */
  var markArea: js.UndefOr[echartsLib.Anon_SilentDataLabel] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.markLine
    */
  var markLine: js.UndefOr[echartsLib.Anon_PrecisionSilent] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.markPoint
    */
  var markPoint: js.UndefOr[echartsLib.Anon_SilentDataLabelAnimationEasingUpdate] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If draw as polyline.
    *
    * Default to be `false`. Can only draw a two end straight line.
    *
    * If it is set true,
    * [data.coords](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.data.coords)
    * can have more than two coord to draw a polyline.
    * It is useful when visualizing GPS track data. See example
    * [lines-bus](https://ecomfe.github.io/echarts-examples/public/editor.html?c=lines-bmap-bus)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.polyline
    */
  var polyline: js.UndefOr[scala.Boolean] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.progressive
    */
  var progressive: js.UndefOr[scala.Double] = js.undefined
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 3000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.silent
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Symbol type at the two ends of the line.
    * It can be an array for two ends, or assigned seperately. See
    * [data.symbol](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-line.markLine.data.0.symbol)
    * for more format information.
    *
    *
    * @default
    * "none"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * @default
    * "lines"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Index of
    * [x axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Index of
    * [y axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[scala.Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.z
    */
  var z: js.UndefOr[scala.Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-lines.zlevel
    */
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

