package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Boxplot](https://en.wikipedia.org/wiki/Box_plot)
  * is a convenient way of graphically depicting groups of numerical
  * data through their quartiles.
  *
  * **Example:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot)
  *
  * Multiple `series` can be displayed in the same coordinate system.
  * Please refer to
  * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=boxplot-multi&edit=1&reset=1)
  * .
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot
  */
trait SeriesBoxplot extends js.Object {
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.boxplot)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.boxplot)
    *
    *
    * @default
    * 800
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "elasticOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Up and bottom boundary of box width.
    * The array is in the form of `[min, max]`.
    *
    * It could be absolute value in pixel, such as `[7, 50]`, or percentage,
    * such as `['40%', '90%']`.
    * The percentage means the percentage to the maximum possible width.
    *
    *
    * @default
    * [7, 50]
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.boxWidth
    */
  var boxWidth: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-cartesian2d.xAxisIndex)
    * and
    * [yAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-cartesian2d.yAxisIndex)
    * to assign the corresponding axis component.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Data should be the two-dimensional array shown as follow.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.boxplot)
    *
    * Every data item (each line in the example above) in the two-dimensional
    * array will be rendered into a box, and each line have five values
    * as:
    *
    * ```
    * [min, Q1, median (or Q2), Q3, max]
    *
    * ```
    *
    * **Data Processing**
    *
    * ECharts doesn't contain data processing modules, so the five
    * statistic values should be calculated by yourself and then passes
    * into `boxplot`.
    *
    * However, ECharts also provide some simple
    * [raw data processing tools](https://github.com/ecomfe/echarts/tree/master/extension/dataTool)
    * . For example, this
    * [example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=boxplot-light-velocity&edit=1&reset=1)
    * uses `echarts.dataTool.prepareBoxplotData`
    * to proceed simple data statistics.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.data
    */
  var data: js.UndefOr[
    js.Array[
      js.Array[scala.Double | echartsLib.echartsNs.EChartOptionNs.SeriesBoxplotNs.DataObject]
    ]
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.boxplot)
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.boxplot)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleAnonBorderColor] = js.undefined
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.boxplot)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.boxplot)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://ecomfe.github.io/echarts-doc/public/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.boxplot)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.encode
    */
  var encode: js.UndefOr[js.Object] = js.undefined
  /**
    * Whether to enable the animation when hovering on box.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderTypeBorderWidth] = js.undefined
  /**
    * Layout methods, whose optional values are:
    *
    * + `'horizontal'`: horizontally layout all boxes.
    *
    * + `'vertical'`: vertically layout all boxes.
    *
    * The default value is decided by:
    *
    * + if there is a `category` axis:
    * + if it is horizontal, use `'horizontal'`;
    * + otherwise use `'vertical'`;
    * + otherwise use `'horizontal'`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.layout
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.markArea
    */
  var markArea: js.UndefOr[echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.markLine
    */
  var markLine: js.UndefOr[echartsLib.Anon_AnimationAnimationDelay] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.markPoint
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.silent
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * @default
    * "boxplot"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Index of
    * [x axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Index of
    * [y axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * `z` value of all graghical elements in Box plot, which controls
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.z
    */
  var z: js.UndefOr[scala.Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in Box plot.
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-boxplot.zlevel
    */
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

