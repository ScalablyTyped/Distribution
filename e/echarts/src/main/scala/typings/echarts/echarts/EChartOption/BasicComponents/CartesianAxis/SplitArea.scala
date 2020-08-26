package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
@js.native
trait SplitArea extends js.Object {
  var areaStyle: js.UndefOr[Color] = js.native
  var interval: js.UndefOr[Double | js.Function] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object SplitArea {
  @scala.inline
  def apply(): SplitArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitArea]
  }
  @scala.inline
  implicit class SplitAreaOps[Self <: SplitArea] (val x: Self) extends AnyVal {
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
    def setAreaStyle(value: Color): Self = this.set("areaStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaStyle: Self = this.set("areaStyle", js.undefined)
    @scala.inline
    def setInterval(value: Double | js.Function): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

