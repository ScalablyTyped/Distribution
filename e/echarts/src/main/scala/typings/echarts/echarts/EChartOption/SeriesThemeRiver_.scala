package typings.echarts.echarts.EChartOption

import typings.echarts.anon.BorderType
import typings.echarts.anon.TextBorderWidth
import typings.echarts.anon.`23`
import typings.echarts.echarts.EChartOption.SeriesThemeRiver.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Theme river**
  *
  * It is a special flow graph which is mainly used to present the changes
  * of an event or theme during a period.
  *
  * **Sample:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver)
  *
  * **visual encoding:**
  *
  * The ribbon-shape river branches in different colors in theme river
  * encode variable events or themes.
  * The width of river branches encode the value of the original dataset.
  *
  * What's more, the time attribute of the orinigal dataset would map
  * to a single time axis.
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-themeRiver
  */
@js.native
trait SeriesThemeRiver_ extends js.Object {
  /**
    * Distance between thmemRiver component and the bottom side of
    * the container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 5%
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * The boundary gap of the direction orthogonal with coordinate
    * axis in diagram, which is set to adjust the diagram position,
    * keeping it on the screen center instead of the upside or downside
    * of the screen.
    *
    *
    * @default
    * ["10%", "10%"]
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.boundaryGap
    */
  var boundaryGap: js.UndefOr[js.Array[_]] = js.native
  /**
    * coordinate. The theme river adopts sinle time axis.
    *
    *
    * @default
    * ""single""
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.coordinateSystem
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
    * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver.themeRiver)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver.themeRiver)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver.themeRiver)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver.themeRiver)
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.data
    */
  var data: js.UndefOr[
    js.Array[
      (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
    ]
  ] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis
    */
  var emphasis: js.UndefOr[`23`] = js.native
  /**
    * Height of thmemRiver component.
    *
    * **Notes:** The positional information of the whole theme river
    * view reuses the positional information of a single time axis,
    * which are left, top, right and bottom.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.height
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * style of each ribbon-shape river branch in theme river.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * `label` describes style of text labels with which each ribbon-shape
    * river branch corresponds in theme river.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.label
    */
  var label: js.UndefOr[TextBorderWidth] = js.native
  /**
    * Distance between thmemRiver component and the left side of the
    * container.
    *
    * `left` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'left'`, `'center'`, or `'right'`.
    *
    * If the `left` value is set to be `'left'`, `'center'`, or `'right'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * 5%
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.left
    */
  var left: js.UndefOr[Double | String] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Distance between thmemRiver component and the right side of the
    * container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 5%
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.right
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * The index of single time axis, which defaults to be 0 because
    * it contains only one axis.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.singleAxisIndex
    */
  var singleAxisIndex: js.UndefOr[Double] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * Distance between thmemRiver component and the top side of the
    * container.
    *
    * `top` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'top'`, `'middle'`, or `'bottom'`.
    *
    * If the `left` value is set to be `'top'`, `'middle'`, or `'bottom'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * 5%
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.top
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * @default
    * "themeRiver"
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Width of thmemRiver component.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.width
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * `z` value of all graghical elements in , which controls order
    * of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graphical elements in the series.
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
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesThemeRiver_ {
  @scala.inline
  def apply(): SeriesThemeRiver_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesThemeRiver_]
  }
  @scala.inline
  implicit class SeriesThemeRiver_Ops[Self <: SeriesThemeRiver_] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setBoundaryGapVarargs(value: js.Any*): Self = this.set("boundaryGap", js.Array(value :_*))
    @scala.inline
    def setBoundaryGap(value: js.Array[_]): Self = this.set("boundaryGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundaryGap: Self = this.set("boundaryGap", js.undefined)
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
    def setEmphasis(value: `23`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: TextBorderWidth): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setSingleAxisIndex(value: Double): Self = this.set("singleAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleAxisIndex: Self = this.set("singleAxisIndex", js.undefined)
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
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

