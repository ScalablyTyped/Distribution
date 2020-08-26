package typings.echarts.echarts.EChartOption

import typings.echarts.anon.BorderRadius
import typings.echarts.anon.BorderType
import typings.echarts.anon.CurvenessShadowBlur
import typings.echarts.anon.EmphasisItemStyle
import typings.echarts.anon.`24`
import typings.echarts.echarts.EChartOption.SeriesTree.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Tree Diagram**
  *
  * The tree diagram is mainly used to visualize the tree data structure,
  * which is a special hierarchical type with a unique root node, left
  * subtree, and right subtree.
  *
  * **Note: Forests are not currently supported directly in a single
  * series, and can be implemented by configuring multiple series in
  * an option**
  *
  * **Tree example：**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-tree)
  *
  * **Multiple series are combined into forest：**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-tree)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-tree
  */
@js.native
trait SeriesTree_ extends js.Object {
  /**
    * Distance between tree component and the bottom side of the container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 12%
    * @see https://echarts.apache.org/en/option.html#series-tree.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * [series-tree.data](https://echarts.apache.org/en/option.html#series-tree.data)
    * the data format is a tree structure，for example：
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis
    */
  var emphasis: js.UndefOr[`24`] = js.native
  /**
    * Subtree collapses and expands interaction, `default true`.
    * As the drawing area is limited, and usually the nodes of a tree
    * may be more, so there will be hidden between the nodes.
    * In order to avoid this problem, you can put a temporary unrelated
    * subtree folded away, until you need to start when necessary.
    * Such as the above radial layout tree example, the center of the
    * node is filled with blue is the folded away subtree, you can
    * click to expand it.
    *
    * **Note: If you configure a custom image as the tag for a node,
    * it is not possible to distinguish whether the current node has
    * a collapsed subtree by the fill color.
    * And currently do not support, upload two pictures, respectively
    * represent the collapsing and expansion state of the node.
    * So, if you want to explicitly show the two states of the node,
    * it is recommended to use `ECharts` regular tag types, such as
    * `emptyCircle`.**
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-tree.expandAndCollapse
    */
  var expandAndCollapse: js.UndefOr[Boolean] = js.native
  /**
    * Height of tree component.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.height
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The initial level (depth) of the tree.
    * The root node is the 0th layer, then the first layer, the second
    * layer,
    *
    *
    *
    * , until the leaf node.
    * This configuration item is primarily used in conjunction with
    * `collapsing and expansion` interactions.
    * The purpose is to prevent the nodes from obscuring each other.
    * If set as -1 or `null` or `undefined`, all nodes are expanded.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-tree.initialTreeDepth
    */
  var initialTreeDepth: js.UndefOr[Double] = js.native
  /**
    * The style of each node in the tree, where \[itemStyle.color\]
    * (~ series-tree.itemStyle.color)
    * represents the fill color of the node, to distinguish the state
    * of the subtree corresponding to `collapsing` or `expansion`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * `label` describes the style of the text corresponding to each
    * node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.label
    */
  var label: js.UndefOr[BorderRadius] = js.native
  /**
    * The layout of the tree, which can be `orthogonal` and `radial`
    * 。Here the `orthogonal` layout is what we usually refer to the
    * `horizontal` and `vertical` direction, the corresponding parameter
    * value is `orthogonal`.
    * The `radial` layout refers to the view that the root node as
    * the center and each layer of nodes as the ring, the corresponding
    * parameter value is `radial`.
    *
    * **Orthogonal Example：**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
    *
    * **Radial Example：**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
    *
    *
    * @default
    * "orthogonal"
    * @see https://echarts.apache.org/en/option.html#series-tree.layout
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Leaf node special configuration, such as the above tree diagram
    * example, the leaf node and non-leaf node label location is different.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves
    */
  var leaves: js.UndefOr[EmphasisItemStyle] = js.native
  /**
    * Distance between tree component and the left side of the container.
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
    * 12%
    * @see https://echarts.apache.org/en/option.html#series-tree.left
    */
  var left: js.UndefOr[Double | String] = js.native
  /**
    * Defines the style of the tree edge.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.lineStyle
    */
  var lineStyle: js.UndefOr[CurvenessShadowBlur] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The direction of the `orthogonal` layout in the tree diagram.
    * That means this configuration takes effect only if `layout =
    * 'orthogonal'`.
    * The corresponding directions are `from left to right`, `from
    * right to left`, `from top to bottom`, `from bottom to top`, with
    * shorthand values `'LR'`, `'RL'`, `'TB'`, `'BT'`.
    * **Note: The previous configuration value `'horizontal'` is equivalent
    * to `'LR'`, `'vertical'` is equivalent to `'TB'`.**
    *
    *
    * @default
    * "LR"
    * @see https://echarts.apache.org/en/option.html#series-tree.orient
    */
  var orient: js.UndefOr[String] = js.native
  /**
    * Distance between tree component and the right side of the container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 12%
    * @see https://echarts.apache.org/en/option.html#series-tree.right
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
    * @see https://echarts.apache.org/en/option.html#series-tree.roam
    */
  var roam: js.UndefOr[Boolean | String] = js.native
  /**
    * Symbol of .
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
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree)
    *
    *
    * @default
    * "emptyCircle"
    * @see https://echarts.apache.org/en/option.html#series-tree.symbol
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
  /**
    * Offset of symbol relative to original position.
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
    * @see https://echarts.apache.org/en/option.html#series-tree.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.native
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.native
  /**
    * symbol size.
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
    * [data](https://echarts.apache.org/en/option.html#series-tree.data)
    * , and the second parameter `params` is the rest parameters of
    * data item.
    *
    *
    * @default
    * 7
    * @see https://echarts.apache.org/en/option.html#series-tree.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | Double] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * Distance between tree component and the top side of the container.
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
    * 12%
    * @see https://echarts.apache.org/en/option.html#series-tree.top
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * @default
    * "tree"
    * @see https://echarts.apache.org/en/option.html#series-tree.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Width of tree component.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.width
    */
  var width: js.UndefOr[Double | String] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-tree.z
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
    * @see https://echarts.apache.org/en/option.html#series-tree.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesTree_ {
  @scala.inline
  def apply(): SeriesTree_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesTree_]
  }
  @scala.inline
  implicit class SeriesTree_Ops[Self <: SeriesTree_] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setDataVarargs(value: DataObject*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[DataObject]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEmphasis(value: `24`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setExpandAndCollapse(value: Boolean): Self = this.set("expandAndCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandAndCollapse: Self = this.set("expandAndCollapse", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInitialTreeDepth(value: Double): Self = this.set("initialTreeDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialTreeDepth: Self = this.set("initialTreeDepth", js.undefined)
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
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
    def setLeaves(value: EmphasisItemStyle): Self = this.set("leaves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaves: Self = this.set("leaves", js.undefined)
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLineStyle(value: CurvenessShadowBlur): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrient(value: String): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setRoam(value: Boolean | String): Self = this.set("roam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoam: Self = this.set("roam", js.undefined)
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
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    @scala.inline
    def setZlevel(value: Double): Self = this.set("zlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZlevel: Self = this.set("zlevel", js.undefined)
  }
  
}

