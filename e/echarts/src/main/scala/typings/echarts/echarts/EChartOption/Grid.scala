package typings.echarts.echarts.EChartOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drawing grid in rectangular coordinate.
  * In a single grid, at most two X and Y axes each is allowed.
  * Line chart, bar chart, and scatter chart (bubble chart) can be drawn in grid.
  *
  * @see https://echarts.apache.org/en/option.html#grid
  */
@js.native
trait Grid extends js.Object {
  
  /**
    * Background color of grid, which is transparent by default.
    * Attention: Works only if show: true is set.
    *
    * @default 'transparent'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Border color of grid. Support the same color format as backgroundColor.
    * Attention: Works only if show: true is set.
    *
    * @default '#ccc'
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /**
    * Border width of grid.
    * Attention: Works only if show: true is set.
    *
    * @default 1
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Distance between grid component and the bottom side of the container.
    * bottom value can be instant pixel value like 20; it can also be percentage value relative to container width like '20%'.
    *
    * @default 60
    */
  var bottom: js.UndefOr[Double | String] = js.native
  
  /**
    * Whether the grid region contains axis tick label of axis.
    * When containLabel is false:
    * grid.left grid.right grid.top grid.bottom grid.width grid.height decide the location
    * and size of the rectangle that is made of by xAxis and yAxis.
    * Setting to false will help when multiple grids need to be aligned at their axes.
    * When containLabel is true:
    * grid.left grid.right grid.top grid.bottom grid.width grid.height decide the location
    * and size of the rectangle that contains the axes and the labels of the axes.
    * Setting to true will help when the length of axis labels is dynamic and is hard to approximate.
    * This will avoid labels from overflowing the container or overlapping other components.
    *
    * @default false
    */
  var containLabel: js.UndefOr[Boolean] = js.native
  
  /**
    * Height of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Distance between grid component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default '10%'
    */
  var left: js.UndefOr[Double | String] = js.native
  
  /**
    * Distance between grid component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    *
    * @default '10%'
    */
  var right: js.UndefOr[Double | String] = js.native
  
  /**
    * Size of shadow blur. This attribute should be used along with
    * shadowColor,shadowOffsetX, shadowOffsetY to set shadow to component.
    * Attention:
    * This property works only if show: true is configured and
    * backgroundColor is defined other than transparent.
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /**
    * Shadow color. Support same format as color.
    * Attention: This property works only if show: true configured.
    */
  var shadowColor: js.UndefOr[String] = js.native
  
  /**
    * Offset distance on the horizontal direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Offset distance on the vertical direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  /**
    * Whether to show the grid in rectangular coordinate.
    *
    * @default false
    */
  var show: js.UndefOr[Boolean] = js.native
  
  /**
    * tooltip settings in the coordinate system component.
    * @see https://echarts.apache.org/en/option.html#grid.tooltip
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  
  /**
    * Distance between grid component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    *
    * @default 60
    */
  var top: js.UndefOr[Double | String] = js.native
  
  /**
    * Width of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var width: js.UndefOr[Double | String] = js.native
  
  /**
    * z value of all graphical elements in , which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @default 2
    */
  var z: js.UndefOr[Double] = js.native
  
  /**
    * zlevel value of all graphical elements in.
    * zlevel is used to make layers with Canvas.
    * Graphical elements with different zlevel values will be placed in different Canvases,
    * which is a common optimization technique.
    * We can put those frequently changed elements (like those with animations) to a seperate zlevel.
    * Notice that too many Canvases will increase memory cost, and should be used carefully on mobile phones to avoid crash.
    * Canvases with bigger zlevel will be placed on Canvases with smaller zlevel.
    *
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.native
}
object Grid {
  
  @scala.inline
  def apply(): Grid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grid]
  }
  
  @scala.inline
  implicit class GridOps[Self <: Grid] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setContainLabel(value: Boolean): Self = this.set("containLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainLabel: Self = this.set("containLabel", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTooltip(value: Tooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
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
