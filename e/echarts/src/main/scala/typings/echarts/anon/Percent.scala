package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Percent extends js.Object {
  /**
    * Specify the percentage of drawing, useful in animation.
    *
    * Value range: \[0, 1\].
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.percent
    */
  var percent: js.UndefOr[Double] = js.native
  /**
    * x value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.x1
    */
  var x1: js.UndefOr[Double] = js.native
  /**
    * x value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.x2
    */
  var x2: js.UndefOr[Double] = js.native
  /**
    * y value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.y1
    */
  var y1: js.UndefOr[Double] = js.native
  /**
    * y value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.y2
    */
  var y2: js.UndefOr[Double] = js.native
}

object Percent {
  @scala.inline
  def apply(): Percent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percent]
  }
  @scala.inline
  implicit class PercentOps[Self <: Percent] (val x: Self) extends AnyVal {
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
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
  
}

