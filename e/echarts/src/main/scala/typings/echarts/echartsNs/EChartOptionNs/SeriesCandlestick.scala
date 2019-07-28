package typings.echarts.echartsNs.EChartOptionNs

import typings.echarts.Anon_AnimationAnimationDelay
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdate
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDuration
import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BorderColorBorderColor0
import typings.echarts.Anon_ItemStyleAnonBorderColorBorderColor0BorderWidth
import typings.echarts.echartsNs.EChartOptionNs.SeriesCandlestickNs.DataObject
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
  * [series.type](https://ecomfe.github.io/echarts-doc/public/en/option.html#(series.type)
  * (`'k'` would automatically turns into `'candlestick'`).
  *
  * **An example:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick)
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
  * + [series-candlestick.itemStyle.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.itemStyle.color)
  * : fill color for bullish candle stick (namely, increase)
  * + [series-candlestick.itemStyle.color0](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.itemStyle.color0)
  * : fill color for bearish candle stick (namely, decrease)
  * + [series-candlestick.itemStyle.borderColor](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.itemStyle.borderColor)
  * : border color for bullish candle stick (namely, increase)
  * + [series-candlestick.itemStyle.borderColor0](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-candlestick.itemStyle.borderColor0)
  * : border color for bearish candle stick (namely, decrease)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick
  */
trait SeriesCandlestick extends Series {
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "linear"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Specify bar max width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.barMaxWidth
    */
  var barMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Specify bar min width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.barMinWidth
    */
  var barMinWidth: js.UndefOr[Double] = js.undefined
  /**
    * Specify bar width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.barWidth
    */
  var barWidth: js.UndefOr[Double] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-cartesian2d.xAxisIndex)
    * and
    * [yAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-cartesian2d.yAxisIndex)
    * to assign the corresponding axis component.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.undefined
  /**
    * Data should be the two-dimensional array shown as follow.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick)
    *
    * Every data item (each line in the example above) represents a
    * box, which contains 4 values. They are:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.data
    */
  var data: js.UndefOr[js.Array[js.Array[Double | DataObject]]] = js.undefined
  /**
    * `dimensions` can be used to define dimension info for `series.data`
    * or `dataset.source`.
    *
    * Notice: if
    * [dataset](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset)
    * is used, we can provide dimension names in the first column/row
    * of
    * [dataset.source](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset.source)
    * , and not need to specify `dimensions` here.
    * But if `dimensions` is specified here, echarts will not retrieve
    * dimension names from the first row/column of `dataset.source`
    * any more.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick)
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick)
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
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.data)
    * to check the format of time value.
    * + displayName: `string`, generally used in tooltip for dimension
    * display. If not specified, use `name` by default.
    *
    * When `dimensions` is specified, the default `tooltip` will be
    * displayed vertically, which is better to show diemsion names.
    * Otherwise, `tooltip` will displayed only value horizontally.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Emphasis style of candlestick.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleAnonBorderColorBorderColor0BorderWidth] = js.undefined
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick)
    *
    * Attributes of encode are different according to the type of coordinate
    * systtems. For
    * [cartesian2d](https://ecomfe.github.io/echarts-doc/public/en/option.html#grid)
    * , `x` and `y` can be defined. For
    * [polar](https://ecomfe.github.io/echarts-doc/public/en/option.html#polar)
    * , `radius` and `angle` can be defined. For
    * [geo](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * , `lng` and `lat` can be defined.
    * Attribute `tooltip` and `itemName` (data item name in tooltip)
    * are always able to be defined.
    *
    * When
    * [dimensions](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.dimensions)
    * is used to defined name for a certain dimension, `encode` can
    * refer the name directly. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.candlestick)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.encode
    */
  var encode: js.UndefOr[js.Object] = js.undefined
  /**
    * Whether to enable animitation when hovering on box.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Item style of candlestick.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderColor0] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.large
    */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * The threshold enabling the drawing optimization.
    *
    *
    * @default
    * 600
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.largeThreshold
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.layout
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markArea
    */
  var markArea: js.UndefOr[Anon_AnimationAnimationDelayAnimationDelayUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markLine
    */
  var markLine: js.UndefOr[Anon_AnimationAnimationDelay] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.markPoint
    */
  var markPoint: js.UndefOr[Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDuration] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.name
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.progressive
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.progressiveChunkMode
    */
  var progressiveChunkMode: js.UndefOr[String] = js.undefined
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 10000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * @default
    * "candlestick"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [x axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [y axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.yAxisIndex
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.z
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-candlestick.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesCandlestick {
  @scala.inline
  def apply(
    animationDelay: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationEasing: String = null,
    barMaxWidth: Int | Double = null,
    barMinWidth: Int | Double = null,
    barWidth: Int | Double = null,
    coordinateSystem: String = null,
    data: js.Array[js.Array[Double | DataObject]] = null,
    dimensions: js.Array[_] = null,
    emphasis: Anon_ItemStyleAnonBorderColorBorderColor0BorderWidth = null,
    encode: js.Object = null,
    hoverAnimation: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemStyle: Anon_BorderColorBorderColor0 = null,
    large: js.UndefOr[Boolean] = js.undefined,
    largeThreshold: Int | Double = null,
    layout: String = null,
    legendHoverLink: js.UndefOr[Boolean] = js.undefined,
    markArea: Anon_AnimationAnimationDelayAnimationDelayUpdate = null,
    markLine: Anon_AnimationAnimationDelay = null,
    markPoint: Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDuration = null,
    name: String = null,
    progressive: Int | Double = null,
    progressiveChunkMode: String = null,
    progressiveThreshold: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    tooltip: Anon_BackgroundColorBorderColor = null,
    `type`: String = null,
    xAxisIndex: Int | Double = null,
    yAxisIndex: Int | Double = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SeriesCandlestick = {
    val __obj = js.Dynamic.literal()
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (barMaxWidth != null) __obj.updateDynamic("barMaxWidth")(barMaxWidth.asInstanceOf[js.Any])
    if (barMinWidth != null) __obj.updateDynamic("barMinWidth")(barMinWidth.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (!js.isUndefined(hoverAnimation)) __obj.updateDynamic("hoverAnimation")(hoverAnimation)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (largeThreshold != null) __obj.updateDynamic("largeThreshold")(largeThreshold.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (!js.isUndefined(legendHoverLink)) __obj.updateDynamic("legendHoverLink")(legendHoverLink)
    if (markArea != null) __obj.updateDynamic("markArea")(markArea)
    if (markLine != null) __obj.updateDynamic("markLine")(markLine)
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (progressive != null) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    if (progressiveChunkMode != null) __obj.updateDynamic("progressiveChunkMode")(progressiveChunkMode)
    if (progressiveThreshold != null) __obj.updateDynamic("progressiveThreshold")(progressiveThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesCandlestick]
  }
}

