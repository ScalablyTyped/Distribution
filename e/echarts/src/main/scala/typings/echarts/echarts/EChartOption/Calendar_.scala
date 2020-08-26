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
@js.native
trait Calendar_ extends js.Object {
  /**
    * Distance between calendar component and the bottom side of the container.
    * bottom value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * The size of each rect of calendar coordinates,
    * can be set to a single value or array,
    * the first element is width and the second element is height.
    * Support setting self-adaptation: auto, the default width and height to be 20.
    *
    * @default 20
    */
  var cellSize: js.UndefOr[Double | auto | (js.Array[auto | Double])] = js.native
  /**
    * Day style in calendar coordinates.
    * @see https://echarts.apache.org/en/option.html#calendar.dayLabel
    */
  var dayLabel: js.UndefOr[DayLabel] = js.native
  /**
    * The height of calendar coordinates.
    * Note: cellSize is 20 by default.
    * If height is set, cellSize[1] will be forced to auto;
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Every rect style in calendar coordinates.
    *
    * @see https://echarts.apache.org/en/option.html#calendar.itemStyle
    */
  var itemStyle: js.UndefOr[BorderColor] = js.native
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
  var left: js.UndefOr[Double | String] = js.native
  /**
    * Month label in calendar coordinates.
    * @see https://echarts.apache.org/en/option.html#calendar.monthLabel
    */
  var monthLabel: js.UndefOr[MonthLabel] = js.native
  /**
    * The layout orientation of calendar.
    */
  var orient: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Required, range of Calendar coordinates, support multiple formats.
    *
    * @see https://echarts.apache.org/en/option.html#calendar
    */
  var range: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  /**
    * Distance between calendar component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    * Adaptive by default.
    *
    * @default 'auto'
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse events.
    *
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Calendar coordinates splitLine style.
    */
  var splitLine: js.UndefOr[typings.echarts.anon.LineStyle] = js.native
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
  var top: js.UndefOr[Double | String] = js.native
  /**
    * The height of calendar coordinates.
    * Note: cellSize is 20 by default.
    * If width is set, cellSize[0] will be forced to auto;
    *
    * @default 'auto'
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * Year label in calendar coordinates.
    * @see https://echarts.apache.org/en/option.html#calendar.yearLabel
    */
  var yearLabel: js.UndefOr[YearLabel] = js.native
  /**
    * z value of all graphical elements in, which controls order of drawing graphical components.
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
    *
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object Calendar_ {
  @scala.inline
  def apply(): Calendar_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendar_]
  }
  @scala.inline
  implicit class Calendar_Ops[Self <: Calendar_] (val x: Self) extends AnyVal {
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
    def setCellSizeVarargs(value: (auto | Double)*): Self = this.set("cellSize", js.Array(value :_*))
    @scala.inline
    def setCellSize(value: Double | auto | (js.Array[auto | Double])): Self = this.set("cellSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSize: Self = this.set("cellSize", js.undefined)
    @scala.inline
    def setDayLabel(value: DayLabel): Self = this.set("dayLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayLabel: Self = this.set("dayLabel", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemStyle(value: BorderColor): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMonthLabel(value: MonthLabel): Self = this.set("monthLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthLabel: Self = this.set("monthLabel", js.undefined)
    @scala.inline
    def setOrient(value: horizontal | vertical): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    @scala.inline
    def setRangeVarargs(value: (Double | String)*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: Double | String | (js.Array[Double | String])): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSplitLine(value: typings.echarts.anon.LineStyle): Self = this.set("splitLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitLine: Self = this.set("splitLine", js.undefined)
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setYearLabel(value: YearLabel): Self = this.set("yearLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearLabel: Self = this.set("yearLabel", js.undefined)
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

