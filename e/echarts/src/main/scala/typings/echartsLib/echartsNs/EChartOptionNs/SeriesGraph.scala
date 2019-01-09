package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **relation graph**
  *
  * Graph is a diagram to represent
  * [nodes](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.nodes)
  * and the
  * [links](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links)
  * connecting nodes.
  *
  * **Tips:** In ECharts 2.x
  * , the diagram of `force` type will not be available in ECharts 3
  * any more, which has been changed to use `graph` to show graph data.
  * If you want to use force to lead the layout, you can set the
  * [layout](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.layout)
  * configuration as `'force'`.
  *
  * **Example:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph
  */
trait SeriesGraph extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.animationDurationUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.animationEasingUpdate
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.bottom
    */
  var bottom: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Index of
    * [calendar coordinates](https://ecomfe.github.io/echarts-doc/public/en/option.html#calendar)
    * to combine with, which is useful for multiple calendar coordinates
    * in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.calendarIndex
    */
  var calendarIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The categories of node, which is optional.
    * If there is a classification of nodes, the category of each node
    * can be assigned through
    * [data\[i\].category](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.category)
    *
    * And the style of category will also be applied to the style of
    * nodes. `categories` can also be used in
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.categories
    */
  var categories: js.UndefOr[echartsLib.Anon_EmphasisItemStyle] = js.undefined
  /**
    * Configuration about circular layout.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.circular
    */
  var circular: js.UndefOr[echartsLib.Anon_RotateLabel] = js.undefined
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
    * [xAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.xAxisIndex)
    * and
    * [yAxisIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'polar'`
    *
    * Use polar coordinates, with
    * [polarIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.polarIndex)
    * to assign the corresponding polar coordinate component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    * + `'none'`
    *
    * Do not use coordinate system.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.cursor
    */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Nodes list of graph.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data
    */
  var data: js.UndefOr[js.Array[echartsLib.echartsNs.EChartOptionNs.SeriesGraphNs.DataObject]] = js.undefined
  /**
    * If node is draggable.
    * Only available when using force-directed layout.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.draggable
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.edgeLabel
    */
  var edgeLabel: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamily
  ] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.edgeSymbol
    */
  var edgeSymbol: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
  /**
    * Size of symbol of two ends of edge line.
    * Can be an array or a single number.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph)
    *
    *
    * @default
    * 10
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.edgeSymbolSize
    */
  var edgeSymbolSize: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * Alias of
    * [links](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.edges
    */
  var edges: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_EdgeLabel] = js.undefined
  /**
    * Whether to focus/highlight the hover node and it's adjacencies.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.focusNodeAdjacency
    */
  var focusNodeAdjacency: js.UndefOr[scala.Boolean] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.force
    */
  var force: js.UndefOr[echartsLib.Anon_EdgeLength] = js.undefined
  /**
    * Index of
    * [geographic coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.geoIndex
    */
  var geoIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Height of component.
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.height
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Whether to enable the highlight animation effect of mousr hover
    * node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderTypeBorderWidthColor] = js.undefined
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily
  ] = js.undefined
  /**
    * Graph layout.
    *
    * **Options:**
    *
    * + `'none'` No any layout, use
    * [x](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.x)
    * ,
    * [y](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.y)
    * provided in
    * [node](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data)
    * as the position of node.
    *
    * + `'circular'` Adopt circular layout, see the example
    * [Les Miserables](https://ecomfe.github.io/echarts-examples/public/editor.html?c=graph-circular-layout)
    * .
    *
    * + `'force'` Adopt force-directed layout, see the example
    * [Force](https://ecomfe.github.io/echarts-examples/public/editor.html?c=graph-force)
    * , the detail about configrations of layout are in
    * [graph.force](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.force)
    *
    *
    * @default
    * "none"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.layout
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.left
    */
  var left: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The style of edge line.
    * [lineStyle.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.lineStyle.color)
    * can be `'source'` or `'target'`, which will use the color of
    * source node or target node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.lineStyle
    */
  var lineStyle: js.UndefOr[echartsLib.Anon_ColorCurvenessOpacityShadowBlur] = js.undefined
  /**
    * Relational data between nodes. Example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.links
    */
  var links: js.UndefOr[echartsLib.Anon_EmphasisLabel] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.markArea
    */
  var markArea: js.UndefOr[echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.markLine
    */
  var markLine: js.UndefOr[echartsLib.Anon_AnimationAnimationDelay] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.markPoint
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Related zooming ratio of nodes when mouse zooming in or out.
    * When it is set as 0, the node will not zoom as the mouse zooms.
    *
    *
    * @default
    * 0.6
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.nodeScaleRatio
    */
  var nodeScaleRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * Alias of
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.nodes
    */
  var nodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Index of
    * [polar coordinate](https://ecomfe.github.io/echarts-doc/public/en/option.html#polar)
    * to combine with, which is useful for multiple polar axes in one
    * chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.polarIndex
    */
  var polarIndex: js.UndefOr[scala.Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.right
    */
  var right: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Whether to enable mouse zooming and translating.
    * `false` by default.
    * If either zooming or translating is wanted, it can be set to
    * `'scale'` or `'move'`.
    * Otherwise, set it to be `true` to enable both.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.roam
    */
  var roam: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.silent
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.graph)
    *
    *
    * @default
    * "circle"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.symbol
    */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[scala.Boolean] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of node of relation graph symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.symbolRotate
    */
  var symbolRotate: js.UndefOr[scala.Double] = js.undefined
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
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-.data)
    * , and the second parameter `params` is the rest parameters of
    * data item.
    *
    *
    * @default
    * 10
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | scala.Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.top
    */
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @default
    * "graph"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of component.
    *
    *
    * @default
    * "auto"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.width
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Index of
    * [x axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Index of
    * [y axis](https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[scala.Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.z
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.zlevel
    */
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

