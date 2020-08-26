package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationDelay
import typings.echarts.anon.AnimationDelayUpdate
import typings.echarts.anon.AnimationDuration
import typings.echarts.anon.BorderColor0
import typings.echarts.anon.`3`
import typings.echarts.echarts.EChartOption.SeriesCandlestick.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A
  * [candlestick](https://en.wikipedia.org/wiki/Candlestick_chart)
  * chart (also called Japanese candlestick chart) is a style of financial
  * chart used to describe price movements of a security, derivative,
  * or currency.
  *
  * ECharts3 supports both `'candlestick'` and `'k'` in
  * [series.type](https://echarts.apache.org/en/option.html#(series.type)
  * (`'k'` would automatically turns into `'candlestick'`).
  *
  * **An example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-candlestick)
  *
  * **About color of increase and decrease**
  *
  * Different countries or regions have different implications on the
  * color of candle stick chart.
  * It may use red to imply increasing with red and decreasing with blue
  * (in China mainland, Taiwan, Japan, Koera, and so on), or to imply
  * increasing with green and decreasing with red (in Europ, North America,
  * Hong Kong, Singapore, and so on).
  * Besides color, the increase and decrease of stock may also be represented
  * with candle stick with or without filling colors.
  *
  * We use red to represent increasing and blue decreasing by default.
  * If you want to change the configuration, you may change the following
  * parameters.
  *
  * + [series-candlestick.itemStyle.color](https://echarts.apache.org/en/option.html#series-candlestick.itemStyle.color)
  * : fill color for bullish candle stick (namely, increase)
  * + [series-candlestick.itemStyle.color0](https://echarts.apache.org/en/option.html#series-candlestick.itemStyle.color0)
  * : fill color for bearish candle stick (namely, decrease)
  * + [series-candlestick.itemStyle.borderColor](https://echarts.apache.org/en/option.html#series-candlestick.itemStyle.borderColor)
  * : border color for bullish candle stick (namely, increase)
  * + [series-candlestick.itemStyle.borderColor0](https://echarts.apache.org/en/option.htmlseries-candlestick.itemStyle.borderColor0)
  * : border color for bearish candle stick (namely, decrease)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-candlestick
  */
@js.native
trait SeriesCandlestick_ extends js.Object {
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-candlestick.animationDuration
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
    * "linear"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Specify bar max width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.barMaxWidth
    */
  var barMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Specify bar min width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.barMinWidth
    */
  var barMinWidth: js.UndefOr[Double] = js.native
  /**
    * Specify bar width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.barWidth
    */
  var barWidth: js.UndefOr[Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-candlestick.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.native
  /**
    * Data should be the two-dimensional array shown as follow.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    * Every data item (each line in the example above) represents a
    * box, which contains 4 values. They are:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data
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
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
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
    * @see https://echarts.apache.org/en/option.html#series-candlestick.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.native
  /**
    * Emphasis style of candlestick.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.emphasis
    */
  var emphasis: js.UndefOr[`3`] = js.native
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.encode
    */
  var encode: js.UndefOr[js.Object] = js.native
  /**
    * Whether to enable animitation when hovering on box.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Item style of candlestick.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.itemStyle
    */
  var itemStyle: js.UndefOr[BorderColor0] = js.native
  /**
    * Whether to enable the optimization of large-scale data.
    * It could be set when large data causes performance problem.
    *
    * After being enabled, `largeThreshold` can be used to indicate
    * the minimum number for turning on the optimization.
    *
    * But when the optimization enabled, the style of single data item
    * can't be customized any more.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.large
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * The threshold enabling the drawing optimization.
    *
    *
    * @default
    * 600
    * @see https://echarts.apache.org/en/option.html#series-candlestick.largeThreshold
    */
  var largeThreshold: js.UndefOr[Double] = js.native
  /**
    * Layout method, whose values may be:
    *
    * + `'horizontal'`: horizontally layout all boxs.
    *
    * + `'vertical'`: vertically layout all boxs.
    *
    * The default value is decided by:
    *
    * + if there is a `category` axis:
    * + if it is horizontal, use `'horizontal'`;
    * + otherwise use `'vertical'`;
    * + otherwise use `'horizontal'`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.layout
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
    * @see https://echarts.apache.org/en/option.html#series-candlestick.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markArea
    */
  var markArea: js.UndefOr[AnimationDelayUpdate] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markLine
    */
  var markLine: js.UndefOr[AnimationDelay] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markPoint
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
    * @see https://echarts.apache.org/en/option.html#series-candlestick.name
    */
  var name: js.UndefOr[String] = js.native
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
    * 5000
    * @see https://echarts.apache.org/en/option.html#series-candlestick.progressive
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
    * "mod"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.progressiveChunkMode
    */
  var progressiveChunkMode: js.UndefOr[String] = js.native
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 10000
    * @see https://echarts.apache.org/en/option.html#series-candlestick.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[Double] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * @default
    * "candlestick"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.native
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.native
  /**
    * `z` value of all graghical elements in candlestick, which controls
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
    * @see https://echarts.apache.org/en/option.html#series-candlestick.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graghical elements in candlestick.
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
    * @see https://echarts.apache.org/en/option.html#series-candlestick.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesCandlestick_ {
  @scala.inline
  def apply(): SeriesCandlestick_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesCandlestick_]
  }
  @scala.inline
  implicit class SeriesCandlestick_Ops[Self <: SeriesCandlestick_] (val x: Self) extends AnyVal {
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
    def setBarMaxWidth(value: Double): Self = this.set("barMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarMaxWidth: Self = this.set("barMaxWidth", js.undefined)
    @scala.inline
    def setBarMinWidth(value: Double): Self = this.set("barMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarMinWidth: Self = this.set("barMinWidth", js.undefined)
    @scala.inline
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarWidth: Self = this.set("barWidth", js.undefined)
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
    def setEmphasis(value: `3`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
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
    def setItemStyle(value: BorderColor0): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setLargeThreshold(value: Double): Self = this.set("largeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeThreshold: Self = this.set("largeThreshold", js.undefined)
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
    def setMarkLine(value: AnimationDelay): Self = this.set("markLine", value.asInstanceOf[js.Any])
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

