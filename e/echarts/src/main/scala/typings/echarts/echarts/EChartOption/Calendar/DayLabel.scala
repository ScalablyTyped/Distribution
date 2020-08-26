package typings.echarts.echarts.EChartOption.Calendar

import typings.echarts.echartsStrings.end
import typings.echarts.echartsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayLabel extends Label {
  /**
    * A week from the beginning of the week, the default starting on Sunday.
    *
    * @default 0
    */
  var firstDay: js.UndefOr[Double] = js.native
  /**
    * Position of week, at the beginning or end of the range.
    *
    * @default 'start'
    */
  var position: js.UndefOr[start | end] = js.native
}

object DayLabel {
  @scala.inline
  def apply(): DayLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayLabel]
  }
  @scala.inline
  implicit class DayLabelOps[Self <: DayLabel] (val x: Self) extends AnyVal {
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
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    @scala.inline
    def setPosition(value: start | end): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

