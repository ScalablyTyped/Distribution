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
import scala.scalajs.js.annotation._

/**
  * @see https://echarts.apache.org/en/option.html#legend
  */
@JSName("Legend")
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
  var align: js.UndefOr[auto | left | right] = js.undefined
  /**
    * Whether to use animation when page scrolll.
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Duration of the page scroll animation.
    *
    * @default 800
    */
  var animationDurationUpdate: js.UndefOr[Double] = js.undefined
  /**
    * Background color of legend, which is transparent by default.
    * Color can be represented in RGB, for example 'rgb(128, 128, 128)'.
    * RGBA can be used when you need alpha channel, for example 'rgba(128, 128, 128, 0.5)'.
    * You may also use hexadecimal format, for example '#ccc'.
    *
    * @default 'transparent'
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Border color of legend. Support the same color format as backgroundColor.
    *
    * @default '#ccc'
    */
  var borderColor: js.UndefOr[String] = js.undefined
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
  var borderRadius: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * Border width of legend.
    *
    * @default 1
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Distance between legend component and the bottom side of the container.
    * bottom value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var bottom: js.UndefOr[String | Double] = js.undefined
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
  var data: js.UndefOr[js.Array[LegendDataObject | String]] = js.undefined
  /**
    * Formatter is used to format label of legend, which supports string template and callback function.
    *
    * @default null
    */
  var formatter: js.UndefOr[String | Formatter] = js.undefined
  /**
    * Height of legend component. Adaptive by default.
    *
    * @default 'auto'
    */
  var height: js.UndefOr[Double] = js.undefined
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
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Legend color when not selected.
    *
    * @default '#ccc'
    */
  var inactiveColor: js.UndefOr[String] = js.undefined
  /**
    * The distance between each legend, horizontal distance in horizontal layout,
    * and vertical distance in vertical layout.
    *
    * @default 10
    */
  var itemGap: js.UndefOr[Double] = js.undefined
  /**
    * Image height of legend symbol.
    *
    * @default 14
    */
  var itemHeight: js.UndefOr[Double] = js.undefined
  /**
    * Image width of legend symbol.
    *
    * @default 25
    */
  var itemWidth: js.UndefOr[Double] = js.undefined
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
  var left: js.UndefOr[String | Double] = js.undefined
  /**
    * The layout orientation of legend.
    *
    * @default 'horizontal'
    */
  var orient: js.UndefOr[horizontal | vertical] = js.undefined
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
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * It works when legend.type is 'scroll'.
    * The gap between page buttons and legend items.
    *
    * @default null
    */
  var pageButtonGap: js.UndefOr[Double] = js.undefined
  /**
    * It works when legend.type is 'scroll'.
    * The gap between page buttons and page info text.
    *
    * @default 5
    */
  var pageButtonItemGap: js.UndefOr[Double] = js.undefined
  /**
    * It works when legend.type is 'scroll'.
    * The position of page buttons and page info. Optional values:
    * 'start': on the left or top.
    * 'end': on the right or bottom.
    *
    * @default 'end'
    */
  var pageButtonPosition: js.UndefOr[start | end] = js.undefined
  /**
    * It works when legend.type is 'scroll'.
    * Page info formatter. It is '{current}/{total}' by default,
    * where {current} is current page number (start from 1), and {total} is the total page number.
    *
    * @default '{current}/{total}'
    */
  var pageFormatter: js.UndefOr[String | PageFormatter] = js.undefined
  /**
    * It works when legend.type is 'scroll'.
    * The color of page buttons.
    *
    * @default '#2f4554'
    */
  var pageIconColor: js.UndefOr[String] = js.undefined
  /**
    * It works when legend.type is 'scroll'.
    * The color of page buttons when they are inactive.
    *
    * @default '#aaa'
    */
  var pageIconInactiveColor: js.UndefOr[String] = js.undefined
  /**
    * It works when legend.type is 'scroll'.
    * The size of page buttons. It can be a number, or an array, like [10, 3], represents [width, height].
    *
    * @default 15
    */
  var pageIconSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#legend.pageIcons
    */
  var pageIcons: js.UndefOr[PageIcons] = js.undefined
  /**
    * It works when legend.type is 'scroll'.
    * The text style of page info.
    */
  var pageTextStyle: js.UndefOr[TextStyle] = js.undefined
  /**
    * Distance between legend component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var right: js.UndefOr[String | Double] = js.undefined
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
  var scrollDataIndex: js.UndefOr[Double] = js.undefined
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
  var selected: js.UndefOr[js.Object] = js.undefined
  /**
    * Selected mode of legend, which controls whether series can be toggled displaying by clicking legends.
    * It is enabled by default, and you may set it to be false to disabled it.
    * Besides, it can be set to 'single' or 'multiple', for single selection and multiple selection.
    *
    * @default true
    */
  var selectedMode: js.UndefOr[Boolean | single | multiple] = js.undefined
  /**
    * Size of shadow blur. This attribute should be used along with shadowColor,
    * shadowOffsetX, shadowOffsetY to set shadow to component.
    * Attention:
    * This property works only if show: true is configured and backgroundColor is defined other than transparent.
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as color.
    * Attention: This property works only if show: true configured.
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /**
    * Whether to show the legend component.
    * @default true
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to keep aspect for icons
    * (from series.symbol or user-defined legend.data.icon) in the form of path://.
    *
    * @default true
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  /**
    * Legend text style.
    */
  var textStyle: js.UndefOr[TextStyleWithRich] = js.undefined
  /**
    * Tooltip configuration for legend tooltip, which is similar to tooltip.
    *
    * @see https://echarts.apache.org/en/option.html#legend.tooltip
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
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
  var top: js.UndefOr[String | Double] = js.undefined
  /**
    * Type of legend.
    * Optional values:
    *  'plain': Simple legend. (default)
    *  'scroll': Scrollable legend. It helps when too
    *   many legend items needed to be shown.
    *
    * @default 'plain'
    */
  var `type`: js.UndefOr[plain | scroll] = js.undefined
  /**
    * Width of legend component. Adaptive by default.
    *
    * @default 'auto'
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * z value of all graphical elements in, which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @deafult 2
    */
  var z: js.UndefOr[Double] = js.undefined
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
  var zlevel: js.UndefOr[Double] = js.undefined
}

