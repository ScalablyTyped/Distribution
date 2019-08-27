package typings.echarts.echartsNs.EChartOptionNs

import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize
import typings.echarts.Anon_BorderColorBorderTypeBorderWidthColor
import typings.echarts.Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle
import typings.echarts.echartsNs.EChartOptionNs.SeriesThemeRiverNs.DataObject
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
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver)
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
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver
  */
trait SeriesThemeRiver extends Series {
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.undefined
  /**
    * The boundary gap of the direction orthogonal with coordinate
    * axis in diagram, which is set to adjust the diagram position,
    * keeping it on the screen center instead of the upside or downside
    * of the screen.
    *
    *
    * @default
    * ["10%", "10%"]
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.boundaryGap
    */
  var boundaryGap: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * coordinate. The theme river adopts sinle time axis.
    *
    *
    * @default
    * ""single""
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.coordinateSystem
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.themeRiver)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.themeRiver)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.themeRiver)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.themeRiver)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.data
    */
  var data: js.UndefOr[
    js.Array[
      (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
    ]
  ] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.emphasis
    */
  var emphasis: js.UndefOr[
    Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle
  ] = js.undefined
  /**
    * Height of thmemRiver component.
    *
    * **Notes:** The positional information of the whole theme river
    * view reuses the positional information of a single time axis,
    * which are left, top, right and bottom.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.height
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * style of each ribbon-shape river branch in theme river.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderTypeBorderWidthColor] = js.undefined
  /**
    * `label` describes style of text labels with which each ribbon-shape
    * river branch corresponds in theme river.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.label
    */
  var label: js.UndefOr[
    Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize
  ] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.left
    */
  var left: js.UndefOr[Double | String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.right
    */
  var right: js.UndefOr[Double | String] = js.undefined
  /**
    * The index of single time axis, which defaults to be 0 because
    * it contains only one axis.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.singleAxisIndex
    */
  var singleAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.top
    */
  var top: js.UndefOr[Double | String] = js.undefined
  /**
    * @default
    * "themeRiver"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Width of thmemRiver component.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.width
    */
  var width: js.UndefOr[Double | String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.z
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in .
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesThemeRiver {
  @scala.inline
  def apply(
    bottom: Double | String = null,
    boundaryGap: js.Array[_] = null,
    coordinateSystem: String = null,
    data: js.Array[
      (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
    ] = null,
    emphasis: Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle = null,
    height: Double | String = null,
    id: String = null,
    itemStyle: Anon_BorderColorBorderTypeBorderWidthColor = null,
    label: Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize = null,
    left: Double | String = null,
    right: Double | String = null,
    singleAxisIndex: Int | Double = null,
    tooltip: Anon_BackgroundColorBorderColor = null,
    top: Double | String = null,
    `type`: String = null,
    width: Double | String = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SeriesThemeRiver = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (boundaryGap != null) __obj.updateDynamic("boundaryGap")(boundaryGap)
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem)
    if (data != null) __obj.updateDynamic("data")(data)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (singleAxisIndex != null) __obj.updateDynamic("singleAxisIndex")(singleAxisIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesThemeRiver]
  }
}

