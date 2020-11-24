package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.Legend.Formatter
import typings.echarts.echarts.EChartOption.Legend.LegendDataObject
import typings.echarts.echarts.EChartOption.Legend.PageFormatter
import typings.echarts.echarts.EChartOption.Legend.PageIcons
import typings.echarts.echartsStrings.auto
import typings.echarts.echartsStrings.end
import typings.echarts.echartsStrings.horizontal
import typings.echarts.echartsStrings.left
import typings.echarts.echartsStrings.multiple
import typings.echarts.echartsStrings.plain
import typings.echarts.echartsStrings.right
import typings.echarts.echartsStrings.scroll
import typings.echarts.echartsStrings.single
import typings.echarts.echartsStrings.start
import typings.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://echarts.apache.org/en/option.html#legend
  */
@js.native
trait Legend_ extends js.Object {
  
  /**
    * Legend mrker and text aligning. By default,
    * it automatically calculates from component location and orient.
    * When left value of this component is 'right',
    * and the vertical layout (orient is 'vertical'),
    * it would be aligned to 'right'.
    *
    * @default 'auto'
    */
  var align: js.UndefOr[auto | left | right] = js.native
  
  /**
    * Whether to use animation when page scrolll.
    */
  var animation: js.UndefOr[Boolean] = js.native
  
  /**
    * Duration of the page scroll animation.
    *
    * @default 800
    */
  var animationDurationUpdate: js.UndefOr[Double] = js.native
  
  /**
    * Background color of legend, which is transparent by default.
    * Color can be represented in RGB, for example 'rgb(128, 128, 128)'.
    * RGBA can be used when you need alpha channel, for example 'rgba(128, 128, 128, 0.5)'.
    * You may also use hexadecimal format, for example '#ccc'.
    *
    * @default 'transparent'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Border color of legend. Support the same color format as backgroundColor.
    *
    * @default '#ccc'
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /**
    * The radius of rounded corner. Its unit is px.
    * And it supports use array to respectively specify the 4 corner radiuses.
    *
    * @default 0
    *
    * @example
    *
    * ```
    * borderRadius: 5, // consistently set the size of 4 rounded corners
    * borderRadius: [5, 5, 0, 0] // (clockwise upper left, upper right, bottom right and bottom left)
    * ```
    */
  var borderRadius: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * Border width of legend.
    *
    * @default 1
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Distance between legend component and the bottom side of the container.
    * bottom value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var bottom: js.UndefOr[String | Double] = js.native
  
  /**
    * Data array of legend. An array item is usually a name representing string.
    * (If it is a pie chart, it could also be the name of a single data in the pie chart) of a series.
    * Legend component would automatically calculate the color and icon according to series.
    * Special string '' (null string) or '\n' (new line string) can be used for a new line.
    * If data is not specified, it will be auto collected from series. For most of series,
    * it will be collected from series.name or the dimension name specified by seriesName of series.encode.
    * For some types of series like pie and funnel, it will be collected from the name field of series.data.
    * If you need to set the style for a single item, you may also set the configuration of it.
    * In this case, name attribute is used to represent name of series.
    *
    * @see https://echarts.apache.org/en/option.html#legend.data
    */
  var data: js.UndefOr[js.Array[LegendDataObject | String]] = js.native
  
  /**
    * Formatter is used to format label of legend, which supports string template and callback function.
    *
    * @default null
    */
  var formatter: js.UndefOr[String | Formatter] = js.native
  
  /**
    * Height of legend component. Adaptive by default.
    *
    * @default 'auto'
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Icon of the legend items.
    * Icon types provided by ECharts includes 'circle', 'rect', 'roundRect', 'triangle', 'diamond', 'pin', 'arrow', 'none'
    * It can be set to an image with 'image://url' , in which URL is the link to an image, or dataURI of an image.
    * Icons can be set to arbitrary vector path via 'path://' in ECharts.
    * As compared with raster image, vector paths prevent from jagging and blurring when scaled,
    * and have a better control over changing colors. Size of vectoer icon will be adapted automatically.
    * Refer to SVG PathData for more information about format of path. You may export vector paths from tools like Adobe Illustrator.
    *
    * @see https://echarts.apache.org/en/option.html#legend.icon
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Legend color when not selected.
    *
    * @default '#ccc'
    */
  var inactiveColor: js.UndefOr[String] = js.native
  
  /**
    * The distance between each legend, horizontal distance in horizontal layout,
    * and vertical distance in vertical layout.
    *
    * @default 10
    */
  var itemGap: js.UndefOr[Double] = js.native
  
  /**
    * Image height of legend symbol.
    *
    * @default 14
    */
  var itemHeight: js.UndefOr[Double] = js.native
  
