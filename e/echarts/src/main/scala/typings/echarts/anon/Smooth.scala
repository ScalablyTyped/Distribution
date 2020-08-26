package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Smooth extends js.Object {
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.emphasis
    */
  var emphasis: js.UndefOr[Show] = js.native
  /**
    * The length of the first segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.length
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The length of the second segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.length2
    */
  var length2: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
  /**
    * Whether to show the visual guide ine.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * Whether to smooth the visual guide line.
    * It defaults to be `false` and can be set as `true` or
    * the values from 0 to 1 which indicating the smoothness.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.smooth
    */
  var smooth: js.UndefOr[Boolean | Double] = js.native
}

object Smooth {
  @scala.inline
  def apply(): Smooth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Smooth]
  }
  @scala.inline
  implicit class SmoothOps[Self <: Smooth] (val x: Self) extends AnyVal {
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
    def setEmphasis(value: Show): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLength2(value: Double): Self = this.set("length2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength2: Self = this.set("length2", js.undefined)
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSmooth(value: Boolean | Double): Self = this.set("smooth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
  }
  
}

