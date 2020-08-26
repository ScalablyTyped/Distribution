package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStyleShow extends js.Object {
  /**
    * The style of the axis line of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle
    */
  var lineStyle: js.UndefOr[Width] = js.native
  /**
    * Whether to show the axis line of gauge chart.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.show
    */
  var show: js.UndefOr[Boolean] = js.native
}

object LineStyleShow {
  @scala.inline
  def apply(): LineStyleShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyleShow]
  }
  @scala.inline
  implicit class LineStyleShowOps[Self <: LineStyleShow] (val x: Self) extends AnyVal {
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
    def setLineStyle(value: Width): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