  /**
    * Image width of legend symbol.
    *
    * @default 25
    */
  var itemWidth: js.UndefOr[Double] = js.native
  
  /**
    * Distance between legend component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default 'auto'
    */
  var left: js.UndefOr[String | Double] = js.native
  
  /**
    * The layout orientation of legend.
    *
    * @default 'horizontal'
    */
  var orient: js.UndefOr[horizontal | vertical] = js.native
  
  /**
    * Legend space around content.
    * The unit is px. Default values for each position are 5.
    * And they can be set to different values with left, right, top, and bottom.
    *
    * @example
    * ```
    * // Set padding to be 5
    * padding: 5
    * // Set the top and bottom paddings to be 5, and left and right paddings to be 10
    * padding: [5, 10]
    * // Set each of the four paddings seperately
    * padding: [
    *    5,  // up
    *    10, // right
    *    5,  // down
    *    10, // left
    * ]
    * ```
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * It works when legend.type is 'scroll'.
    * The gap between page buttons and legend items.
    *
    * @default null
    */
  var pageButtonGap: js.UndefOr[Double] = js.native
  
  /**
    * It works when legend.type is 'scroll'.
    * The gap between page buttons and page info text.
    *
    * @default 5
    */
  var pageButtonItemGap: js.UndefOr[Double] = js.native
  
  /**
    * It works when legend.type is 'scroll'.
    * The position of page buttons and page info. Optional values:
    * 'start': on the left or top.
    * 'end': on the right or bottom.
    *
    * @default 'end'
    */
  var pageButtonPosition: js.UndefOr[start | end] = js.native
  
  /**
    * It works when legend.type is 'scroll'.
    * Page info formatter. It is '{current}/{total}' by default,
    * where {current} is current page number (start from 1), and {total} is the total page number.
    *
    * @default '{current}/{total}'
    */
  var pageFormatter: js.UndefOr[String | PageFormatter] = js.native
  
  /**
    * It works when legend.type is 'scroll'.
    * The color of page buttons.
    *
    * @default '#2f4554'
    */
  var pageIconColor: js.UndefOr[String] = js.native
  
  /**
    * It works when legend.type is 'scroll'.
    * The color of page buttons when they are inactive.
    *
    * @default '#aaa'
    */
  var pageIconInactiveColor: js.UndefOr[String] = js.native
  
  /**
    * It works when legend.type is 'scroll'.
    * The size of page buttons. It can be a number, or an array, like [10, 3], represents [width, height].
    *
    * @default 15
    */
  var pageIconSize: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#legend.pageIcons
    */
  var pageIcons: js.UndefOr[PageIcons] = js.native
  
  /**
    * It works when legend.type is 'scroll'.
    * The text style of page info.
    */
  var pageTextStyle: js.UndefOr[TextStyle] = js.native
  
  /**
    * Distance between legend component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var right: js.UndefOr[String | Double] = js.native
  
  /**
    * It works when legend.type is 'scroll'.
    * dataIndex of the left top most displayed item.
    * Although the scrolling of legend items can be controlled by calling setOption and specifying this property,
    * we suggest that do not controll legend in this way unless necessary (setOption might be time-consuming),
    * but just use action legendScroll to do that.
    *
    * @default 0
    * @see https://echarts.apache.org/en/option.html#legend.scrollDataIndex
    */
  var scrollDataIndex: js.UndefOr[Double] = js.native
  
  /**
    * State table of selected legend.
    *
    * @example
    * ```
    * selected: {
    *   // selected'series 1'
    *   'series 1': true,
    *   // unselected'series 2'
    *   'series 2': false
    * }
    * ```
    */
  var selected: js.UndefOr[js.Object] = js.native
  
  /**
    * Selected mode of legend, which controls whether series can be toggled displaying by clicking legends.
    * It is enabled by default, and you may set it to be false to disabled it.
    * Besides, it can be set to 'single' or 'multiple', for single selection and multiple selection.
    *
    * @default true
    */
  var selectedMode: js.UndefOr[Boolean | single | multiple] = js.native
  
  /**
    * Size of shadow blur. This attribute should be used along with shadowColor,
    * shadowOffsetX, shadowOffsetY to set shadow to component.
    * Attention:
    * This property works only if show: true is configured and backgroundColor is defined other than transparent.
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
    * Whether to show the legend component.
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to keep aspect for icons
    * (from series.symbol or user-defined legend.data.icon) in the form of path://.
    *
    * @default true
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
  
  /**
    * Legend text style.
    */
  var textStyle: js.UndefOr[TextStyleWithRich] = js.native
  
