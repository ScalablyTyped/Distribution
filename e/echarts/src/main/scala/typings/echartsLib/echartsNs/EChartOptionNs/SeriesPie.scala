package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **pie chart**
  *
  * The pie chart is mainly used for showing proportion of different
  * categories.
  * Each arc length represents the proportion of data quantity.
  *
  * **Tip:** The pie chart is more suitable for illustrating the numerical
  * proportion.
  * If you just to present the numerical differences of various categories,
  * the
  * [bar graph](https://ecomfe.github.io/echarts-doc/public/en/option.htmlbar)
  * chart is more suggested.
  * Because compared to tiny length difference, people is less sensitive
  * to the minor radian difference.
  * Otherwise, it can also be shown as Nightingale chart by using the
  * [roseType](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.roseType)
  * to distinguish different data through radius.
  *
  * **The below example shows a customized Nightingale chart:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie
  */
trait SeriesPie extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.animationDurationUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Initial animation type.
    *
    * + `'expansion'` Default expansion animation.
    * + `'scale'` Scale animation.
    * You can use it with `animationEasing='elasticOut'` to have popup
    * effect.
    *
    *
    * @default
    * "expansion"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.animationType
    */
  var animationType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to enable the strategy to avoid labels overlap.
    * Defaults to be enabled, which will move the label positions in
    * the case of labels overlapping
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.avoidLabelOverlap
    */
  var avoidLabelOverlap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Center position of Pie chart, the first of which is the horizontal
    * position, and the second is the vertical position.
    *
    * Percentage is supported.
    * When set in percentage, the item is relative to the container
    * width, and the second item to the height.
    *
    * **Example:**
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie)
    *
    *
    * @default
    * ['50%', '50%']
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.center
    */
  var center: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Whether the layout of sectors of pie chart is clockwise.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.clockwise
    */
  var clockwise: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.cursor
    */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Data array of series, which can be a single data value, like:
    *
    * ```
    * [12, 34, 56, 10, 23]
    *
    * ```
    *
    * Or, if need extra dimensions for components like
    * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
    * to map to graphic attributes like color, it can also be in the
    * form of array. For example:
    *
    * ```
    * [[12, 14], [34, 50], [56, 30], [10, 15], [23, 10]]
    *
    * ```
    *
    * In this case, we can assgin the second value in each arrary item
    * to
    * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
    * component.
    *
    * More likely, we need to assign name to each data item, in which
    * case each item should be an object:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.pie)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data
    */
  var data: js.UndefOr[
    js.Array[scala.Double] | js.Array[js.Array[scala.Double]] | js.Array[echartsLib.echartsNs.EChartOptionNs.SeriesPieNs.DataObject]
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.datasetIndex
    */
  var datasetIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.emphasis
    */
  var emphasis: js.UndefOr[
    echartsLib.Anon_ItemStyleLabelAnonShadowOffsetXBorderTypeAnonShadowOffsetXBackgroundColorShowAlignTextBorderWidthVerticalAlignShadowBlurHeightBorderWidthFontStyleRich
  ] = js.undefined
  /**
    * Whether to enable the zoom animation effects when hovering sectors.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The offset distance of hovered sector.
    *
    *
    * @default
    * 10
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.hoverOffset
    */
  var hoverOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_UnknownProperty] = js.undefined
  /**
    * Text label of pie chart, to explain some data information about
    * graphic item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label
    */
  var label: js.UndefOr[echartsLib.Anon_UnknownPropertyShadowOffsetX] = js.undefined
  /**
    * The style of visual guide line. Will show when
    * [label position](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.label.position)
    * is set as `'outside'`.
    *
    * The style of visual guide line.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.labelLine
    */
  var labelLine: js.UndefOr[echartsLib.Anon_UnknownPropertyShow] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markArea
    */
  var markArea: js.UndefOr[echartsLib.Anon_SilentDataLabel] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markLine
    */
  var markLine: js.UndefOr[echartsLib.Anon_PrecisionSilent] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.markPoint
    */
  var markPoint: js.UndefOr[echartsLib.Anon_SilentDataLabelAnimationEasingUpdate] = js.undefined
  /**
    * The minimum angle of sector (0 ~ 360).
    * It prevents some sector from being too small when value is small,
    * which will affect user interaction.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.minAngle
    */
  var minAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Radius of Pie chart. Value can be:
    *
    * + `number`: Specify outside radius directly.
    * + `string`: For example, `'20%'`, means that the outside radius
    * is 20% of the viewport size (the little one between width and
    * height of the chart container).
    * + `Array.<number|string>`:
    * The first item specifies the inside radius, and the second item
    * specifies the outside radius.
    * Each item follows the definitions above.
    *
    * You can set a large inner radius for a Donut chart.
    *
    *
    * @default
    * [0, '75%']
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.radius
    */
  var radius: js.UndefOr[js.Array[_] | scala.Double | java.lang.String] = js.undefined
  /**
    * Whether to show as Nightingale chart, which distinguishs data
    * through radius. There are 2 optional modes:
    *
    * + `'radius'` Use central angle to show the percentage of data,
    * radius to show data size.
    * + `'area'` All the sectors will share the same central angle,
    * the data size is shown only through radiuses.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.roseType
    */
  var roseType: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Selected mode of pie.
    * It is enabled by default, and you may set it to be `false` to
    * disabled it.
    *
    * Besides, it can be set to `'single'` or `'multiple'`, for single
    * selection and multiple selection.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.selectedMode
    */
  var selectedMode: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * The offset distance of selected sector.
    *
    *
    * @default
    * 10
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.selectedOffset
    */
  var selectedOffset: js.UndefOr[scala.Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.silent
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The start angle, which range is \[0, 360\].
    *
    *
    * @default
    * 90
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.startAngle
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to show sector when all data are zero.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.stillShowZeroSum
    */
  var stillShowZeroSum: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColor] = js.undefined
  /**
    * @default
    * "pie"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.z
    */
  var z: js.UndefOr[scala.Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.zlevel
    */
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

