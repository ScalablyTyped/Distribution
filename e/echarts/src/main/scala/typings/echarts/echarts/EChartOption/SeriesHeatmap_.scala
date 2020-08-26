package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationEasing
import typings.echarts.anon.AnimationEasingUpdate
import typings.echarts.anon.AnimationThreshold
import typings.echarts.anon.BorderType
import typings.echarts.anon.Distance
import typings.echarts.anon.`7`
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
@js.native
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
  var blurSize: js.UndefOr[Double] = js.native
  /**
    * Index of
    * [calendar coordinates](https://echarts.apache.org/en/option.html#calendar)
    * to combine with, which is useful for multiple calendar coordinates
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.calendarIndex
    */
  var calendarIndex: js.UndefOr[Double] = js.native
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
  ] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-heatmap.emphasis
    */
  var emphasis: js.UndefOr[`7`] = js.native
  /**
    * Index of
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Work for
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * : 'cartesian2d'.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * Work for
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * : 'cartesian2d'.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.label
    */
  var label: js.UndefOr[Distance] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.markArea
    */
  var markArea: js.UndefOr[AnimationThreshold] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.markLine
    */
  var markLine: js.UndefOr[AnimationEasingUpdate] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.markPoint
    */
  var markPoint: js.UndefOr[AnimationEasing] = js.native
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
  var maxOpacity: js.UndefOr[Double] = js.native
  /**
    * Minimum opacity. It is valid with
    * [coordinateSystem](https://echarts.apache.org/en/option.html#series-heatmap.coordinateSystem)
    * of 'geo' value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.minOpacity
    */
  var minOpacity: js.UndefOr[Double] = js.native
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
  var name: js.UndefOr[String] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * @default
    * "heatmap"
    * @see https://echarts.apache.org/en/option.html#series-heatmap.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.native
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-heatmap.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.native
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
  var z: js.UndefOr[Double] = js.native
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
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesHeatmap_ {
  @scala.inline
  def apply(): SeriesHeatmap_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesHeatmap_]
  }
  @scala.inline
  implicit class SeriesHeatmap_Ops[Self <: SeriesHeatmap_] (val x: Self) extends AnyVal {
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
    def setBlurSize(value: Double): Self = this.set("blurSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurSize: Self = this.set("blurSize", js.undefined)
    @scala.inline
    def setCalendarIndex(value: Double): Self = this.set("calendarIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarIndex: Self = this.set("calendarIndex", js.undefined)
    @scala.inline
    def setCoordinateSystem(value: String): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinateSystem: Self = this.set("coordinateSystem", js.undefined)
    @scala.inline
    def setDataVarargs(value: ((js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(
      value: js.Array[
          (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
        ]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEmphasis(value: `7`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
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
    def setLabel(value: Distance): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMarkArea(value: AnimationThreshold): Self = this.set("markArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkArea: Self = this.set("markArea", js.undefined)
    @scala.inline
    def setMarkLine(value: AnimationEasingUpdate): Self = this.set("markLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkLine: Self = this.set("markLine", js.undefined)
    @scala.inline
    def setMarkPoint(value: AnimationEasing): Self = this.set("markPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkPoint: Self = this.set("markPoint", js.undefined)
    @scala.inline
    def setMaxOpacity(value: Double): Self = this.set("maxOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxOpacity: Self = this.set("maxOpacity", js.undefined)
    @scala.inline
    def setMinOpacity(value: Double): Self = this.set("minOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinOpacity: Self = this.set("minOpacity", js.undefined)
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

