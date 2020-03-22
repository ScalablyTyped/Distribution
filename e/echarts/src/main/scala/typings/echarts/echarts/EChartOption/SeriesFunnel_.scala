package typings.echarts.echarts.EChartOption

import typings.echarts.AnonAnimationDurationUpdate
import typings.echarts.AnonAnimationEasing
import typings.echarts.AnonAnimationEasingUpdate
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonFontStyle
import typings.echarts.AnonLabelLine
import typings.echarts.AnonLength
import typings.echarts.AnonShadowOffsetY
import typings.echarts.echarts.EChartOption.SeriesFunnel.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Funnel chart**
  *
  * **sample:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-funnel)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-funnel
  */
trait SeriesFunnel_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-funnel.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationThreshold
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
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
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
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * component.
    *
    * More likely, we need to assign name to each data item, in which
    * case each item should be an object:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data
    */
  var data: js.UndefOr[js.Array[js.Array[Double] | DataObject | Double]] = js.undefined
  /**
    * If
    * [series.data](https://echarts.apache.org/en/option.html#series.data)
    * is not specified, and
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * exists, the series will use `dataset`.
    * `datasetIndex` specifies which dataset will be used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis
    */
  var emphasis: js.UndefOr[AnonLabelLine] = js.undefined
  /**
    * Horizontal align.
    * Defaults to align center. Can be 'left', 'right', 'center'.
    *
    *
    * @default
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-funnel.funnelAlign
    */
  var funnelAlign: js.UndefOr[String] = js.undefined
  /**
    * Gap between each trapezoid.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.gap
    */
  var gap: js.UndefOr[Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.itemStyle
    */
  var itemStyle: js.UndefOr[AnonShadowOffsetY] = js.undefined
  /**
    * Text label of funnel chart, to explain some data information
    * about graphic item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.label
    */
  var label: js.UndefOr[AnonFontStyle] = js.undefined
  /**
    * The visual guide line style of label. When
    * [label position](https://echarts.apache.org/en/option.html#series-funnel.label.position)
    * is set as `'left'`or`'right'`, the visual guide line will show.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.labelLine
    */
  var labelLine: js.UndefOr[AnonLength] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-funnel.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.markArea
    */
  var markArea: js.UndefOr[AnonAnimationEasingUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.markLine
    */
  var markLine: js.UndefOr[AnonAnimationEasing] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.markPoint
    */
  var markPoint: js.UndefOr[AnonAnimationDurationUpdate] = js.undefined
  /**
    * The specified maximum value.
    *
    *
    * @default
    * 100
    * @see https://echarts.apache.org/en/option.html#series-funnel.max
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The mapped width from maximum data value
    * [max](https://echarts.apache.org/en/option.html#series-funnel.max)
    * .
    *
    * It can be absolute pixel and also the percentage of
    * [layout width](https://echarts.apache.org/en/option.html#series-funnel.width)
    * .
    *
    *
    * @default
    * '100%'
    * @see https://echarts.apache.org/en/option.html#series-funnel.maxSize
    */
  var maxSize: js.UndefOr[String] = js.undefined
  /**
    * The specified minimum value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.min
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * The mapped width from minimum data value
    * [min](https://echarts.apache.org/en/option.html#series-funnel.min)
    * .
    *
    * It can be absolute pixel and also the percentage of
    * [layout width](https://echarts.apache.org/en/option.html#series-funnel.width)
    *
    * If you don't want the graph of minimum value to be a triangle,
    * you can set up this property larger than 0.
    *
    *
    * @default
    * '0%'
    * @see https://echarts.apache.org/en/option.html#series-funnel.minSize
    */
  var minSize: js.UndefOr[String] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.name
    */
  var name: js.UndefOr[String] = js.undefined
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
    * @see https://echarts.apache.org/en/option.html#series-funnel.seriesLayoutBy
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
    * @see https://echarts.apache.org/en/option.html#series-funnel.sort
    */
  var sort: js.UndefOr[String] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * @default
    * "funnel"
    * @see https://echarts.apache.org/en/option.html#series-funnel.type
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SeriesFunnel_ {
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
    emphasis: AnonLabelLine = null,
    funnelAlign: String = null,
    gap: Int | Double = null,
    id: String = null,
    itemStyle: AnonShadowOffsetY = null,
    label: AnonFontStyle = null,
    labelLine: AnonLength = null,
    legendHoverLink: js.UndefOr[Boolean] = js.undefined,
    markArea: AnonAnimationEasingUpdate = null,
    markLine: AnonAnimationEasing = null,
    markPoint: AnonAnimationDurationUpdate = null,
    max: Int | Double = null,
    maxSize: String = null,
    min: Int | Double = null,
    minSize: String = null,
    name: String = null,
    seriesLayoutBy: String = null,
    sort: String = null,
    tooltip: AnonExtraCssText = null,
    `type`: String = null
  ): SeriesFunnel_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datasetIndex != null) __obj.updateDynamic("datasetIndex")(datasetIndex.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (funnelAlign != null) __obj.updateDynamic("funnelAlign")(funnelAlign.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelLine != null) __obj.updateDynamic("labelLine")(labelLine.asInstanceOf[js.Any])
    if (!js.isUndefined(legendHoverLink)) __obj.updateDynamic("legendHoverLink")(legendHoverLink.asInstanceOf[js.Any])
    if (markArea != null) __obj.updateDynamic("markArea")(markArea.asInstanceOf[js.Any])
    if (markLine != null) __obj.updateDynamic("markLine")(markLine.asInstanceOf[js.Any])
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (seriesLayoutBy != null) __obj.updateDynamic("seriesLayoutBy")(seriesLayoutBy.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesFunnel_]
  }
}

