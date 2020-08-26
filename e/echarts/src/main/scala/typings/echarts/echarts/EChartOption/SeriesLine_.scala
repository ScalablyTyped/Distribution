package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationDelayUpdate
import typings.echarts.anon.AnimationDuration
import typings.echarts.anon.BorderRadius
import typings.echarts.anon.ColorOpacity
import typings.echarts.anon.DictunknownPropertyBorderColor
import typings.echarts.anon.Precision
import typings.echarts.anon.ShadowBlur
import typings.echarts.anon.`8`
import typings.echarts.echarts.EChartOption.SeriesLine.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **broken line chart**
  *
  * Broken line chart relates all the data points
  * [symbol](https://echarts.apache.org/en/option.html#series-line.symbol)
  * by broken lines, which is used to show the trend of data changing.
  * It could be used in both
  * [rectangular coordinate](https://echarts.apache.org/en/option.html#grid)
  * and
  * [polar coordinate](https://echarts.apache.org/en/option.html#polar)
  * .
  *
  * **Tip:** When
  * [areaStyle](https://echarts.apache.org/en/option.html#series-line.areaStyle)
  * is set, area chart will be drew.
  *
  * **Tip:** With
  * [visualMap](https://echarts.apache.org/en/option.html#visualMap-piecewise)
  * component, Broken line / area chart can have different colors on
  * different sections, as below:
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-line)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-line
  */
@js.native
trait SeriesLine_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-line.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-line.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-line.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-line.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-line.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-line.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * The style of area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle
    */
  var areaStyle: js.UndefOr[ColorOpacity] = js.native
  /**
    * Whether to clip the overflowing part, which defaults to clip.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-line.clipOverflow
    */
  var clipOverflow: js.UndefOr[Boolean] = js.native
  /**
    * Whether to connect the line across null points.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.connectNulls
    */
  var connectNulls: js.UndefOr[Boolean] = js.native
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://echarts.apache.org/en/option.html#series-bar.xAxisIndex)
    * and
    * [yAxisIndex](https://echarts.apache.org/en/option.html#series-bar.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'polar'`
    *
    * Use polar coordinates, with
    * [polarIndex](https://echarts.apache.org/en/option.html#series-bar.polarIndex)
    * to assign the corresponding polar coordinate component.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://echarts.apache.org/en/option.html#series-line.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.native
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://echarts.apache.org/en/option.html#series-line.cursor
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Data array of series, which can be in the following forms:
    *
    * Notice, if no `data` specified in series, and there is
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * in option, series will use the first
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * as its datasource. If `data` has been specified,
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * will not used.
    *
    * `series.datasetIndex` can be used to specify other
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * .
    *
    * Basically, data is represented by a two-dimension array, like
    * the example below, where each colum is named as a "dimension".
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * + In
    * [cartesian (grid)](https://echarts.apache.org/en/option.html#grid)
    * , "dimX" and "dimY" correspond to
    * [xAxis](https://echarts.apache.org/en/option.html#xAxis)
    * and
    * [yAxis](https://echarts.apache.org/en/option.html#yAxis)
    * repectively.
    * + In
    * [polar](https://echarts.apache.org/en/option.html#polar)
    * "dimX" and "dimY" correspond to
    * [radiusAxis](https://echarts.apache.org/en/option.html#radiusAxis)
    * 和
    * [angleAxis](https://echarts.apache.org/en/option.html#anbleAxis)
    * repectively.
    * + Other dimensions are optional, which can be used in other place.
    * For example:
    * + [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * can map one or more dimensions to viusal (color, symbol size
    * ...).
    * + [series.symbolSize](https://echarts.apache.org/en/option.html#series.symbolSize)
    * can be set as a callback function, where symbol size can be calculated
    * by values of a certain dimension.
    * + Values in other dimensions can be shown by
    * [tooltip.formatter](https://echarts.apache.org/en/option.html#tooltip.formatter)
    * or
    * [series.label.formatter](https://echarts.apache.org/en/option.html#series.label.formatter)
    * .
    *
    * Especially, when there is one and only one category axis (axis.type
    * is `'category'`), data can be simply be represented by a one-dimension
    * array, like:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * **Relationship between "value" and
    * [axis.type](https://echarts.apache.org/en/option.html#xAxis.type)
    * **
    *
    * + When a dimension corresponds to a value axis (axis.type
    * is `'value'` or `'log'`):
    *
    * The value can be a `number` (like `12`) (can also be a number
    * in a `string` format, like `'12'`).
    *
    * + When a dimension corresponds to a category axis (axis.type
    * is `'category'`):
    *
    * The value should be the ordinal of the axis.data
    * (based on `0`), the string value of the axis.data.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * There is an example of double category axes:
    * [Github Punchcard](https://echarts.apache.org/examples/en/editor.html?c=scatter-punchCard)
    * .
    *
    * + When a dimension corresponds to a time axis (type is `'time'`),
    * the value can be:
    *
    * + a timestamp, like `1484141700832`, which represents a UTC time.
    * + a date string, in one of the formats below:
    * + a subset of
    * [ISO 8601](http://www.ecma-international.org/ecma-262/5.1/#se
    * c-15.9.1.15)
    * , only including (all of these are treated as local time unless
    * timezone is specified, which is consistent with
    * [moment](https://momentjs.com/)
    * ):
    * + only part of year/month/date/time are specified: `'2012-03'`,
    * `'2012-03-01'`, `'2012-03-01 05'`, `'2012-03-01 05:06'`.
    * + separated by `"T"` or a space: `'2012-03-01T12:22:33.123'`,
    * `'2012-03-01 12:22:33.123'`.
    * + timezone specified: `'2012-03-01T12:22:33Z'`, `'2012-03-01T12:22:33+8000'`,
    * `'2012-03-01T12:22:33-05:00'`.
    * + other date string format (all of these are treated as local
    * time): `'2012'`, `'2012-3-1'`, `'2012/3/1'`, `'2012/03/01'`,
    * `'2009/6/12 2:00'`, `'2009/6/12 2:05:08'`, `'2009/6/12 2:05:08.123'`.
    * + a JavaScript Date instance created by user:
    * + Caution, when using a data string to create a Date instance,
    * [browser differences and inconsistencies](http://dygraphs.com/date-formats.html)
    * should be considered.
    * + For example: In chrome, `new Date('2012-01-01')` is treated
    * as a Jan 1st 2012 in UTC, while `new Date('2012-1-1')` and `new
    * Date('2012/01/01')` are treated as Jan 1st 2012 in local timezone.
    * In safari `new Date('2012-1-1')` is not supported.
    * + So if you intent to perform `new Date(dateString)`, it is strongly
    * recommended to use a time parse library (e.g.,
    * [moment](https://momentjs.com/)
    * ), or use `echarts.number.parseDate`, or check
    * [this](http://dygraphs.com/date-formats.html)
    * .
    *
    * **Customize a data item:**
    *
    * When needing to customize a data item, it can be set as an object,
    * where property `value` reprensent real value. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * **Empty value:**
    *
    * `'-'` or `null` or `undefined` or `NaN` can be used to describe
    * that a data item is not exists (ps：_not exist_ does not means
    * its value is `0`).
    *
    * For example, line chart can break when encounter an empty value,
    * and scatter chart do not display graphic elements for empty values.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.data
    */
  var data: js.UndefOr[
    js.Array[
      (js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit
    ]
  ] = js.native
  /**
    * If
    * [series.data](https://echarts.apache.org/en/option.html#series.data)
    * is not specified, and
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * exists, the series will use `dataset`.
    * `datasetIndex` specifies which dataset will be used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.native
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
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
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
    * @see https://echarts.apache.org/en/option.html#series-line.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.native
  /**
    * 图形的高亮样式。
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.emphasis
    */
  var emphasis: js.UndefOr[`8`] = js.native
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.encode
    */
  var encode: js.UndefOr[js.Object] = js.native
  /**
    * Whether to enable the animation effect when mouse is on the symbol.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-line.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The style of the symbol point of broken line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.itemStyle
    */
  var itemStyle: js.UndefOr[DictunknownPropertyBorderColor] = js.native
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.label
    */
  var label: js.UndefOr[BorderRadius] = js.native
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-line.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  /**
    * Line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markArea
    */
  var markArea: js.UndefOr[AnimationDelayUpdate] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markLine
    */
  var markLine: js.UndefOr[Precision] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.markPoint
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
    * @see https://echarts.apache.org/en/option.html#series-line.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Index of
    * [polar coordinate](https://echarts.apache.org/en/option.html#polar)
    * to combine with, which is useful for multiple polar axes in one
    * chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.polarIndex
    */
  var polarIndex: js.UndefOr[Double] = js.native
  /**
    * The dowmsampling strategy used when the data size is much larger
    * than pixel size.
    * It will improve the performance when turned on.
    * Defaults to be turned off, indicating that all the data points
    * will be drawn.
    *
    * Options:
    *
    * + `'average'` Use average value of filter points
    * + `'max'` Use maximum value of filter points
    * + `'min'` Use minimum value of filter points
    * + `'sum'` Use sum of filter points
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.sampling
    */
  var sampling: js.UndefOr[String] = js.native
  /**
    * When
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * is used, `seriesLayoutBy` specifies whether the column or the
    * row of `dataset` is mapped to the series, namely, the series
    * is "layout" on columns or rows. Optional values:
    *
    * + 'column': by default, the columns of `dataset` are mapped the
    * series. In this case, each column represents a dimension.
    * + 'row'：the rows of `dataset` are mapped to the series.
    * In this case, each row represents a dimension.
    *
    * Check this
    * [example](https://echarts.apache.org/examples/en/editor.html?c=dataset-series-layout-by)
    * .
    *
    *
    * @default
    * "column"
    * @see https://echarts.apache.org/en/option.html#series-line.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.native
  /**
    * Only work when main axis is `'category'` axis (`axis.type`
    * is `'category'`). Optional values:
    *
    * + `'auto'`: Default value.
    * Show all symbols if there is enough space.
    * Otherwise follow the interval strategy with with
    * [axisLabel.interval](https://echarts.apache.org/en/option.html#xAxis.axisLabel.interval)
    * .
    * + `true`: Show all symbols.
    * + `false`: Follow the interval strategy with
    * [axisLabel.interval](https://echarts.apache.org/en/option.html#xAxis.axisLabel.interval)
    * .
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-line.showAllSymbol
    */
  var showAllSymbol: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show symbol.
    * It would be shown during tooltip hover.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-line.showSymbol
    */
  var showSymbol: js.UndefOr[Boolean] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show as smooth curve.
    *
    * If is typed in `boolean`, then it means whether to enable smoothing.
    * If is typed in `number`, valued from 0 to 1, then it means smoothness.
    * A smaller value makes it less smooth.
    *
    * Please refer to
    * [smoothMonotone](https://echarts.apache.org/en/option.html#series-line.smoothMonotone)
    * to change smoothing algorithm.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.smooth
    */
  var smooth: js.UndefOr[Boolean | Double] = js.native
  /**
    * Whether the broken line keep the monotonicity when it is smoothed.
    * It can be set as `'x'`, `'y'` to keep the monotonicity on x axis
    * or y axis.
    * Or it can be set to be `'none'` to use non-monotone smoothing
    * algorithm.
    *
    * From ECharts 4.0.3,
    * we improved our default smoothing algorithm.
    * The old algorithm can be used by setting `smoothMonotone` to
    * be `'none'`.
    * Here's the difference between old and new algorithm.
    * In the following chart, old algorithm is in green color, and
    * new algorithm is in red color.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * The old algorithm has many problems:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * Old algorithm uses the previous and next point to form control
    * points' direction, while they are always horizontal (when the
    * first dimension of data is monotone) or vertical (when the second
    * dimension of data is monotone) in new algorithm.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * But new algorithm doesn't work with non-monotone data.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * So we suggest that default value of `smoothMonotone` be used
    * in most situations.
    * If data on Y axis is monotone, it should be set to be `'y'`.
    * If data is non-monotone, it should be set to be `'none'` to use
    * the old algorithm.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.smoothMonotone
    */
  var smoothMonotone: js.UndefOr[String] = js.native
  /**
    * If stack the value.
    * On the same category axis, the series with the same `stack` name
    * would be put on top of each other.
    *
    * The effect of the below example could be seen through stack switching
    * of
    * [toolbox](https://echarts.apache.org/en/option.html#toolbox)
    * on the top right corner:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.stack
    */
  var stack: js.UndefOr[String] = js.native
  /**
    * Whether to show as a step line.
    * It can be `true`, `false`.
    * Or `'start'`, `'middle'`, `'end'`.
    * Which will configure the turn point of step line.
    *
    * See the example using different `step` options:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.step
    */
  var step: js.UndefOr[Boolean | String] = js.native
  /**
    * Symbol of .
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which URL
    * is the link to an image, or `dataURI` of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    * Icons can be set to arbitrary vector path via `'path://'` in
    * ECharts.
    * As compared with raster image, vector paths prevent from jagging
    * and blurring when scaled, and have a better control over changing
    * colors.
    * Size of vectoer icon will be adapted automatically. Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line)
    *
    *
    * @default
    * "circle"
    * @see https://echarts.apache.org/en/option.html#series-line.symbol
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
  /**
    * Offset of symbol relative to original position.
    * By default, symbol will be put in the center position of data.
    * But if symbol is from user-defined vector path or image, you
    * may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to default
    * position.
    * It can be in absolute pixel value, or in relative percentage
    * value.
    *
    * For example, `[0, '50%']` means to move upside side position
    * of symbol height.
    * It can be used to make the arrow in the bottom to be at data
    * position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-line.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.native
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.native
  /**
    * symbol size.
    * It can be set to single numbers like `10`, or use an array to
    * represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    * If size of symbols needs to be different, you can set with callback
    * function in the following format:
    *
    * ```
    * (value: Array|number, params: Object) => number|Array
    *
    * ```
    *
    * The first parameter `value` is the value in
    * [data](https://echarts.apache.org/en/option.html#series-line.data)
    * , and the second parameter `params` is the rest parameters of
    * data item.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-line.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | Double] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * @default
    * "line"
    * @see https://echarts.apache.org/en/option.html#series-line.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.native
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.native
  /**
    * `z` value of all graghical elements in broken line graph, which
    * controls order of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-line.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graghical elements in broken line graph.
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
    * @see https://echarts.apache.org/en/option.html#series-line.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesLine_ {
  @scala.inline
  def apply(): SeriesLine_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLine_]
  }
  @scala.inline
  implicit class SeriesLine_Ops[Self <: SeriesLine_] (val x: Self) extends AnyVal {
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
    def setAreaStyle(value: ColorOpacity): Self = this.set("areaStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaStyle: Self = this.set("areaStyle", js.undefined)
    @scala.inline
    def setClipOverflow(value: Boolean): Self = this.set("clipOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipOverflow: Self = this.set("clipOverflow", js.undefined)
    @scala.inline
    def setConnectNulls(value: Boolean): Self = this.set("connectNulls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectNulls: Self = this.set("connectNulls", js.undefined)
    @scala.inline
    def setCoordinateSystem(value: String): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinateSystem: Self = this.set("coordinateSystem", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDataVarargs(value: ((js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(
      value: js.Array[
          (js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit
        ]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatasetIndex(value: Double): Self = this.set("datasetIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetIndex: Self = this.set("datasetIndex", js.undefined)
    @scala.inline
    def setDimensionsVarargs(value: js.Any*): Self = this.set("dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[_]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setEmphasis(value: `8`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
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
    def setItemStyle(value: DictunknownPropertyBorderColor): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: BorderRadius): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLegendHoverLink(value: Boolean): Self = this.set("legendHoverLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendHoverLink: Self = this.set("legendHoverLink", js.undefined)
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setMarkArea(value: AnimationDelayUpdate): Self = this.set("markArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkArea: Self = this.set("markArea", js.undefined)
    @scala.inline
    def setMarkLine(value: Precision): Self = this.set("markLine", value.asInstanceOf[js.Any])
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
    def setPolarIndex(value: Double): Self = this.set("polarIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolarIndex: Self = this.set("polarIndex", js.undefined)
    @scala.inline
    def setSampling(value: String): Self = this.set("sampling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampling: Self = this.set("sampling", js.undefined)
    @scala.inline
    def setSeriesLayoutBy(value: String): Self = this.set("seriesLayoutBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesLayoutBy: Self = this.set("seriesLayoutBy", js.undefined)
    @scala.inline
    def setShowAllSymbol(value: Boolean): Self = this.set("showAllSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAllSymbol: Self = this.set("showAllSymbol", js.undefined)
    @scala.inline
    def setShowSymbol(value: Boolean): Self = this.set("showSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSymbol: Self = this.set("showSymbol", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSmooth(value: Boolean | Double): Self = this.set("smooth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    @scala.inline
    def setSmoothMonotone(value: String): Self = this.set("smoothMonotone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothMonotone: Self = this.set("smoothMonotone", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setStep(value: Boolean | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setSymbolKeepAspect(value: Boolean): Self = this.set("symbolKeepAspect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolKeepAspect: Self = this.set("symbolKeepAspect", js.undefined)
    @scala.inline
    def setSymbolOffsetVarargs(value: js.Any*): Self = this.set("symbolOffset", js.Array(value :_*))
    @scala.inline
    def setSymbolOffset(value: js.Array[_]): Self = this.set("symbolOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolOffset: Self = this.set("symbolOffset", js.undefined)
    @scala.inline
    def setSymbolRotate(value: Double): Self = this.set("symbolRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolRotate: Self = this.set("symbolRotate", js.undefined)
    @scala.inline
    def setSymbolSizeVarargs(value: js.Any*): Self = this.set("symbolSize", js.Array(value :_*))
    @scala.inline
    def setSymbolSize(value: js.Array[_] | js.Function | Double): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
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

