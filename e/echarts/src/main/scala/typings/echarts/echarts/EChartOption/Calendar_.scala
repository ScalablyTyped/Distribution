package typings.echarts.echarts.EChartOption

import typings.echarts.anon.BorderColor
import typings.echarts.echarts.EChartOption.Calendar.DayLabel
import typings.echarts.echarts.EChartOption.Calendar.MonthLabel
import typings.echarts.echarts.EChartOption.Calendar.YearLabel
import typings.echarts.echartsStrings.auto
import typings.echarts.echartsStrings.horizontal
import typings.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Calendar coordinates.
  *
  * @see https://echarts.apache.org/en/option.html#calendar
  */
trait Calendar_ extends js.Object {
  /**
    * Distance between calendar component and the bottom side of the container.
    * bottom value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var bottom: js.UndefOr[Double | String] = js.undefined
  /**
    * The size of each rect of calendar coordinates,
    * can be set to a single value or array,
    * the first element is width and the second element is height.
    * Support setting self-adaptation: auto, the default width and height to be 20.
    *
    * @default 20
    */
  var cellSize: js.UndefOr[Double | auto | (js.Array[auto | Double])] = js.undefined
  /**
    * Day style in calendar coordinates.
    * @see https://echarts.apache.org/en/option.html#calendar.dayLabel
    */
  var dayLabel: js.UndefOr[DayLabel] = js.undefined
  /**
    * The height of calendar coordinates.
    * Note: cellSize is 20 by default.
    * If height is set, cellSize[1] will be forced to auto;
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Every rect style in calendar coordinates.
    *
    * @see https://echarts.apache.org/en/option.html#calendar.itemStyle
    */
  var itemStyle: js.UndefOr[BorderColor] = js.undefined
  /**
    * Distance between calendar component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default 80
    */
  var left: js.UndefOr[Double | String] = js.undefined
  /**
    * Month label in calendar coordinates.
    * @see https://echarts.apache.org/en/option.html#calendar.monthLabel
    */
  var monthLabel: js.UndefOr[MonthLabel] = js.undefined
  /**
    * The layout orientation of calendar.
    */
  var orient: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * Required, range of Calendar coordinates, support multiple formats.
    *
    * @see https://echarts.apache.org/en/option.html#calendar
    */
  var range: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  /**
    * Distance between calendar component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var right: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse events.
    *
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Calendar coordinates splitLine style.
    */
  var splitLine: js.UndefOr[typings.echarts.anon.LineStyle] = js.undefined
  /**
    * Distance between calendar component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    * If the left value is set to be 'top', 'middle', or 'bottom',
    * then the component will be aligned automatically based on position.
    *
    * @default 60
    */
  var top: js.UndefOr[Double | String] = js.undefined
  /**
    * The height of calendar coordinates.
    * Note: cellSize is 20 by default.
    * If width is set, cellSize[0] will be forced to auto;
    *
    * @default 'auto'
    */
  var width: js.UndefOr[Double | String] = js.undefined
  /**
    * Year label in calendar coordinates.
    * @see https://echarts.apache.org/en/option.html#calendar.yearLabel
    */
  var yearLabel: js.UndefOr[YearLabel] = js.undefined
  /**
    * z value of all graphical elements in, which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @default 2
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * zlevel value of all graphical elements in.
    * zlevel is used to make layers with Canvas.
    * Graphical elements with different zlevel values will be placed in different Canvases,
    * which is a common optimization technique.
    * We can put those frequently changed elements (like those with animations) to a seperate zlevel.
    * Notice that too many Canvases will increase memory cost, and should be used carefully on mobile phones to avoid crash.
    *
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object Calendar_ {
  @scala.inline
  def apply(
    bottom: Double | String = null,
    cellSize: Double | auto | (js.Array[auto | Double]) = null,
    dayLabel: DayLabel = null,
    height: Double | String = null,
    id: String = null,
    itemStyle: BorderColor = null,
    left: Double | String = null,
    monthLabel: MonthLabel = null,
    orient: horizontal | vertical = null,
    range: Double | String | (js.Array[Double | String]) = null,
    right: Double | String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    splitLine: typings.echarts.anon.LineStyle = null,
    top: Double | String = null,
    width: Double | String = null,
    yearLabel: YearLabel = null,
    z: js.UndefOr[Double] = js.undefined,
    zlevel: js.UndefOr[Double] = js.undefined
  ): Calendar_ = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (dayLabel != null) __obj.updateDynamic("dayLabel")(dayLabel.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (monthLabel != null) __obj.updateDynamic("monthLabel")(monthLabel.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (yearLabel != null) __obj.updateDynamic("yearLabel")(yearLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zlevel)) __obj.updateDynamic("zlevel")(zlevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar_]
  }
}

