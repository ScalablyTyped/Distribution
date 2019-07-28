package typings.echarts.echartsNs.EChartOptionNs

import typings.echarts.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily
import typings.echarts.Anon_AnimationAnimationDelay
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdate
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDuration
import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BorderColorBorderTypeBorderWidthColor
import typings.echarts.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor
import typings.echarts.echartsNs.EChartOptionNs.SeriesScatterNs.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scatter (bubble) chart . The scatter chart in
  * [rectangular coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#grid)
  * could be used to present the relation between `x` and `y`.
  * If data have multiple dimensions, the values of the other dimensions
  * can be visualized through
  * [symbol](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.symbol)
  * with various sizes and colors, which becomes a bubble chart.
  * These can be done by using with
  * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
  * component.
  *
  * It could be used with
  * [rectangular coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#grid)
  * and
  * [polar coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#polar)
  * and
  * [geographical coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
  * .
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter
  */
trait SeriesScatter extends Series {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.animationEasingUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [calendar coordinates](https://ecomfe.github.io/echarts-doc/public/en/option.html#calendar)
    * to combine with, which is useful for multiple calendar coordinates
    * in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.calendarIndex
    */
  var calendarIndex: js.UndefOr[Double] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.xAxisIndex)
    * and
    * [yAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'polar'`
    *
    * Use polar coordinates, with
    * [polarIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.polarIndex)
    * to assign the corresponding polar coordinate component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-bar.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.undefined
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.cursor
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * Data array of series, which can be in the following forms:
    *
    * Notice, if no `data` specified in series, and there is
    * [dataset](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset)
    * in option, series will use the first
    * [dataset](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset)
    * as its datasource. If `data` has been specified,
    * [dataset](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset)
    * will not used.
    *
    * `series.datasetIndex` can be used to specify other
    * [dataset](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset)
    * .
    *
    * Basically, data is represented by a two-dimension array, like
    * the example below, where each colum is named as a "dimension".
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    * + In
    * [cartesian (grid)](https://ecomfe.github.io/echarts-doc/public/en/option.html#grid)
    * , "dimX" and "dimY" correspond to
    * [xAxis](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis)
    * and
    * [yAxis](https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis)
    * repectively.
    * + In
    * [polar](https://ecomfe.github.io/echarts-doc/public/en/option.html#polar)
    * "dimX" and "dimY" correspond to
    * [radiusAxis](https://ecomfe.github.io/echarts-doc/public/en/option.html#radiusAxis)
    * 和
    * [angleAxis](https://ecomfe.github.io/echarts-doc/public/en/option.html#anbleAxis)
    * repectively.
    * + Other dimensions are optional, which can be used in other place.
    * For example:
    * + [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
    * can map one or more dimensions to viusal (color, symbol size
    * ...).
    * + [series.symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.symbolSize)
    * can be set as a callback function, where symbol size can be calculated
    * by values of a certain dimension.
    * + Values in other dimensions can be shown by
    * [tooltip.formatter](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip.formatter)
    * or
    * [series.label.formatter](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.label.formatter)
    * .
    *
    * Especially, when there is one and only one category axis (axis.type
    * is `'category'`), data can be simply be represented by a one-dimension
    * array, like:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    * **Relationship between "value" and
    * [axis.type](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis.type)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    * There is an example of double category axes:
    * [Github Punchcard](https://ecomfe.github.io/echarts-examples/public/editor.html?c=scatter-punchCard)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.data
    */
  var data: js.UndefOr[
    js.Array[
      (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
    ]
  ] = js.undefined
  /**
    * If
    * [series.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.data)
    * is not specified, and
    * [dataset](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset)
    * exists, the series will use `dataset`.
    * `datasetIndex` specifies which dataset will be used.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor] = js.undefined
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.encode
    */
  var encode: js.UndefOr[js.Object] = js.undefined
  /**
    * Index of
    * [geographic coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.undefined
  /**
    * Whether to enable the animation effect when mouse is on the symbol.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderTypeBorderWidthColor] = js.undefined
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.label
    */
  var label: js.UndefOr[
    Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily
  ] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.large
    */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * The threshold enabling the drawing optimization.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.largeThreshold
    */
  var largeThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markArea
    */
  var markArea: js.UndefOr[Anon_AnimationAnimationDelayAnimationDelayUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markLine
    */
  var markLine: js.UndefOr[Anon_AnimationAnimationDelay] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.markPoint
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [polar coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#polar)
    * to combine with, which is useful for multiple polar axes in one
    * chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.polarIndex
    */
  var polarIndex: js.UndefOr[Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.progressive
    */
  var progressive: js.UndefOr[Double] = js.undefined
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 3000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[Double] = js.undefined
  /**
    * When
    * [dataset](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataset)
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
    * [example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=dataset-series-layout-by)
    * .
    *
    *
    * @default
    * "column"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.scatter)
    *
    *
    * @default
    * "circle"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
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
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.data)
    * , and the second parameter `params` is the rest parameters of
    * data item.
    *
    *
    * @default
    * 10
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * @default
    * "scatter"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [x axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [y axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * `z` value of all graghical elements in scatter chart, which controls
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.z
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in scatter chart.
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-scatter.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesScatter {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: js.Function | Double = null,
    animationDelayUpdate: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationDurationUpdate: js.Function | Double = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: Int | Double = null,
    calendarIndex: Int | Double = null,
    coordinateSystem: String = null,
    cursor: String = null,
    data: js.Array[
      (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
    ] = null,
    datasetIndex: Int | Double = null,
    dimensions: js.Array[_] = null,
    emphasis: Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor = null,
    encode: js.Object = null,
    geoIndex: Int | Double = null,
    hoverAnimation: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemStyle: Anon_BorderColorBorderTypeBorderWidthColor = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily = null,
    large: js.UndefOr[Boolean] = js.undefined,
    largeThreshold: Int | Double = null,
    legendHoverLink: js.UndefOr[Boolean] = js.undefined,
    markArea: Anon_AnimationAnimationDelayAnimationDelayUpdate = null,
    markLine: Anon_AnimationAnimationDelay = null,
    markPoint: Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDuration = null,
    name: String = null,
    polarIndex: Int | Double = null,
    progressive: Int | Double = null,
    progressiveThreshold: Int | Double = null,
    seriesLayoutBy: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    symbol: String = null,
    symbolKeepAspect: js.UndefOr[Boolean] = js.undefined,
    symbolOffset: js.Array[_] = null,
    symbolRotate: Int | Double = null,
    symbolSize: js.Array[_] | js.Function | Double = null,
    tooltip: Anon_BackgroundColorBorderColor = null,
    `type`: String = null,
    xAxisIndex: Int | Double = null,
    yAxisIndex: Int | Double = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SeriesScatter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate)
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (calendarIndex != null) __obj.updateDynamic("calendarIndex")(calendarIndex.asInstanceOf[js.Any])
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (data != null) __obj.updateDynamic("data")(data)
    if (datasetIndex != null) __obj.updateDynamic("datasetIndex")(datasetIndex.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (geoIndex != null) __obj.updateDynamic("geoIndex")(geoIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverAnimation)) __obj.updateDynamic("hoverAnimation")(hoverAnimation)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (largeThreshold != null) __obj.updateDynamic("largeThreshold")(largeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(legendHoverLink)) __obj.updateDynamic("legendHoverLink")(legendHoverLink)
    if (markArea != null) __obj.updateDynamic("markArea")(markArea)
    if (markLine != null) __obj.updateDynamic("markLine")(markLine)
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (polarIndex != null) __obj.updateDynamic("polarIndex")(polarIndex.asInstanceOf[js.Any])
    if (progressive != null) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    if (progressiveThreshold != null) __obj.updateDynamic("progressiveThreshold")(progressiveThreshold.asInstanceOf[js.Any])
    if (seriesLayoutBy != null) __obj.updateDynamic("seriesLayoutBy")(seriesLayoutBy)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect)
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset)
    if (symbolRotate != null) __obj.updateDynamic("symbolRotate")(symbolRotate.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesScatter]
  }
}

