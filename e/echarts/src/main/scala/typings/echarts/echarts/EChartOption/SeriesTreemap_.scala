package typings.echarts.echarts.EChartOption

import typings.echarts.AnonBorderColorSaturation
import typings.echarts.AnonBottom
import typings.echarts.AnonChildrenVisibleMin
import typings.echarts.AnonEllipsis
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonLink
import typings.echarts.AnonTextShadowOffsetX
import typings.echarts.AnonUpperLabel
import typings.echarts.echarts.EChartOption.SeriesTreemap.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Treemap](https://en.wikipedia.org/wiki/Treemapping)
  * is a common way to present "hierarchical data" or "tree data".It
  * primarily highlights the important nodes at all hierarchies in 『Tree』with
  * area.
  *
  * **Example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-treemap)
  *
  * **Visual Mapping:**
  *
  * treemap maps the numerical values to area.
  *
  * Moreover, it is able to map some dimensions of data to other visual
  * channel, like colors, lightness of colors and etc.
  *
  * About visual encoding, see details in
  * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
  * .
  *
  * **Drill Down:**
  *
  * The feature `drill down` means: when clicking a tree node, this node
  * will be set as root and its children will be shown. When
  * [leafDepth](https://echarts.apache.org/en/option.html#series-treemap.leafDepth)
  * is set, this feature is enabled.
  *
  * **An example about drill down:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-treemap)
  *
  * Notice: There are some difference in treemap configuration between
  * ECharts3 and ECharts2.
  * Some immature configuration ways are no longer supported:
  *
  * + The position method using `center/size` is no longer supported,
  * and `left/top/bottom/right/width/height` are used to position treemap,
  * as other components do.
  *
  * + The configuration item `breadcrumb` is moved outside `itemStyle/itemStyle.emphasis`,
  * and it is in the same level with `itemStyle` now.
  *
  * + The configuration item `root` is not avaliable temporarily.User
  * can zoom treemap to see some tiny or deep descendants, or using
  * [leafDepth](https://echarts.apache.org/en/option.html#series-treemap.leafDepth)
  * to enable the feature of "drill down".
  *
  * + The configuration item `label` is moved outside the `itemStyle/itemStyle.emphasis`,
  * and it is in the same level with `itemStyle` now.
  *
  * + The configuration items `itemStyle.childBorderWidth`
  * and `itemStyle.childBorderColor`
  * are not supported anymore (because in this way only 2 levels can
  * be defined).
  * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
  * is used to define all levels now.
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-treemap
  */
trait SeriesTreemap_ extends js.Object {
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    *
    * @default
    * 1500
    * @see https://echarts.apache.org/en/option.html#series-treemap.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "quinticInOut"
    * @see https://echarts.apache.org/en/option.html#series-treemap.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Distance between treemap component and the bottom side of the
    * container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-treemap.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.undefined
  /**
    * breadcrumb, showing the path of the current node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb
    */
  var breadcrumb: js.UndefOr[AnonBottom] = js.undefined
  /**
    * Children will not be shown when area size of a node is smaller
    * than this value (unit: px square).
    *
    * This can hide the details of nodes when the rectangular area
    * is not large enough.
    * When users zoom nodes, the child node would show if the area
    * is larger than this threshold.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `childrenVisibleMin` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.childrenVisibleMin
    */
  var childrenVisibleMin: js.UndefOr[Double] = js.undefined
  /**
    * It indicates the range of tranparent rate (color alpha) of the
    * series. The range of values is 0 ~ 1.
    *
    * For example, `colorAlpha` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorAlpha` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.colorAlpha
    */
  var colorAlpha: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Specify the rule according to which each node obtain color from
    * [color list](https://echarts.apache.org/en/option.html#series-treemap.levels.color)
    * . Optional values:
    *
    * + `'value'`:
    *
    * Map
    * [series-treemap.data.value](https://echarts.apache.org/en/option.html#series-treemap.data.value)
    * to color.
    *
    * In this way, the color of each node indicate its value.
    *
    * [visualDimension](https://echarts.apache.org/en/option.html#series-treemap.levels.visualDimension)
    * can be used to specify which dimension of
    * [data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * is used to perform visual mapping.
    *
    * + `'index'`:
    *
    * Map the `index` (ordinal number) of nodes to color.
    * Namely, in a level, the first node is mapped to the first color
    * of
    * [color list](https://echarts.apache.org/en/option.html#series-treemap.levels.color)
    * , and the second node gets the second color.
    *
    * In this way, adjacent nodes are distinguished by color.
    *
    * + `'id'`:
    *
    * Map
    * [series-treemap.data.id](https://echarts.apache.org/en/option.html#series-treemap.data.id)
    * to color.
    *
    * Since `id` is used to identify node, if user call `setOption`
    * to modify the tree, each node will remain the original color
    * before and after `setOption` called. See this
    * [example](https://echarts.apache.org/examples/en/editor.html?c=treemap-obama&edit=1&reset=1)
    * .
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorMappingBy` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @default
    * "index"
    * @see https://echarts.apache.org/en/option.html#series-treemap.colorMappingBy
    */
  var colorMappingBy: js.UndefOr[String] = js.undefined
  /**
    * It indicates the range of saturation (color alpha) of the series.
    * The range of values is 0 ~ 1.
    *
    * For example, `colorSaturation` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorSaturation` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.colorSaturation
    */
  var colorSaturation: js.UndefOr[Double] = js.undefined
  /**
    * the the data format of
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * is a forest. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.undefined
  /**
    * Marker when the node is able to be drilled down.
    *
    *
    * @default
    * '▶'
    * @see https://echarts.apache.org/en/option.html#series-treemap.drillDownIcon
    */
  var drillDownIcon: js.UndefOr[String] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.emphasis
    */
  var emphasis: js.UndefOr[AnonUpperLabel] = js.undefined
  /**
    * Height of treemap component.
    *
    *
    * @default
    * 80%
    * @see https://echarts.apache.org/en/option.html#series-treemap.height
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * > Tps: In treemap, `itemStyle` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorSaturation] = js.undefined
  /**
    * `label` decribes the style of the label in each node.
    *
    * > Tps: In treemap, `label` attribute could appear in more than
    * one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.label
    */
  var label: js.UndefOr[AnonEllipsis] = js.undefined
  /**
    * When `leafDepth` is set, the feature "drill down" is enabled,
    * which means when clicking a tree node, this node will be set
    * as root and its children will be shown.
    *
    * `leafDepth` represents how many levels are shown at most.
    * For example, when `leafDepth` is set to `1`, only one level will
    * be shown.
    *
    * `leafDepth` is `null`/`undefined` by default, which means that
    * "drill down" is disabled.
    *
    * **An example about drill down:**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.leafDepth
    */
  var leafDepth: js.UndefOr[Double] = js.undefined
  /**
    * Distance between treemap component and the left side of the container.
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.left
    */
  var left: js.UndefOr[Double | String] = js.undefined
  /**
    * **Multiple Levels Configuration**
    *
    * treemap adopts 4-level configuration:
    *
    * ```
    * "each node" --> "each level" --> "each series".
    *
    * ```
    *
    * That is, we can configurate each node, can also configurate each
    * level of the tree, or set overall configurations on each series.
    * The highest priority is node configuration.
    *
    * `levels` is configurations on each levels, which is used most.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    * **The Rules about Visual Mapping**
    *
    * When designing a treemap, we primarily focus on how to visually
    * distinguish "different levels", "different categories in the
    * same level", which requires appropriate settings of "rectangular
    * color", "border thickness", "border color" and even "color saturation
    * of rectangular" and so on on each level.
    *
    * See
    * [example](https://echarts.apache.org/examples/en/editor.html?c=treemap-disk&edit=1&reset=1)
    *
    * The top level is divided into several parts by colors "red",
    * "green", "blue", and etc
    *
    *
    *
    * In each color block, `colorSaturation` is used to distinguish
    * nodes in sublevel.
    * The border color of the top level is "white", while the border
    * color of the sublevel is the color that based on the current
    * block color and processed by `borderColorSaturation`.
    *
    * `treemap` uses this rule of visual configuration: each level
    * computes its visual value based on the configurations (`color`,
    * `colorSaturation`, `borderColor`, `colorSaturation`) on this
    * level.
    * If there is no certain configuration in a node, it inherits the
    * configuration from its parent.
    *
    * In this way, this effect can be configured: set a `color` list
    * on the parent level, and set `colorSaturation` on the child level,
    * and then each node in the parent level would obtain a color from
    * the `color` list, and each node in the child level would obtain
    * a value from `colorSaturation` and compound it with the color
    * inherited from its parent node to get its final color.
    *
    * **Dimensions and "Extra Visual Mapping"**
    *
    * See the example below: every `value` field is set as an Array,
    * in which each item in the array represents a dimension respectively.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    * `treemap` will map the first dimension (the first item of the
    * array) to "area".
    * If we want to express more information, we could map another
    * dimension (specified by
    * [series-treemap.visualDimension](https://echarts.apache.org/en/option.html#series-treemap.viusalDimension)
    * ) to another visual types, such as `colorSaturation` and so on.
    * See the
    * [example](https://echarts.apache.org/examples/en/editor.html?c=treemap-obama&edit=1&reset=1)
    * and select the legend 'Growth'.
    *
    * **How to avoid confusion by setting border/gap of node**
    *
    * If all of the border/gaps are set with the same color, confusion
    * might occur when rectangulars in different levels display at
    * the same time.
    *
    * See the
    * [example](https://echarts.apache.org/examples/en/editor.html?c=doc-example/treemap-borderColor&edit=1&reset=1)
    *
    * Noticed that the child rectangles in the red area are in the
    * deeper level than rectangles that are saparated by white gap.
    * So in the red area, basically we set gap color with red, and
    * use `borderColorSaturation` to lift the saturation.
    *
    * **Explanation about borderWidth, gapWidth, borderColor**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    *
    * @default
    * []
    * @see https://echarts.apache.org/en/option.html#series-treemap.levels
    */
  var levels: js.UndefOr[AnonChildrenVisibleMin] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The behaviour when clicking a node. Optional values are:
    *
    * + `false`: Do nothing after clicked.
    * + `'zoomToNode'`: Zoom to clicked node.
    * + `'link'`: If there is
    * [link](https://echarts.apache.org/en/option.html#series-treemap.data.link)
    * in node data, do hyperlink jump after clicked.
    *
    *
    * @default
    * "zoomToNode"
    * @see https://echarts.apache.org/en/option.html#series-treemap.nodeClick
    */
  var nodeClick: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Distance between treemap component and the right side of the
    * container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-treemap.right
    */
  var right: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether to enable dragging roam (move and zoom).
    * Optional values are:
    *
    * + `false`: roam is disabled.
    * + `'scale'` or `'zoom'`: zoom only.
    * + `'move'` or `'pan'`: move (translation) only.
    * + `true`: both zoom and move (translation) are avaliable.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-treemap.roam
    */
  var roam: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.silent
    */
  var silent: js.UndefOr[AnonLink] = js.undefined
  /**
    * The expected square ratio.
    * Layout would approach the ratio as close as possible.
    *
    * It defaults to be the golden ratio: `0.5
    * * (1 + Math.sqrt(5))`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.squareRatio
    */
  var squareRatio: js.UndefOr[Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * Distance between treemap component and the top side of the container.
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.top
    */
  var top: js.UndefOr[Double | String] = js.undefined
  /**
    * @default
    * "treemap"
    * @see https://echarts.apache.org/en/option.html#series-treemap.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * `upperLabel` is used to specify whether show label when the node
    * has children. When
    * [upperLabel.show](https://echarts.apache.org/en/option.html#series-treemap.upperLabel.show)
    * is set as `true`, the feature that "show parent label" is enabled.
    *
    * The same as
    * [series-treemap.label](https://echarts.apache.org/en/option.html#series-treemap.label)
    * , the option `upperLabel` can be placed at the root of
    * [series-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * directly, or in
    * [series-treemap.level](https://echarts.apache.org/en/option.html#series-treemap.level)
    * , or in each item of
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * .
    *
    * Specifically,
    * [series-treemap.label](https://echarts.apache.org/en/option.html#series-treemap.label)
    * specifies the style when a node is a leaf, while `upperLabel`
    * specifies the style when a node has children, in which case the
    * label is displayed in the inner top of the node.
    *
    * See:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-treemap.treemap)
    *
    * > Tps: In treemap, `label` attribute could appear in more than
    * one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.upperLabel
    */
  var upperLabel: js.UndefOr[AnonTextShadowOffsetX] = js.undefined
  /**
    * A node will not be shown when its area size is smaller than this
    * value (unit: px square).
    *
    * In this way, tiny nodes will be hidden, otherwise they will huddle
    * together.
    * When user zoom the treemap, the area size will increase and the
    * rectangle will be shown if the area size is larger than this
    * threshold.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visibleMin` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-treemap.visibleMin
    */
  var visibleMin: js.UndefOr[Double] = js.undefined
  /**
    * `treemap` is able to map any dimensions of data to visual.
    *
    * The value of
    * [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * can be an array.
    * And each item of the array represents a "dimension".
    * `visualDimension` specifies the dimension on which visual mapping
    * will be performed.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visualDimension` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://echarts.apache.org/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://echarts.apache.org/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://echarts.apache.org/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.visualDimension
    */
  var visualDimension: js.UndefOr[Double] = js.undefined
  /**
    * The maximal value of current level.
    * Auto-statistics by default.
    *
    * When
    * [colorMappingBy](https://echarts.apache.org/en/option.html#series-treemap.levels.colorMappingBy)
    * is set to `'value'`, you are able to specify extent manually
    * for visual mapping by specifying `visualMin` or `visualMax`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.visualMax
    */
  var visualMax: js.UndefOr[Double] = js.undefined
  /**
    * The minimal value of current level.
    * Auto-statistics by default.
    *
    * When
    * [colorMappingBy](https://echarts.apache.org/en/option.html#series-treemap.levels.colorMappingBy)
    * is set to `'value'`, you are able to specify extent manually
    * for visual mapping by specifying `visualMin` or `visualMax`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.visualMin
    */
  var visualMin: js.UndefOr[Double] = js.undefined
  /**
    * Width of treemap component.
    *
    *
    * @default
    * 80%
    * @see https://echarts.apache.org/en/option.html#series-treemap.width
    */
  var width: js.UndefOr[Double | String] = js.undefined
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.z
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
    * @see https://echarts.apache.org/en/option.html#series-treemap.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
  /**
    * The treemap will be auto zoomed to a appropriate ratio when a
    * node is clicked (when
    * [nodeClick](https://echarts.apache.org/en/option.html#series-treemap.nodeClick)
    * is set as `'zoomToNode'` and no drill down happens).
    * This configuration item indicates the ratio.
    *
    *
    * @default
    * 0.32*0.32
    * @see https://echarts.apache.org/en/option.html#series-treemap.zoomToNodeRatio
    */
  var zoomToNodeRatio: js.UndefOr[Double] = js.undefined
}

object SeriesTreemap_ {
  @scala.inline
  def apply(
    animationDelay: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationEasing: String = null,
    bottom: Double | String = null,
    breadcrumb: AnonBottom = null,
    childrenVisibleMin: Int | Double = null,
    colorAlpha: js.Array[_] = null,
    colorMappingBy: String = null,
    colorSaturation: Int | Double = null,
    data: js.Array[DataObject] = null,
    drillDownIcon: String = null,
    emphasis: AnonUpperLabel = null,
    height: Double | String = null,
    id: String = null,
    itemStyle: AnonBorderColorSaturation = null,
    label: AnonEllipsis = null,
    leafDepth: Int | Double = null,
    left: Double | String = null,
    levels: AnonChildrenVisibleMin = null,
    name: String = null,
    nodeClick: Boolean | String = null,
    right: Double | String = null,
    roam: Boolean | String = null,
    silent: AnonLink = null,
    squareRatio: Int | Double = null,
    tooltip: AnonExtraCssText = null,
    top: Double | String = null,
    `type`: String = null,
    upperLabel: AnonTextShadowOffsetX = null,
    visibleMin: Int | Double = null,
    visualDimension: Int | Double = null,
    visualMax: Int | Double = null,
    visualMin: Int | Double = null,
    width: Double | String = null,
    z: Int | Double = null,
    zlevel: Int | Double = null,
    zoomToNodeRatio: Int | Double = null
  ): SeriesTreemap_ = {
    val __obj = js.Dynamic.literal()
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (childrenVisibleMin != null) __obj.updateDynamic("childrenVisibleMin")(childrenVisibleMin.asInstanceOf[js.Any])
    if (colorAlpha != null) __obj.updateDynamic("colorAlpha")(colorAlpha.asInstanceOf[js.Any])
    if (colorMappingBy != null) __obj.updateDynamic("colorMappingBy")(colorMappingBy.asInstanceOf[js.Any])
    if (colorSaturation != null) __obj.updateDynamic("colorSaturation")(colorSaturation.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (drillDownIcon != null) __obj.updateDynamic("drillDownIcon")(drillDownIcon.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leafDepth != null) __obj.updateDynamic("leafDepth")(leafDepth.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeClick != null) __obj.updateDynamic("nodeClick")(nodeClick.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (roam != null) __obj.updateDynamic("roam")(roam.asInstanceOf[js.Any])
    if (silent != null) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (squareRatio != null) __obj.updateDynamic("squareRatio")(squareRatio.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (upperLabel != null) __obj.updateDynamic("upperLabel")(upperLabel.asInstanceOf[js.Any])
    if (visibleMin != null) __obj.updateDynamic("visibleMin")(visibleMin.asInstanceOf[js.Any])
    if (visualDimension != null) __obj.updateDynamic("visualDimension")(visualDimension.asInstanceOf[js.Any])
    if (visualMax != null) __obj.updateDynamic("visualMax")(visualMax.asInstanceOf[js.Any])
    if (visualMin != null) __obj.updateDynamic("visualMin")(visualMin.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    if (zoomToNodeRatio != null) __obj.updateDynamic("zoomToNodeRatio")(zoomToNodeRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTreemap_]
  }
}

