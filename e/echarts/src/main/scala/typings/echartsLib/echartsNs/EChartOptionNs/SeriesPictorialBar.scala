package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **pictorial bar chart**
  *
  * Pictorial bar chart is a type of bar chart that custimzed glyph (like
  * images,
  * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
  * ) can be used instead of rectangular bar.
  * This kind of chart is usually used in infographic.
  *
  * Pictorial bar chart can only be used in
  * [rectangular coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#grid)
  * with at least 1 category axis.
  *
  * **Example:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar)
  *
  * **Layout**
  *
  * Basically `pictoialBar` is a type of bar chart, which follows the
  * bar chart layout.
  * In `pictorialBar`, each bar is named as `reference bar`, which does
  * not be shown, but only be used as a reference for layout of pictorial
  * graphic elements.
  * Each pictorial graphic element is positioned with respect to its
  * `reference bar` according to the setting of
  * [symbolPosition](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolPosition)
  * 、
  * [symbolOffset](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolOffset)
  * .
  *
  * See the example below:
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar)
  *
  * [symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
  * is used to specify the size of graphic elements.
  *
  * See the example below:
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar)
  *
  * **Graphic types**
  *
  * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
  * can be
  *
  * Graphic elements can be set as 'repeat' or not by
  * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
  * .
  *
  * + If set as `false` (default), a single graphic element is used to
  * represent a data item.
  * + If set as `true`, a group of repeat graphic elements are used to
  * represent a data item.
  *
  * See the example below:
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar)
  *
  * Each graphic element can be basic shape (like `'circle'`, `'rect'`,
  * ...), or
  * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
  * , or image. See
  * [symbolType](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolType)
  * .
  *
  * See the example below:
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar)
  *
  * [symbolClip](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolClip)
  * can be used to clip graphic elements。
  *
  * See the example below:
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar
  */
