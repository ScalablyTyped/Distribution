package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationEasing
import typings.echarts.anon.AnimationEasingUpdate
import typings.echarts.anon.AnimationThreshold
import typings.echarts.anon.FontSize
import typings.echarts.anon.LabelLine
import typings.echarts.anon.Length
import typings.echarts.anon.ShadowOffsetY
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
@js.native
trait SeriesFunnel_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-funnel.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
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
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
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
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
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
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
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
  var data: js.UndefOr[js.Array[js.Array[Double] | DataObject | Double]] = js.native
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
  var datasetIndex: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis
    */
  var emphasis: js.UndefOr[LabelLine] = js.native
  /**
    * Horizontal align.
    * Defaults to align center. Can be 'left', 'right', 'center'.
    *
    *
    * @default
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-funnel.funnelAlign
    */
  var funnelAlign: js.UndefOr[String] = js.native
  /**
    * Gap between each trapezoid.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.gap
    */
  var gap: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.itemStyle
    */
  var itemStyle: js.UndefOr[ShadowOffsetY] = js.native
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
  var label: js.UndefOr[FontSize] = js.native
  /**
    * The visual guide line style of label. When
    * [label position](https://echarts.apache.org/en/option.html#series-funnel.label.position)
    * is set as `'left'`or`'right'`, the visual guide line will show.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.labelLine
    */
  var labelLine: js.UndefOr[Length] = js.native
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
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.markArea
    */
  var markArea: js.UndefOr[AnimationThreshold] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.markLine
    */
  var markLine: js.UndefOr[AnimationEasingUpdate] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.markPoint
    */
  var markPoint: js.UndefOr[AnimationEasing] = js.native
  /**
    * The specified maximum value.
    *
    *
    * @default
    * 100
    * @see https://echarts.apache.org/en/option.html#series-funnel.max
    */
  var max: js.UndefOr[Double] = js.native
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
  var maxSize: js.UndefOr[String] = js.native
  /**
    * The specified minimum value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.min
    */
  var min: js.UndefOr[Double] = js.native
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
  var minSize: js.UndefOr[String] = js.native
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
  var name: js.UndefOr[String] = js.native
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
  var seriesLayoutBy: js.UndefOr[String] = js.native
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
  var sort: js.UndefOr[String] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * @default
    * "funnel"
    * @see https://echarts.apache.org/en/option.html#series-funnel.type
    */
  var `type`: js.UndefOr[String] = js.native
}

object SeriesFunnel_ {
  @scala.inline
  def apply(): SeriesFunnel_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesFunnel_]
  }
  @scala.inline
  implicit class SeriesFunnel_Ops[Self <: SeriesFunnel_] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: (js.Array[Double] | DataObject | Double)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[Double] | DataObject | Double]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatasetIndex(value: Double): Self = this.set("datasetIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetIndex: Self = this.set("datasetIndex", js.undefined)
    @scala.inline
    def setEmphasis(value: LabelLine): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setFunnelAlign(value: String): Self = this.set("funnelAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunnelAlign: Self = this.set("funnelAlign", js.undefined)
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemStyle(value: ShadowOffsetY): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: FontSize): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelLine(value: Length): Self = this.set("labelLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelLine: Self = this.set("labelLine", js.undefined)
    @scala.inline
    def setLegendHoverLink(value: Boolean): Self = this.set("legendHoverLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendHoverLink: Self = this.set("legendHoverLink", js.undefined)
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxSize(value: String): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinSize(value: String): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSeriesLayoutBy(value: String): Self = this.set("seriesLayoutBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesLayoutBy: Self = this.set("seriesLayoutBy", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

