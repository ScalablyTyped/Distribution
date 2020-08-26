package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationDelay
import typings.echarts.anon.AnimationDelayUpdate
import typings.echarts.anon.AnimationDuration
import typings.echarts.anon.BorderRadius
import typings.echarts.anon.EdgeLabel
import typings.echarts.anon.EdgeLength
import typings.echarts.anon.FontSize
import typings.echarts.anon.RotateLabel
import typings.echarts.anon.ShadowColor
import typings.echarts.anon.ShadowOffsetY
import typings.echarts.echarts.EChartOption.SeriesGraph.CategoryObject
import typings.echarts.echarts.EChartOption.SeriesGraph.DataObject
import typings.echarts.echarts.EChartOption.SeriesGraph.LinkObject
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
@js.native
trait SeriesGraph_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-graph.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
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
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
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
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
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
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-graph.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-graph.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-graph.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
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
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * Index of
    * [calendar coordinates](https://echarts.apache.org/en/option.html#calendar)
    * to combine with, which is useful for multiple calendar coordinates
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.calendarIndex
    */
  var calendarIndex: js.UndefOr[Double] = js.native
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
  var categories: js.UndefOr[js.Array[CategoryObject]] = js.native
  /**
    * Configuration about circular layout.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.circular
    */
  var circular: js.UndefOr[RotateLabel] = js.native
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
  var coordinateSystem: js.UndefOr[String] = js.native
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://echarts.apache.org/en/option.html#series-graph.cursor
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Nodes list of graph.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.native
  /**
    * If node is draggable.
    * Only available when using force-directed layout.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.draggable
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.edgeLabel
    */
  var edgeLabel: js.UndefOr[FontSize] = js.native
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
  var edgeSymbol: js.UndefOr[js.Array[_] | String] = js.native
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
  var edgeSymbolSize: js.UndefOr[js.Array[_] | Double] = js.native
  /**
    * Alias of
    * [links](https://echarts.apache.org/en/option.html#series-graph.links)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.edges
    */
  var edges: js.UndefOr[js.Array[_]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.emphasis
    */
  var emphasis: js.UndefOr[EdgeLabel] = js.native
  /**
    * Whether to focus/highlight the hover node and it's adjacencies.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.focusNodeAdjacency
    */
  var focusNodeAdjacency: js.UndefOr[Boolean] = js.native
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
  var force: js.UndefOr[EdgeLength] = js.native
  /**
    * Index of
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.native
  /**
    * Height of component.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-graph.height
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Whether to enable the highlight animation effect of mousr hover
    * node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.itemStyle
    */
  var itemStyle: js.UndefOr[ShadowOffsetY] = js.native
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
  var label: js.UndefOr[BorderRadius] = js.native
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
  var layout: js.UndefOr[String] = js.native
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
  var left: js.UndefOr[Double | String] = js.native
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
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  /**
    * The style of edge line.
    * [lineStyle.color](https://echarts.apache.org/en/option.html#series-graph.lineStyle.color)
    * can be `'source'` or `'target'`, which will use the color of
    * source node or target node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.native
  /**
    * Relational data between nodes. Example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.links
    */
  var links: js.UndefOr[js.Array[LinkObject]] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.markArea
    */
  var markArea: js.UndefOr[AnimationDelayUpdate] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.markLine
    */
  var markLine: js.UndefOr[AnimationDelay] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.markPoint
    */
  var markPoint: js.UndefOr[AnimationDuration] = js.native
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
  var name: js.UndefOr[String] = js.native
  /**
    * Related zooming ratio of nodes when mouse zooming in or out.
    * When it is set as 0, the node will not zoom as the mouse zooms.
    *
    *
    * @default
    * 0.6
    * @see https://echarts.apache.org/en/option.html#series-graph.nodeScaleRatio
    */
  var nodeScaleRatio: js.UndefOr[Double] = js.native
  /**
    * Alias of
    * [data](https://echarts.apache.org/en/option.html#series-graph.data)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.nodes
    */
  var nodes: js.UndefOr[js.Array[_]] = js.native
  /**
    * Index of
    * [polar coordinate](https://echarts.apache.org/en/option.html#polar)
    * to combine with, which is useful for multiple polar axes in one
    * chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.polarIndex
    */
  var polarIndex: js.UndefOr[Double] = js.native
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
  var right: js.UndefOr[Double | String] = js.native
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
  var roam: js.UndefOr[Boolean | String] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
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
  var symbol: js.UndefOr[String] = js.native
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
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
  var symbolOffset: js.UndefOr[js.Array[_]] = js.native
  /**
    * Rotate degree of node of relation graph symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.native
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
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | Double] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
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
  var top: js.UndefOr[Double | String] = js.native
  /**
    * @default
    * "graph"
    * @see https://echarts.apache.org/en/option.html#series-graph.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Width of component.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-graph.width
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.native
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-graph.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesGraph_ {
  @scala.inline
  def apply(): SeriesGraph_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesGraph_]
  }
  @scala.inline
  implicit class SeriesGraph_Ops[Self <: SeriesGraph_] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setCalendarIndex(value: Double): Self = this.set("calendarIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarIndex: Self = this.set("calendarIndex", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: CategoryObject*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[CategoryObject]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setCircular(value: RotateLabel): Self = this.set("circular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    @scala.inline
    def setCoordinateSystem(value: String): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinateSystem: Self = this.set("coordinateSystem", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDataVarargs(value: DataObject*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[DataObject]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEdgeLabel(value: FontSize): Self = this.set("edgeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeLabel: Self = this.set("edgeLabel", js.undefined)
    @scala.inline
    def setEdgeSymbolVarargs(value: js.Any*): Self = this.set("edgeSymbol", js.Array(value :_*))
    @scala.inline
    def setEdgeSymbol(value: js.Array[_] | String): Self = this.set("edgeSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeSymbol: Self = this.set("edgeSymbol", js.undefined)
    @scala.inline
    def setEdgeSymbolSizeVarargs(value: js.Any*): Self = this.set("edgeSymbolSize", js.Array(value :_*))
    @scala.inline
    def setEdgeSymbolSize(value: js.Array[_] | Double): Self = this.set("edgeSymbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeSymbolSize: Self = this.set("edgeSymbolSize", js.undefined)
    @scala.inline
    def setEdgesVarargs(value: js.Any*): Self = this.set("edges", js.Array(value :_*))
    @scala.inline
    def setEdges(value: js.Array[_]): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    @scala.inline
    def setEmphasis(value: EdgeLabel): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setFocusNodeAdjacency(value: Boolean): Self = this.set("focusNodeAdjacency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusNodeAdjacency: Self = this.set("focusNodeAdjacency", js.undefined)
    @scala.inline
    def setForce(value: EdgeLength): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setGeoIndex(value: Double): Self = this.set("geoIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoIndex: Self = this.set("geoIndex", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHoverAnimation(value: Boolean): Self = this.set("hoverAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverAnimation: Self = this.set("hoverAnimation", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemStyle(value: ShadowOffsetY): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: BorderRadius): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLegendHoverLink(value: Boolean): Self = this.set("legendHoverLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendHoverLink: Self = this.set("legendHoverLink", js.undefined)
    @scala.inline
    def setLineStyle(value: ShadowColor): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setLinksVarargs(value: LinkObject*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[LinkObject]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setMarkArea(value: AnimationDelayUpdate): Self = this.set("markArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkArea: Self = this.set("markArea", js.undefined)
    @scala.inline
    def setMarkLine(value: AnimationDelay): Self = this.set("markLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkLine: Self = this.set("markLine", js.undefined)
    @scala.inline
    def setMarkPoint(value: AnimationDuration): Self = this.set("markPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkPoint: Self = this.set("markPoint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNodeScaleRatio(value: Double): Self = this.set("nodeScaleRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeScaleRatio: Self = this.set("nodeScaleRatio", js.undefined)
    @scala.inline
    def setNodesVarargs(value: js.Any*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[_]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    @scala.inline
    def setPolarIndex(value: Double): Self = this.set("polarIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolarIndex: Self = this.set("polarIndex", js.undefined)
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setRoam(value: Boolean | String): Self = this.set("roam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoam: Self = this.set("roam", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setSymbolKeepAspect(value: Boolean): Self = this.set("symbolKeepAspect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolKeepAspect: Self = this.set("symbolKeepAspect", js.undefined)
    @scala.inline
    def setSymbolOffsetVarargs(value: js.Any*): Self = this.set("symbolOffset", js.Array(value :_*))
    @scala.inline
    def setSymbolOffset(value: js.Array[_]): Self = this.set("symbolOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolOffset: Self = this.set("symbolOffset", js.undefined)
    @scala.inline
    def setSymbolRotate(value: Double): Self = this.set("symbolRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolRotate: Self = this.set("symbolRotate", js.undefined)
    @scala.inline
    def setSymbolSizeVarargs(value: js.Any*): Self = this.set("symbolSize", js.Array(value :_*))
    @scala.inline
    def setSymbolSize(value: js.Array[_] | js.Function | Double): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXAxisIndex(value: Double): Self = this.set("xAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisIndex: Self = this.set("xAxisIndex", js.undefined)
    @scala.inline
    def setYAxisIndex(value: Double): Self = this.set("yAxisIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisIndex: Self = this.set("yAxisIndex", js.undefined)
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

