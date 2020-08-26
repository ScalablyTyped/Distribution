package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationDelayUpdate
import typings.echarts.anon.AnimationDuration
import typings.echarts.anon.AnimationDurationUpdate
import typings.echarts.anon.BorderType
import typings.echarts.anon.`2`
import typings.echarts.echarts.EChartOption.SeriesBoxplot.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Boxplot](https://en.wikipedia.org/wiki/Box_plot)
  * is a convenient way of graphically depicting groups of numerical
  * data through their quartiles.
  *
  * **Example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-boxplot)
  *
  * Multiple `series` can be displayed in the same coordinate system.
  * Please refer to
  * [this example](https://echarts.apache.org/examples/en/editor.html?c=boxplot-multi&edit=1&reset=1)
  * .
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-boxplot
  */
@js.native
trait SeriesBoxplot_ extends js.Object {
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot)
    *
    *
    * @default
    * 800
    * @see https://echarts.apache.org/en/option.html#series-boxplot.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "elasticOut"
    * @see https://echarts.apache.org/en/option.html#series-boxplot.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Up and bottom boundary of box width.
    * The array is in the form of `[min, max]`.
    *
    * It could be absolute value in pixel, such as `[7, 50]`, or percentage,
    * such as `['40%', '90%']`.
    * The percentage means the percentage to the maximum possible width.
    *
    *
    * @default
    * [7, 50]
    * @see https://echarts.apache.org/en/option.html#series-boxplot.boxWidth
    */
  var boxWidth: js.UndefOr[js.Array[_]] = js.native
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://echarts.apache.org/en/option.html#series-cartesian2d.xAxisIndex)
    * and
    * [yAxisIndex](https://echarts.apache.org/en/option.html#series-cartesian2d.yAxisIndex)
    * to assign the corresponding axis component.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://echarts.apache.org/en/option.html#series-boxplot.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.native
  /**
    * Data should be the two-dimensional array shown as follow.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot)
    *
    * Every data item (each line in the example above) in the two-dimensional
    * array will be rendered into a box, and each line have five values
    * as:
    *
    * ```
    * [min, Q1, median (or Q2), Q3, max]
    *
    * ```
    *
    * **Data Processing**
    *
    * ECharts doesn't contain data processing modules, so the five
    * statistic values should be calculated by yourself and then passes
    * into `boxplot`.
    *
    * However, ECharts also provide some simple
    * [raw data processing tools](https://github.com/ecomfe/echarts/tree/master/extension/dataTool)
    * . For example, this
    * [example](https://echarts.apache.org/examples/en/editor.html?c=boxplot-light-velocity&edit=1&reset=1)
    * uses `echarts.dataTool.prepareBoxplotData`
    * to proceed simple data statistics.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.data
    */
  var data: js.UndefOr[js.Array[js.Array[Double | DataObject]]] = js.native
  /**
    * `dimensions` can be used to define dimension info for `series.data`
    * or `dataset.source`.
    *
    * Notice: if
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * is used, we can provide dimension names in the first column/row
    * of
    * [dataset.source](https://echarts.apache.org/en/option.html#dataset.source)
    * , and not need to specify `dimensions` here.
    * But if `dimensions` is specified here, echarts will not retrieve
    * dimension names from the first row/column of `dataset.source`
    * any more.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot)
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot)
    *
    * Each data item of `dimensions` can be:
    *
    * + `string`, for example, `'someName'`, which equals to `{name:
    * 'someName'}`.
    * + `Object`, where the attributes can be:
    * + name: `string`.
    * + type: `string`, supports:
    * + `number`
    * + `float`, that is,
    * [Float64Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array)
    *
    * + `int`, that is,
    * [Int32Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array)
    *
    * + `ordinal`, discrete value, which represents string generally.
    * + `time`, time value, see
    * [data](https://echarts.apache.org/en/option.html#series.data)
    * to check the format of time value.
    * + displayName: `string`, generally used in tooltip for dimension
    * display. If not specified, use `name` by default.
    *
    * When `dimensions` is specified, the default `tooltip` will be
    * displayed vertically, which is better to show diemsion names.
    * Otherwise, `tooltip` will displayed only value horizontally.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-boxplot.emphasis
    */
  var emphasis: js.UndefOr[`2`] = js.native
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot)
    *
    * Attributes of encode are different according to the type of coordinate
    * systtems. For
    * [cartesian2d](https://echarts.apache.org/en/option.html#grid)
    * , `x` and `y` can be defined. For
    * [polar](https://echarts.apache.org/en/option.html#polar)
    * , `radius` and `angle` can be defined. For
    * [geo](https://echarts.apache.org/en/option.html#geo)
    * , `lng` and `lat` can be defined.
    * Attribute `tooltip` and `itemName` (data item name in tooltip)
    * are always able to be defined.
    *
    * When
    * [dimensions](https://echarts.apache.org/en/option.html#series.dimensions)
    * is used to defined name for a certain dimension, `encode` can
    * refer the name directly. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-boxplot.boxplot)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.encode
    */
  var encode: js.UndefOr[js.Object] = js.native
  /**
    * Whether to enable the animation when hovering on box.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-boxplot.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-boxplot.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * Layout methods, whose optional values are:
    *
    * + `'horizontal'`: horizontally layout all boxes.
    *
    * + `'vertical'`: vertically layout all boxes.
    *
    * The default value is decided by:
    *
    * + if there is a `category` axis:
    * + if it is horizontal, use `'horizontal'`;
    * + otherwise use `'vertical'`;
    * + otherwise use `'horizontal'`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.layout
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-boxplot.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markArea
    */
  var markArea: js.UndefOr[AnimationDelayUpdate] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine
    */
  var markLine: js.UndefOr[AnimationDurationUpdate] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markPoint
    */
  var markPoint: js.UndefOr[AnimationDuration] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * @default
    * "boxplot"
    * @see https://echarts.apache.org/en/option.html#series-boxplot.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.native
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.native
  /**
    * `z` value of all graghical elements in Box plot, which controls
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
    * @see https://echarts.apache.org/en/option.html#series-boxplot.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graghical elements in Box plot.
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
    * @see https://echarts.apache.org/en/option.html#series-boxplot.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesBoxplot_ {
  @scala.inline
  def apply(): SeriesBoxplot_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesBoxplot_]
  }
  @scala.inline
  implicit class SeriesBoxplot_Ops[Self <: SeriesBoxplot_] (val x: Self) extends AnyVal {
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
    def setAnimationDelay(value: js.Function | Double): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    @scala.inline
    def setAnimationDuration(value: js.Function | Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationEasing(value: String): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    @scala.inline
    def setBoxWidthVarargs(value: js.Any*): Self = this.set("boxWidth", js.Array(value :_*))
    @scala.inline
    def setBoxWidth(value: js.Array[_]): Self = this.set("boxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxWidth: Self = this.set("boxWidth", js.undefined)
    @scala.inline
    def setCoordinateSystem(value: String): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinateSystem: Self = this.set("coordinateSystem", js.undefined)
    @scala.inline
    def setDataVarargs(value: (js.Array[Double | DataObject])*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[Double | DataObject]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDimensionsVarargs(value: js.Any*): Self = this.set("dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[_]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setEmphasis(value: `2`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setEncode(value: js.Object): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setHoverAnimation(value: Boolean): Self = this.set("hoverAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverAnimation: Self = this.set("hoverAnimation", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLegendHoverLink(value: Boolean): Self = this.set("legendHoverLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendHoverLink: Self = this.set("legendHoverLink", js.undefined)
    @scala.inline
    def setMarkArea(value: AnimationDelayUpdate): Self = this.set("markArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkArea: Self = this.set("markArea", js.undefined)
    @scala.inline
    def setMarkLine(value: AnimationDurationUpdate): Self = this.set("markLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkLine: Self = this.set("markLine", js.undefined)
    @scala.inline
    def setMarkPoint(value: AnimationDuration): Self = this.set("markPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkPoint: Self = this.set("markPoint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setXAxisIndex(value: Double): Self = this.set("xAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisIndex: Self = this.set("xAxisIndex", js.undefined)
    @scala.inline
    def setYAxisIndex(value: Double): Self = this.set("yAxisIndex", value.asInstanceOf[js.Any])
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
  }
  
}

