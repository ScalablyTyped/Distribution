package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Width extends js.Object {
  /**
    * The axis line of gauge chart can be divided to several
    * segments in different colors.
    * The end position and color of each segment can be expressed
    * by an array.
    *
    * Default value:
    *
    * ```
    * [[0.2, '#91c7ae'], [0.8, '#63869e'], [1, '#c23531']]
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle.color
    */
  var color: js.UndefOr[js.Array[_]] = js.native
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not
    * be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.gauge.axisLine.lineStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * The width of axis line.
    *
    *
    * @default
    * 30
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle.width
    */
  var width: js.UndefOr[Double] = js.native
}

object Width {
  @scala.inline
  def apply(): Width = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Width]
  }
  @scala.inline
  implicit class WidthOps[Self <: Width] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: js.Any*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: js.Array[_]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

