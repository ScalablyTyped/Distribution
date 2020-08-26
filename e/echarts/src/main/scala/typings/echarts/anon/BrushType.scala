package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrushType extends js.Object {
  /**
    * The brush type for ripples.
    * options: `'stroke'` and `'fill'`.
    *
    *
    * @default
    * "fill"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.brushType
    */
  var brushType: js.UndefOr[String] = js.native
  /**
    * The period duration of animation, in seconds.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.period
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * The maximum zooming scale of ripples in animation.
    *
    *
    * @default
    * 2.5
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect.scale
    */
  var scale: js.UndefOr[Double] = js.native
}

object BrushType {
  @scala.inline
  def apply(): BrushType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrushType]
  }
  @scala.inline
  implicit class BrushTypeOps[Self <: BrushType] (val x: Self) extends AnyVal {
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
    def setBrushType(value: String): Self = this.set("brushType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrushType: Self = this.set("brushType", js.undefined)
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

