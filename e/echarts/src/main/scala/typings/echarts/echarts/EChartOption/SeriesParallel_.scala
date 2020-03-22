package typings.echarts.echarts.EChartOption

import typings.echarts.AnonExtraCssText
import typings.echarts.AnonLineStyleAnonShadowBlur
import typings.echarts.AnonShadowBlur
import typings.echarts.echarts.EChartOption.SeriesParallel.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The series in parallel coordinate system.
  *
  * * * *
  *
  * **Introduction about Parallel coordinates**
  *
  * [Parallel Coordinates](https://en.wikipedia.org/wiki/Parallel_coordinates)
  * is a common way of visualizing high-dimensional geometry and analyzing
  * multivariate data.
  *
  * For example,
  * [series-parallel.data](https://echarts.apache.org/en/option.html#series-parallel.data)
  * is the following data:
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-parallel)
  *
  * In data above, each row is a "data item", and each column represents
  * a "dimension".
  * For example, the meanings of columns above are: "data", "AQI", "PM2.5",
  * "PM10", "carbon monoxide level", "nitrogen dioxide level", and "sulfur
  * dioxide level".
  *
  * Parallel coordinates are much used to visualize multi-dimension data
  * shown above.
  * Each axis represents a dimension (namely, a column), and each line
  * represents a data item.
  * Data can be brush-selected on axes. For example:
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-parallel)
  *
  * * * *
  *
  * **Brief about Configuration**
  *
  * Basic configuration parallel coordinates is shown as follow:
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-parallel)
  *
  * Three components are involved here:
  * [parallel](https://echarts.apache.org/en/option.html#parallel)
  * ,
  * [parallelAxis](https://echarts.apache.org/en/option.html#parallelAxis)
  * ,
  * [series-parallel](https://echarts.apache.org/en/option.html#series-parallel)
  *
  * + [parallel](https://echarts.apache.org/en/option.html#parallel)
  *
  * This component is the coordinate system.
  * One or more series (like "Beijing", "Shanghai", and "Guangzhou" in
  * the above example) can share one coordinate system.
  *
  * Like other coordinate systems, multiple parallel coordinate systems
  * can be created in one echarts instance.
  *
  * Position setting is also carried out here.
  *
  * + [parallelAxis](https://echarts.apache.org/en/option.html#parallelAxis)
  *
  * This is axis configuration.
  * Multiple axes are needed in parallel coordinates.
  *
  * [parallelAxis.parallelIndex](https://echarts.apache.org/en/option.html#parallelAxis.parallelIndex)
  * is used to specify which coordinate system this axis belongs to.
  * The first coordinate system is used by default.
  *
  * + [series-parallel](https://echarts.apache.org/en/option.html#series-parallel)
  *
  * This is the definition of parallel series, which will be drawn on
  * parallel coordinate system.
  *
  * [parallelAxis.parallelIndex](https://echarts.apache.org/en/option.html#parallelAxis.parallelIndex)
  * is used to specify which coordinate system this axis belongs to.
  * The first coordinate system is used by default.
  *
  * * * *
  *
  * **Notes and Best Practices**
  *
  * When configuring multiple
  * [parallelAxis](https://echarts.apache.org/en/option.html#parallelAxis)
  * , there might be some common attributes in each axis configuration.
  * To avoid writing them repeatly, they can be put under
  * [parallel.parallelAxisDefault](https://echarts.apache.org/en/option.html#parallel.parallelAxisDefault)
  * . Before initializing axis, configurations in
  * [parallel.parallelAxisDefault](https://echarts.apache.org/en/option.html#parallel.parallelAxisDefault)
  * will be merged into
  * [parallelAxis](https://echarts.apache.org/en/option.html#parallelAxis)
  * to generate the final axis configuration.
  *
  * **If data is too large and cause bad performance**
  *
  * It is suggested to set
  * [series-parallel.lineStyle.width](https://echarts.apache.org/en/option.html#series-parallel.lineStyle.width)
  * to be `0.5`
  * (or less), which may improve performance significantly.
  *
  * * * *
  *
  * **Display High-Dimension Data**
  *
  * When dimension number is extremely large, say, more than 50 dimensions,
  * there will be more than 50 axes, which may hardly display in a page.
  *
  * In this case, you may use
  * [parallel.axisExpandable](https://echarts.apache.org/en/option.html#parallel.axisExpandable)
  * to improve the display. See this example:
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-parallel)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-parallel
  */
trait SeriesParallel_ extends js.Object {
  /**
    * When perform brush selection, the selected lines will be set
    * as this transparency rate (which could highlight those lines).
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-parallel.activeOpacity
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-parallel.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-parallel.parallel)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-parallel.parallel)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-parallel.parallel)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-parallel.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-parallel.parallel)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-parallel.animationDurationUpdate
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
    * "linear"
    * @see https://echarts.apache.org/en/option.html#series-parallel.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-parallel.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-parallel.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'parallel'`
    *
    * Use parallel coordinates, with
    * [parallelIndex](https://echarts.apache.org/en/option.html#series-parallel.parallelIndex)
    * to assign the corresponding parallel coordinate components.
    *
    *
    * @default
    * "parallel"
    * @see https://echarts.apache.org/en/option.html#series-parallel.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.undefined
  /**
    * For example,
    * [series-parallel.data](https://echarts.apache.org/en/option.html#series-parallel.data)
    * is the following data:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-parallel.parallel)
    *
    * In data above, each row is a "data item", and each column represents
    * a "dimension".
    * For example, the meanings of columns above are: "data", "AQI",
    * "PM2.5",
    * "PM10", "carbon monoxide level", "nitrogen dioxide level", and
    * "sulfur dioxide level".
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.data
    */
  var data: js.UndefOr[
    js.Array[(js.Array[Double | String | DataObject]) | DataObject | Double | String]
  ] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-parallel.emphasis
    */
  var emphasis: js.UndefOr[AnonLineStyleAnonShadowBlur] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * When perform brush selection, the unselected lines will be set
    * as this transparency rate (which could darken those lines).
    *
    *
    * @default
    * 0.05
    * @see https://echarts.apache.org/en/option.html#series-parallel.inactiveOpacity
    */
  var inactiveOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [parallel coordinates](https://echarts.apache.org/en/option.html#parallel)
    * to combine with, which is useful for multiple parallel axes in
    * one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.parallelIndex
    */
  var parallelIndex: js.UndefOr[Double] = js.undefined
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
    * 500
    * @see https://echarts.apache.org/en/option.html#series-parallel.progressive
    */
  var progressive: js.UndefOr[Double] = js.undefined
  /**
    * Chunk approach, optional values:
    *
    * + `'sequential'`: slice data by data index.
    * + `'mod'`: slice data by mod, which make the data items of each
    * chunk coming from all over the data, bringing better visual effect
    * while progressive rendering.
    *
    *
    * @default
    * "sequential"
    * @see https://echarts.apache.org/en/option.html#series-parallel.progressiveChunkMode
    */
  var progressiveChunkMode: js.UndefOr[String] = js.undefined
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 3000
    * @see https://echarts.apache.org/en/option.html#series-parallel.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Whether to update view in realtime.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-parallel.realtime
    */
  var realtime: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to smooth the line.
    * It defaults to be `false` and can be set as `true` or the values
    * from 0 to 1 which indicating the smoothness.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.smooth
    */
  var smooth: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * @default
    * "parallel"
    * @see https://echarts.apache.org/en/option.html#series-parallel.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * `z` value of all graghical elements in parallel, which controls
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
    * @see https://echarts.apache.org/en/option.html#series-parallel.z
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in parallel.
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
    * @see https://echarts.apache.org/en/option.html#series-parallel.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesParallel_ {
  @scala.inline
  def apply(
    activeOpacity: Int | Double = null,
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: js.Function | Double = null,
    animationDelayUpdate: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationDurationUpdate: js.Function | Double = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: Int | Double = null,
    coordinateSystem: String = null,
    data: js.Array[(js.Array[Double | String | DataObject]) | DataObject | Double | String] = null,
    emphasis: AnonLineStyleAnonShadowBlur = null,
    id: String = null,
    inactiveOpacity: Int | Double = null,
    lineStyle: AnonShadowBlur = null,
    name: String = null,
    parallelIndex: Int | Double = null,
    progressive: Int | Double = null,
    progressiveChunkMode: String = null,
    progressiveThreshold: Int | Double = null,
    realtime: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    smooth: Boolean | Double = null,
    tooltip: AnonExtraCssText = null,
    `type`: String = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SeriesParallel_ = {
    val __obj = js.Dynamic.literal()
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inactiveOpacity != null) __obj.updateDynamic("inactiveOpacity")(inactiveOpacity.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parallelIndex != null) __obj.updateDynamic("parallelIndex")(parallelIndex.asInstanceOf[js.Any])
    if (progressive != null) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    if (progressiveChunkMode != null) __obj.updateDynamic("progressiveChunkMode")(progressiveChunkMode.asInstanceOf[js.Any])
    if (progressiveThreshold != null) __obj.updateDynamic("progressiveThreshold")(progressiveThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesParallel_]
  }
}

