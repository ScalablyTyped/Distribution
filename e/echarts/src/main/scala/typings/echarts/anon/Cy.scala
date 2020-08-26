package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cy extends js.Object {
  /**
    * The x value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring.shape.cx
    */
  var cx: js.UndefOr[Double] = js.native
  /**
    * The y value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring.shape.cy
    */
  var cy: js.UndefOr[Double] = js.native
  /**
    * Outside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring.shape.r
    */
  var r: js.UndefOr[Double] = js.native
  /**
    * Inside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring.shape.r0
    */
  var r0: js.UndefOr[Double] = js.native
}

object Cy {
  @scala.inline
  def apply(): Cy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cy]
  }
  @scala.inline
  implicit class CyOps[Self <: Cy] (val x: Self) extends AnyVal {
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
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setR0(value: Double): Self = this.set("r0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR0: Self = this.set("r0", js.undefined)
  }
  
}

