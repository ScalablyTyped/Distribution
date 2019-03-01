package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Sunburst Chart](https://en.wikipedia.org/wiki/Pie_chart#Ring_chart_/_Sunburst_chart_/_Multilevel_pie_chart)
  * is composed of multiple pie charts.
  * From the view of data structure, inner rings are the parent nodes
  * of outer rings.
  * Therefore, it can show the partial-overall relationship as
  * [Pie](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie)
  * charts, and also level relation as
  * [Treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
  * charts.
  *
  * **For example:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst)
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst)
  *
  * **Data mining**
  *
  * Sunburst charts support data mining by default.
  * That means, when a user clicks a sector, it will be used as root
  * node, and there will be a circle in the center for return to parent
  * node. If data mining is not needed, it can be disabled by
  * [series-sunburst.nodeClick](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.nodeClick)
  * .
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst
  */
trait SeriesSunburst extends Series {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * 500
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.animationDurationUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.animationEasingUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * ['50%', '50%']
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.center
    */
  var center: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The data structure of
    * [series-sunburst.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data)
    * is like tree. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data
    */
  var data: js.UndefOr[js.Array[echartsLib.echartsNs.EChartOptionNs.SeriesSunburstNs.DataObject]] = js.undefined
  /**
    * Item style when mouse is hovering unrelated items. See
    * [highlightPolicy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.downplay
    */
  var downplay: js.UndefOr[
    echartsLib.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyleFontWeight
  ] = js.undefined
  /**
    * Item style when mouse is hovering. See
    * [highlightPolicy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.emphasis
    */
  var emphasis: js.UndefOr[
    echartsLib.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyleFontWeight
  ] = js.undefined
  /**
    * Item style when mouse is hovering related items. See
    * [highlightPolicy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlight
    */
  var highlight: js.UndefOr[
    echartsLib.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyleFontWeight
  ] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    * The `highlightPolicy` value above is the default value `'descendant'`.
    * We use `dispatchAction` to highlight certain sector.
    * Target sector will use the style of `emphasis`, and related sectors
    * decided by `highlightPolicy` uses the style of `highlight`, and
    * others use `downplay`.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    * If `highlightPolicy` is set to be `'ancestor'`, then the result
    * looks like:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * "descendant"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlightPolicy
    */
  var highlightPolicy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style of Sunburst sectors.
    *
    * Style can be set in
    * [series.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.itemStyle)
    * for sectors of this series, or
    * [series.levels.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.levels.itemStyle)
    * for the whole level, or
    * [series.data.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.itemStyle)
    * for single sector. If
    * [series.data.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.itemStyle)
    * is defined, it will cover the setting of
    * [series.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.itemStyle)
    * and
    * [series.levels.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.levels.itemStyle)
    * .
    *
    * **Priority:
    * [series.data.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.itemStyle)
    * >
    * [series.levels.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.levels.itemStyle)
    * >
    * [series.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.itemStyle)
    * .**
    *
    * In ECharts, _emphasis_ is for styles when mouse hovers.
    * For Sunburst charts, there are two extra states: _highlight_
    * for highlighting items that relates to the emphasized one, and
    * _downplay_ for others when emphasizing an item. See
    * [highlightPolicy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderTypeBorderWidth] = js.undefined
  /**
    * `label` sets the text style for every sectors.
    *
    * **Priority:
    * [series.data.label](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.label)
    * >
    * [series.levels.label](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.levels.label)
    * >
    * [series.label](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.label)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle
  ] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * []
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.levels
    */
  var levels: js.UndefOr[echartsLib.Anon_Downplay] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The action of clicking a sector, which can be:
    *
    * + `false`: nothing happens.
    * + `'rootToNode'`: use the clicked sector as root.
    * + `'link'`：if
    * [link](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.link)
    * is set, the page will redirect to it.
    *
    *
    * @default
    * "rootToNode"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.nodeClick
    */
  var nodeClick: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.radius
    */
  var radius: js.UndefOr[js.Array[_] | scala.Double | java.lang.String] = js.undefined
  /**
    * If there is no `name`, whether need to render it.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.renderLabelForZeroData
    */
  var renderLabelForZeroData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sorting method that sectors use based on
    * [`value`](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.data.value)
    * , which is the sum of children when not set.
    * The default value `'desc'` states for descending order, while
    * it can also be set to be `'asc'` for ascending order, or `null`
    * for not sorting, or callback function like:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sunburst)
    *
    *
    * @default
    * "desc"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.sort
    */
  var sort: js.UndefOr[js.Function | java.lang.String] = js.undefined
  /**
    * @default
    * "sunburst"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.type
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.z
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sunburst.zlevel
    */
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

object SeriesSunburst {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    animationDelay: js.Function | scala.Double = null,
    animationDelayUpdate: js.Function | scala.Double = null,
    animationDuration: js.Function | scala.Double = null,
    animationDurationUpdate: js.Function | scala.Double = null,
    animationEasing: java.lang.String = null,
    animationEasingUpdate: java.lang.String = null,
    animationThreshold: scala.Int | scala.Double = null,
    center: js.Array[_] = null,
    data: js.Array[echartsLib.echartsNs.EChartOptionNs.SeriesSunburstNs.DataObject] = null,
    downplay: echartsLib.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyleFontWeight = null,
    emphasis: echartsLib.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyleFontWeight = null,
    highlight: echartsLib.Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyleFontWeight = null,
    highlightPolicy: java.lang.String = null,
    id: java.lang.String = null,
    itemStyle: echartsLib.Anon_BorderColorBorderTypeBorderWidth = null,
    label: echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSizeFontStyle = null,
    levels: echartsLib.Anon_Downplay = null,
    name: java.lang.String = null,
    nodeClick: scala.Boolean | java.lang.String = null,
    radius: js.Array[_] | scala.Double | java.lang.String = null,
    renderLabelForZeroData: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Function | java.lang.String = null,
    `type`: java.lang.String = null,
    z: scala.Int | scala.Double = null,
    zlevel: scala.Int | scala.Double = null
  ): SeriesSunburst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate)
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center)
    if (data != null) __obj.updateDynamic("data")(data)
    if (downplay != null) __obj.updateDynamic("downplay")(downplay)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (highlightPolicy != null) __obj.updateDynamic("highlightPolicy")(highlightPolicy)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nodeClick != null) __obj.updateDynamic("nodeClick")(nodeClick.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(renderLabelForZeroData)) __obj.updateDynamic("renderLabelForZeroData")(renderLabelForZeroData)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSunburst]
  }
}

