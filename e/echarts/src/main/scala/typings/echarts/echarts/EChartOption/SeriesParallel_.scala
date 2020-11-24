package typings.echarts.echarts.EChartOption

import typings.echarts.anon.ShadowBlur
import typings.echarts.anon.`16`
import typings.echarts.echarts.EChartOption.SeriesParallel.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
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
  var activeOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-parallel.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  
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
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  
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
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  
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
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  
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
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.native
  
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
  var animationEasing: js.UndefOr[String] = js.native
  
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-parallel.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.native
  
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
  var animationThreshold: js.UndefOr[Double] = js.native
  
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
  var coordinateSystem: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-parallel.emphasis
    */
  var emphasis: js.UndefOr[`16`] = js.native
  
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.id
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * When perform brush selection, the unselected lines will be set
    * as this transparency rate (which could darken those lines).
    *
    *
    * @default
    * 0.05
    * @see https://echarts.apache.org/en/option.html#series-parallel.inactiveOpacity
    */
  var inactiveOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
  
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
  var name: js.UndefOr[String] = js.native
  
  /**
    * Index of
    * [parallel coordinates](https://echarts.apache.org/en/option.html#parallel)
    * to combine with, which is useful for multiple parallel axes in
    * one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.parallelIndex
    */
  var parallelIndex: js.UndefOr[Double] = js.native
  
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
  var progressive: js.UndefOr[Double] = js.native
  
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
  var progressiveChunkMode: js.UndefOr[String] = js.native
  
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 3000
    * @see https://echarts.apache.org/en/option.html#series-parallel.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Whether to update view in realtime.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-parallel.realtime
    */
  var realtime: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to smooth the line.
    * It defaults to be `false` and can be set as `true` or the values
    * from 0 to 1 which indicating the smoothness.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.smooth
    */
  var smooth: js.UndefOr[Boolean | Double] = js.native
  
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-parallel.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  
  /**
    * @default
    * "parallel"
    * @see https://echarts.apache.org/en/option.html#series-parallel.type
    */
  var `type`: js.UndefOr[String] = js.native
  
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
  var z: js.UndefOr[Double] = js.native
  
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
  var zlevel: js.UndefOr[Double] = js.native
}
object SeriesParallel_ {
  
  @scala.inline
  def apply(): SeriesParallel_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesParallel_]
  }
  
  @scala.inline
  implicit class SeriesParallel_Ops[Self <: SeriesParallel_] (val x: Self) extends AnyVal {
    
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
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationDelay(value: js.Function | Double): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    
    @scala.inline
    def setAnimationDelayUpdate(value: js.Function | Double): Self = this.set("animationDelayUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDelayUpdate: Self = this.set("animationDelayUpdate", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: js.Function | Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationDurationUpdate(value: js.Function | Double): Self = this.set("animationDurationUpdate", value.asInstanceOf[js.Any])
    
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
    def setCoordinateSystem(value: String): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinateSystem: Self = this.set("coordinateSystem", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ((js.Array[Double | String | DataObject]) | DataObject | Double | String)*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[(js.Array[Double | String | DataObject]) | DataObject | Double | String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEmphasis(value: `16`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInactiveOpacity(value: Double): Self = this.set("inactiveOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveOpacity: Self = this.set("inactiveOpacity", js.undefined)
    
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParallelIndex(value: Double): Self = this.set("parallelIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelIndex: Self = this.set("parallelIndex", js.undefined)
    
    @scala.inline
    def setProgressive(value: Double): Self = this.set("progressive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressive: Self = this.set("progressive", js.undefined)
    
    @scala.inline
    def setProgressiveChunkMode(value: String): Self = this.set("progressiveChunkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressiveChunkMode: Self = this.set("progressiveChunkMode", js.undefined)
    
    @scala.inline
    def setProgressiveThreshold(value: Double): Self = this.set("progressiveThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressiveThreshold: Self = this.set("progressiveThreshold", js.undefined)
    
    @scala.inline
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean | Double): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    
    @scala.inline
    def setZlevel(value: Double): Self = this.set("zlevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZlevel: Self = this.set("zlevel", js.undefined)
  }
}
