package typings.echarts.echartsNs.EChartOptionNs

import typings.echarts.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdate
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasing
import typings.echarts.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdate
import typings.echarts.Anon_BackgroundColorBorderColor
import typings.echarts.Anon_BorderColorBorderTypeBorderWidthColorOpacity
import typings.echarts.Anon_EmphasisLength
import typings.echarts.Anon_ItemStyleLabelLabelLine
import typings.echarts.echartsNs.EChartOptionNs.SeriesFunnelNs.DataObject
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
trait SeriesFunnel extends Series {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
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
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
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
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
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
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationEasingUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
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
  var data: js.UndefOr[js.Array[js.Array[Double] | DataObject | Double]] = js.undefined
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
  var datasetIndex: js.UndefOr[Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.emphasis
    */
  var emphasis: js.UndefOr[Anon_ItemStyleLabelLabelLine] = js.undefined
  /**
    * Horizontal align.
    * Defaults to align center. Can be 'left', 'right', 'center'.
    *
    *
    * @default
    * "center"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.funnelAlign
    */
  var funnelAlign: js.UndefOr[String] = js.undefined
  /**
    * Gap between each trapezoid.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.gap
    */
  var gap: js.UndefOr[Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderTypeBorderWidthColorOpacity] = js.undefined
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
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily] = js.undefined
  /**
    * The visual guide line style of label. When
    * [label position](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.label.position)
    * is set as `'left'`or`'right'`, the visual guide line will show.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.labelLine
    */
  var labelLine: js.UndefOr[Anon_EmphasisLength] = js.undefined
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
  var legendHoverLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.markArea
    */
  var markArea: js.UndefOr[
    Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdate
  ] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.markLine
    */
  var markLine: js.UndefOr[
    Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasing
  ] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.markPoint
    */
  var markPoint: js.UndefOr[
    Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdate
  ] = js.undefined
  /**
    * The specified maximum value.
    *
    *
    * @default
    * 100
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.max
    */
  var max: js.UndefOr[Double] = js.undefined
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
  var maxSize: js.UndefOr[String] = js.undefined
  /**
    * The specified minimum value.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.min
    */
  var min: js.UndefOr[Double] = js.undefined
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
  var minSize: js.UndefOr[String] = js.undefined
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
  var name: js.UndefOr[String] = js.undefined
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
  var seriesLayoutBy: js.UndefOr[String] = js.undefined
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
  var sort: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.tooltip
    */
  var tooltip: js.UndefOr[Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * @default
    * "funnel"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.type
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SeriesFunnel {
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
    data: js.Array[js.Array[Double] | DataObject | Double] = null,
    datasetIndex: Int | Double = null,
    emphasis: Anon_ItemStyleLabelLabelLine = null,
    funnelAlign: String = null,
    gap: Int | Double = null,
    id: String = null,
    itemStyle: Anon_BorderColorBorderTypeBorderWidthColorOpacity = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily = null,
    labelLine: Anon_EmphasisLength = null,
    legendHoverLink: js.UndefOr[Boolean] = js.undefined,
    markArea: Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdate = null,
    markLine: Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasing = null,
    markPoint: Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdate = null,
    max: Int | Double = null,
    maxSize: String = null,
    min: Int | Double = null,
    minSize: String = null,
    name: String = null,
    seriesLayoutBy: String = null,
    sort: String = null,
    tooltip: Anon_BackgroundColorBorderColor = null,
    `type`: String = null
  ): SeriesFunnel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate)
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (datasetIndex != null) __obj.updateDynamic("datasetIndex")(datasetIndex.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (funnelAlign != null) __obj.updateDynamic("funnelAlign")(funnelAlign)
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine)
    if (!js.isUndefined(legendHoverLink)) __obj.updateDynamic("legendHoverLink")(legendHoverLink)
    if (markArea != null) __obj.updateDynamic("markArea")(markArea)
    if (markLine != null) __obj.updateDynamic("markLine")(markLine)
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize)
    if (name != null) __obj.updateDynamic("name")(name)
    if (seriesLayoutBy != null) __obj.updateDynamic("seriesLayoutBy")(seriesLayoutBy)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SeriesFunnel]
  }
}

