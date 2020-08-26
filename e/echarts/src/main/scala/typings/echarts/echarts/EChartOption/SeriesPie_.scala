package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationEasing
import typings.echarts.anon.AnimationEasingUpdate
import typings.echarts.anon.AnimationThreshold
import typings.echarts.anon.DictunknownPropertyBorderColor
import typings.echarts.anon.Length2
import typings.echarts.anon.TextBorderColor
import typings.echarts.anon.`19`
import typings.echarts.echarts.EChartOption.SeriesPie.DataObject
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
  * [bar graph](https://echarts.apache.org/en/option.htmlbar)
  * chart is more suggested.
  * Because compared to tiny length difference, people is less sensitive
  * to the minor radian difference.
  * Otherwise, it can also be shown as Nightingale chart by using the
  * [roseType](https://echarts.apache.org/en/option.html#series-pie.roseType)
  * to distinguish different data through radius.
  *
  * **The below example shows a customized Nightingale chart:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-pie)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-pie
  */
@js.native
trait SeriesPie_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-pie.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-pie.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-pie.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-pie.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-pie.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-pie.animationType
    */
  var animationType: js.UndefOr[String] = js.native
  /**
    * Whether to enable the strategy to avoid labels overlap.
    * Defaults to be enabled, which will move the label positions in
    * the case of labels overlapping
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.avoidLabelOverlap
    */
  var avoidLabelOverlap: js.UndefOr[Boolean] = js.native
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
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    *
    * @default
    * ['50%', '50%']
    * @see https://echarts.apache.org/en/option.html#series-pie.center
    */
  var center: js.UndefOr[js.Array[_]] = js.native
  /**
    * Whether the layout of sectors of pie chart is clockwise.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.clockwise
    */
  var clockwise: js.UndefOr[Boolean] = js.native
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://echarts.apache.org/en/option.html#series-pie.cursor
    */
  var cursor: js.UndefOr[String] = js.native
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
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data
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
    * @see https://echarts.apache.org/en/option.html#series-pie.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.emphasis
    */
  var emphasis: js.UndefOr[`19`] = js.native
  /**
    * Whether to enable the zoom animation effects when hovering sectors.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.native
  /**
    * The offset distance of hovered sector.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-pie.hoverOffset
    */
  var hoverOffset: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle
    */
  var itemStyle: js.UndefOr[DictunknownPropertyBorderColor] = js.native
  /**
    * Text label of pie chart, to explain some data information about
    * graphic item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.label
    */
  var label: js.UndefOr[TextBorderColor] = js.native
  /**
    * The style of visual guide line. Will show when
    * [label position](https://echarts.apache.org/en/option.html#series-pie.label.position)
    * is set as `'outside'`.
    *
    * The style of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine
    */
  var labelLine: js.UndefOr[Length2] = js.native
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea
    */
  var markArea: js.UndefOr[AnimationThreshold] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine
    */
  var markLine: js.UndefOr[AnimationEasingUpdate] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint
    */
  var markPoint: js.UndefOr[AnimationEasing] = js.native
  /**
    * The minimum angle of sector (0 ~ 360).
    * It prevents some sector from being too small when value is small,
    * which will affect user interaction.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.minAngle
    */
  var minAngle: js.UndefOr[Double] = js.native
  /**
    * If a sector is less than this angle (0 ~ 360), label and labelLine will not be displayed.
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.minShowLabelAngle
    */
  var minShowLabelAngle: js.UndefOr[Double] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.name
    */
  var name: js.UndefOr[String] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-pie.radius
    */
  var radius: js.UndefOr[js.Array[_] | Double | String] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-pie.roseType
    */
  var roseType: js.UndefOr[Boolean | String] = js.native
  /**
    * Selected mode of pie.
    * It is enabled by default, and you may set it to be `false` to
    * disabled it.
    *
    * Besides, it can be set to `'single'` or `'multiple'`, for single
    * selection and multiple selection.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.selectedMode
    */
  var selectedMode: js.UndefOr[Boolean | String] = js.native
  /**
    * The offset distance of selected sector.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-pie.selectedOffset
    */
  var selectedOffset: js.UndefOr[Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-pie.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * The start angle, which range is \[0, 360\].
    *
    *
    * @default
    * 90
    * @see https://echarts.apache.org/en/option.html#series-pie.startAngle
    */
  var startAngle: js.UndefOr[Double] = js.native
  /**
    * Whether to show sector when all data are zero.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.stillShowZeroSum
    */
  var stillShowZeroSum: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * @default
    * "pie"
    * @see https://echarts.apache.org/en/option.html#series-pie.type
    */
  var `type`: js.UndefOr[String] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-pie.z
    */
  var z: js.UndefOr[Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-pie.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesPie_ {
  @scala.inline
  def apply(): SeriesPie_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPie_]
  }
  @scala.inline
  implicit class SeriesPie_Ops[Self <: SeriesPie_] (val x: Self) extends AnyVal {
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
    def setAnimationType(value: String): Self = this.set("animationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    @scala.inline
    def setAvoidLabelOverlap(value: Boolean): Self = this.set("avoidLabelOverlap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidLabelOverlap: Self = this.set("avoidLabelOverlap", js.undefined)
    @scala.inline
    def setCenterVarargs(value: js.Any*): Self = this.set("center", js.Array(value :_*))
    @scala.inline
    def setCenter(value: js.Array[_]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setClockwise(value: Boolean): Self = this.set("clockwise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockwise: Self = this.set("clockwise", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
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
    def setEmphasis(value: `19`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setHoverAnimation(value: Boolean): Self = this.set("hoverAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverAnimation: Self = this.set("hoverAnimation", js.undefined)
    @scala.inline
    def setHoverOffset(value: Double): Self = this.set("hoverOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverOffset: Self = this.set("hoverOffset", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemStyle(value: DictunknownPropertyBorderColor): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: TextBorderColor): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelLine(value: Length2): Self = this.set("labelLine", value.asInstanceOf[js.Any])
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
    def setMinAngle(value: Double): Self = this.set("minAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinAngle: Self = this.set("minAngle", js.undefined)
    @scala.inline
    def setMinShowLabelAngle(value: Double): Self = this.set("minShowLabelAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinShowLabelAngle: Self = this.set("minShowLabelAngle", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRadiusVarargs(value: js.Any*): Self = this.set("radius", js.Array(value :_*))
    @scala.inline
    def setRadius(value: js.Array[_] | Double | String): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRoseType(value: Boolean | String): Self = this.set("roseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoseType: Self = this.set("roseType", js.undefined)
    @scala.inline
    def setSelectedMode(value: Boolean | String): Self = this.set("selectedMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedMode: Self = this.set("selectedMode", js.undefined)
    @scala.inline
    def setSelectedOffset(value: Double): Self = this.set("selectedOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedOffset: Self = this.set("selectedOffset", js.undefined)
    @scala.inline
    def setSeriesLayoutBy(value: String): Self = this.set("seriesLayoutBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesLayoutBy: Self = this.set("seriesLayoutBy", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setStillShowZeroSum(value: Boolean): Self = this.set("stillShowZeroSum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStillShowZeroSum: Self = this.set("stillShowZeroSum", js.undefined)
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
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

