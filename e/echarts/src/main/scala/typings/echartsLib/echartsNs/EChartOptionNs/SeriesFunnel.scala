package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Funnel chart**
  *
  * **sample:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel
  */
trait SeriesFunnel extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.funnel)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.funnel)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.funnel)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.funnel)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationDurationUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationEasingUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.funnel)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.funnel)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.data
    */
  var data: js.UndefOr[
    js.Array[scala.Double] | js.Array[js.Array[scala.Double]] | js.Array[echartsLib.echartsNs.EChartOptionNs.SeriesFunnelNs.DataObject]
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.datasetIndex
    */
  var datasetIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleLabelLine] = js.undefined
  /**
    * Horizontal align.
    * Defaults to align center. Can be 'left', 'right', 'center'.
    *
    *
    * @default
    * "center"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.funnelAlign
    */
  var funnelAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gap between each trapezoid.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.gap
    */
  var gap: js.UndefOr[scala.Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_ShadowOffsetXBorderTypeShadowBlurBorderWidthColor] = js.undefined
  /**
    * Text label of funnel chart, to explain some data information
    * about graphic item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_ShadowOffsetXBackgroundColorShowAlignTextBorderWidthVerticalAlignShadowBlurHeightBorderWidth
  ] = js.undefined
  /**
    * The visual guide line style of label. When
    * [label position](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.label.position)
    * is set as `'left'`or`'right'`, the visual guide line will show.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.labelLine
    */
  var labelLine: js.UndefOr[echartsLib.Anon_LengthEmphasis] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.markArea
    */
  var markArea: js.UndefOr[echartsLib.Anon_SilentDataLabel] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.markLine
    */
  var markLine: js.UndefOr[echartsLib.Anon_PrecisionSilent] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.markPoint
    */
  var markPoint: js.UndefOr[echartsLib.Anon_SilentDataLabelAnimationEasingUpdate] = js.undefined
  /**
    * The specified maximum value.
    *
    *
    * @default
    * 100
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.max
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * The mapped width from maximum data value
    * [max](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.max)
    * .
    *
    * It can be absolute pixel and also the percentage of
    * [layout width](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.width)
    * .
    *
    *
    * @default
    * '100%'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.maxSize
    */
  var maxSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The specified minimum value.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.min
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * The mapped width from minimum data value
    * [min](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.min)
    * .
    *
    * It can be absolute pixel and also the percentage of
    * [layout width](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.width)
    *
    * If you don't want the graph of minimum value to be a triangle,
    * you can set up this property larger than 0.
    *
    *
    * @default
    * '0%'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.minSize
    */
  var minSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Data sorting, which can be whether `'ascending'`, `'descending'`,
    * `'none'`(in data order) or a function, which is the same as `Array.prototype.sort(function
    * (a, b) { ... })`;
    *
    *
    * @default
    * "descending"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.sort
    */
  var sort: js.UndefOr[java.lang.String] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColor] = js.undefined
  /**
    * @default
    * "funnel"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

