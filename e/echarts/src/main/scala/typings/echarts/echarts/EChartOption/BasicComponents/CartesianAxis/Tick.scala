package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.echarts.EChartOption.LineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
@js.native
trait Tick extends js.Object {
  var alignWithLabel: js.UndefOr[Boolean] = js.native
  var inside: js.UndefOr[Boolean] = js.native
  var interval: js.UndefOr[Double | js.Function] = js.native
  var length: js.UndefOr[Double] = js.native
  var lineStyle: js.UndefOr[LineStyle] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object Tick {
  @scala.inline
  def apply(): Tick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tick]
  }
  @scala.inline
  implicit class TickOps[Self <: Tick] (val x: Self) extends AnyVal {
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
    def setAlignWithLabel(value: Boolean): Self = this.set("alignWithLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignWithLabel: Self = this.set("alignWithLabel", js.undefined)
    @scala.inline
    def setInside(value: Boolean): Self = this.set("inside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInside: Self = this.set("inside", js.undefined)
    @scala.inline
    def setInterval(value: Double | js.Function): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLineStyle(value: LineStyle): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

