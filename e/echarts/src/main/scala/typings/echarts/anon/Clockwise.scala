package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clockwise extends js.Object {
  /**
    * Whether draw clockwise.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.clockwise
    */
  var clockwise: js.UndefOr[Boolean] = js.native
  /**
    * The x value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.cx
    */
  var cx: js.UndefOr[Double] = js.native
  /**
    * The y value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.cy
    */
  var cy: js.UndefOr[Double] = js.native
  /**
    * end anble, in radian.
    *
    *
    * @default
    * "Math.PI * 2"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.endAngle
    */
  var endAngle: js.UndefOr[Double] = js.native
  /**
    * Outside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.r
    */
  var r: js.UndefOr[Double] = js.native
  /**
    * Inside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.r0
    */
  var r0: js.UndefOr[Double] = js.native
  /**
    * start angle, in radian.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.startAngle
    */
  var startAngle: js.UndefOr[Double] = js.native
}

object Clockwise {
  @scala.inline
  def apply(): Clockwise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clockwise]
  }
  @scala.inline
  implicit class ClockwiseOps[Self <: Clockwise] (val x: Self) extends AnyVal {
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
    def setClockwise(value: Boolean): Self = this.set("clockwise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockwise: Self = this.set("clockwise", js.undefined)
    @scala.inline
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setR0(value: Double): Self = this.set("r0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR0: Self = this.set("r0", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
  
}