  /**
    * Tooltip configuration for legend tooltip, which is similar to tooltip.
    *
    * @see https://echarts.apache.org/en/option.html#legend.tooltip
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  
  /**
    * Distance between legend component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    * If the left value is set to be 'top', 'middle', or 'bottom',
    * then the component will be aligned automatically based on position.
    *
    * @default 'auto'
    */
  var top: js.UndefOr[String | Double] = js.native
  
  /**
    * Type of legend.
    * Optional values:
    *  'plain': Simple legend. (default)
    *  'scroll': Scrollable legend. It helps when too
    *   many legend items needed to be shown.
    *
    * @default 'plain'
    */
  var `type`: js.UndefOr[plain | scroll] = js.native
  
  /**
    * Width of legend component. Adaptive by default.
    *
    * @default 'auto'
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * z value of all graphical elements in, which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @deafult 2
    */
  var z: js.UndefOr[Double] = js.native
  
  /**
    * zlevel value of all graphical elements in.
    * zlevel is used to make layers with Canvas.
    * Graphical elements with different zlevel values will be placed in different Canvases,
    * which is a common optimization technique.
    * We can put those frequently changed elements (like those with animations) to a seperate zlevel.
    * Notice that too many Canvases will increase memory cost,
    * and should be used carefully on mobile phones to avoid crash.
    * Canvases with bigger zlevel will be placed on Canvases with smaller zlevel.
    *
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.native
}
object Legend_ {
  
  @scala.inline
  def apply(): Legend_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Legend_]
  }
  
  @scala.inline
  implicit class Legend_Ops[Self <: Legend_] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: auto | left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationDurationUpdate(value: Double): Self = this.set("animationDurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDurationUpdate: Self = this.set("animationDurationUpdate", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadiusVarargs(value: Double*): Self = this.set("borderRadius", js.Array(value :_*))
    
    @scala.inline
    def setBorderRadius(value: Double | js.Array[Double]): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setBottom(value: String | Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (LegendDataObject | String)*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[LegendDataObject | String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFormatterFunction1(value: /* name */ String => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatter(value: String | Formatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInactiveColor(value: String): Self = this.set("inactiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveColor: Self = this.set("inactiveColor", js.undefined)
    
    @scala.inline
    def setItemGap(value: Double): Self = this.set("itemGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemGap: Self = this.set("itemGap", js.undefined)
    
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setLeft(value: String | Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setOrient(value: horizontal | vertical): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPageButtonGap(value: Double): Self = this.set("pageButtonGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageButtonGap: Self = this.set("pageButtonGap", js.undefined)
    
    @scala.inline
    def setPageButtonItemGap(value: Double): Self = this.set("pageButtonItemGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageButtonItemGap: Self = this.set("pageButtonItemGap", js.undefined)
    
    @scala.inline
    def setPageButtonPosition(value: start | end): Self = this.set("pageButtonPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageButtonPosition: Self = this.set("pageButtonPosition", js.undefined)
    
    @scala.inline
    def setPageFormatterFunction2(value: (/* current */ Double, /* total */ Double) => String): Self = this.set("pageFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPageFormatter(value: String | PageFormatter): Self = this.set("pageFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageFormatter: Self = this.set("pageFormatter", js.undefined)
    
    @scala.inline
    def setPageIconColor(value: String): Self = this.set("pageIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageIconColor: Self = this.set("pageIconColor", js.undefined)
    
    @scala.inline
    def setPageIconInactiveColor(value: String): Self = this.set("pageIconInactiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageIconInactiveColor: Self = this.set("pageIconInactiveColor", js.undefined)
    
    @scala.inline
    def setPageIconSizeVarargs(value: Double*): Self = this.set("pageIconSize", js.Array(value :_*))
    
    @scala.inline
    def setPageIconSize(value: Double | js.Array[Double]): Self = this.set("pageIconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageIconSize: Self = this.set("pageIconSize", js.undefined)
    
    @scala.inline
    def setPageIcons(value: PageIcons): Self = this.set("pageIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageIcons: Self = this.set("pageIcons", js.undefined)
    
    @scala.inline
    def setPageTextStyle(value: TextStyle): Self = this.set("pageTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageTextStyle: Self = this.set("pageTextStyle", js.undefined)
    
    @scala.inline
    def setRight(value: String | Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setScrollDataIndex(value: Double): Self = this.set("scrollDataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollDataIndex: Self = this.set("scrollDataIndex", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Object): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSelectedMode(value: Boolean | single | multiple): Self = this.set("selectedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedMode: Self = this.set("selectedMode", js.undefined)
    
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
    def setSymbolKeepAspect(value: Boolean): Self = this.set("symbolKeepAspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolKeepAspect: Self = this.set("symbolKeepAspect", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyleWithRich): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTooltip(value: Tooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTop(value: String | Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setType(value: plain | scroll): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
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