trait SeriesPictorialBar extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationDurationUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[echartsLib.Anon_AnimationDelay] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * The bar gap of a single series, defaults to be `20%` of the category
    * gap, can be set as a fixed value.
    *
    * In a single coodinate system, this attribute is shared by multiple
    * `'bar'` series.
    * This attribute should be set on the last `'bar'` series in the
    * coodinate system, then it will be adopted by all `'bar'` series
    * in the coordinate system.
    *
    *
    * @default
    * '20%'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.barCategoryGap
    */
  var barCategoryGap: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The gap between bars between different series, is a percent value
    * like `'30%'`, which means `30%` of the bar width.
    *
    * Set barGap as `'-100%'` can overlap bars that belong to different
    * series, which is useful when making a series of bar be background.
    *
    * In a single coodinate system, this attribute is shared by multiple
    * `'bar'` series.
    * This attribute should be set on the last `'bar'` series in the
    * coodinate system, then it will be adopted by all `'bar'` series
    * in the coordinate system.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @default
    * -100%
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.barGap
    */
  var barGap: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum width of the bar. Adaptive when not specified.
    *
    * In a single coodinate system, this attribute is shared by multiple
    * `'bar'` series.
    * This attribute should be set on the last `'bar'` series in the
    * coodinate system, then it will be adopted by all `'bar'` series
    * in the coordinate system.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.barMaxWidth
    */
  var barMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum width of bar.
    * It could be used to avoid the following situation: the interaction
    * would be affected when the value of some data item is too small.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.barMinHeight
    */
  var barMinHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the bar. Adaptive when not specified.
    *
    * In a single coodinate system, this attribute is shared by multiple
    * `'bar'` series.
    * This attribute should be set on the last `'bar'` series in the
    * coodinate system, then it will be adopted by all `'bar'` series
    * in the coordinate system.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.barWidth
    */
  var barWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.xAxisIndex)
    * and
    * [yAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.yAxisIndex)
    * to assign the corresponding axis component.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.cursor
    */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data
    */
  var data: js.UndefOr[
    (js.Array[
      scala.Unit | scala.Double | java.lang.String | echartsLib.echartsNs.EChartOptionNs.SeriesPictorialBarNs.DataObject
    ]) | (js.Array[
      js.Array[
        scala.Unit | scala.Double | java.lang.String | echartsLib.echartsNs.EChartOptionNs.SeriesPictorialBarNs.DataObject
      ]
    ])
  ] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColor] = js.undefined
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.encode
    */
  var encode: js.UndefOr[js.Object] = js.undefined
  /**
    * Whether to enable hover animation.
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.hoverAnimation)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[
    echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdateAnimationThresholdBoolean
  ] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderTypeBorderWidth] = js.undefined
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily
  ] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.markArea
    */
  var markArea: js.UndefOr[echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.markLine
    */
  var markLine: js.UndefOr[echartsLib.Anon_AnimationAnimationDelay] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.markPoint
    */
  var markPoint: js.UndefOr[echartsLib.Anon_Animation] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.silent
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the type of graphic elements.
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * Example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbol)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbol)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @default
    * "circle"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbol
    */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines a bounding area availble for the graphic elements.
    * This setting gives a data, which will then be translated to a
    * coordinate on the coordinate system.
    * The coordinate specifies the bounding.
    * Namely, if `symbolBoundingData` is set, the final size (or layout)
    * of the graphic elements depend on the `symbolBoundingData`.
    *
    * When reference bar is horizontal, `symbolBoundingData` is coresponding
    * to x axis, while reference bar is vertical, `symbolBoundingData`
    * is coresponding to y axis.
    *
    * Rule:
    *
    * + If
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is not used:
    *
    * `symbolBoundingData` is the same as the size of reference bar
    * by default.
    * The size of the graphic element is detemined by `symbolBoundingData`.
    * For example, if reference bar is vertical, its data is `24`,
    * `symbolSize` is set as `[30, '50%']`, `symbolBoundingData` is
    * set as `124`, the final size of the graphic element will be `124
    * * 50% = 62`.
    * If `symbolBoundingData` is not set, the final size will be `24
    * * 50% = 12`.
    *
    * + If
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used:
    *
    * `symbolBoundingData` is the extreme value of the coordinate system.
    * `symbolBoundingData` defines a bounding area, where repeated
    * graphic elements layout according to
    * [symbolMargin](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolMargin)
    * and
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * and
    * [symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    *
    *
    * Both these settings determine the gap size of the repeated graphic
    * elements.
    *
    * `symbolBoundingData` is usually used in these cases:
    *
    * + When
    * [symbolCilp](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolClip)
    * is used:
    *
    * And a series is used to display "amont value", while another
    * series is used to display "current value".
    * `symbolBoundingData` can be used to ensure that the graphic elements
    * of these two series are at the same size.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * + When
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used:
    *
    * `symbolBoundingData` can be use to ensure the gaps of the elements
    * in different bars are the same.
    * Of cource, you can do not set `symbolBoundingData`, whose default
    * value is a stable value (extreme value of the coordinate system).
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * `symbolBoundingData` can also be an array, such as `[-40, 60]`,
    * which specifies both negative and positive symbolBoundingData.
    *
    * Check this example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolBoundingData)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolBoundingData)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolBoundingData
    */
  var symbolBoundingData: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to clip graphic elements.
    *
    * + `false`/null/undefined: The whole graphic elements represent
    * the size of value.
    * + `true`: The clipped graphic elements reperent the size of value.
    *
    * `symbolClip` is usually used in this case: both "amont value"
    * and "current value" should be displayed.
    * In this case, tow series can be used.
    * One for background, using complete graphic elements, while another
    * for current value, using clipped graphic elements.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * Notice, in the example above,
    *
    * + The same
    * [symbolBoundingData](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.pictorialBar.symbolBoundingData)
    * is used in "background series" and "current value seires", which
    * makes their graphic elements are the same size.
    * + A bigger
    * [z](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.pictorialBar.z)
    * is set on "current value series", which makes it is over "background
    * series".
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolClip)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolClip)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolClip
    */
  var symbolClip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify margin of both sides of a graphic element.
    * ("both sides" means the two sides in the direction of its value
    * axis). It works only when
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used.
    *
    * Absolute value can be used (like `20`), or percent value can
    * be used (like `'-30%'`), which is based on its
    * [symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    * .
    *
    * `symbolMargin` can be positive value or negative value, which
    * enables overlap of graphic elements when
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used.
    *
    * A `"!"` can be appended on the end of the value, like `"30%!"`
    * or `25!`, which means a extra blank will be added on the both
    * ends, otherwise the graphic elements on both ends will reach
    * the boundary by default.
    *
    * Notice:
    *
    * + When
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is `true`/`'fixed'`: The given `symbolMargin` is just a reference
    * value.
    * The final gap of graphic elements will be calculated according
    * to
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * , `symbolMargin` and
    * [symbolBoundingData](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolBoundingData)
    * .
    * + When
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is set as a number: `symbolMargin` does not work any more.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolMargin)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolMargin)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolMargin
    */
  var symbolMargin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Specify the offset of graphic element according to its original
    * position.
    * Adopting `symbolOffset` is the final step in layout, which enables
    * adjustment of graphic element position.
    *
    * A absolute value can be set (like `10`), or a percent value can
    * be set (like `'120%'`、`['55%', 23]`), which is based on its
    * [symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    * .
    *
    * For example, `[0, '-50%']` means the graphic element will be
    * adjusted upward half of the size of itself.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolOffset)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolOffset)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @default
    * [0, 0]
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Image can be used as the pattern of graphic elements.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * `symbolPatternSize` specifies the size of pattern image.
    * For example, if `symbolPatternSize` is `400`, the pattern image
    * will be displayed at the size of `400px * 400px`.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolPatternSize)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolPatternSize)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @default
    * 400
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolPatternSize
    */
  var symbolPatternSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the location of the graphic elements.
    * Optional values:
    *
    * + `'start'`: The edge of graphic element inscribes with the start
    * of the reference bar.
    * + `'end'`: The edge of graphic element inscribes with the end
    * of the reference bar.
    * + `'center'`: The graphic element is at the center of the reference
    * bar.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolPosition)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolPosition)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @default
    * "start"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolPosition
    */
  var symbolPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to repeat a graphic element. Optional values:
    *
    * + `false`/`null`/`undefined`: Do not repeat, that is, each graphic
    * element represents a data item.
    * + `true`: Repeat, that is, a group of repeated graphic elements
    * represent a data item.
    * The repeat times is calculated according to
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data)
    * .
    * + a number: Repeat, that is a group of repeated graphic elements
    * represent a data item.
    * The repeat times is always the given number.
    * + `'fixed'`: Repeat, that is a group of repeated graphic elements
    * represent a data item.
    * The repeat times is calcuated according to
    * [symbolBoundingData](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolBoundingData)
    * , that is, the repeat times has nothing to do with
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data)
    *
    *
    * The setting is useful when graphic elements are used as background.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolRepeat)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat
    */
  var symbolRepeat: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
  /**
    * When
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used, `symbolRepeatDirection` specifies the render order of
    * the repeatd graphic elements.
    * The setting is useful in these cases below:
    *
    * + If
    * [symbolMargin](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolMargin)
    * is set as a negative value, repeated elements will overlap with
    * each other.
    * `symbolRepeatDirection` can be used to specify the order of overlap.
    *
    * + If
    * [animationDelay](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationDelay)
    * or
    * [animationDelayUpdate](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationDelayUpdate)
    * is used, `symbolRepeatDirection` specifies the order of index.
    *
    * Optional values can be `'start'` and `'end'`.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeatDirection)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolRepeatDirection)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @default
    * "start"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeatDirection
    */
  var symbolRepeatDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The degree of the rotation of a graphic element.
    *
    * Notice, `symbolRotate` will not affect the position of the graphic
    * element, but just rotating by its center.
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRotate)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolRotate)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRotate
    */
  var symbolRotate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Symbol size.
    *
    * It can be set as a array, which means \[width, height\].
    * For example, `[20, 10]` means width `20` and height `10`.
    * It can also be set as a single number, like `10`, which is equivalent
    * to `[10, 10]`.
    *
    * Absolute value can be used (like `10`), or percent value can
    * be used (like `'120%'`, `['55%', 23]`).
    *
    * When percent value is used, final size of the graphic element
    * is calculated based on its
    * [reference bar](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar)
    * .
    *
    * For example, there is a reference bar based on x axis (that is,
    * it is a vertical bar), and
    * [symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    * is set as `['30%', '50%']`, the final size of its graphic elements
    * is:
    *
    * + width: `<width of reference bar> * 30%`。
    * + height:
    * + If
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used: `<height of reference bar> * 50%`.
    * + If
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is not used: `<height of reference bar> * 50%`.
    *
    * Analogously, the case that based on y axis can be obtained by
    * exchanging them.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    * , where all data items in the series will be affected by this
    * attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolSize)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar)
    *
    *
    * @default
    * ['100%', '100%']
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * @default
    * "pictorialBar"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Index of
    * [x axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Index of
    * [y axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * `z` value of all graghical elements in pictorial bar chart, which
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.z
    */
  var z: js.UndefOr[scala.Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in pictorial bar chart.
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.zlevel
    */
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

