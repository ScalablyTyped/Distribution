package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Type
import typings.echarts.echartsStrings.horizontal
import typings.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An axis with a single dimension. It can be used to display data in one dimension
  *
  * @see https://echarts.apache.org/en/option.html#xAxis
  */
@js.native
trait SingleAxis extends CartesianAxis {
  /**
    * Distance between grid component and the bottom side of the container.
    * bottom value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    *
    * @default '5%'
    */
  var bottom: js.UndefOr[String | Double] = js.native
  /**
    * Height of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Distance between grid component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default '5%'
    */
  var left: js.UndefOr[String | Double] = js.native
  /**
    * Orientation of the axis. By default, it's 'horizontal'.
    * You can set it to be 'vertical' to make a vertical axis.
    *
    * @default 'horizontal'
    */
  var orient: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Distance between grid component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    *
    * @default '5%'
    */
  var right: js.UndefOr[String | Double] = js.native
  /**
    * Distance between grid component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    * If the left value is set to be 'top', 'middle', or 'bottom',
    * then the component will be aligned automatically based on position.
    *
    * @default '5%'
    */
  var top: js.UndefOr[String | Double] = js.native
  /**
    * Options:
    * + 'value' - Numerical axis, suitable for continuous data.
    * + 'category' Category axis, suitable for discrete category data.
    *   Data should only be set via data for this type.
    * + 'time' Time axis, suitable for continuous time series data.
    *   As compared to value axis, it has a better formatting for time
    *   and a different tick calculation method.
    *   For example, it decides to use month, week, day or hour for tick
    *   based on the range of span.
    * + 'log' Log axis, suitable for log data.
    *
    * @default 'value'
    * @see https://echarts.apache.org/en/option.html#singleAxis.type
    */
  var `type`: js.UndefOr[Type] = js.native
  /**
    * Width of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var width: js.UndefOr[String | Double] = js.native
}

object SingleAxis {
  @scala.inline
  def apply(): SingleAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleAxis]
  }
  @scala.inline
  implicit class SingleAxisOps[Self <: SingleAxis] (val x: Self) extends AnyVal {
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
    def setBottom(value: String | Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: String | Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setOrient(value: horizontal | vertical): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    @scala.inline
    def setRight(value: String | Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: String | Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

