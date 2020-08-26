package typings.echarts.echarts.EChartOption.Calendar

import typings.echarts.echartsStrings.bottom
import typings.echarts.echartsStrings.left
import typings.echarts.echartsStrings.right
import typings.echarts.echartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YearLabel extends Label {
  /**
    * Formatter of year text label, which supports string template and callback function.
    * By default, the current range of the year,
    * if the interval across the year, showing the first year and the last year
    */
  var formatter: js.UndefOr[String] = js.native
  /**
    * Position of year.
    * Default: when orient is set as horizontal,
    * position is left when orient is set as vertical, position is top
    */
  var position: js.UndefOr[top | bottom | left | right] = js.native
}

object YearLabel {
  @scala.inline
  def apply(): YearLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YearLabel]
  }
  @scala.inline
  implicit class YearLabelOps[Self <: YearLabel] (val x: Self) extends AnyVal {
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
    def setFormatter(value: String): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setPosition(value: top | bottom | left | right): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

