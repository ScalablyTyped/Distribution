package typings.echarts.echarts.EChartOption

import typings.echarts.anon.BorderType
import typings.echarts.anon.Downplay
import typings.echarts.anon.LabelMinAngle
import typings.echarts.anon.MinAngle
import typings.echarts.echarts.EChartOption.SeriesSunburst.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Sunburst Chart](https://en.wikipedia.org/wiki/Pie_chart#Ring_chart_/_Sunburst_chart_/_Multilevel_pie_chart)
  * is composed of multiple pie charts.
  * From the view of data structure, inner rings are the parent nodes
  * of outer rings.
  * Therefore, it can show the partial-overall relationship as
  * [Pie](https://echarts.apache.org/en/option.html#series-pie)
  * charts, and also level relation as
  * [Treemap](https://echarts.apache.org/en/option.html#series-treemap)
  * charts.
  *
  * **For example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-sunburst)
  * [see doc](https://echarts.apache.org/en/option.html#series-sunburst)
  *
  * **Data mining**
  *
  * Sunburst charts support data mining by default.
  * That means, when a user clicks a sector, it will be used as root
  * node, and there will be a circle in the center for return to parent
  * node. If data mining is not needed, it can be disabled by
  * [series-sunburst.nodeClick](https://echarts.apache.org/en/option.html#series-treemap.nodeClick)
  * .
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-sunburst
  */
trait SeriesSunburst_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * 500
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Center position of Sunburst chart, the first of which is the
    * horizontal position, and the second is the vertical position.
    *
    * Percentage is supported.
    * When set in percentage, the item is relative to the container
    * width, and the second item to the height.
    *
    * **Example:**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * ['50%', '50%']
    * @see https://echarts.apache.org/en/option.html#series-sunburst.center
    */
  var center: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The data structure of
    * [series-sunburst.data](https://echarts.apache.org/en/option.html#series-sunburst.data)
    * is like tree. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.undefined
  /**
    * Item style when mouse is hovering unrelated items. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.downplay
    */
  var downplay: js.UndefOr[LabelMinAngle] = js.undefined
  /**
    * Item style when mouse is hovering. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.emphasis
    */
  var emphasis: js.UndefOr[LabelMinAngle] = js.undefined
  /**
    * Item style when mouse is hovering related items. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.highlight
    */
  var highlight: js.UndefOr[LabelMinAngle] = js.undefined
  /**
    * When mouse hovers a sector, the sector is emphasized.
    * **If `highlightPolicy` is set to be `'descendant'`, then the
    * sector and its descendant will be _highlighted_, and others will
    * be _downplayed_.
    * If `highlightPolicy` is `'ancestor'`, then the sector and its
    * ancestors will be highlighted.
    * If it is set to be `'self'`, then the sector will be highlighted
    * and others downplayed.
    * If it is set to be `'none'`, then others will not be downplayed.**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    * The `highlightPolicy` value above is the default value `'descendant'`.
    * We use `dispatchAction` to highlight certain sector.
    * Target sector will use the style of `emphasis`, and related sectors
    * decided by `highlightPolicy` uses the style of `highlight`, and
    * others use `downplay`.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    * If `highlightPolicy` is set to be `'ancestor'`, then the result
    * looks like:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * "descendant"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy
    */
  var highlightPolicy: js.UndefOr[String] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Style of Sunburst sectors.
    *
    * Style can be set in
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.itemStyle)
    * for sectors of this series, or
    * [series.levels.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle)
    * for the whole level, or
    * [series.data.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle)
    * for single sector. If
    * [series.data.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle)
    * is defined, it will cover the setting of
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.itemStyle)
    * and
    * [series.levels.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle)
    * .
    *
    * **Priority:
    * [series.data.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.data.itemStyle)
    * >
    * [series.levels.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.levels.itemStyle)
    * >
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-sunburst.itemStyle)
    * .**
    *
    * In ECharts, _emphasis_ is for styles when mouse hovers.
    * For Sunburst charts, there are two extra states: _highlight_
    * for highlighting items that relates to the emphasized one, and
    * _downplay_ for others when emphasizing an item. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * `label` sets the text style for every sectors.
    *
    * **Priority:
    * [series.data.label](https://echarts.apache.org/en/option.html#series-sunburst.data.label)
    * >
    * [series.levels.label](https://echarts.apache.org/en/option.html#series-sunburst.levels.label)
    * >
    * [series.label](https://echarts.apache.org/en/option.html#series-sunburst.label)
    * .**
    *
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.label
    */
  var label: js.UndefOr[MinAngle] = js.undefined
  /**
    * **Multiple levels**
    *
    * Sunburst chart has a leveled structure.
    * To make it convenient, we provide a `levels` option, which is
    * an array.
    * The first element of it is for returning to parent node when
    * data mining.
    * The following elements are for levels from center to outside.
    *
    * For example, if we don't want the data mining, and want to set
    * the most inside sector to be red, and text to be blue, we can
    * set the option like:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * []
    * @see https://echarts.apache.org/en/option.html#series-sunburst.levels
    */
  var levels: js.UndefOr[Downplay] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The action of clicking a sector, which can be:
    *
    * + `false`: nothing happens.
    * + `'rootToNode'`: use the clicked sector as root.
    * + `'link'`：if
    * [link](https://echarts.apache.org/en/option.html#series-sunburst.data.link)
    * is set, the page will redirect to it.
    *
    *
    * @default
    * "rootToNode"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.nodeClick
    */
  var nodeClick: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Radius of Sunburst chart. Value can be:
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
    *
    * @default
    * [0, '75%']
    * @see https://echarts.apache.org/en/option.html#series-sunburst.radius
    */
  var radius: js.UndefOr[js.Array[_] | Double | String] = js.undefined
  /**
    * If there is no `name`, whether need to render it.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.renderLabelForZeroData
    */
  var renderLabelForZeroData: js.UndefOr[Boolean] = js.undefined
  /**
    * Sorting method that sectors use based on
    * [`value`](https://echarts.apache.org/en/option.html#series-sunburst.data.value)
    * , which is the sum of children when not set.
    * The default value `'desc'` states for descending order, while
    * it can also be set to be `'asc'` for ascending order, or `null`
    * for not sorting, or callback function like:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * "desc"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.sort
    */
  var sort: js.UndefOr[js.Function | String] = js.undefined
  /**
    * @default
    * "sunburst"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.type
    */
  var `type`: js.UndefOr[String] = js.undefined
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
    * @see https://echarts.apache.org/en/option.html#series-sunburst.z
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
    * @see https://echarts.apache.org/en/option.html#series-sunburst.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesSunburst_ {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: js.Function | Double = null,
    animationDelayUpdate: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationDurationUpdate: js.Function | Double = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: js.UndefOr[Double] = js.undefined,
    center: js.Array[_] = null,
    data: js.Array[DataObject] = null,
    downplay: LabelMinAngle = null,
    emphasis: LabelMinAngle = null,
    highlight: LabelMinAngle = null,
    highlightPolicy: String = null,
    id: String = null,
    itemStyle: BorderType = null,
    label: MinAngle = null,
    levels: Downplay = null,
    name: String = null,
    nodeClick: Boolean | String = null,
    radius: js.Array[_] | Double | String = null,
    renderLabelForZeroData: js.UndefOr[Boolean] = js.undefined,
    sort: js.Function | String = null,
    `type`: String = null,
    z: js.UndefOr[Double] = js.undefined,
    zlevel: js.UndefOr[Double] = js.undefined
  ): SeriesSunburst_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(animationThreshold)) __obj.updateDynamic("animationThreshold")(animationThreshold.get.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (downplay != null) __obj.updateDynamic("downplay")(downplay.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (highlightPolicy != null) __obj.updateDynamic("highlightPolicy")(highlightPolicy.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeClick != null) __obj.updateDynamic("nodeClick")(nodeClick.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(renderLabelForZeroData)) __obj.updateDynamic("renderLabelForZeroData")(renderLabelForZeroData.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zlevel)) __obj.updateDynamic("zlevel")(zlevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSunburst_]
  }
}

