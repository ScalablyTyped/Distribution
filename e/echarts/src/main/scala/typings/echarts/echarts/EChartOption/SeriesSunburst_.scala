package typings.echarts.echarts.EChartOption

import typings.echarts.anon.BorderType
import typings.echarts.anon.Downplay
import typings.echarts.anon.MinAngle
import typings.echarts.anon.`22`
import typings.echarts.echarts.EChartOption.SeriesSunburst.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait SeriesSunburst_ extends js.Object {
  
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  
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
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  
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
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  
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
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  
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
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-sunburst.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  
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
  var center: js.UndefOr[js.Array[_]] = js.native
  
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
  var data: js.UndefOr[js.Array[DataObject]] = js.native
  
  /**
    * Item style when mouse is hovering unrelated items. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.downplay
    */
  var downplay: js.UndefOr[`22`] = js.native
  
  /**
    * Item style when mouse is hovering. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.emphasis
    */
  var emphasis: js.UndefOr[`22`] = js.native
  
  /**
    * Item style when mouse is hovering related items. See
    * [highlightPolicy](https://echarts.apache.org/en/option.html#series-sunburst.highlightPolicy)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.highlight
    */
  var highlight: js.UndefOr[`22`] = js.native
  
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
  var highlightPolicy: js.UndefOr[String] = js.native
  
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.id
    */
  var id: js.UndefOr[String] = js.native
  
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
  var itemStyle: js.UndefOr[BorderType] = js.native
  
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
  var label: js.UndefOr[MinAngle] = js.native
  
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
  var levels: js.UndefOr[Downplay] = js.native
  
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
  var name: js.UndefOr[String] = js.native
  
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
  var nodeClick: js.UndefOr[Boolean | String] = js.native
  
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
  var radius: js.UndefOr[js.Array[_] | Double | String] = js.native
  
  /**
    * If there is no `name`, whether need to render it.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sunburst.renderLabelForZeroData
    */
  var renderLabelForZeroData: js.UndefOr[Boolean] = js.native
  
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
  var sort: js.UndefOr[js.Function | String] = js.native
  
  /**
    * @default
    * "sunburst"
    * @see https://echarts.apache.org/en/option.html#series-sunburst.type
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
    * @see https://echarts.apache.org/en/option.html#series-sunburst.z
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
    * @see https://echarts.apache.org/en/option.html#series-sunburst.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}
object SeriesSunburst_ {
  
  @scala.inline
  def apply(): SeriesSunburst_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSunburst_]
  }
  
  @scala.inline
  implicit class SeriesSunburst_Ops[Self <: SeriesSunburst_] (val x: Self) extends AnyVal {
    
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
    def setCenterVarargs(value: js.Any*): Self = this.set("center", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: js.Array[_]): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: DataObject*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[DataObject]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDownplay(value: `22`): Self = this.set("downplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownplay: Self = this.set("downplay", js.undefined)
    
    @scala.inline
    def setEmphasis(value: `22`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    
    @scala.inline
    def setHighlight(value: `22`): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setHighlightPolicy(value: String): Self = this.set("highlightPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightPolicy: Self = this.set("highlightPolicy", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: MinAngle): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLevels(value: Downplay): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodeClick(value: Boolean | String): Self = this.set("nodeClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeClick: Self = this.set("nodeClick", js.undefined)
    
    @scala.inline
    def setRadiusVarargs(value: js.Any*): Self = this.set("radius", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: js.Array[_] | Double | String): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRenderLabelForZeroData(value: Boolean): Self = this.set("renderLabelForZeroData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderLabelForZeroData: Self = this.set("renderLabelForZeroData", js.undefined)
    
    @scala.inline
    def setSort(value: js.Function | String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
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
