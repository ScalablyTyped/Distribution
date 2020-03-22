package typings.echarts.echarts.EChartOption

import typings.echarts.AnonAnimationDelay
import typings.echarts.AnonAnimationDelayUpdate
import typings.echarts.AnonAnimationDuration
import typings.echarts.AnonBorderRadius
import typings.echarts.AnonEdgeLabel
import typings.echarts.AnonEdgeLength
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonFontStyle
import typings.echarts.AnonRotateLabel
import typings.echarts.AnonShadowColor
import typings.echarts.AnonShadowOffsetY
import typings.echarts.AnonSource
import typings.echarts.AnonSymbolOffset
import typings.echarts.echarts.EChartOption.SeriesGraph.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **relation graph**
  *
  * Graph is a diagram to represent
  * [nodes](https://echarts.apache.org/en/option.html#series-graph.nodes)
  * and the
  * [links](https://echarts.apache.org/en/option.html#series-graph.links)
  * connecting nodes.
  *
  * **Tips:** In ECharts 2.x
  * , the diagram of `force` type will not be available in ECharts 3
  * any more, which has been changed to use `graph` to show graph data.
  * If you want to use force to lead the layout, you can set the
  * [layout](https://echarts.apache.org/en/option.html#series-graph.layout)
  * configuration as `'force'`.
  *
  * **Example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-graph)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-graph
  */
trait SeriesGraph_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-graph.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-graph.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-graph.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-graph.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-graph.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-graph.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Distance between component and the bottom side of the container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-graph.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.undefined
  /**
    * Index of
    * [calendar coordinates](https://echarts.apache.org/en/option.html#calendar)
    * to combine with, which is useful for multiple calendar coordinates
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.calendarIndex
    */
  var calendarIndex: js.UndefOr[Double] = js.undefined
  /**
    * The categories of node, which is optional.
    * If there is a classification of nodes, the category of each node
    * can be assigned through
    * [data\[i\].category](https://echarts.apache.org/en/option.html#series-graph.data.category)
    *
    * And the style of category will also be applied to the style of
    * nodes. `categories` can also be used in
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories
    */
  var categories: js.UndefOr[AnonSymbolOffset] = js.undefined
  /**
    * Configuration about circular layout.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.circular
    */
  var circular: js.UndefOr[AnonRotateLabel] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `null` or `'none'`
    *
    * No coordinate.
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://echarts.apache.org/en/option.html#series-graph.xAxisIndex)
    * and
    * [yAxisIndex](https://echarts.apache.org/en/option.html#series-graph.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'polar'`
    *
    * Use polar coordinates, with
    * [polarIndex](https://echarts.apache.org/en/option.html#series-graph.polarIndex)
    * to assign the corresponding polar coordinate component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://echarts.apache.org/en/option.html#series-graph.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    * + `'none'`
    *
    * Do not use coordinate system.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.undefined
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://echarts.apache.org/en/option.html#series-graph.cursor
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * Nodes list of graph.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.undefined
  /**
    * If node is draggable.
    * Only available when using force-directed layout.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.draggable
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.edgeLabel
    */
  var edgeLabel: js.UndefOr[AnonFontStyle] = js.undefined
  /**
    * Symbol of two ends of edge line.
    *
    * For example:
    *
    * ```
    * edgeSymbol: ['circle', 'arrow']
    *
    * ```
    *
    *
    * @default
    * "[none', 'none']"
    * @see https://echarts.apache.org/en/option.html#series-graph.edgeSymbol
    */
  var edgeSymbol: js.UndefOr[js.Array[_] | String] = js.undefined
  /**
    * Size of symbol of two ends of edge line.
    * Can be an array or a single number.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-graph.edgeSymbolSize
    */
  var edgeSymbolSize: js.UndefOr[js.Array[_] | Double] = js.undefined
  /**
    * Alias of
    * [links](https://echarts.apache.org/en/option.html#series-graph.links)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.edges
    */
  var edges: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis
    */
  var emphasis: js.UndefOr[AnonEdgeLabel] = js.undefined
  /**
    * Whether to focus/highlight the hover node and it's adjacencies.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.focusNodeAdjacency
    */
  var focusNodeAdjacency: js.UndefOr[Boolean] = js.undefined
  /**
    * Configuration items about force-directed layout.
    * Force-directed layout simulates spring/charge model, which will
    * add a repulsion between 2 nodes and add a attraction between
    * 2 nodes of each edge.
    * In each iteration nodes will move under the effect of repulsion
    * and attraction.
    * After several iterations, the nodes will be static in a balanced
    * position.
    * As a result, the energy local minimum of this whole model will
    * be realized.
    *
    * The result of force-directed layout has a good symmetries and
    * clustering, which is also aesthetically pleasing.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.force
    */
  var force: js.UndefOr[AnonEdgeLength] = js.undefined
  /**
    * Index of
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.undefined
  /**
    * Height of component.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-graph.height
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether to enable the highlight animation effect of mousr hover
    * node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.itemStyle
    */
  var itemStyle: js.UndefOr[AnonShadowOffsetY] = js.undefined
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.undefined
  /**
    * Graph layout.
    *
    * **Options:**
    *
    * + `'none'` No any layout, use
    * [x](https://echarts.apache.org/en/option.html#series-graph.data.x)
    * ,
    * [y](https://echarts.apache.org/en/option.html#series-graph.data.y)
    * provided in
    * [node](https://echarts.apache.org/en/option.html#series-graph.data)
    * as the position of node.
    *
    * + `'circular'` Adopt circular layout, see the example
    * [Les Miserables](https://echarts.apache.org/examples/en/editor.html?c=graph-circular-layout)
    * .
    *
    * + `'force'` Adopt force-directed layout, see the example
    * [Force](https://echarts.apache.org/examples/en/editor.html?c=graph-force)
    * , the detail about configrations of layout are in
    * [graph.force](https://echarts.apache.org/en/option.html#series-graph.force)
    *
    *
    * @default
    * "none"
    * @see https://echarts.apache.org/en/option.html#series-graph.layout
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * Distance between component and the left side of the container.
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
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-graph.left
    */
  var left: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-graph.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.undefined
  /**
    * The style of edge line.
    * [lineStyle.color](https://echarts.apache.org/en/option.html#series-graph.lineStyle.color)
    * can be `'source'` or `'target'`, which will use the color of
    * source node or target node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowColor] = js.undefined
  /**
    * Relational data between nodes. Example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links
    */
  var links: js.UndefOr[AnonSource] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.markArea
    */
  var markArea: js.UndefOr[AnonAnimationDelayUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.markLine
    */
  var markLine: js.UndefOr[AnonAnimationDelay] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.markPoint
    */
  var markPoint: js.UndefOr[AnonAnimationDuration] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Related zooming ratio of nodes when mouse zooming in or out.
    * When it is set as 0, the node will not zoom as the mouse zooms.
    *
    *
    * @default
    * 0.6
    * @see https://echarts.apache.org/en/option.html#series-graph.nodeScaleRatio
    */
  var nodeScaleRatio: js.UndefOr[Double] = js.undefined
  /**
    * Alias of
    * [data](https://echarts.apache.org/en/option.html#series-graph.data)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.nodes
    */
  var nodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Index of
    * [polar coordinate](https://echarts.apache.org/en/option.html#polar)
    * to combine with, which is useful for multiple polar axes in one
    * chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.polarIndex
    */
  var polarIndex: js.UndefOr[Double] = js.undefined
  /**
    * Distance between component and the right side of the container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-graph.right
    */
  var right: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether to enable mouse zooming and translating.
    * `false` by default.
    * If either zooming or translating is wanted, it can be set to
    * `'scale'` or `'move'`.
    * Otherwise, set it to be `true` to enable both.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.roam
    */
  var roam: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Symbol of node of relation graph.
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which URL
    * is the link to an image, or `dataURI` of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    * Icons can be set to arbitrary vector path via `'path://'` in
    * ECharts.
    * As compared with raster image, vector paths prevent from jagging
    * and blurring when scaled, and have a better control over changing
    * colors.
    * Size of vectoer icon will be adapted automatically. Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    *
    * @default
    * "circle"
    * @see https://echarts.apache.org/en/option.html#series-graph.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset of node of relation graph symbol relative to original
    * position.
    * By default, symbol will be put in the center position of data.
    * But if symbol is from user-defined vector path or image, you
    * may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to default
    * position.
    * It can be in absolute pixel value, or in relative percentage
    * value.
    *
    * For example, `[0, '50%']` means to move upside side position
    * of symbol height.
    * It can be used to make the arrow in the bottom to be at data
    * position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-graph.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of node of relation graph symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
  /**
    * node of relation graph symbol size.
    * It can be set to single numbers like `10`, or use an array to
    * represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    * If size of symbols needs to be different, you can set with callback
    * function in the following format:
    *
    * ```
    * (value: Array|number, params: Object) => number|Array
    *
    * ```
    *
    * The first parameter `value` is the value in
    * [data](https://echarts.apache.org/en/option.html#series-.data)
    * , and the second parameter `params` is the rest parameters of
    * data item.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-graph.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * Distance between component and the top side of the container.
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
    * "middle"
    * @see https://echarts.apache.org/en/option.html#series-graph.top
    */
  var top: js.UndefOr[Double | String] = js.undefined
  /**
    * @default
    * "graph"
    * @see https://echarts.apache.org/en/option.html#series-graph.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Width of component.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-graph.width
    */
  var width: js.UndefOr[Double | String] = js.undefined
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.undefined
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
    * @see https://echarts.apache.org/en/option.html#series-graph.z
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
    * @see https://echarts.apache.org/en/option.html#series-graph.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesGraph_ {
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
    bottom: Double | String = null,
    calendarIndex: Int | Double = null,
    categories: AnonSymbolOffset = null,
    circular: AnonRotateLabel = null,
    coordinateSystem: String = null,
    cursor: String = null,
    data: js.Array[DataObject] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    edgeLabel: AnonFontStyle = null,
    edgeSymbol: js.Array[_] | String = null,
    edgeSymbolSize: js.Array[_] | Double = null,
    edges: js.Array[_] = null,
    emphasis: AnonEdgeLabel = null,
    focusNodeAdjacency: js.UndefOr[Boolean] = js.undefined,
    force: AnonEdgeLength = null,
    geoIndex: Int | Double = null,
    height: Double | String = null,
    hoverAnimation: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemStyle: AnonShadowOffsetY = null,
    label: AnonBorderRadius = null,
    layout: String = null,
    left: Double | String = null,
    legendHoverLink: js.UndefOr[Boolean] = js.undefined,
    lineStyle: AnonShadowColor = null,
    links: AnonSource = null,
    markArea: AnonAnimationDelayUpdate = null,
    markLine: AnonAnimationDelay = null,
    markPoint: AnonAnimationDuration = null,
    name: String = null,
    nodeScaleRatio: Int | Double = null,
    nodes: js.Array[_] = null,
    polarIndex: Int | Double = null,
    right: Double | String = null,
    roam: Boolean | String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    symbol: String = null,
    symbolKeepAspect: js.UndefOr[Boolean] = js.undefined,
    symbolOffset: js.Array[_] = null,
    symbolRotate: Int | Double = null,
    symbolSize: js.Array[_] | js.Function | Double = null,
    tooltip: AnonExtraCssText = null,
    top: Double | String = null,
    `type`: String = null,
    width: Double | String = null,
    xAxisIndex: Int | Double = null,
    yAxisIndex: Int | Double = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SeriesGraph_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (calendarIndex != null) __obj.updateDynamic("calendarIndex")(calendarIndex.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (circular != null) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (edgeLabel != null) __obj.updateDynamic("edgeLabel")(edgeLabel.asInstanceOf[js.Any])
    if (edgeSymbol != null) __obj.updateDynamic("edgeSymbol")(edgeSymbol.asInstanceOf[js.Any])
    if (edgeSymbolSize != null) __obj.updateDynamic("edgeSymbolSize")(edgeSymbolSize.asInstanceOf[js.Any])
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (!js.isUndefined(focusNodeAdjacency)) __obj.updateDynamic("focusNodeAdjacency")(focusNodeAdjacency.asInstanceOf[js.Any])
    if (force != null) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (geoIndex != null) __obj.updateDynamic("geoIndex")(geoIndex.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverAnimation)) __obj.updateDynamic("hoverAnimation")(hoverAnimation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(legendHoverLink)) __obj.updateDynamic("legendHoverLink")(legendHoverLink.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (markArea != null) __obj.updateDynamic("markArea")(markArea.asInstanceOf[js.Any])
    if (markLine != null) __obj.updateDynamic("markLine")(markLine.asInstanceOf[js.Any])
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeScaleRatio != null) __obj.updateDynamic("nodeScaleRatio")(nodeScaleRatio.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (polarIndex != null) __obj.updateDynamic("polarIndex")(polarIndex.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (roam != null) __obj.updateDynamic("roam")(roam.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset.asInstanceOf[js.Any])
    if (symbolRotate != null) __obj.updateDynamic("symbolRotate")(symbolRotate.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesGraph_]
  }
}