object Legend_ {
  @scala.inline
  def apply(
    align: auto | left | right = null,
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDurationUpdate: Int | Double = null,
    backgroundColor: String = null,
    borderColor: String = null,
    borderRadius: Double | js.Array[Double] = null,
    borderWidth: Int | Double = null,
    bottom: String | Double = null,
    data: js.Array[LegendDataObject | String] = null,
    formatter: String | Formatter = null,
    height: Int | Double = null,
    icon: String = null,
    id: String = null,
    inactiveColor: String = null,
    itemGap: Int | Double = null,
    itemHeight: Int | Double = null,
    itemWidth: Int | Double = null,
    left: String | Double = null,
    orient: horizontal | vertical = null,
    padding: Double | js.Array[Double] = null,
    pageButtonGap: Int | Double = null,
    pageButtonItemGap: Int | Double = null,
    pageButtonPosition: start | end = null,
    pageFormatter: String | PageFormatter = null,
    pageIconColor: String = null,
    pageIconInactiveColor: String = null,
    pageIconSize: Double | js.Array[Double] = null,
    pageIcons: PageIcons = null,
    pageTextStyle: TextStyle = null,
    right: String | Double = null,
    scrollDataIndex: Int | Double = null,
    selected: js.Object = null,
    selectedMode: Boolean | single | multiple = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    symbolKeepAspect: js.UndefOr[Boolean] = js.undefined,
    textStyle: TextStyleWithRich = null,
    tooltip: Tooltip = null,
    top: String | Double = null,
    `type`: plain | scroll = null,
    width: Int | Double = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): Legend_ = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor)
    if (itemGap != null) __obj.updateDynamic("itemGap")(itemGap.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pageButtonGap != null) __obj.updateDynamic("pageButtonGap")(pageButtonGap.asInstanceOf[js.Any])
    if (pageButtonItemGap != null) __obj.updateDynamic("pageButtonItemGap")(pageButtonItemGap.asInstanceOf[js.Any])
    if (pageButtonPosition != null) __obj.updateDynamic("pageButtonPosition")(pageButtonPosition.asInstanceOf[js.Any])
    if (pageFormatter != null) __obj.updateDynamic("pageFormatter")(pageFormatter.asInstanceOf[js.Any])
    if (pageIconColor != null) __obj.updateDynamic("pageIconColor")(pageIconColor)
    if (pageIconInactiveColor != null) __obj.updateDynamic("pageIconInactiveColor")(pageIconInactiveColor)
    if (pageIconSize != null) __obj.updateDynamic("pageIconSize")(pageIconSize.asInstanceOf[js.Any])
    if (pageIcons != null) __obj.updateDynamic("pageIcons")(pageIcons)
    if (pageTextStyle != null) __obj.updateDynamic("pageTextStyle")(pageTextStyle)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (scrollDataIndex != null) __obj.updateDynamic("scrollDataIndex")(scrollDataIndex.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (selectedMode != null) __obj.updateDynamic("selectedMode")(selectedMode.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend_]
  }
}

