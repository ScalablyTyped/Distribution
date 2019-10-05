package typings.echarts.echarts.EChartOption

import typings.echarts.Anon_Arguments
import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BorderColorBorderType
import typings.echarts.Anon_ItemStyleAnonBorderColorBorderType
import typings.echarts.echarts.EChartOption.SeriesCustom.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **custom series**
  *
  * `custom series` supports customizing graphic elements, and then generate
  * more types of charts.
  *
  * echarts manages the creation, deletion, animation and interaction
  * with other components (like
  * [dataZoom](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom)
  * 、
  * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
  * ), which frees developers from handle those issue themselves.
  *
  * **For example, a "x-range" chart is made by custom sereis:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom)
  *
  * **
  * [More samples of custom series](https://ecomfe.github.io/echarts-examples/public/index.html#chart-type-custom)
  * **
  *
  * **
  * [A tutotial of custom series](https://ecomfe.github.io/echarts-doc/public/en/tutorial.html#Custom%20Series)
  * **
  *
  * **Customize the render logic (in renderItem method)**
  *
  * `custom series` requires developers to write a render logic by themselves.
  * This render logic is called
  * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
  * .
  *
  * For example:
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom)
  *
  * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
  * will be called on each data item.
  *
  * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
  * provides two parameters:
  *
  * + [params](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.params)
  * : provides info about the current series and data and coordinate
  * system.
  * + [api](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api)
  * : includes some methods.
  *
  * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
  * method should returns graphic elements definitions.See
  * [renderItem.return](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return)
  * .
  *
  * Generally, the main process of
  * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
  * is that retrieve value from data and convert them to graphic elements
  * on the current coordinate system. Two methods in
  * [renderItem.arguments.api](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api)
  * are always used in this procedure:
  *
  * + [api.value(...)](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.value)
  * is used to retrieve value from data.
  * For example, `api.value(0)`
  * retrieve the value of the first dimension in the current data item.
  * + [api.coord(...)](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.coord)
  * is used to convert data to coordinate.
  * For example, `var point = api.coord([api.value(0),
  * api.value(1)])`
  * converet the data to the point on the current coordinate system.
  *
  * Sometimes
  * [api.size(...)](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.size)
  * method is needed, which calculates the size on the coordinate system
  * by a given data range.
  *
  * Moreover,
  * [api.style(...)](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.style)
  * method can be used to set style.
  * It provides not only the style settings specified in
  * [series.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.itemStyle)
  * , but also the result of visual mapping.
  * This method can also be called like `api.style({fill:
  * 'green', stroke: 'yellow'})` to override those style settings.
  *
  * **Dimension mapping (by encode and dimension option)**
  *
  * In most cases,
  * [series.encode](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.encode)
  * is needed to be specified when using `custom series` serise, which
  * indicate the mapping of dimensions, and then echarts can render appropriate
  * axis by the extent of those data.
  *
  * `encode.tooltip`
  * and `encode.label`
  * can also be specified to define the content of default `tooltip`
  * and `label`.
  * [series.dimensions](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.dimensions)
  * can also be specified to defined names of each dimensions, which
  * will be displayed in tooltip.
  *
  * For example:
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom)
  *
  * **Controlled by dataZoom**
  *
  * When use `custom series` with
  * [dataZoom](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom)
  * ,
  * [dataZoom.filterMode](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom.filterMode)
  * usually be set as `'weakFilter'`, which prevent `dataItem` from being
  * filtered when only part of its dimensions are out of the current
  * data window.
  *
  * **Difference between `dataIndex` and `dataIndexInside`**
  *
  * + `dataIndex` is the index of a `dataItem` in the original data.
  * + `dataIndexInside` is the index of a `dataItem` in the current data
  * window (see
  * [dataZoom](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom)
  * .
  *
  * [renderItem.arguments.api](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api)
  * uses `dataIndexInside` as the input parameter but not `dataIndex`,
  * because conversion from `dataIndex` to `dataIndexInside` is time-consuming.
  *
  * **Event listener**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom
  */
@JSName("SeriesCustom")
trait SeriesCustom_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.animationDurationUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.animationEasingUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [calendar coordinates](https://ecomfe.github.io/echarts-doc/public/en/option.html#calendar)
    * to combine with, which is useful for multiple calendar coordinates
    * in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.calendarIndex
    */
  var calendarIndex: js.UndefOr[Double] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `null` or `'none'`
    *
    * No coordinate.
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.xAxisIndex)
    * and
    * [yAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'polar'`
    *
    * Use polar coordinates, with
    * [polarIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.polarIndex)
    * to assign the corresponding polar coordinate component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    * + `'none'`
    *
    * Do not use coordinate system.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data
    */
  var data: js.UndefOr[
    js.Array[
      (js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.datasetIndex
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleAnonBorderColorBorderType] = js.undefined
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.encode
    */
  var encode: js.UndefOr[js.Object] = js.undefined
  /**
    * Index of
    * [geographic coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [polar coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#polar)
    * to combine with, which is useful for multiple polar axes in one
    * chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.polarIndex
    */
  var polarIndex: js.UndefOr[Double] = js.undefined
  /**
    * `custom series` requires developers to write a render logic by
    * themselves. This render logic is called
    * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
    * .
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom)
    *
    * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
    * will be called on each data item.
    *
    * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
    * provides two parameters:
    *
    * + [params](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.params)
    * : provides info about the current series and data and coordinate
    * system.
    * + [api](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api)
    * : includes some methods.
    *
    * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
    * method should returns graphic elements definitions.See
    * [renderItem.return](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return)
    * .
    *
    * Generally, the main process of
    * [renderItem](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem)
    * is that retrieve value from data and convert them to graphic
    * elements on the current coordinate system. Two methods in
    * [renderItem.arguments.api](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api)
    * are always used in this procedure:
    *
    * + [api.value(...)](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.value)
    * is used to retrieve value from data.
    * For example, `api.value(0)`
    * retrieve the value of the first dimension in the current data
    * item.
    * + [api.coord(...)](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.coord)
    * is used to convert data to coordinate.
    * For example, `var point = api.coord([api.value(0),
    * api.value(1)])`
    * converet the data to the point on the current coordinate system.
    *
    * Sometimes
    * [api.size(...)](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.size)
    * method is needed, which calculates the size on the coordinate
    * system by a given data range.
    *
    * Moreover,
    * [api.style(...)](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.style)
    * method can be used to set style.
    * It provides not only the style settings specified in
    * [series.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.itemStyle)
    * , but also the result of visual mapping.
    * This method can also be called like `api.style({fill:
    * 'green', stroke: 'yellow'})` to override those style settings.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem
    */
  var renderItem: js.UndefOr[Anon_Arguments] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * @default
    * "custom"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [x axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [y axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * `z` value of all graghical elements in custom series, which controls
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.z
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in custom series.
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesCustom_ {
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
    data: js.Array[
      (js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit
    ] = null,
    datasetIndex: Int | Double = null,
    dimensions: js.Array[_] = null,
    emphasis: Anon_ItemStyleAnonBorderColorBorderType = null,
    encode: js.Object = null,
    geoIndex: Int | Double = null,
    id: String = null,
    itemStyle: Anon_BorderColorBorderType = null,
    legendHoverLink: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    polarIndex: Int | Double = null,
    renderItem: Anon_Arguments = null,
    seriesLayoutBy: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    tooltip: Anon_BackgroundColorBorderColor = null,
    `type`: String = null,
    xAxisIndex: Int | Double = null,
    yAxisIndex: Int | Double = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SeriesCustom_ = {
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
    if (data != null) __obj.updateDynamic("data")(data)
    if (datasetIndex != null) __obj.updateDynamic("datasetIndex")(datasetIndex.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (geoIndex != null) __obj.updateDynamic("geoIndex")(geoIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (!js.isUndefined(legendHoverLink)) __obj.updateDynamic("legendHoverLink")(legendHoverLink)
    if (name != null) __obj.updateDynamic("name")(name)
    if (polarIndex != null) __obj.updateDynamic("polarIndex")(polarIndex.asInstanceOf[js.Any])
    if (renderItem != null) __obj.updateDynamic("renderItem")(renderItem)
    if (seriesLayoutBy != null) __obj.updateDynamic("seriesLayoutBy")(seriesLayoutBy)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesCustom_]
  }
}

