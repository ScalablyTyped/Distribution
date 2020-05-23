package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationDelay
import typings.echarts.anon.AnimationDelayUpdate
import typings.echarts.anon.AnimationDuration
import typings.echarts.anon.BorderColor0
import typings.echarts.anon.ExtraCssText
import typings.echarts.anon.ItemStyleBorderColor0
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
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
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
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
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
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Specify bar max width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.barMaxWidth
    */
  var barMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Specify bar min width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.barMinWidth
    */
  var barMinWidth: js.UndefOr[Double] = js.undefined
  /**
    * Specify bar width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.barWidth
    */
  var barWidth: js.UndefOr[Double] = js.undefined
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
  var coordinateSystem: js.UndefOr[String] = js.undefined
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
  var data: js.UndefOr[js.Array[js.Array[Double | DataObject]]] = js.undefined
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
  var dimensions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Emphasis style of candlestick.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.emphasis
    */
  var emphasis: js.UndefOr[ItemStyleBorderColor0] = js.undefined
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
  var encode: js.UndefOr[js.Object] = js.undefined
  /**
    * Whether to enable animitation when hovering on box.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Item style of candlestick.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.itemStyle
    */
  var itemStyle: js.UndefOr[BorderColor0] = js.undefined
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
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * The threshold enabling the drawing optimization.
    *
    *
    * @default
    * 600
    * @see https://echarts.apache.org/en/option.html#series-candlestick.largeThreshold
    */
  var largeThreshold: js.UndefOr[Double] = js.undefined
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
  var layout: js.UndefOr[String] = js.undefined
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
  var legendHoverLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markArea
    */
  var markArea: js.UndefOr[AnimationDelayUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markLine
    */
  var markLine: js.UndefOr[AnimationDelay] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markPoint
    */
  var markPoint: js.UndefOr[AnimationDuration] = js.undefined
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
  var name: js.UndefOr[String] = js.undefined
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
    * "mod"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.progressiveChunkMode
    */
  var progressiveChunkMode: js.UndefOr[String] = js.undefined
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 10000
    * @see https://echarts.apache.org/en/option.html#series-candlestick.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.tooltip
    */
  var tooltip: js.UndefOr[ExtraCssText] = js.undefined
  /**
    * @default
    * "candlestick"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.undefined
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
  var z: js.UndefOr[Double] = js.undefined
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
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesCandlestick_ {
  @scala.inline
  def apply(
    animationDelay: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationEasing: String = null,
    barMaxWidth: js.UndefOr[Double] = js.undefined,
    barMinWidth: js.UndefOr[Double] = js.undefined,
    barWidth: js.UndefOr[Double] = js.undefined,
    coordinateSystem: String = null,
    data: js.Array[js.Array[Double | DataObject]] = null,
    dimensions: js.Array[_] = null,
    emphasis: ItemStyleBorderColor0 = null,
    encode: js.Object = null,
    hoverAnimation: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemStyle: BorderColor0 = null,
    large: js.UndefOr[Boolean] = js.undefined,
    largeThreshold: js.UndefOr[Double] = js.undefined,
    layout: String = null,
    legendHoverLink: js.UndefOr[Boolean] = js.undefined,
    markArea: AnimationDelayUpdate = null,
    markLine: AnimationDelay = null,
    markPoint: AnimationDuration = null,
    name: String = null,
    progressive: js.UndefOr[Double] = js.undefined,
    progressiveChunkMode: String = null,
    progressiveThreshold: js.UndefOr[Double] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    tooltip: ExtraCssText = null,
    `type`: String = null,
    xAxisIndex: js.UndefOr[Double] = js.undefined,
    yAxisIndex: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined,
    zlevel: js.UndefOr[Double] = js.undefined
  ): SeriesCandlestick_ = {
    val __obj = js.Dynamic.literal()
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(barMaxWidth)) __obj.updateDynamic("barMaxWidth")(barMaxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barMinWidth)) __obj.updateDynamic("barMinWidth")(barMinWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barWidth)) __obj.updateDynamic("barWidth")(barWidth.get.asInstanceOf[js.Any])
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverAnimation)) __obj.updateDynamic("hoverAnimation")(hoverAnimation.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.get.asInstanceOf[js.Any])
    if (!js.isUndefined(largeThreshold)) __obj.updateDynamic("largeThreshold")(largeThreshold.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(legendHoverLink)) __obj.updateDynamic("legendHoverLink")(legendHoverLink.get.asInstanceOf[js.Any])
    if (markArea != null) __obj.updateDynamic("markArea")(markArea.asInstanceOf[js.Any])
    if (markLine != null) __obj.updateDynamic("markLine")(markLine.asInstanceOf[js.Any])
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive.get.asInstanceOf[js.Any])
    if (progressiveChunkMode != null) __obj.updateDynamic("progressiveChunkMode")(progressiveChunkMode.asInstanceOf[js.Any])
    if (!js.isUndefined(progressiveThreshold)) __obj.updateDynamic("progressiveThreshold")(progressiveThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisIndex)) __obj.updateDynamic("xAxisIndex")(xAxisIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisIndex)) __obj.updateDynamic("yAxisIndex")(yAxisIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zlevel)) __obj.updateDynamic("zlevel")(zlevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesCandlestick_]
  }
}

