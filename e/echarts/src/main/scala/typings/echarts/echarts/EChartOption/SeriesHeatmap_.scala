package typings.echarts.echarts.EChartOption

import typings.echarts.AnonAnimationDurationUpdate
import typings.echarts.AnonAnimationEasing
import typings.echarts.AnonAnimationEasingUpdate
import typings.echarts.AnonBorderType
import typings.echarts.AnonDistance
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonItemStyleAnonBorderTypeLabelAnonDistance
import typings.echarts.echarts.EChartOption.SeriesHeatmap.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **heat map**
  *
  * Heat map mainly use colors to represent values, which must be used
  * along with
  * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
  * component.
  *
  * It can be used in either
  * [rectangular coordinate](https://echarts.apache.org/en/option.html#grid)
  * or
  * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
  *
  * But the behaviour on them are quite different.
  * Rectangular coordinate must have two catagories to use it.
  *
  * Here are the examples using it in rectangular coordinate and geographic
  * coordinate:
  *
  * **rectangular coordinate:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-heatmap)
  *
  * **geographic coordinate:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-heatmap)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-heatmap
  */
trait SeriesHeatmap_ extends js.Object {
  /**
    * Blur size of each data point. It is valid with
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * of 'geo' value.
    *
    *
    * @default
    * 20
    * @see https://echarts.apache.org/en/option.html#series-heatmap.blurSize
    */
  var blurSize: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [calendar coordinates](https://echarts.apache.org/en/option.html#calendar)
    * to combine with, which is useful for multiple calendar coordinates
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.calendarIndex
    */
  var calendarIndex: js.UndefOr[Double] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://echarts.apache.org/en/option.html#series-heatmap.xAxisIndex)
    * and
    * [yAxisIndex](https://echarts.apache.org/en/option.html#series-heatmap.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://echarts.apache.org/en/option.html#series-heatmap.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.undefined
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
    * [see doc](https://echarts.apache.org/en/option.html#series-heatmap.heatmap)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-heatmap.heatmap)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-heatmap.heatmap)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-heatmap.heatmap)
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
    * @see https://echarts.apache.org/en/option.html#series-heatmap.data
    */
  var data: js.UndefOr[
    js.Array[
      (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
    ]
  ] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-heatmap.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleAnonBorderTypeLabelAnonDistance] = js.undefined
  /**
    * Index of
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Work for
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * : 'cartesian2d'.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * Work for
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * : 'cartesian2d'.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.label
    */
  var label: js.UndefOr[AnonDistance] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.markArea
    */
  var markArea: js.UndefOr[AnonAnimationEasingUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.markLine
    */
  var markLine: js.UndefOr[AnonAnimationEasing] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.markPoint
    */
  var markPoint: js.UndefOr[AnonAnimationDurationUpdate] = js.undefined
  /**
    * Maximum opacity. It is valid with
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * of 'geo' value.
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-heatmap.maxOpacity
    */
  var maxOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Minimum opacity. It is valid with
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * of 'geo' value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.minOpacity
    */
  var minOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * @default
    * "heatmap"
    * @see https://echarts.apache.org/en/option.html#series-heatmap.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * `z` value of all graghical elements in heatmap, which controls
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
    * @see https://echarts.apache.org/en/option.html#series-heatmap.z
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in heatmap.
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
    * @see https://echarts.apache.org/en/option.html#series-heatmap.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesHeatmap_ {
  @scala.inline
  def apply(
    blurSize: Int | Double = null,
    calendarIndex: Int | Double = null,
    coordinateSystem: String = null,
    data: js.Array[
      (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
    ] = null,
    emphasis: AnonItemStyleAnonBorderTypeLabelAnonDistance = null,
    geoIndex: Int | Double = null,
    id: String = null,
    itemStyle: AnonBorderType = null,
    label: AnonDistance = null,
    markArea: AnonAnimationEasingUpdate = null,
    markLine: AnonAnimationEasing = null,
    markPoint: AnonAnimationDurationUpdate = null,
    maxOpacity: Int | Double = null,
    minOpacity: Int | Double = null,
    name: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    tooltip: AnonExtraCssText = null,
    `type`: String = null,
    xAxisIndex: Int | Double = null,
    yAxisIndex: Int | Double = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SeriesHeatmap_ = {
    val __obj = js.Dynamic.literal()
    if (blurSize != null) __obj.updateDynamic("blurSize")(blurSize.asInstanceOf[js.Any])
    if (calendarIndex != null) __obj.updateDynamic("calendarIndex")(calendarIndex.asInstanceOf[js.Any])
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (geoIndex != null) __obj.updateDynamic("geoIndex")(geoIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (markArea != null) __obj.updateDynamic("markArea")(markArea.asInstanceOf[js.Any])
    if (markLine != null) __obj.updateDynamic("markLine")(markLine.asInstanceOf[js.Any])
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint.asInstanceOf[js.Any])
    if (maxOpacity != null) __obj.updateDynamic("maxOpacity")(maxOpacity.asInstanceOf[js.Any])
    if (minOpacity != null) __obj.updateDynamic("minOpacity")(minOpacity.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesHeatmap_]
  }
}

