package typings.echarts.echarts.EChartOption

import typings.echarts.anon.BorderType
import typings.echarts.anon.`2`
import typings.echarts.echarts.EChartOption.SeriesCustom.DataObject
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItem
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemApi
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemParams
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnArc
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnBezierCurve
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnCircle
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnGroup
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnImage
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnLine
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnPath
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnPolygon
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnPolyline
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnRect
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnRing
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnSector
import typings.echarts.echarts.EChartOption.SeriesCustom.RenderItemReturnText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * **custom series**
  *
  * `custom series` supports customizing graphic elements, and then generate
  * more types of charts.
  *
  * echarts manages the creation, deletion, animation and interaction
  * with other components (like
  * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
  * 、
  * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
  * ), which frees developers from handle those issue themselves.
  *
  * **For example, a "x-range" chart is made by custom sereis:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-custom)
  *
  * **
  * [More samples of custom series](https://echarts.apache.org/examples/en/index.html#chart-type-custom)
  * **
  *
  * **
  * [A tutotial of custom series](https://echarts.apache.org/en/tutorial.html#Custom%20Series)
  * **
  *
  * **Customize the render logic (in renderItem method)**
  *
  * `custom series` requires developers to write a render logic by themselves.
  * This render logic is called
  * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
  * .
  *
  * For example:
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-custom)
  *
  * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
  * will be called on each data item.
  *
  * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
  * provides two parameters:
  *
  * + [params](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.params)
  * : provides info about the current series and data and coordinate
  * system.
  * + [api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
  * : includes some methods.
  *
  * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
  * method should returns graphic elements definitions.See
  * [renderItem.return](https://echarts.apache.org/en/option.html#series-custom.renderItem.return)
  * .
  *
  * Generally, the main process of
  * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
  * is that retrieve value from data and convert them to graphic elements
  * on the current coordinate system. Two methods in
  * [renderItem.arguments.api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
  * are always used in this procedure:
  *
  * + [api.value(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.value)
  * is used to retrieve value from data.
  * For example, `api.value(0)`
  * retrieve the value of the first dimension in the current data item.
  * + [api.coord(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.coord)
  * is used to convert data to coordinate.
  * For example, `var point = api.coord([api.value(0),
  * api.value(1)])`
  * converet the data to the point on the current coordinate system.
  *
  * Sometimes
  * [api.size(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.size)
  * method is needed, which calculates the size on the coordinate system
  * by a given data range.
  *
  * Moreover,
  * [api.style(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.style)
  * method can be used to set style.
  * It provides not only the style settings specified in
  * [series.itemStyle](https://echarts.apache.org/en/option.html#series-custom.itemStyle)
  * , but also the result of visual mapping.
  * This method can also be called like `api.style({fill:
  * 'green', stroke: 'yellow'})` to override those style settings.
  *
  * **Dimension mapping (by encode and dimension option)**
  *
  * In most cases,
  * [series.encode](https://echarts.apache.org/en/option.html#series-custom.encode)
  * is needed to be specified when using `custom series` serise, which
  * indicate the mapping of dimensions, and then echarts can render appropriate
  * axis by the extent of those data.
  *
  * `encode.tooltip`
  * and `encode.label`
  * can also be specified to define the content of default `tooltip`
  * and `label`.
  * [series.dimensions](https://echarts.apache.org/en/option.html#series-custom.dimensions)
  * can also be specified to defined names of each dimensions, which
  * will be displayed in tooltip.
  *
  * For example:
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-custom)
  *
  * **Controlled by dataZoom**
  *
  * When use `custom series` with
  * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
  * ,
  * [dataZoom.filterMode](https://echarts.apache.org/en/option.html#dataZoom.filterMode)
  * usually be set as `'weakFilter'`, which prevent `dataItem` from being
  * filtered when only part of its dimensions are out of the current
  * data window.
  *
  * **Difference between `dataIndex` and `dataIndexInside`**
  *
  * + `dataIndex` is the index of a `dataItem` in the original data.
  * + `dataIndexInside` is the index of a `dataItem` in the current data
  * window (see
  * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
  * .
  *
  * [renderItem.arguments.api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
  * uses `dataIndexInside` as the input parameter but not `dataIndex`,
  * because conversion from `dataIndex` to `dataIndexInside` is time-consuming.
  *
  * **Event listener**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-custom)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-custom
  */
@js.native
trait SeriesCustom_ extends js.Object {
  
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-custom.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-custom.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-custom.animationDurationUpdate
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
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-custom.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-custom.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-custom.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Index of
    * [calendar coordinates](https://echarts.apache.org/en/option.html#calendar)
    * to combine with, which is useful for multiple calendar coordinates
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.calendarIndex
    */
  var calendarIndex: js.UndefOr[Double] = js.native
  
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
    * [xAxisIndex](https://echarts.apache.org/en/option.html#series-custom.xAxisIndex)
    * and
    * [yAxisIndex](https://echarts.apache.org/en/option.html#series-custom.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'polar'`
    *
    * Use polar coordinates, with
    * [polarIndex](https://echarts.apache.org/en/option.html#series-custom.polarIndex)
    * to assign the corresponding polar coordinate component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://echarts.apache.org/en/option.html#series-custom.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    * + `'none'`
    *
    * Do not use coordinate system.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://echarts.apache.org/en/option.html#series-custom.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.native
  
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
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
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
    * @see https://echarts.apache.org/en/option.html#series-custom.data
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
    * @see https://echarts.apache.org/en/option.html#series-custom.datasetIndex
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
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
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
    * @see https://echarts.apache.org/en/option.html#series-custom.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-custom.emphasis
    */
  var emphasis: js.UndefOr[`2`] = js.native
  
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.encode
    */
  var encode: js.UndefOr[js.Object] = js.native
  
  /**
    * Index of
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.native
  
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.id
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-custom.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Index of
    * [polar coordinate](https://echarts.apache.org/en/option.html#polar)
    * to combine with, which is useful for multiple polar axes in one
    * chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.polarIndex
    */
  var polarIndex: js.UndefOr[Double] = js.native
  
  /**
    * `custom series` requires developers to write a render logic by
    * themselves. This render logic is called
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * .
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom)
    *
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * will be called on each data item.
    *
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * provides two parameters:
    *
    * + [params](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.params)
    * : provides info about the current series and data and coordinate
    * system.
    * + [api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
    * : includes some methods.
    *
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * method should returns graphic elements definitions.See
    * [renderItem.return](https://echarts.apache.org/en/option.html#series-custom.renderItem.return)
    * .
    *
    * Generally, the main process of
    * [renderItem](https://echarts.apache.org/en/option.html#series-custom.renderItem)
    * is that retrieve value from data and convert them to graphic
    * elements on the current coordinate system. Two methods in
    * [renderItem.arguments.api](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api)
    * are always used in this procedure:
    *
    * + [api.value(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.value)
    * is used to retrieve value from data.
    * For example, `api.value(0)`
    * retrieve the value of the first dimension in the current data
    * item.
    * + [api.coord(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.coord)
    * is used to convert data to coordinate.
    * For example, `var point = api.coord([api.value(0),
    * api.value(1)])`
    * converet the data to the point on the current coordinate system.
    *
    * Sometimes
    * [api.size(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.size)
    * method is needed, which calculates the size on the coordinate
    * system by a given data range.
    *
    * Moreover,
    * [api.style(...)](https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.style)
    * method can be used to set style.
    * It provides not only the style settings specified in
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-custom.itemStyle)
    * , but also the result of visual mapping.
    * This method can also be called like `api.style({fill:
    * 'green', stroke: 'yellow'})` to override those style settings.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem
    *
    * @returns
    * `renderItem` should returns graphic element definitions.
    * Each graphic element is an object. See
    * [graphic](https://echarts.apache.org/en/option.html#graphic.elements)
    * for detailed info.
    * (But width\\height\\top\\bottom is not supported here)
    *
    * If nothing should be rendered in this data item, just returns
    * nothing.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem)
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return
    */
  var renderItem: js.UndefOr[RenderItem] = js.native
  
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
    * @see https://echarts.apache.org/en/option.html#series-custom.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.native
  
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  
  /**
    * @default
    * "custom"
    * @see https://echarts.apache.org/en/option.html#series-custom.type
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.native
  
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.native
  
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
    * @see https://echarts.apache.org/en/option.html#series-custom.z
    */
  var z: js.UndefOr[Double] = js.native
  
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
    * @see https://echarts.apache.org/en/option.html#series-custom.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}
object SeriesCustom_ {
  
  @scala.inline
  def apply(): SeriesCustom_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesCustom_]
  }
  
  @scala.inline
  implicit class SeriesCustom_Ops[Self <: SeriesCustom_] (val x: Self) extends AnyVal {
    
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
    def setCalendarIndex(value: Double): Self = this.set("calendarIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarIndex: Self = this.set("calendarIndex", js.undefined)
    
    @scala.inline
    def setCoordinateSystem(value: String): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinateSystem: Self = this.set("coordinateSystem", js.undefined)
    
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
    def setEmphasis(value: `2`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    
    @scala.inline
    def setEncode(value: js.Object): Self = this.set("encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
    @scala.inline
    def setGeoIndex(value: Double): Self = this.set("geoIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoIndex: Self = this.set("geoIndex", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLegendHoverLink(value: Boolean): Self = this.set("legendHoverLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendHoverLink: Self = this.set("legendHoverLink", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPolarIndex(value: Double): Self = this.set("polarIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolarIndex: Self = this.set("polarIndex", js.undefined)
    
    @scala.inline
    def setRenderItem(
      value: (/* params */ RenderItemParams, /* api */ RenderItemApi) => RenderItemReturnGroup | RenderItemReturnPath | RenderItemReturnImage | RenderItemReturnText | RenderItemReturnRect | RenderItemReturnCircle | RenderItemReturnRing | RenderItemReturnSector | RenderItemReturnArc | RenderItemReturnPolygon | RenderItemReturnPolyline | RenderItemReturnLine | RenderItemReturnBezierCurve
    ): Self = this.set("renderItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
    
    @scala.inline
    def setSeriesLayoutBy(value: String): Self = this.set("seriesLayoutBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesLayoutBy: Self = this.set("seriesLayoutBy", js.undefined)
    
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
